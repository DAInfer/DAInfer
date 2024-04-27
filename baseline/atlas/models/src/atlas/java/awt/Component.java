package atlas.java.awt;
public abstract class Component implements java.awt.image.ImageObserver, java.awt.MenuContainer, java.io.Serializable {
	public Component() {
	}
	public java.util.Locale getLocale() {
		java.util.Locale r = null;
		return (java.util.Locale)r;
	}
	public void setLocale(java.util.Locale p0) {
	}
	public java.awt.Rectangle getBounds() {
		java.awt.Rectangle r = null;
		return (java.awt.Rectangle)r;
	}
	public java.awt.Rectangle getBounds(java.awt.Rectangle p0) {
		java.awt.Rectangle r = null;
		return (java.awt.Rectangle)r;
	}
	public void validate() {
	}
	public void invalidate() {
	}
	public java.awt.Color getBackground() {
		java.awt.Color r = null;
		return (java.awt.Color)r;
	}
	public void setBackground(java.awt.Color p0) {
	}
	public java.awt.Color getForeground() {
		java.awt.Color r = null;
		return (java.awt.Color)r;
	}
	public void setForeground(java.awt.Color p0) {
	}
	public java.awt.Cursor getCursor() {
		java.awt.Cursor r = null;
		return (java.awt.Cursor)r;
	}
	public void setCursor(java.awt.Cursor p0) {
	}
	public java.awt.Font getFont() {
		java.awt.Font r = null;
		return (java.awt.Font)r;
	}
	public void setFont(java.awt.Font p0) {
	}
	public java.awt.FontMetrics getFontMetrics(java.awt.Font p0) {
		java.awt.FontMetrics r = null;
		return (java.awt.FontMetrics)r;
	}
	public void setEnabled(boolean p0) {
	}
	public boolean isVisible() {
		boolean r = false;
		return (boolean)r;
	}
	public void setVisible(boolean p0) {
	}
	public boolean isShowing() {
		boolean r = false;
		return (boolean)r;
	}
	public java.awt.Point getLocationOnScreen() {
		java.awt.Point r = null;
		return (java.awt.Point)r;
	}
	public void setLocation(java.awt.Point p0) {
	}
	public void setLocation(int p0, int p1) {
	}
	public void setBounds(int p0, int p1, int p2, int p3) {
	}
	public void setBounds(java.awt.Rectangle p0) {
	}
	public boolean isFocusTraversable() {
		boolean r = false;
		return (boolean)r;
	}
	public void requestFocus() {
	}
	protected boolean requestFocus(boolean p0) {
		boolean r = false;
		return (boolean)r;
	}
	public synchronized void addFocusListener(java.awt.event.FocusListener p0) {
	}
	public synchronized void removeFocusListener(java.awt.event.FocusListener p0) {
	}
	public synchronized void addComponentListener(java.awt.event.ComponentListener p0) {
	}
	public synchronized void removeComponentListener(java.awt.event.ComponentListener p0) {
	}
	public void firePropertyChange(java.lang.String p0, byte p1, byte p2) {
	}
	public void firePropertyChange(java.lang.String p0, short p1, short p2) {
	}
	public void firePropertyChange(java.lang.String p0, char p1, char p2) {
	}
	protected void firePropertyChange(java.lang.String p0, java.lang.Object p1, java.lang.Object p2) {
	}
	protected void firePropertyChange(java.lang.String p0, int p1, int p2) {
	}
	protected void firePropertyChange(java.lang.String p0, boolean p1, boolean p2) {
	}
	public void firePropertyChange(java.lang.String p0, double p1, double p2) {
	}
	public void firePropertyChange(java.lang.String p0, long p1, long p2) {
	}
	public void firePropertyChange(java.lang.String p0, float p1, float p2) {
	}
	public final java.lang.Object getTreeLock() {
		java.lang.Object r = null;
		return (java.lang.Object)r;
	}
	public boolean postEvent(java.awt.Event p0) {
		boolean r = false;
		return (boolean)r;
	}
	public void addNotify() {
	}
	public <T> T[] getListeners(java.lang.Class<T> p0) {
		java.util.EventListener[] r = null;
		return (T[])r;
	}
	protected void processEvent(java.awt.AWTEvent p0) {
	}
	public java.awt.Toolkit getToolkit() {
		java.awt.Toolkit r = null;
		return (java.awt.Toolkit)r;
	}
	public java.awt.peer.ComponentPeer getPeer() {
		java.awt.peer.ComponentPeer r = null;
		return (java.awt.peer.ComponentPeer)r;
	}
	public synchronized void setDropTarget(java.awt.dnd.DropTarget p0) {
	}
	public synchronized java.awt.dnd.DropTarget getDropTarget() {
		java.awt.dnd.DropTarget r = null;
		return (java.awt.dnd.DropTarget)r;
	}
	public java.awt.GraphicsConfiguration getGraphicsConfiguration() {
		java.awt.GraphicsConfiguration r = null;
		return (java.awt.GraphicsConfiguration)r;
	}
	public boolean isDisplayable() {
		boolean r = false;
		return (boolean)r;
	}
	public java.awt.Point getMousePosition() {
		java.awt.Point r = null;
		return (java.awt.Point)r;
	}
	public boolean isDoubleBuffered() {
		boolean r = false;
		return (boolean)r;
	}
	public void enableInputMethods(boolean p0) {
	}
	public void show() {
	}
	public void show(boolean p0) {
	}
	public void hide() {
	}
	public boolean isForegroundSet() {
		boolean r = false;
		return (boolean)r;
	}
	public boolean isBackgroundSet() {
		boolean r = false;
		return (boolean)r;
	}
	public boolean isFontSet() {
		boolean r = false;
		return (boolean)r;
	}
	public java.awt.image.ColorModel getColorModel() {
		java.awt.image.ColorModel r = null;
		return (java.awt.image.ColorModel)r;
	}
	public void reshape(int p0, int p1, int p2, int p3) {
	}
	public int getHeight() {
		int r = 0;
		return (int)r;
	}
	public boolean isLightweight() {
		boolean r = false;
		return (boolean)r;
	}
	public void setPreferredSize(java.awt.Dimension p0) {
	}
	public java.awt.Dimension preferredSize() {
		java.awt.Dimension r = null;
		return (java.awt.Dimension)r;
	}
	public boolean isPreferredSizeSet() {
		boolean r = false;
		return (boolean)r;
	}
	public java.awt.Dimension getPreferredSize() {
		java.awt.Dimension r = null;
		return (java.awt.Dimension)r;
	}
	public void setMinimumSize(java.awt.Dimension p0) {
	}
	public java.awt.Dimension minimumSize() {
		java.awt.Dimension r = null;
		return (java.awt.Dimension)r;
	}
	public boolean isMinimumSizeSet() {
		boolean r = false;
		return (boolean)r;
	}
	public java.awt.Dimension getMinimumSize() {
		java.awt.Dimension r = null;
		return (java.awt.Dimension)r;
	}
	public void setMaximumSize(java.awt.Dimension p0) {
	}
	public boolean isMaximumSizeSet() {
		boolean r = false;
		return (boolean)r;
	}
	public java.awt.Dimension getMaximumSize() {
		java.awt.Dimension r = null;
		return (java.awt.Dimension)r;
	}
	public float getAlignmentX() {
		float r = 0;
		return (float)r;
	}
	public float getAlignmentY() {
		float r = 0;
		return (float)r;
	}
	public int getBaseline(int p0, int p1) {
		int r = 0;
		return (int)r;
	}
	public atlas.java.awt.Component.BaselineResizeBehavior getBaselineResizeBehavior() {
		atlas.java.awt.Component.BaselineResizeBehavior r = null;
		return (atlas.java.awt.Component.BaselineResizeBehavior)r;
	}
	public void doLayout() {
	}
	public void revalidate() {
	}
	public java.awt.Graphics getGraphics() {
		java.awt.Graphics r = null;
		return (java.awt.Graphics)r;
	}
	public boolean isCursorSet() {
		boolean r = false;
		return (boolean)r;
	}
	public void paint(java.awt.Graphics p0) {
	}
	public void paintAll(java.awt.Graphics p0) {
	}
	public void repaint() {
	}
	public void repaint(long p0) {
	}
	public void repaint(long p0, int p1, int p2, int p3, int p4) {
	}
	public void repaint(int p0, int p1, int p2, int p3) {
	}
	public void printAll(java.awt.Graphics p0) {
	}
	public boolean imageUpdate(atlas.java.awt.Image p0, int p1, int p2, int p3, int p4, int p5) {
		boolean r = false;
		return (boolean)r;
	}
	public atlas.java.awt.Image createImage(java.awt.image.ImageProducer p0) {
		atlas.java.awt.Image r = null;
		return (atlas.java.awt.Image)r;
	}
	public atlas.java.awt.Image createImage(int p0, int p1) {
		atlas.java.awt.Image r = null;
		return (atlas.java.awt.Image)r;
	}
	public java.awt.image.VolatileImage createVolatileImage(int p0, int p1) {
		java.awt.image.VolatileImage r = null;
		return (java.awt.image.VolatileImage)r;
	}
	public java.awt.image.VolatileImage createVolatileImage(int p0, int p1, atlas.java.awt.ImageCapabilities p2) {
		java.awt.image.VolatileImage r = null;
		return (java.awt.image.VolatileImage)r;
	}
	public boolean prepareImage(atlas.java.awt.Image p0, java.awt.image.ImageObserver p1) {
		boolean r = false;
		return (boolean)r;
	}
	public boolean prepareImage(atlas.java.awt.Image p0, int p1, int p2, java.awt.image.ImageObserver p3) {
		boolean r = false;
		return (boolean)r;
	}
	public int checkImage(atlas.java.awt.Image p0, int p1, int p2, java.awt.image.ImageObserver p3) {
		int r = 0;
		return (int)r;
	}
	public int checkImage(atlas.java.awt.Image p0, java.awt.image.ImageObserver p1) {
		int r = 0;
		return (int)r;
	}
	public void setIgnoreRepaint(boolean p0) {
	}
	public boolean getIgnoreRepaint() {
		boolean r = false;
		return (boolean)r;
	}
	public boolean inside(int p0, int p1) {
		boolean r = false;
		return (boolean)r;
	}
	public atlas.java.awt.Component getComponentAt(int p0, int p1) {
		atlas.java.awt.Component r = null;
		return (atlas.java.awt.Component)r;
	}
	public atlas.java.awt.Component getComponentAt(java.awt.Point p0) {
		atlas.java.awt.Component r = null;
		return (atlas.java.awt.Component)r;
	}
	public atlas.java.awt.Component locate(int p0, int p1) {
		atlas.java.awt.Component r = null;
		return (atlas.java.awt.Component)r;
	}
	public void deliverEvent(java.awt.Event p0) {
	}
	public synchronized java.awt.event.ComponentListener[] getComponentListeners() {
		java.awt.event.ComponentListener[] r = null;
		return (java.awt.event.ComponentListener[])r;
	}
	public synchronized java.awt.event.FocusListener[] getFocusListeners() {
		java.awt.event.FocusListener[] r = null;
		return (java.awt.event.FocusListener[])r;
	}
	public void addHierarchyListener(java.awt.event.HierarchyListener p0) {
	}
	public void removeHierarchyListener(java.awt.event.HierarchyListener p0) {
	}
	public synchronized java.awt.event.HierarchyListener[] getHierarchyListeners() {
		java.awt.event.HierarchyListener[] r = null;
		return (java.awt.event.HierarchyListener[])r;
	}
	public void addHierarchyBoundsListener(java.awt.event.HierarchyBoundsListener p0) {
	}
	public void removeHierarchyBoundsListener(java.awt.event.HierarchyBoundsListener p0) {
	}
	public synchronized java.awt.event.HierarchyBoundsListener[] getHierarchyBoundsListeners() {
		java.awt.event.HierarchyBoundsListener[] r = null;
		return (java.awt.event.HierarchyBoundsListener[])r;
	}
	public synchronized void addKeyListener(java.awt.event.KeyListener p0) {
	}
	public synchronized void removeKeyListener(java.awt.event.KeyListener p0) {
	}
	public synchronized java.awt.event.KeyListener[] getKeyListeners() {
		java.awt.event.KeyListener[] r = null;
		return (java.awt.event.KeyListener[])r;
	}
	public synchronized void addMouseListener(java.awt.event.MouseListener p0) {
	}
	public synchronized void removeMouseListener(java.awt.event.MouseListener p0) {
	}
	public synchronized java.awt.event.MouseListener[] getMouseListeners() {
		java.awt.event.MouseListener[] r = null;
		return (java.awt.event.MouseListener[])r;
	}
	public synchronized void addMouseMotionListener(java.awt.event.MouseMotionListener p0) {
	}
	public synchronized void removeMouseMotionListener(java.awt.event.MouseMotionListener p0) {
	}
	public synchronized java.awt.event.MouseMotionListener[] getMouseMotionListeners() {
		java.awt.event.MouseMotionListener[] r = null;
		return (java.awt.event.MouseMotionListener[])r;
	}
	public synchronized void addMouseWheelListener(java.awt.event.MouseWheelListener p0) {
	}
	public synchronized void removeMouseWheelListener(java.awt.event.MouseWheelListener p0) {
	}
	public synchronized java.awt.event.MouseWheelListener[] getMouseWheelListeners() {
		java.awt.event.MouseWheelListener[] r = null;
		return (java.awt.event.MouseWheelListener[])r;
	}
	public synchronized void addInputMethodListener(java.awt.event.InputMethodListener p0) {
	}
	public synchronized void removeInputMethodListener(java.awt.event.InputMethodListener p0) {
	}
	public synchronized java.awt.event.InputMethodListener[] getInputMethodListeners() {
		java.awt.event.InputMethodListener[] r = null;
		return (java.awt.event.InputMethodListener[])r;
	}
	public java.awt.im.InputMethodRequests getInputMethodRequests() {
		java.awt.im.InputMethodRequests r = null;
		return (java.awt.im.InputMethodRequests)r;
	}
	public java.awt.im.InputContext getInputContext() {
		java.awt.im.InputContext r = null;
		return (java.awt.im.InputContext)r;
	}
	protected final void enableEvents(long p0) {
	}
	protected final void disableEvents(long p0) {
	}
	protected java.awt.AWTEvent coalesceEvents(java.awt.AWTEvent p0, java.awt.AWTEvent p1) {
		java.awt.AWTEvent r = null;
		return (java.awt.AWTEvent)r;
	}
	protected void processComponentEvent(java.awt.event.ComponentEvent p0) {
	}
	protected void processFocusEvent(java.awt.event.FocusEvent p0) {
	}
	protected void processKeyEvent(java.awt.event.KeyEvent p0) {
	}
	protected void processMouseEvent(java.awt.event.MouseEvent p0) {
	}
	protected void processMouseMotionEvent(java.awt.event.MouseEvent p0) {
	}
	protected void processMouseWheelEvent(java.awt.event.MouseWheelEvent p0) {
	}
	protected void processInputMethodEvent(java.awt.event.InputMethodEvent p0) {
	}
	protected void processHierarchyEvent(java.awt.event.HierarchyEvent p0) {
	}
	protected void processHierarchyBoundsEvent(java.awt.event.HierarchyEvent p0) {
	}
	public boolean mouseDown(java.awt.Event p0, int p1, int p2) {
		boolean r = false;
		return (boolean)r;
	}
	public boolean mouseDrag(java.awt.Event p0, int p1, int p2) {
		boolean r = false;
		return (boolean)r;
	}
	public boolean mouseUp(java.awt.Event p0, int p1, int p2) {
		boolean r = false;
		return (boolean)r;
	}
	public boolean mouseMove(java.awt.Event p0, int p1, int p2) {
		boolean r = false;
		return (boolean)r;
	}
	public boolean mouseEnter(java.awt.Event p0, int p1, int p2) {
		boolean r = false;
		return (boolean)r;
	}
	public boolean mouseExit(java.awt.Event p0, int p1, int p2) {
		boolean r = false;
		return (boolean)r;
	}
	public boolean keyDown(java.awt.Event p0, int p1) {
		boolean r = false;
		return (boolean)r;
	}
	public boolean keyUp(java.awt.Event p0, int p1) {
		boolean r = false;
		return (boolean)r;
	}
	public void removeNotify() {
	}
	public boolean gotFocus(java.awt.Event p0, java.lang.Object p1) {
		boolean r = false;
		return (boolean)r;
	}
	public boolean lostFocus(java.awt.Event p0, java.lang.Object p1) {
		boolean r = false;
		return (boolean)r;
	}
	public boolean isFocusable() {
		boolean r = false;
		return (boolean)r;
	}
	public void setFocusable(boolean p0) {
	}
	public void setFocusTraversalKeys(int p0, java.util.Set<? extends java.awt.AWTKeyStroke> p1) {
	}
	public java.util.Set<java.awt.AWTKeyStroke> getFocusTraversalKeys(int p0) {
		java.util.Set r = null;
		return (java.util.Set<java.awt.AWTKeyStroke>)r;
	}
	public boolean areFocusTraversalKeysSet(int p0) {
		boolean r = false;
		return (boolean)r;
	}
	public void setFocusTraversalKeysEnabled(boolean p0) {
	}
	public boolean getFocusTraversalKeysEnabled() {
		boolean r = false;
		return (boolean)r;
	}
	protected boolean requestFocusInWindow(boolean p0) {
		boolean r = false;
		return (boolean)r;
	}
	public boolean requestFocusInWindow() {
		boolean r = false;
		return (boolean)r;
	}
	public atlas.java.awt.Container getFocusCycleRootAncestor() {
		atlas.java.awt.Container r = null;
		return (atlas.java.awt.Container)r;
	}
	public boolean isFocusCycleRoot(atlas.java.awt.Container p0) {
		boolean r = false;
		return (boolean)r;
	}
	public void transferFocus() {
	}
	public void nextFocus() {
	}
	public void transferFocusBackward() {
	}
	public void transferFocusUpCycle() {
	}
	public boolean hasFocus() {
		boolean r = false;
		return (boolean)r;
	}
	public boolean isFocusOwner() {
		boolean r = false;
		return (boolean)r;
	}
	public java.beans.PropertyChangeListener[] getPropertyChangeListeners() {
		java.beans.PropertyChangeListener[] r = null;
		return (java.beans.PropertyChangeListener[])r;
	}
	public java.beans.PropertyChangeListener[] getPropertyChangeListeners(java.lang.String p0) {
		java.beans.PropertyChangeListener[] r = null;
		return (java.beans.PropertyChangeListener[])r;
	}
	public void setComponentOrientation(atlas.java.awt.ComponentOrientation p0) {
	}
	public atlas.java.awt.ComponentOrientation getComponentOrientation() {
		atlas.java.awt.ComponentOrientation r = null;
		return (atlas.java.awt.ComponentOrientation)r;
	}
	public void applyComponentOrientation(atlas.java.awt.ComponentOrientation p0) {
	}
	public final void dispatchEvent(java.awt.AWTEvent p0) {
	}
	public boolean handleEvent(java.awt.Event p0) {
		boolean r = false;
		return (boolean)r;
	}
	public boolean isValid() {
		boolean r = false;
		return (boolean)r;
	}
	public void layout() {
	}
	public java.awt.Rectangle bounds() {
		java.awt.Rectangle r = null;
		return (java.awt.Rectangle)r;
	}
	public void addPropertyChangeListener(java.lang.String p0, java.beans.PropertyChangeListener p1) {
	}
	public void addPropertyChangeListener(java.beans.PropertyChangeListener p0) {
	}
	public void removePropertyChangeListener(java.beans.PropertyChangeListener p0) {
	}
	public void removePropertyChangeListener(java.lang.String p0, java.beans.PropertyChangeListener p1) {
	}
	public int getWidth() {
		int r = 0;
		return (int)r;
	}
	public void move(int p0, int p1) {
	}
	public boolean isEnabled() {
		boolean r = false;
		return (boolean)r;
	}
	public int getX() {
		int r = 0;
		return (int)r;
	}
	public int getY() {
		int r = 0;
		return (int)r;
	}
	public void add(java.awt.PopupMenu p0) {
	}
	public void remove(java.awt.MenuComponent p0) {
	}
	public java.lang.String toString() {
		java.lang.String r = null;
		return (java.lang.String)r;
	}
	public void update(java.awt.Graphics p0) {
	}
	public java.lang.String getName() {
		java.lang.String r = null;
		return (java.lang.String)r;
	}
	public boolean contains(int p0, int p1) {
		boolean r = false;
		return (boolean)r;
	}
	public boolean contains(java.awt.Point p0) {
		boolean r = false;
		return (boolean)r;
	}
	public void list(java.io.PrintWriter p0) {
	}
	public void list() {
	}
	public void list(java.io.PrintStream p0) {
	}
	public void list(java.io.PrintStream p0, int p1) {
	}
	public void list(java.io.PrintWriter p0, int p1) {
	}
	public java.awt.Dimension size() {
		java.awt.Dimension r = null;
		return (java.awt.Dimension)r;
	}
	public atlas.java.awt.Container getParent() {
		atlas.java.awt.Container r = null;
		return (atlas.java.awt.Container)r;
	}
	public java.awt.Point getLocation() {
		java.awt.Point r = null;
		return (java.awt.Point)r;
	}
	public java.awt.Point getLocation(java.awt.Point p0) {
		java.awt.Point r = null;
		return (java.awt.Point)r;
	}
	public boolean action(java.awt.Event p0, java.lang.Object p1) {
		boolean r = false;
		return (boolean)r;
	}
	public void setName(java.lang.String p0) {
	}
	public void print(java.awt.Graphics p0) {
	}
	public java.awt.Dimension getSize(java.awt.Dimension p0) {
		java.awt.Dimension r = null;
		return (java.awt.Dimension)r;
	}
	public java.awt.Dimension getSize() {
		java.awt.Dimension r = null;
		return (java.awt.Dimension)r;
	}
	protected java.lang.String paramString() {
		java.lang.String r = null;
		return (java.lang.String)r;
	}
	public boolean isOpaque() {
		boolean r = false;
		return (boolean)r;
	}
	public java.awt.Point location() {
		java.awt.Point r = null;
		return (java.awt.Point)r;
	}
	public void setSize(java.awt.Dimension p0) {
	}
	public void setSize(int p0, int p1) {
	}
	public void resize(java.awt.Dimension p0) {
	}
	public void resize(int p0, int p1) {
	}
	public void enable() {
	}
	public void enable(boolean p0) {
	}
	public void disable() {
	}
	public abstract class AccessibleAWTComponent implements java.io.Serializable {
		protected AccessibleAWTComponent(atlas.java.awt.Component p0) {
		}
		public AccessibleAWTComponent() {
		}
		public java.util.Locale getLocale() {
			java.util.Locale r = null;
			return (java.util.Locale)r;
		}
		public java.awt.Rectangle getBounds() {
			java.awt.Rectangle r = null;
			return (java.awt.Rectangle)r;
		}
		public int getAccessibleChildrenCount() {
			int r = 0;
			return (int)r;
		}
		public java.lang.String getAccessibleName() {
			java.lang.String r = null;
			return (java.lang.String)r;
		}
		public java.lang.String getAccessibleDescription() {
			java.lang.String r = null;
			return (java.lang.String)r;
		}
		public int getAccessibleIndexInParent() {
			int r = 0;
			return (int)r;
		}
		public java.awt.Color getBackground() {
			java.awt.Color r = null;
			return (java.awt.Color)r;
		}
		public void setBackground(java.awt.Color p0) {
		}
		public java.awt.Color getForeground() {
			java.awt.Color r = null;
			return (java.awt.Color)r;
		}
		public void setForeground(java.awt.Color p0) {
		}
		public java.awt.Cursor getCursor() {
			java.awt.Cursor r = null;
			return (java.awt.Cursor)r;
		}
		public void setCursor(java.awt.Cursor p0) {
		}
		public java.awt.Font getFont() {
			java.awt.Font r = null;
			return (java.awt.Font)r;
		}
		public void setFont(java.awt.Font p0) {
		}
		public java.awt.FontMetrics getFontMetrics(java.awt.Font p0) {
			java.awt.FontMetrics r = null;
			return (java.awt.FontMetrics)r;
		}
		public void setEnabled(boolean p0) {
		}
		public boolean isVisible() {
			boolean r = false;
			return (boolean)r;
		}
		public void setVisible(boolean p0) {
		}
		public boolean isShowing() {
			boolean r = false;
			return (boolean)r;
		}
		public java.awt.Point getLocationOnScreen() {
			java.awt.Point r = null;
			return (java.awt.Point)r;
		}
		public void setLocation(java.awt.Point p0) {
		}
		public void setBounds(java.awt.Rectangle p0) {
		}
		public boolean isFocusTraversable() {
			boolean r = false;
			return (boolean)r;
		}
		public void requestFocus() {
		}
		public void addFocusListener(java.awt.event.FocusListener p0) {
		}
		public void removeFocusListener(java.awt.event.FocusListener p0) {
		}
		public void addPropertyChangeListener(java.beans.PropertyChangeListener p0) {
		}
		public void removePropertyChangeListener(java.beans.PropertyChangeListener p0) {
		}
		public boolean isEnabled() {
			boolean r = false;
			return (boolean)r;
		}
		public boolean contains(java.awt.Point p0) {
			boolean r = false;
			return (boolean)r;
		}
		public java.awt.Point getLocation() {
			java.awt.Point r = null;
			return (java.awt.Point)r;
		}
		public java.awt.Dimension getSize() {
			java.awt.Dimension r = null;
			return (java.awt.Dimension)r;
		}
		public void setSize(java.awt.Dimension p0) {
		}
		public class AccessibleAWTFocusHandler implements java.awt.event.FocusListener {
			protected AccessibleAWTFocusHandler(atlas.java.awt.Component.AccessibleAWTComponent p0) {
			}
			public AccessibleAWTFocusHandler() {
			}
			public void focusGained(java.awt.event.FocusEvent p0) {
			}
			public void focusLost(java.awt.event.FocusEvent p0) {
			}
		}
		public class AccessibleAWTComponentHandler implements java.awt.event.ComponentListener {
			protected AccessibleAWTComponentHandler(atlas.java.awt.Component.AccessibleAWTComponent p0) {
			}
			public AccessibleAWTComponentHandler() {
			}
			public void componentResized(java.awt.event.ComponentEvent p0) {
			}
			public void componentMoved(java.awt.event.ComponentEvent p0) {
			}
			public void componentShown(java.awt.event.ComponentEvent p0) {
			}
			public void componentHidden(java.awt.event.ComponentEvent p0) {
			}
		}
	}
	public static class DummyRequestFocusController {
		public DummyRequestFocusController() {
		}
	}
	public class SingleBufferStrategy extends java.awt.image.BufferStrategy {
		public SingleBufferStrategy(atlas.java.awt.Component p0, java.awt.BufferCapabilities p1) {
		}
		public SingleBufferStrategy() {
		}
		public java.awt.BufferCapabilities getCapabilities() {
			java.awt.BufferCapabilities r = null;
			return (java.awt.BufferCapabilities)r;
		}
		public boolean contentsLost() {
			boolean r = false;
			return (boolean)r;
		}
		public java.awt.Graphics getDrawGraphics() {
			java.awt.Graphics r = null;
			return (java.awt.Graphics)r;
		}
		public boolean contentsRestored() {
			boolean r = false;
			return (boolean)r;
		}
		public void show() {
		}
	}
	public class BltSubRegionBufferStrategy extends atlas.java.awt.Component.BltBufferStrategy {
		public BltSubRegionBufferStrategy() {
		}
		public boolean showIfNotLost(int p0, int p1, int p2, int p3) {
			boolean r = false;
			return (boolean)r;
		}
		public void show(int p0, int p1, int p2, int p3) {
		}
	}
	public class FlipSubRegionBufferStrategy extends atlas.java.awt.Component.FlipBufferStrategy {
		public FlipSubRegionBufferStrategy() {
		}
		public boolean showIfNotLost(int p0, int p1, int p2, int p3) {
			boolean r = false;
			return (boolean)r;
		}
		public void show(int p0, int p1, int p2, int p3) {
		}
	}
	public class BltBufferStrategy extends java.awt.image.BufferStrategy {
		public BltBufferStrategy() {
		}
		public java.awt.BufferCapabilities getCapabilities() {
			java.awt.BufferCapabilities r = null;
			return (java.awt.BufferCapabilities)r;
		}
		public boolean contentsLost() {
			boolean r = false;
			return (boolean)r;
		}
		public java.awt.Graphics getDrawGraphics() {
			java.awt.Graphics r = null;
			return (java.awt.Graphics)r;
		}
		public boolean contentsRestored() {
			boolean r = false;
			return (boolean)r;
		}
		public void show() {
		}
		protected void revalidate() {
		}
		public void dispose() {
		}
		protected void createBackBuffers(int p0) {
		}
	}
	public class FlipBufferStrategy extends java.awt.image.BufferStrategy {
		public FlipBufferStrategy() {
		}
		public java.awt.BufferCapabilities getCapabilities() {
			java.awt.BufferCapabilities r = null;
			return (java.awt.BufferCapabilities)r;
		}
		public boolean contentsLost() {
			boolean r = false;
			return (boolean)r;
		}
		public java.awt.Graphics getDrawGraphics() {
			java.awt.Graphics r = null;
			return (java.awt.Graphics)r;
		}
		public boolean contentsRestored() {
			boolean r = false;
			return (boolean)r;
		}
		protected void createBuffers(int p0, java.awt.BufferCapabilities p1) {
		}
		public void show() {
		}
		protected void revalidate() {
		}
		protected atlas.java.awt.Image getBackBuffer() {
			atlas.java.awt.Image r = null;
			return (atlas.java.awt.Image)r;
		}
		protected void destroyBuffers() {
		}
		public void dispose() {
		}
		protected void flip(java.awt.BufferCapabilities.FlipContents p0) {
		}
	}
	public class ProxyCapabilities {
		private ProxyCapabilities(atlas.java.awt.Component p0, java.awt.BufferCapabilities p1) {
		}
		public ProxyCapabilities() {
		}
	}
	public static enum BaselineResizeBehavior {
		CONSTANT_ASCENT, CONSTANT_DESCENT, CENTER_OFFSET, OTHER;
	}
	public static class AWTTreeLock {
		public AWTTreeLock() {
		}
	}
	public class ANON339 implements java.security.PrivilegedAction<java.awt.PointerInfo> {
		ANON339() {
		}
		public java.awt.PointerInfo run() {
			java.awt.PointerInfo r = null;
			return (java.awt.PointerInfo)r;
		}
	}
	public class ANON192 implements java.security.PrivilegedAction<java.lang.Void> {
		ANON192() {
		}
		public java.lang.Void run() {
			java.lang.Void r = null;
			return (java.lang.Void)r;
		}
	}
	public class ANON135 {
		ANON135() {
		}
		public void setBackgroundEraseDisabled(atlas.java.awt.Component p0, boolean p1) {
		}
		public boolean getBackgroundEraseDisabled(atlas.java.awt.Component p0) {
			boolean r = false;
			return (boolean)r;
		}
		public void setMixingCutoutShape(atlas.java.awt.Component p0, java.awt.Shape p1) {
		}
		public void setPeer(atlas.java.awt.Component p0, java.awt.peer.ComponentPeer p1) {
		}
		public java.awt.Rectangle getBounds(atlas.java.awt.Component p0) {
			java.awt.Rectangle r = null;
			return (java.awt.Rectangle)r;
		}
		public java.awt.Color getBackground(atlas.java.awt.Component p0) {
			java.awt.Color r = null;
			return (java.awt.Color)r;
		}
		public void setBackground(atlas.java.awt.Component p0, java.awt.Color p1) {
		}
		public java.awt.Color getForeground(atlas.java.awt.Component p0) {
			java.awt.Color r = null;
			return (java.awt.Color)r;
		}
		public java.awt.Cursor getCursor(atlas.java.awt.Component p0) {
			java.awt.Cursor r = null;
			return (java.awt.Cursor)r;
		}
		public java.awt.Font getFont(atlas.java.awt.Component p0) {
			java.awt.Font r = null;
			return (java.awt.Font)r;
		}
		public boolean isVisible(atlas.java.awt.Component p0) {
			boolean r = false;
			return (boolean)r;
		}
		public void setLocation(atlas.java.awt.Component p0, int p1, int p2) {
		}
		public java.security.AccessControlContext getAccessControlContext(atlas.java.awt.Component p0) {
			java.security.AccessControlContext r = null;
			return (java.security.AccessControlContext)r;
		}
		public void processEvent(atlas.java.awt.Component p0, java.awt.AWTEvent p1) {
		}
		public java.awt.peer.ComponentPeer getPeer(atlas.java.awt.Component p0) {
			java.awt.peer.ComponentPeer r = null;
			return (java.awt.peer.ComponentPeer)r;
		}
		public void setGraphicsConfiguration(atlas.java.awt.Component p0, java.awt.GraphicsConfiguration p1) {
		}
		public boolean isDisplayable(atlas.java.awt.Component p0) {
			boolean r = false;
			return (boolean)r;
		}
		public int getHeight(atlas.java.awt.Component p0) {
			int r = 0;
			return (int)r;
		}
		public boolean isLightweight(atlas.java.awt.Component p0) {
			boolean r = false;
			return (boolean)r;
		}
		public void revalidateSynchronously(atlas.java.awt.Component p0) {
		}
		public boolean getIgnoreRepaint(atlas.java.awt.Component p0) {
			boolean r = false;
			return (boolean)r;
		}
		public boolean canBeFocusOwner(atlas.java.awt.Component p0) {
			boolean r = false;
			return (boolean)r;
		}
		public int getWidth(atlas.java.awt.Component p0) {
			int r = 0;
			return (int)r;
		}
		public boolean isEnabled(atlas.java.awt.Component p0) {
			boolean r = false;
			return (boolean)r;
		}
		public int getX(atlas.java.awt.Component p0) {
			int r = 0;
			return (int)r;
		}
		public int getY(atlas.java.awt.Component p0) {
			int r = 0;
			return (int)r;
		}
		public atlas.java.awt.Container getParent(atlas.java.awt.Component p0) {
			atlas.java.awt.Container r = null;
			return (atlas.java.awt.Container)r;
		}
		public java.awt.Point getLocation(atlas.java.awt.Component p0) {
			java.awt.Point r = null;
			return (java.awt.Point)r;
		}
		public void setSize(atlas.java.awt.Component p0, int p1, int p2) {
		}
		public void setParent(atlas.java.awt.Component p0, atlas.java.awt.Container p1) {
		}
	}
	public class ANON308 implements java.security.PrivilegedAction<java.lang.Boolean> {
		ANON308() {
		}
		public java.lang.Boolean run() {
			java.lang.Boolean r = null;
			return (java.lang.Boolean)r;
		}
	}
	public class ANON318 implements java.security.PrivilegedAction<java.lang.reflect.Method[]> {
		ANON318() {
		}
		public java.lang.reflect.Method[] run() {
			java.lang.reflect.Method[] r = null;
			return (java.lang.reflect.Method[])r;
		}
	}
}
