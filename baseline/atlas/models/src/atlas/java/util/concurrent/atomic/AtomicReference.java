package atlas.java.util.concurrent.atomic;
public class AtomicReference<V> implements java.io.Serializable {
	public java.lang.Object f115;
	public AtomicReference(V p0) {
	}
	public AtomicReference() {
	}
	public final V get() {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.concurrent.atomic.AtomicReference)this).f115;
		return (V)r;
	}
	public java.lang.String toString() {
		java.lang.String r = null;
		r = new java.lang.String();
		return (java.lang.String)r;
	}
	public final void set(V p0) {
		((atlas.java.util.concurrent.atomic.AtomicReference)this).f115 = (java.lang.Object)p0;
	}
	public final void lazySet(V p0) {
		((atlas.java.util.concurrent.atomic.AtomicReference)this).f115 = (java.lang.Object)p0;
	}
	public final V getAndSet(V p0) {
		java.lang.Object r = null;
		((atlas.java.util.concurrent.atomic.AtomicReference)this).f115 = (java.lang.Object)p0;
		r = (java.lang.Object)((atlas.java.util.concurrent.atomic.AtomicReference)this).f115;
		return (V)r;
	}
	public final boolean compareAndSet(V p0, V p1) {
		boolean r = false;
		((atlas.java.util.concurrent.atomic.AtomicReference)this).f115 = (java.lang.Object)p1;
		return (boolean)r;
	}
	public final boolean weakCompareAndSet(V p0, V p1) {
		boolean r = false;
		((atlas.java.util.concurrent.atomic.AtomicReference)this).f115 = (java.lang.Object)p1;
		return (boolean)r;
	}
}
