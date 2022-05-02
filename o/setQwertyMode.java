package o;

import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.h5.ZolozEkycH5Handler;
import java.util.ArrayList;
import java.util.List;
import o.setPositiveButtonIcon;
import o.startDispatchingItemsChanged;

public final class setQwertyMode implements startDispatchingItemsChanged.getMax {
    private setPositiveButtonIcon.length<getMax> IsOverlapping;
    Runnable getMax;
    public final ArrayList<getMax> getMin;
    public final ArrayList<getMax> length;
    final boolean setMax;
    final length setMin;
    public int toFloatRange;
    final startDispatchingItemsChanged toIntRange;

    public interface length {
        void getMax(int i, int i2);

        void getMax(getMax getmax);

        void getMin(int i, int i2);

        void length(int i, int i2);

        void length(int i, int i2, Object obj);

        RecyclerView.valueOf setMax(int i);

        void setMax(int i, int i2);

        void setMin(getMax getmax);
    }

    public setQwertyMode(length length2) {
        this(length2, (byte) 0);
    }

    private setQwertyMode(length length2, byte b) {
        this.IsOverlapping = new setPositiveButtonIcon.getMin(30);
        this.length = new ArrayList<>();
        this.getMin = new ArrayList<>();
        this.toFloatRange = 0;
        this.setMin = length2;
        this.setMax = false;
        this.toIntRange = new startDispatchingItemsChanged(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:183:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMin() {
        /*
            r16 = this;
            r0 = r16
            o.startDispatchingItemsChanged r1 = r0.toIntRange
            java.util.ArrayList<o.setQwertyMode$getMax> r2 = r0.length
        L_0x0006:
            int r3 = r2.size()
            r4 = 1
            int r3 = r3 - r4
            r6 = 0
        L_0x000d:
            r7 = 8
            r8 = -1
            if (r3 < 0) goto L_0x0023
            java.lang.Object r9 = r2.get(r3)
            o.setQwertyMode$getMax r9 = (o.setQwertyMode.getMax) r9
            int r9 = r9.setMax
            if (r9 != r7) goto L_0x001f
            if (r6 == 0) goto L_0x0020
            goto L_0x0024
        L_0x001f:
            r6 = 1
        L_0x0020:
            int r3 = r3 + -1
            goto L_0x000d
        L_0x0023:
            r3 = -1
        L_0x0024:
            r6 = 4
            r9 = 2
            r10 = 0
            if (r3 == r8) goto L_0x0206
            int r7 = r3 + 1
            java.lang.Object r11 = r2.get(r3)
            o.setQwertyMode$getMax r11 = (o.setQwertyMode.getMax) r11
            java.lang.Object r12 = r2.get(r7)
            o.setQwertyMode$getMax r12 = (o.setQwertyMode.getMax) r12
            int r13 = r12.setMax
            if (r13 == r4) goto L_0x01ce
            if (r13 == r9) goto L_0x00b2
            if (r13 == r6) goto L_0x0040
            goto L_0x0006
        L_0x0040:
            int r5 = r11.length
            int r8 = r12.getMin
            if (r5 >= r8) goto L_0x004c
            int r5 = r12.getMin
            int r5 = r5 - r4
            r12.getMin = r5
            goto L_0x0065
        L_0x004c:
            int r5 = r11.length
            int r8 = r12.getMin
            int r9 = r12.length
            int r8 = r8 + r9
            if (r5 >= r8) goto L_0x0065
            int r5 = r12.length
            int r5 = r5 - r4
            r12.length = r5
            o.startDispatchingItemsChanged$getMax r5 = r1.getMax
            int r8 = r11.getMin
            java.lang.Object r9 = r12.getMax
            o.setQwertyMode$getMax r5 = r5.setMin(r6, r8, r4, r9)
            goto L_0x0066
        L_0x0065:
            r5 = r10
        L_0x0066:
            int r8 = r11.getMin
            int r9 = r12.getMin
            if (r8 > r9) goto L_0x0072
            int r6 = r12.getMin
            int r6 = r6 + r4
            r12.getMin = r6
            goto L_0x0093
        L_0x0072:
            int r8 = r11.getMin
            int r9 = r12.getMin
            int r13 = r12.length
            int r9 = r9 + r13
            if (r8 >= r9) goto L_0x0093
            int r8 = r12.getMin
            int r9 = r12.length
            int r8 = r8 + r9
            int r9 = r11.getMin
            int r8 = r8 - r9
            o.startDispatchingItemsChanged$getMax r9 = r1.getMax
            int r10 = r11.getMin
            int r10 = r10 + r4
            java.lang.Object r4 = r12.getMax
            o.setQwertyMode$getMax r10 = r9.setMin(r6, r10, r8, r4)
            int r4 = r12.length
            int r4 = r4 - r8
            r12.length = r4
        L_0x0093:
            r2.set(r7, r11)
            int r4 = r12.length
            if (r4 <= 0) goto L_0x009e
            r2.set(r3, r12)
            goto L_0x00a6
        L_0x009e:
            r2.remove(r3)
            o.startDispatchingItemsChanged$getMax r4 = r1.getMax
            r4.setMin(r12)
        L_0x00a6:
            if (r5 == 0) goto L_0x00ab
            r2.add(r3, r5)
        L_0x00ab:
            if (r10 == 0) goto L_0x0006
            r2.add(r3, r10)
            goto L_0x0006
        L_0x00b2:
            int r6 = r11.getMin
            int r8 = r11.length
            if (r6 >= r8) goto L_0x00cc
            int r6 = r12.getMin
            int r8 = r11.getMin
            if (r6 != r8) goto L_0x00c9
            int r6 = r12.length
            int r8 = r11.length
            int r13 = r11.getMin
            int r8 = r8 - r13
            if (r6 != r8) goto L_0x00c9
            r5 = 1
            goto L_0x00ca
        L_0x00c9:
            r5 = 0
        L_0x00ca:
            r6 = 0
            goto L_0x00e0
        L_0x00cc:
            int r6 = r12.getMin
            int r8 = r11.length
            int r8 = r8 + r4
            if (r6 != r8) goto L_0x00de
            int r6 = r12.length
            int r8 = r11.getMin
            int r13 = r11.length
            int r8 = r8 - r13
            if (r6 != r8) goto L_0x00de
            r5 = 1
            goto L_0x00df
        L_0x00de:
            r5 = 0
        L_0x00df:
            r6 = 1
        L_0x00e0:
            int r8 = r11.length
            int r13 = r12.getMin
            if (r8 >= r13) goto L_0x00ec
            int r8 = r12.getMin
            int r8 = r8 - r4
            r12.getMin = r8
            goto L_0x010c
        L_0x00ec:
            int r8 = r11.length
            int r13 = r12.getMin
            int r14 = r12.length
            int r13 = r13 + r14
            if (r8 >= r13) goto L_0x010c
            int r3 = r12.length
            int r3 = r3 - r4
            r12.length = r3
            r11.setMax = r9
            r11.length = r4
            int r3 = r12.length
            if (r3 != 0) goto L_0x0006
            r2.remove(r7)
            o.startDispatchingItemsChanged$getMax r3 = r1.getMax
            r3.setMin(r12)
            goto L_0x0006
        L_0x010c:
            int r8 = r11.getMin
            int r13 = r12.getMin
            if (r8 > r13) goto L_0x0118
            int r8 = r12.getMin
            int r8 = r8 + r4
            r12.getMin = r8
            goto L_0x0139
        L_0x0118:
            int r8 = r11.getMin
            int r13 = r12.getMin
            int r14 = r12.length
            int r13 = r13 + r14
            if (r8 >= r13) goto L_0x0139
            int r8 = r12.getMin
            int r13 = r12.length
            int r8 = r8 + r13
            int r13 = r11.getMin
            int r8 = r8 - r13
            o.startDispatchingItemsChanged$getMax r13 = r1.getMax
            int r14 = r11.getMin
            int r14 = r14 + r4
            o.setQwertyMode$getMax r10 = r13.setMin(r9, r14, r8, r10)
            int r4 = r11.getMin
            int r8 = r12.getMin
            int r4 = r4 - r8
            r12.length = r4
        L_0x0139:
            if (r5 == 0) goto L_0x0148
            r2.set(r3, r12)
            r2.remove(r7)
            o.startDispatchingItemsChanged$getMax r3 = r1.getMax
            r3.setMin(r11)
            goto L_0x0006
        L_0x0148:
            if (r6 == 0) goto L_0x0181
            if (r10 == 0) goto L_0x0166
            int r4 = r11.getMin
            int r5 = r10.getMin
            if (r4 <= r5) goto L_0x0159
            int r4 = r11.getMin
            int r5 = r10.length
            int r4 = r4 - r5
            r11.getMin = r4
        L_0x0159:
            int r4 = r11.length
            int r5 = r10.getMin
            if (r4 <= r5) goto L_0x0166
            int r4 = r11.length
            int r5 = r10.length
            int r4 = r4 - r5
            r11.length = r4
        L_0x0166:
            int r4 = r11.getMin
            int r5 = r12.getMin
            if (r4 <= r5) goto L_0x0173
            int r4 = r11.getMin
            int r5 = r12.length
            int r4 = r4 - r5
            r11.getMin = r4
        L_0x0173:
            int r4 = r11.length
            int r5 = r12.getMin
            if (r4 <= r5) goto L_0x01b7
            int r4 = r11.length
            int r5 = r12.length
            int r4 = r4 - r5
            r11.length = r4
            goto L_0x01b7
        L_0x0181:
            if (r10 == 0) goto L_0x019d
            int r4 = r11.getMin
            int r5 = r10.getMin
            if (r4 < r5) goto L_0x0190
            int r4 = r11.getMin
            int r5 = r10.length
            int r4 = r4 - r5
            r11.getMin = r4
        L_0x0190:
            int r4 = r11.length
            int r5 = r10.getMin
            if (r4 < r5) goto L_0x019d
            int r4 = r11.length
            int r5 = r10.length
            int r4 = r4 - r5
            r11.length = r4
        L_0x019d:
            int r4 = r11.getMin
            int r5 = r12.getMin
            if (r4 < r5) goto L_0x01aa
            int r4 = r11.getMin
            int r5 = r12.length
            int r4 = r4 - r5
            r11.getMin = r4
        L_0x01aa:
            int r4 = r11.length
            int r5 = r12.getMin
            if (r4 < r5) goto L_0x01b7
            int r4 = r11.length
            int r5 = r12.length
            int r4 = r4 - r5
            r11.length = r4
        L_0x01b7:
            r2.set(r3, r12)
            int r4 = r11.getMin
            int r5 = r11.length
            if (r4 == r5) goto L_0x01c4
            r2.set(r7, r11)
            goto L_0x01c7
        L_0x01c4:
            r2.remove(r7)
        L_0x01c7:
            if (r10 == 0) goto L_0x0006
            r2.add(r3, r10)
            goto L_0x0006
        L_0x01ce:
            int r4 = r11.length
            int r6 = r12.getMin
            if (r4 >= r6) goto L_0x01d6
            r5 = -1
            goto L_0x01d7
        L_0x01d6:
            r5 = 0
        L_0x01d7:
            int r4 = r11.getMin
            int r6 = r12.getMin
            if (r4 >= r6) goto L_0x01df
            int r5 = r5 + 1
        L_0x01df:
            int r4 = r12.getMin
            int r6 = r11.getMin
            if (r4 > r6) goto L_0x01ec
            int r4 = r11.getMin
            int r6 = r12.length
            int r4 = r4 + r6
            r11.getMin = r4
        L_0x01ec:
            int r4 = r12.getMin
            int r6 = r11.length
            if (r4 > r6) goto L_0x01f9
            int r4 = r11.length
            int r6 = r12.length
            int r4 = r4 + r6
            r11.length = r4
        L_0x01f9:
            int r4 = r12.getMin
            int r4 = r4 + r5
            r12.getMin = r4
            r2.set(r3, r12)
            r2.set(r7, r11)
            goto L_0x0006
        L_0x0206:
            java.util.ArrayList<o.setQwertyMode$getMax> r1 = r0.length
            int r1 = r1.size()
            r2 = 0
        L_0x020d:
            if (r2 >= r1) goto L_0x02f3
            java.util.ArrayList<o.setQwertyMode$getMax> r3 = r0.length
            java.lang.Object r3 = r3.get(r2)
            o.setQwertyMode$getMax r3 = (o.setQwertyMode.getMax) r3
            int r11 = r3.setMax
            if (r11 == r4) goto L_0x02e5
            if (r11 == r9) goto L_0x0286
            if (r11 == r6) goto L_0x0228
            if (r11 == r7) goto L_0x0223
            goto L_0x02e8
        L_0x0223:
            r0.setMax((o.setQwertyMode.getMax) r3)
            goto L_0x02e8
        L_0x0228:
            int r11 = r3.getMin
            int r12 = r3.getMin
            int r13 = r3.length
            int r12 = r12 + r13
            int r13 = r3.getMin
            r14 = 0
            r15 = -1
        L_0x0233:
            if (r13 >= r12) goto L_0x0265
            o.setQwertyMode$length r5 = r0.setMin
            androidx.recyclerview.widget.RecyclerView$valueOf r5 = r5.setMax(r13)
            if (r5 != 0) goto L_0x0253
            boolean r5 = r0.setMax((int) r13)
            if (r5 == 0) goto L_0x0244
            goto L_0x0253
        L_0x0244:
            if (r15 != r4) goto L_0x0251
            java.lang.Object r5 = r3.getMax
            o.setQwertyMode$getMax r5 = r0.setMin(r6, r11, r14, r5)
            r0.setMax((o.setQwertyMode.getMax) r5)
            r11 = r13
            r14 = 0
        L_0x0251:
            r15 = 0
            goto L_0x0261
        L_0x0253:
            if (r15 != 0) goto L_0x0260
            java.lang.Object r5 = r3.getMax
            o.setQwertyMode$getMax r5 = r0.setMin(r6, r11, r14, r5)
            r0.getMin(r5)
            r11 = r13
            r14 = 0
        L_0x0260:
            r15 = 1
        L_0x0261:
            int r14 = r14 + r4
            int r13 = r13 + 1
            goto L_0x0233
        L_0x0265:
            int r5 = r3.length
            if (r14 == r5) goto L_0x027a
            java.lang.Object r5 = r3.getMax
            boolean r12 = r0.setMax
            if (r12 != 0) goto L_0x0276
            r3.getMax = r10
            o.setPositiveButtonIcon$length<o.setQwertyMode$getMax> r12 = r0.IsOverlapping
            r12.getMin(r3)
        L_0x0276:
            o.setQwertyMode$getMax r3 = r0.setMin(r6, r11, r14, r5)
        L_0x027a:
            if (r15 != 0) goto L_0x0281
            r0.getMin(r3)
            goto L_0x02e8
        L_0x0281:
            r0.setMax((o.setQwertyMode.getMax) r3)
            goto L_0x02e8
        L_0x0286:
            int r5 = r3.getMin
            int r11 = r3.getMin
            int r12 = r3.length
            int r11 = r11 + r12
            int r12 = r3.getMin
            r13 = 0
            r14 = -1
        L_0x0291:
            if (r12 >= r11) goto L_0x02c8
            o.setQwertyMode$length r15 = r0.setMin
            androidx.recyclerview.widget.RecyclerView$valueOf r15 = r15.setMax(r12)
            if (r15 != 0) goto L_0x02b0
            boolean r15 = r0.setMax((int) r12)
            if (r15 == 0) goto L_0x02a2
            goto L_0x02b0
        L_0x02a2:
            if (r14 != r4) goto L_0x02ad
            o.setQwertyMode$getMax r14 = r0.setMin(r9, r5, r13, r10)
            r0.setMax((o.setQwertyMode.getMax) r14)
            r14 = 1
            goto L_0x02ae
        L_0x02ad:
            r14 = 0
        L_0x02ae:
            r15 = 0
            goto L_0x02bd
        L_0x02b0:
            if (r14 != 0) goto L_0x02bb
            o.setQwertyMode$getMax r14 = r0.setMin(r9, r5, r13, r10)
            r0.getMin(r14)
            r14 = 1
            goto L_0x02bc
        L_0x02bb:
            r14 = 0
        L_0x02bc:
            r15 = 1
        L_0x02bd:
            if (r14 == 0) goto L_0x02c3
            int r12 = r12 - r13
            int r11 = r11 - r13
            r13 = 1
            goto L_0x02c5
        L_0x02c3:
            int r13 = r13 + 1
        L_0x02c5:
            int r12 = r12 + r4
            r14 = r15
            goto L_0x0291
        L_0x02c8:
            int r11 = r3.length
            if (r13 == r11) goto L_0x02db
            boolean r11 = r0.setMax
            if (r11 != 0) goto L_0x02d7
            r3.getMax = r10
            o.setPositiveButtonIcon$length<o.setQwertyMode$getMax> r11 = r0.IsOverlapping
            r11.getMin(r3)
        L_0x02d7:
            o.setQwertyMode$getMax r3 = r0.setMin(r9, r5, r13, r10)
        L_0x02db:
            if (r14 != 0) goto L_0x02e1
            r0.getMin(r3)
            goto L_0x02e8
        L_0x02e1:
            r0.setMax((o.setQwertyMode.getMax) r3)
            goto L_0x02e8
        L_0x02e5:
            r0.setMax((o.setQwertyMode.getMax) r3)
        L_0x02e8:
            java.lang.Runnable r3 = r0.getMax
            if (r3 == 0) goto L_0x02ef
            r3.run()
        L_0x02ef:
            int r2 = r2 + 1
            goto L_0x020d
        L_0x02f3:
            java.util.ArrayList<o.setQwertyMode$getMax> r1 = r0.length
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setQwertyMode.setMin():void");
    }

    public final void length() {
        int size = this.getMin.size();
        for (int i = 0; i < size; i++) {
            this.setMin.getMax(this.getMin.get(i));
        }
        getMax((List<getMax>) this.getMin);
        this.toFloatRange = 0;
    }

    private void getMin(getMax getmax) {
        int i;
        if (getmax.setMax == 1 || getmax.setMax == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int max = getMax(getmax.getMin, getmax.setMax);
        int i2 = getmax.getMin;
        int i3 = getmax.setMax;
        if (i3 == 2) {
            i = 0;
        } else if (i3 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update.".concat(String.valueOf(getmax)));
        }
        int i4 = 1;
        for (int i5 = 1; i5 < getmax.length; i5++) {
            int max2 = getMax(getmax.getMin + (i * i5), getmax.setMax);
            int i6 = getmax.setMax;
            if (i6 == 2 ? max2 == max : i6 == 4 && max2 == max + 1) {
                i4++;
            } else {
                getMax min = setMin(getmax.setMax, max, i4, getmax.getMax);
                getMax(min, i2);
                if (!this.setMax) {
                    min.getMax = null;
                    this.IsOverlapping.getMin(min);
                }
                if (getmax.setMax == 4) {
                    i2 += i4;
                }
                max = max2;
                i4 = 1;
            }
        }
        Object obj = getmax.getMax;
        if (!this.setMax) {
            getmax.getMax = null;
            this.IsOverlapping.getMin(getmax);
        }
        if (i4 > 0) {
            getMax min2 = setMin(getmax.setMax, max, i4, obj);
            getMax(min2, i2);
            if (!this.setMax) {
                min2.getMax = null;
                this.IsOverlapping.getMin(min2);
            }
        }
    }

    private void getMax(getMax getmax, int i) {
        this.setMin.setMin(getmax);
        int i2 = getmax.setMax;
        if (i2 == 2) {
            this.setMin.getMax(i, getmax.length);
        } else if (i2 == 4) {
            this.setMin.length(i, getmax.length, getmax.getMax);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    private int getMax(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.getMin.size() - 1; size >= 0; size--) {
            getMax getmax = this.getMin.get(size);
            if (getmax.setMax == 8) {
                if (getmax.getMin < getmax.length) {
                    i4 = getmax.getMin;
                    i3 = getmax.length;
                } else {
                    i4 = getmax.length;
                    i3 = getmax.getMin;
                }
                if (i < i4 || i > i3) {
                    if (i < getmax.getMin) {
                        if (i2 == 1) {
                            getmax.getMin++;
                            getmax.length++;
                        } else if (i2 == 2) {
                            getmax.getMin--;
                            getmax.length--;
                        }
                    }
                } else if (i4 == getmax.getMin) {
                    if (i2 == 1) {
                        getmax.length++;
                    } else if (i2 == 2) {
                        getmax.length--;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        getmax.getMin++;
                    } else if (i2 == 2) {
                        getmax.getMin--;
                    }
                    i--;
                }
            } else if (getmax.getMin <= i) {
                if (getmax.setMax == 1) {
                    i -= getmax.length;
                } else if (getmax.setMax == 2) {
                    i += getmax.length;
                }
            } else if (i2 == 1) {
                getmax.getMin++;
            } else if (i2 == 2) {
                getmax.getMin--;
            }
        }
        for (int size2 = this.getMin.size() - 1; size2 >= 0; size2--) {
            getMax getmax2 = this.getMin.get(size2);
            if (getmax2.setMax == 8) {
                if (getmax2.length == getmax2.getMin || getmax2.length < 0) {
                    this.getMin.remove(size2);
                    if (!this.setMax) {
                        getmax2.getMax = null;
                        this.IsOverlapping.getMin(getmax2);
                    }
                }
            } else if (getmax2.length <= 0) {
                this.getMin.remove(size2);
                if (!this.setMax) {
                    getmax2.getMax = null;
                    this.IsOverlapping.getMin(getmax2);
                }
            }
        }
        return i;
    }

    private boolean setMax(int i) {
        int size = this.getMin.size();
        for (int i2 = 0; i2 < size; i2++) {
            getMax getmax = this.getMin.get(i2);
            if (getmax.setMax == 8) {
                if (getMin(getmax.length, i2 + 1) == i) {
                    return true;
                }
            } else if (getmax.setMax == 1) {
                int i3 = getmax.getMin + getmax.length;
                for (int i4 = getmax.getMin; i4 < i3; i4++) {
                    if (getMin(i4, i2 + 1) == i) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private void setMax(getMax getmax) {
        this.getMin.add(getmax);
        int i = getmax.setMax;
        if (i == 1) {
            this.setMin.setMax(getmax.getMin, getmax.length);
        } else if (i == 2) {
            this.setMin.length(getmax.getMin, getmax.length);
        } else if (i == 4) {
            this.setMin.length(getmax.getMin, getmax.length, getmax.getMax);
        } else if (i == 8) {
            this.setMin.getMin(getmax.getMin, getmax.length);
        } else {
            throw new IllegalArgumentException("Unknown update op type for ".concat(String.valueOf(getmax)));
        }
    }

    public final boolean getMin() {
        return this.length.size() > 0;
    }

    public final boolean length(int i) {
        return (i & this.toFloatRange) != 0;
    }

    public final int getMax(int i) {
        return getMin(i, 0);
    }

    public final int getMin(int i, int i2) {
        int size = this.getMin.size();
        while (i2 < size) {
            getMax getmax = this.getMin.get(i2);
            if (getmax.setMax == 8) {
                if (getmax.getMin == i) {
                    i = getmax.length;
                } else {
                    if (getmax.getMin < i) {
                        i--;
                    }
                    if (getmax.length <= i) {
                        i++;
                    }
                }
            } else if (getmax.getMin > i) {
                continue;
            } else if (getmax.setMax == 2) {
                if (i < getmax.getMin + getmax.length) {
                    return -1;
                }
                i -= getmax.length;
            } else if (getmax.setMax == 1) {
                i += getmax.length;
            }
            i2++;
        }
        return i;
    }

    public final boolean setMax(int i, int i2, Object obj) {
        if (i2 <= 0) {
            return false;
        }
        this.length.add(setMin(4, i, i2, obj));
        this.toFloatRange |= 4;
        if (this.length.size() == 1) {
            return true;
        }
        return false;
    }

    public final boolean setMin(int i, int i2) {
        if (i2 <= 0) {
            return false;
        }
        this.length.add(setMin(1, i, i2, (Object) null));
        this.toFloatRange |= 1;
        return this.length.size() == 1;
    }

    public final boolean length(int i, int i2) {
        if (i2 <= 0) {
            return false;
        }
        this.length.add(setMin(2, i, i2, (Object) null));
        this.toFloatRange |= 2;
        if (this.length.size() == 1) {
            return true;
        }
        return false;
    }

    public final boolean getMax(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.length.add(setMin(8, i, i2, (Object) null));
            this.toFloatRange |= 8;
            return this.length.size() == 1;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    public final void setMax() {
        length();
        int size = this.length.size();
        for (int i = 0; i < size; i++) {
            getMax getmax = this.length.get(i);
            int i2 = getmax.setMax;
            if (i2 == 1) {
                this.setMin.getMax(getmax);
                this.setMin.setMax(getmax.getMin, getmax.length);
            } else if (i2 == 2) {
                this.setMin.getMax(getmax);
                this.setMin.getMax(getmax.getMin, getmax.length);
            } else if (i2 == 4) {
                this.setMin.getMax(getmax);
                this.setMin.length(getmax.getMin, getmax.length, getmax.getMax);
            } else if (i2 == 8) {
                this.setMin.getMax(getmax);
                this.setMin.getMin(getmax.getMin, getmax.length);
            }
            Runnable runnable = this.getMax;
            if (runnable != null) {
                runnable.run();
            }
        }
        getMax((List<getMax>) this.length);
        this.toFloatRange = 0;
    }

    public final boolean getMax() {
        return !this.getMin.isEmpty() && !this.length.isEmpty();
    }

    public static final class getMax {
        public Object getMax;
        public int getMin;
        public int length;
        public int setMax;

        getMax(int i, int i2, int i3, Object obj) {
            this.setMax = i;
            this.getMin = i2;
            this.length = i3;
            this.getMax = obj;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.setMax;
            sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : ZolozEkycH5Handler.HUMMER_FOUNDATION_ADD);
            sb.append(",s:");
            sb.append(this.getMin);
            sb.append("c:");
            sb.append(this.length);
            sb.append(",p:");
            sb.append(this.getMax);
            sb.append("]");
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof getMax)) {
                return false;
            }
            getMax getmax = (getMax) obj;
            int i = this.setMax;
            if (i != getmax.setMax) {
                return false;
            }
            if (i == 8 && Math.abs(this.length - this.getMin) == 1 && this.length == getmax.getMin && this.getMin == getmax.length) {
                return true;
            }
            if (this.length != getmax.length || this.getMin != getmax.getMin) {
                return false;
            }
            Object obj2 = this.getMax;
            if (obj2 != null) {
                if (!obj2.equals(getmax.getMax)) {
                    return false;
                }
            } else if (getmax.getMax != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((this.setMax * 31) + this.getMin) * 31) + this.length;
        }
    }

    public final getMax setMin(int i, int i2, int i3, Object obj) {
        getMax max = this.IsOverlapping.getMax();
        if (max == null) {
            return new getMax(i, i2, i3, obj);
        }
        max.setMax = i;
        max.getMin = i2;
        max.length = i3;
        max.getMax = obj;
        return max;
    }

    public final void setMin(getMax getmax) {
        if (!this.setMax) {
            getmax.getMax = null;
            this.IsOverlapping.getMin(getmax);
        }
    }

    public final void getMax(List<getMax> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            getMax getmax = list.get(i);
            if (!this.setMax) {
                getmax.getMax = null;
                this.IsOverlapping.getMin(getmax);
            }
        }
        list.clear();
    }
}
