package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class setPullRefreshListener<T, U extends Collection<? super T>, Open, Close> extends onLoadMoreStateChanged<T, U> {
    final RedDotDrawable<? super Open, ? extends TitleBarRightButtonView.AnonymousClass4<? extends Close>> getMin;
    final TitleBarRightButtonView.AnonymousClass4<? extends Open> length;
    final Callable<U> setMax;

    public setPullRefreshListener(TitleBarRightButtonView.AnonymousClass4<T> r1, TitleBarRightButtonView.AnonymousClass4<? extends Open> r2, RedDotDrawable<? super Open, ? extends TitleBarRightButtonView.AnonymousClass4<? extends Close>> redDotDrawable, Callable<U> callable) {
        super(r1);
        this.length = r2;
        this.getMin = redDotDrawable;
        this.setMax = callable;
    }

    public final void subscribeActual(GriverProgressBar<? super U> griverProgressBar) {
        getMax getmax = new getMax(griverProgressBar, this.length, this.getMin, this.setMax);
        griverProgressBar.onSubscribe(getmax);
        this.setMin.subscribe(getmax);
    }

    static final class getMax<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = -8466418554264089604L;
        final RedDotDrawable<? super Open, ? extends TitleBarRightButtonView.AnonymousClass4<? extends Close>> bufferClose;
        final TitleBarRightButtonView.AnonymousClass4<? extends Open> bufferOpen;
        final Callable<C> bufferSupplier;
        Map<Long, C> buffers = new LinkedHashMap();
        volatile boolean cancelled;
        volatile boolean done;
        final GriverProgressBar<? super C> downstream;
        final InterfacePluginInfo errors = new InterfacePluginInfo();
        long index;
        final IRedDotManager observers = new IRedDotManager();
        final setTitleBackgroundImage<C> queue = new setTitleBackgroundImage<>(TitleBarRightButtonView.AnonymousClass1.bufferSize());
        final AtomicReference<GriverProgressBar.UpdateRunnable> upstream = new AtomicReference<>();

        getMax(GriverProgressBar<? super C> griverProgressBar, TitleBarRightButtonView.AnonymousClass4<? extends Open> r2, RedDotDrawable<? super Open, ? extends TitleBarRightButtonView.AnonymousClass4<? extends Close>> redDotDrawable, Callable<C> callable) {
            this.downstream = griverProgressBar;
            this.bufferSupplier = callable;
            this.bufferOpen = r2;
            this.bufferClose = redDotDrawable;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.setOnce(this.upstream, updateRunnable)) {
                length length2 = new length(this);
                this.observers.getMin(length2);
                this.bufferOpen.subscribe(length2);
            }
        }

        public final void onNext(T t) {
            synchronized (this) {
                Map<Long, C> map = this.buffers;
                if (map != null) {
                    for (C add : map.values()) {
                        add.add(t);
                    }
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.errors.addThrowable(th)) {
                this.observers.dispose();
                synchronized (this) {
                    this.buffers = null;
                }
                this.done = true;
                drain();
                return;
            }
            SecuritySignature.getMax(th);
        }

        public final void onComplete() {
            this.observers.dispose();
            synchronized (this) {
                Map<Long, C> map = this.buffers;
                if (map != null) {
                    for (C offer : map.values()) {
                        this.queue.offer(offer);
                    }
                    this.buffers = null;
                    this.done = true;
                    drain();
                }
            }
        }

        public final void dispose() {
            if (DisposableHelper.dispose(this.upstream)) {
                this.cancelled = true;
                this.observers.dispose();
                synchronized (this) {
                    this.buffers = null;
                }
                if (getAndIncrement() != 0) {
                    this.queue.clear();
                }
            }
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }

        /* access modifiers changed from: package-private */
        public final void open(Open open) {
            try {
                Collection collection = (Collection) setRefreshAnimation.getMax(this.bufferSupplier.call(), "The bufferSupplier returned a null Collection");
                TitleBarRightButtonView.AnonymousClass4 r6 = (TitleBarRightButtonView.AnonymousClass4) setRefreshAnimation.getMax(this.bufferClose.apply(open), "The bufferClose returned a null ObservableSource");
                long j = this.index;
                this.index = 1 + j;
                synchronized (this) {
                    Map<Long, C> map = this.buffers;
                    if (map != null) {
                        map.put(Long.valueOf(j), collection);
                        setMax setmax = new setMax(this, j);
                        this.observers.getMin(setmax);
                        r6.subscribe(setmax);
                    }
                }
            } catch (Throwable th) {
                registerNode.getMax(th);
                DisposableHelper.dispose(this.upstream);
                onError(th);
            }
        }

        /* access modifiers changed from: package-private */
        public final void openComplete(length<Open> length2) {
            this.observers.setMax(length2);
            if (this.observers.length() == 0) {
                DisposableHelper.dispose(this.upstream);
                this.done = true;
                drain();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
            if (r4 == false) goto L_0x0031;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
            r3.done = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
            drain();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void close(o.setPullRefreshListener.setMax<T, C> r4, long r5) {
            /*
                r3 = this;
                o.IRedDotManager r0 = r3.observers
                r0.setMax(r4)
                o.IRedDotManager r4 = r3.observers
                int r4 = r4.length()
                r0 = 1
                if (r4 != 0) goto L_0x0015
                java.util.concurrent.atomic.AtomicReference<o.GriverProgressBar$UpdateRunnable> r4 = r3.upstream
                io.reactivex.internal.disposables.DisposableHelper.dispose(r4)
                r4 = 1
                goto L_0x0016
            L_0x0015:
                r4 = 0
            L_0x0016:
                monitor-enter(r3)
                java.util.Map<java.lang.Long, C> r1 = r3.buffers     // Catch:{ all -> 0x0035 }
                if (r1 != 0) goto L_0x001d
                monitor-exit(r3)     // Catch:{ all -> 0x0035 }
                return
            L_0x001d:
                o.setTitleBackgroundImage<C> r1 = r3.queue     // Catch:{ all -> 0x0035 }
                java.util.Map<java.lang.Long, C> r2 = r3.buffers     // Catch:{ all -> 0x0035 }
                java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0035 }
                java.lang.Object r5 = r2.remove(r5)     // Catch:{ all -> 0x0035 }
                r1.offer(r5)     // Catch:{ all -> 0x0035 }
                monitor-exit(r3)     // Catch:{ all -> 0x0035 }
                if (r4 == 0) goto L_0x0031
                r3.done = r0
            L_0x0031:
                r3.drain()
                return
            L_0x0035:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setPullRefreshListener.getMax.close(o.setPullRefreshListener$setMax, long):void");
        }

        /* access modifiers changed from: package-private */
        public final void boundaryError(GriverProgressBar.UpdateRunnable updateRunnable, Throwable th) {
            DisposableHelper.dispose(this.upstream);
            this.observers.setMax(updateRunnable);
            onError(th);
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            if (getAndIncrement() == 0) {
                GriverProgressBar<? super C> griverProgressBar = this.downstream;
                setTitleBackgroundImage<C> settitlebackgroundimage = this.queue;
                int i = 1;
                while (!this.cancelled) {
                    boolean z = this.done;
                    if (!z || this.errors.get() == null) {
                        Collection collection = (Collection) settitlebackgroundimage.poll();
                        boolean z2 = collection == null;
                        if (z && z2) {
                            griverProgressBar.onComplete();
                            return;
                        } else if (!z2) {
                            griverProgressBar.onNext(collection);
                        } else {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        }
                    } else {
                        settitlebackgroundimage.clear();
                        griverProgressBar.onError(this.errors.terminate());
                        return;
                    }
                }
                settitlebackgroundimage.clear();
            }
        }

        static final class length<Open> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements GriverProgressBar<Open>, GriverProgressBar.UpdateRunnable {
            private static final long serialVersionUID = -8498650778633225126L;
            final getMax<?, ?, Open, ?> parent;

            length(getMax<?, ?, Open, ?> getmax) {
                this.parent = getmax;
            }

            public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
                DisposableHelper.setOnce(this, updateRunnable);
            }

            public final void onNext(Open open) {
                this.parent.open(open);
            }

            public final void onError(Throwable th) {
                lazySet(DisposableHelper.DISPOSED);
                this.parent.boundaryError(this, th);
            }

            public final void onComplete() {
                lazySet(DisposableHelper.DISPOSED);
                this.parent.openComplete(this);
            }

            public final void dispose() {
                DisposableHelper.dispose(this);
            }

            public final boolean isDisposed() {
                return get() == DisposableHelper.DISPOSED;
            }
        }
    }

    static final class setMax<T, C extends Collection<? super T>> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements GriverProgressBar<Object>, GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = -8498650778633225126L;
        final long index;
        final getMax<T, C, ?, ?> parent;

        setMax(getMax<T, C, ?, ?> getmax, long j) {
            this.parent = getmax;
            this.index = j;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            DisposableHelper.setOnce(this, updateRunnable);
        }

        public final void onNext(Object obj) {
            GriverProgressBar.UpdateRunnable updateRunnable = (GriverProgressBar.UpdateRunnable) get();
            if (updateRunnable != DisposableHelper.DISPOSED) {
                lazySet(DisposableHelper.DISPOSED);
                updateRunnable.dispose();
                this.parent.close(this, this.index);
            }
        }

        public final void onError(Throwable th) {
            if (get() != DisposableHelper.DISPOSED) {
                lazySet(DisposableHelper.DISPOSED);
                this.parent.boundaryError(this, th);
                return;
            }
            SecuritySignature.getMax(th);
        }

        public final void onComplete() {
            if (get() != DisposableHelper.DISPOSED) {
                lazySet(DisposableHelper.DISPOSED);
                this.parent.close(this, this.index);
            }
        }

        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        public final boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }
    }
}
