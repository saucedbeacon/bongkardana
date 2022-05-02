package o;

public final class getContentPaddingLeft {
    final int[] setMax = new int[10];
    int setMin;

    /* access modifiers changed from: package-private */
    public final getContentPaddingLeft length(int i, int i2) {
        int[] iArr = this.setMax;
        if (i >= iArr.length) {
            return this;
        }
        this.setMin = (1 << i) | this.setMin;
        iArr[i] = i2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final boolean getMax(int i) {
        return ((1 << i) & this.setMin) != 0;
    }
}
