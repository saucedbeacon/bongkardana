package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ErrorMode;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class setHostActivity<T, U> extends onLoadMoreStateChanged<T, U> {
    final ErrorMode getMax;
    final RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<? extends U>> getMin;
    final int setMax;

    public setHostActivity(TitleBarRightButtonView.AnonymousClass4<T> r1, RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<? extends U>> redDotDrawable, int i, ErrorMode errorMode) {
        super(r1);
        this.getMin = redDotDrawable;
        this.getMax = errorMode;
        this.setMax = Math.max(8, i);
    }

    public final void subscribeActual(GriverProgressBar<? super U> griverProgressBar) {
        if (!H5NavMenuItem.setMin(this.setMin, griverProgressBar, this.getMin)) {
            if (this.getMax == ErrorMode.IMMEDIATE) {
                this.setMin.subscribe(new length(new SecurityStorage(griverProgressBar), this.getMin, this.setMax));
            } else {
                this.setMin.subscribe(new setMin(griverProgressBar, this.getMin, this.setMax, this.getMax == ErrorMode.END));
            }
        }
    }

    static final class length<T, U> extends AtomicInteger implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = 8828587559905699186L;
        volatile boolean active;
        final int bufferSize;
        volatile boolean disposed;
        volatile boolean done;
        final GriverProgressBar<? super U> downstream;
        int fusionMode;
        final setMin<U> inner;
        final RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<? extends U>> mapper;
        GriverPullRefreshService<T> queue;
        GriverProgressBar.UpdateRunnable upstream;

        length(GriverProgressBar<? super U> griverProgressBar, RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<? extends U>> redDotDrawable, int i) {
            this.downstream = griverProgressBar;
            this.mapper = redDotDrawable;
            this.bufferSize = i;
            this.inner = new setMin<>(griverProgressBar, this);
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.upstream, updateRunnable)) {
                this.upstream = updateRunnable;
                if (updateRunnable instanceof setRefreshTips) {
                    setRefreshTips setrefreshtips = (setRefreshTips) updateRunnable;
                    int requestFusion = setrefreshtips.requestFusion(3);
                    if (requestFusion == 1) {
                        this.fusionMode = requestFusion;
                        this.queue = setrefreshtips;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.fusionMode = requestFusion;
                        this.queue = setrefreshtips;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new setTitleBackgroundImage(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            if (!this.done) {
                if (this.fusionMode == 0) {
                    this.queue.offer(t);
                }
                drain();
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                SecuritySignature.getMax(th);
                return;
            }
            this.done = true;
            dispose();
            this.downstream.onError(th);
        }

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                drain();
            }
        }

        /* access modifiers changed from: package-private */
        public final void innerComplete() {
            this.active = false;
            drain();
        }

        public final boolean isDisposed() {
            return this.disposed;
        }

        public final void dispose() {
            this.disposed = true;
            this.inner.dispose();
            this.upstream.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            if (getAndIncrement() == 0) {
                while (!this.disposed) {
                    if (!this.active) {
                        boolean z = this.done;
                        try {
                            T poll = this.queue.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                this.disposed = true;
                                this.downstream.onComplete();
                                return;
                            } else if (!z2) {
                                try {
                                    TitleBarRightButtonView.AnonymousClass4 r0 = (TitleBarRightButtonView.AnonymousClass4) setRefreshAnimation.getMax(this.mapper.apply(poll), "The mapper returned a null ObservableSource");
                                    this.active = true;
                                    r0.subscribe(this.inner);
                                } catch (Throwable th) {
                                    registerNode.getMax(th);
                                    dispose();
                                    this.queue.clear();
                                    this.downstream.onError(th);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            registerNode.getMax(th2);
                            dispose();
                            this.queue.clear();
                            this.downstream.onError(th2);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.queue.clear();
            }
        }

        static final class setMin<U> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements GriverProgressBar<U> {
            private static final long serialVersionUID = -7449079488798789337L;
            final GriverProgressBar<? super U> downstream;
            final length<?, ?> parent;

            setMin(GriverProgressBar<? super U> griverProgressBar, length<?, ?> length) {
                this.downstream = griverProgressBar;
                this.parent = length;
            }

            public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
                DisposableHelper.replace(this, updateRunnable);
            }

            public final void onNext(U u) {
                this.downstream.onNext(u);
            }

            public final void onError(Throwable th) {
                this.parent.dispose();
                this.downstream.onError(th);
            }

            public final void onComplete() {
                this.parent.innerComplete();
            }

            /* access modifiers changed from: package-private */
            public final void dispose() {
                DisposableHelper.dispose(this);
            }
        }
    }

    static final class setMin<T, R> extends AtomicInteger implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = -6951100001833242599L;
        volatile boolean active;
        final int bufferSize;
        volatile boolean cancelled;
        volatile boolean done;
        final GriverProgressBar<? super R> downstream;
        final InterfacePluginInfo error = new InterfacePluginInfo();
        final RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<? extends R>> mapper;
        final C0065setMin<R> observer;
        GriverPullRefreshService<T> queue;
        int sourceMode;
        final boolean tillTheEnd;
        GriverProgressBar.UpdateRunnable upstream;

        setMin(GriverProgressBar<? super R> griverProgressBar, RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<? extends R>> redDotDrawable, int i, boolean z) {
            this.downstream = griverProgressBar;
            this.mapper = redDotDrawable;
            this.bufferSize = i;
            this.tillTheEnd = z;
            this.observer = new C0065setMin<>(griverProgressBar, this);
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.upstream, updateRunnable)) {
                this.upstream = updateRunnable;
                if (updateRunnable instanceof setRefreshTips) {
                    setRefreshTips setrefreshtips = (setRefreshTips) updateRunnable;
                    int requestFusion = setrefreshtips.requestFusion(3);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = setrefreshtips;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = setrefreshtips;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new setTitleBackgroundImage(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            if (this.sourceMode == 0) {
                this.queue.offer(t);
            }
            drain();
        }

        public final void onError(Throwable th) {
            if (this.error.addThrowable(th)) {
                this.done = true;
                drain();
                return;
            }
            SecuritySignature.getMax(th);
        }

        public final void onComplete() {
            this.done = true;
            drain();
        }

        public final boolean isDisposed() {
            return this.cancelled;
        }

        public final void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.observer.dispose();
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            if (getAndIncrement() == 0) {
                GriverProgressBar<? super R> griverProgressBar = this.downstream;
                GriverPullRefreshService<T> griverPullRefreshService = this.queue;
                InterfacePluginInfo interfacePluginInfo = this.error;
                while (true) {
                    if (!this.active) {
                        if (this.cancelled) {
                            griverPullRefreshService.clear();
                            return;
                        } else if (this.tillTheEnd || ((Throwable) interfacePluginInfo.get()) == null) {
                            boolean z = this.done;
                            try {
                                T poll = griverPullRefreshService.poll();
                                boolean z2 = poll == null;
                                if (z && z2) {
                                    this.cancelled = true;
                                    Throwable terminate = interfacePluginInfo.terminate();
                                    if (terminate != null) {
                                        griverProgressBar.onError(terminate);
                                        return;
                                    } else {
                                        griverProgressBar.onComplete();
                                        return;
                                    }
                                } else if (!z2) {
                                    try {
                                        TitleBarRightButtonView.AnonymousClass4 r3 = (TitleBarRightButtonView.AnonymousClass4) setRefreshAnimation.getMax(this.mapper.apply(poll), "The mapper returned a null ObservableSource");
                                        if (r3 instanceof Callable) {
                                            try {
                                                Object call = ((Callable) r3).call();
                                                if (call != null && !this.cancelled) {
                                                    griverProgressBar.onNext(call);
                                                }
                                            } catch (Throwable th) {
                                                registerNode.getMax(th);
                                                interfacePluginInfo.addThrowable(th);
                                            }
                                        } else {
                                            this.active = true;
                                            r3.subscribe(this.observer);
                                        }
                                    } catch (Throwable th2) {
                                        registerNode.getMax(th2);
                                        this.cancelled = true;
                                        this.upstream.dispose();
                                        griverPullRefreshService.clear();
                                        interfacePluginInfo.addThrowable(th2);
                                        griverProgressBar.onError(interfacePluginInfo.terminate());
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                registerNode.getMax(th3);
                                this.cancelled = true;
                                this.upstream.dispose();
                                interfacePluginInfo.addThrowable(th3);
                                griverProgressBar.onError(interfacePluginInfo.terminate());
                                return;
                            }
                        } else {
                            griverPullRefreshService.clear();
                            this.cancelled = true;
                            griverProgressBar.onError(interfacePluginInfo.terminate());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        /* renamed from: o.setHostActivity$setMin$setMin  reason: collision with other inner class name */
        static final class C0065setMin<R> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements GriverProgressBar<R> {
            private static final long serialVersionUID = 2620149119579502636L;
            final GriverProgressBar<? super R> downstream;
            final setMin<?, R> parent;

            C0065setMin(GriverProgressBar<? super R> griverProgressBar, setMin<?, R> setmin) {
                this.downstream = griverProgressBar;
                this.parent = setmin;
            }

            public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
                DisposableHelper.replace(this, updateRunnable);
            }

            public final void onNext(R r) {
                this.downstream.onNext(r);
            }

            public final void onError(Throwable th) {
                setMin<?, R> setmin = this.parent;
                if (setmin.error.addThrowable(th)) {
                    if (!setmin.tillTheEnd) {
                        setmin.upstream.dispose();
                    }
                    setmin.active = false;
                    setmin.drain();
                    return;
                }
                SecuritySignature.getMax(th);
            }

            public final void onComplete() {
                setMin<?, R> setmin = this.parent;
                setmin.active = false;
                setmin.drain();
            }

            /* access modifiers changed from: package-private */
            public final void dispose() {
                DisposableHelper.dispose(this);
            }
        }
    }
}
