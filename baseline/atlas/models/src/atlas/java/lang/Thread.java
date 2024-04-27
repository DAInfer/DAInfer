package atlas.java.lang;
public class Thread implements java.lang.Runnable {
	Thread(java.lang.Runnable p0, java.security.AccessControlContext p1) {
	}
	public Thread(java.lang.Runnable p0) {
	}
	public Thread(atlas.java.lang.ThreadGroup p0, java.lang.Runnable p1, java.lang.String p2) {
	}
	public Thread(java.lang.Runnable p0, java.lang.String p1) {
	}
	public Thread(atlas.java.lang.ThreadGroup p0, java.lang.String p1) {
	}
	public Thread(java.lang.String p0) {
	}
	public Thread(atlas.java.lang.ThreadGroup p0, java.lang.Runnable p1) {
	}
	public Thread() {
	}
	public void run() {
	}
	public java.lang.String toString() {
		java.lang.String r = null;
		return (java.lang.String)r;
	}
	protected java.lang.Object clone() {
		java.lang.Object r = null;
		return (java.lang.Object)r;
	}
	public boolean isInterrupted() {
		boolean r = false;
		return (boolean)r;
	}
	public static atlas.java.lang.Thread currentThread() {
		atlas.java.lang.Thread r = null;
		return (atlas.java.lang.Thread)r;
	}
	public final java.lang.String getName() {
		java.lang.String r = null;
		return (java.lang.String)r;
	}
	public synchronized void start() {
	}
	public final synchronized void join(long p0, int p1) {
	}
	public final synchronized void join(long p0) {
	}
	public final void join() {
	}
	public final atlas.java.lang.ThreadGroup getThreadGroup() {
		atlas.java.lang.ThreadGroup r = null;
		return (atlas.java.lang.ThreadGroup)r;
	}
	public java.lang.StackTraceElement[] getStackTrace() {
		java.lang.StackTraceElement[] r = null;
		return (java.lang.StackTraceElement[])r;
	}
	public static boolean holdsLock(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public final void checkAccess() {
	}
	public static void dumpStack() {
	}
	public static void yield() {
	}
	public final void setPriority(int p0) {
	}
	public final void setDaemon(boolean p0) {
	}
	public static void sleep(long p0) {
	}
	public static void sleep(long p0, int p1) {
	}
	public final synchronized void stop(atlas.java.lang.Throwable p0) {
	}
	public final void stop() {
	}
	public void interrupt() {
	}
	public static boolean interrupted() {
		boolean r = false;
		return (boolean)r;
	}
	public void destroy() {
	}
	public final boolean isAlive() {
		boolean r = false;
		return (boolean)r;
	}
	public final void suspend() {
	}
	public final void resume() {
	}
	public final int getPriority() {
		int r = 0;
		return (int)r;
	}
	public final synchronized void setName(java.lang.String p0) {
	}
	public static int activeCount() {
		int r = 0;
		return (int)r;
	}
	public static int enumerate(atlas.java.lang.Thread[] p0) {
		int r = 0;
		return (int)r;
	}
	public int countStackFrames() {
		int r = 0;
		return (int)r;
	}
	public final boolean isDaemon() {
		boolean r = false;
		return (boolean)r;
	}
	public java.lang.ClassLoader getContextClassLoader() {
		java.lang.ClassLoader r = null;
		return (java.lang.ClassLoader)r;
	}
	public void setContextClassLoader(java.lang.ClassLoader p0) {
	}
	public static atlas.java.util.Map<atlas.java.lang.Thread, java.lang.StackTraceElement[]> getAllStackTraces() {
		atlas.java.util.Map r = null;
		return (atlas.java.util.Map<atlas.java.lang.Thread, java.lang.StackTraceElement[]>)r;
	}
	public long getId() {
		long r = 0;
		return (long)r;
	}
	public atlas.java.lang.Thread.State getState() {
		atlas.java.lang.Thread.State r = null;
		return (atlas.java.lang.Thread.State)r;
	}
	public static void setDefaultUncaughtExceptionHandler(atlas.java.lang.Thread.UncaughtExceptionHandler p0) {
	}
	public static atlas.java.lang.Thread.UncaughtExceptionHandler getDefaultUncaughtExceptionHandler() {
		atlas.java.lang.Thread.UncaughtExceptionHandler r = null;
		return (atlas.java.lang.Thread.UncaughtExceptionHandler)r;
	}
	public atlas.java.lang.Thread.UncaughtExceptionHandler getUncaughtExceptionHandler() {
		atlas.java.lang.Thread.UncaughtExceptionHandler r = null;
		return (atlas.java.lang.Thread.UncaughtExceptionHandler)r;
	}
	public void setUncaughtExceptionHandler(atlas.java.lang.Thread.UncaughtExceptionHandler p0) {
	}
	public static class WeakClassKey extends java.lang.ref.WeakReference<java.lang.Class<?>> {
		WeakClassKey(java.lang.Class<?> p0, java.lang.ref.ReferenceQueue<java.lang.Class<?>> p1) {
		}
		public WeakClassKey() {
		}
		public boolean equals(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public int hashCode() {
			int r = 0;
			return (int)r;
		}
	}
	public abstract static interface UncaughtExceptionHandler {
		public abstract void uncaughtException(atlas.java.lang.Thread p0, atlas.java.lang.Throwable p1);
	}
	public static enum State {
		NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED;
	}
	public static class Caches {
		public Caches() {
		}
	}
	public class ANON400 implements java.security.PrivilegedAction<java.lang.Boolean> {
		ANON400() {
		}
		public java.lang.Boolean run() {
			java.lang.Boolean r = null;
			return (java.lang.Boolean)r;
		}
	}
}
