package atlas.java.util;
public class Hashtable<K,V> extends atlas.atlas.java.util.Dictionary<K, V> implements atlas.java.util.Map<K, V>, java.lang.Cloneable, java.io.Serializable {
	public java.lang.Object f32;
	public java.lang.Object f40;
	public Hashtable(atlas.java.util.Map<? extends K, ? extends V> p0) {
		((atlas.java.util.Hashtable)this).f32 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedMap)p0).f24;
		((atlas.java.util.Hashtable)this).f40 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)p0).f3;
		((atlas.java.util.Hashtable)this).f32 = (java.lang.Object)((atlas.java.util.HashMap)p0).f37;
		((atlas.java.util.Hashtable)this).f40 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f45;
		((atlas.java.util.Hashtable)this).f40 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableMap)p0).f55;
		((atlas.java.util.Hashtable)this).f40 = (java.lang.Object)((atlas.java.util.IdentityHashMap)p0).f50;
		((atlas.java.util.Hashtable)this).f32 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)p0).f23;
		((atlas.java.util.Hashtable)this).f40 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)p0).f51;
		((atlas.java.util.Hashtable)this).f40 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedMap)p0).f48;
		((atlas.java.util.Hashtable)this).f40 = (java.lang.Object)((atlas.java.util.Hashtable)p0).f40;
		((atlas.java.util.Hashtable)this).f32 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f86;
		((atlas.java.util.Hashtable)this).f40 = (java.lang.Object)((atlas.java.util.WeakHashMap)p0).f41;
		((atlas.java.util.Hashtable)this).f32 = (java.lang.Object)((atlas.java.util.Properties)p0).f54;
		((atlas.java.util.Hashtable)this).f40 = (java.lang.Object)((atlas.java.util.HashMap)p0).f0;
		((atlas.java.util.Hashtable)this).f40 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableNavigableMap)p0).f39;
		((atlas.java.util.Hashtable)this).f40 = (java.lang.Object)((atlas.java.util.Properties)p0).f59;
		((atlas.java.util.Hashtable)this).f40 = (java.lang.Object)((atlas.java.util.TreeMap)p0).f61;
		((atlas.java.util.Hashtable)this).f40 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)p0).f29;
		((atlas.java.util.Hashtable)this).f40 = (java.lang.Object)((atlas.java.util.LinkedHashMap)p0).f46;
		((atlas.java.util.Hashtable)this).f32 = (java.lang.Object)((atlas.java.util.WeakHashMap)p0).f25;
		((atlas.java.util.Hashtable)this).f32 = (java.lang.Object)((atlas.java.util.IdentityHashMap)p0).f93;
		((atlas.java.util.Hashtable)this).f32 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableMap)p0).f117;
	}
	public Hashtable() {
	}
	public synchronized V remove(java.lang.Object p0) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.Properties)this).f59;
		r = (java.lang.Object)((atlas.java.util.Hashtable)this).f40;
		return (V)r;
	}
	public synchronized boolean remove(java.lang.Object p0, java.lang.Object p1) {
		boolean r = false;
		return (boolean)r;
	}
	public synchronized V get(java.lang.Object p0) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.Properties)this).f59;
		r = (java.lang.Object)((atlas.java.util.Hashtable)this).f40;
		return (V)r;
	}
	public synchronized V put(K p0, V p1) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.Properties)this).f59;
		((atlas.java.util.Hashtable)this).f40 = (java.lang.Object)p1;
		((atlas.java.util.Properties)this).f59 = (java.lang.Object)p1;
		((atlas.java.util.Properties)this).f54 = (java.lang.Object)p0;
		((atlas.java.util.Hashtable)this).f32 = (java.lang.Object)p0;
		r = (java.lang.Object)((atlas.java.util.Hashtable)this).f40;
		return (V)r;
	}
	public synchronized boolean equals(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public synchronized java.lang.String toString() {
		java.lang.String r = null;
		r = new java.lang.String();
		return (java.lang.String)r;
	}
	public atlas.java.util.Collection<V> values() {
		atlas.java.util.Collection r = null;
		r = new atlas.java.util.Collections.SynchronizedCollection();
		((atlas.java.util.Collections.SynchronizedCollection)r).f2 = (java.lang.Object)((atlas.java.util.Properties)this).f59;
		((atlas.java.util.Collections.SynchronizedCollection)r).f2 = (java.lang.Object)((atlas.java.util.Hashtable)this).f40;
		return (atlas.java.util.Collection<V>)r;
	}
	public synchronized int hashCode() {
		int r = 0;
		return (int)r;
	}
	public synchronized java.lang.Object clone() {
		java.lang.Object r = null;
		r = new atlas.java.util.Hashtable();
		r = new atlas.java.util.Properties();
		((atlas.java.util.Hashtable)r).f32 = (java.lang.Object)((atlas.java.util.Hashtable)this).f32;
		((atlas.java.util.Hashtable)r).f40 = (java.lang.Object)((atlas.java.util.Hashtable)this).f40;
		((atlas.java.util.Properties)r).f54 = (java.lang.Object)((atlas.java.util.Properties)this).f54;
		((atlas.java.util.Properties)r).f59 = (java.lang.Object)((atlas.java.util.Properties)this).f59;
		return (java.lang.Object)r;
	}
	public synchronized void clear() {
	}
	public synchronized boolean isEmpty() {
		boolean r = false;
		return (boolean)r;
	}
	public synchronized boolean replace(K p0, V p1, V p2) {
		boolean r = false;
		return (boolean)r;
	}
	public synchronized V replace(K p0, V p1) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.Properties)this).f59;
		r = (java.lang.Object)((atlas.java.util.Hashtable)this).f40;
		return (V)r;
	}
	public synchronized boolean contains(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public synchronized java.util.Enumeration<V> elements() {
		java.util.Enumeration r = null;
		r = new atlas.java.util.Hashtable.Enumerator();
		r = new atlas.java.util.Collections.EmptyEnumeration();
		((atlas.java.util.Hashtable.Enumerator)r).f17 = (java.lang.Object)((atlas.java.util.Hashtable)this).f40;
		((atlas.java.util.Hashtable.Enumerator)r).f17 = (java.lang.Object)((atlas.java.util.Properties)this).f59;
		return (java.util.Enumeration<V>)r;
	}
	public synchronized int size() {
		int r = 0;
		return (int)r;
	}
	public java.util.Set<atlas.java.util.Map.Entry<K, V>> entrySet() {
		java.util.Set r = null;
		r = new atlas.java.util.Collections.SynchronizedSet();
		((atlas.java.util.Collections.SynchronizedSet)r).f89 = (java.lang.Object)((atlas.java.util.Hashtable)this).f40;
		((atlas.java.util.Collections.SynchronizedSet)r).f89 = (java.lang.Object)((atlas.java.util.Properties)this).f54;
		((atlas.java.util.Collections.SynchronizedSet)r).f89 = (java.lang.Object)((atlas.java.util.Properties)this).f59;
		((atlas.java.util.Collections.SynchronizedSet)r).f89 = (java.lang.Object)((atlas.java.util.Hashtable)this).f32;
		return (java.util.Set<atlas.java.util.Map.Entry<K, V>>)r;
	}
	public synchronized void putAll(atlas.java.util.Map<? extends K, ? extends V> p0) {
		((atlas.java.util.Properties)this).f59 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)p0).f29;
		((atlas.java.util.Hashtable)this).f40 = (java.lang.Object)((atlas.java.util.TreeMap)p0).f61;
		((atlas.java.util.Hashtable)this).f40 = (java.lang.Object)((atlas.java.util.Hashtable)p0).f40;
		((atlas.java.util.Properties)this).f59 = (java.lang.Object)((atlas.java.util.LinkedHashMap)p0).f46;
		((atlas.java.util.Properties)this).f54 = (java.lang.Object)((atlas.java.util.TreeMap)p0).f5;
		((atlas.java.util.Hashtable)this).f40 = (java.lang.Object)((atlas.java.util.WeakHashMap)p0).f41;
		((atlas.java.util.Hashtable)this).f32 = (java.lang.Object)((atlas.java.util.Properties)p0).f54;
		((atlas.java.util.Hashtable)this).f32 = (java.lang.Object)((atlas.java.util.IdentityHashMap)p0).f93;
		((atlas.java.util.Properties)this).f54 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f86;
		((atlas.java.util.Properties)this).f54 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedMap)p0).f24;
		((atlas.java.util.Properties)this).f59 = (java.lang.Object)((atlas.java.util.WeakHashMap)p0).f41;
		((atlas.java.util.Properties)this).f54 = (java.lang.Object)((atlas.java.util.Hashtable)p0).f32;
		((atlas.java.util.Hashtable)this).f40 = (java.lang.Object)((atlas.java.util.LinkedHashMap)p0).f46;
		((atlas.java.util.Hashtable)this).f32 = (java.lang.Object)((atlas.java.util.WeakHashMap)p0).f25;
		((atlas.java.util.Properties)this).f59 = (java.lang.Object)((atlas.java.util.Hashtable)p0).f40;
		((atlas.java.util.Properties)this).f59 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)p0).f3;
		((atlas.java.util.Properties)this).f59 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedNavigableMap)p0).f6;
		((atlas.java.util.Hashtable)this).f40 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)p0).f29;
		((atlas.java.util.Hashtable)this).f40 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f45;
		((atlas.java.util.Properties)this).f59 = (java.lang.Object)((atlas.java.util.Properties)p0).f59;
		((atlas.java.util.Properties)this).f54 = (java.lang.Object)((atlas.java.util.IdentityHashMap)p0).f93;
		((atlas.java.util.Hashtable)this).f32 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedMap)p0).f24;
		((atlas.java.util.Properties)this).f54 = (java.lang.Object)((atlas.java.util.LinkedHashMap)p0).f58;
		((atlas.java.util.Properties)this).f59 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableMap)p0).f55;
		((atlas.java.util.Hashtable)this).f40 = (java.lang.Object)((atlas.java.util.Properties)p0).f59;
		((atlas.java.util.Properties)this).f59 = (java.lang.Object)((atlas.java.util.HashMap)p0).f0;
		((atlas.java.util.Hashtable)this).f32 = (java.lang.Object)((atlas.java.util.LinkedHashMap)p0).f58;
		((atlas.java.util.Properties)this).f59 = (java.lang.Object)((atlas.java.util.IdentityHashMap)p0).f50;
		((atlas.java.util.Hashtable)this).f40 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedMap)p0).f48;
		((atlas.java.util.Hashtable)this).f40 = (java.lang.Object)((atlas.java.util.HashMap)p0).f0;
		((atlas.java.util.Properties)this).f54 = (java.lang.Object)((atlas.java.util.HashMap)p0).f37;
		((atlas.java.util.Hashtable)this).f32 = (java.lang.Object)((atlas.java.util.TreeMap)p0).f5;
		((atlas.java.util.Hashtable)this).f40 = (java.lang.Object)((atlas.java.util.IdentityHashMap)p0).f50;
		((atlas.java.util.Properties)this).f59 = (java.lang.Object)((atlas.java.util.TreeMap)p0).f61;
		((atlas.java.util.Properties)this).f54 = (java.lang.Object)((atlas.java.util.Properties)p0).f54;
		((atlas.java.util.Hashtable)this).f40 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableMap)p0).f55;
		((atlas.java.util.Properties)this).f59 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableSortedMap)p0).f77;
		((atlas.java.util.Hashtable)this).f40 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)p0).f3;
		((atlas.java.util.Hashtable)this).f32 = (java.lang.Object)((atlas.java.util.HashMap)p0).f37;
		((atlas.java.util.Properties)this).f59 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedMap)p0).f48;
		((atlas.java.util.Hashtable)this).f32 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f86;
		((atlas.java.util.Properties)this).f54 = (java.lang.Object)((atlas.java.util.WeakHashMap)p0).f25;
		((atlas.java.util.Properties)this).f59 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f45;
	}
	public synchronized V putIfAbsent(K p0, V p1) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.Properties)this).f59;
		((atlas.java.util.Hashtable)this).f40 = (java.lang.Object)p1;
		((atlas.java.util.Properties)this).f59 = (java.lang.Object)p1;
		((atlas.java.util.Properties)this).f54 = (java.lang.Object)p0;
		((atlas.java.util.Hashtable)this).f32 = (java.lang.Object)p0;
		r = (java.lang.Object)((atlas.java.util.Hashtable)this).f40;
		return (V)r;
	}
	public synchronized java.util.Enumeration<K> keys() {
		java.util.Enumeration r = null;
		r = new atlas.java.util.Hashtable.Enumerator();
		r = new atlas.java.util.Collections.EmptyEnumeration();
		((atlas.java.util.Hashtable.Enumerator)r).f17 = (java.lang.Object)((atlas.java.util.Hashtable)this).f32;
		((atlas.java.util.Hashtable.Enumerator)r).f17 = (java.lang.Object)((atlas.java.util.Properties)this).f54;
		return (java.util.Enumeration<K>)r;
	}
	public java.util.Set<K> keySet() {
		java.util.Set r = null;
		r = new atlas.java.util.Collections.SynchronizedSet();
		((atlas.java.util.Collections.SynchronizedSet)r).f73 = (java.lang.Object)((atlas.java.util.Properties)this).f54;
		((atlas.java.util.Collections.SynchronizedSet)r).f73 = (java.lang.Object)((atlas.java.util.Hashtable)this).f32;
		return (java.util.Set<K>)r;
	}
	public boolean containsValue(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public synchronized boolean containsKey(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	protected void rehash() {
	}
	public synchronized V getOrDefault(java.lang.Object p0, V p1) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.Properties)this).f59;
		r = (java.lang.Object)p1;
		r = (java.lang.Object)((atlas.java.util.Hashtable)this).f40;
		return (V)r;
	}
	public class Enumerator<T> implements java.util.Enumeration<T>, atlas.java.util.Iterator<T> {
		public java.lang.Object f17;
		public Enumerator() {
		}
		public void remove() {
		}
		public T next() {
			java.lang.Object r = null;
			r = new atlas.java.util.Hashtable.Entry();
			((atlas.java.util.Hashtable.Entry)r).f172 = (java.lang.Object)((atlas.java.util.Hashtable.Enumerator)this).f17;
			r = (java.lang.Object)((atlas.java.util.Hashtable.Enumerator)this).f17;
			return (T)r;
		}
		public boolean hasNext() {
			boolean r = false;
			return (boolean)r;
		}
		public boolean hasMoreElements() {
			boolean r = false;
			return (boolean)r;
		}
		public T nextElement() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.Hashtable.Enumerator)this).f17;
			return (T)r;
		}
	}
	public static class Entry<K,V> implements atlas.java.util.Map.Entry<K, V> {
		public java.lang.Object f172;
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
		protected java.lang.Object clone() {
			java.lang.Object r = null;
			return (java.lang.Object)r;
		}
		public V getValue() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.Hashtable.Entry)this).f172;
			return (V)r;
		}
		public K getKey() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.Hashtable.Entry)this).f172;
			return (K)r;
		}
		public V setValue(V p0) {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.Hashtable.Entry)this).f172;
			return (V)r;
		}
	}
	public static final class UnsafeHolder {
		public UnsafeHolder() {
		}
	}
	public class ValueCollection extends atlas.atlas.java.util.AbstractCollection<V> {
		private ValueCollection(atlas.atlas.java.util.Hashtable p0) {
		}
		public ValueCollection() {
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
			return (atlas.java.util.Iterator<V>)r;
		}
	}
	public class EntrySet extends atlas.java.util.AbstractSet<atlas.java.util.Map.Entry<K, V>> {
		private EntrySet(atlas.atlas.java.util.Hashtable p0) {
		}
		public EntrySet() {
		}
		public boolean add(atlas.java.util.Map.Entry<K, V> p0) {
			boolean r = false;
			return (boolean)r;
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
			return (atlas.java.util.Iterator<atlas.java.util.Map.Entry<K, V>>)r;
		}
	}
	public class KeySet extends atlas.java.util.AbstractSet<K> {
		private KeySet(atlas.atlas.java.util.Hashtable p0) {
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
			return (atlas.java.util.Iterator<K>)r;
		}
	}
	public class ANON118 {
		ANON118() {
		}
	}
}
