package atlas.java.util.concurrent;
public class ConcurrentSkipListSet<E> extends atlas.java.util.AbstractSet<E> implements java.util.NavigableSet<E>, java.lang.Cloneable, java.io.Serializable {
	public java.lang.Object f10;
	public ConcurrentSkipListSet(java.util.SortedSet<E> p0) {
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)p0).f10;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.TreeSet)p0).f28;
	}
	public ConcurrentSkipListSet(atlas.java.util.Collection<? extends E> p0) {
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArrayList)p0).f9;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedSet)p0).f73;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.ArrayList)p0).f27;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.TreeSet)p0).f28;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)p0).f15;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.concurrent.PriorityBlockingQueue)p0).f42;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedQueue)p0).f14;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.LinkedList)p0).f19;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArraySet)p0).f26;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.PriorityQueue)p0).f11;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.LinkedHashSet)p0).f18;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.Vector)p0).f36;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.HashSet)p0).f44;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)p0).f10;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedCollection)p0).f2;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedDeque)p0).f7;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableRandomAccessList)p0).f66;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.concurrent.LinkedTransferQueue)p0).f12;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.Stack)p0).f31;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingQueue)p0).f4;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.Collections.SingletonSet)p0).f147;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.ArrayDeque)p0).f1;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)((atlas.java.util.Collections.SingletonList)p0).f150;
	}
	public ConcurrentSkipListSet(java.util.Comparator<? super E> p0) {
	}
	ConcurrentSkipListSet(java.util.concurrent.ConcurrentNavigableMap<E, java.lang.Object> p0) {
	}
	public ConcurrentSkipListSet() {
	}
	public java.util.NavigableSet<E> subSet(E p0, E p1) {
		java.util.NavigableSet r = null;
		return (java.util.NavigableSet<E>)r;
	}
	public java.util.NavigableSet<E> subSet(E p0, boolean p1, E p2, boolean p3) {
		java.util.NavigableSet r = null;
		r = new atlas.java.util.concurrent.ConcurrentSkipListSet();
		((atlas.java.util.concurrent.ConcurrentSkipListSet)r).f10 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10;
		return (java.util.NavigableSet<E>)r;
	}
	public java.util.NavigableSet<E> headSet(E p0) {
		java.util.NavigableSet r = null;
		return (java.util.NavigableSet<E>)r;
	}
	public java.util.NavigableSet<E> headSet(E p0, boolean p1) {
		java.util.NavigableSet r = null;
		r = new atlas.java.util.concurrent.ConcurrentSkipListSet();
		((atlas.java.util.concurrent.ConcurrentSkipListSet)r).f10 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10;
		return (java.util.NavigableSet<E>)r;
	}
	public java.util.NavigableSet<E> tailSet(E p0, boolean p1) {
		java.util.NavigableSet r = null;
		r = new atlas.java.util.concurrent.ConcurrentSkipListSet();
		((atlas.java.util.concurrent.ConcurrentSkipListSet)r).f10 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10;
		return (java.util.NavigableSet<E>)r;
	}
	public java.util.NavigableSet<E> tailSet(E p0) {
		java.util.NavigableSet r = null;
		r = new atlas.java.util.concurrent.ConcurrentSkipListSet();
		((atlas.java.util.concurrent.ConcurrentSkipListSet)r).f10 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10;
		return (java.util.NavigableSet<E>)r;
	}
	public E pollFirst() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10;
		return (E)r;
	}
	public E pollLast() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10;
		return (E)r;
	}
	public atlas.java.util.Iterator<E> descendingIterator() {
		atlas.java.util.Iterator r = null;
		r = new atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap.SubMapKeyIterator();
		((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap.SubMapKeyIterator)r).f106 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10;
		return (atlas.java.util.Iterator<E>)r;
	}
	public E ceiling(E p0) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10;
		return (E)r;
	}
	public E higher(E p0) {
		java.lang.Object r = null;
		return (E)r;
	}
	public java.util.NavigableSet<E> descendingSet() {
		java.util.NavigableSet r = null;
		r = new atlas.java.util.concurrent.ConcurrentSkipListSet();
		((atlas.java.util.concurrent.ConcurrentSkipListSet)r).f10 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10;
		return (java.util.NavigableSet<E>)r;
	}
	public boolean add(E p0) {
		boolean r = false;
		((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10 = (java.lang.Object)p0;
		return (boolean)r;
	}
	public boolean remove(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public boolean equals(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public atlas.java.util.concurrent.ConcurrentSkipListSet<E> clone() {
		atlas.java.util.concurrent.ConcurrentSkipListSet r = null;
		r = new atlas.java.util.concurrent.ConcurrentSkipListSet();
		((atlas.java.util.concurrent.ConcurrentSkipListSet)r).f10 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10;
		return (atlas.java.util.concurrent.ConcurrentSkipListSet<E>)r;
	}
	public void clear() {
	}
	public boolean isEmpty() {
		boolean r = false;
		return (boolean)r;
	}
	public E first() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10;
		return (E)r;
	}
	public boolean contains(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public int size() {
		int r = 0;
		return (int)r;
	}
	public atlas.java.util.Iterator<E> iterator() {
		atlas.java.util.Iterator r = null;
		r = new atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap.SubMapKeyIterator();
		r = new atlas.java.util.concurrent.ConcurrentSkipListMap.KeyIterator();
		((atlas.java.util.concurrent.ConcurrentSkipListMap.KeyIterator)r).f175 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10;
		((atlas.java.util.concurrent.ConcurrentSkipListMap.SubMap.SubMapKeyIterator)r).f106 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10;
		return (atlas.java.util.Iterator<E>)r;
	}
	public E last() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10;
		return (E)r;
	}
	public E lower(E p0) {
		java.lang.Object r = null;
		return (E)r;
	}
	public java.util.Comparator<? super E> comparator() {
		java.util.Comparator r = null;
		return (java.util.Comparator<? super E>)r;
	}
	public boolean removeAll(atlas.java.util.Collection<?> p0) {
		boolean r = false;
		return (boolean)r;
	}
	public E floor(E p0) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)this).f10;
		return (E)r;
	}
}
