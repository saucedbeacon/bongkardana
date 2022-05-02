package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class getChildRadii<T, R> extends onLoadMoreStateChanged<T, R> {
    final int getMin;
    final RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<? extends R>> length;
    final boolean setMax;

    public getChildRadii(TitleBarRightButtonView.AnonymousClass4<T> r1, RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<? extends R>> redDotDrawable, int i, boolean z) {
        super(r1);
        this.length = redDotDrawable;
        this.getMin = i;
        this.setMax = z;
    }

    public final void subscribeActual(GriverProgressBar<? super R> griverProgressBar) {
        if (!H5NavMenuItem.setMin(this.setMin, griverProgressBar, this.length)) {
            this.setMin.subscribe(new getMax(griverProgressBar, this.length, this.getMin, this.setMax));
        }
    }

    static final class getMax<T, R> extends AtomicInteger implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        static final getMin<Object, Object> CANCELLED;
        private static final long serialVersionUID = -3491074160481096299L;
        final AtomicReference<getMin<T, R>> active = new AtomicReference<>();
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final GriverProgressBar<? super R> downstream;
        final InterfacePluginInfo errors;
        final RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<? extends R>> mapper;
        volatile long unique;
        GriverProgressBar.UpdateRunnable upstream;

        static {
            getMin<Object, Object> getmin = new getMin<>((getMax) null, -1, 1);
            CANCELLED = getmin;
            getmin.cancel();
        }

        getMax(GriverProgressBar<? super R> griverProgressBar, RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<? extends R>> redDotDrawable, int i, boolean z) {
            this.downstream = griverProgressBar;
            this.mapper = redDotDrawable;
            this.bufferSize = i;
            this.delayErrors = z;
            this.errors = new InterfacePluginInfo();
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.upstream, updateRunnable)) {
                this.upstream = updateRunnable;
                this.downstream.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            getMin<Object, Object> getmin;
            long j = this.unique + 1;
            this.unique = j;
            getMin getmin2 = this.active.get();
            if (getmin2 != null) {
                getmin2.cancel();
            }
            try {
                TitleBarRightButtonView.AnonymousClass4 r5 = (TitleBarRightButtonView.AnonymousClass4) setRefreshAnimation.getMax(this.mapper.apply(t), "The ObservableSource returned is null");
                getMin getmin3 = new getMin(this, j, this.bufferSize);
                do {
                    getmin = this.active.get();
                    if (getmin == CANCELLED) {
                        return;
                    }
                } while (!this.active.compareAndSet(getmin, getmin3));
                r5.subscribe(getmin3);
            } catch (Throwable th) {
                registerNode.getMax(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        public final void onError(Throwable th) {
            if (this.done || !this.errors.addThrowable(th)) {
                SecuritySignature.getMax(th);
                return;
            }
            if (!this.delayErrors) {
                disposeInner();
            }
            this.done = true;
            drain();
        }

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                drain();
            }
        }

        public final void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.dispose();
                disposeInner();
            }
        }

        public final boolean isDisposed() {
            return this.cancelled;
        }

        /* access modifiers changed from: package-private */
        public final void disposeInner() {
            getMin<Object, Object> andSet;
            getMin<Object, Object> getmin = this.active.get();
            getMin<Object, Object> getmin2 = CANCELLED;
            if (getmin != getmin2 && (andSet = this.active.getAndSet(getmin2)) != CANCELLED && andSet != null) {
                andSet.cancel();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x000f A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void drain() {
            /*
                r13 = this;
                int r0 = r13.getAndIncrement()
                if (r0 == 0) goto L_0x0007
                return
            L_0x0007:
                o.GriverProgressBar<? super R> r0 = r13.downstream
                java.util.concurrent.atomic.AtomicReference<o.getChildRadii$getMin<T, R>> r1 = r13.active
                boolean r2 = r13.delayErrors
                r3 = 1
                r4 = 1
            L_0x000f:
                boolean r5 = r13.cancelled
                if (r5 == 0) goto L_0x0014
                return
            L_0x0014:
                boolean r5 = r13.done
                r6 = 0
                if (r5 == 0) goto L_0x0052
                java.lang.Object r5 = r1.get()
                if (r5 != 0) goto L_0x0021
                r5 = 1
                goto L_0x0022
            L_0x0021:
                r5 = 0
            L_0x0022:
                if (r2 == 0) goto L_0x0038
                if (r5 == 0) goto L_0x0052
                o.InterfacePluginInfo r1 = r13.errors
                java.lang.Object r1 = r1.get()
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                if (r1 == 0) goto L_0x0034
                r0.onError(r1)
                return
            L_0x0034:
                r0.onComplete()
                return
            L_0x0038:
                o.InterfacePluginInfo r7 = r13.errors
                java.lang.Object r7 = r7.get()
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L_0x004c
                o.InterfacePluginInfo r1 = r13.errors
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            L_0x004c:
                if (r5 == 0) goto L_0x0052
                r0.onComplete()
                return
            L_0x0052:
                java.lang.Object r5 = r1.get()
                o.getChildRadii$getMin r5 = (o.getChildRadii.getMin) r5
                if (r5 == 0) goto L_0x00e7
                o.GriverPullRefreshService<R> r7 = r5.queue
                if (r7 == 0) goto L_0x00e7
                boolean r8 = r5.done
                r9 = 0
                if (r8 == 0) goto L_0x0089
                boolean r8 = r7.isEmpty()
                if (r2 == 0) goto L_0x006f
                if (r8 == 0) goto L_0x0089
                r1.compareAndSet(r5, r9)
                goto L_0x000f
            L_0x006f:
                o.InterfacePluginInfo r10 = r13.errors
                java.lang.Object r10 = r10.get()
                java.lang.Throwable r10 = (java.lang.Throwable) r10
                if (r10 == 0) goto L_0x0083
                o.InterfacePluginInfo r1 = r13.errors
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            L_0x0083:
                if (r8 == 0) goto L_0x0089
                r1.compareAndSet(r5, r9)
                goto L_0x000f
            L_0x0089:
                r8 = 0
            L_0x008a:
                boolean r10 = r13.cancelled
                if (r10 == 0) goto L_0x008f
                return
            L_0x008f:
                java.lang.Object r10 = r1.get()
                if (r5 == r10) goto L_0x0097
            L_0x0095:
                r8 = 1
                goto L_0x00e5
            L_0x0097:
                if (r2 != 0) goto L_0x00ad
                o.InterfacePluginInfo r10 = r13.errors
                java.lang.Object r10 = r10.get()
                java.lang.Throwable r10 = (java.lang.Throwable) r10
                if (r10 == 0) goto L_0x00ad
                o.InterfacePluginInfo r1 = r13.errors
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            L_0x00ad:
                boolean r10 = r5.done
                java.lang.Object r11 = r7.poll()     // Catch:{ all -> 0x00b4 }
                goto L_0x00d2
            L_0x00b4:
                r8 = move-exception
                o.registerNode.getMax(r8)
                o.InterfacePluginInfo r11 = r13.errors
                r11.addThrowable(r8)
                r1.compareAndSet(r5, r9)
                if (r2 != 0) goto L_0x00cd
                r13.disposeInner()
                o.GriverProgressBar$UpdateRunnable r8 = r13.upstream
                r8.dispose()
                r13.done = r3
                goto L_0x00d0
            L_0x00cd:
                r5.cancel()
            L_0x00d0:
                r11 = r9
                r8 = 1
            L_0x00d2:
                if (r11 != 0) goto L_0x00d6
                r12 = 1
                goto L_0x00d7
            L_0x00d6:
                r12 = 0
            L_0x00d7:
                if (r10 == 0) goto L_0x00df
                if (r12 == 0) goto L_0x00df
                r1.compareAndSet(r5, r9)
                goto L_0x0095
            L_0x00df:
                if (r12 != 0) goto L_0x00e5
                r0.onNext(r11)
                goto L_0x008a
            L_0x00e5:
                if (r8 != 0) goto L_0x000f
            L_0x00e7:
                int r4 = -r4
                int r4 = r13.addAndGet(r4)
                if (r4 != 0) goto L_0x000f
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getChildRadii.getMax.drain():void");
        }

        /* access modifiers changed from: package-private */
        public final void innerError(getMin<T, R> getmin, Throwable th) {
            if (getmin.index != this.unique || !this.errors.addThrowable(th)) {
                SecuritySignature.getMax(th);
                return;
            }
            if (!this.delayErrors) {
                this.upstream.dispose();
                this.done = true;
            }
            getmin.done = true;
            drain();
        }
    }

    static final class getMin<T, R> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements GriverProgressBar<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        final int bufferSize;
        volatile boolean done;
        final long index;
        final getMax<T, R> parent;
        volatile GriverPullRefreshService<R> queue;

        getMin(getMax<T, R> getmax, long j, int i) {
            this.parent = getmax;
            this.index = j;
            this.bufferSize = i;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.setOnce(this, updateRunnable)) {
                if (updateRunnable instanceof setRefreshTips) {
                    setRefreshTips setrefreshtips = (setRefreshTips) updateRunnable;
                    int requestFusion = setrefreshtips.requestFusion(7);
                    if (requestFusion == 1) {
                        this.queue = setrefreshtips;
                        this.done = true;
                        this.parent.drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.queue = setrefreshtips;
                        return;
                    }
                }
                this.queue = new setTitleBackgroundImage(this.bufferSize);
            }
        }

        public final void onNext(R r) {
            if (this.index == this.parent.unique) {
                if (r != null) {
                    this.queue.offer(r);
                }
                this.parent.drain();
            }
        }

        public final void onError(Throwable th) {
            this.parent.innerError(this, th);
        }

        public final void onComplete() {
            if (this.index == this.parent.unique) {
                this.done = true;
                this.parent.drain();
            }
        }

        public final void cancel() {
            DisposableHelper.dispose(this);
        }
    }
}
