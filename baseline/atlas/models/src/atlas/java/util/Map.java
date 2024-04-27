package atlas.java.util;
public abstract interface Map<K,V> {
	public abstract V remove(java.lang.Object p0);
	public abstract V get(java.lang.Object p0);
	public abstract V put(K p0, V p1);
	public abstract boolean equals(java.lang.Object p0);
	public abstract atlas.java.util.Collection<V> values();
	public abstract int hashCode();
	public abstract void clear();
	public abstract boolean isEmpty();
	public abstract int size();
	public abstract java.util.Set<atlas.java.util.Map.Entry<K, V>> entrySet();
	public abstract void putAll(atlas.java.util.Map<? extends K, ? extends V> p0);
	public abstract java.util.Set<K> keySet();
	public abstract boolean containsValue(java.lang.Object p0);
	public abstract boolean containsKey(java.lang.Object p0);
	public abstract static interface Entry<K,V> {
		public abstract boolean equals(java.lang.Object p0);
		public abstract int hashCode();
		public abstract V getValue();
		public abstract K getKey();
		public abstract V setValue(V p0);
	}
}
