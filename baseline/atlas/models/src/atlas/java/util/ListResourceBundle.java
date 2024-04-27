package atlas.java.util;
public abstract class ListResourceBundle extends java.util.ResourceBundle {
	public ListResourceBundle() {
	}
	protected abstract java.lang.Object[][] getContents();
	public final java.lang.Object handleGetObject(java.lang.String p0) {
		java.lang.Object r = null;
		return (java.lang.Object)r;
	}
	protected java.util.Set<java.lang.String> handleKeySet() {
		java.util.Set r = null;
		return (java.util.Set<java.lang.String>)r;
	}
	public java.util.Enumeration<java.lang.String> getKeys() {
		java.util.Enumeration r = null;
		return (java.util.Enumeration<java.lang.String>)r;
	}
}
