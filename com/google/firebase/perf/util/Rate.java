package com.google.firebase.perf.util;

import java.util.concurrent.TimeUnit;

public class Rate {
    static final /* synthetic */ boolean $assertionsDisabled = (!Rate.class.desiredAssertionStatus());
    private long numTimeUnits;
    private long numTokensPerTotalTimeUnit;
    private TimeUnit timeUnit;

    public Rate(long j, long j2, TimeUnit timeUnit2) {
        if ($assertionsDisabled || j2 > 0) {
            this.numTokensPerTotalTimeUnit = j;
            this.numTimeUnits = j2;
            this.timeUnit = timeUnit2;
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: com.google.firebase.perf.util.Rate$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$util$concurrent$TimeUnit;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                java.util.concurrent.TimeUnit[] r0 = java.util.concurrent.TimeUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$java$util$concurrent$TimeUnit = r0
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$java$util$concurrent$TimeUnit     // Catch:{ NoSuchFieldError -> 0x001d }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$java$util$concurrent$TimeUnit     // Catch:{ NoSuchFieldError -> 0x0028 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.util.Rate.AnonymousClass1.<clinit>():void");
        }
    }

    public double getTokensPerSeconds() {
        int i = AnonymousClass1.$SwitchMap$java$util$concurrent$TimeUnit[this.timeUnit.ordinal()];
        if (i == 1) {
            double d = (double) this.numTokensPerTotalTimeUnit;
            double d2 = (double) this.numTimeUnits;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d / d2;
            double nanos = (double) TimeUnit.SECONDS.toNanos(1);
            Double.isNaN(nanos);
            return d3 * nanos;
        } else if (i == 2) {
            double d4 = (double) this.numTokensPerTotalTimeUnit;
            double d5 = (double) this.numTimeUnits;
            Double.isNaN(d4);
            Double.isNaN(d5);
            double d6 = d4 / d5;
            double micros = (double) TimeUnit.SECONDS.toMicros(1);
            Double.isNaN(micros);
            return d6 * micros;
        } else if (i != 3) {
            double d7 = (double) this.numTokensPerTotalTimeUnit;
            double seconds = (double) this.timeUnit.toSeconds(this.numTimeUnits);
            Double.isNaN(d7);
            Double.isNaN(seconds);
            return d7 / seconds;
        } else {
            double d8 = (double) this.numTokensPerTotalTimeUnit;
            double d9 = (double) this.numTimeUnits;
            Double.isNaN(d8);
            Double.isNaN(d9);
            double d10 = d8 / d9;
            double millis = (double) TimeUnit.SECONDS.toMillis(1);
            Double.isNaN(millis);
            return d10 * millis;
        }
    }
}
