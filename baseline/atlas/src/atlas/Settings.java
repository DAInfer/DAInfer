// Copyright 2016-2018 Stanford University
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package atlas;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import atlas.Utils.Maybe;

public class Settings {
	public static final Maybe<Long> DEFAULT_TIMEOUT = new Maybe<Long>(100L);
	public static final String SOURCE_DIRNAME = "../models";
	public static final String EMPTY_SOURCE_DIRNAME = "../empty";
	
	public static final String MODEL_FILENAME = "models.txt";
	public static final String PROXY_FILENAME = "proxy.txt";
	public static final String[] CLASS_LIST_FILES = new String[]{"data/classes_1.7.txt"};
	
	public static final boolean IS_CONSTRUCTOR_STATIC = true;
	public static final boolean CONSTRUCTOR_HAS_OBJECT_RETURN = true;
	public static final boolean IS_ARRAY_STATIC = false;
	public static final String ARRAY_STORE_NAME = "ARRAY_STORE";
	public static final String ARRAY_LOAD_NAME = "ARRAY_LOAD";
	
	public static final int MAX_MERGE_CHECK_LENGTH = 10;
	
	public static final int SOURCE_ARRAY_LENGTH = 1;
	public static final int DEFAULT_ARRAY_LENGTH = 1;
	
