package atlas.java.util;
public class WeakHashMap<K,V> extends atlas.atlas.java.util.AbstractMap<K, V> implements atlas.java.util.Map<K, V> {
	public java.lang.Object f41;
	public java.lang.Object f25;
	public WeakHashMap(atlas.java.util.Map<? extends K, ? extends V> p0) {
		((atlas.java.util.WeakHashMap)this).f41 = (java.lang.Object)((atlas.java.util.Hashtable)p0).f40;
		((atlas.java.util.WeakHashMap)this).f25 = (java.lang.Object)((atlas.java.util.Properties)p0).f54;
		((atlas.java.util.WeakHashMap)this).f25 = (java.lang.Object)((atlas.java.util.IdentityHashMap)p0).f93;
		((atlas.java.util.WeakHashMap)this).f25 = (java.lang.Object)((atlas.java.util.HashMap)p0).f37;
		((atlas.java.util.WeakHashMap)this).f41 = (java.lang.Object)((atlas.java.util.TreeMap)p0).f61;
		((atlas.java.util.WeakHashMap)this).f25 = (java.lang.Object)((atlas.java.util.Hashtable)p0).f32;
		((atlas.java.util.WeakHashMap)this).f25 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f86;
		((atlas.java.util.WeakHashMap)this).f25 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)p0).f23;
		((atlas.java.util.WeakHashMap)this).f41 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)p0).f29;
		((atlas.java.util.WeakHashMap)this).f41 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedMap)p0).f48;
		((atlas.java.util.WeakHashMap)this).f41 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableMap)p0).f55;
		((atlas.java.util.WeakHashMap)this).f41 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)p0).f3;
		((atlas.java.util.WeakHashMap)this).f41 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f45;
		((atlas.java.util.WeakHashMap)this).f41 = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)p0).f60;
		((atlas.java.util.WeakHashMap)this).f25 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedMap)p0).f24;
		((atlas.java.util.WeakHashMap)this).f41 = (java.lang.Object)((atlas.java.util.IdentityHashMap)p0).f50;
		((atlas.java.util.WeakHashMap)this).f41 = (java.lang.Object)((atlas.java.util.Properties)p0).f59;
		((atlas.java.util.WeakHashMap)this).f25 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableNavigableMap)p0).f110;
		((atlas.java.util.WeakHashMap)this).f41 = (java.lang.Object)((atlas.java.util.LinkedHashMap)p0).f46;
		((atlas.java.util.WeakHashMap)this).f41 = (java.lang.Object)((atlas.java.util.HashMap)p0).f0;
		((atlas.java.util.WeakHashMap)this).f25 = (java.lang.Object)((atlas.java.util.WeakHashMap)p0).f25;
		((atlas.java.util.WeakHashMap)this).f41 = (java.lang.Object)((atlas.java.util.WeakHashMap)p0).f41;
	}
	public WeakHashMap() {
	}
	public V remove(java.lang.Object p0) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.WeakHashMap)this).f41;
		return (V)r;
	}
	public V get(java.lang.Object p0) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.WeakHashMap)this).f41;
		return (V)r;
	}
	public V put(K p0, V p1) {
		java.lang.Object r = null;
		((atlas.java.util.WeakHashMap)this).f41 = (java.lang.Object)p1;
		r = (java.lang.Object)((atlas.java.util.WeakHashMap)this).f41;
		((atlas.java.util.WeakHashMap)this).f25 = (java.lang.Object)p0;
		return (V)r;
	}
	public atlas.java.util.Collection<V> values() {
		atlas.java.util.Collection r = null;
		r = new atlas.java.util.WeakHashMap.Values();
		((atlas.java.util.WeakHashMap.Values)r).f133 = (java.lang.Object)((atlas.java.util.WeakHashMap)this).f41;
		return (atlas.java.util.Collection<V>)r;
	}
	public void clear() {
	}
	public boolean isEmpty() {
		boolean r = false;
		return (boolean)r;
	}
	public int size() {
		int r = 0;
		return (int)r;
	}
	public java.util.Set<atlas.java.util.Map.Entry<K, V>> entrySet() {
		java.util.Set r = null;
		r = new atlas.java.util.WeakHashMap.EntrySet();
		((atlas.java.util.WeakHashMap.EntrySet)r).f127 = (java.lang.Object)((atlas.java.util.WeakHashMap)this).f41;
		((atlas.java.util.WeakHashMap.EntrySet)r).f157 = (java.lang.Object)((atlas.java.util.WeakHashMap)this).f25;
		return (java.util.Set<atlas.java.util.Map.Entry<K, V>>)r;
	}
	public void putAll(atlas.java.util.Map<? extends K, ? extends V> p0) {
		((atlas.java.util.WeakHashMap)this).f41 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableMap)p0).f55;
		((atlas.java.util.WeakHashMap)this).f41 = (java.lang.Object)((atlas.java.util.LinkedHashMap)p0).f46;
		((atlas.java.util.WeakHashMap)this).f41 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)p0).f29;
		((atlas.java.util.WeakHashMap)this).f41 = (java.lang.Object)((atlas.java.util.IdentityHashMap)p0).f50;
		((atlas.java.util.WeakHashMap)this).f41 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)p0).f3;
		((atlas.java.util.WeakHashMap)this).f25 = (java.lang.Object)((atlas.java.util.Hashtable)p0).f32;
		((atlas.java.util.WeakHashMap)this).f25 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f86;
		((atlas.java.util.WeakHashMap)this).f41 = (java.lang.Object)((atlas.java.util.HashMap)p0).f0;
		((atlas.java.util.WeakHashMap)this).f41 = (java.lang.Object)((atlas.java.util.Hashtable)p0).f40;
		((atlas.java.util.WeakHashMap)this).f25 = (java.lang.Object)((atlas.java.util.WeakHashMap)p0).f25;
		((atlas.java.util.WeakHashMap)this).f41 = (java.lang.Object)((atlas.java.util.WeakHashMap)p0).f41;
		((atlas.java.util.WeakHashMap)this).f41 = (java.lang.Object)((atlas.java.util.Properties)p0).f59;
		((atlas.java.util.WeakHashMap)this).f41 = (java.lang.Object)((atlas.java.util.TreeMap)p0).f61;
		((atlas.java.util.WeakHashMap)this).f41 = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)p0).f60;
		((atlas.java.util.WeakHashMap)this).f41 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f45;
		((atlas.java.util.WeakHashMap)this).f41 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedMap)p0).f48;
	}
	public java.util.Set<K> keySet() {
		java.util.Set r = null;
		r = new atlas.java.util.WeakHashMap.KeySet();
		((atlas.java.util.WeakHashMap.KeySet)r).f128 = (java.lang.Object)((atlas.java.util.WeakHashMap)this).f25;
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
	public static final class EntrySpliterator<K,V> extends atlas.java.util.WeakHashMap.WeakHashMapSpliterator<K, V> {
		public EntrySpliterator() {
		}
		public atlas.java.util.WeakHashMap.EntrySpliterator<K, V> trySplit() {
			atlas.java.util.WeakHashMap.EntrySpliterator r = null;
			return (atlas.java.util.WeakHashMap.EntrySpliterator<K, V>)r;
		}
		public int characteristics() {
			int r = 0;
			return (int)r;
		}
	}
	public static final class ValueSpliterator<K,V> extends atlas.java.util.WeakHashMap.WeakHashMapSpliterator<K, V> {
		public ValueSpliterator() {
		}
		public atlas.java.util.WeakHashMap.ValueSpliterator<K, V> trySplit() {
			atlas.java.util.WeakHashMap.ValueSpliterator r = null;
			return (atlas.java.util.WeakHashMap.ValueSpliterator<K, V>)r;
		}
		public int characteristics() {
			int r = 0;
			return (int)r;
		}
	}
	public static final class KeySpliterator<K,V> extends atlas.java.util.WeakHashMap.WeakHashMapSpliterator<K, V> {
		public KeySpliterator() {
		}
		public atlas.java.util.WeakHashMap.KeySpliterator<K, V> trySplit() {
			atlas.java.util.WeakHashMap.KeySpliterator r = null;
			return (atlas.java.util.WeakHashMap.KeySpliterator<K, V>)r;
		}
		public int characteristics() {
			int r = 0;
			return (int)r;
		}
	}
	public static class WeakHashMapSpliterator<K,V> {
		public WeakHashMapSpliterator() {
		}
		public final long estimateSize() {
			long r = 0;
			return (long)r;
		}
	}
	public class EntrySet extends atlas.java.util.AbstractSet<atlas.java.util.Map.Entry<K, V>> {
		public java.lang.Object f157;
		public java.lang.Object f127;
		private EntrySet(atlas.java.util.WeakHashMap p0) {
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
		public <T> T[] toArray(T[] p0) {
			java.lang.Object[] r = null;
			return (T[])r;
		}
		public java.lang.Object[] toArray() {
			java.lang.Object[] r = null;
			return (java.lang.Object[])r;
		}
		public atlas.java.util.Iterator<atlas.java.util.Map.Entry<K, V>> iterator() {
			atlas.java.util.Iterator r = null;
			r = new atlas.java.util.WeakHashMap.EntryIterator();
			((atlas.java.util.WeakHashMap.EntryIterator)r).f108 = (java.lang.Object)((atlas.java.util.WeakHashMap.EntrySet)this).f157;
			((atlas.java.util.WeakHashMap.EntryIterator)r).f177 = (java.lang.Object)((atlas.java.util.WeakHashMap.EntrySet)this).f127;
			return (atlas.java.util.Iterator<atlas.java.util.Map.Entry<K, V>>)r;
		}
	}
	public class Values extends atlas.atlas.java.util.AbstractCollection<V> {
		public java.lang.Object f133;
		private Values(atlas.java.util.WeakHashMap p0) {
		}
		public Values() {
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
			r = new atlas.java.util.WeakHashMap.ValueIterator();
			((atlas.java.util.WeakHashMap.ValueIterator)r).f170 = (java.lang.Object)((atlas.java.util.WeakHashMap.Values)this).f133;
			return (atlas.java.util.Iterator<V>)r;
		}
	}
	public class KeySet extends atlas.java.util.AbstractSet<K> {
		public java.lang.Object f128;
		private KeySet(atlas.java.util.WeakHashMap p0) {
		}
		public KeySet() {
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
		public atlas.java.util.Iterator<K> iterator() {
			atlas.java.util.Iterator r = null;
			r = new atlas.java.util.WeakHashMap.KeyIterator();
			((atlas.java.util.WeakHashMap.KeyIterator)r).f120 = (java.lang.Object)((atlas.java.util.WeakHashMap.KeySet)this).f128;
			return (atlas.java.util.Iterator<K>)r;
		}
	}
	public class EntryIterator extends atlas.java.util.WeakHashMap<K, V>.HashIterator<atlas.java.util.Map.Entry<K, V>> {
		public java.lang.Object f177;
		public java.lang.Object f108;
		private EntryIterator(atlas.java.util.WeakHashMap p0) {
		}
		public EntryIterator() {
		}
		public atlas.java.util.Map.Entry<K, V> next() {
			atlas.java.util.Map.Entry r = null;
			r = new atlas.java.util.WeakHashMap.Entry();
			((atlas.java.util.WeakHashMap.Entry)r).f144 = (java.lang.Object)((atlas.java.util.WeakHashMap.EntryIterator)this).f108;
			((atlas.java.util.WeakHashMap.Entry)r).f96 = (java.lang.Object)((atlas.java.util.WeakHashMap.EntryIterator)this).f177;
			return (atlas.java.util.Map.Entry<K, V>)r;
		}
	}
	public class KeyIterator extends atlas.java.util.WeakHashMap<K, V>.HashIterator<K> {
		public java.lang.Object f120;
		private KeyIterator(atlas.java.util.WeakHashMap p0) {
		}
		public KeyIterator() {
		}
		public K next() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.WeakHashMap.KeyIterator)this).f120;
			return (K)r;
		}
	}
	public class ValueIterator extends atlas.java.util.WeakHashMap<K, V>.HashIterator<V> {
		public java.lang.Object f170;
		private ValueIterator(atlas.java.util.WeakHashMap p0) {
		}
		public ValueIterator() {
		}
		public V next() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.WeakHashMap.ValueIterator)this).f170;
			return (V)r;
		}
	}
	public abstract class HashIterator<T> implements atlas.java.util.Iterator<T> {
		HashIterator(atlas.java.util.WeakHashMap p0) {
		}
		public HashIterator() {
		}
		protected atlas.java.util.WeakHashMap.Entry<K, V> nextEntry() {
			atlas.java.util.WeakHashMap.Entry r = null;
			return (atlas.java.util.WeakHashMap.Entry<K, V>)r;
		}
		public void remove() {
		}
		public boolean hasNext() {
			boolean r = false;
			return (boolean)r;
		}
	}
	public static class Entry<K,V> extends java.lang.ref.WeakReference<java.lang.Object> implements atlas.java.util.Map.Entry<K, V> {
		public java.lang.Object f96;
		public java.lang.Object f144;
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
			r = (java.lang.Object)((atlas.java.util.WeakHashMap.Entry)this).f96;
			return (V)r;
		}
		public K getKey() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.WeakHashMap.Entry)this).f144;
			return (K)r;
		}
		public V setValue(V p0) {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.WeakHashMap.Entry)this).f96;
			return (V)r;
		}
	}
	public class ANON89 {
		ANON89() {
		}
	}
}
