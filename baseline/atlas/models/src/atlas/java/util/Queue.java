package atlas.java.util;
public abstract interface Queue<E> extends atlas.java.util.Collection<E> {
	public abstract boolean offer(E p0);
	public abstract boolean add(E p0);
	public abstract E remove();
	public abstract E poll();
	public abstract E peek();
	public abstract E element();
}
