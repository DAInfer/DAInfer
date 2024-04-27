package atlas.java.util;
public class IdentityHashMap<K,V> extends atlas.atlas.java.util.AbstractMap<K, V> implements atlas.java.util.Map<K, V>, java.io.Serializable, java.lang.Cloneable {
	public java.lang.Object f50;
	public java.lang.Object f93;
	public IdentityHashMap(atlas.java.util.Map<? extends K, ? extends V> p0) {
		((atlas.java.util.IdentityHashMap)this).f50 = (java.lang.Object)((atlas.java.util.Properties)p0).f59;
		((atlas.java.util.IdentityHashMap)this).f50 = (java.lang.Object)((atlas.java.util.TreeMap)p0).f61;
		((atlas.java.util.IdentityHashMap)this).f93 = (java.lang.Object)((atlas.java.util.WeakHashMap)p0).f25;
		((atlas.java.util.IdentityHashMap)this).f93 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableMap)p0).f117;
		((atlas.java.util.IdentityHashMap)this).f50 = (java.lang.Object)((atlas.java.util.Hashtable)p0).f40;
		((atlas.java.util.IdentityHashMap)this).f50 = (java.lang.Object)((atlas.java.util.WeakHashMap)p0).f41;
		((atlas.java.util.IdentityHashMap)this).f50 = (java.lang.Object)((atlas.java.util.HashMap)p0).f0;
		((atlas.java.util.IdentityHashMap)this).f93 = (java.lang.Object)((atlas.java.util.LinkedHashMap)p0).f58;
		((atlas.java.util.IdentityHashMap)this).f50 = (java.lang.Object)((atlas.java.util.LinkedHashMap)p0).f46;
		((atlas.java.util.IdentityHashMap)this).f50 = (java.lang.Object)((atlas.java.util.IdentityHashMap)p0).f50;
		((atlas.java.util.IdentityHashMap)this).f93 = (java.lang.Object)((atlas.java.util.Properties)p0).f54;
		((atlas.java.util.IdentityHashMap)this).f50 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)p0).f29;
		((atlas.java.util.IdentityHashMap)this).f50 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)p0).f3;
		((atlas.java.util.IdentityHashMap)this).f50 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f45;
		((atlas.java.util.IdentityHashMap)this).f50 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableMap)p0).f55;
		((atlas.java.util.IdentityHashMap)this).f93 = (java.lang.Object)((atlas.java.util.Hashtable)p0).f32;
		((atlas.java.util.IdentityHashMap)this).f50 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedMap)p0).f48;
		((atlas.java.util.IdentityHashMap)this).f50 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableSortedMap)p0).f77;
		((atlas.java.util.IdentityHashMap)this).f93 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f86;
	}
	public IdentityHashMap() {
	}
	public V remove(java.lang.Object p0) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.IdentityHashMap)this).f50;
		return (V)r;
	}
	public V get(java.lang.Object p0) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.IdentityHashMap)this).f50;
		return (V)r;
	}
	public V put(K p0, V p1) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.IdentityHashMap)this).f50;
		((atlas.java.util.IdentityHashMap)this).f93 = (java.lang.Object)p0;
		((atlas.java.util.IdentityHashMap)this).f50 = (java.lang.Object)p1;
		return (V)r;
	}
	public boolean equals(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public atlas.java.util.Collection<V> values() {
		atlas.java.util.Collection r = null;
		r = new atlas.java.util.IdentityHashMap.Values();
		((atlas.java.util.IdentityHashMap.Values)r).f35 = (java.lang.Object)((atlas.java.util.IdentityHashMap)this).f50;
		return (atlas.java.util.Collection<V>)r;
	}
	public int hashCode() {
		int r = 0;
		return (int)r;
	}
	public java.lang.Object clone() {
		java.lang.Object r = null;
		r = new atlas.java.util.IdentityHashMap();
		((atlas.java.util.IdentityHashMap)r).f50 = (java.lang.Object)((atlas.java.util.IdentityHashMap)this).f50;
		((atlas.java.util.IdentityHashMap)r).f93 = (java.lang.Object)((atlas.java.util.IdentityHashMap)this).f93;
		return (java.lang.Object)r;
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
		r = new atlas.java.util.IdentityHashMap.EntrySet();
		((atlas.java.util.IdentityHashMap.EntrySet)r).f80 = (java.lang.Object)((atlas.java.util.IdentityHashMap)this).f93;
		((atlas.java.util.IdentityHashMap.EntrySet)r).f176 = (java.lang.Object)((atlas.java.util.IdentityHashMap)this).f50;
		return (java.util.Set<atlas.java.util.Map.Entry<K, V>>)r;
	}
	public void putAll(atlas.java.util.Map<? extends K, ? extends V> p0) {
		((atlas.java.util.IdentityHashMap)this).f50 = (java.lang.Object)((atlas.java.util.HashMap)p0).f0;
		((atlas.java.util.IdentityHashMap)this).f93 = (java.lang.Object)((atlas.java.util.WeakHashMap)p0).f25;
		((atlas.java.util.IdentityHashMap)this).f50 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableNavigableMap)p0).f39;
		((atlas.java.util.IdentityHashMap)this).f50 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedMap)p0).f48;
		((atlas.java.util.IdentityHashMap)this).f50 = (java.lang.Object)((atlas.java.util.LinkedHashMap)p0).f46;
		((atlas.java.util.IdentityHashMap)this).f50 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)p0).f29;
		((atlas.java.util.IdentityHashMap)this).f50 = (java.lang.Object)((atlas.java.util.IdentityHashMap)p0).f50;
		((atlas.java.util.IdentityHashMap)this).f93 = (java.lang.Object)((atlas.java.util.IdentityHashMap)p0).f93;
		((atlas.java.util.IdentityHashMap)this).f93 = (java.lang.Object)((atlas.java.util.Properties)p0).f54;
		((atlas.java.util.IdentityHashMap)this).f50 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableMap)p0).f55;
		((atlas.java.util.IdentityHashMap)this).f50 = (java.lang.Object)((atlas.java.util.TreeMap)p0).f61;
		((atlas.java.util.IdentityHashMap)this).f93 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f86;
		((atlas.java.util.IdentityHashMap)this).f50 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f45;
		((atlas.java.util.IdentityHashMap)this).f50 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)p0).f3;
		((atlas.java.util.IdentityHashMap)this).f93 = (java.lang.Object)((atlas.java.util.TreeMap)p0).f5;
		((atlas.java.util.IdentityHashMap)this).f50 = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)p0).f60;
		((atlas.java.util.IdentityHashMap)this).f50 = (java.lang.Object)((atlas.java.util.Properties)p0).f59;
		((atlas.java.util.IdentityHashMap)this).f50 = (java.lang.Object)((atlas.java.util.WeakHashMap)p0).f41;
		((atlas.java.util.IdentityHashMap)this).f50 = (java.lang.Object)((atlas.java.util.Hashtable)p0).f40;
	}
	public java.util.Set<K> keySet() {
		java.util.Set r = null;
		r = new atlas.java.util.IdentityHashMap.KeySet();
		((atlas.java.util.IdentityHashMap.KeySet)r).f165 = (java.lang.Object)((atlas.java.util.IdentityHashMap)this).f93;
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
	public static final class EntrySpliterator<K,V> extends atlas.atlas.java.util.IdentityHashMap.IdentityHashMapSpliterator<K, V> {
		public EntrySpliterator() {
		}
		public atlas.atlas.java.util.IdentityHashMap.EntrySpliterator<K, V> trySplit() {
			atlas.java.util.IdentityHashMap.EntrySpliterator r = null;
			return (atlas.atlas.java.util.IdentityHashMap.EntrySpliterator<K, V>)r;
		}
		public int characteristics() {
			int r = 0;
			return (int)r;
		}
	}
	public static final class ValueSpliterator<K,V> extends atlas.atlas.java.util.IdentityHashMap.IdentityHashMapSpliterator<K, V> {
		public ValueSpliterator() {
		}
		public atlas.atlas.java.util.IdentityHashMap.ValueSpliterator<K, V> trySplit() {
			atlas.java.util.IdentityHashMap.ValueSpliterator r = null;
			return (atlas.atlas.java.util.IdentityHashMap.ValueSpliterator<K, V>)r;
		}
		public int characteristics() {
			int r = 0;
			return (int)r;
		}
	}
	public static final class KeySpliterator<K,V> extends atlas.atlas.java.util.IdentityHashMap.IdentityHashMapSpliterator<K, V> {
		public KeySpliterator() {
		}
		public atlas.atlas.java.util.IdentityHashMap.KeySpliterator<K, V> trySplit() {
			atlas.java.util.IdentityHashMap.KeySpliterator r = null;
			return (atlas.atlas.java.util.IdentityHashMap.KeySpliterator<K, V>)r;
		}
		public int characteristics() {
			int r = 0;
			return (int)r;
		}
	}
	public static class IdentityHashMapSpliterator<K,V> {
		public IdentityHashMapSpliterator() {
		}
		public final long estimateSize() {
			long r = 0;
			return (long)r;
		}
	}
	public class EntrySet extends atlas.java.util.AbstractSet<atlas.java.util.Map.Entry<K, V>> {
		public java.lang.Object f176;
		public java.lang.Object f80;
		private EntrySet(atlas.atlas.java.util.IdentityHashMap p0) {
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
			r = new atlas.java.util.IdentityHashMap.EntryIterator();
			((atlas.java.util.IdentityHashMap.EntryIterator)r).f158 = (java.lang.Object)((atlas.java.util.IdentityHashMap.EntrySet)this).f80;
			((atlas.java.util.IdentityHashMap.EntryIterator)r).f119 = (java.lang.Object)((atlas.java.util.IdentityHashMap.EntrySet)this).f176;
			return (atlas.java.util.Iterator<atlas.java.util.Map.Entry<K, V>>)r;
		}
		public boolean removeAll(atlas.java.util.Collection<?> p0) {
			boolean r = false;
			return (boolean)r;
		}
	}
	public class Values extends atlas.atlas.java.util.AbstractCollection<V> {
		public java.lang.Object f35;
		private Values(atlas.atlas.java.util.IdentityHashMap p0) {
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
		public <T> T[] toArray(T[] p0) {
			java.lang.Object[] r = null;
			return (T[])r;
		}
		public java.lang.Object[] toArray() {
			java.lang.Object[] r = null;
			return (java.lang.Object[])r;
		}
		public atlas.java.util.Iterator<V> iterator() {
			atlas.java.util.Iterator r = null;
			r = new atlas.java.util.IdentityHashMap.ValueIterator();
			((atlas.java.util.IdentityHashMap.ValueIterator)r).f109 = (java.lang.Object)((atlas.java.util.IdentityHashMap.Values)this).f35;
			return (atlas.java.util.Iterator<V>)r;
		}
	}
	public class KeySet extends atlas.java.util.AbstractSet<K> {
		public java.lang.Object f165;
		private KeySet(atlas.atlas.java.util.IdentityHashMap p0) {
		}
		public KeySet() {
		}
		public boolean remove(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public int hashCode() {
			int r = 0;
			return (int)r;
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
		public atlas.java.util.Iterator<K> iterator() {
			atlas.java.util.Iterator r = null;
			r = new atlas.java.util.IdentityHashMap.KeyIterator();
			((atlas.java.util.IdentityHashMap.KeyIterator)r).f105 = (java.lang.Object)((atlas.java.util.IdentityHashMap.KeySet)this).f165;
			return (atlas.java.util.Iterator<K>)r;
		}
		public boolean removeAll(atlas.java.util.Collection<?> p0) {
			boolean r = false;
			return (boolean)r;
		}
	}
	public class EntryIterator extends atlas.atlas.java.util.IdentityHashMap<K, V>.IdentityHashMapIterator<atlas.java.util.Map.Entry<K, V>> {
		public java.lang.Object f119;
		public java.lang.Object f158;
		private EntryIterator(atlas.atlas.java.util.IdentityHashMap p0) {
		}
		public EntryIterator() {
		}
		public void remove() {
		}
		public atlas.java.util.Map.Entry<K, V> next() {
			atlas.java.util.Map.Entry r = null;
			r = new atlas.java.util.IdentityHashMap.EntryIterator.Entry();
			((atlas.java.util.IdentityHashMap.EntryIterator.Entry)r).f111 = (java.lang.Object)((atlas.java.util.IdentityHashMap.EntryIterator)this).f158;
			((atlas.java.util.IdentityHashMap.EntryIterator.Entry)r).f95 = (java.lang.Object)((atlas.java.util.IdentityHashMap.EntryIterator)this).f119;
			return (atlas.java.util.Map.Entry<K, V>)r;
		}
		public class Entry implements atlas.java.util.Map.Entry<K, V> {
			public java.lang.Object f95;
			public java.lang.Object f111;
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
				r = (java.lang.Object)((atlas.java.util.IdentityHashMap.EntryIterator.Entry)this).f95;
				return (V)r;
			}
			public K getKey() {
				java.lang.Object r = null;
				r = (java.lang.Object)((atlas.java.util.IdentityHashMap.EntryIterator.Entry)this).f111;
				return (K)r;
			}
			public V setValue(V p0) {
				java.lang.Object r = null;
				r = (java.lang.Object)((atlas.java.util.IdentityHashMap.EntryIterator.Entry)this).f95;
				return (V)r;
			}
		}
	}
	public class ValueIterator extends atlas.atlas.java.util.IdentityHashMap<K, V>.IdentityHashMapIterator<V> {
		public java.lang.Object f109;
		private ValueIterator(atlas.atlas.java.util.IdentityHashMap p0) {
		}
		public ValueIterator() {
		}
		public V next() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.IdentityHashMap.ValueIterator)this).f109;
			return (V)r;
		}
	}
	public class KeyIterator extends atlas.atlas.java.util.IdentityHashMap<K, V>.IdentityHashMapIterator<K> {
		public java.lang.Object f105;
		private KeyIterator(atlas.atlas.java.util.IdentityHashMap p0) {
		}
		public KeyIterator() {
		}
		public K next() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.IdentityHashMap.KeyIterator)this).f105;
			return (K)r;
		}
	}
	public abstract class IdentityHashMapIterator<T> implements atlas.java.util.Iterator<T> {
		private IdentityHashMapIterator(atlas.atlas.java.util.IdentityHashMap p0) {
		}
		public IdentityHashMapIterator() {
		}
		public void remove() {
		}
		public boolean hasNext() {
			boolean r = false;
			return (boolean)r;
		}
		protected int nextIndex() {
			int r = 0;
			return (int)r;
		}
	}
	public class ANON237 {
		ANON237() {
		}
	}
}
