package atlas.java.util;
public abstract interface List<E> extends atlas.java.util.Collection<E> {
	public abstract boolean add(E p0);
	public abstract void add(int p0, E p1);
	public abstract boolean remove(java.lang.Object p0);
	public abstract E remove(int p0);
	public abstract E get(int p0);
	public abstract boolean equals(java.lang.Object p0);
	public abstract int hashCode();
	public abstract int indexOf(java.lang.Object p0);
	public abstract void clear();
	public abstract boolean isEmpty();
	public abstract int lastIndexOf(java.lang.Object p0);
	public abstract boolean contains(java.lang.Object p0);
	public abstract int size();
	public abstract atlas.java.util.List<E> subList(int p0, int p1);
	public abstract java.lang.Object[] toArray();
	public abstract <T> T[] toArray(T[] p0);
	public abstract atlas.java.util.Iterator<E> iterator();
	public abstract boolean addAll(atlas.java.util.Collection<? extends E> p0);
	public abstract boolean addAll(int p0, atlas.java.util.Collection<? extends E> p1);
	public abstract E set(int p0, E p1);
	public abstract boolean containsAll(atlas.java.util.Collection<?> p0);
	public abstract boolean removeAll(atlas.java.util.Collection<?> p0);
	public abstract boolean retainAll(atlas.java.util.Collection<?> p0);
	public abstract atlas.atlas.java.util.ListIterator<E> listIterator(int p0);
	public abstract atlas.atlas.java.util.ListIterator<E> listIterator();
}
