package atlas.java.util;
public class Vector<E> extends atlas.atlas.java.util.AbstractList<E> implements atlas.java.util.List<E>, java.util.RandomAccess, java.lang.Cloneable, java.io.Serializable {
	public java.lang.Object f36;
	public Vector(atlas.java.util.Collection<? extends E> p0) {
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.Vector)p0).f36;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.concurrent.LinkedTransferQueue)p0).f12;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.PriorityQueue)p0).f11;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArraySet)p0).f26;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableCollection)p0).f52;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.HashSet)p0).f44;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.Collections.AsLIFOQueue)p0).f57;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.LinkedHashSet)p0).f18;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedDeque)p0).f7;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedCollection)p0).f2;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.Stack)p0).f31;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.Collections.SingletonSet)p0).f147;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingQueue)p0).f4;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.Collections.SingletonList)p0).f150;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableRandomAccessList)p0).f66;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.TreeSet)p0).f28;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.ArrayList)p0).f27;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.ArrayDeque)p0).f1;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)p0).f15;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArrayList)p0).f9;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.LinkedList)p0).f19;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedQueue)p0).f14;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)p0).f10;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.concurrent.PriorityBlockingQueue)p0).f42;
	}
	public Vector() {
	}
	public synchronized boolean add(E p0) {
		boolean r = false;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)p0;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)p0;
		return (boolean)r;
	}
	public void add(int p0, E p1) {
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)p1;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)p1;
	}
	public boolean remove(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public synchronized E remove(int p0) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.Vector)this).f36;
		r = (java.lang.Object)((atlas.java.util.Stack)this).f31;
		return (E)r;
	}
	public synchronized E get(int p0) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.Vector)this).f36;
		r = (java.lang.Object)((atlas.java.util.Stack)this).f31;
		return (E)r;
	}
	public synchronized boolean equals(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public synchronized java.lang.String toString() {
		java.lang.String r = null;
		r = new java.lang.String();
		return (java.lang.String)r;
	}
	public synchronized int hashCode() {
		int r = 0;
		return (int)r;
	}
	public synchronized java.lang.Object clone() {
		java.lang.Object r = null;
		r = new atlas.java.util.Vector();
		r = new atlas.java.util.Stack();
		((atlas.java.util.Vector)r).f36 = (java.lang.Object)((atlas.java.util.Vector)this).f36;
		((atlas.java.util.Stack)r).f31 = (java.lang.Object)((atlas.java.util.Stack)this).f31;
		return (java.lang.Object)r;
	}
	public synchronized int indexOf(java.lang.Object p0, int p1) {
		int r = 0;
		return (int)r;
	}
	public int indexOf(java.lang.Object p0) {
		int r = 0;
		return (int)r;
	}
	public void clear() {
	}
	public synchronized boolean isEmpty() {
		boolean r = false;
		return (boolean)r;
	}
	public synchronized int lastIndexOf(java.lang.Object p0, int p1) {
		int r = 0;
		return (int)r;
	}
	public synchronized int lastIndexOf(java.lang.Object p0) {
		int r = 0;
		return (int)r;
	}
	public boolean contains(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public java.util.Enumeration<E> elements() {
		java.util.Enumeration r = null;
		r = new ANON2();
		((ANON2)r).f65 = (java.lang.Object)((atlas.java.util.Vector)this).f36;
		((ANON2)r).f65 = (java.lang.Object)((atlas.java.util.Stack)this).f31;
		return (java.util.Enumeration<E>)r;
	}
	public synchronized int size() {
		int r = 0;
		return (int)r;
	}
	public synchronized atlas.java.util.List<E> subList(int p0, int p1) {
		atlas.java.util.List r = null;
		return (atlas.java.util.List<E>)r;
	}
	public synchronized java.lang.Object[] toArray() {
		java.lang.Object[] r = null;
		r = new java.lang.Object[1];
		((java.lang.Object[])r)[0] = (java.lang.Object)((atlas.java.util.Vector)this).f36;
		((java.lang.Object[])r)[0] = (java.lang.Object)((atlas.java.util.Stack)this).f31;
		return (java.lang.Object[])r;
	}
	public synchronized <T> T[] toArray(T[] p0) {
		java.lang.Object[] r = null;
		r = new java.lang.Object[1];
		r = (java.lang.Object[])p0;
		((java.lang.Object[])r)[0] = (java.lang.Object)((atlas.java.util.Stack)this).f31;
		return (T[])r;
	}
	public synchronized atlas.java.util.Iterator<E> iterator() {
		atlas.java.util.Iterator r = null;
		r = new atlas.java.util.Vector.Itr();
		((atlas.java.util.Vector.Itr)r).f159 = (java.lang.Object)((atlas.java.util.Stack)this).f31;
		((atlas.java.util.Vector.Itr)r).f159 = (java.lang.Object)((atlas.java.util.Vector)this).f36;
		return (atlas.java.util.Iterator<E>)r;
	}
	public synchronized boolean addAll(atlas.java.util.Collection<? extends E> p0) {
		boolean r = false;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.HashSet)p0).f44;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedCollection)p0).f2;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.ArrayList)p0).f27;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.LinkedList)p0).f19;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.TreeSet)p0).f28;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedQueue)p0).f14;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableCollection)p0).f52;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.Collections.AsLIFOQueue)p0).f57;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableRandomAccessList)p0).f66;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedDeque)p0).f7;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingQueue)p0).f4;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.concurrent.PriorityBlockingQueue)p0).f42;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedRandomAccessList)p0).f53;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.Collections.SingletonList)p0).f150;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.ArrayDeque)p0).f1;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.PriorityQueue)p0).f11;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArrayList)p0).f9;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)p0).f15;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.LinkedHashSet)p0).f18;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArraySet)p0).f26;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableList)p0).f72;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.concurrent.LinkedTransferQueue)p0).f12;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.concurrent.LinkedTransferQueue)p0).f12;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArraySet)p0).f26;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.Collections.SingletonList)p0).f150;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)p0).f10;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.Vector)p0).f36;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap.KeySetView)p0).f134;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArrayList)p0).f9;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.PriorityQueue)p0).f11;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableCollection)p0).f52;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.TreeSet)p0).f28;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.Vector)p0).f36;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedQueue)p0).f14;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.Collections.SingletonSet)p0).f147;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)p0).f10;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.ArrayList)p0).f27;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.HashSet)p0).f44;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)p0).f15;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.Stack)p0).f31;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedNavigableSet)p0).f97;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.LinkedHashSet)p0).f18;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.LinkedList)p0).f19;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingQueue)p0).f4;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.concurrent.PriorityBlockingQueue)p0).f42;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.Collections.SingletonSet)p0).f147;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedDeque)p0).f7;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.Stack)p0).f31;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.ArrayDeque)p0).f1;
		return (boolean)r;
	}
	public synchronized boolean addAll(int p0, atlas.java.util.Collection<? extends E> p1) {
		boolean r = false;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.concurrent.PriorityBlockingQueue)p1).f42;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableSet)p1).f8;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.concurrent.PriorityBlockingQueue)p1).f42;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingQueue)p1).f4;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)p1).f15;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.IdentityHashMap.KeySet)p1).f165;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingQueue)p1).f4;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)p1).f15;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.Stack)p1).f31;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.concurrent.LinkedTransferQueue)p1).f12;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.LinkedHashSet)p1).f18;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.Vector)p1).f36;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.PriorityQueue)p1).f11;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArraySet)p1).f26;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableCollection)p1).f52;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.HashSet)p1).f44;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)p1).f10;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedCollection)p1).f2;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedDeque)p1).f7;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.WeakHashMap.Values)p1).f133;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedQueue)p1).f14;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.Collections.AsLIFOQueue)p1).f57;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.ArrayList)p1).f27;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.TreeSet)p1).f28;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.ArrayList)p1).f27;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.ArrayDeque)p1).f1;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.TreeSet)p1).f28;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.ArrayDeque)p1).f1;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedQueue)p1).f14;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.LinkedList)p1).f19;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.Collections.SingletonList)p1).f150;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableSortedSet)p1).f169;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)p1).f10;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.Collections.SingletonSet)p1).f147;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArrayList)p1).f9;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.Stack)p1).f31;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArrayList)p1).f9;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.Collections.SingletonSet)p1).f147;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.HashSet)p1).f44;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArraySet)p1).f26;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.HashMap.KeySet)p1).f78;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.PriorityQueue)p1).f11;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.LinkedHashSet)p1).f18;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.Vector)p1).f36;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedDeque)p1).f7;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.LinkedList)p1).f19;
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedCollection)p1).f2;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)((atlas.java.util.concurrent.LinkedTransferQueue)p1).f12;
		return (boolean)r;
	}
	public synchronized void addElement(E p0) {
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)p0;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)p0;
	}
	public synchronized E elementAt(int p0) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.Vector)this).f36;
		r = (java.lang.Object)((atlas.java.util.Stack)this).f31;
		return (E)r;
	}
	public synchronized E set(int p0, E p1) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.Vector)this).f36;
		r = (java.lang.Object)((atlas.java.util.Stack)this).f31;
		return (E)r;
	}
	public synchronized int capacity() {
		int r = 0;
		return (int)r;
	}
	public synchronized void ensureCapacity(int p0) {
	}
	public synchronized void trimToSize() {
	}
	public synchronized void copyInto(java.lang.Object[] p0) {
	}
	public synchronized void setSize(int p0) {
	}
	public synchronized E firstElement() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.Vector)this).f36;
		r = (java.lang.Object)((atlas.java.util.Stack)this).f31;
		return (E)r;
	}
	public synchronized E lastElement() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.Vector)this).f36;
		r = (java.lang.Object)((atlas.java.util.Stack)this).f31;
		return (E)r;
	}
	public synchronized void setElementAt(E p0, int p1) {
	}
	public synchronized void removeElementAt(int p0) {
	}
	public synchronized void insertElementAt(E p0, int p1) {
		((atlas.java.util.Stack)this).f31 = (java.lang.Object)p0;
		((atlas.java.util.Vector)this).f36 = (java.lang.Object)p0;
	}
	public synchronized boolean removeElement(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public synchronized void removeAllElements() {
	}
	public synchronized boolean containsAll(atlas.java.util.Collection<?> p0) {
		boolean r = false;
		return (boolean)r;
	}
	public synchronized boolean removeAll(atlas.java.util.Collection<?> p0) {
		boolean r = false;
		return (boolean)r;
	}
	public synchronized boolean retainAll(atlas.java.util.Collection<?> p0) {
		boolean r = false;
		return (boolean)r;
	}
	protected synchronized void removeRange(int p0, int p1) {
	}
	public synchronized atlas.atlas.java.util.ListIterator<E> listIterator() {
		atlas.java.util.ListIterator r = null;
		r = new atlas.java.util.Vector.ListItr();
		((atlas.java.util.Vector.ListItr)r).f125 = (java.lang.Object)((atlas.java.util.Vector)this).f36;
		((atlas.java.util.Vector.ListItr)r).f125 = (java.lang.Object)((atlas.java.util.Stack)this).f31;
		return (atlas.atlas.java.util.ListIterator<E>)r;
	}
	public synchronized atlas.atlas.java.util.ListIterator<E> listIterator(int p0) {
		atlas.java.util.ListIterator r = null;
		r = new atlas.java.util.Vector.ListItr();
		((atlas.java.util.Vector.ListItr)r).f125 = (java.lang.Object)((atlas.java.util.Vector)this).f36;
		((atlas.java.util.Vector.ListItr)r).f125 = (java.lang.Object)((atlas.java.util.Stack)this).f31;
		return (atlas.atlas.java.util.ListIterator<E>)r;
	}
	public synchronized void sort(java.util.Comparator<? super E> p0) {
	}
	public static final class VectorSpliterator<E> {
		public VectorSpliterator() {
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
	public final class ListItr extends atlas.atlas.java.util.Vector<E>.Itr implements atlas.atlas.java.util.ListIterator<E> {
		public java.lang.Object f125;
		public ListItr() {
		}
		public void add(E p0) {
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
	public class Itr implements atlas.java.util.Iterator<E> {
		public java.lang.Object f159;
		private Itr(atlas.atlas.java.util.Vector p0) {
		}
		public Itr() {
		}
		public void remove() {
		}
		public E next() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.Vector.Itr)this).f159;
			r = (java.lang.Object)((atlas.java.util.Vector.ListItr)this).f125;
			return (E)r;
		}
		public boolean hasNext() {
			boolean r = false;
			return (boolean)r;
		}
	}
	public class ANON2<E> implements java.util.Enumeration<E> {
		public java.lang.Object f65;
		ANON2() {
		}
		public boolean hasMoreElements() {
			boolean r = false;
			return (boolean)r;
		}
		public E nextElement() {
			java.lang.Object r = null;
			r = (java.lang.Object)((ANON2)this).f65;
			return (E)r;
		}
	}
}
