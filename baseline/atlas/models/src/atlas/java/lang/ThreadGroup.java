package atlas.java.lang;
public class ThreadGroup implements atlas.java.lang.Thread.UncaughtExceptionHandler {
	private ThreadGroup(java.lang.Void p0, atlas.java.lang.ThreadGroup p1, java.lang.String p2) {
	}
	public ThreadGroup(atlas.java.lang.ThreadGroup p0, java.lang.String p1) {
	}
	public ThreadGroup(java.lang.String p0) {
	}
	public ThreadGroup() {
	}
	public void uncaughtException(atlas.java.lang.Thread p0, atlas.java.lang.Throwable p1) {
	}
	public java.lang.String toString() {
		java.lang.String r = null;
		return (java.lang.String)r;
	}
	public final java.lang.String getName() {
		java.lang.String r = null;
		return (java.lang.String)r;
	}
	public void list() {
	}
	public final atlas.java.lang.ThreadGroup getParent() {
		atlas.java.lang.ThreadGroup r = null;
		return (atlas.java.lang.ThreadGroup)r;
	}
	public final void checkAccess() {
	}
	public final void setDaemon(boolean p0) {
	}
	public final void stop() {
	}
	public final void interrupt() {
	}
	public final void destroy() {
	}
	public final void suspend() {
	}
	public final void resume() {
	}
	public int activeCount() {
		int r = 0;
		return (int)r;
	}
	public int enumerate(atlas.java.lang.ThreadGroup[] p0, boolean p1) {
		int r = 0;
		return (int)r;
	}
	public int enumerate(atlas.java.lang.Thread[] p0) {
		int r = 0;
		return (int)r;
	}
	public int enumerate(atlas.java.lang.Thread[] p0, boolean p1) {
		int r = 0;
		return (int)r;
	}
	public int enumerate(atlas.java.lang.ThreadGroup[] p0) {
		int r = 0;
		return (int)r;
	}
	public final boolean isDaemon() {
		boolean r = false;
		return (boolean)r;
	}
	public final int getMaxPriority() {
		int r = 0;
		return (int)r;
	}
	public synchronized boolean isDestroyed() {
		boolean r = false;
		return (boolean)r;
	}
	public final void setMaxPriority(int p0) {
	}
	public final boolean parentOf(atlas.java.lang.ThreadGroup p0) {
		boolean r = false;
		return (boolean)r;
	}
	public int activeGroupCount() {
		int r = 0;
		return (int)r;
	}
	public boolean allowThreadSuspension(boolean p0) {
		boolean r = false;
		return (boolean)r;
	}
}
