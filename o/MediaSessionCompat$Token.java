package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.PlaybackStateCompat;

public final class MediaSessionCompat$Token<E> implements Collection<E>, Set<E> {
    private static int IsOverlapping;
    @Nullable
    private static Object[] equals;
    @Nullable
    private static Object[] length;
    private static final Object[] setMax = new Object[0];
    private static final int[] setMin = new int[0];
    private static int toFloatRange;
    public Object[] getMax;
    int getMin;
    private PlaybackStateCompat.MediaKeyAction<E, E> isInside;
    private int[] toIntRange;

    /* access modifiers changed from: package-private */
    public final int setMin(Object obj, int i) {
        int i2 = this.getMin;
        if (i2 == 0) {
            return -1;
        }
        int max = PlaybackStateCompat.State.getMax(this.toIntRange, i2, i);
        if (max < 0 || obj.equals(this.getMax[max])) {
            return max;
        }
        int i3 = max + 1;
        while (i3 < i2 && this.toIntRange[i3] == i) {
            if (obj.equals(this.getMax[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = max - 1;
        while (i4 >= 0 && this.toIntRange[i4] == i) {
            if (obj.equals(this.getMax[i4])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    /* access modifiers changed from: package-private */
    public final int setMin() {
        int i = this.getMin;
        if (i == 0) {
            return -1;
        }
        int max = PlaybackStateCompat.State.getMax(this.toIntRange, i, 0);
        if (max < 0 || this.getMax[max] == null) {
            return max;
        }
        int i2 = max + 1;
        while (i2 < i && this.toIntRange[i2] == 0) {
            if (this.getMax[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = max - 1;
        while (i3 >= 0 && this.toIntRange[i3] == 0) {
            if (this.getMax[i3] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    private void getMin(int i) {
        Class<MediaSessionCompat$Token> cls = MediaSessionCompat$Token.class;
        if (i == 8) {
            synchronized (cls) {
                if (equals != null) {
                    Object[] objArr = equals;
                    this.getMax = objArr;
                    equals = (Object[]) objArr[0];
                    this.toIntRange = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    IsOverlapping--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                if (length != null) {
                    Object[] objArr2 = length;
                    this.getMax = objArr2;
                    length = (Object[]) objArr2[0];
                    this.toIntRange = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    toFloatRange--;
                    return;
                }
            }
        }
        this.toIntRange = new int[i];
        this.getMax = new Object[i];
    }

    private static void getMin(int[] iArr, Object[] objArr, int i) {
        Class<MediaSessionCompat$Token> cls = MediaSessionCompat$Token.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (IsOverlapping < 10) {
                    objArr[0] = equals;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    equals = objArr;
                    IsOverlapping++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (toFloatRange < 10) {
                    objArr[0] = length;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    length = objArr;
                    toFloatRange++;
                }
            }
        }
    }

    public MediaSessionCompat$Token() {
        this(0);
    }

    public MediaSessionCompat$Token(int i) {
        if (i == 0) {
            this.toIntRange = setMin;
            this.getMax = setMax;
        } else {
            getMin(i);
        }
        this.getMin = 0;
    }

    public final void clear() {
        int i = this.getMin;
        if (i != 0) {
            getMin(this.toIntRange, this.getMax, i);
            this.toIntRange = setMin;
            this.getMax = setMax;
            this.getMin = 0;
        }
    }

    public final boolean isEmpty() {
        return this.getMin <= 0;
    }

    public final boolean add(@Nullable E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = setMin();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = setMin(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = i2 ^ -1;
        int i4 = this.getMin;
        if (i4 >= this.toIntRange.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.toIntRange;
            Object[] objArr = this.getMax;
            getMin(i5);
            int[] iArr2 = this.toIntRange;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.getMax, 0, objArr.length);
            }
            getMin(iArr, objArr, this.getMin);
        }
        int i6 = this.getMin;
        if (i3 < i6) {
            int[] iArr3 = this.toIntRange;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.getMax;
            System.arraycopy(objArr2, i3, objArr2, i7, this.getMin - i3);
        }
        this.toIntRange[i3] = i;
        this.getMax[i3] = e;
        this.getMin++;
        return true;
    }

    public final E getMax(int i) {
        E[] eArr = this.getMax;
        E e = eArr[i];
        int i2 = this.getMin;
        if (i2 <= 1) {
            getMin(this.toIntRange, eArr, i2);
            this.toIntRange = setMin;
            this.getMax = setMax;
            this.getMin = 0;
        } else {
            int[] iArr = this.toIntRange;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i4 = this.getMin - 1;
                this.getMin = i4;
                if (i < i4) {
                    int[] iArr2 = this.toIntRange;
                    int i5 = i + 1;
                    System.arraycopy(iArr2, i5, iArr2, i, i4 - i);
                    Object[] objArr = this.getMax;
                    System.arraycopy(objArr, i5, objArr, i, this.getMin - i);
                }
                this.getMax[this.getMin] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                int[] iArr3 = this.toIntRange;
                Object[] objArr2 = this.getMax;
                getMin(i3);
                this.getMin--;
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.toIntRange, 0, i);
                    System.arraycopy(objArr2, 0, this.getMax, 0, i);
                }
                int i6 = this.getMin;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr3, i7, this.toIntRange, i, i6 - i);
                    System.arraycopy(objArr2, i7, this.getMax, i, this.getMin - i);
                }
            }
        }
        return e;
    }

    public final int size() {
        return this.getMin;
    }

    @NonNull
    public final Object[] toArray() {
        int i = this.getMin;
        Object[] objArr = new Object[i];
        System.arraycopy(this.getMax, 0, objArr, 0, i);
        return objArr;
    }

    @NonNull
    public final <T> T[] toArray(@NonNull T[] tArr) {
        if (tArr.length < this.getMin) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.getMin);
        }
        System.arraycopy(this.getMax, 0, tArr, 0, this.getMin);
        int length2 = tArr.length;
        int i = this.getMin;
        if (length2 > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.getMin) {
                try {
                    if (!set.contains(this.getMax[i])) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.toIntRange;
        int i = this.getMin;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.getMin * 14);
        sb.append('{');
        for (int i = 0; i < this.getMin; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.getMax[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean containsAll(@NonNull Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean addAll(@NonNull Collection<? extends E> collection) {
        int size = this.getMin + collection.size();
        int[] iArr = this.toIntRange;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.getMax;
            getMin(size);
            int i = this.getMin;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.toIntRange, 0, i);
                System.arraycopy(objArr, 0, this.getMax, 0, this.getMin);
            }
            getMin(iArr, objArr, this.getMin);
        }
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public final boolean removeAll(@NonNull Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public final boolean retainAll(@NonNull Collection<?> collection) {
        boolean z = false;
        for (int i = this.getMin - 1; i >= 0; i--) {
            if (!collection.contains(this.getMax[i])) {
                getMax(i);
                z = true;
            }
        }
        return z;
    }

    public final boolean contains(@Nullable Object obj) {
        return (obj == null ? setMin() : setMin(obj, obj.hashCode())) >= 0;
    }

    public final boolean remove(@Nullable Object obj) {
        int i;
        if (obj == null) {
            i = setMin();
        } else {
            i = setMin(obj, obj.hashCode());
        }
        if (i < 0) {
            return false;
        }
        getMax(i);
        return true;
    }

    public final Iterator<E> iterator() {
        if (this.isInside == null) {
            this.isInside = new PlaybackStateCompat.MediaKeyAction<E, E>() {
                /* access modifiers changed from: protected */
                public final int getMin() {
                    return MediaSessionCompat$Token.this.getMin;
                }

                /* access modifiers changed from: protected */
                public final Object length(int i, int i2) {
                    return MediaSessionCompat$Token.this.getMax[i];
                }

                /* access modifiers changed from: protected */
                public final int getMin(Object obj) {
                    MediaSessionCompat$Token mediaSessionCompat$Token = MediaSessionCompat$Token.this;
                    return obj == null ? mediaSessionCompat$Token.setMin() : mediaSessionCompat$Token.setMin(obj, obj.hashCode());
                }

                /* access modifiers changed from: protected */
                public final int setMax(Object obj) {
                    MediaSessionCompat$Token mediaSessionCompat$Token = MediaSessionCompat$Token.this;
                    return obj == null ? mediaSessionCompat$Token.setMin() : mediaSessionCompat$Token.setMin(obj, obj.hashCode());
                }

                /* access modifiers changed from: protected */
                public final Map<E, E> length() {
                    throw new UnsupportedOperationException("not a map");
                }

                /* access modifiers changed from: protected */
                public final void length(E e, E e2) {
                    MediaSessionCompat$Token.this.add(e);
                }

                /* access modifiers changed from: protected */
                public final E getMax(int i, E e) {
                    throw new UnsupportedOperationException("not a map");
                }

                /* access modifiers changed from: protected */
                public final void setMin(int i) {
                    MediaSessionCompat$Token.this.getMax(i);
                }

                /* access modifiers changed from: protected */
                public final void getMax() {
                    MediaSessionCompat$Token.this.clear();
                }
            };
        }
        PlaybackStateCompat.MediaKeyAction<E, E> mediaKeyAction = this.isInside;
        if (mediaKeyAction.setMax == null) {
            mediaKeyAction.setMax = new PlaybackStateCompat.MediaKeyAction.getMin();
        }
        return mediaKeyAction.setMax.iterator();
    }
}
