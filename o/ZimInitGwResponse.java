package o;

public class ZimInitGwResponse {
    static final /* synthetic */ boolean getMin = (!ZimInitGwResponse.class.desiredAssertionStatus());

    private static boolean setMax(long j) {
        return (j & 9218868437227405312L) == 9218868437227405312L;
    }

    private static boolean setMin(long j) {
        return (j & 9218868437227405312L) == 0;
    }

    static validateStandard getMin(long j) {
        long j2 = 4503599627370495L & j;
        if (!setMin(j)) {
            j2 += 4503599627370496L;
        }
        int i = setMin(j) ? -1074 : ((int) (((j & 9218868437227405312L) >>> 52) & 4294967295L)) - 1075;
        if (getMin || j2 != 0) {
            while ((j2 & 4503599627370496L) == 0) {
                j2 <<= 1;
                i--;
            }
            return new validateStandard(j2 << 11, i - 11);
        }
        throw new AssertionError();
    }

    static void setMax(long j, validateStandard validatestandard, validateStandard validatestandard2) {
        if (getMin || !setMax(j)) {
            long j2 = 4503599627370495L & j;
            if (!setMin(j)) {
                j2 += 4503599627370496L;
            }
            validateStandard validatestandard3 = new validateStandard(j2, setMin(j) ? -1074 : ((int) (((j & 9218868437227405312L) >>> 52) & 4294967295L)) - 1075);
            boolean z = validatestandard3.setMax == 4503599627370496L;
            validatestandard2.setMax = (validatestandard3.setMax << 1) + 1;
            validatestandard2.getMin = validatestandard3.getMin - 1;
            validatestandard2.setMin();
            if (!z || validatestandard3.getMin == -1074) {
                validatestandard.setMax = (validatestandard3.setMax << 1) - 1;
                validatestandard.getMin = validatestandard3.getMin - 1;
            } else {
                validatestandard.setMax = (validatestandard3.setMax << 2) - 1;
                validatestandard.getMin = validatestandard3.getMin - 2;
            }
            validatestandard.setMax <<= validatestandard.getMin - validatestandard2.getMin;
            validatestandard.getMin = validatestandard2.getMin;
            return;
        }
        throw new AssertionError();
    }
}
