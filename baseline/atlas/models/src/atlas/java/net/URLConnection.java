package atlas.java.net;
public abstract class URLConnection {
	protected URLConnection(java.net.URL p0) {
	}
	public URLConnection() {
	}
	public void setRequestProperty(java.lang.String p0, java.lang.String p1) {
	}
	public void setUseCaches(boolean p0) {
	}
	public int getContentLength() {
		int r = 0;
		return (int)r;
	}
	public java.lang.String getHeaderField(java.lang.String p0) {
		java.lang.String r = null;
		return (java.lang.String)r;
	}
	public java.lang.String getHeaderField(int p0) {
		java.lang.String r = null;
		return (java.lang.String)r;
	}
	public long getContentLengthLong() {
		long r = 0;
		return (long)r;
	}
	public java.lang.String getHeaderFieldKey(int p0) {
		java.lang.String r = null;
		return (java.lang.String)r;
	}
	public long getLastModified() {
		long r = 0;
		return (long)r;
	}
	public static synchronized java.net.FileNameMap getFileNameMap() {
		java.net.FileNameMap r = null;
		return (java.net.FileNameMap)r;
	}
	public void addRequestProperty(java.lang.String p0, java.lang.String p1) {
	}
	public java.lang.String getRequestProperty(java.lang.String p0) {
		java.lang.String r = null;
		return (java.lang.String)r;
	}
	public atlas.java.util.Map<java.lang.String, atlas.java.util.List<java.lang.String>> getRequestProperties() {
		atlas.java.util.Map r = null;
		return (atlas.java.util.Map<java.lang.String, atlas.java.util.List<java.lang.String>>)r;
	}
	public java.lang.String getContentType() {
		java.lang.String r = null;
		return (java.lang.String)r;
	}
	public static java.lang.String guessContentTypeFromStream(java.io.InputStream p0) {
		java.lang.String r = null;
		return (java.lang.String)r;
	}
	public static java.lang.String guessContentTypeFromName(java.lang.String p0) {
		java.lang.String r = null;
		return (java.lang.String)r;
	}
	public static void setFileNameMap(java.net.FileNameMap p0) {
	}
	public void setConnectTimeout(int p0) {
	}
	public int getConnectTimeout() {
		int r = 0;
		return (int)r;
	}
	public void setReadTimeout(int p0) {
	}
	public int getReadTimeout() {
		int r = 0;
		return (int)r;
	}
	public java.lang.String getContentEncoding() {
		java.lang.String r = null;
		return (java.lang.String)r;
	}
	public long getExpiration() {
		long r = 0;
		return (long)r;
	}
	public long getDate() {
		long r = 0;
		return (long)r;
	}
	public atlas.java.util.Map<java.lang.String, atlas.java.util.List<java.lang.String>> getHeaderFields() {
		atlas.java.util.Map r = null;
		return (atlas.java.util.Map<java.lang.String, atlas.java.util.List<java.lang.String>>)r;
	}
	public int getHeaderFieldInt(java.lang.String p0, int p1) {
		int r = 0;
		return (int)r;
	}
	public long getHeaderFieldLong(java.lang.String p0, long p1) {
		long r = 0;
		return (long)r;
	}
	public long getHeaderFieldDate(java.lang.String p0, long p1) {
		long r = 0;
		return (long)r;
	}
	public java.io.OutputStream getOutputStream() {
		java.io.OutputStream r = null;
		return (java.io.OutputStream)r;
	}
	public void setDoInput(boolean p0) {
	}
	public boolean getDoInput() {
		boolean r = false;
		return (boolean)r;
	}
	public void setDoOutput(boolean p0) {
	}
	public boolean getDoOutput() {
		boolean r = false;
		return (boolean)r;
	}
	public void setAllowUserInteraction(boolean p0) {
	}
	public boolean getAllowUserInteraction() {
		boolean r = false;
		return (boolean)r;
	}
	public static void setDefaultAllowUserInteraction(boolean p0) {
	}
	public static boolean getDefaultAllowUserInteraction() {
		boolean r = false;
		return (boolean)r;
	}
	public boolean getUseCaches() {
		boolean r = false;
		return (boolean)r;
	}
	public void setIfModifiedSince(long p0) {
	}
	public long getIfModifiedSince() {
		long r = 0;
		return (long)r;
	}
	public boolean getDefaultUseCaches() {
		boolean r = false;
		return (boolean)r;
	}
	public void setDefaultUseCaches(boolean p0) {
	}
	public static void setDefaultRequestProperty(java.lang.String p0, java.lang.String p1) {
	}
	public static java.lang.String getDefaultRequestProperty(java.lang.String p0) {
		java.lang.String r = null;
		return (java.lang.String)r;
	}
	public static synchronized void setContentHandlerFactory(java.net.ContentHandlerFactory p0) {
	}
	public java.lang.String toString() {
		java.lang.String r = null;
		return (java.lang.String)r;
	}
	public java.net.URL getURL() {
		java.net.URL r = null;
		return (java.net.URL)r;
	}
	public abstract void connect();
	public java.io.InputStream getInputStream() {
		java.io.InputStream r = null;
		return (java.io.InputStream)r;
	}
	public java.security.Permission getPermission() {
		java.security.Permission r = null;
		return (java.security.Permission)r;
	}
	public java.lang.Object getContent() {
		java.lang.Object r = null;
		return (java.lang.Object)r;
	}
	public java.lang.Object getContent(java.lang.Class[] p0) {
		java.lang.Object r = null;
		return (java.lang.Object)r;
	}
	public class ANON3 implements java.net.FileNameMap {
		ANON3() {
		}
		public java.lang.String getContentTypeFor(java.lang.String p0) {
			java.lang.String r = null;
			return (java.lang.String)r;
		}
	}
}
