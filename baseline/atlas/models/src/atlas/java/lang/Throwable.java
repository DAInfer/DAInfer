package atlas.java.lang;
public class Throwable implements java.io.Serializable {
	public Throwable(atlas.java.lang.Throwable p0) {
	}
	public Throwable(java.lang.String p0, atlas.java.lang.Throwable p1) {
	}
	public Throwable(java.lang.String p0) {
	}
	public Throwable() {
	}
	public void printStackTrace(java.io.PrintStream p0) {
	}
	public void printStackTrace() {
	}
	public void printStackTrace(java.io.PrintWriter p0) {
	}
	public synchronized atlas.java.lang.Throwable fillInStackTrace() {
		atlas.java.lang.Throwable r = null;
		return (atlas.java.lang.Throwable)r;
	}
	public synchronized atlas.java.lang.Throwable getCause() {
		atlas.java.lang.Throwable r = null;
		return (atlas.java.lang.Throwable)r;
	}
	public synchronized atlas.java.lang.Throwable initCause(atlas.java.lang.Throwable p0) {
		atlas.java.lang.Throwable r = null;
		return (atlas.java.lang.Throwable)r;
	}
	public java.lang.String toString() {
		java.lang.String r = null;
		return (java.lang.String)r;
	}
	public java.lang.String getMessage() {
		java.lang.String r = null;
		return (java.lang.String)r;
	}
	public java.lang.String getLocalizedMessage() {
		java.lang.String r = null;
		return (java.lang.String)r;
	}
	public java.lang.StackTraceElement[] getStackTrace() {
		java.lang.StackTraceElement[] r = null;
		return (java.lang.StackTraceElement[])r;
	}
	public void setStackTrace(java.lang.StackTraceElement[] p0) {
	}
	public final synchronized void addSuppressed(atlas.java.lang.Throwable p0) {
	}
	public final synchronized atlas.java.lang.Throwable[] getSuppressed() {
		atlas.java.lang.Throwable[] r = null;
		return (atlas.java.lang.Throwable[])r;
	}
	public static class WrappedPrintWriter extends atlas.java.lang.Throwable.PrintStreamOrWriter {
		WrappedPrintWriter(java.io.PrintWriter p0) {
		}
		public WrappedPrintWriter() {
		}
	}
	public static class WrappedPrintStream extends atlas.java.lang.Throwable.PrintStreamOrWriter {
		WrappedPrintStream(java.io.PrintStream p0) {
		}
		public WrappedPrintStream() {
		}
	}
	public abstract static class PrintStreamOrWriter {
		public PrintStreamOrWriter() {
		}
	}
	public static class SentinelHolder {
		public SentinelHolder() {
		}
	}
	public class ANON383 {
		ANON383() {
		}
	}
}
