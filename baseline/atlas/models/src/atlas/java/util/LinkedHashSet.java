package atlas.java.util;
public class LinkedHashSet<E> extends atlas.java.util.HashSet<E> implements java.util.Set<E>, java.lang.Cloneable, java.io.Serializable {
	public java.lang.Object f18;
	public LinkedHashSet(atlas.java.util.Collection<? extends E> p0) {
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedQueue)p0).f14;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.LinkedList)p0).f19;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.concurrent.PriorityBlockingQueue)p0).f42;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.Collections.SingletonList)p0).f150;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingQueue)p0).f4;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.Collections.SingletonSet)p0).f147;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.ArrayDeque)p0).f1;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArrayList)p0).f9;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)p0).f15;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)p0).f10;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.Vector)p0).f36;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.HashSet)p0).f44;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.PriorityQueue)p0).f11;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.LinkedHashSet)p0).f18;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.Stack)p0).f31;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedCollection)p0).f2;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.TreeSet)p0).f28;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedDeque)p0).f7;
		((atlas.java.util.LinkedHashSet)this).f18 = (java.lang.Object)((atlas.java.util.ArrayList)p0).f27;
	}
	public LinkedHashSet() {
	}
}
