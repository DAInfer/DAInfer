prompt_modes = ["manualPrompt", "autoPrompt_FourTypes"]

gpt_modes = ["eager", "lazy"]

# For safety, we hide the OpenAI keys
# If you want to run DAInfer, please specify the keys
global_openai_key = "sk-xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"


# The parameters for self-consistency
global_n = 1  # Default value
global_m = 1  # Default value

# The temperature settings of the two-staged prompting
global_t1 = 0.7  # Default value
global_t2 = 0.7  # Default value

tagTokenCnt = 0
LLMTokenCnt = 0

OMTCnt = 0
SMTCnt = 0
