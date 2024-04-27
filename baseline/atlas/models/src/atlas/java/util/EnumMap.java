package atlas.java.util;
public class EnumMap<K,V> extends atlas.atlas.java.util.AbstractMap<K, V> implements java.io.Serializable, java.lang.Cloneable {
	public EnumMap(java.lang.Class<K> p0) {
	}
	public EnumMap(atlas.java.util.EnumMap<K, ? extends V> p0) {
	}
	public EnumMap(atlas.java.util.Map<K, ? extends V> p0) {
	}
	public EnumMap() {
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
	public atlas.java.util.Collection<V> values() {
		atlas.java.util.Collection r = null;
		return (atlas.java.util.Collection<V>)r;
	}
	public int hashCode() {
		int r = 0;
		return (int)r;
	}
	public atlas.java.util.EnumMap<K, V> clone() {
		atlas.java.util.EnumMap r = null;
		return (atlas.java.util.EnumMap<K, V>)r;
	}
	public void clear() {
	}
	public int size() {
		int r = 0;
		return (int)r;
	}
	public java.util.Set<atlas.java.util.Map.Entry<K, V>> entrySet() {
		java.util.Set r = null;
		return (java.util.Set<atlas.java.util.Map.Entry<K, V>>)r;
	}
	public void putAll(atlas.java.util.Map<? extends K, ? extends V> p0) {
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
	public class EntryIterator extends atlas.java.util.EnumMap<K, V>.EnumMapIterator<atlas.java.util.Map.Entry<K, V>> {
		private EntryIterator(atlas.java.util.EnumMap p0) {
		}
		public EntryIterator() {
		}
		public void remove() {
		}
		public atlas.java.util.Map.Entry<K, V> next() {
			atlas.java.util.Map.Entry r = null;
			return (atlas.java.util.Map.Entry<K, V>)r;
		}
		public class Entry implements atlas.java.util.Map.Entry<K, V> {
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
				return (V)r;
			}
			public K getKey() {
				java.lang.Enum r = null;
				return (K)r;
			}
			public V setValue(V p0) {
				java.lang.Object r = null;
				return (V)r;
			}
		}
	}
	public class ValueIterator extends atlas.java.util.EnumMap<K, V>.EnumMapIterator<V> {
		private ValueIterator(atlas.java.util.EnumMap p0) {
		}
		public ValueIterator() {
		}
		public V next() {
			java.lang.Object r = null;
			return (V)r;
		}
	}
	public class KeyIterator extends atlas.java.util.EnumMap<K, V>.EnumMapIterator<K> {
		private KeyIterator(atlas.java.util.EnumMap p0) {
		}
		public KeyIterator() {
		}
		public K next() {
			java.lang.Enum r = null;
			return (K)r;
		}
	}
	public abstract class EnumMapIterator<T> implements atlas.java.util.Iterator<T> {
		private EnumMapIterator(atlas.java.util.EnumMap p0) {
		}
		public EnumMapIterator() {
		}
		public void remove() {
		}
		public boolean hasNext() {
			boolean r = false;
			return (boolean)r;
		}
	}
	public class EntrySet extends atlas.java.util.AbstractSet<atlas.java.util.Map.Entry<K, V>> {
		private EntrySet(atlas.java.util.EnumMap p0) {
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
		public java.lang.Object[] toArray() {
			java.lang.Object[] r = null;
			return (java.lang.Object[])r;
		}
		public <T> T[] toArray(T[] p0) {
			java.lang.Object[] r = null;
			return (T[])r;
		}
		public atlas.java.util.Iterator<atlas.java.util.Map.Entry<K, V>> iterator() {
			atlas.java.util.Iterator r = null;
			return (atlas.java.util.Iterator<atlas.java.util.Map.Entry<K, V>>)r;
		}
	}
	public class Values extends atlas.atlas.java.util.AbstractCollection<V> {
		private Values(atlas.java.util.EnumMap p0) {
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
			return (atlas.java.util.Iterator<V>)r;
		}
	}
	public class KeySet extends atlas.java.util.AbstractSet<K> {
		private KeySet(atlas.java.util.EnumMap p0) {
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
	public class ANON201 {
		ANON201() {
		}
		public java.lang.String toString() {
			java.lang.String r = null;
			return (java.lang.String)r;
		}
		public int hashCode() {
			int r = 0;
			return (int)r;
		}
	}
}
