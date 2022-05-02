package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class PlaybackStateCompat<K, V> extends RepeatMode<K, V> implements Map<K, V> {
    @Nullable
    MediaKeyAction<K, V> setMax;

    public interface Actions {
        ColorStateList IsOverlapping(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags);

        void equals(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags);

        float getMax(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags);

        void getMax(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags, Context context, ColorStateList colorStateList, float f, float f2, float f3);

        float getMin(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags);

        void getMin();

        void getMin(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags, float f);

        void getMin(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags, @Nullable ColorStateList colorStateList);

        float length(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags);

        void length(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags, float f);

        float setMax(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags);

        float setMin(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags);

        void setMin(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags, float f);

        void toFloatRange(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags);

        void toIntRange(MediaSessionCompat$SessionFlags mediaSessionCompat$SessionFlags);
    }

    public final class State {
        static final int[] getMax = new int[0];
        static final Object[] getMin = new Object[0];
        static final long[] length = new long[0];

        private static int length(int i) {
            for (int i2 = 4; i2 < 32; i2++) {
                int i3 = (1 << i2) - 12;
                if (i <= i3) {
                    return i3;
                }
            }
            return i;
        }

        public static int setMax(int i) {
            return length(i * 4) / 4;
        }

        public static int getMax(int i) {
            return length(i * 8) / 8;
        }

        public static boolean length(Object obj, Object obj2) {
            if (obj != obj2) {
                return obj != null && obj.equals(obj2);
            }
            return true;
        }

        static int getMax(int[] iArr, int i, int i2) {
            int i3 = i - 1;
            int i4 = 0;
            while (i4 <= i3) {
                int i5 = (i4 + i3) >>> 1;
                int i6 = iArr[i5];
                if (i6 < i2) {
                    i4 = i5 + 1;
                } else if (i6 <= i2) {
                    return i5;
                } else {
                    i3 = i5 - 1;
                }
            }
            return i4 ^ -1;
        }

        public static int getMax(long[] jArr, int i, long j) {
            int i2 = i - 1;
            int i3 = 0;
            while (i3 <= i2) {
                int i4 = (i3 + i2) >>> 1;
                long j2 = jArr[i4];
                if (j2 < j) {
                    i3 = i4 + 1;
                } else if (j2 <= j) {
                    return i4;
                } else {
                    i2 = i4 - 1;
                }
            }
            return i3 ^ -1;
        }
    }

    abstract class MediaKeyAction<K, V> {
        @Nullable
        MediaKeyAction<K, V>.setMax getMin;
        @Nullable
        MediaKeyAction<K, V>.setMin length;
        @Nullable
        MediaKeyAction<K, V>.getMin setMax;

        /* access modifiers changed from: protected */
        public abstract V getMax(int i, V v);

        /* access modifiers changed from: protected */
        public abstract void getMax();

        /* access modifiers changed from: protected */
        public abstract int getMin();

        /* access modifiers changed from: protected */
        public abstract int getMin(Object obj);

        /* access modifiers changed from: protected */
        public abstract Object length(int i, int i2);

        /* access modifiers changed from: protected */
        public abstract Map<K, V> length();

        /* access modifiers changed from: protected */
        public abstract void length(K k, V v);

        /* access modifiers changed from: protected */
        public abstract int setMax(Object obj);

        /* access modifiers changed from: protected */
        public abstract void setMin(int i);

        MediaKeyAction() {
        }

        final class length<T> implements Iterator<T> {
            int getMin;
            int length;
            final int setMax;
            boolean setMin = false;

            length(int i) {
                this.setMax = i;
                this.getMin = MediaKeyAction.this.getMin();
            }

            public final boolean hasNext() {
                return this.length < this.getMin;
            }

            public final T next() {
                if (hasNext()) {
                    T length2 = MediaKeyAction.this.length(this.length, this.setMax);
                    this.length++;
                    this.setMin = true;
                    return length2;
                }
                throw new NoSuchElementException();
            }

            public final void remove() {
                if (this.setMin) {
                    int i = this.length - 1;
                    this.length = i;
                    this.getMin--;
                    this.setMin = false;
                    MediaKeyAction.this.setMin(i);
                    return;
                }
                throw new IllegalStateException();
            }
        }

        final class getMax implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
            int getMax;
            int getMin;
            boolean setMin = false;

            getMax() {
                this.getMin = MediaKeyAction.this.getMin() - 1;
                this.getMax = -1;
            }

            public final boolean hasNext() {
                return this.getMax < this.getMin;
            }

            public final void remove() {
                if (this.setMin) {
                    MediaKeyAction.this.setMin(this.getMax);
                    this.getMax--;
                    this.getMin--;
                    this.setMin = false;
                    return;
                }
                throw new IllegalStateException();
            }

            public final K getKey() {
                if (this.setMin) {
                    return MediaKeyAction.this.length(this.getMax, 0);
                }
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }

            public final V getValue() {
                if (this.setMin) {
                    return MediaKeyAction.this.length(this.getMax, 1);
                }
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }

            public final V setValue(V v) {
                if (this.setMin) {
                    return MediaKeyAction.this.getMax(this.getMax, v);
                }
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }

            public final boolean equals(Object obj) {
                if (!this.setMin) {
                    throw new IllegalStateException("This container does not support retaining Map.Entry objects");
                } else if (!(obj instanceof Map.Entry)) {
                    return false;
                } else {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!State.length(entry.getKey(), MediaKeyAction.this.length(this.getMax, 0)) || !State.length(entry.getValue(), MediaKeyAction.this.length(this.getMax, 1))) {
                        return false;
                    }
                    return true;
                }
            }

            public final int hashCode() {
                int i;
                if (this.setMin) {
                    int i2 = 0;
                    Object length2 = MediaKeyAction.this.length(this.getMax, 0);
                    Object length3 = MediaKeyAction.this.length(this.getMax, 1);
                    if (length2 == null) {
                        i = 0;
                    } else {
                        i = length2.hashCode();
                    }
                    if (length3 != null) {
                        i2 = length3.hashCode();
                    }
                    return i ^ i2;
                }
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(getKey());
                sb.append(SimpleComparison.EQUAL_TO_OPERATION);
                sb.append(getValue());
                return sb.toString();
            }

            public final /* synthetic */ Object next() {
                if (hasNext()) {
                    this.getMax++;
                    this.setMin = true;
                    return this;
                }
                throw new NoSuchElementException();
            }
        }

        final class setMax implements Set<Map.Entry<K, V>> {
            setMax() {
            }

            public final /* synthetic */ boolean add(Object obj) {
                return length();
            }

            private static boolean length() {
                throw new UnsupportedOperationException();
            }

            public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
                int min = MediaKeyAction.this.getMin();
                for (Map.Entry entry : collection) {
                    MediaKeyAction.this.length(entry.getKey(), entry.getValue());
                }
                return min != MediaKeyAction.this.getMin();
            }

            public final void clear() {
                MediaKeyAction.this.getMax();
            }

            public final boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                int min = MediaKeyAction.this.getMin(entry.getKey());
                if (min < 0) {
                    return false;
                }
                return State.length(MediaKeyAction.this.length(min, 1), entry.getValue());
            }

            public final boolean containsAll(Collection<?> collection) {
                for (Object contains : collection) {
                    if (!contains(contains)) {
                        return false;
                    }
                }
                return true;
            }

            public final boolean isEmpty() {
                return MediaKeyAction.this.getMin() == 0;
            }

            public final Iterator<Map.Entry<K, V>> iterator() {
                return new getMax();
            }

            public final boolean remove(Object obj) {
                throw new UnsupportedOperationException();
            }

            public final boolean removeAll(Collection<?> collection) {
                throw new UnsupportedOperationException();
            }

            public final boolean retainAll(Collection<?> collection) {
                throw new UnsupportedOperationException();
            }

            public final int size() {
                return MediaKeyAction.this.getMin();
            }

            public final Object[] toArray() {
                throw new UnsupportedOperationException();
            }

            public final <T> T[] toArray(T[] tArr) {
                throw new UnsupportedOperationException();
            }

            public final boolean equals(Object obj) {
                return MediaKeyAction.setMax(this, obj);
            }

            public final int hashCode() {
                int i;
                int i2;
                int i3 = 0;
                for (int min = MediaKeyAction.this.getMin() - 1; min >= 0; min--) {
                    Object length = MediaKeyAction.this.length(min, 0);
                    Object length2 = MediaKeyAction.this.length(min, 1);
                    if (length == null) {
                        i = 0;
                    } else {
                        i = length.hashCode();
                    }
                    if (length2 == null) {
                        i2 = 0;
                    } else {
                        i2 = length2.hashCode();
                    }
                    i3 += i ^ i2;
                }
                return i3;
            }
        }

        final class getMin implements Set<K> {
            getMin() {
            }

            public final boolean add(K k) {
                throw new UnsupportedOperationException();
            }

            public final boolean addAll(Collection<? extends K> collection) {
                throw new UnsupportedOperationException();
            }

            public final void clear() {
                MediaKeyAction.this.getMax();
            }

            public final boolean contains(Object obj) {
                return MediaKeyAction.this.getMin(obj) >= 0;
            }

            public final boolean containsAll(Collection<?> collection) {
                return MediaKeyAction.length(MediaKeyAction.this.length(), collection);
            }

            public final boolean isEmpty() {
                return MediaKeyAction.this.getMin() == 0;
            }

            public final Iterator<K> iterator() {
                return new length(0);
            }

            public final boolean remove(Object obj) {
                int min = MediaKeyAction.this.getMin(obj);
                if (min < 0) {
                    return false;
                }
                MediaKeyAction.this.setMin(min);
                return true;
            }

            public final boolean removeAll(Collection<?> collection) {
                return MediaKeyAction.getMin(MediaKeyAction.this.length(), collection);
            }

            public final boolean retainAll(Collection<?> collection) {
                return MediaKeyAction.getMax(MediaKeyAction.this.length(), collection);
            }

            public final int size() {
                return MediaKeyAction.this.getMin();
            }

            public final Object[] toArray() {
                return MediaKeyAction.this.setMax(0);
            }

            public final <T> T[] toArray(T[] tArr) {
                return MediaKeyAction.this.setMin(tArr, 0);
            }

            public final boolean equals(Object obj) {
                return MediaKeyAction.setMax(this, obj);
            }

            public final int hashCode() {
                int i;
                int i2 = 0;
                for (int min = MediaKeyAction.this.getMin() - 1; min >= 0; min--) {
                    Object length = MediaKeyAction.this.length(min, 0);
                    if (length == null) {
                        i = 0;
                    } else {
                        i = length.hashCode();
                    }
                    i2 += i;
                }
                return i2;
            }
        }

        final class setMin implements Collection<V> {
            setMin() {
            }

            public final boolean add(V v) {
                throw new UnsupportedOperationException();
            }

            public final boolean addAll(Collection<? extends V> collection) {
                throw new UnsupportedOperationException();
            }

            public final void clear() {
                MediaKeyAction.this.getMax();
            }

            public final boolean contains(Object obj) {
                return MediaKeyAction.this.setMax(obj) >= 0;
            }

            public final boolean containsAll(Collection<?> collection) {
                for (Object contains : collection) {
                    if (!contains(contains)) {
                        return false;
                    }
                }
                return true;
            }

            public final boolean isEmpty() {
                return MediaKeyAction.this.getMin() == 0;
            }

            public final Iterator<V> iterator() {
                return new length(1);
            }

            public final boolean remove(Object obj) {
                int max = MediaKeyAction.this.setMax(obj);
                if (max < 0) {
                    return false;
                }
                MediaKeyAction.this.setMin(max);
                return true;
            }

            public final boolean removeAll(Collection<?> collection) {
                int min = MediaKeyAction.this.getMin();
                int i = 0;
                boolean z = false;
                while (i < min) {
                    if (collection.contains(MediaKeyAction.this.length(i, 1))) {
                        MediaKeyAction.this.setMin(i);
                        i--;
                        min--;
                        z = true;
                    }
                    i++;
                }
                return z;
            }

            public final boolean retainAll(Collection<?> collection) {
                int min = MediaKeyAction.this.getMin();
                int i = 0;
                boolean z = false;
                while (i < min) {
                    if (!collection.contains(MediaKeyAction.this.length(i, 1))) {
                        MediaKeyAction.this.setMin(i);
                        i--;
                        min--;
                        z = true;
                    }
                    i++;
                }
                return z;
            }

            public final int size() {
                return MediaKeyAction.this.getMin();
            }

            public final Object[] toArray() {
                return MediaKeyAction.this.setMax(1);
            }

            public final <T> T[] toArray(T[] tArr) {
                return MediaKeyAction.this.setMin(tArr, 1);
            }
        }

        public static <K, V> boolean length(Map<K, V> map, Collection<?> collection) {
            for (Object containsKey : collection) {
                if (!map.containsKey(containsKey)) {
                    return false;
                }
            }
            return true;
        }

        public static <K, V> boolean getMin(Map<K, V> map, Collection<?> collection) {
            int size = map.size();
            for (Object remove : collection) {
                map.remove(remove);
            }
            return size != map.size();
        }

        public static <K, V> boolean getMax(Map<K, V> map, Collection<?> collection) {
            int size = map.size();
            Iterator<K> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                }
            }
            return size != map.size();
        }

        public final Object[] setMax(int i) {
            int min = getMin();
            Object[] objArr = new Object[min];
            for (int i2 = 0; i2 < min; i2++) {
                objArr[i2] = length(i2, i);
            }
            return objArr;
        }

        public final <T> T[] setMin(T[] tArr, int i) {
            int min = getMin();
            if (tArr.length < min) {
                tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), min);
            }
            for (int i2 = 0; i2 < min; i2++) {
                tArr[i2] = length(i2, i);
            }
            if (tArr.length > min) {
                tArr[min] = null;
            }
            return tArr;
        }

        public static <T> boolean setMax(Set<T> set, Object obj) {
            if (set == obj) {
                return true;
            }
            if (obj instanceof Set) {
                Set set2 = (Set) obj;
                try {
                    return set.size() == set2.size() && set.containsAll(set2);
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
    }

    public class ErrorCode<K, V> {
        private int createCount;
        private int evictionCount;
        private int hitCount;
        private final LinkedHashMap<K, V> map;
        private int maxSize;
        private int missCount;
        private int putCount;
        private int size;

        /* access modifiers changed from: protected */
        @Nullable
        public V create(@NonNull K k) {
            return null;
        }

        public void entryRemoved(boolean z, @NonNull K k, @NonNull V v, @Nullable V v2) {
        }

        /* access modifiers changed from: protected */
        public int sizeOf(@NonNull K k, @NonNull V v) {
            return 1;
        }

        public ErrorCode(int i) {
            if (i > 0) {
                this.maxSize = i;
                this.map = new LinkedHashMap<>(0, 0.75f, true);
                return;
            }
            throw new IllegalArgumentException("maxSize <= 0");
        }

        public void resize(int i) {
            if (i > 0) {
                synchronized (this) {
                    this.maxSize = i;
                }
                trimToSize(i);
                return;
            }
            throw new IllegalArgumentException("maxSize <= 0");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
            r0 = create(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r0 != null) goto L_0x0022;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
            monitor-enter(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r4.createCount++;
            r1 = r4.map.put(r5, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
            if (r1 == null) goto L_0x0037;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
            r4.map.put(r5, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
            r4.size += safeSizeOf(r5, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
            monitor-exit(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
            if (r1 == null) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
            entryRemoved(false, r5, r0, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
            return r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
            trimToSize(r4.maxSize);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
            return r0;
         */
        @androidx.annotation.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final V get(@androidx.annotation.NonNull K r5) {
            /*
                r4 = this;
                if (r5 == 0) goto L_0x0054
                monitor-enter(r4)
                java.util.LinkedHashMap<K, V> r0 = r4.map     // Catch:{ all -> 0x0051 }
                java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0051 }
                if (r0 == 0) goto L_0x0013
                int r5 = r4.hitCount     // Catch:{ all -> 0x0051 }
                int r5 = r5 + 1
                r4.hitCount = r5     // Catch:{ all -> 0x0051 }
                monitor-exit(r4)     // Catch:{ all -> 0x0051 }
                return r0
            L_0x0013:
                int r0 = r4.missCount     // Catch:{ all -> 0x0051 }
                int r0 = r0 + 1
                r4.missCount = r0     // Catch:{ all -> 0x0051 }
                monitor-exit(r4)     // Catch:{ all -> 0x0051 }
                java.lang.Object r0 = r4.create(r5)
                if (r0 != 0) goto L_0x0022
                r5 = 0
                return r5
            L_0x0022:
                monitor-enter(r4)
                int r1 = r4.createCount     // Catch:{ all -> 0x004e }
                int r1 = r1 + 1
                r4.createCount = r1     // Catch:{ all -> 0x004e }
                java.util.LinkedHashMap<K, V> r1 = r4.map     // Catch:{ all -> 0x004e }
                java.lang.Object r1 = r1.put(r5, r0)     // Catch:{ all -> 0x004e }
                if (r1 == 0) goto L_0x0037
                java.util.LinkedHashMap<K, V> r2 = r4.map     // Catch:{ all -> 0x004e }
                r2.put(r5, r1)     // Catch:{ all -> 0x004e }
                goto L_0x0040
            L_0x0037:
                int r2 = r4.size     // Catch:{ all -> 0x004e }
                int r3 = r4.safeSizeOf(r5, r0)     // Catch:{ all -> 0x004e }
                int r2 = r2 + r3
                r4.size = r2     // Catch:{ all -> 0x004e }
            L_0x0040:
                monitor-exit(r4)     // Catch:{ all -> 0x004e }
                if (r1 == 0) goto L_0x0048
                r2 = 0
                r4.entryRemoved(r2, r5, r0, r1)
                return r1
            L_0x0048:
                int r5 = r4.maxSize
                r4.trimToSize(r5)
                return r0
            L_0x004e:
                r5 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x004e }
                throw r5
            L_0x0051:
                r5 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0051 }
                throw r5
            L_0x0054:
                java.lang.NullPointerException r5 = new java.lang.NullPointerException
                java.lang.String r0 = "key == null"
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.PlaybackStateCompat.ErrorCode.get(java.lang.Object):java.lang.Object");
        }

        @Nullable
        public final V put(@NonNull K k, @NonNull V v) {
            V put;
            if (k == null || v == null) {
                throw new NullPointerException("key == null || value == null");
            }
            synchronized (this) {
                this.putCount++;
                this.size += safeSizeOf(k, v);
                put = this.map.put(k, v);
                if (put != null) {
                    this.size -= safeSizeOf(k, put);
                }
            }
            if (put != null) {
                entryRemoved(false, k, put, v);
            }
            trimToSize(this.maxSize);
            return put;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
            throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void trimToSize(int r5) {
            /*
                r4 = this;
            L_0x0000:
                monitor-enter(r4)
                int r0 = r4.size     // Catch:{ all -> 0x0071 }
                if (r0 < 0) goto L_0x0052
                java.util.LinkedHashMap<K, V> r0 = r4.map     // Catch:{ all -> 0x0071 }
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
                if (r0 == 0) goto L_0x0011
                int r0 = r4.size     // Catch:{ all -> 0x0071 }
                if (r0 != 0) goto L_0x0052
            L_0x0011:
                int r0 = r4.size     // Catch:{ all -> 0x0071 }
                if (r0 <= r5) goto L_0x0050
                java.util.LinkedHashMap<K, V> r0 = r4.map     // Catch:{ all -> 0x0071 }
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
                if (r0 == 0) goto L_0x001e
                goto L_0x0050
            L_0x001e:
                java.util.LinkedHashMap<K, V> r0 = r4.map     // Catch:{ all -> 0x0071 }
                java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0071 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0071 }
                java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0071 }
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0071 }
                java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0071 }
                java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0071 }
                java.util.LinkedHashMap<K, V> r2 = r4.map     // Catch:{ all -> 0x0071 }
                r2.remove(r1)     // Catch:{ all -> 0x0071 }
                int r2 = r4.size     // Catch:{ all -> 0x0071 }
                int r3 = r4.safeSizeOf(r1, r0)     // Catch:{ all -> 0x0071 }
                int r2 = r2 - r3
                r4.size = r2     // Catch:{ all -> 0x0071 }
                int r2 = r4.evictionCount     // Catch:{ all -> 0x0071 }
                r3 = 1
                int r2 = r2 + r3
                r4.evictionCount = r2     // Catch:{ all -> 0x0071 }
                monitor-exit(r4)     // Catch:{ all -> 0x0071 }
                r2 = 0
                r4.entryRemoved(r3, r1, r0, r2)
                goto L_0x0000
            L_0x0050:
                monitor-exit(r4)     // Catch:{ all -> 0x0071 }
                return
            L_0x0052:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0071 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
                r0.<init>()     // Catch:{ all -> 0x0071 }
                java.lang.Class r1 = r4.getClass()     // Catch:{ all -> 0x0071 }
                java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0071 }
                r0.append(r1)     // Catch:{ all -> 0x0071 }
                java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
                r0.append(r1)     // Catch:{ all -> 0x0071 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0071 }
                r5.<init>(r0)     // Catch:{ all -> 0x0071 }
                throw r5     // Catch:{ all -> 0x0071 }
            L_0x0071:
                r5 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0071 }
                goto L_0x0075
            L_0x0074:
                throw r5
            L_0x0075:
                goto L_0x0074
            */
            throw new UnsupportedOperationException("Method not decompiled: o.PlaybackStateCompat.ErrorCode.trimToSize(int):void");
        }

        @Nullable
        public final V remove(@NonNull K k) {
            V remove;
            if (k != null) {
                synchronized (this) {
                    remove = this.map.remove(k);
                    if (remove != null) {
                        this.size -= safeSizeOf(k, remove);
                    }
                }
                if (remove != null) {
                    entryRemoved(false, k, remove, (V) null);
                }
                return remove;
            }
            throw new NullPointerException("key == null");
        }

        private int safeSizeOf(K k, V v) {
            int sizeOf = sizeOf(k, v);
            if (sizeOf >= 0) {
                return sizeOf;
            }
            throw new IllegalStateException("Negative size: " + k + SimpleComparison.EQUAL_TO_OPERATION + v);
        }

        public final void evictAll() {
            trimToSize(-1);
        }

        public final synchronized int size() {
            return this.size;
        }

        public final synchronized int maxSize() {
            return this.maxSize;
        }

        public final synchronized int hitCount() {
            return this.hitCount;
        }

        public final synchronized int missCount() {
            return this.missCount;
        }

        public final synchronized int createCount() {
            return this.createCount;
        }

        public final synchronized int putCount() {
            return this.putCount;
        }

        public final synchronized int evictionCount() {
            return this.evictionCount;
        }

        public final synchronized Map<K, V> snapshot() {
            return new LinkedHashMap(this.map);
        }

        public final synchronized String toString() {
            int i;
            i = this.hitCount + this.missCount;
            return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.maxSize), Integer.valueOf(this.hitCount), Integer.valueOf(this.missCount), Integer.valueOf(i != 0 ? (this.hitCount * 100) / i : 0)});
        }
    }

    @RequiresApi(21)
    class CustomAction extends Drawable {
        private boolean IsOverlapping = false;
        private PorterDuffColorFilter equals;
        private final Rect getMax;
        private final RectF getMin;
        private ColorStateList isInside;
        private float length;
        private float setMax;
        private final Paint setMin;
        private boolean toFloatRange = true;
        private ColorStateList toIntRange;
        private PorterDuff.Mode values = PorterDuff.Mode.SRC_IN;

        public int getOpacity() {
            return -3;
        }

        CustomAction(ColorStateList colorStateList, float f) {
            this.setMax = f;
            this.setMin = new Paint(5);
            getMin(colorStateList);
            this.getMin = new RectF();
            this.getMax = new Rect();
        }

        private void getMin(ColorStateList colorStateList) {
            if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(0);
            }
            this.toIntRange = colorStateList;
            this.setMin.setColor(colorStateList.getColorForState(getState(), this.toIntRange.getDefaultColor()));
        }

        /* access modifiers changed from: package-private */
        public void getMax(float f, boolean z, boolean z2) {
            if (f != this.length || this.IsOverlapping != z || this.toFloatRange != z2) {
                this.length = f;
                this.IsOverlapping = z;
                this.toFloatRange = z2;
                setMax((Rect) null);
                invalidateSelf();
            }
        }

        /* access modifiers changed from: package-private */
        public float getMax() {
            return this.length;
        }

        public void draw(Canvas canvas) {
            boolean z;
            Paint paint = this.setMin;
            if (this.equals == null || paint.getColorFilter() != null) {
                z = false;
            } else {
                paint.setColorFilter(this.equals);
                z = true;
            }
            RectF rectF = this.getMin;
            float f = this.setMax;
            canvas.drawRoundRect(rectF, f, f, paint);
            if (z) {
                paint.setColorFilter((ColorFilter) null);
            }
        }

        private void setMax(Rect rect) {
            if (rect == null) {
                rect = getBounds();
            }
            this.getMin.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
            this.getMax.set(rect);
            if (this.IsOverlapping) {
                float max = ParcelableVolumeInfo.getMax(this.length, this.setMax, this.toFloatRange);
                this.getMax.inset((int) Math.ceil((double) ParcelableVolumeInfo.getMin(this.length, this.setMax, this.toFloatRange)), (int) Math.ceil((double) max));
                this.getMin.set(this.getMax);
            }
        }

        /* access modifiers changed from: protected */
        public void onBoundsChange(Rect rect) {
            super.onBoundsChange(rect);
            setMax(rect);
        }

        public void getOutline(Outline outline) {
            outline.setRoundRect(this.getMax, this.setMax);
        }

        /* access modifiers changed from: package-private */
        public void setMax(float f) {
            if (f != this.setMax) {
                this.setMax = f;
                setMax((Rect) null);
                invalidateSelf();
            }
        }

        public void setAlpha(int i) {
            this.setMin.setAlpha(i);
        }

        public void setColorFilter(ColorFilter colorFilter) {
            this.setMin.setColorFilter(colorFilter);
        }

        public float setMin() {
            return this.setMax;
        }

        public void getMax(@Nullable ColorStateList colorStateList) {
            getMin(colorStateList);
            invalidateSelf();
        }

        public ColorStateList getMin() {
            return this.toIntRange;
        }

        public void setTintList(ColorStateList colorStateList) {
            this.isInside = colorStateList;
            this.equals = setMin(colorStateList, this.values);
            invalidateSelf();
        }

        public void setTintMode(PorterDuff.Mode mode) {
            this.values = mode;
            this.equals = setMin(this.isInside, mode);
            invalidateSelf();
        }

        /* access modifiers changed from: protected */
        public boolean onStateChange(int[] iArr) {
            PorterDuff.Mode mode;
            ColorStateList colorStateList = this.toIntRange;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            boolean z = colorForState != this.setMin.getColor();
            if (z) {
                this.setMin.setColor(colorForState);
            }
            ColorStateList colorStateList2 = this.isInside;
            if (colorStateList2 == null || (mode = this.values) == null) {
                return z;
            }
            this.equals = setMin(colorStateList2, mode);
            return true;
        }

        public boolean isStateful() {
            ColorStateList colorStateList = this.isInside;
            if (colorStateList != null && colorStateList.isStateful()) {
                return true;
            }
            ColorStateList colorStateList2 = this.toIntRange;
            return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
        }

        private PorterDuffColorFilter setMin(ColorStateList colorStateList, PorterDuff.Mode mode) {
            if (colorStateList == null || mode == null) {
                return null;
            }
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
    }

    public PlaybackStateCompat() {
    }

    public class ShuffleMode<E> implements Cloneable {
        public static final Object getMax = new Object();
        public boolean getMin;
        public int length;
        public long[] setMax;
        public Object[] setMin;

        public ShuffleMode() {
            this(10);
        }

        public ShuffleMode(int i) {
            this.getMin = false;
            if (i == 0) {
                this.setMax = State.length;
                this.setMin = State.getMin;
                return;
            }
            int max = State.getMax(i);
            this.setMax = new long[max];
            this.setMin = new Object[max];
        }

        /* renamed from: setMax */
        public final ShuffleMode<E> clone() {
            try {
                ShuffleMode<E> shuffleMode = (ShuffleMode) super.clone();
                shuffleMode.setMax = (long[]) this.setMax.clone();
                shuffleMode.setMin = (Object[]) this.setMin.clone();
                return shuffleMode;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        public final E getMax(long j, E e) {
            int max = State.getMax(this.setMax, this.length, j);
            if (max >= 0) {
                E[] eArr = this.setMin;
                if (eArr[max] != getMax) {
                    return eArr[max];
                }
            }
            return e;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
            r4 = r2.setMin;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void getMin(long r3) {
            /*
                r2 = this;
                long[] r0 = r2.setMax
                int r1 = r2.length
                int r3 = o.PlaybackStateCompat.State.getMax((long[]) r0, (int) r1, (long) r3)
                if (r3 < 0) goto L_0x0017
                java.lang.Object[] r4 = r2.setMin
                r0 = r4[r3]
                java.lang.Object r1 = getMax
                if (r0 == r1) goto L_0x0017
                r4[r3] = r1
                r3 = 1
                r2.getMin = r3
            L_0x0017:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.PlaybackStateCompat.ShuffleMode.getMin(long):void");
        }

        public final void getMin() {
            int i = this.length;
            long[] jArr = this.setMax;
            Object[] objArr = this.setMin;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != getMax) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.getMin = false;
            this.length = i2;
        }

        public final void setMax(long j, E e) {
            int max = State.getMax(this.setMax, this.length, j);
            if (max >= 0) {
                this.setMin[max] = e;
                return;
            }
            int i = max ^ -1;
            if (i < this.length) {
                Object[] objArr = this.setMin;
                if (objArr[i] == getMax) {
                    this.setMax[i] = j;
                    objArr[i] = e;
                    return;
                }
            }
            if (this.getMin && this.length >= this.setMax.length) {
                getMin();
                i = State.getMax(this.setMax, this.length, j) ^ -1;
            }
            int i2 = this.length;
            if (i2 >= this.setMax.length) {
                int max2 = State.getMax(i2 + 1);
                long[] jArr = new long[max2];
                Object[] objArr2 = new Object[max2];
                long[] jArr2 = this.setMax;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr3 = this.setMin;
                System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                this.setMax = jArr;
                this.setMin = objArr2;
            }
            int i3 = this.length;
            if (i3 - i != 0) {
                long[] jArr3 = this.setMax;
                int i4 = i + 1;
                System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
                Object[] objArr4 = this.setMin;
                System.arraycopy(objArr4, i, objArr4, i4, this.length - i);
            }
            this.setMax[i] = j;
            this.setMin[i] = e;
            this.length++;
        }

        public final int length() {
            if (this.getMin) {
                getMin();
            }
            return this.length;
        }

        public final long setMin(int i) {
            if (this.getMin) {
                getMin();
            }
            return this.setMax[i];
        }

        public final E getMin(int i) {
            if (this.getMin) {
                getMin();
            }
            return this.setMin[i];
        }

        public final int length(E e) {
            if (this.getMin) {
                getMin();
            }
            for (int i = 0; i < this.length; i++) {
                if (this.setMin[i] == e) {
                    return i;
                }
            }
            return -1;
        }

        public final void setMin() {
            int i = this.length;
            Object[] objArr = this.setMin;
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = null;
            }
            this.length = 0;
            this.getMin = false;
        }

        public final void length(long j, E e) {
            int i = this.length;
            if (i == 0 || j > this.setMax[i - 1]) {
                if (this.getMin && this.length >= this.setMax.length) {
                    getMin();
                }
                int i2 = this.length;
                if (i2 >= this.setMax.length) {
                    int max = State.getMax(i2 + 1);
                    long[] jArr = new long[max];
                    Object[] objArr = new Object[max];
                    long[] jArr2 = this.setMax;
                    System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                    Object[] objArr2 = this.setMin;
                    System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                    this.setMax = jArr;
                    this.setMin = objArr;
                }
                this.setMax[i2] = j;
                this.setMin[i2] = e;
                this.length = i2 + 1;
                return;
            }
            setMax(j, e);
        }

        public final boolean getMax() {
            if (this.getMin) {
                getMin();
            }
            return this.length == 0;
        }

        public final boolean setMin(long j) {
            if (this.getMin) {
                getMin();
            }
            return State.getMax(this.setMax, this.length, j) >= 0;
        }

        public String toString() {
            if (this.getMin) {
                getMin();
            }
            int i = this.length;
            if (i <= 0) {
                return "{}";
            }
            StringBuilder sb = new StringBuilder(i * 28);
            sb.append('{');
            for (int i2 = 0; i2 < this.length; i2++) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(setMin(i2));
                sb.append('=');
                Object min = getMin(i2);
                if (min != this) {
                    sb.append(min);
                } else {
                    sb.append("(this Map)");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public PlaybackStateCompat(int i) {
        super(i);
    }

    public PlaybackStateCompat(RepeatMode repeatMode) {
        super(repeatMode);
    }

    public class RepeatMode<K, V> {
        static int getMax;
        @Nullable
        static Object[] getMin;
        static int length;
        @Nullable
        static Object[] setMin;
        int equals;
        public Object[] isInside;
        int[] toFloatRange;

        private static int setMax(int[] iArr, int i, int i2) {
            try {
                return State.getMax(iArr, i, i2);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }

        public final int setMin(Object obj, int i) {
            int i2 = this.equals;
            if (i2 == 0) {
                return -1;
            }
            int max = setMax(this.toFloatRange, i2, i);
            if (max < 0 || obj.equals(this.isInside[max << 1])) {
                return max;
            }
            int i3 = max + 1;
            while (i3 < i2 && this.toFloatRange[i3] == i) {
                if (obj.equals(this.isInside[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            int i4 = max - 1;
            while (i4 >= 0 && this.toFloatRange[i4] == i) {
                if (obj.equals(this.isInside[i4 << 1])) {
                    return i4;
                }
                i4--;
            }
            return i3 ^ -1;
        }

        public final int setMax() {
            int i = this.equals;
            if (i == 0) {
                return -1;
            }
            int max = setMax(this.toFloatRange, i, 0);
            if (max < 0 || this.isInside[max << 1] == null) {
                return max;
            }
            int i2 = max + 1;
            while (i2 < i && this.toFloatRange[i2] == 0) {
                if (this.isInside[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            int i3 = max - 1;
            while (i3 >= 0 && this.toFloatRange[i3] == 0) {
                if (this.isInside[i3 << 1] == null) {
                    return i3;
                }
                i3--;
            }
            return i2 ^ -1;
        }

        private void getMax(int i) {
            Class<RepeatMode> cls = RepeatMode.class;
            if (i == 8) {
                synchronized (cls) {
                    if (getMin != null) {
                        Object[] objArr = getMin;
                        this.isInside = objArr;
                        getMin = (Object[]) objArr[0];
                        this.toFloatRange = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        getMax--;
                        return;
                    }
                }
            } else if (i == 4) {
                synchronized (cls) {
                    if (setMin != null) {
                        Object[] objArr2 = setMin;
                        this.isInside = objArr2;
                        setMin = (Object[]) objArr2[0];
                        this.toFloatRange = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        length--;
                        return;
                    }
                }
            }
            this.toFloatRange = new int[i];
            this.isInside = new Object[(i << 1)];
        }

        private static void getMin(int[] iArr, Object[] objArr, int i) {
            Class<RepeatMode> cls = RepeatMode.class;
            if (iArr.length == 8) {
                synchronized (cls) {
                    if (getMax < 10) {
                        objArr[0] = getMin;
                        objArr[1] = iArr;
                        for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        getMin = objArr;
                        getMax++;
                    }
                }
            } else if (iArr.length == 4) {
                synchronized (cls) {
                    if (length < 10) {
                        objArr[0] = setMin;
                        objArr[1] = iArr;
                        for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        setMin = objArr;
                        length++;
                    }
                }
            }
        }

        public RepeatMode() {
            this.toFloatRange = State.getMax;
            this.isInside = State.getMin;
            this.equals = 0;
        }

        public RepeatMode(int i) {
            if (i == 0) {
                this.toFloatRange = State.getMax;
                this.isInside = State.getMin;
            } else {
                getMax(i);
            }
            this.equals = 0;
        }

        public RepeatMode(RepeatMode<K, V> repeatMode) {
            this();
            if (repeatMode != null) {
                length(repeatMode);
            }
        }

        public void clear() {
            int i = this.equals;
            if (i > 0) {
                int[] iArr = this.toFloatRange;
                Object[] objArr = this.isInside;
                this.toFloatRange = State.getMax;
                this.isInside = State.getMin;
                this.equals = 0;
                getMin(iArr, objArr, i);
            }
            if (this.equals > 0) {
                throw new ConcurrentModificationException();
            }
        }

        public final void length(int i) {
            int i2 = this.equals;
            int[] iArr = this.toFloatRange;
            if (iArr.length < i) {
                Object[] objArr = this.isInside;
                getMax(i);
                if (this.equals > 0) {
                    System.arraycopy(iArr, 0, this.toFloatRange, 0, i2);
                    System.arraycopy(objArr, 0, this.isInside, 0, i2 << 1);
                }
                getMin(iArr, objArr, i2);
            }
            if (this.equals != i2) {
                throw new ConcurrentModificationException();
            }
        }

        /* access modifiers changed from: package-private */
        public final int getMax(Object obj) {
            int i = this.equals * 2;
            Object[] objArr = this.isInside;
            if (obj == null) {
                for (int i2 = 1; i2 < i; i2 += 2) {
                    if (objArr[i2] == null) {
                        return i2 >> 1;
                    }
                }
                return -1;
            }
            for (int i3 = 1; i3 < i; i3 += 2) {
                if (obj.equals(objArr[i3])) {
                    return i3 >> 1;
                }
            }
            return -1;
        }

        public boolean containsValue(Object obj) {
            return getMax(obj) >= 0;
        }

        @Nullable
        public V get(Object obj) {
            return getOrDefault(obj, (Object) null);
        }

        public V length(int i, V v) {
            int i2 = (i << 1) + 1;
            V[] vArr = this.isInside;
            V v2 = vArr[i2];
            vArr[i2] = v;
            return v2;
        }

        public boolean isEmpty() {
            return this.equals <= 0;
        }

        @Nullable
        public V put(K k, V v) {
            int i;
            int i2;
            int i3 = this.equals;
            if (k == null) {
                i2 = setMax();
                i = 0;
            } else {
                int hashCode = k.hashCode();
                i = hashCode;
                i2 = setMin(k, hashCode);
            }
            if (i2 >= 0) {
                int i4 = (i2 << 1) + 1;
                V[] vArr = this.isInside;
                V v2 = vArr[i4];
                vArr[i4] = v;
                return v2;
            }
            int i5 = i2 ^ -1;
            if (i3 >= this.toFloatRange.length) {
                int i6 = 4;
                if (i3 >= 8) {
                    i6 = (i3 >> 1) + i3;
                } else if (i3 >= 4) {
                    i6 = 8;
                }
                int[] iArr = this.toFloatRange;
                Object[] objArr = this.isInside;
                getMax(i6);
                if (i3 == this.equals) {
                    int[] iArr2 = this.toFloatRange;
                    if (iArr2.length > 0) {
                        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                        System.arraycopy(objArr, 0, this.isInside, 0, objArr.length);
                    }
                    getMin(iArr, objArr, i3);
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            if (i5 < i3) {
                int[] iArr3 = this.toFloatRange;
                int i7 = i5 + 1;
                System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
                Object[] objArr2 = this.isInside;
                System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.equals - i5) << 1);
            }
            int i8 = this.equals;
            if (i3 == i8) {
                int[] iArr4 = this.toFloatRange;
                if (i5 < iArr4.length) {
                    iArr4[i5] = i;
                    Object[] objArr3 = this.isInside;
                    int i9 = i5 << 1;
                    objArr3[i9] = k;
                    objArr3[i9 + 1] = v;
                    this.equals = i8 + 1;
                    return null;
                }
            }
            throw new ConcurrentModificationException();
        }

        public void length(@NonNull RepeatMode<? extends K, ? extends V> repeatMode) {
            int i = repeatMode.equals;
            length(this.equals + i);
            if (this.equals != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    Object[] objArr = repeatMode.isInside;
                    int i3 = i2 << 1;
                    put(objArr[i3], objArr[i3 + 1]);
                }
            } else if (i > 0) {
                System.arraycopy(repeatMode.toFloatRange, 0, this.toFloatRange, 0, i);
                System.arraycopy(repeatMode.isInside, 0, this.isInside, 0, i << 1);
                this.equals = i;
            }
        }

        @Nullable
        public V putIfAbsent(K k, V v) {
            V v2 = get(k);
            return v2 == null ? put(k, v) : v2;
        }

        public V setMin(int i) {
            V[] vArr = this.isInside;
            int i2 = i << 1;
            V v = vArr[i2 + 1];
            int i3 = this.equals;
            int i4 = 0;
            if (i3 <= 1) {
                getMin(this.toFloatRange, vArr, i3);
                this.toFloatRange = State.getMax;
                this.isInside = State.getMin;
            } else {
                int i5 = i3 - 1;
                int[] iArr = this.toFloatRange;
                int i6 = 8;
                if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                    if (i < i5) {
                        int[] iArr2 = this.toFloatRange;
                        int i7 = i + 1;
                        int i8 = i5 - i;
                        System.arraycopy(iArr2, i7, iArr2, i, i8);
                        Object[] objArr = this.isInside;
                        System.arraycopy(objArr, i7 << 1, objArr, i2, i8 << 1);
                    }
                    Object[] objArr2 = this.isInside;
                    int i9 = i5 << 1;
                    objArr2[i9] = null;
                    objArr2[i9 + 1] = null;
                } else {
                    if (i3 > 8) {
                        i6 = i3 + (i3 >> 1);
                    }
                    int[] iArr3 = this.toFloatRange;
                    Object[] objArr3 = this.isInside;
                    getMax(i6);
                    if (i3 == this.equals) {
                        if (i > 0) {
                            System.arraycopy(iArr3, 0, this.toFloatRange, 0, i);
                            System.arraycopy(objArr3, 0, this.isInside, 0, i2);
                        }
                        if (i < i5) {
                            int i10 = i + 1;
                            int i11 = i5 - i;
                            System.arraycopy(iArr3, i10, this.toFloatRange, i, i11);
                            System.arraycopy(objArr3, i10 << 1, this.isInside, i2, i11 << 1);
                        }
                    } else {
                        throw new ConcurrentModificationException();
                    }
                }
                i4 = i5;
            }
            if (i3 == this.equals) {
                this.equals = i4;
                return v;
            }
            throw new ConcurrentModificationException();
        }

        public int size() {
            return this.equals;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RepeatMode) {
                RepeatMode repeatMode = (RepeatMode) obj;
                if (size() != repeatMode.size()) {
                    return false;
                }
                int i = 0;
                while (i < this.equals) {
                    try {
                        int i2 = i << 1;
                        Object obj2 = this.isInside[i2];
                        Object obj3 = this.isInside[i2 + 1];
                        Object obj4 = repeatMode.get(obj2);
                        if (obj3 == null) {
                            if (obj4 != null || !repeatMode.containsKey(obj2)) {
                                return false;
                            }
                        } else if (!obj3.equals(obj4)) {
                            return false;
                        }
                        i++;
                    } catch (ClassCastException | NullPointerException unused) {
                        return false;
                    }
                }
                return true;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (size() != map.size()) {
                    return false;
                }
                int i3 = 0;
                while (i3 < this.equals) {
                    try {
                        int i4 = i3 << 1;
                        Object obj5 = this.isInside[i4];
                        Object obj6 = this.isInside[i4 + 1];
                        Object obj7 = map.get(obj5);
                        if (obj6 == null) {
                            if (obj7 != null || !map.containsKey(obj5)) {
                                return false;
                            }
                        } else if (!obj6.equals(obj7)) {
                            return false;
                        }
                        i3++;
                    } catch (ClassCastException | NullPointerException unused2) {
                    }
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            int[] iArr = this.toFloatRange;
            Object[] objArr = this.isInside;
            int i = this.equals;
            int i2 = 1;
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                Object obj = objArr[i2];
                i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
                i3++;
                i2 += 2;
            }
            return i4;
        }

        public String toString() {
            if (isEmpty()) {
                return "{}";
            }
            StringBuilder sb = new StringBuilder(this.equals * 28);
            sb.append('{');
            for (int i = 0; i < this.equals; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                int i2 = i << 1;
                Object obj = this.isInside[i2];
                if (obj != this) {
                    sb.append(obj);
                } else {
                    sb.append("(this Map)");
                }
                sb.append('=');
                Object obj2 = this.isInside[i2 + 1];
                if (obj2 != this) {
                    sb.append(obj2);
                } else {
                    sb.append("(this Map)");
                }
            }
            sb.append('}');
            return sb.toString();
        }

        public boolean containsKey(@Nullable Object obj) {
            return (obj == null ? setMax() : setMin(obj, obj.hashCode())) >= 0;
        }

        public V getOrDefault(Object obj, V v) {
            int i;
            if (obj == null) {
                i = setMax();
            } else {
                i = setMin(obj, obj.hashCode());
            }
            return i >= 0 ? this.isInside[(i << 1) + 1] : v;
        }

        @Nullable
        public V remove(Object obj) {
            int i;
            if (obj == null) {
                i = setMax();
            } else {
                i = setMin(obj, obj.hashCode());
            }
            if (i >= 0) {
                return setMin(i);
            }
            return null;
        }

        public boolean remove(Object obj, Object obj2) {
            int i;
            if (obj == null) {
                i = setMax();
            } else {
                i = setMin(obj, obj.hashCode());
            }
            if (i < 0) {
                return false;
            }
            Object obj3 = this.isInside[(i << 1) + 1];
            if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
                return false;
            }
            setMin(i);
            return true;
        }

        @Nullable
        public V replace(K k, V v) {
            int i;
            if (k == null) {
                i = setMax();
            } else {
                i = setMin(k, k.hashCode());
            }
            if (i >= 0) {
                return length(i, v);
            }
            return null;
        }

        public boolean replace(K k, V v, V v2) {
            int i;
            if (k == null) {
                i = setMax();
            } else {
                i = setMin(k, k.hashCode());
            }
            if (i < 0) {
                return false;
            }
            V v3 = this.isInside[(i << 1) + 1];
            if (v3 != v && (v == null || !v.equals(v3))) {
                return false;
            }
            length(i, v2);
            return true;
        }
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        length(this.equals + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public final boolean getMax(@NonNull Collection<?> collection) {
        return MediaKeyAction.getMax(this, collection);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.setMax == null) {
            this.setMax = new MediaKeyAction<K, V>() {
                /* access modifiers changed from: protected */
                public final int getMin() {
                    return PlaybackStateCompat.this.equals;
                }

                /* access modifiers changed from: protected */
                public final Object length(int i, int i2) {
                    return PlaybackStateCompat.this.isInside[(i << 1) + i2];
                }

                /* access modifiers changed from: protected */
                public final int getMin(Object obj) {
                    PlaybackStateCompat playbackStateCompat = PlaybackStateCompat.this;
                    return obj == null ? playbackStateCompat.setMax() : playbackStateCompat.setMin(obj, obj.hashCode());
                }

                /* access modifiers changed from: protected */
                public final int setMax(Object obj) {
                    return PlaybackStateCompat.this.getMax(obj);
                }

                /* access modifiers changed from: protected */
                public final Map<K, V> length() {
                    return PlaybackStateCompat.this;
                }

                /* access modifiers changed from: protected */
                public final void length(K k, V v) {
                    PlaybackStateCompat.this.put(k, v);
                }

                /* access modifiers changed from: protected */
                public final V getMax(int i, V v) {
                    return PlaybackStateCompat.this.length(i, v);
                }

                /* access modifiers changed from: protected */
                public final void setMin(int i) {
                    PlaybackStateCompat.this.setMin(i);
                }

                /* access modifiers changed from: protected */
                public final void getMax() {
                    PlaybackStateCompat.this.clear();
                }
            };
        }
        MediaKeyAction<K, V> mediaKeyAction = this.setMax;
        if (mediaKeyAction.getMin == null) {
            mediaKeyAction.getMin = new MediaKeyAction.setMax();
        }
        return mediaKeyAction.getMin;
    }

    public Set<K> keySet() {
        if (this.setMax == null) {
            this.setMax = new MediaKeyAction<K, V>() {
                /* access modifiers changed from: protected */
                public final int getMin() {
                    return PlaybackStateCompat.this.equals;
                }

                /* access modifiers changed from: protected */
                public final Object length(int i, int i2) {
                    return PlaybackStateCompat.this.isInside[(i << 1) + i2];
                }

                /* access modifiers changed from: protected */
                public final int getMin(Object obj) {
                    PlaybackStateCompat playbackStateCompat = PlaybackStateCompat.this;
                    return obj == null ? playbackStateCompat.setMax() : playbackStateCompat.setMin(obj, obj.hashCode());
                }

                /* access modifiers changed from: protected */
                public final int setMax(Object obj) {
                    return PlaybackStateCompat.this.getMax(obj);
                }

                /* access modifiers changed from: protected */
                public final Map<K, V> length() {
                    return PlaybackStateCompat.this;
                }

                /* access modifiers changed from: protected */
                public final void length(K k, V v) {
                    PlaybackStateCompat.this.put(k, v);
                }

                /* access modifiers changed from: protected */
                public final V getMax(int i, V v) {
                    return PlaybackStateCompat.this.length(i, v);
                }

                /* access modifiers changed from: protected */
                public final void setMin(int i) {
                    PlaybackStateCompat.this.setMin(i);
                }

                /* access modifiers changed from: protected */
                public final void getMax() {
                    PlaybackStateCompat.this.clear();
                }
            };
        }
        MediaKeyAction<K, V> mediaKeyAction = this.setMax;
        if (mediaKeyAction.setMax == null) {
            mediaKeyAction.setMax = new MediaKeyAction.getMin();
        }
        return mediaKeyAction.setMax;
    }

    public Collection<V> values() {
        if (this.setMax == null) {
            this.setMax = new MediaKeyAction<K, V>() {
                /* access modifiers changed from: protected */
                public final int getMin() {
                    return PlaybackStateCompat.this.equals;
                }

                /* access modifiers changed from: protected */
                public final Object length(int i, int i2) {
                    return PlaybackStateCompat.this.isInside[(i << 1) + i2];
                }

                /* access modifiers changed from: protected */
                public final int getMin(Object obj) {
                    PlaybackStateCompat playbackStateCompat = PlaybackStateCompat.this;
                    return obj == null ? playbackStateCompat.setMax() : playbackStateCompat.setMin(obj, obj.hashCode());
                }

                /* access modifiers changed from: protected */
                public final int setMax(Object obj) {
                    return PlaybackStateCompat.this.getMax(obj);
                }

                /* access modifiers changed from: protected */
                public final Map<K, V> length() {
                    return PlaybackStateCompat.this;
                }

                /* access modifiers changed from: protected */
                public final void length(K k, V v) {
                    PlaybackStateCompat.this.put(k, v);
                }

                /* access modifiers changed from: protected */
                public final V getMax(int i, V v) {
                    return PlaybackStateCompat.this.length(i, v);
                }

                /* access modifiers changed from: protected */
                public final void setMin(int i) {
                    PlaybackStateCompat.this.setMin(i);
                }

                /* access modifiers changed from: protected */
                public final void getMax() {
                    PlaybackStateCompat.this.clear();
                }
            };
        }
        MediaKeyAction<K, V> mediaKeyAction = this.setMax;
        if (mediaKeyAction.length == null) {
            mediaKeyAction.length = new MediaKeyAction.setMin();
        }
        return mediaKeyAction.length;
    }
}
