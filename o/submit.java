package o;

import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

public class submit extends recordSSLTime {
    private static final long getMax = TimeUnit.MILLISECONDS.toNanos(getMin);
    private static final long getMin = TimeUnit.SECONDS.toMillis(60);
    @Nullable
    static submit setMin;
    private long IsOverlapping;
    @Nullable
    private submit isInside;
    private boolean length;

    /* access modifiers changed from: protected */
    public void setMax() {
    }

    public final void setMin() {
        if (!this.length) {
            long length2 = length();
            boolean E_ = E_();
            if (length2 != 0 || E_) {
                this.length = true;
                getMax(this, length2, E_);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    private static synchronized void getMax(submit submit, long j, boolean z) {
        Class<submit> cls = submit.class;
        synchronized (cls) {
            if (setMin == null) {
                setMin = new submit();
                new length().start();
            }
            long nanoTime = System.nanoTime();
            if (j != 0 && z) {
                submit.IsOverlapping = Math.min(j, submit.F_() - nanoTime) + nanoTime;
            } else if (j != 0) {
                submit.IsOverlapping = j + nanoTime;
            } else if (z) {
                submit.IsOverlapping = submit.F_();
            } else {
                throw new AssertionError();
            }
            long j2 = submit.IsOverlapping - nanoTime;
            submit submit2 = setMin;
            while (true) {
                if (submit2.isInside == null) {
                    break;
                } else if (j2 < submit2.isInside.IsOverlapping - nanoTime) {
                    break;
                } else {
                    submit2 = submit2.isInside;
                }
            }
            submit.isInside = submit2.isInside;
            submit2.isInside = submit;
            if (submit2 == setMin) {
                cls.notify();
            }
        }
    }

    public final boolean getMin() {
        if (!this.length) {
            return false;
        }
        this.length = false;
        return setMin(this);
    }

    private static synchronized boolean setMin(submit submit) {
        synchronized (submit.class) {
            for (submit submit2 = setMin; submit2 != null; submit2 = submit2.isInside) {
                if (submit2.isInside == submit) {
                    submit2.isInside = submit.isInside;
                    submit.isInside = null;
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void getMax(boolean z) throws IOException {
        if (getMin() && z) {
            throw setMin((IOException) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final IOException getMax(IOException iOException) throws IOException {
        if (!getMin()) {
            return iOException;
        }
        return setMin(iOException);
    }

    /* access modifiers changed from: protected */
    public IOException setMin(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT);
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    static final class length extends Thread {
        length() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0015, code lost:
            r1.setMax();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<o.submit> r0 = o.submit.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                o.submit r1 = o.submit.getMax()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x0000
            L_0x000b:
                o.submit r2 = o.submit.setMin     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                o.submit.setMin = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0014:
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                r1.setMax()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x001d
            L_0x001c:
                throw r1
            L_0x001d:
                goto L_0x001c
            */
            throw new UnsupportedOperationException("Method not decompiled: o.submit.length.run():void");
        }
    }

    @Nullable
    static submit getMax() throws InterruptedException {
        Class<submit> cls = submit.class;
        submit submit = setMin.isInside;
        if (submit == null) {
            long nanoTime = System.nanoTime();
            cls.wait(getMin);
            if (setMin.isInside != null || System.nanoTime() - nanoTime < getMax) {
                return null;
            }
            return setMin;
        }
        long nanoTime2 = submit.IsOverlapping - System.nanoTime();
        if (nanoTime2 > 0) {
            long j = nanoTime2 / 1000000;
            cls.wait(j, (int) (nanoTime2 - (1000000 * j)));
            return null;
        }
        setMin.isInside = submit.isInside;
        submit.isInside = null;
        return submit;
    }
}
