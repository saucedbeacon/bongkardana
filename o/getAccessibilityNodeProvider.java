package o;

import android.os.Looper;
import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class getAccessibilityNodeProvider implements ThreadFactory {
    private static final AtomicInteger length = new AtomicInteger(1);
    /* access modifiers changed from: private */
    public final int getMax;
    private final AtomicInteger setMax = new AtomicInteger(1);
    private final int setMin;

    public getAccessibilityNodeProvider(int i) {
        this.getMax = i;
        this.setMin = length.getAndIncrement();
    }

    public final Thread newThread(final Runnable runnable) {
        AnonymousClass5 r0 = new Runnable() {
            public final void run() {
                if (Looper.myLooper() == null) {
                    Looper.prepare();
                }
                try {
                    Process.setThreadPriority(getAccessibilityNodeProvider.this.getMax);
                } catch (SecurityException unused) {
                    Process.setThreadPriority(getAccessibilityNodeProvider.this.getMax + 1);
                }
                runnable.run();
            }
        };
        StringBuilder sb = new StringBuilder("ComponentLayoutThread");
        sb.append(this.setMin);
        sb.append("-");
        sb.append(this.setMax.getAndIncrement());
        Thread thread = new Thread(r0, sb.toString());
        thread.setPriority(10);
        return thread;
    }
}
