package atlas.java.util;
public class TreeMap<K,V> extends atlas.atlas.java.util.AbstractMap<K, V> implements atlas.java.util.NavigableMap<K, V>, java.lang.Cloneable, java.io.Serializable {
	public java.lang.Object f5;
	public java.lang.Object f61;
	public TreeMap(atlas.java.util.Map<? extends K, ? extends V> p0) {
		((atlas.java.util.TreeMap)this).f5 = (java.lang.Object)((atlas.java.util.IdentityHashMap)p0).f93;
		((atlas.java.util.TreeMap)this).f5 = (java.lang.Object)((atlas.java.util.LinkedHashMap)p0).f58;
		((atlas.java.util.TreeMap)this).f61 = (java.lang.Object)((atlas.java.util.LinkedHashMap)p0).f46;
		((atlas.java.util.TreeMap)this).f5 = (java.lang.Object)((atlas.java.util.WeakHashMap)p0).f25;
		((atlas.java.util.TreeMap)this).f5 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableSortedMap)p0).f76;
		((atlas.java.util.TreeMap)this).f61 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)p0).f3;
		((atlas.java.util.TreeMap)this).f5 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f86;
		((atlas.java.util.TreeMap)this).f61 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)p0).f29;
		((atlas.java.util.TreeMap)this).f5 = (java.lang.Object)((atlas.java.util.Hashtable)p0).f32;
		((atlas.java.util.TreeMap)this).f61 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f45;
		((atlas.java.util.TreeMap)this).f5 = (java.lang.Object)((atlas.java.util.TreeMap)p0).f5;
		((atlas.java.util.TreeMap)this).f5 = (java.lang.Object)((atlas.java.util.Properties)p0).f54;
		((atlas.java.util.TreeMap)this).f61 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableMap)p0).f55;
		((atlas.java.util.TreeMap)this).f61 = (java.lang.Object)((atlas.java.util.TreeMap)p0).f61;
		((atlas.java.util.TreeMap)this).f61 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedMap)p0).f48;
		((atlas.java.util.TreeMap)this).f61 = (java.lang.Object)((atlas.java.util.Properties)p0).f59;
		((atlas.java.util.TreeMap)this).f5 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)p0).f23;
		((atlas.java.util.TreeMap)this).f5 = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)p0).f67;
		((atlas.java.util.TreeMap)this).f5 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)p0).f81;
		((atlas.java.util.TreeMap)this).f61 = (java.lang.Object)((atlas.java.util.HashMap)p0).f0;
		((atlas.java.util.TreeMap)this).f5 = (java.lang.Object)((atlas.java.util.HashMap)p0).f37;
		((atlas.java.util.TreeMap)this).f61 = (java.lang.Object)((atlas.java.util.Hashtable)p0).f40;
		((atlas.java.util.TreeMap)this).f61 = (java.lang.Object)((atlas.java.util.IdentityHashMap)p0).f50;
		((atlas.java.util.TreeMap)this).f61 = (java.lang.Object)((atlas.java.util.WeakHashMap)p0).f41;
	}
	public TreeMap(java.util.Comparator<? super K> p0) {
	}
	public TreeMap(atlas.java.util.SortedMap<K, ? extends V> p0) {
		((atlas.java.util.TreeMap)this).f61 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedSortedMap)p0).f123;
		((atlas.java.util.TreeMap)this).f5 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableSortedMap)p0).f76;
		((atlas.java.util.TreeMap)this).f5 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)p0).f81;
		((atlas.java.util.TreeMap)this).f61 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)p0).f29;
		((atlas.java.util.TreeMap)this).f5 = (java.lang.Object)((atlas.java.util.TreeMap)p0).f5;
		((atlas.java.util.TreeMap)this).f61 = (java.lang.Object)((atlas.java.util.TreeMap)p0).f61;
	}
	public TreeMap() {
	}
	public K lastKey() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.TreeMap)this).f5;
		return (K)r;
	}
	public atlas.java.util.SortedMap<K, V> subMap(K p0, K p1) {
		atlas.java.util.SortedMap r = null;
		return (atlas.java.util.SortedMap<K, V>)r;
	}
	public atlas.java.util.NavigableMap<K, V> subMap(K p0, boolean p1, K p2, boolean p3) {
		atlas.java.util.NavigableMap r = null;
		r = new atlas.java.util.TreeMap.AscendingSubMap();
		((atlas.java.util.TreeMap.AscendingSubMap)r).f60 = (java.lang.Object)((atlas.java.util.TreeMap)this).f61;
		((atlas.java.util.TreeMap.AscendingSubMap)r).f67 = (java.lang.Object)((atlas.java.util.TreeMap)this).f5;
		return (atlas.java.util.NavigableMap<K, V>)r;
	}
	public atlas.java.util.SortedMap<K, V> headMap(K p0) {
		atlas.java.util.SortedMap r = null;
		return (atlas.java.util.SortedMap<K, V>)r;
	}
	public atlas.java.util.NavigableMap<K, V> headMap(K p0, boolean p1) {
		atlas.java.util.NavigableMap r = null;
		r = new atlas.java.util.TreeMap.AscendingSubMap();
		((atlas.java.util.TreeMap.AscendingSubMap)r).f60 = (java.lang.Object)((atlas.java.util.TreeMap)this).f61;
		((atlas.java.util.TreeMap.AscendingSubMap)r).f67 = (java.lang.Object)((atlas.java.util.TreeMap)this).f5;
		return (atlas.java.util.NavigableMap<K, V>)r;
	}
	public atlas.java.util.NavigableMap<K, V> tailMap(K p0, boolean p1) {
		atlas.java.util.NavigableMap r = null;
		r = new atlas.java.util.TreeMap.AscendingSubMap();
		((atlas.java.util.TreeMap.AscendingSubMap)r).f60 = (java.lang.Object)((atlas.java.util.TreeMap)this).f61;
		((atlas.java.util.TreeMap.AscendingSubMap)r).f67 = (java.lang.Object)((atlas.java.util.TreeMap)this).f5;
		return (atlas.java.util.NavigableMap<K, V>)r;
	}
	public atlas.java.util.SortedMap<K, V> tailMap(K p0) {
		atlas.java.util.SortedMap r = null;
		r = new atlas.java.util.TreeMap.AscendingSubMap();
		((atlas.java.util.TreeMap.AscendingSubMap)r).f60 = (java.lang.Object)((atlas.java.util.TreeMap)this).f61;
		((atlas.java.util.TreeMap.AscendingSubMap)r).f67 = (java.lang.Object)((atlas.java.util.TreeMap)this).f5;
		return (atlas.java.util.SortedMap<K, V>)r;
	}
	public atlas.java.util.NavigableMap<K, V> descendingMap() {
		atlas.java.util.NavigableMap r = null;
		r = new atlas.java.util.TreeMap.DescendingSubMap();
		((atlas.java.util.TreeMap.DescendingSubMap)r).f62 = (java.lang.Object)((atlas.java.util.TreeMap)this).f5;
		((atlas.java.util.TreeMap.DescendingSubMap)r).f87 = (java.lang.Object)((atlas.java.util.TreeMap)this).f61;
		return (atlas.java.util.NavigableMap<K, V>)r;
	}
	public atlas.java.util.Map.Entry<K, V> ceilingEntry(K p0) {
		atlas.java.util.Map.Entry r = null;
		r = new atlas.java.util.AbstractMap.SimpleImmutableEntry();
		((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f68 = (java.lang.Object)((atlas.java.util.TreeMap)this).f61;
		((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f103 = (java.lang.Object)((atlas.java.util.TreeMap)this).f5;
		return (atlas.java.util.Map.Entry<K, V>)r;
	}
	public K ceilingKey(K p0) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.TreeMap)this).f5;
		return (K)r;
	}
	public atlas.java.util.Map.Entry<K, V> higherEntry(K p0) {
		atlas.java.util.Map.Entry r = null;
		return (atlas.java.util.Map.Entry<K, V>)r;
	}
	public K higherKey(K p0) {
		java.lang.Object r = null;
		return (K)r;
	}
	public atlas.java.util.Map.Entry<K, V> floorEntry(K p0) {
		atlas.java.util.Map.Entry r = null;
		r = new atlas.java.util.AbstractMap.SimpleImmutableEntry();
		((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f68 = (java.lang.Object)((atlas.java.util.TreeMap)this).f61;
		((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f103 = (java.lang.Object)((atlas.java.util.TreeMap)this).f5;
		return (atlas.java.util.Map.Entry<K, V>)r;
	}
	public K floorKey(K p0) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.TreeMap)this).f5;
		return (K)r;
	}
	public atlas.java.util.Map.Entry<K, V> lowerEntry(K p0) {
		atlas.java.util.Map.Entry r = null;
		return (atlas.java.util.Map.Entry<K, V>)r;
	}
	public K lowerKey(K p0) {
		java.lang.Object r = null;
		return (K)r;
	}
	public atlas.java.util.Map.Entry<K, V> firstEntry() {
		atlas.java.util.Map.Entry r = null;
		r = new atlas.java.util.AbstractMap.SimpleImmutableEntry();
		((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f68 = (java.lang.Object)((atlas.java.util.TreeMap)this).f61;
		((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f103 = (java.lang.Object)((atlas.java.util.TreeMap)this).f5;
		return (atlas.java.util.Map.Entry<K, V>)r;
	}
	public atlas.java.util.Map.Entry<K, V> lastEntry() {
		atlas.java.util.Map.Entry r = null;
		r = new atlas.java.util.AbstractMap.SimpleImmutableEntry();
		((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f68 = (java.lang.Object)((atlas.java.util.TreeMap)this).f61;
		((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f103 = (java.lang.Object)((atlas.java.util.TreeMap)this).f5;
		return (atlas.java.util.Map.Entry<K, V>)r;
	}
	public atlas.java.util.Map.Entry<K, V> pollFirstEntry() {
		atlas.java.util.Map.Entry r = null;
		r = new atlas.java.util.AbstractMap.SimpleImmutableEntry();
		((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f68 = (java.lang.Object)((atlas.java.util.TreeMap)this).f61;
		((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f103 = (java.lang.Object)((atlas.java.util.TreeMap)this).f5;
		return (atlas.java.util.Map.Entry<K, V>)r;
	}
	public atlas.java.util.Map.Entry<K, V> pollLastEntry() {
		atlas.java.util.Map.Entry r = null;
		r = new atlas.java.util.AbstractMap.SimpleImmutableEntry();
		((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f68 = (java.lang.Object)((atlas.java.util.TreeMap)this).f61;
		((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f103 = (java.lang.Object)((atlas.java.util.TreeMap)this).f5;
		return (atlas.java.util.Map.Entry<K, V>)r;
	}
	public java.util.NavigableSet<K> navigableKeySet() {
		java.util.NavigableSet r = null;
		r = new atlas.java.util.TreeMap.KeySet();
		((atlas.java.util.TreeMap.KeySet)r).f63 = (java.lang.Object)((atlas.java.util.TreeMap)this).f5;
		return (java.util.NavigableSet<K>)r;
	}
	public java.util.NavigableSet<K> descendingKeySet() {
		java.util.NavigableSet r = null;
		r = new atlas.java.util.TreeMap.KeySet();
		((atlas.java.util.TreeMap.KeySet)r).f63 = (java.lang.Object)((atlas.java.util.TreeMap)this).f5;
		return (java.util.NavigableSet<K>)r;
	}
	public V remove(java.lang.Object p0) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.TreeMap)this).f61;
		return (V)r;
	}
	public V get(java.lang.Object p0) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.TreeMap)this).f61;
		return (V)r;
	}
	public V put(K p0, V p1) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.TreeMap)this).f61;
		((atlas.java.util.TreeMap)this).f61 = (java.lang.Object)p1;
		((atlas.java.util.TreeMap)this).f5 = (java.lang.Object)p0;
		return (V)r;
	}
	public atlas.java.util.Collection<V> values() {
		atlas.java.util.Collection r = null;
		r = new atlas.java.util.TreeMap.Values();
		((atlas.java.util.TreeMap.Values)r).f69 = (java.lang.Object)((atlas.java.util.TreeMap)this).f61;
		return (atlas.java.util.Collection<V>)r;
	}
	public java.lang.Object clone() {
		java.lang.Object r = null;
		r = new atlas.java.util.TreeMap();
		((atlas.java.util.TreeMap)r).f5 = (java.lang.Object)((atlas.java.util.TreeMap)this).f5;
		((atlas.java.util.TreeMap)r).f61 = (java.lang.Object)((atlas.java.util.TreeMap)this).f61;
		return (java.lang.Object)r;
	}
	public void clear() {
	}
	public boolean replace(K p0, V p1, V p2) {
		boolean r = false;
		return (boolean)r;
	}
	public V replace(K p0, V p1) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.TreeMap)this).f61;
		return (V)r;
	}
	public int size() {
		int r = 0;
		return (int)r;
	}
	public java.util.Set<atlas.java.util.Map.Entry<K, V>> entrySet() {
		java.util.Set r = null;
		r = new atlas.java.util.TreeMap.EntrySet();
		((atlas.java.util.TreeMap.EntrySet)r).f101 = (java.lang.Object)((atlas.java.util.TreeMap)this).f61;
		return (java.util.Set<atlas.java.util.Map.Entry<K, V>>)r;
	}
	public void putAll(atlas.java.util.Map<? extends K, ? extends V> p0) {
		((atlas.java.util.TreeMap)this).f61 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)p0).f3;
		((atlas.java.util.TreeMap)this).f5 = (java.lang.Object)((atlas.java.util.TreeMap)p0).f5;
		((atlas.java.util.TreeMap)this).f61 = (java.lang.Object)((atlas.java.util.TreeMap)p0).f61;
		((atlas.java.util.TreeMap)this).f61 = (java.lang.Object)((atlas.java.util.Properties)p0).f59;
		((atlas.java.util.TreeMap)this).f5 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)p0).f81;
		((atlas.java.util.TreeMap)this).f61 = (java.lang.Object)((atlas.java.util.WeakHashMap)p0).f41;
		((atlas.java.util.TreeMap)this).f5 = (java.lang.Object)((atlas.java.util.LinkedHashMap)p0).f58;
		((atlas.java.util.TreeMap)this).f5 = (java.lang.Object)((atlas.java.util.IdentityHashMap)p0).f93;
		((atlas.java.util.TreeMap)this).f61 = (java.lang.Object)((atlas.java.util.Hashtable)p0).f40;
		((atlas.java.util.TreeMap)this).f5 = (java.lang.Object)((atlas.java.util.WeakHashMap)p0).f25;
		((atlas.java.util.TreeMap)this).f61 = (java.lang.Object)((atlas.java.util.HashMap)p0).f0;
		((atlas.java.util.TreeMap)this).f61 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)p0).f29;
		((atlas.java.util.TreeMap)this).f5 = (java.lang.Object)((atlas.java.util.HashMap)p0).f37;
		((atlas.java.util.TreeMap)this).f61 = (java.lang.Object)((atlas.java.util.IdentityHashMap)p0).f50;
		((atlas.java.util.TreeMap)this).f61 = (java.lang.Object)((atlas.java.util.LinkedHashMap)p0).f46;
		((atlas.java.util.TreeMap)this).f5 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)p0).f23;
		((atlas.java.util.TreeMap)this).f5 = (java.lang.Object)((atlas.java.util.Properties)p0).f54;
		((atlas.java.util.TreeMap)this).f61 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableMap)p0).f55;
		((atlas.java.util.TreeMap)this).f5 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedMap)p0).f24;
		((atlas.java.util.TreeMap)this).f61 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedMap)p0).f48;
		((atlas.java.util.TreeMap)this).f5 = (java.lang.Object)((atlas.java.util.Hashtable)p0).f32;
		((atlas.java.util.TreeMap)this).f61 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f45;
		((atlas.java.util.TreeMap)this).f5 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f86;
	}
	public java.util.Set<K> keySet() {
		java.util.Set r = null;
		r = new atlas.java.util.TreeMap.KeySet();
		((atlas.java.util.TreeMap.KeySet)r).f63 = (java.lang.Object)((atlas.java.util.TreeMap)this).f5;
		return (java.util.Set<K>)r;
	}
	public boolean containsValue(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public boolean containsKey(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public java.util.Comparator<? super K> comparator() {
		java.util.Comparator r = null;
		return (java.util.Comparator<? super K>)r;
	}
	public K firstKey() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.TreeMap)this).f5;
		return (K)r;
	}
	public static final class EntrySpliterator<K,V> extends atlas.atlas.java.util.TreeMap.TreeMapSpliterator<K, V> {
		public EntrySpliterator() {
		}
		public atlas.atlas.java.util.TreeMap.EntrySpliterator<K, V> trySplit() {
			atlas.java.util.TreeMap.EntrySpliterator r = null;
			return (atlas.atlas.java.util.TreeMap.EntrySpliterator<K, V>)r;
		}
		public int characteristics() {
			int r = 0;
			return (int)r;
		}
		public java.util.Comparator<atlas.java.util.Map.Entry<K, V>> getComparator() {
			java.util.Comparator r = null;
			return (java.util.Comparator<atlas.java.util.Map.Entry<K, V>>)r;
		}
	}
	public static final class ValueSpliterator<K,V> extends atlas.atlas.java.util.TreeMap.TreeMapSpliterator<K, V> {
		public ValueSpliterator() {
		}
		public atlas.atlas.java.util.TreeMap.ValueSpliterator<K, V> trySplit() {
			atlas.java.util.TreeMap.ValueSpliterator r = null;
			return (atlas.atlas.java.util.TreeMap.ValueSpliterator<K, V>)r;
		}
		public int characteristics() {
			int r = 0;
			return (int)r;
		}
	}
	public static final class DescendingKeySpliterator<K,V> extends atlas.atlas.java.util.TreeMap.TreeMapSpliterator<K, V> {
		public DescendingKeySpliterator() {
		}
		public atlas.atlas.java.util.TreeMap.DescendingKeySpliterator<K, V> trySplit() {
			atlas.java.util.TreeMap.DescendingKeySpliterator r = null;
			return (atlas.atlas.java.util.TreeMap.DescendingKeySpliterator<K, V>)r;
		}
		public int characteristics() {
			int r = 0;
			return (int)r;
		}
	}
	public static final class KeySpliterator<K,V> extends atlas.atlas.java.util.TreeMap.TreeMapSpliterator<K, V> {
		public KeySpliterator() {
		}
		public atlas.atlas.java.util.TreeMap.KeySpliterator<K, V> trySplit() {
			atlas.java.util.TreeMap.KeySpliterator r = null;
			return (atlas.atlas.java.util.TreeMap.KeySpliterator<K, V>)r;
		}
		public int characteristics() {
			int r = 0;
			return (int)r;
		}
		public final java.util.Comparator<? super K> getComparator() {
			java.util.Comparator r = null;
			return (java.util.Comparator<? super K>)r;
		}
	}
	public static class TreeMapSpliterator<K,V> {
		public TreeMapSpliterator() {
		}
		public final long estimateSize() {
			long r = 0;
			return (long)r;
		}
	}
	public static final class Entry<K,V> implements atlas.java.util.Map.Entry<K, V> {
		public java.lang.Object f43;
		Entry(K p0, V p1, atlas.atlas.java.util.TreeMap.Entry<K, V> p2) {
		}
		public Entry() {
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
			r = (java.lang.Object)((atlas.java.util.TreeMap.Entry)this).f43;
			return (V)r;
		}
		public K getKey() {
			java.lang.Object r = null;
			return (K)r;
		}
		public V setValue(V p0) {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.TreeMap.Entry)this).f43;
			return (V)r;
		}
	}
	public class SubMap extends atlas.atlas.java.util.AbstractMap<K, V> implements atlas.java.util.SortedMap<K, V>, java.io.Serializable {
		private SubMap(atlas.atlas.java.util.TreeMap p0) {
		}
		public SubMap() {
		}
		public K lastKey() {
			java.lang.Object r = null;
			return (K)r;
		}
		public atlas.java.util.SortedMap<K, V> subMap(K p0, K p1) {
			atlas.java.util.SortedMap r = null;
			return (atlas.java.util.SortedMap<K, V>)r;
		}
		public atlas.java.util.SortedMap<K, V> headMap(K p0) {
			atlas.java.util.SortedMap r = null;
			return (atlas.java.util.SortedMap<K, V>)r;
		}
		public atlas.java.util.SortedMap<K, V> tailMap(K p0) {
			atlas.java.util.SortedMap r = null;
			return (atlas.java.util.SortedMap<K, V>)r;
		}
		public java.util.Set<atlas.java.util.Map.Entry<K, V>> entrySet() {
			java.util.Set r = null;
			return (java.util.Set<atlas.java.util.Map.Entry<K, V>>)r;
		}
		public java.util.Comparator<? super K> comparator() {
			java.util.Comparator r = null;
			return (java.util.Comparator<? super K>)r;
		}
		public K firstKey() {
			java.lang.Object r = null;
			return (K)r;
		}
	}
	public static final class DescendingSubMap<K,V> extends atlas.atlas.java.util.TreeMap.NavigableSubMap<K, V> {
		public java.lang.Object f87;
		public java.lang.Object f62;
		public DescendingSubMap() {
		}
		public atlas.java.util.NavigableMap<K, V> subMap(K p0, boolean p1, K p2, boolean p3) {
			atlas.java.util.NavigableMap r = null;
			return (atlas.java.util.NavigableMap<K, V>)r;
		}
		public atlas.java.util.NavigableMap<K, V> headMap(K p0, boolean p1) {
			atlas.java.util.NavigableMap r = null;
			r = new atlas.java.util.TreeMap.DescendingSubMap();
			((atlas.java.util.TreeMap.DescendingSubMap)r).f87 = (java.lang.Object)((atlas.java.util.TreeMap.DescendingSubMap)this).f87;
			return (atlas.java.util.NavigableMap<K, V>)r;
		}
		public atlas.java.util.NavigableMap<K, V> tailMap(K p0, boolean p1) {
			atlas.java.util.NavigableMap r = null;
			r = new atlas.java.util.TreeMap.DescendingSubMap();
			((atlas.java.util.TreeMap.DescendingSubMap)r).f87 = (java.lang.Object)((atlas.java.util.TreeMap.DescendingSubMap)this).f87;
			return (atlas.java.util.NavigableMap<K, V>)r;
		}
		public atlas.java.util.NavigableMap<K, V> descendingMap() {
			atlas.java.util.NavigableMap r = null;
			r = new atlas.java.util.TreeMap.AscendingSubMap();
			((atlas.java.util.TreeMap.AscendingSubMap)r).f60 = (java.lang.Object)((atlas.java.util.TreeMap.DescendingSubMap)this).f87;
			return (atlas.java.util.NavigableMap<K, V>)r;
		}
		public java.util.Set<atlas.java.util.Map.Entry<K, V>> entrySet() {
			java.util.Set r = null;
			return (java.util.Set<atlas.java.util.Map.Entry<K, V>>)r;
		}
		public java.util.Comparator<? super K> comparator() {
			java.util.Comparator r = null;
			return (java.util.Comparator<? super K>)r;
		}
		public final class DescendingEntrySetView extends atlas.atlas.java.util.TreeMap.NavigableSubMap<K, V>.EntrySetView {
			DescendingEntrySetView(atlas.atlas.java.util.TreeMap.DescendingSubMap p0) {
			}
			public DescendingEntrySetView() {
			}
			public atlas.java.util.Iterator<atlas.java.util.Map.Entry<K, V>> iterator() {
				atlas.java.util.Iterator r = null;
				return (atlas.java.util.Iterator<atlas.java.util.Map.Entry<K, V>>)r;
			}
		}
	}
	public static final class AscendingSubMap<K,V> extends atlas.atlas.java.util.TreeMap.NavigableSubMap<K, V> {
		public java.lang.Object f67;
		public java.lang.Object f60;
		public AscendingSubMap() {
		}
		public atlas.java.util.NavigableMap<K, V> subMap(K p0, boolean p1, K p2, boolean p3) {
			atlas.java.util.NavigableMap r = null;
			return (atlas.java.util.NavigableMap<K, V>)r;
		}
		public atlas.java.util.NavigableMap<K, V> headMap(K p0, boolean p1) {
			atlas.java.util.NavigableMap r = null;
			r = new atlas.java.util.TreeMap.AscendingSubMap();
			((atlas.java.util.TreeMap.AscendingSubMap)r).f60 = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)this).f60;
			((atlas.java.util.TreeMap.AscendingSubMap)r).f67 = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)this).f67;
			return (atlas.java.util.NavigableMap<K, V>)r;
		}
		public atlas.java.util.NavigableMap<K, V> tailMap(K p0, boolean p1) {
			atlas.java.util.NavigableMap r = null;
			r = new atlas.java.util.TreeMap.AscendingSubMap();
			((atlas.java.util.TreeMap.AscendingSubMap)r).f60 = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)this).f60;
			return (atlas.java.util.NavigableMap<K, V>)r;
		}
		public atlas.java.util.NavigableMap<K, V> descendingMap() {
			atlas.java.util.NavigableMap r = null;
			r = new atlas.java.util.TreeMap.DescendingSubMap();
			((atlas.java.util.TreeMap.DescendingSubMap)r).f87 = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)this).f60;
			return (atlas.java.util.NavigableMap<K, V>)r;
		}
		public java.util.Set<atlas.java.util.Map.Entry<K, V>> entrySet() {
			java.util.Set r = null;
			return (java.util.Set<atlas.java.util.Map.Entry<K, V>>)r;
		}
		public java.util.Comparator<? super K> comparator() {
			java.util.Comparator r = null;
			return (java.util.Comparator<? super K>)r;
		}
		public final class AscendingEntrySetView extends atlas.atlas.java.util.TreeMap.NavigableSubMap<K, V>.EntrySetView {
			AscendingEntrySetView(atlas.atlas.java.util.TreeMap.AscendingSubMap p0) {
			}
			public AscendingEntrySetView() {
			}
			public atlas.java.util.Iterator<atlas.java.util.Map.Entry<K, V>> iterator() {
				atlas.java.util.Iterator r = null;
				return (atlas.java.util.Iterator<atlas.java.util.Map.Entry<K, V>>)r;
			}
		}
	}
	public abstract static class NavigableSubMap<K,V> extends atlas.atlas.java.util.AbstractMap<K, V> implements atlas.java.util.NavigableMap<K, V>, java.io.Serializable {
		public NavigableSubMap() {
		}
		public final K lastKey() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.TreeMap.DescendingSubMap)this).f62;
			r = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)this).f67;
			return (K)r;
		}
		public final atlas.java.util.SortedMap<K, V> subMap(K p0, K p1) {
			atlas.java.util.SortedMap r = null;
			return (atlas.java.util.SortedMap<K, V>)r;
		}
		public final atlas.java.util.SortedMap<K, V> headMap(K p0) {
			atlas.java.util.SortedMap r = null;
			return (atlas.java.util.SortedMap<K, V>)r;
		}
		public final atlas.java.util.SortedMap<K, V> tailMap(K p0) {
			atlas.java.util.SortedMap r = null;
			r = new atlas.java.util.TreeMap.AscendingSubMap();
			r = new atlas.java.util.TreeMap.DescendingSubMap();
			((atlas.java.util.TreeMap.AscendingSubMap)r).f60 = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)this).f60;
			((atlas.java.util.TreeMap.AscendingSubMap)r).f67 = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)this).f67;
			((atlas.java.util.TreeMap.DescendingSubMap)r).f87 = (java.lang.Object)((atlas.java.util.TreeMap.DescendingSubMap)this).f87;
			return (atlas.java.util.SortedMap<K, V>)r;
		}
		public final atlas.java.util.Map.Entry<K, V> ceilingEntry(K p0) {
			atlas.java.util.Map.Entry r = null;
			r = new atlas.java.util.AbstractMap.SimpleImmutableEntry();
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f103 = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)this).f67;
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f68 = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)this).f60;
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f103 = (java.lang.Object)((atlas.java.util.TreeMap.DescendingSubMap)this).f62;
			return (atlas.java.util.Map.Entry<K, V>)r;
		}
		public final K ceilingKey(K p0) {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.TreeMap.DescendingSubMap)this).f62;
			r = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)this).f67;
			return (K)r;
		}
		public final atlas.java.util.Map.Entry<K, V> higherEntry(K p0) {
			atlas.java.util.Map.Entry r = null;
			return (atlas.java.util.Map.Entry<K, V>)r;
		}
		public final K higherKey(K p0) {
			java.lang.Object r = null;
			return (K)r;
		}
		public final atlas.java.util.Map.Entry<K, V> floorEntry(K p0) {
			atlas.java.util.Map.Entry r = null;
			r = new atlas.java.util.AbstractMap.SimpleImmutableEntry();
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f103 = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)this).f67;
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f68 = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)this).f60;
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f103 = (java.lang.Object)((atlas.java.util.TreeMap.DescendingSubMap)this).f62;
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f68 = (java.lang.Object)((atlas.java.util.TreeMap.DescendingSubMap)this).f87;
			return (atlas.java.util.Map.Entry<K, V>)r;
		}
		public final K floorKey(K p0) {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.TreeMap.DescendingSubMap)this).f62;
			r = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)this).f67;
			return (K)r;
		}
		public final atlas.java.util.Map.Entry<K, V> lowerEntry(K p0) {
			atlas.java.util.Map.Entry r = null;
			return (atlas.java.util.Map.Entry<K, V>)r;
		}
		public final K lowerKey(K p0) {
			java.lang.Object r = null;
			return (K)r;
		}
		public final atlas.java.util.Map.Entry<K, V> firstEntry() {
			atlas.java.util.Map.Entry r = null;
			r = new atlas.java.util.AbstractMap.SimpleImmutableEntry();
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f103 = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)this).f67;
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f68 = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)this).f60;
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f68 = (java.lang.Object)((atlas.java.util.TreeMap.DescendingSubMap)this).f87;
			return (atlas.java.util.Map.Entry<K, V>)r;
		}
		public final atlas.java.util.Map.Entry<K, V> lastEntry() {
			atlas.java.util.Map.Entry r = null;
			r = new atlas.java.util.AbstractMap.SimpleImmutableEntry();
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f103 = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)this).f67;
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f68 = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)this).f60;
			return (atlas.java.util.Map.Entry<K, V>)r;
		}
		public final atlas.java.util.Map.Entry<K, V> pollFirstEntry() {
			atlas.java.util.Map.Entry r = null;
			r = new atlas.java.util.AbstractMap.SimpleImmutableEntry();
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f103 = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)this).f67;
			return (atlas.java.util.Map.Entry<K, V>)r;
		}
		public final atlas.java.util.Map.Entry<K, V> pollLastEntry() {
			atlas.java.util.Map.Entry r = null;
			r = new atlas.java.util.AbstractMap.SimpleImmutableEntry();
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f103 = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)this).f67;
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f103 = (java.lang.Object)((atlas.java.util.TreeMap.DescendingSubMap)this).f62;
			return (atlas.java.util.Map.Entry<K, V>)r;
		}
		public final java.util.NavigableSet<K> navigableKeySet() {
			java.util.NavigableSet r = null;
			r = new atlas.java.util.TreeMap.KeySet();
			((atlas.java.util.TreeMap.KeySet)r).f63 = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)this).f67;
			((atlas.java.util.TreeMap.KeySet)r).f63 = (java.lang.Object)((atlas.java.util.TreeMap.DescendingSubMap)this).f62;
			return (java.util.NavigableSet<K>)r;
		}
		public java.util.NavigableSet<K> descendingKeySet() {
			java.util.NavigableSet r = null;
			r = new atlas.java.util.TreeMap.KeySet();
			((atlas.java.util.TreeMap.KeySet)r).f63 = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)this).f67;
			((atlas.java.util.TreeMap.KeySet)r).f63 = (java.lang.Object)((atlas.java.util.TreeMap.DescendingSubMap)this).f62;
			return (java.util.NavigableSet<K>)r;
		}
		public final V remove(java.lang.Object p0) {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)this).f60;
			r = (java.lang.Object)((atlas.java.util.TreeMap.DescendingSubMap)this).f87;
			return (V)r;
		}
		public final V get(java.lang.Object p0) {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)this).f60;
			r = (java.lang.Object)((atlas.java.util.TreeMap.DescendingSubMap)this).f87;
			return (V)r;
		}
		public final V put(K p0, V p1) {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)this).f60;
			r = (java.lang.Object)((atlas.java.util.TreeMap.DescendingSubMap)this).f87;
			return (V)r;
		}
		public boolean isEmpty() {
			boolean r = false;
			return (boolean)r;
		}
		public int size() {
			int r = 0;
			return (int)r;
		}
		public final java.util.Set<K> keySet() {
			java.util.Set r = null;
			r = new atlas.java.util.TreeMap.KeySet();
			((atlas.java.util.TreeMap.KeySet)r).f63 = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)this).f67;
			return (java.util.Set<K>)r;
		}
		public final boolean containsKey(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public final K firstKey() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.TreeMap.DescendingSubMap)this).f62;
			r = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)this).f67;
			return (K)r;
		}
		public final class DescendingSubMapKeyIterator extends atlas.atlas.java.util.TreeMap.NavigableSubMap<K, V>.SubMapIterator<K> {
			public java.lang.Object f161;
			public DescendingSubMapKeyIterator() {
			}
			public long estimateSize() {
				long r = 0;
				return (long)r;
			}
			public int characteristics() {
				int r = 0;
				return (int)r;
			}
			public void remove() {
			}
			public K next() {
				java.lang.Object r = null;
				r = (java.lang.Object)((atlas.java.util.TreeMap.NavigableSubMap.DescendingSubMapKeyIterator)this).f161;
				return (K)r;
			}
		}
		public final class SubMapKeyIterator extends atlas.atlas.java.util.TreeMap.NavigableSubMap<K, V>.SubMapIterator<K> {
			public java.lang.Object f94;
			public SubMapKeyIterator() {
			}
			public long estimateSize() {
				long r = 0;
				return (long)r;
			}
			public int characteristics() {
				int r = 0;
				return (int)r;
			}
			public final java.util.Comparator<? super K> getComparator() {
				java.util.Comparator r = null;
				return (java.util.Comparator<? super K>)r;
			}
			public void remove() {
			}
			public K next() {
				java.lang.Object r = null;
				r = (java.lang.Object)((atlas.java.util.TreeMap.NavigableSubMap.SubMapKeyIterator)this).f94;
				return (K)r;
			}
		}
		public final class DescendingSubMapEntryIterator extends atlas.atlas.java.util.TreeMap.NavigableSubMap<K, V>.SubMapIterator<atlas.java.util.Map.Entry<K, V>> {
			public DescendingSubMapEntryIterator() {
			}
			public void remove() {
			}
			public atlas.java.util.Map.Entry<K, V> next() {
				atlas.java.util.Map.Entry r = null;
				return (atlas.java.util.Map.Entry<K, V>)r;
			}
		}
		public final class SubMapEntryIterator extends atlas.atlas.java.util.TreeMap.NavigableSubMap<K, V>.SubMapIterator<atlas.java.util.Map.Entry<K, V>> {
			public SubMapEntryIterator() {
			}
			public void remove() {
			}
			public atlas.java.util.Map.Entry<K, V> next() {
				atlas.java.util.Map.Entry r = null;
				return (atlas.java.util.Map.Entry<K, V>)r;
			}
		}
		public abstract class SubMapIterator<T> implements atlas.java.util.Iterator<T> {
			public SubMapIterator() {
			}
			public final boolean hasNext() {
				boolean r = false;
				return (boolean)r;
			}
		}
		public abstract class EntrySetView extends atlas.java.util.AbstractSet<atlas.java.util.Map.Entry<K, V>> {
			EntrySetView(atlas.atlas.java.util.TreeMap.NavigableSubMap p0) {
			}
			public EntrySetView() {
			}
			public boolean remove(java.lang.Object p0) {
				boolean r = false;
				return (boolean)r;
			}
			public boolean isEmpty() {
				boolean r = false;
				return (boolean)r;
			}
			public boolean contains(java.lang.Object p0) {
				boolean r = false;
				return (boolean)r;
			}
			public int size() {
				int r = 0;
				return (int)r;
			}
		}
	}
	public final class DescendingKeyIterator extends atlas.atlas.java.util.TreeMap<K, V>.PrivateEntryIterator<K> {
		public java.lang.Object f168;
		public DescendingKeyIterator() {
		}
		public void remove() {
		}
		public K next() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.TreeMap.DescendingKeyIterator)this).f168;
			return (K)r;
		}
	}
	public final class KeyIterator extends atlas.atlas.java.util.TreeMap<K, V>.PrivateEntryIterator<K> {
		public java.lang.Object f140;
		public KeyIterator() {
		}
		public K next() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.TreeMap.KeyIterator)this).f140;
			return (K)r;
		}
	}
	public final class ValueIterator extends atlas.atlas.java.util.TreeMap<K, V>.PrivateEntryIterator<V> {
		public java.lang.Object f122;
		public ValueIterator() {
		}
		public V next() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.TreeMap.ValueIterator)this).f122;
			return (V)r;
		}
	}
	public final class EntryIterator extends atlas.atlas.java.util.TreeMap<K, V>.PrivateEntryIterator<atlas.java.util.Map.Entry<K, V>> {
		public java.lang.Object f85;
		public EntryIterator() {
		}
		public atlas.java.util.Map.Entry<K, V> next() {
			atlas.java.util.Map.Entry r = null;
			r = new atlas.java.util.TreeMap.Entry();
			((atlas.java.util.TreeMap.Entry)r).f43 = (java.lang.Object)((atlas.java.util.TreeMap.EntryIterator)this).f85;
			return (atlas.java.util.Map.Entry<K, V>)r;
		}
	}
	public abstract class PrivateEntryIterator<T> implements atlas.java.util.Iterator<T> {
		public PrivateEntryIterator() {
		}
		public void remove() {
		}
		public final boolean hasNext() {
			boolean r = false;
			return (boolean)r;
		}
	}
	public static final class KeySet<E> extends atlas.java.util.AbstractSet<E> implements java.util.NavigableSet<E> {
		public java.lang.Object f63;
		KeySet(atlas.java.util.NavigableMap<E, ?> p0) {
		}
		public KeySet() {
		}
		public java.util.SortedSet<E> subSet(E p0, E p1) {
			java.util.SortedSet r = null;
			return (java.util.SortedSet<E>)r;
		}
		public java.util.NavigableSet<E> subSet(E p0, boolean p1, E p2, boolean p3) {
			java.util.NavigableSet r = null;
			r = new atlas.java.util.TreeMap.KeySet();
			((atlas.java.util.TreeMap.KeySet)r).f63 = (java.lang.Object)((atlas.java.util.TreeMap.KeySet)this).f63;
			return (java.util.NavigableSet<E>)r;
		}
		public java.util.SortedSet<E> headSet(E p0) {
			java.util.SortedSet r = null;
			return (java.util.SortedSet<E>)r;
		}
		public java.util.NavigableSet<E> headSet(E p0, boolean p1) {
			java.util.NavigableSet r = null;
			r = new atlas.java.util.TreeMap.KeySet();
			((atlas.java.util.TreeMap.KeySet)r).f63 = (java.lang.Object)((atlas.java.util.TreeMap.KeySet)this).f63;
			return (java.util.NavigableSet<E>)r;
		}
		public java.util.SortedSet<E> tailSet(E p0) {
			java.util.SortedSet r = null;
			r = new atlas.java.util.TreeMap.KeySet();
			((atlas.java.util.TreeMap.KeySet)r).f63 = (java.lang.Object)((atlas.java.util.TreeMap.KeySet)this).f63;
			return (java.util.SortedSet<E>)r;
		}
		public java.util.NavigableSet<E> tailSet(E p0, boolean p1) {
			java.util.NavigableSet r = null;
			r = new atlas.java.util.TreeMap.KeySet();
			((atlas.java.util.TreeMap.KeySet)r).f63 = (java.lang.Object)((atlas.java.util.TreeMap.KeySet)this).f63;
			return (java.util.NavigableSet<E>)r;
		}
		public E pollFirst() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.TreeMap.KeySet)this).f63;
			return (E)r;
		}
		public E pollLast() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.TreeMap.KeySet)this).f63;
			return (E)r;
		}
		public atlas.java.util.Iterator<E> descendingIterator() {
			atlas.java.util.Iterator r = null;
			r = new atlas.java.util.TreeMap.DescendingKeyIterator();
			r = new atlas.java.util.TreeMap.NavigableSubMap.SubMapKeyIterator();
			((atlas.java.util.TreeMap.DescendingKeyIterator)r).f168 = (java.lang.Object)((atlas.java.util.TreeMap.KeySet)this).f63;
			((atlas.java.util.TreeMap.NavigableSubMap.SubMapKeyIterator)r).f94 = (java.lang.Object)((atlas.java.util.TreeMap.KeySet)this).f63;
			return (atlas.java.util.Iterator<E>)r;
		}
		public E ceiling(E p0) {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.TreeMap.KeySet)this).f63;
			return (E)r;
		}
		public E higher(E p0) {
			java.lang.Object r = null;
			return (E)r;
		}
		public java.util.NavigableSet<E> descendingSet() {
			java.util.NavigableSet r = null;
			r = new atlas.java.util.TreeMap.KeySet();
			((atlas.java.util.TreeMap.KeySet)r).f63 = (java.lang.Object)((atlas.java.util.TreeMap.KeySet)this).f63;
			return (java.util.NavigableSet<E>)r;
		}
		public boolean remove(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public void clear() {
		}
		public boolean isEmpty() {
			boolean r = false;
			return (boolean)r;
		}
		public E first() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.TreeMap.KeySet)this).f63;
			return (E)r;
		}
		public boolean contains(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public int size() {
			int r = 0;
			return (int)r;
		}
		public atlas.java.util.Iterator<E> iterator() {
			atlas.java.util.Iterator r = null;
			r = new atlas.java.util.TreeMap.NavigableSubMap.DescendingSubMapKeyIterator();
			r = new atlas.java.util.TreeMap.NavigableSubMap.SubMapKeyIterator();
			r = new atlas.java.util.TreeMap.KeyIterator();
			((atlas.java.util.TreeMap.KeyIterator)r).f140 = (java.lang.Object)((atlas.java.util.TreeMap.KeySet)this).f63;
			((atlas.java.util.TreeMap.NavigableSubMap.DescendingSubMapKeyIterator)r).f161 = (java.lang.Object)((atlas.java.util.TreeMap.KeySet)this).f63;
			((atlas.java.util.TreeMap.NavigableSubMap.SubMapKeyIterator)r).f94 = (java.lang.Object)((atlas.java.util.TreeMap.KeySet)this).f63;
			return (atlas.java.util.Iterator<E>)r;
		}
		public E last() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.TreeMap.KeySet)this).f63;
			return (E)r;
		}
		public E lower(E p0) {
			java.lang.Object r = null;
			return (E)r;
		}
		public java.util.Comparator<? super E> comparator() {
			java.util.Comparator r = null;
			return (java.util.Comparator<? super E>)r;
		}
		public E floor(E p0) {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.TreeMap.KeySet)this).f63;
			return (E)r;
		}
	}
	public class EntrySet extends atlas.java.util.AbstractSet<atlas.java.util.Map.Entry<K, V>> {
		public java.lang.Object f101;
		EntrySet(atlas.atlas.java.util.TreeMap p0) {
		}
		public EntrySet() {
		}
		public boolean remove(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public void clear() {
		}
		public boolean contains(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public int size() {
			int r = 0;
			return (int)r;
		}
		public atlas.java.util.Iterator<atlas.java.util.Map.Entry<K, V>> iterator() {
			atlas.java.util.Iterator r = null;
			r = new atlas.java.util.TreeMap.EntryIterator();
			((atlas.java.util.TreeMap.EntryIterator)r).f85 = (java.lang.Object)((atlas.java.util.TreeMap.EntrySet)this).f101;
			return (atlas.java.util.Iterator<atlas.java.util.Map.Entry<K, V>>)r;
		}
	}
	public class Values extends atlas.atlas.java.util.AbstractCollection<V> {
		public java.lang.Object f69;
		Values(atlas.atlas.java.util.TreeMap p0) {
		}
		public Values() {
		}
		public boolean remove(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public void clear() {
		}
		public boolean contains(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public int size() {
			int r = 0;
			return (int)r;
		}
		public atlas.java.util.Iterator<V> iterator() {
			atlas.java.util.Iterator r = null;
			r = new atlas.java.util.TreeMap.ValueIterator();
			((atlas.java.util.TreeMap.ValueIterator)r).f122 = (java.lang.Object)((atlas.java.util.TreeMap.Values)this).f69;
			return (atlas.java.util.Iterator<V>)r;
		}
	}
}
