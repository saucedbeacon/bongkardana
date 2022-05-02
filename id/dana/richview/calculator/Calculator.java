package id.dana.richview.calculator;

public final class Calculator {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static id.dana.richview.calculator.Calculator.Operation getMax(@id.dana.richview.calculator.OperandType java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -1902665991: goto L_0x0029;
                case 2459034: goto L_0x001f;
                case 73363536: goto L_0x0015;
                case 1750165953: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0033
        L_0x000b:
            java.lang.String r0 = "MULTIPLIER"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 3
            goto L_0x0034
        L_0x0015:
            java.lang.String r0 = "MINUS"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 1
            goto L_0x0034
        L_0x001f:
            java.lang.String r0 = "PLUS"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 0
            goto L_0x0034
        L_0x0029:
            java.lang.String r0 = "DIVIDER"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 2
            goto L_0x0034
        L_0x0033:
            r4 = -1
        L_0x0034:
            if (r4 == 0) goto L_0x0048
            if (r4 == r3) goto L_0x0045
            if (r4 == r2) goto L_0x0042
            if (r4 == r1) goto L_0x003f
            id.dana.richview.calculator.Calculator$Operation r4 = id.dana.richview.calculator.Calculator.Operation.DEFAULT
            return r4
        L_0x003f:
            id.dana.richview.calculator.Calculator$Operation r4 = id.dana.richview.calculator.Calculator.Operation.TIMES
            return r4
        L_0x0042:
            id.dana.richview.calculator.Calculator$Operation r4 = id.dana.richview.calculator.Calculator.Operation.DIVIDE
            return r4
        L_0x0045:
            id.dana.richview.calculator.Calculator$Operation r4 = id.dana.richview.calculator.Calculator.Operation.MINUS
            return r4
        L_0x0048:
            id.dana.richview.calculator.Calculator$Operation r4 = id.dana.richview.calculator.Calculator.Operation.PLUS
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.richview.calculator.Calculator.getMax(java.lang.String):id.dana.richview.calculator.Calculator$Operation");
    }

    enum Operation {
        PLUS("+") {
            /* access modifiers changed from: package-private */
            public final long apply(long j, long j2) {
                return j + j2;
            }
        },
        MINUS("-") {
            /* access modifiers changed from: package-private */
            public final long apply(long j, long j2) {
                return j - j2;
            }
        },
        TIMES("*") {
            /* access modifiers changed from: package-private */
            public final long apply(long j, long j2) {
                return j2 == 0 ? j : j * j2;
            }
        },
        DIVIDE("/") {
            /* access modifiers changed from: package-private */
            public final long apply(long j, long j2) {
                if (j2 == 0) {
                    return j;
                }
                if (j < j2) {
                    return 1;
                }
                return j / j2;
            }
        },
        DEFAULT("") {
            /* access modifiers changed from: package-private */
            public final long apply(long j, long j2) {
                return j;
            }
        };
        
        private final String symbol;

        /* access modifiers changed from: package-private */
        public abstract long apply(long j, long j2);

        private Operation(String str) {
            this.symbol = str;
        }

        public String toString() {
            return this.symbol;
        }
    }
}
