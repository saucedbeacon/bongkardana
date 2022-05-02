package o;

public final class ZimInitGwResponsePB {
    private static boolean getMax(long j) {
        return (j & 9218868437227405312L) == 0;
    }

    public static int getMin(double d) {
        int i = (int) d;
        if (((double) i) == d) {
            return i;
        }
        long doubleToLongBits = Double.doubleToLongBits(d);
        int i2 = getMax(doubleToLongBits) ? -1074 : ((int) ((9218868437227405312L & doubleToLongBits) >> 52)) - 1075;
        if (i2 <= -53 || i2 > 31) {
            return 0;
        }
        long j = 4503599627370495L & doubleToLongBits;
        if (!getMax(doubleToLongBits)) {
            j += 4503599627370496L;
        }
        return ((doubleToLongBits & Long.MIN_VALUE) == 0 ? 1 : -1) * ((int) (i2 < 0 ? j >> (-i2) : j << i2));
    }
}
