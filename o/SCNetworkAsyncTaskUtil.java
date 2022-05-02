package o;

public final class SCNetworkAsyncTaskUtil implements CharSequence {
    private final String getMax;
    private final int getMin;
    private final int setMax;

    public SCNetworkAsyncTaskUtil(String str, int i, int i2) {
        if (i < 0) {
            throw new StringIndexOutOfBoundsException("beginIndex must be at least 0");
        } else if (i2 < 0) {
            throw new StringIndexOutOfBoundsException("endIndex must be at least 0");
        } else if (i2 < i) {
            throw new StringIndexOutOfBoundsException("endIndex must not be less than beginIndex");
        } else if (i2 <= str.length()) {
            this.getMax = str;
            this.setMax = i;
            this.getMin = i2;
        } else {
            throw new StringIndexOutOfBoundsException("endIndex must not be greater than length");
        }
    }

    public final int length() {
        return this.getMin - this.setMax;
    }

    public final char charAt(int i) {
        if (i >= 0) {
            int i2 = this.setMax;
            if (i2 + i < this.getMin) {
                return this.getMax.charAt(i + i2);
            }
        }
        throw new StringIndexOutOfBoundsException("String index out of range: ".concat(String.valueOf(i)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r4.setMax;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence subSequence(int r5, int r6) {
        /*
            r4 = this;
            java.lang.String r0 = "String index out of range: "
            if (r5 < 0) goto L_0x002a
            int r1 = r4.setMax
            int r2 = r1 + r5
            int r3 = r4.getMin
            if (r2 > r3) goto L_0x002a
            if (r6 < 0) goto L_0x001c
            int r2 = r1 + r6
            if (r2 > r3) goto L_0x001c
            o.SCNetworkAsyncTaskUtil r0 = new o.SCNetworkAsyncTaskUtil
            java.lang.String r2 = r4.getMax
            int r5 = r5 + r1
            int r1 = r1 + r6
            r0.<init>(r2, r5, r1)
            return r0
        L_0x001c:
            java.lang.StringIndexOutOfBoundsException r5 = new java.lang.StringIndexOutOfBoundsException
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r0.concat(r6)
            r5.<init>(r6)
            throw r5
        L_0x002a:
            java.lang.StringIndexOutOfBoundsException r6 = new java.lang.StringIndexOutOfBoundsException
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r0.concat(r5)
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SCNetworkAsyncTaskUtil.subSequence(int, int):java.lang.CharSequence");
    }

    public final String toString() {
        return this.getMax.substring(this.setMax, this.getMin);
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof CharSequence) && toString().equals(obj.toString());
        }
        return true;
    }
}
