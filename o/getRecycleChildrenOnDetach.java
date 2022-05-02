package o;

import android.graphics.Rect;

public final class getRecycleChildrenOnDetach {
    public boolean equals;
    isAutoMeasureEnabled getMax;
    Rect getMin;
    int length;
    int setMax;
    int setMin = 1;

    public getRecycleChildrenOnDetach(byte[] bArr, int i, int i2, int i3, int i4) {
        this.getMax = new isAutoMeasureEnabled(bArr, i, i2);
        this.setMax = i4;
        this.length = i3;
        if (i * i2 > bArr.length) {
            StringBuilder sb = new StringBuilder("Image data does not match the resolution. ");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            sb.append(" > ");
            sb.append(bArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
