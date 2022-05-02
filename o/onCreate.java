package o;

import java.util.Arrays;

public final class onCreate {
    public static String setMax = "Oscillator";
    public boolean IsOverlapping = false;
    public float[] getMax = new float[0];
    public double[] getMin;
    double isInside = 6.283185307179586d;
    public double[] length = new double[0];
    public int setMin;

    public final String toString() {
        StringBuilder sb = new StringBuilder("pos =");
        sb.append(Arrays.toString(this.length));
        sb.append(" period=");
        sb.append(Arrays.toString(this.getMax));
        return sb.toString();
    }

    public final void setMax(double d, float f) {
        int length2 = this.getMax.length + 1;
        int binarySearch = Arrays.binarySearch(this.length, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.length = Arrays.copyOf(this.length, length2);
        this.getMax = Arrays.copyOf(this.getMax, length2);
        this.getMin = new double[length2];
        double[] dArr = this.length;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length2 - binarySearch) - 1);
        this.length[binarySearch] = d;
        this.getMax[binarySearch] = f;
        this.IsOverlapping = false;
    }

    private double getMax(double d) {
        if (d < 0.0d) {
            d = 0.0d;
        } else if (d > 1.0d) {
            d = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.length, d);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch == 0) {
            return 0.0d;
        }
        int i = (-binarySearch) - 1;
        float[] fArr = this.getMax;
        int i2 = i - 1;
        double d2 = (double) (fArr[i] - fArr[i2]);
        double[] dArr = this.length;
        Double.isNaN(d2);
        double d3 = d2 / (dArr[i] - dArr[i2]);
        double d4 = this.getMin[i2];
        double d5 = (double) fArr[i2];
        Double.isNaN(d5);
        return d4 + ((d5 - (dArr[i2] * d3)) * (d - dArr[i2])) + ((d3 * ((d * d) - (dArr[i2] * dArr[i2]))) / 2.0d);
    }

    public final double getMin(double d) {
        double abs;
        switch (this.setMin) {
            case 1:
                return Math.signum(0.5d - (getMax(d) % 1.0d));
            case 2:
                abs = Math.abs((((getMax(d) * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((getMax(d) * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((getMax(d) * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.isInside * getMax(d));
            case 6:
                double abs2 = 1.0d - Math.abs(((getMax(d) * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            default:
                return Math.sin(this.isInside * getMax(d));
        }
        return 1.0d - abs;
    }

    private double setMax(double d) {
        if (d <= 0.0d) {
            d = 1.0E-5d;
        } else if (d >= 1.0d) {
            d = 0.999999d;
        }
        int binarySearch = Arrays.binarySearch(this.length, d);
        if (binarySearch > 0 || binarySearch == 0) {
            return 0.0d;
        }
        int i = (-binarySearch) - 1;
        float[] fArr = this.getMax;
        int i2 = i - 1;
        double d2 = (double) (fArr[i] - fArr[i2]);
        double[] dArr = this.length;
        Double.isNaN(d2);
        double d3 = d2 / (dArr[i] - dArr[i2]);
        double d4 = d * d3;
        double d5 = (double) fArr[i2];
        Double.isNaN(d5);
        return (d5 - (d3 * dArr[i2])) + d4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004f, code lost:
        return r10 * 2.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001f, code lost:
        return r0 * r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0031, code lost:
        return r5 * r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final double length(double r10) {
        /*
            r9 = this;
            int r0 = r9.setMin
            r1 = 4611686018427387904(0x4000000000000000, double:2.0)
            r3 = 4616189618054758400(0x4010000000000000, double:4.0)
            switch(r0) {
                case 1: goto L_0x006b;
                case 2: goto L_0x0055;
                case 3: goto L_0x0050;
                case 4: goto L_0x0048;
                case 5: goto L_0x0032;
                case 6: goto L_0x0020;
                default: goto L_0x0009;
            }
        L_0x0009:
            double r0 = r9.isInside
            double r2 = r9.setMax(r10)
            double r0 = r0 * r2
            double r2 = r9.isInside
            double r10 = r9.getMax(r10)
            double r2 = r2 * r10
            double r10 = java.lang.Math.cos(r2)
        L_0x001d:
            double r0 = r0 * r10
            return r0
        L_0x0020:
            double r5 = r9.setMax(r10)
            double r5 = r5 * r3
            double r10 = r9.getMax(r10)
            double r10 = r10 * r3
            double r10 = r10 + r1
            double r10 = r10 % r3
            double r10 = r10 - r1
        L_0x002f:
            double r5 = r5 * r10
            return r5
        L_0x0032:
            double r0 = r9.isInside
            double r0 = -r0
            double r2 = r9.setMax(r10)
            double r0 = r0 * r2
            double r2 = r9.isInside
            double r10 = r9.getMax(r10)
            double r2 = r2 * r10
            double r10 = java.lang.Math.sin(r2)
            goto L_0x001d
        L_0x0048:
            double r10 = r9.setMax(r10)
            double r10 = -r10
        L_0x004d:
            double r10 = r10 * r1
            return r10
        L_0x0050:
            double r10 = r9.setMax(r10)
            goto L_0x004d
        L_0x0055:
            double r5 = r9.setMax(r10)
            double r5 = r5 * r3
            double r10 = r9.getMax(r10)
            double r10 = r10 * r3
            r7 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r10 = r10 + r7
            double r10 = r10 % r3
            double r10 = r10 - r1
            double r10 = java.lang.Math.signum(r10)
            goto L_0x002f
        L_0x006b:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onCreate.length(double):double");
    }
}
