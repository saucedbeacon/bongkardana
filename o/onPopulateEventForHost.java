package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import o.PlaybackStateCompat;

@Deprecated
public final class onPopulateEventForHost<E> implements Set<E> {
    private static final Integer getMax = 0;
    private static final Object[] setMin = new Object[0];
    final PlaybackStateCompat.RepeatMode<E, Integer> length = new PlaybackStateCompat.RepeatMode<>();

    public final boolean add(E e) {
        return this.length.put(e, getMax) == null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v5, types: [int] */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean addAll(java.util.Collection<? extends E> r5) {
        /*
            r4 = this;
            int r0 = r4.size()
            int r1 = r5.size()
            int r0 = r0 + r1
            o.PlaybackStateCompat$RepeatMode<E, java.lang.Integer> r1 = r4.length
            r1.length((int) r0)
            boolean r0 = r5 instanceof o.onPopulateEventForHost
            r1 = 0
            if (r0 == 0) goto L_0x0028
            o.onPopulateEventForHost r5 = (o.onPopulateEventForHost) r5
            int r0 = r4.size()
            o.PlaybackStateCompat$RepeatMode<E, java.lang.Integer> r2 = r4.length
            o.PlaybackStateCompat$RepeatMode<E, java.lang.Integer> r5 = r5.length
            r2.length(r5)
            int r5 = r4.size()
            if (r5 == r0) goto L_0x005b
            r1 = 1
            goto L_0x005b
        L_0x0028:
            boolean r0 = r5 instanceof java.util.List
            if (r0 == 0) goto L_0x0047
            boolean r0 = r5 instanceof java.util.RandomAccess
            if (r0 == 0) goto L_0x0047
            java.util.List r5 = (java.util.List) r5
            int r0 = r5.size()
            r2 = 0
        L_0x0037:
            if (r1 >= r0) goto L_0x0045
            java.lang.Object r3 = r5.get(r1)
            boolean r3 = r4.add(r3)
            r2 = r2 | r3
            int r1 = r1 + 1
            goto L_0x0037
        L_0x0045:
            r1 = r2
            goto L_0x005b
        L_0x0047:
            java.util.Iterator r5 = r5.iterator()
        L_0x004b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x005b
            java.lang.Object r0 = r5.next()
            boolean r0 = r4.add(r0)
            r1 = r1 | r0
            goto L_0x004b
        L_0x005b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onPopulateEventForHost.addAll(java.util.Collection):boolean");
    }

    public final void clear() {
        this.length.clear();
    }

    public final boolean contains(Object obj) {
        return this.length.containsKey(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        if (!(collection instanceof List) || !(collection instanceof RandomAccess)) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }
        List list = (List) collection;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!contains(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            try {
                int size = size();
                for (int i = 0; i < size; i++) {
                    if (!set.contains(this.length.isInside[i << 1])) {
                        return false;
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        int size = size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = this.length.isInside[i2 << 1];
            if (obj != null) {
                i += obj.hashCode();
            }
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.length.isEmpty();
    }

    public final Iterator<E> iterator() {
        return new setMin();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean removeAll(java.util.Collection<?> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof java.util.List
            r1 = 0
            if (r0 == 0) goto L_0x001e
            boolean r0 = r5 instanceof java.util.RandomAccess
            if (r0 == 0) goto L_0x001e
            java.util.List r5 = (java.util.List) r5
            int r0 = r5.size()
            r2 = 0
        L_0x0010:
            if (r1 >= r0) goto L_0x0033
            java.lang.Object r3 = r5.get(r1)
            boolean r3 = r4.remove(r3)
            r2 = r2 | r3
            int r1 = r1 + 1
            goto L_0x0010
        L_0x001e:
            java.util.Iterator r5 = r5.iterator()
        L_0x0022:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r5.next()
            boolean r0 = r4.remove(r0)
            r1 = r1 | r0
            goto L_0x0022
        L_0x0032:
            r2 = r1
        L_0x0033:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onPopulateEventForHost.removeAll(java.util.Collection):boolean");
    }

    public final boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int size = size() - 1; size >= 0; size--) {
            if (!collection.contains(this.length.isInside[size << 1])) {
                this.length.setMin(size);
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        return this.length.size();
    }

    public final Object[] toArray() {
        int size = this.length.size();
        if (size == 0) {
            return setMin;
        }
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            objArr[i] = this.length.isInside[i << 1];
        }
        return objArr;
    }

    public final <T> T[] toArray(T[] tArr) {
        int size = size();
        if (tArr.length < size) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        }
        for (int i = 0; i < size; i++) {
            tArr[i] = this.length.isInside[i << 1];
        }
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        int size = size();
        StringBuilder sb = new StringBuilder(size * 14);
        sb.append('{');
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.length.isInside[i << 1];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    final class setMin implements Iterator<E> {
        private boolean getMax;
        private int length = -1;

        public setMin() {
        }

        public final boolean hasNext() {
            return this.length + 1 < onPopulateEventForHost.this.size();
        }

        public final E next() {
            if (hasNext()) {
                this.getMax = false;
                int i = this.length + 1;
                this.length = i;
                return onPopulateEventForHost.this.length.isInside[i << 1];
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (!this.getMax) {
                onPopulateEventForHost.this.length.setMin(this.length);
                this.getMax = true;
                this.length--;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final boolean remove(Object obj) {
        int i;
        PlaybackStateCompat.RepeatMode<E, Integer> repeatMode = this.length;
        if (obj == null) {
            i = repeatMode.setMax();
        } else {
            i = repeatMode.setMin(obj, obj.hashCode());
        }
        if (i < 0) {
            return false;
        }
        this.length.setMin(i);
        return true;
    }
}
