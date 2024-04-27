package atlas.java.util;
public class LinkedHashMap<K,V> extends atlas.atlas.java.util.HashMap<K, V> implements atlas.java.util.Map<K, V> {
	public java.lang.Object f58;
	public java.lang.Object f46;
	public LinkedHashMap(atlas.java.util.Map<? extends K, ? extends V> p0) {
		((atlas.java.util.LinkedHashMap)this).f58 = (java.lang.Object)((atlas.java.util.HashMap)p0).f37;
		((atlas.java.util.LinkedHashMap)this).f46 = (java.lang.Object)((atlas.java.util.TreeMap)p0).f61;
		((atlas.java.util.LinkedHashMap)this).f46 = (java.lang.Object)((atlas.java.util.Properties)p0).f59;
		((atlas.java.util.LinkedHashMap)this).f46 = (java.lang.Object)((atlas.java.util.Hashtable)p0).f40;
		((atlas.java.util.LinkedHashMap)this).f46 = (java.lang.Object)((atlas.java.util.Collections.SynchronizedMap)p0).f48;
		((atlas.java.util.LinkedHashMap)this).f46 = (java.lang.Object)((atlas.java.util.WeakHashMap)p0).f41;
		((atlas.java.util.LinkedHashMap)this).f46 = (java.lang.Object)((atlas.java.util.HashMap)p0).f0;
		((atlas.java.util.LinkedHashMap)this).f46 = (java.lang.Object)((atlas.java.util.LinkedHashMap)p0).f46;
		((atlas.java.util.LinkedHashMap)this).f58 = (java.lang.Object)((atlas.java.util.IdentityHashMap)p0).f93;
		((atlas.java.util.LinkedHashMap)this).f58 = (java.lang.Object)((atlas.java.util.Hashtable)p0).f32;
		((atlas.java.util.LinkedHashMap)this).f58 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f86;
		((atlas.java.util.LinkedHashMap)this).f58 = (java.lang.Object)((atlas.java.util.Properties)p0).f54;
		((atlas.java.util.LinkedHashMap)this).f46 = (java.lang.Object)((atlas.java.util.Collections.UnmodifiableMap)p0).f55;
		((atlas.java.util.LinkedHashMap)this).f46 = (java.lang.Object)((atlas.java.util.IdentityHashMap)p0).f50;
		((atlas.java.util.LinkedHashMap)this).f46 = (java.lang.Object)((atlas.java.util.Collections.SingletonMap)p0).f45;
		((atlas.java.util.LinkedHashMap)this).f58 = (java.lang.Object)((atlas.java.util.WeakHashMap)p0).f25;
		((atlas.java.util.LinkedHashMap)this).f46 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentSkipListMap)p0).f29;
		((atlas.java.util.LinkedHashMap)this).f46 = (java.lang.Object)((atlas.java.util.concurrent.ConcurrentHashMap)p0).f3;
	}
	public LinkedHashMap() {
	}
	public V get(java.lang.Object p0) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.LinkedHashMap)this).f46;
		return (V)r;
	}
	public atlas.java.util.Collection<V> values() {
		atlas.java.util.Collection r = null;
		r = new atlas.java.util.LinkedHashMap.LinkedValues();
		((atlas.java.util.LinkedHashMap.LinkedValues)r).f82 = (java.lang.Object)((atlas.java.util.LinkedHashMap)this).f46;
		return (atlas.java.util.Collection<V>)r;
	}
	public void clear() {
	}
	public java.util.Set<atlas.java.util.Map.Entry<K, V>> entrySet() {
		java.util.Set r = null;
		r = new atlas.java.util.LinkedHashMap.LinkedEntrySet();
		((atlas.java.util.LinkedHashMap.LinkedEntrySet)r).f114 = (java.lang.Object)((atlas.java.util.LinkedHashMap)this).f46;
		((atlas.java.util.LinkedHashMap.LinkedEntrySet)r).f104 = (java.lang.Object)((atlas.java.util.LinkedHashMap)this).f58;
		return (java.util.Set<atlas.java.util.Map.Entry<K, V>>)r;
	}
	public java.util.Set<K> keySet() {
		java.util.Set r = null;
		r = new atlas.java.util.LinkedHashMap.LinkedKeySet();
		((atlas.java.util.LinkedHashMap.LinkedKeySet)r).f156 = (java.lang.Object)((atlas.java.util.LinkedHashMap)this).f58;
		return (java.util.Set<K>)r;
	}
	public boolean containsValue(java.lang.Object p0) {
		boolean r = false;
		return (boolean)r;
	}
	public V getOrDefault(java.lang.Object p0, V p1) {
		java.lang.Object r = null;
		r = (java.lang.Object)((atlas.java.util.LinkedHashMap)this).f46;
		r = (java.lang.Object)p1;
		return (V)r;
	}
	protected boolean removeEldestEntry(atlas.java.util.Map.Entry<K, V> p0) {
		boolean r = false;
		return (boolean)r;
	}
	public final class LinkedEntryIterator extends atlas.atlas.java.util.LinkedHashMap<K, V>.LinkedHashIterator implements atlas.java.util.Iterator<atlas.java.util.Map.Entry<K, V>> {
		public java.lang.Object f124;
		public java.lang.Object f79;
		LinkedEntryIterator(atlas.atlas.java.util.LinkedHashMap p0) {
		}
		public LinkedEntryIterator() {
		}
		public final atlas.java.util.Map.Entry<K, V> next() {
			atlas.java.util.Map.Entry r = null;
			r = new atlas.java.util.LinkedHashMap.Entry();
			((atlas.java.util.LinkedHashMap.Entry)r).f16 = (java.lang.Object)((atlas.java.util.LinkedHashMap.LinkedEntryIterator)this).f124;
			((atlas.java.util.LinkedHashMap.Entry)r).f13 = (java.lang.Object)((atlas.java.util.LinkedHashMap.LinkedEntryIterator)this).f79;
			return (atlas.java.util.Map.Entry<K, V>)r;
		}
	}
	public final class LinkedValueIterator extends atlas.atlas.java.util.LinkedHashMap<K, V>.LinkedHashIterator implements atlas.java.util.Iterator<V> {
		public java.lang.Object f112;
		LinkedValueIterator(atlas.atlas.java.util.LinkedHashMap p0) {
		}
		public LinkedValueIterator() {
		}
		public final V next() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.LinkedHashMap.LinkedValueIterator)this).f112;
			return (V)r;
		}
	}
	public final class LinkedKeyIterator extends atlas.atlas.java.util.LinkedHashMap<K, V>.LinkedHashIterator implements atlas.java.util.Iterator<K> {
		public java.lang.Object f129;
		LinkedKeyIterator(atlas.atlas.java.util.LinkedHashMap p0) {
		}
		public LinkedKeyIterator() {
		}
		public final K next() {
			java.lang.Object r = null;
			r = (java.lang.Object)((atlas.java.util.LinkedHashMap.LinkedKeyIterator)this).f129;
			return (K)r;
		}
	}
	public abstract class LinkedHashIterator {
		LinkedHashIterator(atlas.atlas.java.util.LinkedHashMap p0) {
		}
		public LinkedHashIterator() {
		}
		public final void remove() {
		}
		public final boolean hasNext() {
			boolean r = false;
			return (boolean)r;
		}
	}
	public final class LinkedEntrySet extends atlas.java.util.AbstractSet<atlas.java.util.Map.Entry<K, V>> {
		public java.lang.Object f114;
		public java.lang.Object f104;
		LinkedEntrySet(atlas.atlas.java.util.LinkedHashMap p0) {
		}
		public LinkedEntrySet() {
		}
		public final boolean remove(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public final void clear() {
		}
		public final boolean contains(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public final int size() {
			int r = 0;
			return (int)r;
		}
		public final atlas.java.util.Iterator<atlas.java.util.Map.Entry<K, V>> iterator() {
			atlas.java.util.Iterator r = null;
			r = new atlas.java.util.LinkedHashMap.LinkedEntryIterator();
			((atlas.java.util.LinkedHashMap.LinkedEntryIterator)r).f124 = (java.lang.Object)((atlas.java.util.LinkedHashMap.LinkedEntrySet)this).f104;
			((atlas.java.util.LinkedHashMap.LinkedEntryIterator)r).f79 = (java.lang.Object)((atlas.java.util.LinkedHashMap.LinkedEntrySet)this).f114;
			return (atlas.java.util.Iterator<atlas.java.util.Map.Entry<K, V>>)r;
		}
	}
	public final class LinkedValues extends atlas.atlas.java.util.AbstractCollection<V> {
		public java.lang.Object f82;
		LinkedValues(atlas.atlas.java.util.LinkedHashMap p0) {
		}
		public LinkedValues() {
		}
		public final void clear() {
		}
		public final boolean contains(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public final int size() {
			int r = 0;
			return (int)r;
		}
		public final atlas.java.util.Iterator<V> iterator() {
			atlas.java.util.Iterator r = null;
			r = new atlas.java.util.LinkedHashMap.LinkedValueIterator();
			((atlas.java.util.LinkedHashMap.LinkedValueIterator)r).f112 = (java.lang.Object)((atlas.java.util.LinkedHashMap.LinkedValues)this).f82;
			return (atlas.java.util.Iterator<V>)r;
		}
	}
	public final class LinkedKeySet extends atlas.java.util.AbstractSet<K> {
		public java.lang.Object f156;
		LinkedKeySet(atlas.atlas.java.util.LinkedHashMap p0) {
		}
		public LinkedKeySet() {
		}
		public final boolean remove(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public final void clear() {
		}
		public final boolean contains(java.lang.Object p0) {
			boolean r = false;
			return (boolean)r;
		}
		public final int size() {
			int r = 0;
			return (int)r;
		}
		public final atlas.java.util.Iterator<K> iterator() {
			atlas.java.util.Iterator r = null;
			r = new atlas.java.util.LinkedHashMap.LinkedKeyIterator();
			((atlas.java.util.LinkedHashMap.LinkedKeyIterator)r).f129 = (java.lang.Object)((atlas.java.util.LinkedHashMap.LinkedKeySet)this).f156;
			return (atlas.java.util.Iterator<K>)r;
		}
	}
	public static class Entry<K,V> extends atlas.atlas.java.util.HashMap.Node<K, V> {
		public java.lang.Object f16;
		public java.lang.Object f13;
		public Entry() {
		}
	}
}
