package atlas.java.nio;
public abstract class ByteBuffer extends atlas.java.nio.Buffer implements java.lang.Comparable<atlas.java.nio.ByteBuffer> {
	public ByteBuffer() {
	}
	public abstract byte get(int p0);
	public atlas.java.nio.ByteBuffer get(byte[] p0, int p1, int p2) {
		atlas.java.nio.ByteBuffer r = null;
		return (atlas.java.nio.ByteBuffer)r;
	}
	public abstract byte get();
	public atlas.java.nio.ByteBuffer get(byte[] p0) {
		atlas.java.nio.ByteBuffer r = null;
		return (atlas.java.nio.ByteBuffer)r;
	}
	public atlas.java.nio.ByteBuffer put(byte[] p0, int p1, int p2) {
		atlas.java.nio.ByteBuffer r = null;
		return (atlas.java.nio.ByteBuffer)r;
	}
	public abstract atlas.java.nio.ByteBuffer put(byte p0);
	public atlas.java.nio.ByteBuffer put(atlas.java.nio.ByteBuffer p0) {
		atlas.java.nio.ByteBuffer r = null;
		return (atlas.java.nio.ByteBuffer)r;
	}
	public abstract atlas.java.nio.ByteBuffer put(int p0, byte p1);
	public final atlas.java.nio.ByteBuffer put(byte[] p0) {
		atlas.java.nio.ByteBuffer r = null;
		return (atlas.java.nio.ByteBuffer)r;
	}
	public boolean equals(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public java.lang.String toString() {
		java.lang.String r = null;
		return (java.lang.String)r;
	}
	public int hashCode() {
		int r = 0;
		return (int)r;
	}
	public int compareTo(atlas.java.nio.ByteBuffer p0) {
		int r = 0;
		return (int)r;
	}
	public abstract short getShort();
	public abstract short getShort(int p0);
	public abstract atlas.java.nio.ByteBuffer putShort(int p0, short p1);
	public abstract atlas.java.nio.ByteBuffer putShort(short p0);
	public abstract char getChar(int p0);
	public abstract char getChar();
	public abstract atlas.java.nio.ByteBuffer putChar(int p0, char p1);
	public abstract atlas.java.nio.ByteBuffer putChar(char p0);
	public abstract int getInt();
	public abstract int getInt(int p0);
	public abstract atlas.java.nio.ByteBuffer putInt(int p0);
	public abstract atlas.java.nio.ByteBuffer putInt(int p0, int p1);
	public abstract long getLong(int p0);
	public abstract long getLong();
	public abstract atlas.java.nio.ByteBuffer putLong(int p0, long p1);
	public abstract atlas.java.nio.ByteBuffer putLong(long p0);
	public abstract float getFloat();
	public abstract float getFloat(int p0);
	public abstract atlas.java.nio.ByteBuffer putFloat(float p0);
	public abstract atlas.java.nio.ByteBuffer putFloat(int p0, float p1);
	public abstract double getDouble(int p0);
	public abstract double getDouble();
	public abstract atlas.java.nio.ByteBuffer putDouble(int p0, double p1);
	public abstract atlas.java.nio.ByteBuffer putDouble(double p0);
	public abstract boolean isDirect();
	public final boolean hasArray() {
		boolean r = false;
		return (boolean)r;
	}
	public final byte[] array() {
		byte[] r = null;
		return (byte[])r;
	}
	public final int arrayOffset() {
		int r = 0;
		return (int)r;
	}
	public static atlas.java.nio.ByteBuffer wrap(byte[] p0) {
		atlas.java.nio.ByteBuffer r = null;
		return (atlas.java.nio.ByteBuffer)r;
	}
	public static atlas.java.nio.ByteBuffer wrap(byte[] p0, int p1, int p2) {
		atlas.java.nio.ByteBuffer r = null;
		return (atlas.java.nio.ByteBuffer)r;
	}
	public static atlas.java.nio.ByteBuffer allocate(int p0) {
		atlas.java.nio.ByteBuffer r = null;
		return (atlas.java.nio.ByteBuffer)r;
	}
	public abstract atlas.java.nio.ByteBuffer duplicate();
	public static atlas.java.nio.ByteBuffer allocateDirect(int p0) {
		atlas.java.nio.ByteBuffer r = null;
		return (atlas.java.nio.ByteBuffer)r;
	}
	public abstract atlas.java.nio.ByteBuffer slice();
	public abstract atlas.java.nio.ByteBuffer asReadOnlyBuffer();
	public abstract atlas.java.nio.ByteBuffer compact();
	public final atlas.java.nio.ByteBuffer order(java.nio.ByteOrder p0) {
		atlas.java.nio.ByteBuffer r = null;
		return (atlas.java.nio.ByteBuffer)r;
	}
	public final java.nio.ByteOrder order() {
		java.nio.ByteOrder r = null;
		return (java.nio.ByteOrder)r;
	}
	public abstract java.nio.CharBuffer asCharBuffer();
	public abstract java.nio.ShortBuffer asShortBuffer();
	public abstract atlas.java.nio.IntBuffer asIntBuffer();
	public abstract java.nio.LongBuffer asLongBuffer();
	public abstract java.nio.FloatBuffer asFloatBuffer();
	public abstract java.nio.DoubleBuffer asDoubleBuffer();
}
