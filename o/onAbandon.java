package o;

import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import java.util.Date;

final class onAbandon implements Runnable {
    private long getMax;
    private final isAbandoned getMin;
    private float isInside;
    private final long length = 86400000;
    private final abandon setMax;
    private final onReset setMin;

    onAbandon(onReset onreset, abandon abandon, isAbandoned isabandoned) {
        this.setMin = onreset;
        this.setMax = abandon;
        this.getMin = isabandoned;
        this.isInside = isabandoned.length.getFloat(GriverMonitorConstants.KEY_SAMPLE_RATE, 1.0f);
        this.getMax = isabandoned.length.getLong("lastHeartbeatTimestamp", 0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:0|1|(2:3|(2:5|(3:7|8|(1:10))))|11|12|14|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x00b7 */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:13:0x0000, LOOP_START, MTH_ENTER_BLOCK, SYNTHETIC, Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
        L_0x0000:
            boolean r0 = r11.getMax()     // Catch:{ InterruptedException -> 0x0000 }
            if (r0 == 0) goto L_0x00b7
            java.util.Date r0 = new java.util.Date     // Catch:{ InterruptedException -> 0x0000 }
            r0.<init>()     // Catch:{ InterruptedException -> 0x0000 }
            long r0 = r0.getTime()     // Catch:{ InterruptedException -> 0x0000 }
            r11.getMax = r0     // Catch:{ InterruptedException -> 0x0000 }
            o.isAbandoned r2 = r11.getMin     // Catch:{ InterruptedException -> 0x0000 }
            android.content.SharedPreferences r2 = r2.length     // Catch:{ InterruptedException -> 0x0000 }
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.String r3 = "lastHeartbeatTimestamp"
            r2.putLong(r3, r0)     // Catch:{ InterruptedException -> 0x0000 }
            r2.apply()     // Catch:{ InterruptedException -> 0x0000 }
            boolean r0 = r11.setMax()     // Catch:{ InterruptedException -> 0x0000 }
            if (r0 == 0) goto L_0x00b7
            o.abandon r0 = r11.setMax     // Catch:{ InterruptedException -> 0x0000 }
            float r9 = r11.isInside     // Catch:{ InterruptedException -> 0x0000 }
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
            o.cancelLoad r10 = new o.cancelLoad     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.String r2 = r0.getMax     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.String r3 = r0.getMin     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.String r4 = r0.setMax     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.String r7 = r0.length     // Catch:{ InterruptedException -> 0x0000 }
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ InterruptedException -> 0x0000 }
            o.onReset r0 = r11.setMin     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.String r1 = r10.setMin()     // Catch:{ InterruptedException -> 0x0000 }
            o.reset r0 = r0.getMin(r1)     // Catch:{ InterruptedException -> 0x0000 }
            o.onReset$setMax r1 = r0.getMin     // Catch:{ InterruptedException -> 0x0000 }
            o.onReset$setMax r2 = o.onReset.setMax.SUCCESS     // Catch:{ InterruptedException -> 0x0000 }
            if (r1 != r2) goto L_0x00b7
            java.lang.String r0 = r0.length     // Catch:{ IOException | IllegalStateException | NumberFormatException -> 0x00b7 }
            o.forceLoad r0 = o.forceLoad.length(r0)     // Catch:{ IOException | IllegalStateException | NumberFormatException -> 0x00b7 }
            float r0 = r0.setMin     // Catch:{ IOException | IllegalStateException | NumberFormatException -> 0x00b7 }
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00b7
            r11.isInside = r0     // Catch:{ IOException | IllegalStateException | NumberFormatException -> 0x00b7 }
            o.isAbandoned r1 = r11.getMin     // Catch:{ IOException | IllegalStateException | NumberFormatException -> 0x00b7 }
            android.content.SharedPreferences r1 = r1.length     // Catch:{ IOException | IllegalStateException | NumberFormatException -> 0x00b7 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ IOException | IllegalStateException | NumberFormatException -> 0x00b7 }
            java.lang.String r2 = "sampleRate"
            r1.putFloat(r2, r0)     // Catch:{ IOException | IllegalStateException | NumberFormatException -> 0x00b7 }
            r1.apply()     // Catch:{ IOException | IllegalStateException | NumberFormatException -> 0x00b7 }
        L_0x00b7:
            long r0 = r11.length     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0000 }
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onAbandon.run():void");
    }

    private boolean getMax() {
        return new Date().getTime() - this.getMax >= this.length;
    }

    private boolean setMax() {
        return Math.random() < ((double) this.isInside);
    }
}
