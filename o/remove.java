package o;

import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import java.io.IOException;
import java.io.InterruptedIOException;

public class remove extends loadParameters {
    private static remove getMin;
    private boolean length;
    private remove setMax;
    private long setMin;

    /* access modifiers changed from: protected */
    public void getMax() {
    }

    public final void getMin() {
        if (!this.length) {
            long f_ = f_();
            boolean g_ = g_();
            if (f_ != 0 || g_) {
                this.length = true;
                setMin(this, f_, g_);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    private static synchronized void setMin(remove remove, long j, boolean z) {
        Class<remove> cls = remove.class;
        synchronized (cls) {
            if (getMin == null) {
                getMin = new remove();
                new setMax().start();
            }
            long nanoTime = System.nanoTime();
            if (j != 0 && z) {
                remove.setMin = Math.min(j, remove.h_() - nanoTime) + nanoTime;
            } else if (j != 0) {
                remove.setMin = j + nanoTime;
            } else if (z) {
                remove.setMin = remove.h_();
            } else {
                throw new AssertionError();
            }
            long j2 = remove.setMin - nanoTime;
            remove remove2 = getMin;
            while (true) {
                if (remove2.setMax == null) {
                    break;
                } else if (j2 < remove2.setMax.setMin - nanoTime) {
                    break;
                } else {
                    remove2 = remove2.setMax;
                }
            }
            remove.setMax = remove2.setMax;
            remove2.setMax = remove;
            if (remove2 == getMin) {
                cls.notify();
            }
        }
    }

    public final boolean length() {
        if (!this.length) {
            return false;
        }
        this.length = false;
        return getMax(this);
    }

    private static synchronized boolean getMax(remove remove) {
        synchronized (remove.class) {
            for (remove remove2 = getMin; remove2 != null; remove2 = remove2.setMax) {
                if (remove2.setMax == remove) {
                    remove2.setMax = remove.setMax;
                    remove.setMax = null;
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void setMax(boolean z) {
        if (length() && z) {
            throw getMax((IOException) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final IOException length(IOException iOException) {
        if (!length()) {
            return iOException;
        }
        return getMax(iOException);
    }

    /* access modifiers changed from: protected */
    public IOException getMax(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT);
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    static final class setMax extends Thread {
        public setMax() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:0|1|(2:3|6)(2:4|7)|5) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:5:0x0000, LOOP_START, MTH_ENTER_BLOCK, SYNTHETIC, Splitter:B:0:0x0000] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r1 = this;
            L_0x0000:
                o.remove r0 = o.remove.setMin()     // Catch:{ InterruptedException -> 0x0000 }
                if (r0 != 0) goto L_0x0007
                goto L_0x0000
            L_0x0007:
                r0.getMax()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            */
            throw new UnsupportedOperationException("Method not decompiled: o.remove.setMax.run():void");
        }
    }

    static synchronized remove setMin() {
        Class<remove> cls = remove.class;
        synchronized (cls) {
            remove remove = getMin.setMax;
            if (remove == null) {
                cls.wait();
                return null;
            }
            long nanoTime = remove.setMin - System.nanoTime();
            if (nanoTime > 0) {
                long j = nanoTime / 1000000;
                Long.signum(j);
                cls.wait(j, (int) (nanoTime - (1000000 * j)));
                return null;
            }
            getMin.setMax = remove.setMax;
            remove.setMax = null;
            return remove;
        }
    }
}
