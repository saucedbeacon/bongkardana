package o;

public final class IsOverlapping {
    private int IsOverlapping;
    private double equals = 0.0d;
    private double getMax = 0.0d;
    public int[] getMin;
    private int isInside = 0;
    private double length = 0.0d;
    private double setMax = 0.0d;
    private double setMin = 0.0d;
    private long toFloatRange;

    public IsOverlapping(int[] iArr) {
        this.getMin = iArr;
        length();
    }

    private void length() {
        int[] iArr;
        double d;
        double d2;
        double d3;
        this.toFloatRange = 0;
        int i = 0;
        while (true) {
            iArr = this.getMin;
            if (i >= iArr.length) {
                break;
            }
            this.toFloatRange += (long) iArr[i];
            i++;
        }
        int length2 = iArr.length;
        long j = 0;
        double d4 = 0.0d;
        for (int i2 = 0; i2 < length2; i2++) {
            int i3 = iArr[i2];
            double d5 = (double) (i2 * i3);
            Double.isNaN(d5);
            d4 += d5;
            j += (long) i3;
        }
        if (j == 0) {
            d = 0.0d;
        } else {
            double d6 = (double) j;
            Double.isNaN(d6);
            d = d4 / d6;
        }
        this.length = d;
        int[] iArr2 = this.getMin;
        int length3 = iArr2.length;
        int i4 = 0;
        double d7 = 0.0d;
        for (int i5 = 0; i5 < length3; i5++) {
            int i6 = iArr2[i5];
            double d8 = (double) i5;
            Double.isNaN(d8);
            double d9 = d8 - d;
            double d10 = (double) i6;
            Double.isNaN(d10);
            d7 += d9 * d9 * d10;
            i4 += i6;
        }
        if (i4 == 0) {
            d2 = 0.0d;
        } else {
            double d11 = (double) (i4 - 1);
            Double.isNaN(d11);
            d2 = Math.sqrt(d7 / d11);
        }
        this.setMax = d2;
        int[] iArr3 = this.getMin;
        double d12 = this.length;
        double d13 = 0.0d;
        for (int i7 : iArr3) {
            double d14 = (double) i7;
            Double.isNaN(d14);
            d13 += d14;
        }
        double d15 = (d13 + 1.0d) * d13;
        int[] iArr4 = iArr3;
        double d16 = d13 - 1.0d;
        double d17 = d13 - 2.0d;
        double d18 = d13 - 3.0d;
        double d19 = d15 / ((d16 * d17) * d18);
        int i8 = 0;
        double d20 = 0.0d;
        while (i8 < iArr4.length) {
            double d21 = (double) i8;
            Double.isNaN(d21);
            double d22 = d2;
            double pow = Math.pow((d21 - d12) / d2, 4.0d);
            double d23 = (double) iArr4[i8];
            Double.isNaN(d23);
            d20 += pow * d23;
            i8++;
            d2 = d22;
        }
        this.setMin = (d19 * d20) - ((Math.pow(d16, 2.0d) * 3.0d) / (d17 * d18));
        int[] iArr5 = this.getMin;
        double d24 = this.length;
        double d25 = this.setMax;
        double d26 = 0.0d;
        for (int i9 : iArr5) {
            double d27 = (double) i9;
            Double.isNaN(d27);
            d26 += d27;
        }
        double d28 = (d26 / (d26 - 1.0d)) * (d26 - 2.0d);
        double d29 = 0.0d;
        for (int i10 = 0; i10 < iArr5.length; i10++) {
            double d30 = (double) i10;
            Double.isNaN(d30);
            double pow2 = Math.pow((d30 - d24) / d25, 3.0d);
            double d31 = (double) iArr5[i10];
            Double.isNaN(d31);
            d29 += pow2 * d31;
        }
        this.equals = d28 * d29;
        int[] iArr6 = this.getMin;
        int i11 = 0;
        for (int i12 : iArr6) {
            i11 += i12;
        }
        int i13 = i11 / 2;
        int i14 = 0;
        int i15 = 0;
        while (i14 < r2) {
            i15 += iArr6[i14];
            if (i15 >= i13) {
                break;
            }
            i14++;
        }
        this.isInside = i14;
        int[] iArr7 = this.getMin;
        int length4 = iArr7.length;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < length4; i18++) {
            if (iArr7[i18] > i17) {
                i17 = iArr7[i18];
                i16 = i18;
            }
        }
        this.IsOverlapping = i16;
        int[] iArr8 = this.getMin;
        int i19 = 0;
        for (int i20 : iArr8) {
            i19 += i20;
        }
        if (i19 != 0) {
            double d32 = 0.0d;
            for (int i21 : iArr8) {
                double d33 = (double) i21;
                double d34 = (double) i19;
                Double.isNaN(d33);
                Double.isNaN(d34);
                double d35 = d33 / d34;
                if (d35 != 0.0d) {
                    d32 += (-d35) * (Math.log10(d35) / Math.log10(2.0d));
                }
            }
            d3 = d32;
        } else {
            d3 = 0.0d;
        }
        this.getMax = d3;
    }
}
