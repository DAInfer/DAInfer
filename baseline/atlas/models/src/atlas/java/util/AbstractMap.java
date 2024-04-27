package atlas.java.util;
public abstract class AbstractMap<K,V> implements atlas.java.util.Map<K, V> {
	public AbstractMap() {
	}
	public V remove(java.lang.Object p0) {
		java.lang.Object r = null;
		return (V)r;
	}
	public V get(java.lang.Object p0) {
		java.lang.Object r = null;
		return (V)r;
	}
	public V put(K p0, V p1) {
		java.lang.Object r = null;
		return (V)r;
	}
	public boolean equals(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public java.lang.String toString() {
		java.lang.String r = null;
		return (java.lang.String)r;
	}
	public atlas.java.util.Collection<V> values() {
		atlas.java.util.Collection r = null;
		r = new ANON349();
		((ANON349)r).f126 = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)this).f60;
		return (atlas.java.util.Collection<V>)r;
	}
	public int hashCode() {
		int r = 0;
		return (int)r;
	}
	protected java.lang.Object clone() {
		java.lang.Object r = null;
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
	public abstract java.util.Set<atlas.java.util.Map.Entry<K, V>> entrySet();
	public void putAll(atlas.java.util.Map<? extends K, ? extends V> p0) {
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81 = (java.lang.Object)((atlas.java.util.HashMap)p0).f37;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29 = (java.lang.Object)((atlas.java.util.TreeMap.AscendingSubMap)p0).f60;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)p0).f3;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f45;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81 = (java.lang.Object)((atlas.java.util.IdentityHashMap)p0).f93;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29 = (java.lang.Object)((atlas.java.util.TreeMap)p0).f61;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)p0).f29;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29 = (java.lang.Object)((atlas.java.util.Properties)p0).f59;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableMap)p0).f117;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedMap)p0).f24;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableSortedMap)p0).f76;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)p0).f23;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81 = (java.lang.Object)((atlas.java.util.LinkedHashMap)p0).f58;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedMap)p0).f48;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableMap)p0).f55;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29 = (java.lang.Object)((atlas.java.util.LinkedHashMap)p0).f46;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81 = (java.lang.Object)((atlas.java.util.Properties)p0).f54;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81 = (java.lang.Object)((atlas.java.util.Hashtable)p0).f32;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f86;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81 = (java.lang.Object)((atlas.java.util.TreeMap)p0).f5;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29 = (java.lang.Object)((atlas.java.util.WeakHashMap)p0).f41;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29 = (java.lang.Object)((atlas.java.util.Hashtable)p0).f40;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81 = (java.lang.Object)((atlas.java.util.WeakHashMap)p0).f25;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29 = (java.lang.Object)((atlas.java.util.IdentityHashMap)p0).f50;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f29 = (java.lang.Object)((atlas.java.util.HashMap)p0).f0;
		((atlas.java.util.concurrent.ConcurrentSkipListMap)this).f81 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap)p0).f33;
	}
	public java.util.Set<K> keySet() {
		java.util.Set r = null;
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
	public static class SimpleImmutableEntry<K,V> implements atlas.java.util.Map.Entry<K, V>, java.io.Serializable {
		public java.lang.Object f68;
		public java.lang.Object f103;
		public SimpleImmutableEntry(K p0, V p1) {
		}
		public SimpleImmutableEntry(atlas.java.util.Map.Entry<? extends K, ? extends V> p0) {
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)this).f103 = (java.lang.Object)((atlas.java.util.AbstractMap.SimpleEntry)p0).f98;
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)this).f68 = (java.lang.Object)((atlas.java.util.AbstractMap.SimpleImmutableEntry)p0).f68;
			((atlas.java.util.AbstractMap.SimpleImmutableEntry)this).f103 = (java.lang.Object)((atlas.java.util.AbstractMap.SimpleImmutableEntry)p0).f103;
		}
		public SimpleImmutableEntry() {
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
		public int hashCode() {
			int r = 0;
			return (int)r;
		}
		public V getValue() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.AbstractMap.SimpleImmutableEntry)this).f68;
			return (V)r;
		}
		public K getKey() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.AbstractMap.SimpleImmutableEntry)this).f103;
			return (K)r;
		}
		public V setValue(V p0) {
			java.lang.Object r = null;
			return (V)r;
		}
	}
	public static class SimpleEntry<K,V> implements atlas.java.util.Map.Entry<K, V>, java.io.Serializable {
		public java.lang.Object f162;
		public java.lang.Object f98;
		public SimpleEntry(K p0, V p1) {
		}
		public SimpleEntry(atlas.java.util.Map.Entry<? extends K, ? extends V> p0) {
			((atlas.java.util.AbstractMap.SimpleEntry)this).f98 = (java.lang.Object)((atlas.java.util.AbstractMap.SimpleImmutableEntry)p0).f103;
			((atlas.java.util.AbstractMap.SimpleEntry)this).f162 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableMap.UnmodifiableEntrySet.UnmodifiableEntry)p0).f121;
			((atlas.java.util.AbstractMap.SimpleEntry)this).f162 = (java.lang.Object)((atlas.java.util.AbstractMap.SimpleImmutableEntry)p0).f68;
		}
		public SimpleEntry() {
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
		public int hashCode() {
			int r = 0;
			return (int)r;
		}
		public V getValue() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.AbstractMap.SimpleEntry)this).f162;
			return (V)r;
		}
		public K getKey() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.AbstractMap.SimpleEntry)this).f98;
			return (K)r;
		}
		public V setValue(V p0) {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.AbstractMap.SimpleEntry)this).f162;
			return (V)r;
		}
	}
	public class ANON37 extends atlas.java.util.AbstractSet<K> {
		ANON37() {
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
		public atlas.java.util.Iterator<K> iterator() {
			atlas.java.util.Iterator r = null;
			return (atlas.java.util.Iterator<K>)r;
		}
		public class ANON302 implements atlas.java.util.Iterator<K> {
			ANON302() {
			}
			public void remove() {
			}
			public K next() {
				java.lang.Object r = null;
				return (K)r;
			}
			public boolean hasNext() {
				boolean r = false;
				return (boolean)r;
			}
		}
	}
	public class ANON349 extends atlas.atlas.java.util.AbstractCollection<V> {
		public java.lang.Object f126;
		ANON349() {
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
		public atlas.java.util.Iterator<V> iterator() {
			atlas.java.util.Iterator r = null;
			r = new ANON299();
			((ANON299)r).f136 = (java.lang.Object)((ANON349)this).f126;
			return (atlas.java.util.Iterator<V>)r;
		}
		public class ANON299 implements atlas.java.util.Iterator<V> {
			public java.lang.Object f136;
			ANON299() {
			}
			public void remove() {
			}
			public V next() {
				java.lang.Object r = null;
				r = (java.lang.Object)((ANON299)this).f136;
				return (V)r;
			}
			public boolean hasNext() {
				boolean r = false;
				return (boolean)r;
			}
		}
	}
}
