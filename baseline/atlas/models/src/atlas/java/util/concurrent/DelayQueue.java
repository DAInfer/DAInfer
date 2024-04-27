package atlas.java.util.concurrent;
public class DelayQueue<E> extends atlas.java.util.AbstractQueue<E> implements java.util.concurrent.BlockingQueue<E> {
	public DelayQueue(atlas.java.util.Collection<? extends E> p0) {
	}
	public DelayQueue() {
	}
	public int remainingCapacity() {
		int r = 0;
		return (int)r;
	}
	public int drainTo(atlas.java.util.Collection<? super E> p0) {
		int r = 0;
		return (int)r;
	}
	public int drainTo(atlas.java.util.Collection<? super E> p0, int p1) {
		int r = 0;
		return (int)r;
	}
	public boolean offer(E p0, long p1, java.util.concurrent.TimeUnit p2) {
		boolean r = false;
		return (boolean)r;
	}
	public boolean offer(E p0) {
		boolean r = false;
		return (boolean)r;
	}
	public E take() {
		java.util.concurrent.Delayed r = null;
		return (E)r;
	}
	public boolean add(E p0) {
		boolean r = false;
		return (boolean)r;
	}
	public boolean remove(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public void put(E p0) {
	}
	public void clear() {
	}
	public int size() {
		int r = 0;
		return (int)r;
	}
	public java.lang.Object[] toArray() {
		java.lang.Object[] r = null;
		r = new java.lang.Object[1];
		return (java.lang.Object[])r;
	}
	public <T> T[] toArray(T[] p0) {
		java.lang.Object[] r = null;
		r = (java.lang.Object[])p0;
		return (T[])r;
	}
	public atlas.java.util.Iterator<E> iterator() {
		atlas.java.util.Iterator r = null;
		r = new atlas.java.util.concurrent.DelayQueue.Itr();
		return (atlas.java.util.Iterator<E>)r;
	}
	public E poll() {
		java.util.concurrent.Delayed r = null;
		return (E)r;
	}
	public E poll(long p0, java.util.concurrent.TimeUnit p1) {
		java.util.concurrent.Delayed r = null;
		return (E)r;
	}
	public E peek() {
		java.util.concurrent.Delayed r = null;
		return (E)r;
	}
	public class Itr implements atlas.java.util.Iterator<E> {
		public Itr() {
		}
		public void remove() {
		}
		public E next() {
			java.util.concurrent.Delayed r = null;
			return (E)r;
		}
		public boolean hasNext() {
			boolean r = false;
			return (boolean)r;
		}
	}
}
