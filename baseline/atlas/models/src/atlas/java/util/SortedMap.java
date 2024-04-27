package atlas.java.util;
public abstract interface SortedMap<K,V> extends atlas.java.util.Map<K, V> {
	public abstract K lastKey();
	public abstract atlas.java.util.SortedMap<K, V> subMap(K p0, K p1);
	public abstract atlas.java.util.SortedMap<K, V> headMap(K p0);
	public abstract atlas.java.util.SortedMap<K, V> tailMap(K p0);
	public abstract atlas.java.util.Collection<V> values();
	public abstract java.util.Set<atlas.java.util.Map.Entry<K, V>> entrySet();
	public abstract java.util.Set<K> keySet();
	public abstract java.util.Comparator<? super K> comparator();
	public abstract K firstKey();
}
