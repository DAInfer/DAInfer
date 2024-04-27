package atlas.java.util;
public abstract interface ListIterator<E> extends atlas.java.util.Iterator<E> {
	public abstract void add(E p0);
	public abstract void remove();
	public abstract E next();
	public abstract boolean hasNext();
	public abstract void set(E p0);
	public abstract int previousIndex();
	public abstract boolean hasPrevious();
	public abstract E previous();
	public abstract int nextIndex();
}
