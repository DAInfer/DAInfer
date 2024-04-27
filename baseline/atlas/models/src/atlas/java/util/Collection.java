package atlas.java.util;
public abstract interface Collection<E> extends atlas.java.lang.Iterable<E> {
	public abstract boolean add(E p0);
	public abstract boolean remove(java.lang.Object p0);
	public abstract boolean equals(java.lang.Object p0);
	public abstract int hashCode();
	public abstract void clear();
	public abstract boolean isEmpty();
	public abstract boolean contains(java.lang.Object p0);
	public abstract int size();
	public abstract <T> T[] toArray(T[] p0);
	public abstract java.lang.Object[] toArray();
	public abstract atlas.java.util.Iterator<E> iterator();
	public abstract boolean addAll(atlas.java.util.Collection<? extends E> p0);
	public abstract boolean containsAll(atlas.java.util.Collection<?> p0);
	public abstract boolean removeAll(atlas.java.util.Collection<?> p0);
	public abstract boolean retainAll(atlas.java.util.Collection<?> p0);
}
