package atlas.java.util;
public class LinkedList<E> extends atlas.atlas.java.util.AbstractSequentialList<E> implements atlas.java.util.List<E>, atlas.java.util.Deque<E>, java.lang.Cloneable, java.io.Serializable {
	public java.lang.Object f19;
	public LinkedList(atlas.java.util.Collection<? extends E> p0) {
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.ArrayList)p0).f27;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.ArrayDeque)p0).f1;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.TreeSet)p0).f28;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedQueue)p0).f14;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.LinkedList)p0).f19;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.Collections.SingletonSet)p0).f147;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArrayList)p0).f9;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)p0).f10;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.PriorityQueue)p0).f11;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.concurrent.LinkedTransferQueue)p0).f12;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.Vector)p0).f36;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableRandomAccessList)p0).f66;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArraySet)p0).f26;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableCollection)p0).f52;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.Collections.SingletonList)p0).f150;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedDeque)p0).f7;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)p0).f15;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingQueue)p0).f4;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.concurrent.PriorityBlockingQueue)p0).f42;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.LinkedHashSet)p0).f18;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.HashSet)p0).f44;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableList)p0).f72;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.Stack)p0).f31;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedSet)p0).f73;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedCollection)p0).f2;
	}
	public LinkedList() {
	}
	public boolean offer(E p0) {
		boolean r = false;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)p0;
		return (boolean)r;
	}
	public void addFirst(E p0) {
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)p0;
	}
	public void addLast(E p0) {
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)p0;
	}
	public boolean offerFirst(E p0) {
		boolean r = false;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)p0;
		return (boolean)r;
	}
	public boolean offerLast(E p0) {
		boolean r = false;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)p0;
		return (boolean)r;
	}
	public E removeLast() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.LinkedList)this).f19;
		return (E)r;
	}
	public E pollFirst() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.LinkedList)this).f19;
		return (E)r;
	}
	public E pollLast() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.LinkedList)this).f19;
		return (E)r;
	}
	public E getLast() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.LinkedList)this).f19;
		return (E)r;
	}
	public E peekFirst() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.LinkedList)this).f19;
		return (E)r;
	}
	public E peekLast() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.LinkedList)this).f19;
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
		r = new atlas.java.util.LinkedList.DescendingIterator();
		((atlas.java.util.LinkedList.DescendingIterator)r).f146 = (java.lang.Object)((atlas.java.util.LinkedList)this).f19;
		return (atlas.java.util.Iterator<E>)r;
	}
	public E removeFirst() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.LinkedList)this).f19;
		return (E)r;
	}
	public void add(int p0, E p1) {
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)p1;
	}
	public boolean add(E p0) {
		boolean r = false;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)p0;
		return (boolean)r;
	}
	public E remove() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.LinkedList)this).f19;
		return (E)r;
	}
	public boolean remove(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public E remove(int p0) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.LinkedList)this).f19;
		return (E)r;
	}
	public E get(int p0) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.LinkedList)this).f19;
		return (E)r;
	}
	public java.lang.Object clone() {
		java.lang.Object r = null;
		r = new atlas.java.util.LinkedList();
		((atlas.java.util.LinkedList)r).f19 = (java.lang.Object)((atlas.java.util.LinkedList)this).f19;
		return (java.lang.Object)r;
	}
	public int indexOf(java.lang.Object p0) {
		int r = 0;
		return (int)r;
	}
	public void clear() {
	}
	public int lastIndexOf(java.lang.Object p0) {
		int r = 0;
		return (int)r;
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
		((java.lang.Object[])r)[0] = (java.lang.Object)((atlas.java.util.LinkedList)this).f19;
		r = (java.lang.Object[])p0;
		return (T[])r;
	}
	public java.lang.Object[] toArray() {
		java.lang.Object[] r = null;
		r = new java.lang.Object[1];
		((java.lang.Object[])r)[0] = (java.lang.Object)((atlas.java.util.LinkedList)this).f19;
		return (java.lang.Object[])r;
	}
	public boolean addAll(atlas.java.util.Collection<? extends E> p0) {
		boolean r = false;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedDeque)p0).f7;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)p0).f10;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedCollection)p0).f2;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingQueue)p0).f4;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.concurrent.LinkedTransferQueue)p0).f12;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.Stack)p0).f31;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.Collections.SingletonSet)p0).f147;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.ArrayDeque)p0).f1;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.ArrayList)p0).f27;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.Collections.SingletonList)p0).f150;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.TreeSet)p0).f28;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArrayList)p0).f9;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)p0).f15;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.HashSet)p0).f44;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.PriorityQueue)p0).f11;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedQueue)p0).f14;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.LinkedHashSet)p0).f18;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArraySet)p0).f26;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.LinkedList)p0).f19;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.Vector)p0).f36;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.concurrent.PriorityBlockingQueue)p0).f42;
		return (boolean)r;
	}
	public boolean addAll(int p0, atlas.java.util.Collection<? extends E> p1) {
		boolean r = false;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.Stack)p1).f31;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.LinkedHashSet)p1).f18;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)p1).f10;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.concurrent.LinkedTransferQueue)p1).f12;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.LinkedList)p1).f19;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedQueue)p1).f14;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArraySet)p1).f26;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.ArrayList)p1).f27;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.Collections.SingletonSet)p1).f147;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArrayList)p1).f9;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)p1).f15;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.HashSet)p1).f44;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.Vector)p1).f36;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.PriorityQueue)p1).f11;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedCollection)p1).f2;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.TreeSet)p1).f28;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableCollection)p1).f52;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableSet)p1).f8;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.concurrent.PriorityBlockingQueue)p1).f42;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.Collections.SingletonList)p1).f150;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingQueue)p1).f4;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.LinkedHashMap.LinkedValues)p1).f82;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedDeque)p1).f7;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.ArrayDeque)p1).f1;
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableRandomAccessList)p1).f66;
		return (boolean)r;
	}
	public E getFirst() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.LinkedList)this).f19;
		return (E)r;
	}
	public void push(E p0) {
		((atlas.java.util.LinkedList)this).f19 = (java.lang.Object)p0;
	}
	public E pop() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.LinkedList)this).f19;
		return (E)r;
	}
	public E poll() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.LinkedList)this).f19;
		return (E)r;
	}
	public E set(int p0, E p1) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.LinkedList)this).f19;
		return (E)r;
	}
	public E peek() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.LinkedList)this).f19;
		return (E)r;
	}
	public E element() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.LinkedList)this).f19;
		return (E)r;
	}
	public atlas.atlas.java.util.ListIterator<E> listIterator(int p0) {
		atlas.java.util.ListIterator r = null;
		r = new atlas.java.util.LinkedList.ListItr();
		((atlas.java.util.LinkedList.ListItr)r).f137 = (java.lang.Object)((atlas.java.util.LinkedList)this).f19;
		return (atlas.atlas.java.util.ListIterator<E>)r;
	}
	public static final class LLSpliterator<E> {
		public LLSpliterator() {
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
		public java.lang.Object f146;
		private DescendingIterator(atlas.atlas.java.util.LinkedList p0) {
		}
		public DescendingIterator() {
		}
		public void remove() {
		}
		public E next() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.LinkedList.DescendingIterator)this).f146;
			return (E)r;
		}
		public boolean hasNext() {
			boolean r = false;
			return (boolean)r;
		}
	}
	public static class Node<E> {
		Node(atlas.atlas.java.util.LinkedList.Node<E> p0, E p1, atlas.atlas.java.util.LinkedList.Node<E> p2) {
		}
		public Node() {
		}
	}
	public class ListItr implements atlas.atlas.java.util.ListIterator<E> {
		public java.lang.Object f137;
		public ListItr() {
		}
		public void add(E p0) {
		}
		public void remove() {
		}
		public E next() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.LinkedList.ListItr)this).f137;
			return (E)r;
		}
		public boolean hasNext() {
			boolean r = false;
			return (boolean)r;
		}
		public void set(E p0) {
		}
		public int previousIndex() {
			int r = 0;
			return (int)r;
		}
		public boolean hasPrevious() {
			boolean r = false;
			return (boolean)r;
		}
		public E previous() {
			java.lang.Object r = null;
			return (E)r;
		}
		public int nextIndex() {
			int r = 0;
			return (int)r;
		}
	}
	public class ANON361 {
		ANON361() {
		}
	}
}
