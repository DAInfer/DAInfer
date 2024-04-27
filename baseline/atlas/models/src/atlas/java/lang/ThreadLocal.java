package atlas.java.lang;
public class ThreadLocal<T> {
	public ThreadLocal() {
	}
	public void remove() {
	}
	public T get() {
		java.lang.Object r = null;
		return (T)r;
	}
	public void set(T p0) {
	}
	protected T initialValue() {
		java.lang.Object r = null;
		return (T)r;
	}
	public static class ThreadLocalMap {
		ThreadLocalMap(atlas.atlas.java.lang.ThreadLocal<?> p0, java.lang.Object p1) {
		}
		private ThreadLocalMap(atlas.atlas.java.lang.ThreadLocal.ThreadLocalMap p0) {
		}
		public ThreadLocalMap() {
		}
		public static class Entry extends java.lang.ref.WeakReference<atlas.atlas.java.lang.ThreadLocal<?>> {
			Entry(atlas.atlas.java.lang.ThreadLocal<?> p0, java.lang.Object p1) {
			}
			public Entry() {
			}
		}
	}
	public static final class SuppliedThreadLocal<T> extends atlas.atlas.java.lang.ThreadLocal<T> {
		public SuppliedThreadLocal() {
		}
		protected T initialValue() {
			java.lang.Object r = null;
			return (T)r;
		}
	}
	public class ANON266 {
		ANON266() {
		}
	}
}
