package atlas.java.util;
public class HashSet<E> extends atlas.java.util.AbstractSet<E> implements java.util.Set<E>, java.lang.Cloneable, java.io.Serializable {
	public java.lang.Object f44;
	public HashSet(atlas.java.util.Collection<? extends E> p0) {
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.TreeSet)p0).f28;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.ArrayList)p0).f27;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.ArrayDeque)p0).f1;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)p0).f15;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedQueue)p0).f14;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.LinkedList)p0).f19;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.concurrent.PriorityBlockingQueue)p0).f42;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArraySet)p0).f26;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableList)p0).f72;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.concurrent.LinkedTransferQueue)p0).f12;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.PriorityQueue)p0).f11;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.Vector)p0).f36;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.HashSet)p0).f44;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedDeque)p0).f7;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.LinkedHashSet)p0).f18;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.Stack)p0).f31;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedCollection)p0).f2;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)((atlas.java.util.Collections.SingletonSet)p0).f147;
	}
	public HashSet() {
	}
	public boolean add(E p0) {
		boolean r = false;
		((atlas.java.util.HashSet)this).f44 = (java.lang.Object)p0;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)p0;
		return (boolean)r;
	}
	public boolean remove(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public java.lang.Object clone() {
		java.lang.Object r = null;
		r = new atlas.java.util.LinkedHashSet();
		r = new atlas.java.util.HashSet();
		((atlas.java.util.HashSet)r).f44 = (java.lang.Object)((atlas.java.util.HashSet)this).f44;
		((atlas.java.util.LinkedHashSet)r).f18 = (java.lang.Object)((atlas.java.util.LinkedHashSet)this).f18;
		return (java.lang.Object)r;
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
	public atlas.java.util.Iterator<E> iterator() {
		atlas.java.util.Iterator r = null;
		r = new atlas.java.util.HashMap.KeyIterator();
		r = new atlas.java.util.LinkedHashMap.LinkedKeyIterator();
		((atlas.java.util.LinkedHashMap.LinkedKeyIterator)r).f129 = (java.lang.Object)((atlas.java.util.LinkedHashSet)this).f18;
		((atlas.java.util.HashMap.KeyIterator)r).f167 = (java.lang.Object)((atlas.java.util.HashSet)this).f44;
		return (atlas.java.util.Iterator<E>)r;
	}
}
