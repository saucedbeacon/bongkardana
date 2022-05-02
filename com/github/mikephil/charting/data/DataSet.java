package com.github.mikephil.charting.data;

import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;
import o.updateDrawerState;

public abstract class DataSet<T extends Entry> extends updateDrawerState<T> {
    protected List<T> FastBitmap$CoordinateSystem = null;
    protected float Grayscale$Algorithm = Float.MAX_VALUE;
    protected float Mean$Arithmetic = -3.4028235E38f;
    protected float invoke = Float.MAX_VALUE;
    protected float invokeSuspend = -3.4028235E38f;

    public enum Rounding {
        UP,
        DOWN,
        CLOSEST
    }

    public DataSet(List<T> list, String str) {
        super(str);
        this.FastBitmap$CoordinateSystem = list;
        if (list == null) {
            this.FastBitmap$CoordinateSystem = new ArrayList();
        }
        extraCallback();
    }

    private void extraCallback() {
        List<T> list = this.FastBitmap$CoordinateSystem;
        if (list != null && !list.isEmpty()) {
            this.invokeSuspend = -3.4028235E38f;
            this.invoke = Float.MAX_VALUE;
            this.Mean$Arithmetic = -3.4028235E38f;
            this.Grayscale$Algorithm = Float.MAX_VALUE;
            for (T length : this.FastBitmap$CoordinateSystem) {
                length(length);
            }
        }
    }

    public final void setMax(float f, float f2) {
        List<T> list = this.FastBitmap$CoordinateSystem;
        if (list != null && !list.isEmpty()) {
            this.invokeSuspend = -3.4028235E38f;
            this.invoke = Float.MAX_VALUE;
            int min = setMin(f2, Float.NaN, Rounding.UP);
            for (int min2 = setMin(f, Float.NaN, Rounding.DOWN); min2 <= min; min2++) {
                setMin((Entry) this.FastBitmap$CoordinateSystem.get(min2));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void setMin(T t) {
        if (t.getMin() < this.invoke) {
            this.invoke = t.getMin();
        }
        if (t.getMin() > this.invokeSuspend) {
            this.invokeSuspend = t.getMin();
        }
    }

    public final int ICustomTabsCallback() {
        return this.FastBitmap$CoordinateSystem.size();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuilder sb = new StringBuilder("DataSet, label: ");
        sb.append(isInside() == null ? "" : isInside());
        sb.append(", entries: ");
        sb.append(this.FastBitmap$CoordinateSystem.size());
        sb.append("\n");
        stringBuffer2.append(sb.toString());
        stringBuffer.append(stringBuffer2.toString());
        for (int i = 0; i < this.FastBitmap$CoordinateSystem.size(); i++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(((Entry) this.FastBitmap$CoordinateSystem.get(i)).toString());
            sb2.append(" ");
            stringBuffer.append(sb2.toString());
        }
        return stringBuffer.toString();
    }

    public final float onRelationshipValidationResult() {
        return this.invoke;
    }

    public final float onPostMessage() {
        return this.invokeSuspend;
    }

    public final float extraCallbackWithResult() {
        return this.Grayscale$Algorithm;
    }

    public final float onMessageChannelReady() {
        return this.Mean$Arithmetic;
    }

    public final int getMin(Entry entry) {
        return this.FastBitmap$CoordinateSystem.indexOf(entry);
    }

    public final T getMin(float f, Rounding rounding) {
        int min = setMin(f, Float.NaN, rounding);
        if (min >= 0) {
            return (Entry) this.FastBitmap$CoordinateSystem.get(min);
        }
        return null;
    }

    public final T length(float f, float f2) {
        int min = setMin(f, f2, Rounding.CLOSEST);
        if (min >= 0) {
            return (Entry) this.FastBitmap$CoordinateSystem.get(min);
        }
        return null;
    }

    public final T toIntRange(int i) {
        return (Entry) this.FastBitmap$CoordinateSystem.get(i);
    }

    private int setMin(float f, float f2, Rounding rounding) {
        int i;
        Entry entry;
        List<T> list = this.FastBitmap$CoordinateSystem;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int i2 = 0;
        int size = this.FastBitmap$CoordinateSystem.size() - 1;
        while (i2 < size) {
            int i3 = (i2 + size) / 2;
            float length = ((Entry) this.FastBitmap$CoordinateSystem.get(i3)).length() - f;
            int i4 = i3 + 1;
            float abs = Math.abs(length);
            float abs2 = Math.abs(((Entry) this.FastBitmap$CoordinateSystem.get(i4)).length() - f);
            if (abs2 >= abs) {
                if (abs >= abs2) {
                    double d = (double) length;
                    if (d < 0.0d) {
                        if (d >= 0.0d) {
                        }
                    }
                }
                size = i3;
            }
            i2 = i4;
        }
        if (size == -1) {
            return size;
        }
        float length2 = ((Entry) this.FastBitmap$CoordinateSystem.get(size)).length();
        if (rounding == Rounding.UP) {
            if (length2 < f && size < this.FastBitmap$CoordinateSystem.size() - 1) {
                size++;
            }
        } else if (rounding == Rounding.DOWN && length2 > f && size > 0) {
            size--;
        }
        if (Float.isNaN(f2)) {
            return size;
        }
        while (size > 0 && ((Entry) this.FastBitmap$CoordinateSystem.get(size - 1)).length() == length2) {
            size--;
        }
        float min = ((Entry) this.FastBitmap$CoordinateSystem.get(size)).getMin();
        loop2:
        while (true) {
            i = size;
            do {
                size++;
                if (size >= this.FastBitmap$CoordinateSystem.size()) {
                    break loop2;
                }
                entry = (Entry) this.FastBitmap$CoordinateSystem.get(size);
                if (entry.length() != length2) {
                    break loop2;
                }
            } while (Math.abs(entry.getMin() - f2) >= Math.abs(min - f2));
            min = f2;
        }
        return i;
    }

    public final List<T> setMin(float f) {
        ArrayList arrayList = new ArrayList();
        int size = this.FastBitmap$CoordinateSystem.size() - 1;
        int i = 0;
        while (true) {
            if (i > size) {
                break;
            }
            int i2 = (size + i) / 2;
            Entry entry = (Entry) this.FastBitmap$CoordinateSystem.get(i2);
            if (f == entry.length()) {
                while (i2 > 0 && ((Entry) this.FastBitmap$CoordinateSystem.get(i2 - 1)).length() == f) {
                    i2--;
                }
                int size2 = this.FastBitmap$CoordinateSystem.size();
                while (i2 < size2) {
                    Entry entry2 = (Entry) this.FastBitmap$CoordinateSystem.get(i2);
                    if (entry2.length() != f) {
                        break;
                    }
                    arrayList.add(entry2);
                    i2++;
                }
            } else if (f > entry.length()) {
                i = i2 + 1;
            } else {
                size = i2 - 1;
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public void length(T t) {
        if (t != null) {
            if (t.length() < this.Grayscale$Algorithm) {
                this.Grayscale$Algorithm = t.length();
            }
            if (t.length() > this.Mean$Arithmetic) {
                this.Mean$Arithmetic = t.length();
            }
            setMin(t);
        }
    }
}
