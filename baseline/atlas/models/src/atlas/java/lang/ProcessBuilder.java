package atlas.java.lang;
public final class ProcessBuilder {
	public ProcessBuilder(atlas.java.util.List<java.lang.String> p0) {
	}
	public ProcessBuilder() {
	}
	public boolean redirectErrorStream() {
		boolean r = false;
		return (boolean)r;
	}
	public atlas.java.lang.ProcessBuilder redirectErrorStream(boolean p0) {
		atlas.java.lang.ProcessBuilder r = null;
		return (atlas.java.lang.ProcessBuilder)r;
	}
	public atlas.java.lang.ProcessBuilder redirectInput(java.io.File p0) {
		atlas.java.lang.ProcessBuilder r = null;
		return (atlas.java.lang.ProcessBuilder)r;
	}
	public atlas.java.lang.ProcessBuilder redirectInput(atlas.java.lang.ProcessBuilder.Redirect p0) {
		atlas.java.lang.ProcessBuilder r = null;
		return (atlas.java.lang.ProcessBuilder)r;
	}
	public atlas.java.lang.ProcessBuilder.Redirect redirectInput() {
		atlas.java.lang.ProcessBuilder.Redirect r = null;
		return (atlas.java.lang.ProcessBuilder.Redirect)r;
	}
	public atlas.java.lang.ProcessBuilder redirectOutput(java.io.File p0) {
		atlas.java.lang.ProcessBuilder r = null;
		return (atlas.java.lang.ProcessBuilder)r;
	}
	public atlas.java.lang.ProcessBuilder.Redirect redirectOutput() {
		atlas.java.lang.ProcessBuilder.Redirect r = null;
		return (atlas.java.lang.ProcessBuilder.Redirect)r;
	}
	public atlas.java.lang.ProcessBuilder redirectOutput(atlas.java.lang.ProcessBuilder.Redirect p0) {
		atlas.java.lang.ProcessBuilder r = null;
		return (atlas.java.lang.ProcessBuilder)r;
	}
	public atlas.java.lang.ProcessBuilder redirectError(atlas.java.lang.ProcessBuilder.Redirect p0) {
		atlas.java.lang.ProcessBuilder r = null;
		return (atlas.java.lang.ProcessBuilder)r;
	}
	public atlas.java.lang.ProcessBuilder redirectError(java.io.File p0) {
		atlas.java.lang.ProcessBuilder r = null;
		return (atlas.java.lang.ProcessBuilder)r;
	}
	public atlas.java.lang.ProcessBuilder.Redirect redirectError() {
		atlas.java.lang.ProcessBuilder.Redirect r = null;
		return (atlas.java.lang.ProcessBuilder.Redirect)r;
	}
	public atlas.java.lang.ProcessBuilder inheritIO() {
		atlas.java.lang.ProcessBuilder r = null;
		return (atlas.java.lang.ProcessBuilder)r;
	}
	public java.lang.Process start() {
		java.lang.Process r = null;
		return (java.lang.Process)r;
	}
	public java.io.File directory() {
		java.io.File r = null;
		return (java.io.File)r;
	}
	public atlas.java.lang.ProcessBuilder directory(java.io.File p0) {
		atlas.java.lang.ProcessBuilder r = null;
		return (atlas.java.lang.ProcessBuilder)r;
	}
	public atlas.java.util.List<java.lang.String> command() {
		atlas.java.util.List r = null;
		return (atlas.java.util.List<java.lang.String>)r;
	}
	public atlas.java.lang.ProcessBuilder command(atlas.java.util.List<java.lang.String> p0) {
		atlas.java.lang.ProcessBuilder r = null;
		return (atlas.java.lang.ProcessBuilder)r;
	}
	public atlas.java.lang.ProcessBuilder command(java.lang.String[] p0) {
		atlas.java.lang.ProcessBuilder r = null;
		return (atlas.java.lang.ProcessBuilder)r;
	}
	public atlas.java.util.Map<java.lang.String, java.lang.String> environment() {
		atlas.java.util.Map r = null;
		return (atlas.java.util.Map<java.lang.String, java.lang.String>)r;
	}
	public abstract static class Redirect {
		public Redirect() {
		}
		public abstract atlas.java.lang.ProcessBuilder.Redirect.Type type();
		public boolean equals(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public int hashCode() {
			int r = 0;
			return (int)r;
		}
		public static atlas.java.lang.ProcessBuilder.Redirect to(java.io.File p0) {
			atlas.java.lang.ProcessBuilder.Redirect r = null;
			return (atlas.java.lang.ProcessBuilder.Redirect)r;
		}
		public static atlas.java.lang.ProcessBuilder.Redirect from(java.io.File p0) {
			atlas.java.lang.ProcessBuilder.Redirect r = null;
			return (atlas.java.lang.ProcessBuilder.Redirect)r;
		}
		public java.io.File file() {
			java.io.File r = null;
			return (java.io.File)r;
		}
		public static atlas.java.lang.ProcessBuilder.Redirect appendTo(java.io.File p0) {
			atlas.java.lang.ProcessBuilder.Redirect r = null;
			return (atlas.java.lang.ProcessBuilder.Redirect)r;
		}
		public static enum Type {
			PIPE, INHERIT, READ, WRITE, APPEND;
		}
		public class ANON279 extends atlas.java.lang.ProcessBuilder.Redirect {
			ANON279() {
			}
			public atlas.java.lang.ProcessBuilder.Redirect.Type type() {
				atlas.java.lang.ProcessBuilder.Redirect.Type r = null;
				return (atlas.java.lang.ProcessBuilder.Redirect.Type)r;
			}
			public java.lang.String toString() {
				java.lang.String r = null;
				return (java.lang.String)r;
			}
		}
		public class ANON235 extends atlas.java.lang.ProcessBuilder.Redirect {
			ANON235() {
			}
			public atlas.java.lang.ProcessBuilder.Redirect.Type type() {
				atlas.java.lang.ProcessBuilder.Redirect.Type r = null;
				return (atlas.java.lang.ProcessBuilder.Redirect.Type)r;
			}
			public java.lang.String toString() {
				java.lang.String r = null;
				return (java.lang.String)r;
			}
		}
		public class ANON28 extends atlas.java.lang.ProcessBuilder.Redirect {
			ANON28() {
			}
			public atlas.java.lang.ProcessBuilder.Redirect.Type type() {
				atlas.java.lang.ProcessBuilder.Redirect.Type r = null;
				return (atlas.java.lang.ProcessBuilder.Redirect.Type)r;
			}
			public java.lang.String toString() {
				java.lang.String r = null;
				return (java.lang.String)r;
			}
			public java.io.File file() {
				java.io.File r = null;
				return (java.io.File)r;
			}
		}
		public class ANON363 extends atlas.java.lang.ProcessBuilder.Redirect {
			ANON363() {
			}
			public atlas.java.lang.ProcessBuilder.Redirect.Type type() {
				atlas.java.lang.ProcessBuilder.Redirect.Type r = null;
				return (atlas.java.lang.ProcessBuilder.Redirect.Type)r;
			}
			public java.lang.String toString() {
				java.lang.String r = null;
				return (java.lang.String)r;
			}
			public java.io.File file() {
				java.io.File r = null;
				return (java.io.File)r;
			}
		}
		public class ANON330 extends atlas.java.lang.ProcessBuilder.Redirect {
			ANON330() {
			}
			public atlas.java.lang.ProcessBuilder.Redirect.Type type() {
				atlas.java.lang.ProcessBuilder.Redirect.Type r = null;
				return (atlas.java.lang.ProcessBuilder.Redirect.Type)r;
			}
			public java.lang.String toString() {
				java.lang.String r = null;
				return (java.lang.String)r;
			}
			public java.io.File file() {
				java.io.File r = null;
				return (java.io.File)r;
			}
		}
	}
	public static class NullOutputStream extends java.io.OutputStream {
		public NullOutputStream() {
		}
		public void write(int p0) {
		}
	}
	public static class NullInputStream extends java.io.InputStream {
		public NullInputStream() {
		}
		public int read() {
			int r = 0;
			return (int)r;
		}
		public int available() {
			int r = 0;
			return (int)r;
		}
	}
	public class ANON373 {
		ANON373() {
		}
	}
}
