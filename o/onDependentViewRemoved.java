package o;

import android.os.Process;
import com.facebook.flipper.android.EventBase;
import javax.annotation.Nullable;

final class onDependentViewRemoved extends Thread {
    @Nullable
    private EventBase getMin;

    onDependentViewRemoved(String str) {
        super(str);
    }

    public final void run() {
        Process.setThreadPriority(10);
        synchronized (this) {
            try {
                this.getMin = new EventBase();
                notifyAll();
            } catch (Throwable th) {
                notifyAll();
                throw th;
            }
        }
        this.getMin.loopForever();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0001 */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0001 A[LOOP:0: B:1:0x0001->B:13:0x0001, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.facebook.flipper.android.EventBase setMin() {
        /*
            r1 = this;
            monitor-enter(r1)
        L_0x0001:
            com.facebook.flipper.android.EventBase r0 = r1.getMin     // Catch:{ all -> 0x000d }
            if (r0 != 0) goto L_0x0009
            r1.wait()     // Catch:{ InterruptedException -> 0x0001 }
            goto L_0x0001
        L_0x0009:
            com.facebook.flipper.android.EventBase r0 = r1.getMin     // Catch:{ all -> 0x000d }
            monitor-exit(r1)
            return r0
        L_0x000d:
            r0 = move-exception
            monitor-exit(r1)
            goto L_0x0011
        L_0x0010:
            throw r0
        L_0x0011:
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onDependentViewRemoved.setMin():com.facebook.flipper.android.EventBase");
    }
}
