package atlas.java.util.concurrent;
public class ConcurrentSkipListMap<K,V> extends atlas.atlas.java.util.AbstractMap<K, V> implements java.util.concurrent.ConcurrentNavigableMap<K, V>, java.lang.Cloneable, java.io.Serializable {
	public java.lang.Object f81;
	public java.lang.Object f29;
	public ConcurrentSkipListMap(java.util.Comparator<? super K> p0) {
	}
	public ConcurrentSkipListMap(atlas.java.util.SortedMap<K, ? extends V> p0) {
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29 = (java.lang.Object)((atlas.java.util.TreeMap)p0).f61;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81 = (java.lang.Object)((atlas.java.util.TreeMap)p0).f5;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableNavigableMap)p0).f39;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)p0).f29;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)p0).f81;
	}
	public ConcurrentSkipListMap(atlas.java.util.Map<? extends K, ? extends V> p0) {
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableMap)p0).f55;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f45;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81 = (java.lang.Object)((atlas.java.util.TreeMap)p0).f5;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29 = (java.lang.Object)((atlas.java.util.HashMap)p0).f0;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29 = (java.lang.Object)((atlas.java.util.LinkedHashMap)p0).f46;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81 = (java.lang.Object)((atlas.java.util.WeakHashMap)p0).f25;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29 = (java.lang.Object)((atlas.java.util.IdentityHashMap)p0).f50;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableMap)p0).f117;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableSortedMap)p0).f76;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29 = (java.lang.Object)((atlas.java.util.WeakHashMap)p0).f41;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29 = (java.lang.Object)((atlas.java.util.Properties)p0).f59;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29 = (java.lang.Object)((atlas.java.util.TreeMap)p0).f61;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedMap)p0).f48;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81 = (java.lang.Object)((atlas.java.util.LinkedHashMap)p0).f58;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81 = (java.lang.Object)((atlas.java.util.IdentityHashMap)p0).f93;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81 = (java.lang.Object)((atlas.java.util.Properties)p0).f54;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29 = (java.lang.Object)((atlas.java.util.Hashtable)p0).f40;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedMap)p0).f24;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81 = (java.lang.Object)((atlas.java.util.HashMap)p0).f37;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81 = (java.lang.Object)((atlas.java.util.Hashtable)p0).f32;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f86;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)p0).f29;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)p0).f3;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)p0).f23;
	}
	public ConcurrentSkipListMap() {
	}
	public K lastKey() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81;
		return (K)r;
	}
	public java.util.concurrent.ConcurrentNavigableMap<K, V> subMap(K p0, K p1) {
		java.util.concurrent.ConcurrentNavigableMap r = null;
		return (java.util.concurrent.ConcurrentNavigableMap<K, V>)r;
	}
	public java.util.concurrent.ConcurrentNavigableMap<K, V> subMap(K p0, boolean p1, K p2, boolean p3) {
		java.util.concurrent.ConcurrentNavigableMap r = null;
		r = new atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap();
		((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)r).f33 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81;
		((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)r).f51 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29;
		return (java.util.concurrent.ConcurrentNavigableMap<K, V>)r;
	}
	public java.util.concurrent.ConcurrentNavigableMap<K, V> headMap(K p0, boolean p1) {
		java.util.concurrent.ConcurrentNavigableMap r = null;
		r = new atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap();
		((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)r).f33 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81;
		((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)r).f51 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29;
		return (java.util.concurrent.ConcurrentNavigableMap<K, V>)r;
	}
	public java.util.concurrent.ConcurrentNavigableMap<K, V> headMap(K p0) {
		java.util.concurrent.ConcurrentNavigableMap r = null;
		return (java.util.concurrent.ConcurrentNavigableMap<K, V>)r;
	}
	public java.util.concurrent.ConcurrentNavigableMap<K, V> tailMap(K p0, boolean p1) {
		java.util.concurrent.ConcurrentNavigableMap r = null;
		r = new atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap();
		((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)r).f33 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81;
		((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)r).f51 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29;
		return (java.util.concurrent.ConcurrentNavigableMap<K, V>)r;
	}
	public java.util.concurrent.ConcurrentNavigableMap<K, V> tailMap(K p0) {
		java.util.concurrent.ConcurrentNavigableMap r = null;
		r = new atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap();
		((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)r).f33 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81;
		((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)r).f51 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29;
		return (java.util.concurrent.ConcurrentNavigableMap<K, V>)r;
	}
	public java.util.concurrent.ConcurrentNavigableMap<K, V> descendingMap() {
		java.util.concurrent.ConcurrentNavigableMap r = null;
		r = new atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap();
		((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)r).f33 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81;
		((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)r).f51 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29;
		return (java.util.concurrent.ConcurrentNavigableMap<K, V>)r;
	}
	public atlas.java.util.Map.Entry<K, V> ceilingEntry(K p0) {
		atlas.java.util.Map.Entry r = null;
		r = new atlas.java.util.AbstractMap.SimpleImmutableEntry();
		((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f68 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29;
		((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f103 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81;
		return (atlas.java.util.Map.Entry<K, V>)r;
	}
	public K ceilingKey(K p0) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81;
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
		((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f68 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29;
		((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f103 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81;
		return (atlas.java.util.Map.Entry<K, V>)r;
	}
	public K floorKey(K p0) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81;
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
		((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f68 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29;
		((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f103 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81;
		return (atlas.java.util.Map.Entry<K, V>)r;
	}
	public atlas.java.util.Map.Entry<K, V> lastEntry() {
		atlas.java.util.Map.Entry r = null;
		r = new atlas.java.util.AbstractMap.SimpleImmutableEntry();
		((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f68 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29;
		((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f103 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81;
		return (atlas.java.util.Map.Entry<K, V>)r;
	}
	public atlas.java.util.Map.Entry<K, V> pollFirstEntry() {
		atlas.java.util.Map.Entry r = null;
		r = new atlas.java.util.AbstractMap.SimpleImmutableEntry();
		((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f68 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29;
		((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f103 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81;
		return (atlas.java.util.Map.Entry<K, V>)r;
	}
	public atlas.java.util.Map.Entry<K, V> pollLastEntry() {
		atlas.java.util.Map.Entry r = null;
		r = new atlas.java.util.AbstractMap.SimpleImmutableEntry();
		((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f68 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29;
		((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f103 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81;
		return (atlas.java.util.Map.Entry<K, V>)r;
	}
	public java.util.NavigableSet<K> navigableKeySet() {
		java.util.NavigableSet r = null;
		r = new atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet();
		((atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet)r).f22 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81;
		return (java.util.NavigableSet<K>)r;
	}
	public java.util.NavigableSet<K> descendingKeySet() {
		java.util.NavigableSet r = null;
		r = new atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet();
		((atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet)r).f22 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81;
		return (java.util.NavigableSet<K>)r;
	}
	public V remove(java.lang.Object p0) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29;
		return (V)r;
	}
	public boolean remove(java.lang.Object p0, java.lang.Object p1) {
		boolean r = false;
		return (boolean)r;
	}
	public V get(java.lang.Object p0) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29;
		return (V)r;
	}
	public V put(K p0, V p1) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81 = (java.lang.Object)p0;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29 = (java.lang.Object)p1;
		return (V)r;
	}
	public boolean equals(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public atlas.java.util.Collection<V> values() {
		atlas.java.util.Collection r = null;
		r = new atlas.java.util.concurrent.ConcurrentSkipListMap.Values();
		((atlas.java.util.concurrent.ConcurrentSkipListMap.Values)r).f130 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29;
		return (atlas.java.util.Collection<V>)r;
	}
	public atlas.java.util.concurrent.ConcurrentSkipListMap<K, V> clone() {
		atlas.java.util.concurrent.ConcurrentSkipListMap r = null;
		r = new atlas.java.util.concurrent.ConcurrentSkipListMap();
		((atlas.java.util.concurrent.ConcurrentSkipListMap)r).f29 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)r).f81 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81;
		return (atlas.java.util.concurrent.ConcurrentSkipListMap<K, V>)r;
	}
	public void clear() {
	}
	public boolean isEmpty() {
		boolean r = false;
		return (boolean)r;
	}
	public boolean replace(K p0, V p1, V p2) {
		boolean r = false;
		return (boolean)r;
	}
	public V replace(K p0, V p1) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29;
		return (V)r;
	}
	public int size() {
		int r = 0;
		return (int)r;
	}
	public java.util.Set<atlas.java.util.Map.Entry<K, V>> entrySet() {
		java.util.Set r = null;
		r = new atlas.java.util.concurrent.ConcurrentSkipListMap.EntrySet();
		((atlas.java.util.concurrent.ConcurrentSkipListMap.EntrySet)r).f56 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29;
		((atlas.java.util.concurrent.ConcurrentSkipListMap.EntrySet)r).f178 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81;
		return (java.util.Set<atlas.java.util.Map.Entry<K, V>>)r;
	}
	public V putIfAbsent(K p0, V p1) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81 = (java.lang.Object)p0;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29 = (java.lang.Object)p1;
		return (V)r;
	}
	public java.util.NavigableSet<K> keySet() {
		java.util.NavigableSet r = null;
		r = new atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet();
		((atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet)r).f22 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81;
		return (java.util.NavigableSet<K>)r;
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
		r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29;
		r = (java.lang.Object)p1;
		return (V)r;
	}
	public java.util.Comparator<? super K> comparator() {
		java.util.Comparator r = null;
		return (java.util.Comparator<? super K>)r;
	}
	public K firstKey() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81;
		return (K)r;
	}
	public static final class EntrySpliterator<K,V> extends atlas.java.util.concurrent.ConcurrentSkipListMap.CSLMSpliterator<K, V> {
		public EntrySpliterator() {
		}
		public int characteristics() {
			int r = 0;
			return (int)r;
		}
		public final java.util.Comparator<atlas.java.util.Map.Entry<K, V>> getComparator() {
			java.util.Comparator r = null;
			return (java.util.Comparator<atlas.java.util.Map.Entry<K, V>>)r;
		}
	}
	public static final class ValueSpliterator<K,V> extends atlas.java.util.concurrent.ConcurrentSkipListMap.CSLMSpliterator<K, V> {
		public ValueSpliterator() {
		}
		public int characteristics() {
			int r = 0;
			return (int)r;
		}
	}
	public static final class KeySpliterator<K,V> extends atlas.java.util.concurrent.ConcurrentSkipListMap.CSLMSpliterator<K, V> {
		public KeySpliterator() {
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
	public abstract static class CSLMSpliterator<K,V> {
		public CSLMSpliterator() {
		}
		public final long estimateSize() {
			long r = 0;
			return (long)r;
		}
	}
	public static final class SubMap<K,V> extends atlas.atlas.java.util.AbstractMap<K, V> implements java.util.concurrent.ConcurrentNavigableMap<K, V>, java.lang.Cloneable, java.io.Serializable {
		public java.lang.Object f33;
		public java.lang.Object f51;
		public SubMap() {
		}
		public K lastKey() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f33;
			return (K)r;
		}
		public atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap<K, V> subMap(K p0, boolean p1, K p2, boolean p3) {
			atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap r = null;
			r = new atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap();
			((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)r).f33 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f33;
			((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)r).f51 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f51;
			return (atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap<K, V>)r;
		}
		public atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap<K, V> subMap(K p0, K p1) {
			atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap r = null;
			return (atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap<K, V>)r;
		}
		public atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap<K, V> headMap(K p0) {
			atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap r = null;
			return (atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap<K, V>)r;
		}
		public atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap<K, V> headMap(K p0, boolean p1) {
			atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap r = null;
			r = new atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap();
			((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)r).f33 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f33;
			((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)r).f51 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f51;
			return (atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap<K, V>)r;
		}
		public atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap<K, V> tailMap(K p0, boolean p1) {
			atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap r = null;
			r = new atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap();
			((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)r).f33 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f33;
			((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)r).f51 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f51;
			return (atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap<K, V>)r;
		}
		public atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap<K, V> tailMap(K p0) {
			atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap r = null;
			r = new atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap();
			((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)r).f33 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f33;
			((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)r).f51 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f51;
			return (atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap<K, V>)r;
		}
		public atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap<K, V> descendingMap() {
			atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap r = null;
			r = new atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap();
			((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)r).f33 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f33;
			((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)r).f51 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f51;
			return (atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap<K, V>)r;
		}
		public atlas.java.util.Map.Entry<K, V> ceilingEntry(K p0) {
			atlas.java.util.Map.Entry r = null;
			r = new atlas.java.util.AbstractMap.SimpleImmutableEntry();
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f68 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f51;
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f103 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f33;
			return (atlas.java.util.Map.Entry<K, V>)r;
		}
		public K ceilingKey(K p0) {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f33;
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
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f68 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f51;
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f103 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f33;
			return (atlas.java.util.Map.Entry<K, V>)r;
		}
		public K floorKey(K p0) {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f33;
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
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f68 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f51;
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f103 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f33;
			return (atlas.java.util.Map.Entry<K, V>)r;
		}
		public atlas.java.util.Map.Entry<K, V> lastEntry() {
			atlas.java.util.Map.Entry r = null;
			r = new atlas.java.util.AbstractMap.SimpleImmutableEntry();
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f68 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f51;
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f103 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f33;
			return (atlas.java.util.Map.Entry<K, V>)r;
		}
		public atlas.java.util.Map.Entry<K, V> pollFirstEntry() {
			atlas.java.util.Map.Entry r = null;
			r = new atlas.java.util.AbstractMap.SimpleImmutableEntry();
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f68 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f51;
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f103 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f33;
			return (atlas.java.util.Map.Entry<K, V>)r;
		}
		public atlas.java.util.Map.Entry<K, V> pollLastEntry() {
			atlas.java.util.Map.Entry r = null;
			r = new atlas.java.util.AbstractMap.SimpleImmutableEntry();
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f68 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f51;
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f103 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f33;
			return (atlas.java.util.Map.Entry<K, V>)r;
		}
		public java.util.NavigableSet<K> navigableKeySet() {
			java.util.NavigableSet r = null;
			r = new atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet();
			((atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet)r).f22 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f33;
			return (java.util.NavigableSet<K>)r;
		}
		public java.util.NavigableSet<K> descendingKeySet() {
			java.util.NavigableSet r = null;
			r = new atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet();
			((atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet)r).f22 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f33;
			return (java.util.NavigableSet<K>)r;
		}
		public boolean remove(java.lang.Object p0, java.lang.Object p1) {
			boolean r = false;
			return (boolean)r;
		}
		public V remove(java.lang.Object p0) {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f51;
			return (V)r;
		}
		public V get(java.lang.Object p0) {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f51;
			return (V)r;
		}
		public V put(K p0, V p1) {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f51;
			return (V)r;
		}
		public atlas.java.util.Collection<V> values() {
			atlas.java.util.Collection r = null;
			r = new atlas.java.util.concurrent.ConcurrentSkipListMap.Values();
			((atlas.java.util.concurrent.ConcurrentSkipListMap.Values)r).f130 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f51;
			return (atlas.java.util.Collection<V>)r;
		}
		public void clear() {
		}
		public boolean isEmpty() {
			boolean r = false;
			return (boolean)r;
		}
		public V replace(K p0, V p1) {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f51;
			return (V)r;
		}
		public boolean replace(K p0, V p1, V p2) {
			boolean r = false;
			return (boolean)r;
		}
		public int size() {
			int r = 0;
			return (int)r;
		}
		public java.util.Set<atlas.java.util.Map.Entry<K, V>> entrySet() {
			java.util.Set r = null;
			return (java.util.Set<atlas.java.util.Map.Entry<K, V>>)r;
		}
		public V putIfAbsent(K p0, V p1) {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f51;
			return (V)r;
		}
		public java.util.NavigableSet<K> keySet() {
			java.util.NavigableSet r = null;
			r = new atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet();
			((atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet)r).f22 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f33;
			return (java.util.NavigableSet<K>)r;
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
			r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)this).f33;
			return (K)r;
		}
		public final class SubMapEntryIterator extends atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap<K, V>.SubMapIter<atlas.java.util.Map.Entry<K, V>> {
			SubMapEntryIterator(atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap p0) {
			}
			public SubMapEntryIterator() {
			}
			public int characteristics() {
				int r = 0;
				return (int)r;
			}
			public atlas.java.util.Map.Entry<K, V> next() {
				atlas.java.util.Map.Entry r = null;
				return (atlas.java.util.Map.Entry<K, V>)r;
			}
		}
		public final class SubMapKeyIterator extends atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap<K, V>.SubMapIter<K> {
			public java.lang.Object f106;
			SubMapKeyIterator(atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap p0) {
			}
			public SubMapKeyIterator() {
			}
			public int characteristics() {
				int r = 0;
				return (int)r;
			}
			public final java.util.Comparator<? super K> getComparator() {
				java.util.Comparator r = null;
				return (java.util.Comparator<? super K>)r;
			}
			public K next() {
				java.lang.Object r = null;
				r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap.SubMapKeyIterator)this).f106;
				return (K)r;
			}
		}
		public final class SubMapValueIterator extends atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap<K, V>.SubMapIter<V> {
			public java.lang.Object f47;
			SubMapValueIterator(atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap p0) {
			}
			public SubMapValueIterator() {
			}
			public int characteristics() {
				int r = 0;
				return (int)r;
			}
			public V next() {
				java.lang.Object r = null;
				r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap.SubMapValueIterator)this).f47;
				return (V)r;
			}
		}
		public abstract class SubMapIter<T> implements atlas.java.util.Iterator<T> {
			SubMapIter(atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap p0) {
			}
			public SubMapIter() {
			}
			public long estimateSize() {
				long r = 0;
				return (long)r;
			}
			public void remove() {
			}
			public final boolean hasNext() {
				boolean r = false;
				return (boolean)r;
			}
		}
	}
	public static final class EntrySet<K1,V1> extends atlas.java.util.AbstractSet<atlas.java.util.Map.Entry<K1, V1>> {
		public java.lang.Object f178;
		public java.lang.Object f56;
		EntrySet(java.util.concurrent.ConcurrentNavigableMap<K1, V1> p0) {
		}
		public EntrySet() {
		}
		public boolean remove(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public boolean equals(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public void clear() {
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
		public <T> T[] toArray(T[] p0) {
			java.lang.Object[] r = null;
			return (T[])r;
		}
		public java.lang.Object[] toArray() {
			java.lang.Object[] r = null;
			return (java.lang.Object[])r;
		}
		public atlas.java.util.Iterator<atlas.java.util.Map.Entry<K1, V1>> iterator() {
			atlas.java.util.Iterator r = null;
			r = new atlas.java.util.concurrent.ConcurrentSkipListMap.EntryIterator();
			((atlas.java.util.concurrent.ConcurrentSkipListMap.EntryIterator)r).f163 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.EntrySet)this).f56;
			((atlas.java.util.concurrent.ConcurrentSkipListMap.EntryIterator)r).f173 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.EntrySet)this).f178;
			return (atlas.java.util.Iterator<atlas.java.util.Map.Entry<K1, V1>>)r;
		}
	}
	public static final class Values<E> extends atlas.atlas.java.util.AbstractCollection<E> {
		public java.lang.Object f130;
		Values(java.util.concurrent.ConcurrentNavigableMap<?, E> p0) {
		}
		public Values() {
		}
		public void clear() {
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
		public <T> T[] toArray(T[] p0) {
			java.lang.Object[] r = null;
			return (T[])r;
		}
		public java.lang.Object[] toArray() {
			java.lang.Object[] r = null;
			return (java.lang.Object[])r;
		}
		public atlas.java.util.Iterator<E> iterator() {
			atlas.java.util.Iterator r = null;
			r = new atlas.java.util.concurrent.ConcurrentSkipListMap.ValueIterator();
			r = new atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap.SubMapValueIterator();
			((atlas.java.util.concurrent.ConcurrentSkipListMap.ValueIterator)r).f166 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.Values)this).f130;
			((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap.SubMapValueIterator)r).f47 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.Values)this).f130;
			return (atlas.java.util.Iterator<E>)r;
		}
	}
	public static final class KeySet<E> extends atlas.java.util.AbstractSet<E> implements java.util.NavigableSet<E> {
		public java.lang.Object f22;
		KeySet(java.util.concurrent.ConcurrentNavigableMap<E, ?> p0) {
		}
		public KeySet() {
		}
		public java.util.NavigableSet<E> subSet(E p0, boolean p1, E p2, boolean p3) {
			java.util.NavigableSet r = null;
			r = new atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet();
			((atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet)r).f22 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet)this).f22;
			return (java.util.NavigableSet<E>)r;
		}
		public java.util.NavigableSet<E> subSet(E p0, E p1) {
			java.util.NavigableSet r = null;
			return (java.util.NavigableSet<E>)r;
		}
		public java.util.NavigableSet<E> headSet(E p0) {
			java.util.NavigableSet r = null;
			return (java.util.NavigableSet<E>)r;
		}
		public java.util.NavigableSet<E> headSet(E p0, boolean p1) {
			java.util.NavigableSet r = null;
			r = new atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet();
			((atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet)r).f22 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet)this).f22;
			return (java.util.NavigableSet<E>)r;
		}
		public java.util.NavigableSet<E> tailSet(E p0, boolean p1) {
			java.util.NavigableSet r = null;
			r = new atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet();
			((atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet)r).f22 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet)this).f22;
			return (java.util.NavigableSet<E>)r;
		}
		public java.util.NavigableSet<E> tailSet(E p0) {
			java.util.NavigableSet r = null;
			r = new atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet();
			((atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet)r).f22 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet)this).f22;
			return (java.util.NavigableSet<E>)r;
		}
		public E pollFirst() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet)this).f22;
			return (E)r;
		}
		public E pollLast() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet)this).f22;
			return (E)r;
		}
		public atlas.java.util.Iterator<E> descendingIterator() {
			atlas.java.util.Iterator r = null;
			r = new atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap.SubMapKeyIterator();
			((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap.SubMapKeyIterator)r).f106 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet)this).f22;
			return (atlas.java.util.Iterator<E>)r;
		}
		public E ceiling(E p0) {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet)this).f22;
			return (E)r;
		}
		public E higher(E p0) {
			java.lang.Object r = null;
			return (E)r;
		}
		public java.util.NavigableSet<E> descendingSet() {
			java.util.NavigableSet r = null;
			r = new atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet();
			((atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet)r).f22 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet)this).f22;
			return (java.util.NavigableSet<E>)r;
		}
		public boolean remove(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public boolean equals(java.lang.Object p0) {
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
			r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet)this).f22;
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
		public java.lang.Object[] toArray() {
			java.lang.Object[] r = null;
			return (java.lang.Object[])r;
		}
		public <T> T[] toArray(T[] p0) {
			java.lang.Object[] r = null;
			return (T[])r;
		}
		public atlas.java.util.Iterator<E> iterator() {
			atlas.java.util.Iterator r = null;
			r = new atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap.SubMapKeyIterator();
			r = new atlas.java.util.concurrent.ConcurrentSkipListMap.KeyIterator();
			((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap.SubMapKeyIterator)r).f106 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet)this).f22;
			((atlas.java.util.concurrent.ConcurrentSkipListMap.KeyIterator)r).f175 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet)this).f22;
			return (atlas.java.util.Iterator<E>)r;
		}
		public E last() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet)this).f22;
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
			r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet)this).f22;
			return (E)r;
		}
	}
	public final class EntryIterator extends atlas.java.util.concurrent.ConcurrentSkipListMap<K, V>.Iter<atlas.java.util.Map.Entry<K, V>> {
		public java.lang.Object f163;
		public java.lang.Object f173;
		EntryIterator(atlas.java.util.concurrent.ConcurrentSkipListMap p0) {
		}
		public EntryIterator() {
		}
		public atlas.java.util.Map.Entry<K, V> next() {
			atlas.java.util.Map.Entry r = null;
			r = new atlas.java.util.AbstractMap.SimpleImmutableEntry();
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f68 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.EntryIterator)this).f163;
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)r).f103 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.EntryIterator)this).f173;
			return (atlas.java.util.Map.Entry<K, V>)r;
		}
	}
	public final class KeyIterator extends atlas.java.util.concurrent.ConcurrentSkipListMap<K, V>.Iter<K> {
		public java.lang.Object f175;
		KeyIterator(atlas.java.util.concurrent.ConcurrentSkipListMap p0) {
		}
		public KeyIterator() {
		}
		public K next() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.KeyIterator)this).f175;
			return (K)r;
		}
	}
	public final class ValueIterator extends atlas.java.util.concurrent.ConcurrentSkipListMap<K, V>.Iter<V> {
		public java.lang.Object f166;
		ValueIterator(atlas.java.util.concurrent.ConcurrentSkipListMap p0) {
		}
		public ValueIterator() {
		}
		public V next() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.ValueIterator)this).f166;
			return (V)r;
		}
	}
	public abstract class Iter<T> implements atlas.java.util.Iterator<T> {
		Iter(atlas.java.util.concurrent.ConcurrentSkipListMap p0) {
		}
		public Iter() {
		}
		public void remove() {
		}
		public final boolean hasNext() {
			boolean r = false;
			return (boolean)r;
		}
	}
	public static final class HeadIndex<K,V> extends atlas.java.util.concurrent.ConcurrentSkipListMap.Index<K, V> {
		public HeadIndex() {
		}
	}
	public static class Index<K,V> {
		Index(atlas.java.util.concurrent.ConcurrentSkipListMap.Node<K, V> p0, atlas.java.util.concurrent.ConcurrentSkipListMap.Index<K, V> p1, atlas.java.util.concurrent.ConcurrentSkipListMap.Index<K, V> p2) {
		}
		public Index() {
		}
	}
	public static final class Node<K,V> {
		Node(K p0, java.lang.Object p1, atlas.java.util.concurrent.ConcurrentSkipListMap.Node<K, V> p2) {
		}
		Node(atlas.java.util.concurrent.ConcurrentSkipListMap.Node<K, V> p0) {
		}
		public Node() {
		}
	}
}
