package atlas.java.util.concurrent.atomic;
public abstract class AtomicReferenceFieldUpdater<T,V> {
	public AtomicReferenceFieldUpdater() {
	}
	public abstract V get(T p0);
	public abstract void set(T p0, V p1);
	public abstract void lazySet(T p0, V p1);
	public V getAndSet(T p0, V p1) {
		java.lang.Object r = null;
		return (V)r;
	}
	public abstract boolean compareAndSet(T p0, V p1, V p2);
	public abstract boolean weakCompareAndSet(T p0, V p1, V p2);
	public static <U,W> atlas.java.util.concurrent.atomic.AtomicReferenceFieldUpdater<U, W> newUpdater(java.lang.Class<U> p0, java.lang.Class<W> p1, java.lang.String p2) {
		atlas.java.util.concurrent.atomic.AtomicReferenceFieldUpdater r = null;
		return (atlas.java.util.concurrent.atomic.AtomicReferenceFieldUpdater<U, W>)r;
	}
	public static final class AtomicReferenceFieldUpdaterImpl<T,V> extends atlas.java.util.concurrent.atomic.AtomicReferenceFieldUpdater<T, V> {
		AtomicReferenceFieldUpdaterImpl(java.lang.Class<T> p0, java.lang.Class<V> p1, java.lang.String p2, java.lang.Class<?> p3) {
		}
		public AtomicReferenceFieldUpdaterImpl() {
		}
		public final V get(T p0) {
			java.lang.Object r = null;
			return (V)r;
		}
		public final void set(T p0, V p1) {
		}
		public final void lazySet(T p0, V p1) {
		}
		public final V getAndSet(T p0, V p1) {
			java.lang.Object r = null;
			return (V)r;
		}
		public final boolean compareAndSet(T p0, V p1, V p2) {
			boolean r = false;
			return (boolean)r;
		}
		public final boolean weakCompareAndSet(T p0, V p1, V p2) {
			boolean r = false;
			return (boolean)r;
		}
	}
}
