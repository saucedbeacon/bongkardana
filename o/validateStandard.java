package o;

class validateStandard {
    static final /* synthetic */ boolean length = (!validateStandard.class.desiredAssertionStatus());
    int getMin;
    long setMax;

    private static boolean length(long j, long j2) {
        if (j != j2) {
            return (((j > 0 ? 1 : (j == 0 ? 0 : -1)) < 0) ^ ((j > j2 ? 1 : (j == j2 ? 0 : -1)) > 0)) ^ ((j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)) < 0);
        }
    }

    validateStandard() {
        this.setMax = 0;
        this.getMin = 0;
    }

    validateStandard(long j, int i) {
        this.setMax = j;
        this.getMin = i;
    }

    static validateStandard getMax(validateStandard validatestandard, validateStandard validatestandard2) {
        validateStandard validatestandard3 = new validateStandard(validatestandard.setMax, validatestandard.getMin);
        if (!length && validatestandard3.getMin != validatestandard2.getMin) {
            throw new AssertionError();
        } else if (length || length(validatestandard3.setMax, validatestandard2.setMax)) {
            validatestandard3.setMax -= validatestandard2.setMax;
            return validatestandard3;
        } else {
            throw new AssertionError();
        }
    }

    static validateStandard length(validateStandard validatestandard, validateStandard validatestandard2) {
        validateStandard validatestandard3 = new validateStandard(validatestandard.setMax, validatestandard.getMin);
        long j = validatestandard3.setMax;
        long j2 = j >>> 32;
        long j3 = j & 4294967295L;
        long j4 = validatestandard2.setMax;
        long j5 = j4 >>> 32;
        long j6 = j4 & 4294967295L;
        long j7 = j2 * j5;
        long j8 = j5 * j3;
        long j9 = j2 * j6;
        validatestandard3.getMin += validatestandard2.getMin + 64;
        validatestandard3.setMax = j7 + (j9 >>> 32) + (j8 >>> 32) + ((((((j3 * j6) >>> 32) + (j9 & 4294967295L)) + (4294967295L & j8)) + 2147483648L) >>> 32);
        return validatestandard3;
    }

    /* access modifiers changed from: package-private */
    public final void setMin() {
        if (length || this.setMax != 0) {
            long j = this.setMax;
            int i = this.getMin;
            while ((-18014398509481984L & j) == 0) {
                j <<= 10;
                i -= 10;
            }
            while ((Long.MIN_VALUE & j) == 0) {
                j <<= 1;
                i--;
            }
            this.setMax = j;
            this.getMin = i;
            return;
        }
        throw new AssertionError();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[DiyFp f:");
        sb.append(this.setMax);
        sb.append(", e:");
        sb.append(this.getMin);
        sb.append("]");
        return sb.toString();
    }
}
