package atlas.java.awt;
public abstract class Image {
	public Image() {
	}
	public atlas.java.awt.ImageCapabilities getCapabilities(java.awt.GraphicsConfiguration p0) {
		atlas.java.awt.ImageCapabilities r = null;
		return (atlas.java.awt.ImageCapabilities)r;
	}
	public atlas.java.awt.Image getScaledInstance(int p0, int p1, int p2) {
		atlas.java.awt.Image r = null;
		return (atlas.java.awt.Image)r;
	}
	public void setAccelerationPriority(float p0) {
	}
	public float getAccelerationPriority() {
		float r = 0;
		return (float)r;
	}
	public abstract int getHeight(java.awt.image.ImageObserver p0);
	public abstract java.awt.Graphics getGraphics();
	public abstract int getWidth(java.awt.image.ImageObserver p0);
	public abstract java.awt.image.ImageProducer getSource();
	public abstract java.lang.Object getProperty(java.lang.String p0, java.awt.image.ImageObserver p1);
	public void flush() {
	}
	public class ANON396 {
		ANON396() {
		}
	}
}
