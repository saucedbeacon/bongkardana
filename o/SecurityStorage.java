package o;

import io.reactivex.annotations.NonNull;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;
import o.GriverProgressBar;

public final class SecurityStorage<T> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
    GriverProgressBar.UpdateRunnable getMax;
    final GriverProgressBar<? super T> getMin;
    boolean length;
    final boolean setMax;
    pluginName<Object> setMin;
    volatile boolean toFloatRange;

    public SecurityStorage(@NonNull GriverProgressBar<? super T> griverProgressBar) {
        this(griverProgressBar, (byte) 0);
    }

    private SecurityStorage(@NonNull GriverProgressBar<? super T> griverProgressBar, byte b) {
        this.getMin = griverProgressBar;
        this.setMax = false;
    }

    public final void onSubscribe(@NonNull GriverProgressBar.UpdateRunnable updateRunnable) {
        if (DisposableHelper.validate(this.getMax, updateRunnable)) {
            this.getMax = updateRunnable;
            this.getMin.onSubscribe(this);
        }
    }

    public final void dispose() {
        this.getMax.dispose();
    }

    public final boolean isDisposed() {
        return this.getMax.isDisposed();
    }

    public final void onNext(@NonNull T t) {
        if (!this.toFloatRange) {
            if (t == null) {
                this.getMax.dispose();
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (!this.toFloatRange) {
                    if (this.length) {
                        pluginName<Object> pluginname = this.setMin;
                        if (pluginname == null) {
                            pluginname = new pluginName<>();
                            this.setMin = pluginname;
                        }
                        pluginname.getMin(NotificationLite.next(t));
                        return;
                    }
                    this.length = true;
                    this.getMin.onNext(t);
                    setMax();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
        if (r1 == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        o.SecuritySignature.getMax(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003f, code lost:
        r3.getMin.onError(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0044, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(@io.reactivex.annotations.NonNull java.lang.Throwable r4) {
        /*
            r3 = this;
            boolean r0 = r3.toFloatRange
            if (r0 == 0) goto L_0x0008
            o.SecuritySignature.getMax((java.lang.Throwable) r4)
            return
        L_0x0008:
            monitor-enter(r3)
            boolean r0 = r3.toFloatRange     // Catch:{ all -> 0x0045 }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0011
            r1 = 1
            goto L_0x0038
        L_0x0011:
            boolean r0 = r3.length     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x0034
            r3.toFloatRange = r2     // Catch:{ all -> 0x0045 }
            o.pluginName<java.lang.Object> r0 = r3.setMin     // Catch:{ all -> 0x0045 }
            if (r0 != 0) goto L_0x0022
            o.pluginName r0 = new o.pluginName     // Catch:{ all -> 0x0045 }
            r0.<init>()     // Catch:{ all -> 0x0045 }
            r3.setMin = r0     // Catch:{ all -> 0x0045 }
        L_0x0022:
            java.lang.Object r4 = io.reactivex.internal.util.NotificationLite.error(r4)     // Catch:{ all -> 0x0045 }
            boolean r2 = r3.setMax     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x002e
            r0.getMin(r4)     // Catch:{ all -> 0x0045 }
            goto L_0x0032
        L_0x002e:
            java.lang.Object[] r0 = r0.setMax     // Catch:{ all -> 0x0045 }
            r0[r1] = r4     // Catch:{ all -> 0x0045 }
        L_0x0032:
            monitor-exit(r3)     // Catch:{ all -> 0x0045 }
            return
        L_0x0034:
            r3.toFloatRange = r2     // Catch:{ all -> 0x0045 }
            r3.length = r2     // Catch:{ all -> 0x0045 }
        L_0x0038:
            monitor-exit(r3)     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x003f
            o.SecuritySignature.getMax((java.lang.Throwable) r4)
            return
        L_0x003f:
            o.GriverProgressBar<? super T> r0 = r3.getMin
            r0.onError(r4)
            return
        L_0x0045:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SecurityStorage.onError(java.lang.Throwable):void");
    }

    public final void onComplete() {
        if (!this.toFloatRange) {
            synchronized (this) {
                if (!this.toFloatRange) {
                    if (this.length) {
                        pluginName<Object> pluginname = this.setMin;
                        if (pluginname == null) {
                            pluginname = new pluginName<>();
                            this.setMin = pluginname;
                        }
                        pluginname.getMin(NotificationLite.complete());
                        return;
                    }
                    this.toFloatRange = true;
                    this.length = true;
                    this.getMin.onComplete();
                }
            }
        }
    }

    private void setMax() {
        pluginName<Object> pluginname;
        do {
            synchronized (this) {
                pluginname = this.setMin;
                if (pluginname == null) {
                    this.length = false;
                    return;
                }
                this.setMin = null;
            }
        } while (!pluginname.getMax(this.getMin));
    }
}
