package o;

import java.util.concurrent.BlockingQueue;

final class onStartLoading implements Runnable {
    private final onReset length;
    private final BlockingQueue<commitContentChanged> setMax;
    private final abandon setMin;

    onStartLoading(onReset onreset, abandon abandon, BlockingQueue<commitContentChanged> blockingQueue) {
        this.length = onreset;
        this.setMin = abandon;
        this.setMax = blockingQueue;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:0|1) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:1:?, LOOP_START, MTH_ENTER_BLOCK, SYNTHETIC, Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
        L_0x0000:
            java.util.concurrent.BlockingQueue<o.commitContentChanged> r0 = r11.setMax     // Catch:{ InterruptedException -> 0x0000 }
            r0.size()     // Catch:{ InterruptedException -> 0x0000 }
            java.util.concurrent.BlockingQueue<o.commitContentChanged> r0 = r11.setMax     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.Object r0 = r0.take()     // Catch:{ InterruptedException -> 0x0000 }
            r9 = r0
            o.commitContentChanged r9 = (o.commitContentChanged) r9     // Catch:{ InterruptedException -> 0x0000 }
            o.abandon r0 = r11.setMin     // Catch:{ InterruptedException -> 0x0000 }
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.String r2 = "%s (API %d)"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ InterruptedException -> 0x0000 }
            r4 = 0
            java.lang.String r5 = android.os.Build.VERSION.RELEASE     // Catch:{ InterruptedException -> 0x0000 }
            r3[r4] = r5     // Catch:{ InterruptedException -> 0x0000 }
            r4 = 1
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ InterruptedException -> 0x0000 }
            r3[r4] = r5     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.String r5 = java.lang.String.format(r1, r2, r3)     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x0000 }
            r1.<init>()     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.String r2 = android.os.Build.DEVICE     // Catch:{ InterruptedException -> 0x0000 }
            r1.append(r2)     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.String r2 = "::"
            r1.append(r2)     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.String r2 = android.os.Build.MODEL     // Catch:{ InterruptedException -> 0x0000 }
            r1.append(r2)     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.String r6 = r1.toString()     // Catch:{ InterruptedException -> 0x0000 }
            java.util.Date r1 = new java.util.Date     // Catch:{ InterruptedException -> 0x0000 }
            r1.<init>()     // Catch:{ InterruptedException -> 0x0000 }
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.String r3 = "yyyy-MM-dd'T'kk:mm:ss.S'Z'"
            java.util.Locale r4 = java.util.Locale.getDefault()     // Catch:{ InterruptedException -> 0x0000 }
            r2.<init>(r3, r4)     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.String r3 = "UTC"
            java.util.TimeZone r3 = java.util.TimeZone.getTimeZone(r3)     // Catch:{ InterruptedException -> 0x0000 }
            r2.setTimeZone(r3)     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.String r8 = r2.format(r1)     // Catch:{ InterruptedException -> 0x0000 }
            o.startLoading r10 = new o.startLoading     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.String r2 = r0.getMax     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.String r3 = r0.getMin     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.String r4 = r0.setMax     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.String r7 = r0.length     // Catch:{ InterruptedException -> 0x0000 }
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ InterruptedException -> 0x0000 }
            o.onReset r0 = r11.length     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.String r1 = r10.setMin()     // Catch:{ InterruptedException -> 0x0000 }
            r0.getMin(r1)     // Catch:{ InterruptedException -> 0x0000 }
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onStartLoading.run():void");
    }
}
