package atlas.java.util;
public class Properties extends atlas.atlas.java.util.Hashtable<java.lang.Object, java.lang.Object> {
	public java.lang.Object f54;
	public java.lang.Object f59;
	public Properties(atlas.java.util.Properties p0) {
	}
	public Properties() {
	}
	public synchronized java.lang.Object setProperty(java.lang.String p0, java.lang.String p1) {
		java.lang.Object r = null;
		return (java.lang.Object)r;
	}
	public java.lang.String getProperty(java.lang.String p0) {
		java.lang.String r = null;
		return (java.lang.String)r;
	}
	public java.lang.String getProperty(java.lang.String p0, java.lang.String p1) {
		java.lang.String r = null;
		return (java.lang.String)r;
	}
	public void list(java.io.PrintWriter p0) {
	}
	public void list(java.io.PrintStream p0) {
	}
	public synchronized void load(java.io.Reader p0) {
	}
	public synchronized void load(java.io.InputStream p0) {
	}
	public void save(java.io.OutputStream p0, java.lang.String p1) {
	}
	public void store(java.io.OutputStream p0, java.lang.String p1) {
	}
	public void store(java.io.Writer p0, java.lang.String p1) {
	}
	public synchronized void loadFromXML(java.io.InputStream p0) {
	}
	public void storeToXML(java.io.OutputStream p0, java.lang.String p1) {
	}
	public void storeToXML(java.io.OutputStream p0, java.lang.String p1, java.lang.String p2) {
	}
	public java.util.Enumeration<?> propertyNames() {
		java.util.Enumeration r = null;
		r = new atlas.java.util.Hashtable.Enumerator();
		r = new atlas.java.util.Collections.EmptyEnumeration();
		((atlas.java.util.Hashtable.Enumerator)r).f17 = (java.lang.Object)((atlas.java.util.Properties)this).f54;
		return (java.util.Enumeration<?>)r;
	}
	public java.util.Set<java.lang.String> stringPropertyNames() {
		java.util.Set r = null;
		r = new atlas.java.util.Collections.SynchronizedSet();
		((atlas.java.util.Collections.SynchronizedSet)r).f73 = (java.lang.Object)((atlas.java.util.Properties)this).f54;
		return (java.util.Set<java.lang.String>)r;
	}
	public static class XmlSupport {
		public XmlSupport() {
		}
	}
	public class LineReader {
		public LineReader(atlas.java.util.Properties p0, java.io.InputStream p1) {
		}
		public LineReader(atlas.java.util.Properties p0, java.io.Reader p1) {
		}
		public LineReader() {
		}
	}
}
