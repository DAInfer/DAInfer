package atlas.java.util;
public abstract class AbstractSequentialList<E> extends atlas.atlas.java.util.AbstractList<E> {
	public AbstractSequentialList() {
	}
	public void add(int p0, E p1) {
	}
	public E remove(int p0) {
		java.lang.Object r = null;
		return (E)r;
	}
	public E get(int p0) {
		java.lang.Object r = null;
		return (E)r;
	}
	public atlas.java.util.Iterator<E> iterator() {
		atlas.java.util.Iterator r = null;
		r = new atlas.java.util.LinkedList.ListItr();
		((atlas.java.util.LinkedList.ListItr)r).f137 = (java.lang.Object)((atlas.java.util.LinkedList)this).f19;
		return (atlas.java.util.Iterator<E>)r;
	}
	public boolean addAll(int p0, atlas.java.util.Collection<? extends E> p1) {
		boolean r = false;
		return (boolean)r;
	}
	public E set(int p0, E p1) {
		java.lang.Object r = null;
		return (E)r;
	}
	public abstract atlas.atlas.java.util.ListIterator<E> listIterator(int p0);
}
