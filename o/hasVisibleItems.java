package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public final class hasVisibleItems<T> extends AbstractList<T> {
    static final List setMax = new ArrayList();
    public int IsOverlapping;
    public int equals;
    public final ArrayList<List<T>> getMax;
    public int getMin;
    public int isInside;
    public int length;
    public int setMin;
    public int toFloatRange;
    public int toIntRange;

    public interface setMax {
        void getMax(int i, int i2);

        void length();

        void length(int i);

        void length(int i, int i2, int i3);

        void setMax();

        void setMax(int i, int i2);

        void setMin(int i);

        void setMin(int i, int i2);

        void setMin(int i, int i2, int i3);
    }

    public hasVisibleItems() {
        this.length = 0;
        this.getMax = new ArrayList<>();
        this.getMin = 0;
        this.setMin = 0;
        this.isInside = 0;
        this.toFloatRange = 0;
        this.equals = 1;
        this.toIntRange = 0;
        this.IsOverlapping = 0;
    }

    hasVisibleItems(hasVisibleItems<T> hasvisibleitems) {
        this.length = hasvisibleitems.length;
        this.getMax = new ArrayList<>(hasvisibleitems.getMax);
        this.getMin = hasvisibleitems.getMin;
        this.setMin = hasvisibleitems.setMin;
        this.isInside = hasvisibleitems.isInside;
        this.toFloatRange = hasvisibleitems.toFloatRange;
        this.equals = hasvisibleitems.equals;
        this.toIntRange = hasvisibleitems.toIntRange;
        this.IsOverlapping = hasvisibleitems.IsOverlapping;
    }

    public final void getMin(int i, List<T> list, int i2, int i3) {
        this.length = i;
        this.getMax.clear();
        this.getMax.add(list);
        this.getMin = i2;
        this.setMin = i3;
        int size = list.size();
        this.isInside = size;
        this.toFloatRange = size;
        this.equals = list.size();
        this.toIntRange = 0;
        this.IsOverlapping = 0;
    }

    public final T get(int i) {
        int i2;
        if (i < 0 || i >= size()) {
            StringBuilder sb = new StringBuilder("Index: ");
            sb.append(i);
            sb.append(", Size: ");
            sb.append(size());
            throw new IndexOutOfBoundsException(sb.toString());
        }
        int i3 = i - this.length;
        if (i3 >= 0 && i3 < this.toFloatRange) {
            if (!getMin()) {
                int size = this.getMax.size();
                i2 = 0;
                while (i2 < size) {
                    int size2 = this.getMax.get(i2).size();
                    if (size2 > i3) {
                        break;
                    }
                    i3 -= size2;
                    i2++;
                }
            } else {
                int i4 = this.equals;
                i2 = i3 / i4;
                i3 %= i4;
            }
            List list = this.getMax.get(i2);
            if (!(list == null || list.size() == 0)) {
                return list.get(i3);
            }
        }
        return null;
    }

    private boolean getMin() {
        return this.equals > 0;
    }

    public final int size() {
        return this.length + this.toFloatRange + this.getMin;
    }

    /* access modifiers changed from: package-private */
    public final int getMax() {
        int i = this.length;
        int size = this.getMax.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list = this.getMax.get(i2);
            if (list != null && list != setMax) {
                break;
            }
            i += this.equals;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public final int length() {
        int i = this.getMin;
        for (int size = this.getMax.size() - 1; size >= 0; size--) {
            List list = this.getMax.get(size);
            if (list != null && list != setMax) {
                break;
            }
            i += this.equals;
        }
        return i;
    }

    private boolean setMin(int i, int i2, int i3) {
        List list = this.getMax.get(i3);
        if (list != null) {
            return this.isInside > i && this.getMax.size() > 2 && list != setMax && this.isInside - list.size() >= i2;
        }
        return true;
    }

    private boolean length(int i, int i2) {
        return setMin(i, i2, 0);
    }

    private boolean getMin(int i, int i2) {
        return setMin(i, i2, this.getMax.size() - 1);
    }

    public final boolean getMin(int i, int i2, int i3) {
        return this.isInside + i3 > i && this.getMax.size() > 1 && this.isInside >= i2;
    }

    public final boolean getMax(boolean z, int i, int i2, @NonNull setMax setmax) {
        int i3 = 0;
        while (length(i, i2)) {
            List remove = this.getMax.remove(0);
            int size = remove == null ? this.equals : remove.size();
            i3 += size;
            this.toFloatRange -= size;
            this.isInside -= remove == null ? 0 : remove.size();
        }
        if (i3 > 0) {
            if (z) {
                int i4 = this.length;
                this.length = i4 + i3;
                setmax.getMax(i4, i3);
            } else {
                this.setMin += i3;
                setmax.setMin(this.length, i3);
            }
        }
        if (i3 > 0) {
            return true;
        }
        return false;
    }

    public final boolean getMin(boolean z, int i, int i2, @NonNull setMax setmax) {
        int i3 = 0;
        while (getMin(i, i2)) {
            ArrayList<List<T>> arrayList = this.getMax;
            List remove = arrayList.remove(arrayList.size() - 1);
            int size = remove == null ? this.equals : remove.size();
            i3 += size;
            this.toFloatRange -= size;
            this.isInside -= remove == null ? 0 : remove.size();
        }
        if (i3 > 0) {
            int i4 = this.length + this.toFloatRange;
            if (z) {
                this.getMin += i3;
                setmax.getMax(i4, i3);
            } else {
                setmax.setMin(i4, i3);
            }
        }
        return i3 > 0;
    }

    public final T setMin() {
        ArrayList<List<T>> arrayList = this.getMax;
        List list = arrayList.get(arrayList.size() - 1);
        return list.get(list.size() - 1);
    }

    /* access modifiers changed from: package-private */
    public final boolean length(int i, boolean z) {
        if (this.equals <= 0 || this.getMax.size() < 2) {
            throw new IllegalStateException("Trimming attempt before sufficient load");
        }
        int i2 = this.length;
        if (i < i2) {
            return z;
        }
        if (i >= this.toFloatRange + i2) {
            return !z;
        }
        int i3 = (i - i2) / this.equals;
        if (z) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (this.getMax.get(i4) != null) {
                    return false;
                }
            }
        } else {
            for (int size = this.getMax.size() - 1; size > i3; size--) {
                if (this.getMax.get(size) != null) {
                    return false;
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void length(int i, @NonNull List<T> list, int i2, int i3, int i4, @NonNull setMax setmax) {
        int size = (list.size() + (i4 - 1)) / i4;
        int i5 = 0;
        while (i5 < size) {
            int i6 = i5 * i4;
            int i7 = i5 + 1;
            List<T> subList = list.subList(i6, Math.min(list.size(), i7 * i4));
            if (i5 == 0) {
                getMin(i, subList, (list.size() + i2) - subList.size(), i3);
            } else {
                getMin(i6 + i, subList, (setMax) null);
            }
            i5 = i7;
        }
        setmax.setMin(size());
    }

    public final void getMin(int i, @NonNull List<T> list, @Nullable setMax setmax) {
        int size = list.size();
        if (size != this.equals) {
            int size2 = size();
            int i2 = this.equals;
            boolean z = false;
            boolean z2 = i == size2 - (size2 % i2) && size < i2;
            if (this.getMin == 0 && this.getMax.size() == 1 && size > this.equals) {
                z = true;
            }
            if (!z && !z2) {
                throw new IllegalArgumentException("page introduces incorrect tiling");
            } else if (z) {
                this.equals = size;
            }
        }
        int i3 = i / this.equals;
        getMax(i3, i3);
        int i4 = i3 - (this.length / this.equals);
        List list2 = this.getMax.get(i4);
        if (list2 == null || list2 == setMax) {
            this.getMax.set(i4, list);
            this.isInside += size;
            if (setmax != null) {
                setmax.setMax(i, size);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Invalid position ");
        sb.append(i);
        sb.append(": data already loaded");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: package-private */
    public final void getMax(int i, int i2) {
        int i3;
        int i4 = this.length / this.equals;
        if (i < i4) {
            int i5 = 0;
            while (true) {
                i3 = i4 - i;
                if (i5 >= i3) {
                    break;
                }
                this.getMax.add(0, (Object) null);
                i5++;
            }
            int i6 = i3 * this.equals;
            this.toFloatRange += i6;
            this.length -= i6;
        } else {
            i = i4;
        }
        if (i2 >= this.getMax.size() + i) {
            int min = Math.min(this.getMin, ((i2 + 1) - (this.getMax.size() + i)) * this.equals);
            for (int size = this.getMax.size(); size <= i2 - i; size++) {
                ArrayList<List<T>> arrayList = this.getMax;
                arrayList.add(arrayList.size(), (Object) null);
            }
            this.toFloatRange += min;
            this.getMin -= min;
        }
    }

    public final boolean setMin(int i, int i2) {
        List list;
        int i3 = this.length / i;
        if (i2 < i3 || i2 >= this.getMax.size() + i3 || (list = this.getMax.get(i2 - i3)) == null || list == setMax) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("leading ");
        sb.append(this.length);
        sb.append(", storage ");
        sb.append(this.toFloatRange);
        sb.append(", trailing ");
        sb.append(this.getMin);
        StringBuilder sb2 = new StringBuilder(sb.toString());
        for (int i = 0; i < this.getMax.size(); i++) {
            sb2.append(" ");
            sb2.append(this.getMax.get(i));
        }
        return sb2.toString();
    }
}
