package o;

public final class warn {
    final int[] getMax = new int[10];
    int setMax;

    /* access modifiers changed from: package-private */
    public final warn setMax(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.getMax;
            if (i < iArr.length) {
                this.setMax = (1 << i) | this.setMax;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public final boolean getMin(int i) {
        return ((1 << i) & this.setMax) != 0;
    }
}
