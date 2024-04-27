package atlas.java.util.concurrent;
public class ConcurrentHashMap<K,V> extends atlas.atlas.java.util.AbstractMap<K, V> implements atlas.java.util.concurrent.ConcurrentMap<K, V>, java.io.Serializable {
	public java.lang.Object f3;
	public java.lang.Object f23;
	public ConcurrentHashMap(atlas.java.util.Map<? extends K, ? extends V> p0) {
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f3 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f45;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f3 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)p0).f3;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f3 = (java.lang.Object)((atlas.java.util.LinkedHashMap)p0).f46;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f3 = (java.lang.Object)((atlas.java.util.IdentityHashMap)p0).f50;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f23 = (java.lang.Object)((atlas.java.util.WeakHashMap)p0).f25;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f3 = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)p0).f60;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f3 = (java.lang.Object)((atlas.java.util.HashMap)p0).f0;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f3 = (java.lang.Object)((atlas.java.util.Properties)p0).f59;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f3 = (java.lang.Object)((atlas.java.util.WeakHashMap)p0).f41;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f3 = (java.lang.Object)((atlas.java.util.Hashtable)p0).f40;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f3 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedMap)p0).f48;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f23 = (java.lang.Object)((atlas.java.util.LinkedHashMap)p0).f58;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f23 = (java.lang.Object)((atlas.java.util.Properties)p0).f54;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f23 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f86;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f3 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)p0).f29;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f3 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableMap)p0).f55;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f3 = (java.lang.Object)((atlas.java.util.TreeMap)p0).f61;
	}
	public ConcurrentHashMap() {
	}
	public long mappingCount() {
		long r = 0;
		return (long)r;
	}
	public static <K> atlas.atlas.java.util.concurrent.ConcurrentHashMap.KeySetView<K, java.lang.Boolean> newKeySet(int p0) {
		atlas.java.util.concurrent.ConcurrentHashMap.KeySetView r = null;
		return (atlas.atlas.java.util.concurrent.ConcurrentHashMap.KeySetView<K, java.lang.Boolean>)r;
	}
	public static <K> atlas.atlas.java.util.concurrent.ConcurrentHashMap.KeySetView<K, java.lang.Boolean> newKeySet() {
		atlas.java.util.concurrent.ConcurrentHashMap.KeySetView r = null;
		return (atlas.atlas.java.util.concurrent.ConcurrentHashMap.KeySetView<K, java.lang.Boolean>)r;
	}
	public V remove(java.lang.Object p0) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)this).f3;
		return (V)r;
	}
	public boolean remove(java.lang.Object p0, java.lang.Object p1) {
		boolean r = false;
		return (boolean)r;
	}
	public V get(java.lang.Object p0) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)this).f3;
		return (V)r;
	}
	public V put(K p0, V p1) {
		java.lang.Object r = null;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f3 = (java.lang.Object)p1;
		r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)this).f3;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f23 = (java.lang.Object)p0;
		return (V)r;
	}
	public boolean equals(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public java.lang.String toString() {
		java.lang.String r = null;
		r = new java.lang.String();
		return (java.lang.String)r;
	}
	public atlas.java.util.Collection<V> values() {
		atlas.java.util.Collection r = null;
		r = new atlas.java.util.concurrent.ConcurrentHashMap.ValuesView();
		((atlas.java.util.concurrent.ConcurrentHashMap.ValuesView)r).f164 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)this).f3;
		return (atlas.java.util.Collection<V>)r;
	}
	public int hashCode() {
		int r = 0;
		return (int)r;
	}
	public void clear() {
	}
	public boolean isEmpty() {
		boolean r = false;
		return (boolean)r;
	}
	public V replace(K p0, V p1) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)this).f3;
		return (V)r;
	}
	public boolean replace(K p0, V p1, V p2) {
		boolean r = false;
		return (boolean)r;
	}
	public boolean contains(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public java.util.Enumeration<V> elements() {
		java.util.Enumeration r = null;
		r = new atlas.java.util.concurrent.ConcurrentHashMap.ValueIterator();
		((atlas.java.util.concurrent.ConcurrentHashMap.ValueIterator)r).f21 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)this).f3;
		return (java.util.Enumeration<V>)r;
	}
	public int size() {
		int r = 0;
		return (int)r;
	}
	public java.util.Set<atlas.java.util.Map.Entry<K, V>> entrySet() {
		java.util.Set r = null;
		r = new atlas.java.util.concurrent.ConcurrentHashMap.EntrySetView();
		((atlas.java.util.concurrent.ConcurrentHashMap.EntrySetView)r).f155 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)this).f3;
		return (java.util.Set<atlas.java.util.Map.Entry<K, V>>)r;
	}
	public void putAll(atlas.java.util.Map<? extends K, ? extends V> p0) {
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f3 = (java.lang.Object)((atlas.java.util.TreeMap)p0).f61;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f23 = (java.lang.Object)((atlas.java.util.WeakHashMap)p0).f25;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f3 = (java.lang.Object)((atlas.java.util.Properties)p0).f59;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f23 = (java.lang.Object)((atlas.java.util.HashMap)p0).f37;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f3 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedMap)p0).f48;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f3 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f45;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f23 = (java.lang.Object)((atlas.java.util.LinkedHashMap)p0).f58;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f3 = (java.lang.Object)((atlas.java.util.IdentityHashMap)p0).f50;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f3 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableMap)p0).f55;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f3 = (java.lang.Object)((atlas.java.util.HashMap)p0).f0;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f3 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)p0).f29;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f23 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)p0).f81;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f3 = (java.lang.Object)((atlas.java.util.LinkedHashMap)p0).f46;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f3 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)p0).f3;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f23 = (java.lang.Object)((atlas.java.util.Properties)p0).f54;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f23 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f86;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f3 = (java.lang.Object)((atlas.java.util.WeakHashMap)p0).f41;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f3 = (java.lang.Object)((atlas.java.util.Hashtable)p0).f40;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f3 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)p0).f51;
	}
	public V putIfAbsent(K p0, V p1) {
		java.lang.Object r = null;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f3 = (java.lang.Object)p1;
		r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)this).f3;
		((atlas.java.util.concurrent.ConcurrentHashMap)this).f23 = (java.lang.Object)p0;
		return (V)r;
	}
	public java.util.Enumeration<K> keys() {
		java.util.Enumeration r = null;
		r = new atlas.java.util.concurrent.ConcurrentHashMap.KeyIterator();
		((atlas.java.util.concurrent.ConcurrentHashMap.KeyIterator)r).f145 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)this).f23;
		return (java.util.Enumeration<K>)r;
	}
	public atlas.atlas.java.util.concurrent.ConcurrentHashMap.KeySetView<K, V> keySet() {
		atlas.java.util.concurrent.ConcurrentHashMap.KeySetView r = null;
		r = new atlas.java.util.concurrent.ConcurrentHashMap.KeySetView();
		((atlas.java.util.concurrent.ConcurrentHashMap.KeySetView)r).f134 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)this).f23;
		return (atlas.atlas.java.util.concurrent.ConcurrentHashMap.KeySetView<K, V>)r;
	}
	public atlas.atlas.java.util.concurrent.ConcurrentHashMap.KeySetView<K, V> keySet(V p0) {
		atlas.java.util.concurrent.ConcurrentHashMap.KeySetView r = null;
		r = new atlas.java.util.concurrent.ConcurrentHashMap.KeySetView();
		((atlas.java.util.concurrent.ConcurrentHashMap.KeySetView)r).f134 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)this).f23;
		return (atlas.atlas.java.util.concurrent.ConcurrentHashMap.KeySetView<K, V>)r;
	}
	public boolean containsValue(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public boolean containsKey(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public V getOrDefault(java.lang.Object p0, V p1) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)this).f3;
		r = (java.lang.Object)p1;
		return (V)r;
	}
	public static final class MapReduceMappingsToIntTask<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BulkTask<K, V, java.lang.Integer> {
		public MapReduceMappingsToIntTask() {
		}
		public final java.lang.Integer getRawResult() {
			java.lang.Integer r = null;
			return (java.lang.Integer)r;
		}
		public final void compute() {
		}
	}
	public static final class MapReduceEntriesToIntTask<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BulkTask<K, V, java.lang.Integer> {
		public MapReduceEntriesToIntTask() {
		}
		public final java.lang.Integer getRawResult() {
			java.lang.Integer r = null;
			return (java.lang.Integer)r;
		}
		public final void compute() {
		}
	}
	public static final class MapReduceValuesToIntTask<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BulkTask<K, V, java.lang.Integer> {
		public MapReduceValuesToIntTask() {
		}
		public final java.lang.Integer getRawResult() {
			java.lang.Integer r = null;
			return (java.lang.Integer)r;
		}
		public final void compute() {
		}
	}
	public static final class MapReduceKeysToIntTask<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BulkTask<K, V, java.lang.Integer> {
		public MapReduceKeysToIntTask() {
		}
		public final java.lang.Integer getRawResult() {
			java.lang.Integer r = null;
			return (java.lang.Integer)r;
		}
		public final void compute() {
		}
	}
	public static final class MapReduceMappingsToLongTask<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BulkTask<K, V, java.lang.Long> {
		public MapReduceMappingsToLongTask() {
		}
		public final java.lang.Long getRawResult() {
			java.lang.Long r = null;
			return (java.lang.Long)r;
		}
		public final void compute() {
		}
	}
	public static final class MapReduceEntriesToLongTask<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BulkTask<K, V, java.lang.Long> {
		public MapReduceEntriesToLongTask() {
		}
		public final java.lang.Long getRawResult() {
			java.lang.Long r = null;
			return (java.lang.Long)r;
		}
		public final void compute() {
		}
	}
	public static final class MapReduceValuesToLongTask<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BulkTask<K, V, java.lang.Long> {
		public MapReduceValuesToLongTask() {
		}
		public final java.lang.Long getRawResult() {
			java.lang.Long r = null;
			return (java.lang.Long)r;
		}
		public final void compute() {
		}
	}
	public static final class MapReduceKeysToLongTask<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BulkTask<K, V, java.lang.Long> {
		public MapReduceKeysToLongTask() {
		}
		public final java.lang.Long getRawResult() {
			java.lang.Long r = null;
			return (java.lang.Long)r;
		}
		public final void compute() {
		}
	}
	public static final class MapReduceMappingsToDoubleTask<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BulkTask<K, V, java.lang.Double> {
		public MapReduceMappingsToDoubleTask() {
		}
		public final java.lang.Double getRawResult() {
			java.lang.Double r = null;
			return (java.lang.Double)r;
		}
		public final void compute() {
		}
	}
	public static final class MapReduceEntriesToDoubleTask<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BulkTask<K, V, java.lang.Double> {
		public MapReduceEntriesToDoubleTask() {
		}
		public final java.lang.Double getRawResult() {
			java.lang.Double r = null;
			return (java.lang.Double)r;
		}
		public final void compute() {
		}
	}
	public static final class MapReduceValuesToDoubleTask<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BulkTask<K, V, java.lang.Double> {
		public MapReduceValuesToDoubleTask() {
		}
		public final java.lang.Double getRawResult() {
			java.lang.Double r = null;
			return (java.lang.Double)r;
		}
		public final void compute() {
		}
	}
	public static final class MapReduceKeysToDoubleTask<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BulkTask<K, V, java.lang.Double> {
		public MapReduceKeysToDoubleTask() {
		}
		public final java.lang.Double getRawResult() {
			java.lang.Double r = null;
			return (java.lang.Double)r;
		}
		public final void compute() {
		}
	}
	public static final class MapReduceMappingsTask<K,V,U> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BulkTask<K, V, U> {
		public MapReduceMappingsTask() {
		}
		public final U getRawResult() {
			java.lang.Object r = null;
			return (U)r;
		}
		public final void compute() {
		}
	}
	public static final class MapReduceEntriesTask<K,V,U> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BulkTask<K, V, U> {
		public MapReduceEntriesTask() {
		}
		public final U getRawResult() {
			java.lang.Object r = null;
			return (U)r;
		}
		public final void compute() {
		}
	}
	public static final class MapReduceValuesTask<K,V,U> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BulkTask<K, V, U> {
		public MapReduceValuesTask() {
		}
		public final U getRawResult() {
			java.lang.Object r = null;
			return (U)r;
		}
		public final void compute() {
		}
	}
	public static final class MapReduceKeysTask<K,V,U> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BulkTask<K, V, U> {
		public MapReduceKeysTask() {
		}
		public final U getRawResult() {
			java.lang.Object r = null;
			return (U)r;
		}
		public final void compute() {
		}
	}
	public static final class ReduceEntriesTask<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BulkTask<K, V, atlas.java.util.Map.Entry<K, V>> {
		public ReduceEntriesTask() {
		}
		public final atlas.java.util.Map.Entry<K, V> getRawResult() {
			atlas.java.util.Map.Entry r = null;
			return (atlas.java.util.Map.Entry<K, V>)r;
		}
		public final void compute() {
		}
	}
	public static final class ReduceValuesTask<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BulkTask<K, V, V> {
		public ReduceValuesTask() {
		}
		public final V getRawResult() {
			java.lang.Object r = null;
			return (V)r;
		}
		public final void compute() {
		}
	}
	public static final class ReduceKeysTask<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BulkTask<K, V, K> {
		public ReduceKeysTask() {
		}
		public final K getRawResult() {
			java.lang.Object r = null;
			return (K)r;
		}
		public final void compute() {
		}
	}
	public static final class SearchMappingsTask<K,V,U> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BulkTask<K, V, U> {
		public SearchMappingsTask() {
		}
		public final U getRawResult() {
			java.lang.Object r = null;
			return (U)r;
		}
		public final void compute() {
		}
	}
	public static final class SearchEntriesTask<K,V,U> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BulkTask<K, V, U> {
		public SearchEntriesTask() {
		}
		public final U getRawResult() {
			java.lang.Object r = null;
			return (U)r;
		}
		public final void compute() {
		}
	}
	public static final class SearchValuesTask<K,V,U> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BulkTask<K, V, U> {
		public SearchValuesTask() {
		}
		public final U getRawResult() {
			java.lang.Object r = null;
			return (U)r;
		}
		public final void compute() {
		}
	}
	public static final class SearchKeysTask<K,V,U> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BulkTask<K, V, U> {
		public SearchKeysTask() {
		}
		public final U getRawResult() {
			java.lang.Object r = null;
			return (U)r;
		}
		public final void compute() {
		}
	}
	public static final class ForEachTransformedMappingTask<K,V,U> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BulkTask<K, V, java.lang.Void> {
		public ForEachTransformedMappingTask() {
		}
		public final void compute() {
		}
	}
	public static final class ForEachTransformedEntryTask<K,V,U> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BulkTask<K, V, java.lang.Void> {
		public ForEachTransformedEntryTask() {
		}
		public final void compute() {
		}
	}
	public static final class ForEachTransformedValueTask<K,V,U> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BulkTask<K, V, java.lang.Void> {
		public ForEachTransformedValueTask() {
		}
		public final void compute() {
		}
	}
	public static final class ForEachTransformedKeyTask<K,V,U> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BulkTask<K, V, java.lang.Void> {
		public ForEachTransformedKeyTask() {
		}
		public final void compute() {
		}
	}
	public static final class ForEachMappingTask<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BulkTask<K, V, java.lang.Void> {
		public ForEachMappingTask() {
		}
		public final void compute() {
		}
	}
	public static final class ForEachEntryTask<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BulkTask<K, V, java.lang.Void> {
		public ForEachEntryTask() {
		}
		public final void compute() {
		}
	}
	public static final class ForEachValueTask<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BulkTask<K, V, java.lang.Void> {
		public ForEachValueTask() {
		}
		public final void compute() {
		}
	}
	public static final class ForEachKeyTask<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BulkTask<K, V, java.lang.Void> {
		public ForEachKeyTask() {
		}
		public final void compute() {
		}
	}
	public abstract static class BulkTask<K,V,R> {
		public BulkTask() {
		}
	}
	public static final class EntrySetView<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.CollectionView<K, V, atlas.java.util.Map.Entry<K, V>> implements java.util.Set<atlas.java.util.Map.Entry<K, V>>, java.io.Serializable {
		public java.lang.Object f155;
		EntrySetView(atlas.atlas.java.util.concurrent.ConcurrentHashMap<K, V> p0) {
		}
		public EntrySetView() {
		}
		public boolean add(atlas.java.util.Map.Entry<K, V> p0) {
			boolean r = false;
			return (boolean)r;
		}
		public boolean remove(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public final boolean equals(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public final int hashCode() {
			int r = 0;
			return (int)r;
		}
		public boolean contains(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public atlas.java.util.Iterator<atlas.java.util.Map.Entry<K, V>> iterator() {
			atlas.java.util.Iterator r = null;
			r = new atlas.java.util.concurrent.ConcurrentHashMap.EntryIterator();
			((atlas.java.util.concurrent.ConcurrentHashMap.EntryIterator)r).f151 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap.EntrySetView)this).f155;
			return (atlas.java.util.Iterator<atlas.java.util.Map.Entry<K, V>>)r;
		}
		public boolean addAll(atlas.java.util.Collection<? extends atlas.java.util.Map.Entry<K, V>> p0) {
			boolean r = false;
			return (boolean)r;
		}
	}
	public static final class ValuesView<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.CollectionView<K, V, V> implements atlas.java.util.Collection<V>, java.io.Serializable {
		public java.lang.Object f164;
		ValuesView(atlas.atlas.java.util.concurrent.ConcurrentHashMap<K, V> p0) {
		}
		public ValuesView() {
		}
		public final boolean add(V p0) {
			boolean r = false;
			return (boolean)r;
		}
		public final boolean remove(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public final boolean contains(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public final atlas.java.util.Iterator<V> iterator() {
			atlas.java.util.Iterator r = null;
			r = new atlas.java.util.concurrent.ConcurrentHashMap.ValueIterator();
			((atlas.java.util.concurrent.ConcurrentHashMap.ValueIterator)r).f21 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap.ValuesView)this).f164;
			return (atlas.java.util.Iterator<V>)r;
		}
		public final boolean addAll(atlas.java.util.Collection<? extends V> p0) {
			boolean r = false;
			return (boolean)r;
		}
	}
	public static class KeySetView<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.CollectionView<K, V, K> implements java.util.Set<K>, java.io.Serializable {
		public java.lang.Object f134;
		KeySetView(atlas.atlas.java.util.concurrent.ConcurrentHashMap<K, V> p0, V p1) {
		}
		public KeySetView() {
		}
		public V getMappedValue() {
			java.lang.Object r = null;
			return (V)r;
		}
		public boolean add(K p0) {
			boolean r = false;
			return (boolean)r;
		}
		public boolean remove(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public boolean equals(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public int hashCode() {
			int r = 0;
			return (int)r;
		}
		public boolean contains(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public atlas.java.util.Iterator<K> iterator() {
			atlas.java.util.Iterator r = null;
			r = new atlas.java.util.concurrent.ConcurrentHashMap.KeyIterator();
			((atlas.java.util.concurrent.ConcurrentHashMap.KeyIterator)r).f145 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap.KeySetView)this).f134;
			return (atlas.java.util.Iterator<K>)r;
		}
		public boolean addAll(atlas.java.util.Collection<? extends K> p0) {
			boolean r = false;
			return (boolean)r;
		}
	}
	public abstract static class CollectionView<K,V,E> implements atlas.java.util.Collection<E>, java.io.Serializable {
		CollectionView(atlas.atlas.java.util.concurrent.ConcurrentHashMap<K, V> p0) {
		}
		public CollectionView() {
		}
		public abstract boolean remove(java.lang.Object p0);
		public final java.lang.String toString() {
			java.lang.String r = null;
			return (java.lang.String)r;
		}
		public final void clear() {
		}
		public final boolean isEmpty() {
			boolean r = false;
			return (boolean)r;
		}
		public abstract boolean contains(java.lang.Object p0);
		public final int size() {
			int r = 0;
			return (int)r;
		}
		public final <T> T[] toArray(T[] p0) {
			java.lang.Object[] r = null;
			return (T[])r;
		}
		public final java.lang.Object[] toArray() {
			java.lang.Object[] r = null;
			return (java.lang.Object[])r;
		}
		public abstract atlas.java.util.Iterator<E> iterator();
		public final boolean containsAll(atlas.java.util.Collection<?> p0) {
			boolean r = false;
			return (boolean)r;
		}
		public final boolean removeAll(atlas.java.util.Collection<?> p0) {
			boolean r = false;
			return (boolean)r;
		}
		public final boolean retainAll(atlas.java.util.Collection<?> p0) {
			boolean r = false;
			return (boolean)r;
		}
		public atlas.atlas.java.util.concurrent.ConcurrentHashMap<K, V> getMap() {
			atlas.java.util.concurrent.ConcurrentHashMap r = null;
			return (atlas.atlas.java.util.concurrent.ConcurrentHashMap<K, V>)r;
		}
	}
	public static final class EntrySpliterator<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.Traverser<K, V> {
		public EntrySpliterator() {
		}
		public long estimateSize() {
			long r = 0;
			return (long)r;
		}
		public int characteristics() {
			int r = 0;
			return (int)r;
		}
	}
	public static final class ValueSpliterator<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.Traverser<K, V> {
		public ValueSpliterator() {
		}
		public long estimateSize() {
			long r = 0;
			return (long)r;
		}
		public int characteristics() {
			int r = 0;
			return (int)r;
		}
	}
	public static final class KeySpliterator<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.Traverser<K, V> {
		public KeySpliterator() {
		}
		public long estimateSize() {
			long r = 0;
			return (long)r;
		}
		public int characteristics() {
			int r = 0;
			return (int)r;
		}
	}
	public static final class MapEntry<K,V> implements atlas.java.util.Map.Entry<K, V> {
		public java.lang.Object f92;
		MapEntry(K p0, V p1, atlas.atlas.java.util.concurrent.ConcurrentHashMap<K, V> p2) {
		}
		public MapEntry() {
		}
		public boolean equals(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public java.lang.String toString() {
			java.lang.String r = null;
			return (java.lang.String)r;
		}
		public int hashCode() {
			int r = 0;
			return (int)r;
		}
		public V getValue() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap.MapEntry)this).f92;
			return (V)r;
		}
		public K getKey() {
			java.lang.Object r = null;
			return (K)r;
		}
		public V setValue(V p0) {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap.MapEntry)this).f92;
			return (V)r;
		}
	}
	public static final class EntryIterator<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BaseIterator<K, V> implements atlas.java.util.Iterator<atlas.java.util.Map.Entry<K, V>> {
		public java.lang.Object f151;
		public EntryIterator() {
		}
		public final atlas.java.util.Map.Entry<K, V> next() {
			atlas.java.util.Map.Entry r = null;
			r = new atlas.java.util.concurrent.ConcurrentHashMap.MapEntry();
			((atlas.java.util.concurrent.ConcurrentHashMap.MapEntry)r).f92 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap.EntryIterator)this).f151;
			return (atlas.java.util.Map.Entry<K, V>)r;
		}
	}
	public static final class ValueIterator<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BaseIterator<K, V> implements atlas.java.util.Iterator<V>, java.util.Enumeration<V> {
		public java.lang.Object f21;
		public ValueIterator() {
		}
		public final V next() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap.ValueIterator)this).f21;
			return (V)r;
		}
		public final V nextElement() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap.ValueIterator)this).f21;
			return (V)r;
		}
	}
	public static final class KeyIterator<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.BaseIterator<K, V> implements atlas.java.util.Iterator<K>, java.util.Enumeration<K> {
		public java.lang.Object f145;
		public KeyIterator() {
		}
		public final K next() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap.KeyIterator)this).f145;
			return (K)r;
		}
		public final K nextElement() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap.KeyIterator)this).f145;
			return (K)r;
		}
	}
	public static class BaseIterator<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.Traverser<K, V> {
		public BaseIterator() {
		}
		public final void remove() {
		}
		public final boolean hasNext() {
			boolean r = false;
			return (boolean)r;
		}
		public final boolean hasMoreElements() {
			boolean r = false;
			return (boolean)r;
		}
	}
	public static class Traverser<K,V> {
		public Traverser() {
		}
	}
	public static final class TableStack<K,V> {
		public TableStack() {
		}
	}
	public static final class TreeBin<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.Node<K, V> {
		TreeBin(atlas.atlas.java.util.concurrent.ConcurrentHashMap.TreeNode<K, V> p0) {
		}
		public TreeBin() {
		}
	}
	public static final class TreeNode<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.Node<K, V> {
		public TreeNode() {
		}
	}
	public static final class CounterCell {
		public CounterCell() {
		}
	}
	public static final class ReservationNode<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.Node<K, V> {
		public ReservationNode() {
		}
	}
	public static final class ForwardingNode<K,V> extends atlas.atlas.java.util.concurrent.ConcurrentHashMap.Node<K, V> {
		public ForwardingNode() {
		}
	}
	public static class Segment<K,V> extends java.util.concurrent.locks.ReentrantLock implements java.io.Serializable {
		public Segment() {
		}
	}
	public static class Node<K,V> implements atlas.java.util.Map.Entry<K, V> {
		public Node() {
		}
		public final boolean equals(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public final java.lang.String toString() {
			java.lang.String r = null;
			return (java.lang.String)r;
		}
		public final int hashCode() {
			int r = 0;
			return (int)r;
		}
		public final V getValue() {
			java.lang.Object r = null;
			return (V)r;
		}
		public final K getKey() {
			java.lang.Object r = null;
			return (K)r;
		}
		public final V setValue(V p0) {
			java.lang.Object r = null;
			return (V)r;
		}
	}
}
