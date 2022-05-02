package o;

import android.os.Build;
import android.os.CancellationSignal;
import androidx.annotation.Nullable;

public final class StringRes {
    private boolean getMax;
    private getMin getMin;
    private Object setMax;
    private boolean setMin;

    public interface getMin {
        void getMin();
    }

    public final boolean getMax() {
        boolean z;
        synchronized (this) {
            z = this.setMin;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0.getMin();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        if (r1 == null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        if (android.os.Build.VERSION.SDK_INT < 16) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        ((android.os.CancellationSignal) r1).cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0028, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.getMax = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0033, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r4.getMax = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0039, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0 == null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMax() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.setMin     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            return
        L_0x0007:
            r0 = 1
            r4.setMin = r0     // Catch:{ all -> 0x003e }
            r4.getMax = r0     // Catch:{ all -> 0x003e }
            o.StringRes$getMin r0 = r4.getMin     // Catch:{ all -> 0x003e }
            java.lang.Object r1 = r4.setMax     // Catch:{ all -> 0x003e }
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            r2 = 0
            if (r0 == 0) goto L_0x001a
            r0.getMin()     // Catch:{ all -> 0x0018 }
            goto L_0x001a
        L_0x0018:
            r0 = move-exception
            goto L_0x0028
        L_0x001a:
            if (r1 == 0) goto L_0x0033
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0018 }
            r3 = 16
            if (r0 < r3) goto L_0x0033
            android.os.CancellationSignal r1 = (android.os.CancellationSignal) r1     // Catch:{ all -> 0x0018 }
            r1.cancel()     // Catch:{ all -> 0x0018 }
            goto L_0x0033
        L_0x0028:
            monitor-enter(r4)
            r4.getMax = r2     // Catch:{ all -> 0x0030 }
            r4.notifyAll()     // Catch:{ all -> 0x0030 }
            monitor-exit(r4)     // Catch:{ all -> 0x0030 }
            throw r0
        L_0x0030:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0033:
            monitor-enter(r4)
            r4.getMax = r2     // Catch:{ all -> 0x003b }
            r4.notifyAll()     // Catch:{ all -> 0x003b }
            monitor-exit(r4)     // Catch:{ all -> 0x003b }
            return
        L_0x003b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x003e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.StringRes.setMax():void");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0001 */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0001 A[LOOP:0: B:1:0x0001->B:21:0x0001, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMax(@androidx.annotation.Nullable o.StringRes.getMin r2) {
        /*
            r1 = this;
            monitor-enter(r1)
        L_0x0001:
            boolean r0 = r1.getMax     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x0009
            r1.wait()     // Catch:{ InterruptedException -> 0x0001 }
            goto L_0x0001
        L_0x0009:
            o.StringRes$getMin r0 = r1.getMin     // Catch:{ all -> 0x001c }
            if (r0 != r2) goto L_0x000f
            monitor-exit(r1)     // Catch:{ all -> 0x001c }
            return
        L_0x000f:
            r1.getMin = r2     // Catch:{ all -> 0x001c }
            boolean r0 = r1.setMin     // Catch:{ all -> 0x001c }
            if (r0 != 0) goto L_0x0017
            monitor-exit(r1)     // Catch:{ all -> 0x001c }
            return
        L_0x0017:
            monitor-exit(r1)
            r2.getMin()
            return
        L_0x001c:
            r2 = move-exception
            monitor-exit(r1)
            goto L_0x0020
        L_0x001f:
            throw r2
        L_0x0020:
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: o.StringRes.getMax(o.StringRes$getMin):void");
    }

    @Nullable
    public final Object length() {
        Object obj;
        if (Build.VERSION.SDK_INT < 16) {
            return null;
        }
        synchronized (this) {
            if (this.setMax == null) {
                CancellationSignal cancellationSignal = new CancellationSignal();
                this.setMax = cancellationSignal;
                if (this.setMin) {
                    cancellationSignal.cancel();
                }
            }
            obj = this.setMax;
        }
        return obj;
    }
}
