package o;

import io.reactivex.internal.util.NotificationLite;
import o.GriverProgressBar;
import o.pluginName;

public final class SecurityGuardManager<T> extends getStaticDataEncryptComp<T> implements pluginName.getMax<Object> {
    pluginName<Object> getMax;
    boolean getMin;
    final getStaticDataEncryptComp<T> length;
    volatile boolean setMax;

    public SecurityGuardManager(getStaticDataEncryptComp<T> getstaticdataencryptcomp) {
        this.length = getstaticdataencryptcomp;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        this.length.subscribe(griverProgressBar);
    }

    public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
        boolean z = true;
        if (!this.setMax) {
            synchronized (this) {
                if (!this.setMax) {
                    if (this.getMin) {
                        pluginName<Object> pluginname = this.getMax;
                        if (pluginname == null) {
                            pluginname = new pluginName<>();
                            this.getMax = pluginname;
                        }
                        pluginname.getMin(NotificationLite.disposable(updateRunnable));
                        return;
                    }
                    this.getMin = true;
                    z = false;
                }
            }
        }
        if (z) {
            updateRunnable.dispose();
            return;
        }
        this.length.onSubscribe(updateRunnable);
        getMax();
    }

    public final void onNext(T t) {
        if (!this.setMax) {
            synchronized (this) {
                if (!this.setMax) {
                    if (this.getMin) {
                        pluginName<Object> pluginname = this.getMax;
                        if (pluginname == null) {
                            pluginname = new pluginName<>();
                            this.getMax = pluginname;
                        }
                        pluginname.getMin(NotificationLite.next(t));
                        return;
                    }
                    this.getMin = true;
                    this.length.onNext(t);
                    getMax();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        if (r1 == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
        o.SecuritySignature.getMax(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
        r3.length.onError(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r4) {
        /*
            r3 = this;
            boolean r0 = r3.setMax
            if (r0 == 0) goto L_0x0008
            o.SecuritySignature.getMax((java.lang.Throwable) r4)
            return
        L_0x0008:
            monitor-enter(r3)
            boolean r0 = r3.setMax     // Catch:{ all -> 0x003b }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0011
            r1 = 1
            goto L_0x002e
        L_0x0011:
            r3.setMax = r2     // Catch:{ all -> 0x003b }
            boolean r0 = r3.getMin     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x002c
            o.pluginName<java.lang.Object> r0 = r3.getMax     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x0022
            o.pluginName r0 = new o.pluginName     // Catch:{ all -> 0x003b }
            r0.<init>()     // Catch:{ all -> 0x003b }
            r3.getMax = r0     // Catch:{ all -> 0x003b }
        L_0x0022:
            java.lang.Object r4 = io.reactivex.internal.util.NotificationLite.error(r4)     // Catch:{ all -> 0x003b }
            java.lang.Object[] r0 = r0.setMax     // Catch:{ all -> 0x003b }
            r0[r1] = r4     // Catch:{ all -> 0x003b }
            monitor-exit(r3)     // Catch:{ all -> 0x003b }
            return
        L_0x002c:
            r3.getMin = r2     // Catch:{ all -> 0x003b }
        L_0x002e:
            monitor-exit(r3)     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0035
            o.SecuritySignature.getMax((java.lang.Throwable) r4)
            return
        L_0x0035:
            o.getStaticDataEncryptComp<T> r0 = r3.length
            r0.onError(r4)
            return
        L_0x003b:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SecurityGuardManager.onError(java.lang.Throwable):void");
    }

    public final void onComplete() {
        if (!this.setMax) {
            synchronized (this) {
                if (!this.setMax) {
                    this.setMax = true;
                    if (this.getMin) {
                        pluginName<Object> pluginname = this.getMax;
                        if (pluginname == null) {
                            pluginname = new pluginName<>();
                            this.getMax = pluginname;
                        }
                        pluginname.getMin(NotificationLite.complete());
                        return;
                    }
                    this.getMin = true;
                    this.length.onComplete();
                }
            }
        }
    }

    private void getMax() {
        pluginName<Object> pluginname;
        while (true) {
            synchronized (this) {
                pluginname = this.getMax;
                if (pluginname == null) {
                    this.getMin = false;
                    return;
                }
                this.getMax = null;
            }
            pluginname.getMin((pluginName.getMax<? super Object>) this);
        }
    }

    public final boolean test(Object obj) {
        return NotificationLite.acceptFull(obj, this.length);
    }
}
