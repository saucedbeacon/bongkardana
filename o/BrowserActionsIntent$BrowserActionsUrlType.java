package o;

import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class BrowserActionsIntent$BrowserActionsUrlType {
    static final /* synthetic */ boolean IsOverlapping = (!BrowserActionsIntent$BrowserActionsUrlType.class.desiredAssertionStatus());
    static final Executor length = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), CustomTabsIntent$ShareState.getMin("OkHttp ConnectionPool", true));
    private final int equals;
    final Runnable getMax;
    boolean getMin;
    final grantReadPermission setMax;
    final Deque<saveBitmap> setMin;
    private final long toFloatRange;

    public BrowserActionsIntent$BrowserActionsUrlType() {
        this(TimeUnit.MINUTES);
    }

    private BrowserActionsIntent$BrowserActionsUrlType(TimeUnit timeUnit) {
        this.getMax = new Runnable() {
            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r6 = this;
                L_0x0000:
                    o.BrowserActionsIntent$BrowserActionsUrlType r0 = o.BrowserActionsIntent$BrowserActionsUrlType.this
                    long r1 = java.lang.System.nanoTime()
                    long r0 = r0.getMin(r1)
                    r2 = -1
                    int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r4 != 0) goto L_0x0011
                    return
                L_0x0011:
                    r2 = 0
                    int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r4 <= 0) goto L_0x0000
                    r2 = 1000000(0xf4240, double:4.940656E-318)
                    long r4 = r0 / r2
                    long r2 = r2 * r4
                    long r0 = r0 - r2
                    o.BrowserActionsIntent$BrowserActionsUrlType r2 = o.BrowserActionsIntent$BrowserActionsUrlType.this
                    monitor-enter(r2)
                    o.BrowserActionsIntent$BrowserActionsUrlType r3 = o.BrowserActionsIntent$BrowserActionsUrlType.this     // Catch:{ InterruptedException -> 0x002b }
                    int r1 = (int) r0     // Catch:{ InterruptedException -> 0x002b }
                    r3.wait(r4, r1)     // Catch:{ InterruptedException -> 0x002b }
                    goto L_0x002b
                L_0x0029:
                    r0 = move-exception
                    goto L_0x002d
                L_0x002b:
                    monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                    goto L_0x0000
                L_0x002d:
                    monitor-exit(r2)
                    goto L_0x0030
                L_0x002f:
                    throw r0
                L_0x0030:
                    goto L_0x002f
                */
                throw new UnsupportedOperationException("Method not decompiled: o.BrowserActionsIntent$BrowserActionsUrlType.AnonymousClass2.run():void");
            }
        };
        this.setMin = new ArrayDeque();
        this.setMax = new grantReadPermission();
        this.equals = 5;
        this.toFloatRange = timeUnit.toNanos(5);
    }

    /* access modifiers changed from: package-private */
    public final boolean setMin(saveBitmap savebitmap) {
        if (!IsOverlapping && !Thread.holdsLock(this)) {
            throw new AssertionError();
        } else if (savebitmap.isInside || this.equals == 0) {
            this.setMin.remove(savebitmap);
            return true;
        } else {
            notifyAll();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final long getMin(long j) {
        int size;
        synchronized (this) {
            long j2 = Long.MIN_VALUE;
            saveBitmap savebitmap = null;
            int i = 0;
            int i2 = 0;
            for (saveBitmap next : this.setMin) {
                List<Reference<onBind>> list = next.equals;
                int i3 = 0;
                while (true) {
                    if (i3 >= list.size()) {
                        size = list.size();
                        break;
                    } else if (list.get(i3).get() != null) {
                        i3++;
                    } else {
                        PostMessageService max = PostMessageService.getMax();
                        StringBuilder sb = new StringBuilder("A connection to ");
                        sb.append(next.setMax.length.setMax);
                        sb.append(" was leaked. Did you forget to close a response body?");
                        max.setMin(5, sb.toString(), (Throwable) null);
                        list.remove(i3);
                        next.isInside = true;
                        if (list.isEmpty()) {
                            next.hashCode = j - this.toFloatRange;
                            size = 0;
                            break;
                        }
                    }
                }
                if (size > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - next.hashCode;
                    if (j3 > j2) {
                        savebitmap = next;
                        j2 = j3;
                    }
                }
            }
            if (j2 < this.toFloatRange) {
                if (i <= this.equals) {
                    if (i > 0) {
                        long j4 = this.toFloatRange - j2;
                        return j4;
                    } else if (i2 > 0) {
                        long j5 = this.toFloatRange;
                        return j5;
                    } else {
                        this.getMin = false;
                        return -1;
                    }
                }
            }
            this.setMin.remove(savebitmap);
            CustomTabsIntent$ShareState.setMax(savebitmap.getMax);
            return 0;
        }
    }
}
