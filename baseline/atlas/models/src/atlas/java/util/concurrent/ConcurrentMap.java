package atlas.java.util.concurrent;
public abstract interface ConcurrentMap<K,V> extends atlas.java.util.Map<K, V> {
	public abstract boolean remove(java.lang.Object p0, java.lang.Object p1);
	public abstract boolean replace(K p0, V p1, V p2);
	public abstract V replace(K p0, V p1);
	public abstract V putIfAbsent(K p0, V p1);
}