	public static final String[] ATLAS_ROOTS = {"java."};
	public static final String[] ATLAS_TARGETS = {
			"java.util.AbstractCollection",
			"java.util.AbstractList",
			"java.util.AbstractQueue",
			"java.util.AbstractSequentialList",
			"java.util.AbstractSet",
			"java.util.AbstractMap",
			"java.util.Dictionary",
			"java.util.concurrent.ArrayBlockingQueue",
			"java.util.ArrayDeque",
			"java.util.ArrayList",
			"java.util.concurrent.ConcurrentLinkedDeque",
			"java.util.concurrent.ConcurrentLinkedQueue",
			"java.util.concurrent.ConcurrentSkipListSet",
			"java.util.concurrent.CopyOnWriteArrayList",
			"java.util.concurrent.CopyOnWriteArraySet",
			"java.util.concurrent.DelayQueue",
			"java.util.HashSet",
			"java.util.concurrent.LinkedBlockingDeque",
			"java.util.concurrent.LinkedBlockingQueue",
			"java.util.LinkedHashSet",
			"java.util.LinkedList",
			"java.util.concurrent.LinkedTransferQueue",
			"java.util.concurrent.PriorityBlockingQueue",
			"java.util.PriorityQueue",
			"java.util.Stack",
			"java.util.concurrent.SynchronousQueue",
			"java.util.TreeSet",
			"java.util.Vector",
			"java.util.concurrent.ConcurrentHashMap",
			"java.util.concurrent.ConcurrentSkipListMap",
			"java.util.HashMap",
			"java.util.Hashtable",
			"java.util.IdentityHashMap",
			"java.util.LinkedHashMap",
			"java.util.TreeMap",
			"java.util.WeakHashMap",
			"java.util.Collections",
			"java.util.Arrays",
			"org.mvel2.templates.TemplateRegistry",
            "org.apache.hadoop.conf.Configured",
            "java.util.List",
            "javax.servlet.ServletContext",
            "android.location.Address",
            "javax.cache.CacheManager",
            "gnu.trove.map.hash.TIntObjectHashMap",
            "okhttp3.ResponseBody",
            "com.baidu.location.BDLocation",
            "org.codehaus.jackson.node.ContainerNode",
            "com.badlogic.gdx.scenes.scene2d.ui.Skin",
            "org.apache.http.client.methods.HttpHead",
            "java.lang.Throwable",
            "javafx.collections.ObservableMap",
            "android.content.IntentFilter",
            "com.fasterxml.jackson.databind.JsonNode",
            "android.content.pm.PackageManager",
            "org.apache.hadoop.fs.FileSystem",
            "java.util.Map",
            "java.util.NavigableMap",
            "java.sql.CallableStatement",
            "android.os.Bundle",
            "com.google.common.collect.Multimap",
            "org.w3c.dom.Node",
            "java.util.Queue",
            "org.eclipse.swt.widgets.Widget",
            "com.squareup.okhttp.ResponseBody",
            "javax.swing.JEditorPane",
            "android.os.BaseBundle",
            "android.content.Intent",
            "javax.swing.text.JTextComponent",
            "android.util.SparseBooleanArray",
            "android.widget.Toast",
            "Jama.Matrix",
            "java.util.IdentityHashMap",
            "org.apache.http.client.methods.HttpGet",
            "javolution.util.FastMap",
            "org.apache.http.client.methods.HttpTrace",
            "org.apache.uima.internal.util.CommandLineParser",
            "android.util.SparseArray",
            "com.fasterxml.jackson.databind.JsonSerializable.Base",
            "org.apache.http.client.methods.HttpOptions",
            "com.alibaba.rocketmq.remoting.common.RemotingUtil",
            "java.awt.image.BufferedImage",
            "org.bukkit.configuration.MemorySection",
            "org.eclipse.swt.widgets.TableItem",
            "java.lang.reflect.Field",
            "org.ejml.data.D1Matrix64F",
            "org.bukkit.configuration.MemoryConfiguration",
            "org.apache.http.client.methods.AbstractExecutionAwareRequest",
            "java.util.LinkedList",
            "java.io.Closeable",
            "org.JSONArray",
            "org.apache.mahout.math.DenseVector",
            "java.lang.Thread",
            "java.nio.IntBuffer",
            "java.lang.ProcessBuilder",
            "com.fasterxml.jackson.databind.node.ContainerNode",
            "android.content.ComponentName",
            "org.apache.ofbiz.entity.GenericEntity",
            "org.eclipse.jface.text.Document",
            "org.apache.http.client.methods.HttpRequestBase",
            "java.util.AbstractSequentialList",
            "javax.swing.JComponent",
            "org.apache.http.message.AbstractHttpMessage",
            "java.util.AbstractList",
            "gnu.trove.TIntObjectHashMap",
            "java.awt.Component",
            "org.JSONObject",
            "java.util.Collection",
            "com.google.gson.JsonObject",
            "java.util.AbstractCollection",
            "gnu.trove.THash",
            "java.sql.Statement",
            "java.sql.PreparedStatement",
            "java.util.concurrent.ConcurrentMap",
            "java.lang.Iterable",
            "com.google.common.collect.BiMap",
            "org.ofbiz.base.util.UtilMisc",
            "org.ejml.data.ReshapeMatrix64F",
            "java.awt.Container",
            "java.lang.ThreadLocal",
            "org.antlr.runtime.tree.TreeAdaptor",
            "org.sax.InputSource",
            "com.eclipsesource.JsonValue",
            "net.minecraft.nbt.NBTTagCompound",
            "java.util.ArrayList",
            "org.bukkit.configuration.file.YamlConfiguration",
            "org.sax.XMLReader",
            "org.apache.http.client.methods.HttpEntityEnclosingRequestBase",
            "net.minecraft.inventory.InventoryBasic",
            "android.content.res.TypedArray",
            "javax.swing.JTextPane",
            "java.util.TreeMap",
            "org.bson.BSONObject",
            "org.codehaus.jackson.node.BaseJsonNode",
            "com.github.javaparser.ast.Node",
            "java.util.EnumMap",
            "com.google.common.collect.Maps",
            "java.nio.ByteBuffer",
            "com.fasterxml.jackson.databind.node.BaseJsonNode",
            "org.eclipse.jface.resource.ImageRegistry",
            "java.util.concurrent.atomic.AtomicReference",
            "java.lang.StringBuffer",
            "org.codehaus.jackson.node.ObjectNode",
            "org.bukkit.configuration.file.FileConfiguration",
            "gnu.trove.TIntHash",
            "java.security.KeyStore",
            "org.simple.JSONObject",
            "com.eclipsesource.JsonObject",
            "java.util.HashMap",
            "com.github.javaparser.ast.expr.ArrayAccessExpr",
            "org.apache.mahout.math.AbstractVector",
            "java.util.Stack",
            "net.minecraft.inventory.AnimalChest",
            "com.mongodb.BSONObject",
            "java.util.concurrent.atomic.AtomicLongArray",
            "org.apache.http.client.methods.HttpDelete",
            "com.mongodb.DBObject",
            "org.ofbiz.entity.GenericValue",
            "javax.servlet.http.HttpSession",
            "android.os.Message",
            "java.lang.AutoCloseable",
            "java.nio.Buffer",
            "java.net.URLConnection",
            "com.fasterxml.jackson.databind.node.ObjectNode",
            "org.ejml.data.RowD1Matrix64F",
            "org.eclipse.swt.widgets.Item",
            "java.util.BitSet",
            "java.lang.StringBuilder",
            "java.util.Hashtable",
            "com.github.javaparser.ast.expr.Expression",
            "org.eclipse.jface.text.AbstractDocument",
            "android.graphics.Bitmap",
            "java.util.Properties",
            "android.location.Location",
            "java.util.concurrent.atomic.AtomicReferenceArray",
            "android.util.SparseIntArray",
            "java.sql.Wrapper",
            "java.net.HttpURLConnection",
            "java.awt.Image",
            "java.util.LinkedHashMap",
            "net.sf.JSONObject",
            "java.util.Vector",
            "net.minecraft.nbt.NBTBase",
            "gnu.trove.TPrimitiveHash",
            "java.util.SortedMap",
            "org.vertx.java.core.JsonObject",
            "com.jgoodies.forms.layout.CellConstraints",
            "org.w3c.dom.Element",
            "java.util.concurrent.ConcurrentHashMap",
            "java.util.AbstractMap",
            "com.alibaba.fastjson.JSONObject",
            "java.util.Iterator",
            "gnu.trove.map.TIntObjectMap",
            "java.util.Deque",
            "java.util.ListIterator",
            "java.net.HttpCookie",
            "org.codehaus.jackson.JsonNode",
            "org.apache.hadoop.conf.Configuration",
            "android.os.Handler",
            "org.apache.shiro.session.Session",
            "org.ofbiz.service.ServiceUtil",
            "org.ejml.data.DenseMatrix64F",
            "com.google.gson.JsonElement",
            "javafx.collections.Observable",
            "java.util.Dictionary"
	};
	public static Set<String> ATLAS_TARGET_SET = new HashSet<String>(Arrays.asList(ATLAS_TARGETS));
	
	public static final boolean USE_EMPTY_ATLAS = false;

	public static final String PROXY_SEPARATOR = "##";
	public static final String ANONYMOUS_PREFIX = "ANON";
	public static final String ATLAS_PREFIX = "atlas";
	public static final String EMPTY_PREFIX = "empty";
	public static final String NAME_PREFIX = USE_EMPTY_ATLAS ? EMPTY_PREFIX : ATLAS_PREFIX;
	
	public static final String AUTOMATON_FILE = "models.aut";
	
	public static final boolean PROXY_IS_NON_NULL = false;
	
	public static final Class<?>[] IGNORED_EXCEPTIONS = new Class<?>[]{UnsupportedOperationException.class};
}
