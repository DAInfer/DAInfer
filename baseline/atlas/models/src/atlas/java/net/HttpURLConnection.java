package atlas.java.net;
public abstract class HttpURLConnection extends atlas.java.net.URLConnection {
	protected HttpURLConnection(java.net.URL p0) {
	}
	public HttpURLConnection() {
	}
	public void setFixedLengthStreamingMode(long p0) {
	}
	public void setFixedLengthStreamingMode(int p0) {
	}
	public void setChunkedStreamingMode(int p0) {
	}
	public static void setFollowRedirects(boolean p0) {
	}
	public static boolean getFollowRedirects() {
		boolean r = false;
		return (boolean)r;
	}
	public boolean getInstanceFollowRedirects() {
		boolean r = false;
		return (boolean)r;
	}
	public java.lang.String getRequestMethod() {
		java.lang.String r = null;
		return (java.lang.String)r;
	}
	public java.lang.String getResponseMessage() {
		java.lang.String r = null;
		return (java.lang.String)r;
	}
	public abstract boolean usingProxy();
	public void setRequestMethod(java.lang.String p0) {
	}
	public int getResponseCode() {
		int r = 0;
		return (int)r;
	}
	public void setInstanceFollowRedirects(boolean p0) {
	}
	public java.lang.String getHeaderField(int p0) {
		java.lang.String r = null;
		return (java.lang.String)r;
	}
	public java.lang.String getHeaderFieldKey(int p0) {
		java.lang.String r = null;
		return (java.lang.String)r;
	}
	public long getHeaderFieldDate(java.lang.String p0, long p1) {
		long r = 0;
		return (long)r;
	}
	public abstract void disconnect();
	public java.io.InputStream getErrorStream() {
		java.io.InputStream r = null;
		return (java.io.InputStream)r;
	}
	public java.security.Permission getPermission() {
		java.security.Permission r = null;
		return (java.security.Permission)r;
	}
}
