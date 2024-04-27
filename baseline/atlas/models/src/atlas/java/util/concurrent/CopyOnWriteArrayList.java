package atlas.java.util.concurrent;
public class CopyOnWriteArrayList<E> implements atlas.java.util.List<E>, java.util.RandomAccess, java.lang.Cloneable, java.io.Serializable {
	public java.lang.Object f9;
	public CopyOnWriteArrayList(atlas.java.util.Collection<? extends E> p0) {
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.TreeSet)p0).f28;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.ArrayList)p0).f27;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.ArrayDeque)p0).f1;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableSet)p0).f8;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.PriorityBlockingQueue)p0).f42;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.Collections.SingletonList)p0).f150;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.LinkedList)p0).f19;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedQueue)p0).f14;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedDeque)p0).f7;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedCollection)p0).f2;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.Vector)p0).f36;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.LinkedTransferQueue)p0).f12;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.PriorityQueue)p0).f11;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArraySet)p0).f26;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableCollection)p0).f52;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.HashSet)p0).f44;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)p0).f10;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.LinkedHashSet)p0).f18;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)p0).f15;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.Stack)p0).f31;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingQueue)p0).f4;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArrayList)p0).f9;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.Collections.SingletonSet)p0).f147;
	}
	public CopyOnWriteArrayList() {
	}
	public boolean addIfAbsent(E p0) {
		boolean r = false;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)p0;
		return (boolean)r;
	}
	public int addAllAbsent(atlas.java.util.Collection<? extends E> p0) {
		int r = 0;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableRandomAccessList)p0).f66;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedDeque)p0).f7;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingQueue)p0).f4;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.Collections.SingletonSet)p0).f147;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedQueue)p0).f14;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.LinkedList)p0).f19;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableCollection)p0).f52;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.ArrayDeque)p0).f1;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArraySet)p0).f26;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.Stack)p0).f31;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.PriorityBlockingQueue)p0).f42;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)p0).f10;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.LinkedHashSet)p0).f18;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.Vector)p0).f36;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.PriorityQueue)p0).f11;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.HashSet)p0).f44;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedSet)p0).f73;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArrayList)p0).f9;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)p0).f15;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.TreeSet)p0).f28;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.LinkedTransferQueue)p0).f12;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.ArrayList)p0).f27;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedCollection)p0).f2;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedRandomAccessList)p0).f53;
		return (int)r;
	}
	public void add(int p0, E p1) {
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)p1;
	}
	public boolean add(E p0) {
		boolean r = false;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)p0;
		return (boolean)r;
	}
	public E remove(int p0) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9;
		return (E)r;
	}
	public boolean remove(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public E get(int p0) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9;
		return (E)r;
	}
	public boolean equals(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public java.lang.String toString() {
		java.lang.String r = null;
		r = new java.lang.String();
		return (java.lang.String)r;
	}
	public int hashCode() {
		int r = 0;
		return (int)r;
	}
	public java.lang.Object clone() {
		java.lang.Object r = null;
		r = new atlas.java.util.concurrent.CopyOnWriteArrayList();
		((atlas.java.util.concurrent.CopyOnWriteArrayList)r).f9 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9;
		return (java.lang.Object)r;
	}
	public int indexOf(java.lang.Object p0) {
		int r = 0;
		return (int)r;
	}
	public int indexOf(E p0, int p1) {
		int r = 0;
		return (int)r;
	}
	public void clear() {
	}
	public boolean isEmpty() {
		boolean r = false;
		return (boolean)r;
	}
	public int lastIndexOf(E p0, int p1) {
		int r = 0;
		return (int)r;
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
	public atlas.java.util.List<E> subList(int p0, int p1) {
		atlas.java.util.List r = null;
		return (atlas.java.util.List<E>)r;
	}
	public java.lang.Object[] toArray() {
		java.lang.Object[] r = null;
		r = new java.lang.Object[1];
		((java.lang.Object[])r)[0] = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9;
		return (java.lang.Object[])r;
	}
	public <T> T[] toArray(T[] p0) {
		java.lang.Object[] r = null;
		r = new java.lang.Object[1];
		r = (java.lang.Object[])p0;
		((java.lang.Object[])r)[0] = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9;
		return (T[])r;
	}
	public atlas.java.util.Iterator<E> iterator() {
		atlas.java.util.Iterator r = null;
		r = new atlas.java.util.concurrent.CopyOnWriteArrayList.COWIterator();
		((atlas.java.util.concurrent.CopyOnWriteArrayList.COWIterator)r).f148 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9;
		return (atlas.java.util.Iterator<E>)r;
	}
	public boolean addAll(int p0, atlas.java.util.Collection<? extends E> p1) {
		boolean r = false;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.LinkedHashSet)p1).f18;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArraySet)p1).f26;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.PriorityQueue)p1).f11;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.LinkedTransferQueue)p1).f12;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.Stack)p1).f31;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedCollection)p1).f2;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedDeque)p1).f7;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableRandomAccessList)p1).f66;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableSet)p1).f8;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.PriorityBlockingQueue)p1).f42;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.ArrayDeque)p1).f1;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedQueue)p1).f14;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.LinkedList)p1).f19;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.ArrayList)p1).f27;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.TreeSet)p1).f28;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedRandomAccessList)p1).f53;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingQueue)p1).f4;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArrayList)p1).f9;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)p1).f15;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.Collections.SingletonSet)p1).f147;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)p1).f10;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.Collections.AsLIFOQueue)p1).f57;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.Vector)p1).f36;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.HashSet)p1).f44;
		return (boolean)r;
	}
	public boolean addAll(atlas.java.util.Collection<? extends E> p0) {
		boolean r = false;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.Collections.SingletonSet)p0).f147;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedQueue)p0).f14;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.LinkedList)p0).f19;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.ArrayDeque)p0).f1;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArraySet)p0).f26;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.Stack)p0).f31;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableList)p0).f72;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)p0).f10;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.LinkedHashSet)p0).f18;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.TreeMap.KeySet)p0).f63;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.LinkedTransferQueue)p0).f12;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.Collections.SingletonList)p0).f150;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedDeque)p0).f7;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingQueue)p0).f4;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableCollection)p0).f52;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.Collections.AsLIFOQueue)p0).f57;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.PriorityBlockingQueue)p0).f42;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.Vector)p0).f36;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.PriorityQueue)p0).f11;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.HashSet)p0).f44;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArrayList)p0).f9;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)p0).f15;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.TreeSet)p0).f28;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.ArrayList)p0).f27;
		((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedCollection)p0).f2;
		return (boolean)r;
	}
	public E set(int p0, E p1) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9;
		return (E)r;
	}
	public boolean containsAll(atlas.java.util.Collection<?> p0) {
		boolean r = false;
		return (boolean)r;
	}
	public boolean removeAll(atlas.java.util.Collection<?> p0) {
		boolean r = false;
		return (boolean)r;
	}
	public boolean retainAll(atlas.java.util.Collection<?> p0) {
		boolean r = false;
		return (boolean)r;
	}
	public atlas.atlas.java.util.ListIterator<E> listIterator() {
		atlas.java.util.ListIterator r = null;
		r = new atlas.java.util.concurrent.CopyOnWriteArrayList.COWIterator();
		((atlas.java.util.concurrent.CopyOnWriteArrayList.COWIterator)r).f148 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9;
		return (atlas.atlas.java.util.ListIterator<E>)r;
	}
	public atlas.atlas.java.util.ListIterator<E> listIterator(int p0) {
		atlas.java.util.ListIterator r = null;
		r = new atlas.java.util.concurrent.CopyOnWriteArrayList.COWIterator();
		((atlas.java.util.concurrent.CopyOnWriteArrayList.COWIterator)r).f148 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArrayList)this).f9;
		return (atlas.atlas.java.util.ListIterator<E>)r;
	}
	public void sort(java.util.Comparator<? super E> p0) {
	}
	public static class COWSubListIterator<E> implements atlas.atlas.java.util.ListIterator<E> {
		public COWSubListIterator() {
		}
		public void add(E p0) {
		}
		public void remove() {
		}
		public E next() {
			java.lang.Object r = null;
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
	public static class COWSubList<E> extends atlas.atlas.java.util.AbstractList<E> implements java.util.RandomAccess {
		public COWSubList() {
		}
		public void add(int p0, E p1) {
		}
		public boolean remove(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public E remove(int p0) {
			java.lang.Object r = null;
			return (E)r;
		}
		public E get(int p0) {
			java.lang.Object r = null;
			return (E)r;
		}
		public void clear() {
		}
		public int size() {
			int r = 0;
			return (int)r;
		}
		public atlas.java.util.List<E> subList(int p0, int p1) {
			atlas.java.util.List r = null;
			return (atlas.java.util.List<E>)r;
		}
		public atlas.java.util.Iterator<E> iterator() {
			atlas.java.util.Iterator r = null;
			return (atlas.java.util.Iterator<E>)r;
		}
		public E set(int p0, E p1) {
			java.lang.Object r = null;
			return (E)r;
		}
		public boolean removeAll(atlas.java.util.Collection<?> p0) {
			boolean r = false;
			return (boolean)r;
		}
		public boolean retainAll(atlas.java.util.Collection<?> p0) {
			boolean r = false;
			return (boolean)r;
		}
		public atlas.atlas.java.util.ListIterator<E> listIterator(int p0) {
			atlas.java.util.ListIterator r = null;
			return (atlas.atlas.java.util.ListIterator<E>)r;
		}
		public void sort(java.util.Comparator<? super E> p0) {
		}
	}
	public static final class COWIterator<E> implements atlas.atlas.java.util.ListIterator<E> {
		public java.lang.Object f148;
		public COWIterator() {
		}
		public void add(E p0) {
		}
		public void remove() {
		}
		public E next() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArrayList.COWIterator)this).f148;
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
	public class ANON269 {
		ANON269() {
		}
	}
}
