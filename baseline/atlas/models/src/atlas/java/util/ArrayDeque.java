package atlas.java.util;
public class ArrayDeque<E> extends atlas.atlas.java.util.AbstractCollection<E> implements atlas.java.util.Deque<E>, java.lang.Cloneable, java.io.Serializable {
	public java.lang.Object f1;
	public ArrayDeque(atlas.java.util.Collection<? extends E> p0) {
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)p0).f15;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedList)p0).f49;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableSet)p0).f8;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedRandomAccessList)p0).f53;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedDeque)p0).f7;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.HashMap.Values)p0).f38;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.Collections.AsLIFOQueue)p0).f57;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableRandomAccessList)p0).f66;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.LinkedList)p0).f19;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.concurrent.PriorityBlockingQueue)p0).f42;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingQueue)p0).f4;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.PriorityQueue)p0).f11;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.LinkedHashSet)p0).f18;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.HashSet)p0).f44;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArrayList)p0).f9;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.ArrayDeque)p0).f1;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.TreeSet)p0).f28;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.ArrayList)p0).f27;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.Collections.SingletonList)p0).f150;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArraySet)p0).f26;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableCollection)p0).f52;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.Collections.SingletonSet)p0).f147;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.concurrent.LinkedTransferQueue)p0).f12;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.Stack)p0).f31;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedQueue)p0).f14;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)p0).f10;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.Vector)p0).f36;
	}
	public ArrayDeque() {
	}
	public boolean offer(E p0) {
		boolean r = false;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)p0;
		return (boolean)r;
	}
	public void addFirst(E p0) {
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)p0;
	}
	public void addLast(E p0) {
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)p0;
	}
	public boolean offerFirst(E p0) {
		boolean r = false;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)p0;
		return (boolean)r;
	}
	public boolean offerLast(E p0) {
		boolean r = false;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)p0;
		return (boolean)r;
	}
	public E removeLast() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.ArrayDeque)this).f1;
		return (E)r;
	}
	public E pollFirst() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.ArrayDeque)this).f1;
		return (E)r;
	}
	public E pollLast() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.ArrayDeque)this).f1;
		return (E)r;
	}
	public E getLast() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.ArrayDeque)this).f1;
		return (E)r;
	}
	public E peekFirst() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.ArrayDeque)this).f1;
		return (E)r;
	}
	public E peekLast() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.ArrayDeque)this).f1;
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
		r = new atlas.java.util.ArrayDeque.DescendingIterator();
		((atlas.java.util.ArrayDeque.DescendingIterator)r).f141 = (java.lang.Object)((atlas.java.util.ArrayDeque)this).f1;
		return (atlas.java.util.Iterator<E>)r;
	}
	public E removeFirst() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.ArrayDeque)this).f1;
		return (E)r;
	}
	public boolean add(E p0) {
		boolean r = false;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)p0;
		return (boolean)r;
	}
	public boolean remove(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public E remove() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.ArrayDeque)this).f1;
		return (E)r;
	}
	public atlas.java.util.ArrayDeque<E> clone() {
		atlas.java.util.ArrayDeque r = null;
		r = new atlas.java.util.ArrayDeque();
		((atlas.java.util.ArrayDeque)r).f1 = (java.lang.Object)((atlas.java.util.ArrayDeque)this).f1;
		return (atlas.java.util.ArrayDeque<E>)r;
	}
	public void clear() {
	}
	public boolean isEmpty() {
		boolean r = false;
		return (boolean)r;
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
		r = new java.lang.Object[1];
		((java.lang.Object[])r)[0] = (java.lang.Object)((atlas.java.util.ArrayDeque)this).f1;
		r = (java.lang.Object[])p0;
		return (T[])r;
	}
	public java.lang.Object[] toArray() {
		java.lang.Object[] r = null;
		r = new java.lang.Object[1];
		((java.lang.Object[])r)[0] = (java.lang.Object)((atlas.java.util.ArrayDeque)this).f1;
		return (java.lang.Object[])r;
	}
	public atlas.java.util.Iterator<E> iterator() {
		atlas.java.util.Iterator r = null;
		r = new atlas.java.util.ArrayDeque.DeqIterator();
		((atlas.java.util.ArrayDeque.DeqIterator)r).f131 = (java.lang.Object)((atlas.java.util.ArrayDeque)this).f1;
		return (atlas.java.util.Iterator<E>)r;
	}
	public E getFirst() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.ArrayDeque)this).f1;
		return (E)r;
	}
	public void push(E p0) {
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)p0;
	}
	public E pop() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.ArrayDeque)this).f1;
		return (E)r;
	}
	public E poll() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.ArrayDeque)this).f1;
		return (E)r;
	}
	public E peek() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.ArrayDeque)this).f1;
		return (E)r;
	}
	public E element() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.ArrayDeque)this).f1;
		return (E)r;
	}
	public static final class DeqSpliterator<E> {
		public DeqSpliterator() {
		}
		public atlas.java.util.ArrayDeque.DeqSpliterator<E> trySplit() {
			atlas.java.util.ArrayDeque.DeqSpliterator r = null;
			return (atlas.java.util.ArrayDeque.DeqSpliterator<E>)r;
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
	public class DescendingIterator implements atlas.java.util.Iterator<E> {
		public java.lang.Object f141;
		private DescendingIterator(atlas.java.util.ArrayDeque p0) {
		}
		public DescendingIterator() {
		}
		public void remove() {
		}
		public E next() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.ArrayDeque.DescendingIterator)this).f141;
			return (E)r;
		}
		public boolean hasNext() {
			boolean r = false;
			return (boolean)r;
		}
	}
	public class DeqIterator implements atlas.java.util.Iterator<E> {
		public java.lang.Object f131;
		private DeqIterator(atlas.java.util.ArrayDeque p0) {
		}
		public DeqIterator() {
		}
		public void remove() {
		}
		public E next() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.ArrayDeque.DeqIterator)this).f131;
			return (E)r;
		}
		public boolean hasNext() {
			boolean r = false;
			return (boolean)r;
		}
	}
	public class ANON24 {
		ANON24() {
		}
	}
}
