package atlas.java.security;
public abstract class KeyStoreSpi {
	public KeyStoreSpi() {
	}
	public abstract java.security.Key engineGetKey(java.lang.String p0, char[] p1);
	public abstract java.security.cert.Certificate[] engineGetCertificateChain(java.lang.String p0);
	public abstract java.security.cert.Certificate engineGetCertificate(java.lang.String p0);
	public abstract java.util.Date engineGetCreationDate(java.lang.String p0);
	public abstract void engineSetKeyEntry(java.lang.String p0, byte[] p1, java.security.cert.Certificate[] p2);
	public abstract void engineSetKeyEntry(java.lang.String p0, java.security.Key p1, char[] p2, java.security.cert.Certificate[] p3);
	public abstract void engineSetCertificateEntry(java.lang.String p0, java.security.cert.Certificate p1);
	public abstract void engineDeleteEntry(java.lang.String p0);
	public abstract java.util.Enumeration<java.lang.String> engineAliases();
	public abstract boolean engineContainsAlias(java.lang.String p0);
	public abstract int engineSize();
	public abstract boolean engineIsKeyEntry(java.lang.String p0);
	public abstract boolean engineIsCertificateEntry(java.lang.String p0);
	public abstract java.lang.String engineGetCertificateAlias(java.security.cert.Certificate p0);
	public void engineStore(atlas.java.security.KeyStore.LoadStoreParameter p0) {
	}
	public abstract void engineStore(java.io.OutputStream p0, char[] p1);
	public void engineLoad(atlas.java.security.KeyStore.LoadStoreParameter p0) {
	}
	public abstract void engineLoad(java.io.InputStream p0, char[] p1);
	public atlas.java.security.KeyStore.Entry engineGetEntry(java.lang.String p0, atlas.java.security.KeyStore.ProtectionParameter p1) {
		atlas.java.security.KeyStore.Entry r = null;
		return (atlas.java.security.KeyStore.Entry)r;
	}
	public void engineSetEntry(java.lang.String p0, atlas.java.security.KeyStore.Entry p1, atlas.java.security.KeyStore.ProtectionParameter p2) {
	}
	public boolean engineEntryInstanceOf(java.lang.String p0, java.lang.Class<? extends atlas.java.security.KeyStore.Entry> p1) {
		boolean r = false;
		return (boolean)r;
	}
}
