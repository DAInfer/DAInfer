package atlas.java.util;
public abstract class Dictionary<K,V> {
	public Dictionary() {
	}
	public abstract V remove(java.lang.Object p0);
	public abstract V get(java.lang.Object p0);
	public abstract V put(K p0, V p1);
	public abstract boolean isEmpty();
	public abstract java.util.Enumeration<V> elements();
	public abstract int size();
	public abstract java.util.Enumeration<K> keys();
}
