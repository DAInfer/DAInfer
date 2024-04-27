package atlas.java.util;
public abstract class AbstractCollection<E> implements atlas.java.util.Collection<E> {
	public AbstractCollection() {
	}
	public boolean add(E p0) {
		boolean r = false;
		return (boolean)r;
	}
	public boolean remove(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public java.lang.String toString() {
		java.lang.String r = null;
		return (java.lang.String)r;
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
	public abstract int size();
	public <T> T[] toArray(T[] p0) {
		java.lang.Object[] r = null;
		r = new java.lang.Object[1];
		((java.lang.Object[])r)[0] = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10;
		((java.lang.Object[])r)[0] = (java.lang.Object)((atlas.java.util.HashSet)this).f44;
		((java.lang.Object[])r)[0] = (java.lang.Object)((atlas.java.util.LinkedHashSet)this).f18;
		((java.lang.Object[])r)[0] = (java.lang.Object)((atlas.java.util.TreeSet)this).f28;
		r = (java.lang.Object[])p0;
		return (T[])r;
	}
	public java.lang.Object[] toArray() {
		java.lang.Object[] r = null;
		r = new java.lang.Object[1];
		((java.lang.Object[])r)[0] = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10;
		((java.lang.Object[])r)[0] = (java.lang.Object)((atlas.java.util.Collections.SingletonList)this).f150;
		((java.lang.Object[])r)[0] = (java.lang.Object)((atlas.java.util.LinkedHashSet)this).f18;
		((java.lang.Object[])r)[0] = (java.lang.Object)((atlas.java.util.TreeSet)this).f28;
		return (java.lang.Object[])r;
	}
	public abstract atlas.java.util.Iterator<E> iterator();
	public boolean addAll(atlas.java.util.Collection<? extends E> p0) {
		boolean r = false;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.HashSet)p0).f44;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedQueue)p0).f14;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableCollection)p0).f52;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.HashSet)p0).f44;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedNavigableSet)p0).f97;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArrayList)p0).f9;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)p0).f15;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArrayList)p0).f9;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.concurrent.LinkedTransferQueue)p0).f12;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.concurrent.LinkedTransferQueue)p0).f12;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArraySet)p0).f26;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedQueue)p0).f14;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet)p0).f22;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.concurrent.LinkedTransferQueue)p0).f12;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.LinkedList)p0).f19;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.LinkedHashSet)p0).f18;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArraySet)p0).f26;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedDeque)p0).f7;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)p0).f10;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingQueue)p0).f4;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.ArrayDeque)p0).f1;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.Collections.SingletonList)p0).f150;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.PriorityQueue)p0).f11;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.HashSet)p0).f44;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.Collections.AsLIFOQueue)p0).f57;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableRandomAccessList)p0).f66;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.ArrayDeque)p0).f1;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.concurrent.PriorityBlockingQueue)p0).f42;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.HashSet)p0).f44;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.PriorityQueue)p0).f11;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)p0).f15;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.ArrayDeque)p0).f1;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)p0).f10;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.LinkedList)p0).f19;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingQueue)p0).f4;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.Vector)p0).f36;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.Collections.SingletonList)p0).f150;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedDeque)p0).f7;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.LinkedList)p0).f19;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.concurrent.PriorityBlockingQueue)p0).f42;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedSortedSet)p0).f70;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingQueue)p0).f4;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.PriorityQueue)p0).f11;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedDeque)p0).f7;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.Collections.SingletonSet)p0).f147;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingQueue)p0).f4;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.Vector)p0).f36;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.PriorityQueue)p0).f11;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.TreeSet)p0).f28;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.concurrent.LinkedTransferQueue)p0).f12;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedDeque)p0).f7;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArraySet)p0).f26;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)p0).f15;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.TreeMap.KeySet)p0).f63;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)p0).f10;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)p0).f15;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.ArrayList)p0).f27;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.ArrayDeque)p0).f1;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.TreeSet)p0).f28;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.Stack)p0).f31;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.Vector)p0).f36;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.ArrayList)p0).f27;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.LinkedList)p0).f19;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedList)p0).f49;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.concurrent.PriorityBlockingQueue)p0).f42;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedQueue)p0).f14;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.Collections.SingletonSet)p0).f147;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.Collections.SingletonList)p0).f150;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.Collections.SingletonSet)p0).f147;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedCollection)p0).f2;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.ArrayList)p0).f27;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.Stack)p0).f31;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.Collections.SingletonSet)p0).f147;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.Vector)p0).f36;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.Stack)p0).f31;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArrayList)p0).f9;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableCollection)p0).f52;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableRandomAccessList)p0).f66;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.Stack)p0).f31;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArrayList)p0).f9;
		((atlas.java.util.ArrayDeque)this).f1 = (java.lang.Object)((atlas.java.util.LinkedHashSet)p0).f18;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.LinkedHashSet)p0).f18;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.LinkedHashSet)p0).f18;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedCollection)p0).f2;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.TreeSet)p0).f28;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedQueue)p0).f14;
		return (boolean)r;
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
}
