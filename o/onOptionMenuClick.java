package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class onOptionMenuClick<T> extends TitleBarRightButtonView.AnonymousClass1<T> {
    setMin IsOverlapping;
    final long getMax;
    final TimeUnit getMin;
    final int length;
    final SecurityCipher<T> setMax;
    final hasCornerMarking setMin;

    public onOptionMenuClick(SecurityCipher<T> securityCipher) {
        this(securityCipher, TimeUnit.NANOSECONDS);
    }

    private onOptionMenuClick(SecurityCipher<T> securityCipher, TimeUnit timeUnit) {
        this.setMax = securityCipher;
        this.length = 1;
        this.getMax = 0;
        this.getMin = timeUnit;
        this.setMin = null;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        setMin setmin;
        boolean z;
        synchronized (this) {
            setmin = this.IsOverlapping;
            if (setmin == null) {
                setmin = new setMin(this);
                this.IsOverlapping = setmin;
            }
            long j = setmin.subscriberCount;
            if (j == 0 && setmin.timer != null) {
                setmin.timer.dispose();
            }
            long j2 = j + 1;
            setmin.subscriberCount = j2;
            z = true;
            if (setmin.connected || j2 != ((long) this.length)) {
                z = false;
            } else {
                setmin.connected = true;
            }
        }
        this.setMax.subscribe(new getMin(griverProgressBar, this, setmin));
        if (z) {
            this.setMax.setMin(setmin);
        }
    }

    /* access modifiers changed from: package-private */
    public final void getMin(setMin setmin) {
        synchronized (this) {
            if (this.setMax instanceof isPreRenderPage) {
                if (this.IsOverlapping != null && this.IsOverlapping == setmin) {
                    this.IsOverlapping = null;
                    if (setmin.timer != null) {
                        setmin.timer.dispose();
                        setmin.timer = null;
                    }
                }
                long j = setmin.subscriberCount - 1;
                setmin.subscriberCount = j;
                if (j == 0) {
                    setMin(setmin);
                }
            } else if (this.IsOverlapping != null && this.IsOverlapping == setmin) {
                if (setmin.timer != null) {
                    setmin.timer.dispose();
                    setmin.timer = null;
                }
                long j2 = setmin.subscriberCount - 1;
                setmin.subscriberCount = j2;
                if (j2 == 0) {
                    this.IsOverlapping = null;
                    setMin(setmin);
                }
            }
        }
    }

    private void setMin(setMin setmin) {
        SecurityCipher<T> securityCipher = this.setMax;
        if (securityCipher instanceof GriverProgressBar.UpdateRunnable) {
            ((GriverProgressBar.UpdateRunnable) securityCipher).dispose();
        } else if (securityCipher instanceof getLoadMoreTipView) {
            ((getLoadMoreTipView) securityCipher).setMin((GriverProgressBar.UpdateRunnable) setmin.get());
        }
    }

    /* access modifiers changed from: package-private */
    public final void setMax(setMin setmin) {
        synchronized (this) {
            if (setmin.subscriberCount == 0 && setmin == this.IsOverlapping) {
                this.IsOverlapping = null;
                GriverProgressBar.UpdateRunnable updateRunnable = (GriverProgressBar.UpdateRunnable) setmin.get();
                DisposableHelper.dispose(setmin);
                if (this.setMax instanceof GriverProgressBar.UpdateRunnable) {
                    ((GriverProgressBar.UpdateRunnable) this.setMax).dispose();
                } else if (this.setMax instanceof getLoadMoreTipView) {
                    if (updateRunnable == null) {
                        setmin.disconnectedEarly = true;
                    } else {
                        ((getLoadMoreTipView) this.setMax).setMin(updateRunnable);
                    }
                }
            }
        }
    }

    static final class setMin extends AtomicReference<GriverProgressBar.UpdateRunnable> implements Runnable, RedDotManager<GriverProgressBar.UpdateRunnable> {
        private static final long serialVersionUID = -4552101107598366241L;
        boolean connected;
        boolean disconnectedEarly;
        final onOptionMenuClick<?> parent;
        long subscriberCount;
        GriverProgressBar.UpdateRunnable timer;

        setMin(onOptionMenuClick<?> onoptionmenuclick) {
            this.parent = onoptionmenuclick;
        }

        public final void run() {
            this.parent.setMax(this);
        }

        public final void accept(GriverProgressBar.UpdateRunnable updateRunnable) throws Exception {
            DisposableHelper.replace(this, updateRunnable);
            synchronized (this.parent) {
                if (this.disconnectedEarly) {
                    ((getLoadMoreTipView) this.parent.setMax).setMin(updateRunnable);
                }
            }
        }
    }

    static final class getMin<T> extends AtomicBoolean implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = -7419642935409022375L;
        final setMin connection;
        final GriverProgressBar<? super T> downstream;
        final onOptionMenuClick<T> parent;
        GriverProgressBar.UpdateRunnable upstream;

        getMin(GriverProgressBar<? super T> griverProgressBar, onOptionMenuClick<T> onoptionmenuclick, setMin setmin) {
            this.downstream = griverProgressBar;
            this.parent = onoptionmenuclick;
            this.connection = setmin;
        }

        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        public final void onError(Throwable th) {
            if (compareAndSet(false, true)) {
                this.parent.getMin(this.connection);
                this.downstream.onError(th);
                return;
            }
            SecuritySignature.getMax(th);
        }

        public final void onComplete() {
            if (compareAndSet(false, true)) {
                this.parent.getMin(this.connection);
                this.downstream.onComplete();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void dispose() {
            /*
                r7 = this;
                o.GriverProgressBar$UpdateRunnable r0 = r7.upstream
                r0.dispose()
                r0 = 0
                r1 = 1
                boolean r0 = r7.compareAndSet(r0, r1)
                if (r0 == 0) goto L_0x0055
                o.onOptionMenuClick<T> r0 = r7.parent
                o.onOptionMenuClick$setMin r1 = r7.connection
                monitor-enter(r0)
                o.onOptionMenuClick$setMin r2 = r0.IsOverlapping     // Catch:{ all -> 0x0052 }
                if (r2 == 0) goto L_0x0050
                o.onOptionMenuClick$setMin r2 = r0.IsOverlapping     // Catch:{ all -> 0x0052 }
                if (r2 == r1) goto L_0x001b
                goto L_0x0050
            L_0x001b:
                long r2 = r1.subscriberCount     // Catch:{ all -> 0x0052 }
                r4 = 1
                long r2 = r2 - r4
                r1.subscriberCount = r2     // Catch:{ all -> 0x0052 }
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L_0x004e
                boolean r2 = r1.connected     // Catch:{ all -> 0x0052 }
                if (r2 != 0) goto L_0x002d
                goto L_0x004e
            L_0x002d:
                long r2 = r0.getMax     // Catch:{ all -> 0x0052 }
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L_0x0038
                r0.setMax(r1)     // Catch:{ all -> 0x0052 }
                monitor-exit(r0)     // Catch:{ all -> 0x0052 }
                return
            L_0x0038:
                o.setLoadMoreTipColor r2 = new o.setLoadMoreTipColor     // Catch:{ all -> 0x0052 }
                r2.<init>()     // Catch:{ all -> 0x0052 }
                r1.timer = r2     // Catch:{ all -> 0x0052 }
                monitor-exit(r0)     // Catch:{ all -> 0x0052 }
                o.hasCornerMarking r3 = r0.setMin
                long r4 = r0.getMax
                java.util.concurrent.TimeUnit r0 = r0.getMin
                o.GriverProgressBar$UpdateRunnable r0 = r3.scheduleDirect(r1, r4, r0)
                r2.replace(r0)
                goto L_0x0055
            L_0x004e:
                monitor-exit(r0)     // Catch:{ all -> 0x0052 }
                return
            L_0x0050:
                monitor-exit(r0)     // Catch:{ all -> 0x0052 }
                return
            L_0x0052:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x0055:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.onOptionMenuClick.getMin.dispose():void");
        }

        public final boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.upstream, updateRunnable)) {
                this.upstream = updateRunnable;
                this.downstream.onSubscribe(this);
            }
        }
    }
}
