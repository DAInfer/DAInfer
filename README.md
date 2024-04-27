# DAInfer

This is the official GitHub repository for the following paper:

DAInfer: Inferring API Aliasing Specifications from Library Documentation via Neurosymbolic Optimization (FSE 2024)


## Quick Start

### Setup

Install the packages in the `requirements.txt` file.

```commandline
pip install -r requirements.txt
```

Add your openai key in `src/config.py`

```python
global_openai_key = "sk-xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
```

### Run

If you want to run the DAInfer with the default setting, you can simply execute the following command:

```commandline
cd src
python main.py 1 1 0.7 0.7 --lazy
```

If you want to apply the self-consistency to the two-staged prompting and adjust the temperatures, you can change the four arguments passed to `main.py`.
For example, if you want to set K = 5 for both the two stages and the temperatures are both set to 1.0, you can execute the following command:

```commandline
cd src
python main.py 5 5 1.0 1.0 --lazy
```

If you want to disable the lazy strategy in the neural-symbolic optimization, you can replace the `-lazy` flag with `-eager`.

```commandline
cd src
python main.py 1 1 0.7 0.7 --eager
```

ATTENTION: The eager mode would invoke OpenAI API for a large number of methods in the library documentation, which may cost a lot of money. We recommend you to use the lazy mode to avoid the high cost.

## Data

### Dataset
We parse the documentations of Java classes used for the evaluation and provide the documentation model in the directory `data/javadoc/benchmark`. All the analyzed Java classes are listed in the json file `data/javadoc/evalSubject.json`. All the methods and their semantic descriptions are summarized in the json file `benchmark_fullMethodDoc.json`.

We provide `docParser.py` in the directory `src`. You can utilize it to extract the documentation of the Java library you focus on and run DAInfer to infer the API aliasing specifications for the library.

### Oracle

The directory `oracle` contains the three sources of oracles, including the ones specified in FlowDroid and USpec and the manually specified ones. The generated models of atlas is stored in `baseline/atlas/models`. We referred to all the other oracles when we manually specified ours, which is stored in the directory `oracle/ManualOracle`.

### Output

The output of DAInfer is stored in the directory `data/output`. Specifically, the directory `autoPrompt_FourTypes_m_n_temp1_temp2` stores the detailed output of DAInfer under the following setting of the two-staged prompting.

- m and n: The numbers of sampling in self-consistency prompting for the typical verb retrieval and the memory operation abstraction, respectively.

- temp1 and temp2: The temperatures of the prompting for the typical verb retrieval and the memory operation abstraction, respectively.

In each directory `autoPrompt_FourTypes_m_n_temp1_temp2`, the three sub-directories contain the following (intermediate) results:

- The directory `methoInfo`: contains the json files that record the method type signatures and the results of memory operation abstraction.

- The directory `prompt` contains the prompting results of the first stage, i.e., the typical verbs indicating the four kinds of memory operations.

- The directory `inferResult`: The results of the API aliasing specification inference. Specifically, the json file `benchmark_inferredSpecs.json` contains all the inferred specifications. The json file `benchmark_CHADic.json` maintains the class hierachy relation. The json file `benchmark_NNSet.json` stores the identified semantic units, which are named entities in the method names. The json file `benchmark_retArgSpecCandidate.json` stores all the API aliasing specifications that satisfy the degree constraint and validity constraint but not necessarily statify the semantic unit constraint and memory operation constraint.

- The directory `compareResult`: The comparison results of the inferred specifications and the oracle in the directory `oracle`. Specifically, the json files `inferredCorrectSpecs.json` and `inferredWrongSpecs.json` list correct specifications, and wrong specifications related to the sampled 60 Java classes, respectively. The files `missedFlowDroidSpecs.json` and `missedUSpecArgSpec.json` store the specifications that are not inferred by DAInfer but are labeled by FlowDroid's developers or inferred by USpec, respectively.

## Baseline

Apart from atlas and USpec, we propose an LLM-based API aliasing specification inference approach as a baseline. To run the baseline, you also need to fill the openai key in the following statement:

```python
openai_key_baseline = "sk-xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
```
Then you can simply runn the baseline by executing the following command:

```commandline
cd baseline/LLM-Alias
python ChatGPTBaseline.py
```

The results of the baseline is dumped to `output.json` file in the directory `baseline/LLM-Alias`.

## Citation

If you use DAInfer in your research, please cite the following paper:

```
@inproceedings{DAInfer,
  author={Chengpeng Wang 
  and Jipeng Zhang 
  and Rongxin Wu 
  and Charles Zhang},
  title={DAInfer: Inferring API Aliasing Specifications from Library Documentation via Neurosymbolic Optimization},
  booktitle={The Proceedings of the ACM on Software Engineering},
  volume={1},
  number={FSE},
  year={2024},
  doi = {10.1145/3660816},
```
