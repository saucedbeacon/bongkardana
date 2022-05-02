package o;

import Catalano.Imaging.FastBitmap;

public final class toIntRange {
    public IsOverlapping getMax;
    public IsOverlapping getMin;
    public IsOverlapping length;
    public IsOverlapping setMax;
    private int setMin;

    public toIntRange(FastBitmap fastBitmap) {
        this(fastBitmap, (byte) 0);
    }

    private toIntRange(FastBitmap fastBitmap, byte b) {
        int width = fastBitmap.length.getWidth();
        int height = fastBitmap.length.getHeight();
        this.setMin = 0;
        this.length = null;
        this.getMax = null;
        this.setMax = null;
        this.getMin = null;
        if (fastBitmap.getMin()) {
            int[] iArr = new int[256];
            for (int i = 0; i < height; i++) {
                for (int i2 = 0; i2 < width; i2++) {
                    int i3 = ((fastBitmap.setMax[(fastBitmap.getMin * i) + (fastBitmap.getMax * i2)] & 255) * 256) / 256;
                    iArr[i3] = iArr[i3] + 1;
                    this.setMin++;
                }
            }
            this.length = new IsOverlapping(iArr);
        } else if (fastBitmap.getMax()) {
            int[] iArr2 = new int[256];
            int[] iArr3 = new int[256];
            int[] iArr4 = new int[256];
            for (int i4 = 0; i4 < height; i4++) {
                for (int i5 = 0; i5 < width; i5++) {
                    int i6 = (((fastBitmap.setMax[(fastBitmap.getMin * i4) + (fastBitmap.getMax * i5)] >> 16) & 255) * 256) / 256;
                    iArr2[i6] = iArr2[i6] + 1;
                    int i7 = (((fastBitmap.setMax[(fastBitmap.getMin * i4) + (fastBitmap.getMax * i5)] >> 8) & 255) * 256) / 256;
                    iArr3[i7] = iArr3[i7] + 1;
                    int i8 = ((fastBitmap.setMax[(fastBitmap.getMin * i4) + (fastBitmap.getMax * i5)] & 255) * 256) / 256;
                    iArr4[i8] = iArr4[i8] + 1;
                    this.setMin++;
                }
            }
            this.getMin = new IsOverlapping(iArr2);
            this.setMax = new IsOverlapping(iArr3);
            this.getMax = new IsOverlapping(iArr4);
        }
    }
}
