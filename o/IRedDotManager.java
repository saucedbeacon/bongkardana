package o;

import io.reactivex.annotations.NonNull;
import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import o.GriverProgressBar;

public final class IRedDotManager implements GriverProgressBar.UpdateRunnable, setLoadMoreTips {
    volatile boolean getMax;
    JAQException<GriverProgressBar.UpdateRunnable> getMin;

    public final void dispose() {
        if (!this.getMax) {
            synchronized (this) {
                if (!this.getMax) {
                    this.getMax = true;
                    JAQException<GriverProgressBar.UpdateRunnable> jAQException = this.getMin;
                    this.getMin = null;
                    setMin(jAQException);
                }
            }
        }
    }

    public final boolean isDisposed() {
        return this.getMax;
    }

    public final boolean getMin(@NonNull GriverProgressBar.UpdateRunnable updateRunnable) {
        setRefreshAnimation.getMax(updateRunnable, "disposable is null");
        if (!this.getMax) {
            synchronized (this) {
                if (!this.getMax) {
                    JAQException<GriverProgressBar.UpdateRunnable> jAQException = this.getMin;
                    if (jAQException == null) {
                        jAQException = new JAQException<>();
                        this.getMin = jAQException;
                    }
                    jAQException.getMin(updateRunnable);
                    return true;
                }
            }
        }
        updateRunnable.dispose();
        return false;
    }

    public final boolean setMin(@NonNull GriverProgressBar.UpdateRunnable updateRunnable) {
        if (!setMax(updateRunnable)) {
            return false;
        }
        updateRunnable.dispose();
        return true;
    }

    public final boolean setMax(@NonNull GriverProgressBar.UpdateRunnable updateRunnable) {
        setRefreshAnimation.getMax(updateRunnable, "disposables is null");
        if (this.getMax) {
            return false;
        }
        synchronized (this) {
            if (this.getMax) {
                return false;
            }
            JAQException<GriverProgressBar.UpdateRunnable> jAQException = this.getMin;
            if (jAQException == null || !jAQException.getMax(updateRunnable)) {
                return false;
            }
            return true;
        }
    }

    public final void getMax() {
        if (!this.getMax) {
            synchronized (this) {
                if (!this.getMax) {
                    JAQException<GriverProgressBar.UpdateRunnable> jAQException = this.getMin;
                    this.getMin = null;
                    setMin(jAQException);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0014, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int length() {
        /*
            r2 = this;
            boolean r0 = r2.getMax
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            monitor-enter(r2)
            boolean r0 = r2.getMax     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            return r1
        L_0x000d:
            o.JAQException<o.GriverProgressBar$UpdateRunnable> r0 = r2.getMin     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0013
            int r1 = r0.getMax     // Catch:{ all -> 0x0015 }
        L_0x0013:
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            return r1
        L_0x0015:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.IRedDotManager.length():int");
    }

    private static void setMin(JAQException<GriverProgressBar.UpdateRunnable> jAQException) {
        if (jAQException != null) {
            ArrayList arrayList = null;
            for (T t : jAQException.length) {
                if (t instanceof GriverProgressBar.UpdateRunnable) {
                    try {
                        ((GriverProgressBar.UpdateRunnable) t).dispose();
                    } catch (Throwable th) {
                        registerNode.getMax(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw utAvaiable.getMin((Throwable) arrayList.get(0));
            }
            throw new CompositeException((Iterable<? extends Throwable>) arrayList);
        }
    }
}
