package atlas.java.util.concurrent;
public class LinkedBlockingDeque<E> extends atlas.java.util.AbstractQueue<E> implements java.util.concurrent.BlockingDeque<E>, java.io.Serializable {
	public java.lang.Object f15;
	public LinkedBlockingDeque(atlas.java.util.Collection<? extends E> p0) {
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)((atlas.java.util.concurrent.LinkedTransferQueue)p0).f12;
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArraySet)p0).f26;
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)((atlas.java.util.LinkedHashSet)p0).f18;
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)p0).f10;
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableRandomAccessList)p0).f66;
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)((atlas.java.util.Stack)p0).f31;
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)p0).f15;
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)((atlas.java.util.Collections.SingletonSet)p0).f147;
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)((atlas.java.util.ArrayList)p0).f27;
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)((atlas.java.util.TreeSet)p0).f28;
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedSet)p0).f73;
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)((atlas.java.util.concurrent.PriorityBlockingQueue)p0).f42;
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)((atlas.java.util.LinkedList)p0).f19;
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedCollection)p0).f2;
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)((atlas.java.util.Vector)p0).f36;
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)((atlas.java.util.HashSet)p0).f44;
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)((atlas.java.util.Collections.AsLIFOQueue)p0).f57;
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)((atlas.java.util.PriorityQueue)p0).f11;
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableCollection)p0).f52;
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArrayList)p0).f9;
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingQueue)p0).f4;
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)((atlas.java.util.ArrayDeque)p0).f1;
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableSet)p0).f8;
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedRandomAccessList)p0).f53;
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)((atlas.java.util.Collections.SingletonList)p0).f150;
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedDeque)p0).f7;
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedQueue)p0).f14;
	}
	public LinkedBlockingDeque() {
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
	public void putFirst(E p0) {
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)p0;
	}
	public void putLast(E p0) {
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)p0;
	}
	public E takeFirst() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15;
		return (E)r;
	}
	public E takeLast() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15;
		return (E)r;
	}
	public boolean offer(E p0, long p1, java.util.concurrent.TimeUnit p2) {
		boolean r = false;
		return (boolean)r;
	}
	public boolean offer(E p0) {
		boolean r = false;
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)p0;
		return (boolean)r;
	}
	public void addFirst(E p0) {
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)p0;
	}
	public void addLast(E p0) {
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)p0;
	}
	public boolean offerFirst(E p0, long p1, java.util.concurrent.TimeUnit p2) {
		boolean r = false;
		return (boolean)r;
	}
	public boolean offerFirst(E p0) {
		boolean r = false;
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)p0;
		return (boolean)r;
	}
	public boolean offerLast(E p0) {
		boolean r = false;
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)p0;
		return (boolean)r;
	}
	public boolean offerLast(E p0, long p1, java.util.concurrent.TimeUnit p2) {
		boolean r = false;
		return (boolean)r;
	}
	public E removeLast() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15;
		return (E)r;
	}
	public E pollFirst(long p0, java.util.concurrent.TimeUnit p1) {
		java.lang.Object r = null;
		return (E)r;
	}
	public E pollFirst() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15;
		return (E)r;
	}
	public E pollLast(long p0, java.util.concurrent.TimeUnit p1) {
		java.lang.Object r = null;
		return (E)r;
	}
	public E pollLast() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15;
		return (E)r;
	}
	public E getLast() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15;
		return (E)r;
	}
	public E peekFirst() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15;
		return (E)r;
	}
	public E peekLast() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15;
		return (E)r;
	}
	public boolean removeFirstOccurrence(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public boolean removeLastOccurrence(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public atlas.java.util.Iterator<E> descendingIterator() {
		atlas.java.util.Iterator r = null;
		r = new atlas.java.util.concurrent.LinkedBlockingDeque.DescendingItr();
		((atlas.java.util.concurrent.LinkedBlockingDeque.DescendingItr)r).f84 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15;
		return (atlas.java.util.Iterator<E>)r;
	}
	public E take() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15;
		return (E)r;
	}
	public E removeFirst() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15;
		return (E)r;
	}
	public boolean add(E p0) {
		boolean r = false;
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)p0;
		return (boolean)r;
	}
	public E remove() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15;
		return (E)r;
	}
	public boolean remove(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public void put(E p0) {
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)p0;
	}
	public java.lang.String toString() {
		java.lang.String r = null;
		r = new java.lang.String();
		return (java.lang.String)r;
	}
	public void clear() {
	}
	public boolean contains(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public int size() {
		int r = 0;
		return (int)r;
	}
	public <T> T[] toArray(T[] p0) {
		java.lang.Object[] r = null;
		r = (java.lang.Object[])p0;
		return (T[])r;
	}
	public java.lang.Object[] toArray() {
		java.lang.Object[] r = null;
		r = new java.lang.Object[1];
		((java.lang.Object[])r)[0] = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15;
		return (java.lang.Object[])r;
	}
	public atlas.java.util.Iterator<E> iterator() {
		atlas.java.util.Iterator r = null;
		r = new atlas.java.util.concurrent.LinkedBlockingDeque.Itr();
		((atlas.java.util.concurrent.LinkedBlockingDeque.Itr)r).f90 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15;
		return (atlas.java.util.Iterator<E>)r;
	}
	public E getFirst() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15;
		return (E)r;
	}
	public void push(E p0) {
		((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15 = (java.lang.Object)p0;
	}
	public E pop() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15;
		return (E)r;
	}
	public E poll(long p0, java.util.concurrent.TimeUnit p1) {
		java.lang.Object r = null;
		return (E)r;
	}
	public E poll() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15;
		return (E)r;
	}
	public E peek() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15;
		return (E)r;
	}
	public E element() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)this).f15;
		return (E)r;
	}
	public static final class LBDSpliterator<E> {
		LBDSpliterator(atlas.java.util.concurrent.LinkedBlockingDeque<E> p0) {
		}
		public LBDSpliterator() {
		}
		public long estimateSize() {
			long r = 0;
			return (long)r;
		}
		public int characteristics() {
			int r = 0;
			return (int)r;
		}
	}
	public class DescendingItr extends atlas.java.util.concurrent.LinkedBlockingDeque<E>.AbstractItr {
		public java.lang.Object f84;
		private DescendingItr(atlas.java.util.concurrent.LinkedBlockingDeque p0) {
		}
		public DescendingItr() {
		}
	}
	public class Itr extends atlas.java.util.concurrent.LinkedBlockingDeque<E>.AbstractItr {
		public java.lang.Object f90;
		private Itr(atlas.java.util.concurrent.LinkedBlockingDeque p0) {
		}
		public Itr() {
		}
	}
	public abstract class AbstractItr implements atlas.java.util.Iterator<E> {
		AbstractItr(atlas.java.util.concurrent.LinkedBlockingDeque p0) {
		}
		public AbstractItr() {
		}
		public void remove() {
		}
		public E next() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque.DescendingItr)this).f84;
			r = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque.Itr)this).f90;
			return (E)r;
		}
		public boolean hasNext() {
			boolean r = false;
			return (boolean)r;
		}
	}
	public static final class Node<E> {
		Node(E p0) {
		}
		public Node() {
		}
	}
	public class ANON81 {
		ANON81() {
		}
	}
}
