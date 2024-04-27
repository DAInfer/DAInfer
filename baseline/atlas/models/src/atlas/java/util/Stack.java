package atlas.java.util;
public class Stack<E> extends atlas.atlas.java.util.Vector<E> {
	public java.lang.Object f31;
	public Stack() {
	}
	public boolean empty() {
		boolean r = false;
		return (boolean)r;
	}
	public E push(E p0) {
		java.lang.Object r = null;
		r = (java.lang.Object)p0;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)p0;
		return (E)r;
	}
	public synchronized E pop() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.Stack)this).f31;
		return (E)r;
	}
	public synchronized E peek() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.Stack)this).f31;
		return (E)r;
	}
	public synchronized int search(java.lang.Object p0) {
		int r = 0;
		return (int)r;
	}
}
