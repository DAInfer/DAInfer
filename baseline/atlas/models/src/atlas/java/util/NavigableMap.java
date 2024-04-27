package atlas.java.util;
public abstract interface NavigableMap<K,V> extends atlas.java.util.SortedMap<K, V> {
	public abstract atlas.java.util.NavigableMap<K, V> subMap(K p0, boolean p1, K p2, boolean p3);
	public abstract atlas.java.util.SortedMap<K, V> subMap(K p0, K p1);
	public abstract atlas.java.util.NavigableMap<K, V> headMap(K p0, boolean p1);
	public abstract atlas.java.util.SortedMap<K, V> headMap(K p0);
	public abstract atlas.java.util.NavigableMap<K, V> tailMap(K p0, boolean p1);
	public abstract atlas.java.util.SortedMap<K, V> tailMap(K p0);
	public abstract atlas.java.util.NavigableMap<K, V> descendingMap();
	public abstract atlas.java.util.Map.Entry<K, V> ceilingEntry(K p0);
	public abstract K ceilingKey(K p0);
	public abstract atlas.java.util.Map.Entry<K, V> higherEntry(K p0);
	public abstract K higherKey(K p0);
	public abstract atlas.java.util.Map.Entry<K, V> floorEntry(K p0);
	public abstract K floorKey(K p0);
	public abstract atlas.java.util.Map.Entry<K, V> lowerEntry(K p0);
	public abstract K lowerKey(K p0);
	public abstract atlas.java.util.Map.Entry<K, V> firstEntry();
	public abstract atlas.java.util.Map.Entry<K, V> lastEntry();
	public abstract atlas.java.util.Map.Entry<K, V> pollFirstEntry();
	public abstract atlas.java.util.Map.Entry<K, V> pollLastEntry();
	public abstract java.util.NavigableSet<K> navigableKeySet();
	public abstract java.util.NavigableSet<K> descendingKeySet();
}
