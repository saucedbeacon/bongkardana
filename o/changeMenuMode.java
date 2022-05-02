package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class changeMenuMode {
    private static final Comparator<length> getMin = new Comparator<length>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((length) obj).getMax - ((length) obj2).getMax;
        }
    };

    public static abstract class setMax {
        public abstract int getMax();

        public abstract boolean getMax(int i, int i2);

        public abstract int length();

        public abstract boolean length(int i, int i2);

        @Nullable
        public Object setMin(int i, int i2) {
            return null;
        }
    }

    public static abstract class setMin<T> {
        public abstract boolean getMax(@NonNull T t, @NonNull T t2);

        public abstract boolean setMax(@NonNull T t, @NonNull T t2);
    }

    @NonNull
    public static getMin getMin(@NonNull setMax setmax) {
        return setMin(setmax);
    }

    @NonNull
    public static getMin setMin(@NonNull setMax setmax) {
        int length2 = setmax.length();
        int max = setmax.getMax();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new equals(length2, max));
        int i = ((((length2 + max) + 1) / 2) * 2) + 1;
        getMax getmax = new getMax(i);
        getMax getmax2 = new getMax(i);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            equals equals2 = (equals) arrayList2.remove(arrayList2.size() - 1);
            isInside min = setMin(equals2, setmax, getmax, getmax2);
            if (min != null) {
                if (Math.min(min.setMax - min.setMin, min.getMax - min.getMin) > 0) {
                    arrayList.add(min.length());
                }
                equals equals3 = arrayList3.isEmpty() ? new equals() : (equals) arrayList3.remove(arrayList3.size() - 1);
                equals3.setMax = equals2.setMax;
                equals3.setMin = equals2.setMin;
                equals3.length = min.setMin;
                equals3.getMax = min.getMin;
                arrayList2.add(equals3);
                equals2.length = equals2.length;
                equals2.getMax = equals2.getMax;
                equals2.setMax = min.setMax;
                equals2.setMin = min.getMax;
                arrayList2.add(equals2);
            } else {
                arrayList3.add(equals2);
            }
        }
        Collections.sort(arrayList, getMin);
        return new getMin(setmax, arrayList, getmax.setMin, getmax2.setMin);
    }

    static class length {
        public final int getMax;
        public final int setMax;
        public final int setMin;

        length(int i, int i2, int i3) {
            this.getMax = i;
            this.setMax = i2;
            this.setMin = i3;
        }
    }

    static class isInside {
        public int getMax;
        public int getMin;
        public boolean length;
        public int setMax;
        public int setMin;

        isInside() {
        }

        private boolean setMax() {
            return this.getMax - this.getMin != this.setMax - this.setMin;
        }

        private boolean setMin() {
            return this.getMax - this.getMin > this.setMax - this.setMin;
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public final length length() {
            if (!setMax()) {
                int i = this.setMin;
                return new length(i, this.getMin, this.setMax - i);
            } else if (this.length) {
                int i2 = this.setMin;
                int i3 = this.getMin;
                return new length(i2, i3, Math.min(this.setMax - i2, this.getMax - i3));
            } else if (setMin()) {
                int i4 = this.setMin;
                int i5 = this.getMin;
                return new length(i4, i5 + 1, Math.min(this.setMax - i4, this.getMax - i5));
            } else {
                int i6 = this.setMin;
                int i7 = this.getMin;
                return new length(i6 + 1, i7, Math.min(this.setMax - i6, this.getMax - i7));
            }
        }
    }

    static class equals {
        int getMax;
        int length;
        int setMax;
        int setMin;

        public equals() {
        }

        public equals(int i, int i2) {
            this.setMax = 0;
            this.length = i;
            this.setMin = 0;
            this.getMax = i2;
        }
    }

    public static class getMin {
        private final boolean IsOverlapping = true;
        private final int[] getMax;
        private final setMax getMin;
        public final int[] length;
        public final int setMax;
        private final List<length> setMin;
        private final int toIntRange;

        getMin(setMax setmax, List<length> list, int[] iArr, int[] iArr2) {
            this.setMin = list;
            this.length = iArr;
            this.getMax = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(this.getMax, 0);
            this.getMin = setmax;
            this.setMax = setmax.length();
            this.toIntRange = setmax.getMax();
            length length2 = this.setMin.isEmpty() ? null : this.setMin.get(0);
            if (!(length2 != null && length2.getMax == 0 && length2.setMax == 0)) {
                this.setMin.add(0, new length(0, 0, 0));
            }
            this.setMin.add(new length(this.setMax, this.toIntRange, 0));
            setMax();
        }

        private void setMax() {
            Iterator<length> it = this.setMin.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                length next = it.next();
                for (int i = 0; i < next.setMin; i++) {
                    int i2 = next.getMax + i;
                    int i3 = next.setMax + i;
                    int i4 = this.getMin.getMax(i2, i3) ? 1 : 2;
                    this.length[i2] = (i3 << 4) | i4;
                    this.getMax[i3] = (i2 << 4) | i4;
                }
            }
            if (this.IsOverlapping) {
                int i5 = 0;
                for (length next2 : this.setMin) {
                    while (i5 < next2.getMax) {
                        if (this.length[i5] == 0) {
                            int size = this.setMin.size();
                            int i6 = 0;
                            int i7 = 0;
                            while (true) {
                                if (i6 >= size) {
                                    break;
                                }
                                length length2 = this.setMin.get(i6);
                                while (i7 < length2.setMax) {
                                    if (this.getMax[i7] != 0 || !this.getMin.length(i5, i7)) {
                                        i7++;
                                    } else {
                                        int i8 = this.getMin.getMax(i5, i7) ? 8 : 4;
                                        this.length[i5] = (i7 << 4) | i8;
                                        this.getMax[i7] = i8 | (i5 << 4);
                                    }
                                }
                                i7 = length2.setMax + length2.setMin;
                                i6++;
                            }
                        }
                        i5++;
                    }
                    i5 = next2.getMax + next2.setMin;
                }
            }
        }

        public final void getMax(@NonNull stopDispatchingItemsChanged stopdispatchingitemschanged) {
            findInsertIndex findinsertindex;
            int i;
            if (stopdispatchingitemschanged instanceof findInsertIndex) {
                findinsertindex = (findInsertIndex) stopdispatchingitemschanged;
            } else {
                findinsertindex = new findInsertIndex(stopdispatchingitemschanged);
            }
            int i2 = this.setMax;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i3 = this.setMax;
            int i4 = this.toIntRange;
            for (int size = this.setMin.size() - 1; size >= 0; size--) {
                length length2 = this.setMin.get(size);
                int i5 = length2.getMax + length2.setMin;
                int i6 = length2.setMax + length2.setMin;
                while (true) {
                    if (i3 <= i5) {
                        break;
                    }
                    i3--;
                    int i7 = this.length[i3];
                    if ((i7 & 12) != 0) {
                        int i8 = i7 >> 4;
                        IsOverlapping length3 = length(arrayDeque, i8, false);
                        if (length3 != null) {
                            int i9 = (i2 - length3.getMax) - 1;
                            findinsertindex.length();
                            findinsertindex.length.getMin(i3, i9);
                            if ((i7 & 4) != 0) {
                                this.getMin.setMin(i3, i8);
                                findinsertindex.getMax(i9, 1, (Object) null);
                            }
                        } else {
                            arrayDeque.add(new IsOverlapping(i3, (i2 - i3) - 1, true));
                        }
                    } else {
                        findinsertindex.length(i3, 1);
                        i2--;
                    }
                }
                while (i4 > i6) {
                    i4--;
                    int i10 = this.getMax[i4];
                    if ((i10 & 12) != 0) {
                        int i11 = i10 >> 4;
                        IsOverlapping length4 = length(arrayDeque, i11, true);
                        if (length4 == null) {
                            arrayDeque.add(new IsOverlapping(i4, i2 - i3, false));
                        } else {
                            findinsertindex.length();
                            findinsertindex.length.getMin((i2 - length4.getMax) - 1, i3);
                            if ((i10 & 4) != 0) {
                                this.getMin.setMin(i11, i4);
                                findinsertindex.getMax(i3, 1, (Object) null);
                            }
                        }
                    } else {
                        findinsertindex.setMax(i3, 1);
                        i2++;
                    }
                }
                int i12 = length2.getMax;
                int i13 = length2.setMax;
                for (i = 0; i < length2.setMin; i++) {
                    if ((this.length[i12] & 15) == 2) {
                        this.getMin.setMin(i12, i13);
                        findinsertindex.getMax(i12, 1, (Object) null);
                    }
                    i12++;
                    i13++;
                }
                i3 = length2.getMax;
                i4 = length2.setMax;
            }
            findinsertindex.length();
        }

        @Nullable
        private static IsOverlapping length(Collection<IsOverlapping> collection, int i, boolean z) {
            IsOverlapping isOverlapping;
            Iterator<IsOverlapping> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    isOverlapping = null;
                    break;
                }
                isOverlapping = it.next();
                if (isOverlapping.setMax == i && isOverlapping.length == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                IsOverlapping next = it.next();
                if (z) {
                    next.getMax--;
                } else {
                    next.getMax++;
                }
            }
            return isOverlapping;
        }
    }

    static class IsOverlapping {
        int getMax;
        boolean length;
        int setMax;

        IsOverlapping(int i, int i2, boolean z) {
            this.setMax = i;
            this.getMax = i2;
            this.length = z;
        }
    }

    static class getMax {
        final int getMax;
        final int[] setMin;

        getMax(int i) {
            int[] iArr = new int[i];
            this.setMin = iArr;
            this.getMax = iArr.length / 2;
        }
    }

    @Nullable
    private static isInside setMin(equals equals2, setMax setmax, getMax getmax, getMax getmax2) {
        int i;
        isInside isinside;
        isInside isinside2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        equals equals3 = equals2;
        setMax setmax2 = setmax;
        getMax getmax3 = getmax;
        getMax getmax4 = getmax2;
        if (equals3.length - equals3.setMax <= 0 || equals3.getMax - equals3.setMin <= 0) {
            return null;
        }
        int i8 = 1;
        int i9 = (((equals3.length - equals3.setMax) + (equals3.getMax - equals3.setMin)) + 1) / 2;
        getmax3.setMin[getmax3.getMax + 1] = equals3.setMax;
        getmax4.setMin[getmax4.getMax + 1] = equals3.length;
        int i10 = 0;
        while (i10 < i9) {
            boolean z = Math.abs((equals3.length - equals3.setMax) - (equals3.getMax - equals3.setMin)) % 2 == i8;
            int i11 = (equals3.length - equals3.setMax) - (equals3.getMax - equals3.setMin);
            int i12 = -i10;
            int i13 = i12;
            while (true) {
                if (i13 > i10) {
                    i = i9;
                    isinside = null;
                    break;
                }
                if (i13 == i12 || (i13 != i10 && getmax3.setMin[i13 + 1 + getmax3.getMax] > getmax3.setMin[(i13 - 1) + getmax3.getMax])) {
                    i6 = getmax3.setMin[i13 + 1 + getmax3.getMax];
                    i5 = i6;
                } else {
                    i6 = getmax3.setMin[(i13 - 1) + getmax3.getMax];
                    i5 = i6 + 1;
                }
                int i14 = (equals3.setMin + (i5 - equals3.setMax)) - i13;
                int i15 = (i10 == 0 || i5 != i6) ? i14 : i14 - 1;
                while (i5 < equals3.length && i14 < equals3.getMax && setmax2.length(i5, i14)) {
                    i5++;
                    i14++;
                }
                getmax3.setMin[getmax3.getMax + i13] = i5;
                if (!z || (i7 = i11 - i13) < i12 + 1 || i7 > i10 - 1) {
                    i = i9;
                } else {
                    i = i9;
                    if (getmax4.setMin[i7 + getmax4.getMax] <= i5) {
                        isinside = new isInside();
                        isinside.setMin = i6;
                        isinside.getMin = i15;
                        isinside.setMax = i5;
                        isinside.getMax = i14;
                        isinside.length = false;
                        break;
                    }
                }
                i13 += 2;
                i9 = i;
            }
            if (isinside != null) {
                return isinside;
            }
            boolean z2 = ((equals3.length - equals3.setMax) - (equals3.getMax - equals3.setMin)) % 2 == 0;
            int i16 = (equals3.length - equals3.setMax) - (equals3.getMax - equals3.setMin);
            int i17 = i12;
            while (true) {
                if (i17 > i10) {
                    isinside2 = null;
                    break;
                }
                if (i17 == i12 || (i17 != i10 && getmax4.setMin[i17 + 1 + getmax4.getMax] < getmax4.setMin[(i17 - 1) + getmax4.getMax])) {
                    i3 = getmax4.setMin[i17 + 1 + getmax4.getMax];
                    i2 = i3;
                } else {
                    i3 = getmax4.setMin[(i17 - 1) + getmax4.getMax];
                    i2 = i3 - 1;
                }
                int i18 = equals3.getMax - ((equals3.length - i2) - i17);
                int i19 = (i10 == 0 || i2 != i3) ? i18 : i18 + 1;
                while (i2 > equals3.setMax && i18 > equals3.setMin && setmax2.length(i2 - 1, i18 - 1)) {
                    i2--;
                    i18--;
                }
                getmax4.setMin[getmax4.getMax + i17] = i2;
                if (z2 && (i4 = i16 - i17) >= i12 && i4 <= i10 && getmax3.setMin[i4 + getmax3.getMax] >= i2) {
                    isinside2 = new isInside();
                    isinside2.setMin = i2;
                    isinside2.getMin = i18;
                    isinside2.setMax = i3;
                    isinside2.getMax = i19;
                    isinside2.length = true;
                    break;
                }
                i17 += 2;
            }
            if (isinside2 != null) {
                return isinside2;
            }
            i10++;
            i9 = i;
            i8 = 1;
        }
        return null;
    }
}
