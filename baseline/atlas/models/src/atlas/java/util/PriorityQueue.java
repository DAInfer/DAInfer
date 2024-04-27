package atlas.java.util;
public class PriorityQueue<E> extends atlas.java.util.AbstractQueue<E> implements java.io.Serializable {
	public java.lang.Object f11;
	public PriorityQueue(atlas.java.util.PriorityQueue<? extends E> p0) {
		((atlas.java.util.PriorityQueue)this).f11 = (java.lang.Object)((atlas.java.util.PriorityQueue)p0).f11;
	}
	public PriorityQueue(java.util.Comparator<? super E> p0) {
	}
	public PriorityQueue(java.util.SortedSet<? extends E> p0) {
		((atlas.java.util.PriorityQueue)this).f11 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap.KeySet)p0).f22;
		((atlas.java.util.PriorityQueue)this).f11 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)p0).f10;
		((atlas.java.util.PriorityQueue)this).f11 = (java.lang.Object)((atlas.java.util.TreeSet)p0).f28;
	}
	public PriorityQueue(atlas.java.util.Collection<? extends E> p0) {
		((atlas.java.util.PriorityQueue)this).f11 = (java.lang.Object)((atlas.java.util.concurrent.PriorityBlockingQueue)p0).f42;
		((atlas.java.util.PriorityQueue)this).f11 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableSet)p0).f8;
		((atlas.java.util.PriorityQueue)this).f11 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingDeque)p0).f15;
		((atlas.java.util.PriorityQueue)this).f11 = (java.lang.Object)((atlas.java.util.Vector)p0).f36;
		((atlas.java.util.PriorityQueue)this).f11 = (java.lang.Object)((atlas.java.util.HashSet)p0).f44;
		((atlas.java.util.PriorityQueue)this).f11 = (java.lang.Object)((atlas.java.util.concurrent.LinkedBlockingQueue)p0).f4;
		((atlas.java.util.PriorityQueue)this).f11 = (java.lang.Object)((atlas.java.util.PriorityQueue)p0).f11;
		((atlas.java.util.PriorityQueue)this).f11 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArraySet)p0).f26;
		((atlas.java.util.PriorityQueue)this).f11 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableCollection)p0).f52;
		((atlas.java.util.PriorityQueue)this).f11 = (java.lang.Object)((atlas.java.util.concurrent.LinkedTransferQueue)p0).f12;
		((atlas.java.util.PriorityQueue)this).f11 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedDeque)p0).f7;
		((atlas.java.util.PriorityQueue)this).f11 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentLinkedQueue)p0).f14;
		((atlas.java.util.PriorityQueue)this).f11 = (java.lang.Object)((atlas.java.util.LinkedList)p0).f19;
		((atlas.java.util.PriorityQueue)this).f11 = (java.lang.Object)((atlas.java.util.Collections.SingletonList)p0).f150;
		((atlas.java.util.PriorityQueue)this).f11 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListSet)p0).f10;
		((atlas.java.util.PriorityQueue)this).f11 = (java.lang.Object)((atlas.java.util.ArrayDeque)p0).f1;
		((atlas.java.util.PriorityQueue)this).f11 = (java.lang.Object)((atlas.java.util.Stack)p0).f31;
		((atlas.java.util.PriorityQueue)this).f11 = (java.lang.Object)((atlas.java.util.LinkedHashSet)p0).f18;
		((atlas.java.util.PriorityQueue)this).f11 = (java.lang.Object)((atlas.java.util.Collections.SingletonSet)p0).f147;
		((atlas.java.util.PriorityQueue)this).f11 = (java.lang.Object)((atlas.java.util.concurrent.CopyOnWriteArrayList)p0).f9;
		((atlas.java.util.PriorityQueue)this).f11 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableList)p0).f72;
		((atlas.java.util.PriorityQueue)this).f11 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedSet)p0).f73;
		((atlas.java.util.PriorityQueue)this).f11 = (java.lang.Object)((atlas.java.util.TreeSet)p0).f28;
		((atlas.java.util.PriorityQueue)this).f11 = (java.lang.Object)((atlas.java.util.IdentityHashMap.Values)p0).f35;
		((atlas.java.util.PriorityQueue)this).f11 = (java.lang.Object)((atlas.java.util.ArrayList)p0).f27;
	}
	public PriorityQueue() {
	}
	public boolean offer(E p0) {
		boolean r = false;
		((atlas.java.util.PriorityQueue)this).f11 = (java.lang.Object)p0;
		return (boolean)r;
	}
	public boolean add(E p0) {
		boolean r = false;
		((atlas.java.util.PriorityQueue)this).f11 = (java.lang.Object)p0;
		return (boolean)r;
	}
	public boolean remove(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
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
		r = new java.lang.Object[1];
		((java.lang.Object[])r)[0] = (java.lang.Object)((atlas.java.util.PriorityQueue)this).f11;
		r = (java.lang.Object[])p0;
		return (T[])r;
	}
	public java.lang.Object[] toArray() {
		java.lang.Object[] r = null;
		r = new java.lang.Object[1];
		return (java.lang.Object[])r;
	}
	public atlas.java.util.Iterator<E> iterator() {
		atlas.java.util.Iterator r = null;
		r = new atlas.java.util.PriorityQueue.Itr();
		((atlas.java.util.PriorityQueue.Itr)r).f138 = (java.lang.Object)((atlas.java.util.PriorityQueue)this).f11;
		return (atlas.java.util.Iterator<E>)r;
	}
	public E poll() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.PriorityQueue)this).f11;
		return (E)r;
	}
	public E peek() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.PriorityQueue)this).f11;
		return (E)r;
	}
	public java.util.Comparator<? super E> comparator() {
		java.util.Comparator r = null;
		return (java.util.Comparator<? super E>)r;
	}
	public static final class PriorityQueueSpliterator<E> {
		public PriorityQueueSpliterator() {
		}
		public atlas.java.util.PriorityQueue.PriorityQueueSpliterator<E> trySplit() {
			atlas.java.util.PriorityQueue.PriorityQueueSpliterator r = null;
			return (atlas.java.util.PriorityQueue.PriorityQueueSpliterator<E>)r;
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
	public final class Itr implements atlas.java.util.Iterator<E> {
		public java.lang.Object f138;
		private Itr(atlas.java.util.PriorityQueue p0) {
		}
		public Itr() {
		}
		public void remove() {
		}
		public E next() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.PriorityQueue.Itr)this).f138;
			return (E)r;
		}
		public boolean hasNext() {
			boolean r = false;
			return (boolean)r;
		}
	}
	public class ANON68 {
		ANON68() {
		}
	}
}
