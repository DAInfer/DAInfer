package atlas.java.util;
public class HashMap<K,V> extends atlas.atlas.java.util.AbstractMap<K, V> implements atlas.java.util.Map<K, V>, java.lang.Cloneable, java.io.Serializable {
	public java.lang.Object f0;
	public java.lang.Object f37;
	public HashMap(atlas.java.util.Map<? extends K, ? extends V> p0) {
		((atlas.java.util.HashMap)this).f0 = (java.lang.Object)((atlas.java.util.HashMap)p0).f0;
		((atlas.java.util.HashMap)this).f37 = (java.lang.Object)((atlas.java.util.HashMap)p0).f37;
		((atlas.java.util.HashMap)this).f0 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)p0).f29;
		((atlas.java.util.HashMap)this).f0 = (java.lang.Object)((atlas.java.util.LinkedHashMap)p0).f46;
		((atlas.java.util.HashMap)this).f37 = (java.lang.Object)((atlas.java.util.TreeMap)p0).f5;
		((atlas.java.util.HashMap)this).f0 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableMap)p0).f55;
		((atlas.java.util.HashMap)this).f0 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f45;
		((atlas.java.util.HashMap)this).f0 = (java.lang.Object)((atlas.java.util.TreeMap)p0).f61;
		((atlas.java.util.HashMap)this).f0 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedMap)p0).f48;
		((atlas.java.util.HashMap)this).f0 = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)p0).f60;
		((atlas.java.util.HashMap)this).f37 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f86;
		((atlas.java.util.HashMap)this).f37 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)p0).f81;
		((atlas.java.util.HashMap)this).f0 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)p0).f3;
		((atlas.java.util.HashMap)this).f0 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedSortedMap)p0).f123;
		((atlas.java.util.HashMap)this).f0 = (java.lang.Object)((atlas.java.util.Properties)p0).f59;
		((atlas.java.util.HashMap)this).f37 = (java.lang.Object)((atlas.java.util.IdentityHashMap)p0).f93;
		((atlas.java.util.HashMap)this).f0 = (java.lang.Object)((atlas.java.util.IdentityHashMap)p0).f50;
		((atlas.java.util.HashMap)this).f0 = (java.lang.Object)((atlas.java.util.Hashtable)p0).f40;
		((atlas.java.util.HashMap)this).f37 = (java.lang.Object)((atlas.java.util.LinkedHashMap)p0).f58;
		((atlas.java.util.HashMap)this).f0 = (java.lang.Object)((atlas.java.util.WeakHashMap)p0).f41;
	}
	public HashMap() {
	}
	public V remove(java.lang.Object p0) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.HashMap)this).f0;
		r = (java.lang.Object)((atlas.java.util.LinkedHashMap)this).f46;
		return (V)r;
	}
	public boolean remove(java.lang.Object p0, java.lang.Object p1) {
		boolean r = false;
		return (boolean)r;
	}
	public V get(java.lang.Object p0) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.HashMap)this).f0;
		return (V)r;
	}
	public V put(K p0, V p1) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.HashMap)this).f0;
		((atlas.java.util.HashMap)this).f0 = (java.lang.Object)p1;
		((atlas.java.util.HashMap)this).f37 = (java.lang.Object)p0;
		r = (java.lang.Object)((atlas.java.util.LinkedHashMap)this).f46;
		((atlas.java.util.LinkedHashMap)this).f58 = (java.lang.Object)p0;
		((atlas.java.util.LinkedHashMap)this).f46 = (java.lang.Object)p1;
		return (V)r;
	}
	public atlas.java.util.Collection<V> values() {
		atlas.java.util.Collection r = null;
		r = new atlas.java.util.HashMap.Values();
		((atlas.java.util.HashMap.Values)r).f38 = (java.lang.Object)((atlas.java.util.HashMap)this).f0;
		return (atlas.java.util.Collection<V>)r;
	}
	public java.lang.Object clone() {
		java.lang.Object r = null;
		r = new atlas.java.util.HashMap();
		r = new atlas.java.util.LinkedHashMap();
		((atlas.java.util.HashMap)r).f0 = (java.lang.Object)((atlas.java.util.HashMap)this).f0;
		((atlas.java.util.HashMap)r).f37 = (java.lang.Object)((atlas.java.util.HashMap)this).f37;
		((atlas.java.util.LinkedHashMap)r).f46 = (java.lang.Object)((atlas.java.util.LinkedHashMap)this).f46;
		((atlas.java.util.LinkedHashMap)r).f58 = (java.lang.Object)((atlas.java.util.LinkedHashMap)this).f58;
		return (java.lang.Object)r;
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
		r = (java.lang.Object)((atlas.java.util.HashMap)this).f0;
		r = (java.lang.Object)((atlas.java.util.LinkedHashMap)this).f46;
		return (V)r;
	}
	public int size() {
		int r = 0;
		return (int)r;
	}
	public java.util.Set<atlas.java.util.Map.Entry<K, V>> entrySet() {
		java.util.Set r = null;
		r = new atlas.java.util.HashMap.EntrySet();
		((atlas.java.util.HashMap.EntrySet)r).f71 = (java.lang.Object)((atlas.java.util.HashMap)this).f0;
		((atlas.java.util.HashMap.EntrySet)r).f153 = (java.lang.Object)((atlas.java.util.HashMap)this).f37;
		return (java.util.Set<atlas.java.util.Map.Entry<K, V>>)r;
	}
	public void putAll(atlas.java.util.Map<? extends K, ? extends V> p0) {
		((atlas.java.util.HashMap)this).f0 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f45;
		((atlas.java.util.HashMap)this).f0 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)p0).f3;
		((atlas.java.util.HashMap)this).f0 = (java.lang.Object)((atlas.java.util.IdentityHashMap)p0).f50;
		((atlas.java.util.HashMap)this).f0 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)p0).f51;
		((atlas.java.util.LinkedHashMap)this).f58 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f86;
		((atlas.java.util.LinkedHashMap)this).f46 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f45;
		((atlas.java.util.LinkedHashMap)this).f46 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)p0).f3;
		((atlas.java.util.LinkedHashMap)this).f46 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedMap)p0).f48;
		((atlas.java.util.LinkedHashMap)this).f58 = (java.lang.Object)((atlas.java.util.Hashtable)p0).f32;
		((atlas.java.util.LinkedHashMap)this).f46 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)p0).f51;
		((atlas.java.util.HashMap)this).f0 = (java.lang.Object)((atlas.java.util.Properties)p0).f59;
		((atlas.java.util.HashMap)this).f37 = (java.lang.Object)((atlas.java.util.HashMap)p0).f37;
		((atlas.java.util.LinkedHashMap)this).f58 = (java.lang.Object)((atlas.java.util.HashMap)p0).f37;
		((atlas.java.util.LinkedHashMap)this).f46 = (java.lang.Object)((atlas.java.util.WeakHashMap)p0).f41;
		((atlas.java.util.LinkedHashMap)this).f46 = (java.lang.Object)((atlas.java.util.Hashtable)p0).f40;
		((atlas.java.util.HashMap)this).f37 = (java.lang.Object)((atlas.java.util.Hashtable)p0).f32;
		((atlas.java.util.HashMap)this).f37 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f86;
		((atlas.java.util.HashMap)this).f37 = (java.lang.Object)((atlas.java.util.Properties)p0).f54;
		((atlas.java.util.LinkedHashMap)this).f46 = (java.lang.Object)((atlas.java.util.HashMap)p0).f0;
		((atlas.java.util.LinkedHashMap)this).f46 = (java.lang.Object)((atlas.java.util.IdentityHashMap)p0).f50;
		((atlas.java.util.LinkedHashMap)this).f46 = (java.lang.Object)((atlas.java.util.LinkedHashMap)p0).f46;
		((atlas.java.util.HashMap)this).f0 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableMap)p0).f55;
		((atlas.java.util.LinkedHashMap)this).f58 = (java.lang.Object)((atlas.java.util.LinkedHashMap)p0).f58;
		((atlas.java.util.LinkedHashMap)this).f46 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableMap)p0).f55;
		((atlas.java.util.LinkedHashMap)this).f46 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedNavigableMap)p0).f6;
		((atlas.java.util.LinkedHashMap)this).f46 = (java.lang.Object)((atlas.java.util.TreeMap)p0).f61;
		((atlas.java.util.LinkedHashMap)this).f46 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)p0).f29;
		((atlas.java.util.HashMap)this).f0 = (java.lang.Object)((atlas.java.util.Hashtable)p0).f40;
		((atlas.java.util.HashMap)this).f0 = (java.lang.Object)((atlas.java.util.WeakHashMap)p0).f41;
		((atlas.java.util.HashMap)this).f0 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedMap)p0).f48;
		((atlas.java.util.HashMap)this).f0 = (java.lang.Object)((atlas.java.util.TreeMap)p0).f61;
		((atlas.java.util.HashMap)this).f0 = (java.lang.Object)((atlas.java.util.HashMap)p0).f0;
		((atlas.java.util.HashMap)this).f0 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)p0).f29;
		((atlas.java.util.HashMap)this).f0 = (java.lang.Object)((atlas.java.util.LinkedHashMap)p0).f46;
		((atlas.java.util.LinkedHashMap)this).f46 = (java.lang.Object)((atlas.java.util.Properties)p0).f59;
	}
	public V putIfAbsent(K p0, V p1) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.HashMap)this).f0;
		((atlas.java.util.HashMap)this).f0 = (java.lang.Object)p1;
		((atlas.java.util.HashMap)this).f37 = (java.lang.Object)p0;
		r = (java.lang.Object)((atlas.java.util.LinkedHashMap)this).f46;
		((atlas.java.util.LinkedHashMap)this).f58 = (java.lang.Object)p0;
		((atlas.java.util.LinkedHashMap)this).f46 = (java.lang.Object)p1;
		return (V)r;
	}
	public java.util.Set<K> keySet() {
		java.util.Set r = null;
		r = new atlas.java.util.HashMap.KeySet();
		((atlas.java.util.HashMap.KeySet)r).f78 = (java.lang.Object)((atlas.java.util.HashMap)this).f37;
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
	public V getOrDefault(java.lang.Object p0, V p1) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.HashMap)this).f0;
		r = (java.lang.Object)p1;
		return (V)r;
	}
	public static final class TreeNode<K,V> extends atlas.atlas.java.util.LinkedHashMap.Entry<K, V> {
		public TreeNode() {
		}
	}
	public static final class EntrySpliterator<K,V> extends atlas.atlas.java.util.HashMap.HashMapSpliterator<K, V> {
		public EntrySpliterator() {
		}
		public atlas.atlas.java.util.HashMap.EntrySpliterator<K, V> trySplit() {
			atlas.java.util.HashMap.EntrySpliterator r = null;
			return (atlas.atlas.java.util.HashMap.EntrySpliterator<K, V>)r;
		}
		public int characteristics() {
			int r = 0;
			return (int)r;
		}
	}
	public static final class ValueSpliterator<K,V> extends atlas.atlas.java.util.HashMap.HashMapSpliterator<K, V> {
		public ValueSpliterator() {
		}
		public atlas.atlas.java.util.HashMap.ValueSpliterator<K, V> trySplit() {
			atlas.java.util.HashMap.ValueSpliterator r = null;
			return (atlas.atlas.java.util.HashMap.ValueSpliterator<K, V>)r;
		}
		public int characteristics() {
			int r = 0;
			return (int)r;
		}
	}
	public static final class KeySpliterator<K,V> extends atlas.atlas.java.util.HashMap.HashMapSpliterator<K, V> {
		public KeySpliterator() {
		}
		public atlas.atlas.java.util.HashMap.KeySpliterator<K, V> trySplit() {
			atlas.java.util.HashMap.KeySpliterator r = null;
			return (atlas.atlas.java.util.HashMap.KeySpliterator<K, V>)r;
		}
		public int characteristics() {
			int r = 0;
			return (int)r;
		}
	}
	public static class HashMapSpliterator<K,V> {
		public HashMapSpliterator() {
		}
		public final long estimateSize() {
			long r = 0;
			return (long)r;
		}
	}
	public final class EntryIterator extends atlas.atlas.java.util.HashMap<K, V>.HashIterator implements atlas.java.util.Iterator<atlas.java.util.Map.Entry<K, V>> {
		public java.lang.Object f75;
		public java.lang.Object f30;
		EntryIterator(atlas.atlas.java.util.HashMap p0) {
		}
		public EntryIterator() {
		}
		public final atlas.java.util.Map.Entry<K, V> next() {
			atlas.java.util.Map.Entry r = null;
			r = new atlas.java.util.HashMap.Node();
			((atlas.java.util.HashMap.Node)r).f154 = (java.lang.Object)((atlas.java.util.HashMap.EntryIterator)this).f30;
			((atlas.java.util.HashMap.Node)r).f143 = (java.lang.Object)((atlas.java.util.HashMap.EntryIterator)this).f75;
			return (atlas.java.util.Map.Entry<K, V>)r;
		}
	}
	public final class ValueIterator extends atlas.atlas.java.util.HashMap<K, V>.HashIterator implements atlas.java.util.Iterator<V> {
		public java.lang.Object f152;
		ValueIterator(atlas.atlas.java.util.HashMap p0) {
		}
		public ValueIterator() {
		}
		public final V next() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.HashMap.ValueIterator)this).f152;
			return (V)r;
		}
	}
	public final class KeyIterator extends atlas.atlas.java.util.HashMap<K, V>.HashIterator implements atlas.java.util.Iterator<K> {
		public java.lang.Object f167;
		KeyIterator(atlas.atlas.java.util.HashMap p0) {
		}
		public KeyIterator() {
		}
		public final K next() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.HashMap.KeyIterator)this).f167;
			return (K)r;
		}
	}
	public abstract class HashIterator {
		HashIterator(atlas.atlas.java.util.HashMap p0) {
		}
		public HashIterator() {
		}
		public final void remove() {
		}
		public final boolean hasNext() {
			boolean r = false;
			return (boolean)r;
		}
	}
	public static final class UnsafeHolder {
		public UnsafeHolder() {
		}
	}
	public final class EntrySet extends atlas.java.util.AbstractSet<atlas.java.util.Map.Entry<K, V>> {
		public java.lang.Object f71;
		public java.lang.Object f153;
		EntrySet(atlas.atlas.java.util.HashMap p0) {
		}
		public EntrySet() {
		}
		public final boolean remove(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public final void clear() {
		}
		public final boolean contains(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public final int size() {
			int r = 0;
			return (int)r;
		}
		public final atlas.java.util.Iterator<atlas.java.util.Map.Entry<K, V>> iterator() {
			atlas.java.util.Iterator r = null;
			r = new atlas.java.util.HashMap.EntryIterator();
			((atlas.java.util.HashMap.EntryIterator)r).f30 = (java.lang.Object)((atlas.java.util.HashMap.EntrySet)this).f153;
			((atlas.java.util.HashMap.EntryIterator)r).f75 = (java.lang.Object)((atlas.java.util.HashMap.EntrySet)this).f71;
			return (atlas.java.util.Iterator<atlas.java.util.Map.Entry<K, V>>)r;
		}
	}
	public final class Values extends atlas.atlas.java.util.AbstractCollection<V> {
		public java.lang.Object f38;
		Values(atlas.atlas.java.util.HashMap p0) {
		}
		public Values() {
		}
		public final void clear() {
		}
		public final boolean contains(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public final int size() {
			int r = 0;
			return (int)r;
		}
		public final atlas.java.util.Iterator<V> iterator() {
			atlas.java.util.Iterator r = null;
			r = new atlas.java.util.HashMap.ValueIterator();
			((atlas.java.util.HashMap.ValueIterator)r).f152 = (java.lang.Object)((atlas.java.util.HashMap.Values)this).f38;
			return (atlas.java.util.Iterator<V>)r;
		}
	}
	public final class KeySet extends atlas.java.util.AbstractSet<K> {
		public java.lang.Object f78;
		KeySet(atlas.atlas.java.util.HashMap p0) {
		}
		public KeySet() {
		}
		public final boolean remove(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public final void clear() {
		}
		public final boolean contains(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public final int size() {
			int r = 0;
			return (int)r;
		}
		public final atlas.java.util.Iterator<K> iterator() {
			atlas.java.util.Iterator r = null;
			r = new atlas.java.util.HashMap.KeyIterator();
			((atlas.java.util.HashMap.KeyIterator)r).f167 = (java.lang.Object)((atlas.java.util.HashMap.KeySet)this).f78;
			return (atlas.java.util.Iterator<K>)r;
		}
	}
	public static class Node<K,V> implements atlas.java.util.Map.Entry<K, V> {
		public java.lang.Object f154;
		public java.lang.Object f143;
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
			r = (java.lang.Object)((atlas.java.util.LinkedHashMap.Entry)this).f13;
			return (V)r;
		}
		public final K getKey() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.LinkedHashMap.Entry)this).f16;
			r = (java.lang.Object)((atlas.java.util.HashMap.Node)this).f154;
			return (K)r;
		}
		public final V setValue(V p0) {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.LinkedHashMap.Entry)this).f13;
			r = (java.lang.Object)((atlas.java.util.HashMap.Node)this).f143;
			return (V)r;
		}
	}
}
