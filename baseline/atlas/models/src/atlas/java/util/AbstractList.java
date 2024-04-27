package atlas.java.util;
public abstract class AbstractList<E> extends atlas.atlas.java.util.AbstractCollection<E> implements atlas.java.util.List<E> {
	public AbstractList() {
	}
	public void add(int p0, E p1) {
	}
	public boolean add(E p0) {
		boolean r = false;
		return (boolean)r;
	}
	public E remove(int p0) {
		java.lang.Object r = null;
		return (E)r;
	}
	public abstract E get(int p0);
	public boolean equals(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public int hashCode() {
		int r = 0;
		return (int)r;
	}
	public int indexOf(java.lang.Object p0) {
		int r = 0;
		return (int)r;
	}
	public void clear() {
	}
	public int lastIndexOf(java.lang.Object p0) {
		int r = 0;
		return (int)r;
	}
	public atlas.java.util.List<E> subList(int p0, int p1) {
		atlas.java.util.List r = null;
		return (atlas.java.util.List<E>)r;
	}
	public atlas.java.util.Iterator<E> iterator() {
		atlas.java.util.Iterator r = null;
		r = new atlas.java.util.AbstractList.Itr();
		((atlas.java.util.AbstractList.Itr)r).f171 = (java.lang.Object)((atlas.java.util.Arrays.ArrayList)this).f99;
		return (atlas.java.util.Iterator<E>)r;
	}
	public boolean addAll(int p0, atlas.java.util.Collection<? extends E> p1) {
		boolean r = false;
		return (boolean)r;
	}
	public E set(int p0, E p1) {
		java.lang.Object r = null;
		return (E)r;
	}
	protected void removeRange(int p0, int p1) {
	}
	public atlas.atlas.java.util.ListIterator<E> listIterator(int p0) {
		atlas.java.util.ListIterator r = null;
		r = new atlas.java.util.AbstractList.ListItr();
		((atlas.java.util.AbstractList.ListItr)r).f135 = (java.lang.Object)((atlas.java.util.Arrays.ArrayList)this).f99;
		((atlas.java.util.AbstractList.ListItr)r).f135 = (java.lang.Object)((atlas.java.util.Collections.SingletonList)this).f150;
		return (atlas.atlas.java.util.ListIterator<E>)r;
	}
	public atlas.atlas.java.util.ListIterator<E> listIterator() {
		atlas.java.util.ListIterator r = null;
		r = new atlas.java.util.LinkedList.ListItr();
		r = new atlas.java.util.AbstractList.ListItr();
		((atlas.java.util.LinkedList.ListItr)r).f137 = (java.lang.Object)((atlas.java.util.LinkedList)this).f19;
		((atlas.java.util.AbstractList.ListItr)r).f135 = (java.lang.Object)((atlas.java.util.Collections.SingletonList)this).f150;
		return (atlas.atlas.java.util.ListIterator<E>)r;
	}
	public class ListItr extends atlas.atlas.java.util.AbstractList<E>.Itr implements atlas.atlas.java.util.ListIterator<E> {
		public java.lang.Object f135;
		public ListItr() {
		}
		public void add(E p0) {
		}
		public void set(E p0) {
		}
		public int previousIndex() {
			int r = 0;
			return (int)r;
		}
		public boolean hasPrevious() {
			boolean r = false;
			return (boolean)r;
		}
		public E previous() {
			java.lang.Object r = null;
			return (E)r;
		}
		public int nextIndex() {
			int r = 0;
			return (int)r;
		}
	}
	public class Itr implements atlas.java.util.Iterator<E> {
		public java.lang.Object f171;
		private Itr(atlas.atlas.java.util.AbstractList p0) {
		}
		public Itr() {
		}
		public void remove() {
		}
		public E next() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.AbstractList.ListItr)this).f135;
			r = (java.lang.Object)((atlas.java.util.AbstractList.Itr)this).f171;
			return (E)r;
		}
		public boolean hasNext() {
			boolean r = false;
			return (boolean)r;
		}
	}
	public class ANON63 {
		ANON63() {
		}
	}
}
