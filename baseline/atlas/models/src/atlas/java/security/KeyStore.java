package atlas.java.security;
public class KeyStore {
	protected KeyStore(atlas.java.security.KeyStoreSpi p0, java.security.Provider p1, java.lang.String p2) {
	}
	public KeyStore() {
	}
	public final java.security.cert.Certificate[] getCertificateChain(java.lang.String p0) {
		java.security.cert.Certificate[] r = null;
		return (java.security.cert.Certificate[])r;
	}
	public final java.security.cert.Certificate getCertificate(java.lang.String p0) {
		java.security.cert.Certificate r = null;
		return (java.security.cert.Certificate)r;
	}
	public final java.util.Date getCreationDate(java.lang.String p0) {
		java.util.Date r = null;
		return (java.util.Date)r;
	}
	public final void setKeyEntry(java.lang.String p0, java.security.Key p1, char[] p2, java.security.cert.Certificate[] p3) {
	}
	public final void setKeyEntry(java.lang.String p0, byte[] p1, java.security.cert.Certificate[] p2) {
	}
	public final void setCertificateEntry(java.lang.String p0, java.security.cert.Certificate p1) {
	}
	public final boolean containsAlias(java.lang.String p0) {
		boolean r = false;
		return (boolean)r;
	}
	public final boolean isKeyEntry(java.lang.String p0) {
		boolean r = false;
		return (boolean)r;
	}
	public final boolean isCertificateEntry(java.lang.String p0) {
		boolean r = false;
		return (boolean)r;
	}
	public final java.lang.String getCertificateAlias(java.security.cert.Certificate p0) {
		java.lang.String r = null;
		return (java.lang.String)r;
	}
	public final boolean entryInstanceOf(java.lang.String p0, java.lang.Class<? extends atlas.java.security.KeyStore.Entry> p1) {
		boolean r = false;
		return (boolean)r;
	}
	public static final java.lang.String getDefaultType() {
		java.lang.String r = null;
		return (java.lang.String)r;
	}
	public final java.security.Provider getProvider() {
		java.security.Provider r = null;
		return (java.security.Provider)r;
	}
	public final void setEntry(java.lang.String p0, atlas.java.security.KeyStore.Entry p1, atlas.java.security.KeyStore.ProtectionParameter p2) {
	}
	public final void deleteEntry(java.lang.String p0) {
	}
	public final int size() {
		int r = 0;
		return (int)r;
	}
	public final java.security.Key getKey(java.lang.String p0, char[] p1) {
		java.security.Key r = null;
		return (java.security.Key)r;
	}
	public static atlas.java.security.KeyStore getInstance(java.lang.String p0, java.lang.String p1) {
		atlas.java.security.KeyStore r = null;
		return (atlas.java.security.KeyStore)r;
	}
	public static atlas.java.security.KeyStore getInstance(java.lang.String p0) {
		atlas.java.security.KeyStore r = null;
		return (atlas.java.security.KeyStore)r;
	}
	public static atlas.java.security.KeyStore getInstance(java.lang.String p0, java.security.Provider p1) {
		atlas.java.security.KeyStore r = null;
		return (atlas.java.security.KeyStore)r;
	}
	public final void load(atlas.java.security.KeyStore.LoadStoreParameter p0) {
	}
	public final void load(java.io.InputStream p0, char[] p1) {
	}
	public final void store(java.io.OutputStream p0, char[] p1) {
	}
	public final void store(atlas.java.security.KeyStore.LoadStoreParameter p0) {
	}
	public final java.lang.String getType() {
		java.lang.String r = null;
		return (java.lang.String)r;
	}
	public final java.util.Enumeration<java.lang.String> aliases() {
		java.util.Enumeration r = null;
		return (java.util.Enumeration<java.lang.String>)r;
	}
	public final atlas.java.security.KeyStore.Entry getEntry(java.lang.String p0, atlas.java.security.KeyStore.ProtectionParameter p1) {
		atlas.java.security.KeyStore.Entry r = null;
		return (atlas.java.security.KeyStore.Entry)r;
	}
	public static class SimpleLoadStoreParameter implements atlas.java.security.KeyStore.LoadStoreParameter {
		SimpleLoadStoreParameter(atlas.java.security.KeyStore.ProtectionParameter p0) {
		}
		public SimpleLoadStoreParameter() {
		}
		public atlas.java.security.KeyStore.ProtectionParameter getProtectionParameter() {
			atlas.java.security.KeyStore.ProtectionParameter r = null;
			return (atlas.java.security.KeyStore.ProtectionParameter)r;
		}
	}
	public abstract static class Builder {
		public Builder() {
		}
		public abstract atlas.java.security.KeyStore getKeyStore();
		public abstract atlas.java.security.KeyStore.ProtectionParameter getProtectionParameter(java.lang.String p0);
		public static atlas.java.security.KeyStore.Builder newInstance(java.lang.String p0, java.security.Provider p1, atlas.java.security.KeyStore.ProtectionParameter p2) {
			atlas.java.security.KeyStore.Builder r = null;
			return (atlas.java.security.KeyStore.Builder)r;
		}
		public static atlas.java.security.KeyStore.Builder newInstance(java.lang.String p0, java.security.Provider p1, java.io.File p2, atlas.java.security.KeyStore.ProtectionParameter p3) {
			atlas.java.security.KeyStore.Builder r = null;
			return (atlas.java.security.KeyStore.Builder)r;
		}
		public static atlas.java.security.KeyStore.Builder newInstance(atlas.java.security.KeyStore p0, atlas.java.security.KeyStore.ProtectionParameter p1) {
			atlas.java.security.KeyStore.Builder r = null;
			return (atlas.java.security.KeyStore.Builder)r;
		}
		public static final class FileBuilder extends atlas.java.security.KeyStore.Builder {
			FileBuilder(java.lang.String p0, java.security.Provider p1, java.io.File p2, atlas.java.security.KeyStore.ProtectionParameter p3, java.security.AccessControlContext p4) {
			}
			public FileBuilder() {
			}
			public synchronized atlas.java.security.KeyStore getKeyStore() {
				atlas.java.security.KeyStore r = null;
				return (atlas.java.security.KeyStore)r;
			}
			public synchronized atlas.java.security.KeyStore.ProtectionParameter getProtectionParameter(java.lang.String p0) {
				atlas.java.security.KeyStore.ProtectionParameter r = null;
				return (atlas.java.security.KeyStore.ProtectionParameter)r;
			}
			public class ANON88 implements java.security.PrivilegedExceptionAction<atlas.java.security.KeyStore> {
				ANON88() {
				}
				public atlas.java.security.KeyStore run0() {
					atlas.java.security.KeyStore r = null;
					return (atlas.java.security.KeyStore)r;
				}
				public atlas.java.security.KeyStore run() {
					atlas.java.security.KeyStore r = null;
					return (atlas.java.security.KeyStore)r;
				}
			}
		}
		public class ANON163 extends atlas.java.security.KeyStore.Builder {
			ANON163() {
			}
			public atlas.java.security.KeyStore getKeyStore() {
				atlas.java.security.KeyStore r = null;
				return (atlas.java.security.KeyStore)r;
			}
			public atlas.java.security.KeyStore.ProtectionParameter getProtectionParameter(java.lang.String p0) {
				atlas.java.security.KeyStore.ProtectionParameter r = null;
				return (atlas.java.security.KeyStore.ProtectionParameter)r;
			}
		}
		public class ANON168 extends atlas.java.security.KeyStore.Builder {
			ANON168() {
			}
			public synchronized atlas.java.security.KeyStore getKeyStore() {
				atlas.java.security.KeyStore r = null;
				return (atlas.java.security.KeyStore)r;
			}
			public atlas.java.security.KeyStore.ProtectionParameter getProtectionParameter(java.lang.String p0) {
				atlas.java.security.KeyStore.ProtectionParameter r = null;
				return (atlas.java.security.KeyStore.ProtectionParameter)r;
			}
			public class ANON292 implements java.security.PrivilegedExceptionAction<atlas.java.security.KeyStore> {
				ANON292() {
				}
				public atlas.java.security.KeyStore run() {
					atlas.java.security.KeyStore r = null;
					return (atlas.java.security.KeyStore)r;
				}
			}
		}
	}
	public static final class TrustedCertificateEntry implements atlas.java.security.KeyStore.Entry {
		public TrustedCertificateEntry(java.security.cert.Certificate p0) {
		}
		public TrustedCertificateEntry(java.security.cert.Certificate p0, java.util.Set<atlas.java.security.KeyStore.Entry.Attribute> p1) {
		}
		public TrustedCertificateEntry() {
		}
		public java.security.cert.Certificate getTrustedCertificate() {
			java.security.cert.Certificate r = null;
			return (java.security.cert.Certificate)r;
		}
		public java.lang.String toString() {
			java.lang.String r = null;
			return (java.lang.String)r;
		}
		public java.util.Set<atlas.java.security.KeyStore.Entry.Attribute> getAttributes() {
			java.util.Set r = null;
			return (java.util.Set<atlas.java.security.KeyStore.Entry.Attribute>)r;
		}
	}
	public static final class SecretKeyEntry implements atlas.java.security.KeyStore.Entry {
		public SecretKeyEntry() {
		}
		public java.lang.String toString() {
			java.lang.String r = null;
			return (java.lang.String)r;
		}
		public java.util.Set<atlas.java.security.KeyStore.Entry.Attribute> getAttributes() {
			java.util.Set r = null;
			return (java.util.Set<atlas.java.security.KeyStore.Entry.Attribute>)r;
		}
	}
	public static final class PrivateKeyEntry implements atlas.java.security.KeyStore.Entry {
		public PrivateKeyEntry() {
		}
		public java.security.cert.Certificate[] getCertificateChain() {
			java.security.cert.Certificate[] r = null;
			return (java.security.cert.Certificate[])r;
		}
		public java.security.cert.Certificate getCertificate() {
			java.security.cert.Certificate r = null;
			return (java.security.cert.Certificate)r;
		}
		public java.security.PrivateKey getPrivateKey() {
			java.security.PrivateKey r = null;
			return (java.security.PrivateKey)r;
		}
		public java.lang.String toString() {
			java.lang.String r = null;
			return (java.lang.String)r;
		}
		public java.util.Set<atlas.java.security.KeyStore.Entry.Attribute> getAttributes() {
			java.util.Set r = null;
			return (java.util.Set<atlas.java.security.KeyStore.Entry.Attribute>)r;
		}
	}
	public abstract static interface Entry {
		public abstract static interface Attribute {
			public abstract java.lang.String getName();
			public abstract java.lang.String getValue();
		}
	}
	public static class CallbackHandlerProtection implements atlas.java.security.KeyStore.ProtectionParameter {
		public CallbackHandlerProtection() {
		}
	}
	public static class PasswordProtection implements atlas.java.security.KeyStore.ProtectionParameter {
		public PasswordProtection() {
		}
		public java.lang.String getProtectionAlgorithm() {
			java.lang.String r = null;
			return (java.lang.String)r;
		}
		public java.security.spec.AlgorithmParameterSpec getProtectionParameters() {
			java.security.spec.AlgorithmParameterSpec r = null;
			return (java.security.spec.AlgorithmParameterSpec)r;
		}
		public synchronized char[] getPassword() {
			char[] r = null;
			return (char[])r;
		}
		public synchronized void destroy() {
		}
		public synchronized boolean isDestroyed() {
			boolean r = false;
			return (boolean)r;
		}
	}
	public abstract static interface ProtectionParameter {
	}
	public abstract static interface LoadStoreParameter {
		public abstract atlas.java.security.KeyStore.ProtectionParameter getProtectionParameter();
	}
	public class ANON64 implements java.security.PrivilegedAction<java.lang.String> {
		ANON64() {
		}
		public java.lang.String run() {
			java.lang.String r = null;
			return (java.lang.String)r;
		}
	}
}
