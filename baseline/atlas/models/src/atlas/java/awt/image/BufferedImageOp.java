package atlas.java.awt.image;
public abstract interface BufferedImageOp {
	public abstract java.awt.geom.Rectangle2D getBounds2D(atlas.java.awt.image.BufferedImage p0);
	public abstract java.awt.RenderingHints getRenderingHints();
	public abstract atlas.java.awt.image.BufferedImage createCompatibleDestImage(atlas.java.awt.image.BufferedImage p0, java.awt.image.ColorModel p1);
	public abstract java.awt.geom.Point2D getPoint2D(java.awt.geom.Point2D p0, java.awt.geom.Point2D p1);
	public abstract atlas.java.awt.image.BufferedImage filter(atlas.java.awt.image.BufferedImage p0, atlas.java.awt.image.BufferedImage p1);
}
