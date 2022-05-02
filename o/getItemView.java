package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class getItemView<T, B> extends onLoadMoreStateChanged<T, TitleBarRightButtonView.AnonymousClass1<T>> {
    final int getMin;
    final Callable<? extends TitleBarRightButtonView.AnonymousClass4<B>> length;

    public getItemView(TitleBarRightButtonView.AnonymousClass4<T> r1, Callable<? extends TitleBarRightButtonView.AnonymousClass4<B>> callable, int i) {
        super(r1);
        this.length = callable;
        this.getMin = i;
    }

    public final void subscribeActual(GriverProgressBar<? super TitleBarRightButtonView.AnonymousClass1<T>> griverProgressBar) {
        this.setMin.subscribe(new setMax(griverProgressBar, this.getMin, this.length));
    }

    static final class setMax<T, B> extends AtomicInteger implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable, Runnable {
        static final length<Object, Object> BOUNDARY_DISPOSED = new length<>((setMax) null);
        static final Object NEXT_WINDOW = new Object();
        private static final long serialVersionUID = 2233020065421370272L;
        final AtomicReference<length<T, B>> boundaryObserver = new AtomicReference<>();
        final int capacityHint;
        volatile boolean done;
        final GriverProgressBar<? super TitleBarRightButtonView.AnonymousClass1<T>> downstream;
        final InterfacePluginInfo errors = new InterfacePluginInfo();
        final Callable<? extends TitleBarRightButtonView.AnonymousClass4<B>> other;
        final initTitleSegControl<Object> queue = new initTitleSegControl<>();
        final AtomicBoolean stopWindows = new AtomicBoolean();
        GriverProgressBar.UpdateRunnable upstream;
        getDynamicDataEncryptComp<T> window;
        final AtomicInteger windows = new AtomicInteger(1);

        setMax(GriverProgressBar<? super TitleBarRightButtonView.AnonymousClass1<T>> griverProgressBar, int i, Callable<? extends TitleBarRightButtonView.AnonymousClass4<B>> callable) {
            this.downstream = griverProgressBar;
            this.capacityHint = i;
            this.other = callable;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.upstream, updateRunnable)) {
                this.upstream = updateRunnable;
                this.downstream.onSubscribe(this);
                this.queue.offer(NEXT_WINDOW);
                drain();
            }
        }

        public final void onNext(T t) {
            this.queue.offer(t);
            drain();
        }

        public final void onError(Throwable th) {
            disposeBoundary();
            if (this.errors.addThrowable(th)) {
                this.done = true;
                drain();
                return;
            }
            SecuritySignature.getMax(th);
        }

        public final void onComplete() {
            disposeBoundary();
            this.done = true;
            drain();
        }

        public final void dispose() {
            if (this.stopWindows.compareAndSet(false, true)) {
                disposeBoundary();
                if (this.windows.decrementAndGet() == 0) {
                    this.upstream.dispose();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void disposeBoundary() {
            GriverProgressBar.UpdateRunnable andSet = this.boundaryObserver.getAndSet(BOUNDARY_DISPOSED);
            if (andSet != null && andSet != BOUNDARY_DISPOSED) {
                andSet.dispose();
            }
        }

        public final boolean isDisposed() {
            return this.stopWindows.get();
        }

        public final void run() {
            if (this.windows.decrementAndGet() == 0) {
                this.upstream.dispose();
            }
        }

        /* access modifiers changed from: package-private */
        public final void innerNext(length<T, B> length) {
            this.boundaryObserver.compareAndSet(length, (Object) null);
            this.queue.offer(NEXT_WINDOW);
            drain();
        }

        /* access modifiers changed from: package-private */
        public final void innerError(Throwable th) {
            this.upstream.dispose();
            if (this.errors.addThrowable(th)) {
                this.done = true;
                drain();
                return;
            }
            SecuritySignature.getMax(th);
        }

        /* access modifiers changed from: package-private */
        public final void innerComplete() {
            this.upstream.dispose();
            this.done = true;
            drain();
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            if (getAndIncrement() == 0) {
                GriverProgressBar<? super TitleBarRightButtonView.AnonymousClass1<T>> griverProgressBar = this.downstream;
                initTitleSegControl<Object> inittitlesegcontrol = this.queue;
                InterfacePluginInfo interfacePluginInfo = this.errors;
                int i = 1;
                while (this.windows.get() != 0) {
                    getDynamicDataEncryptComp<T> getdynamicdataencryptcomp = this.window;
                    boolean z = this.done;
                    if (!z || interfacePluginInfo.get() == null) {
                        Object poll = inittitlesegcontrol.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            Throwable terminate = interfacePluginInfo.terminate();
                            if (terminate == null) {
                                if (getdynamicdataencryptcomp != null) {
                                    this.window = null;
                                    getdynamicdataencryptcomp.onComplete();
                                }
                                griverProgressBar.onComplete();
                                return;
                            }
                            if (getdynamicdataencryptcomp != null) {
                                this.window = null;
                                getdynamicdataencryptcomp.onError(terminate);
                            }
                            griverProgressBar.onError(terminate);
                            return;
                        } else if (z2) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else if (poll != NEXT_WINDOW) {
                            getdynamicdataencryptcomp.onNext(poll);
                        } else {
                            if (getdynamicdataencryptcomp != null) {
                                this.window = null;
                                getdynamicdataencryptcomp.onComplete();
                            }
                            if (!this.stopWindows.get()) {
                                getDynamicDataEncryptComp<T> max = getDynamicDataEncryptComp.setMax(this.capacityHint, this);
                                this.window = max;
                                this.windows.getAndIncrement();
                                try {
                                    TitleBarRightButtonView.AnonymousClass4 r7 = (TitleBarRightButtonView.AnonymousClass4) setRefreshAnimation.getMax(this.other.call(), "The other Callable returned a null ObservableSource");
                                    length length = new length(this);
                                    if (this.boundaryObserver.compareAndSet((Object) null, length)) {
                                        r7.subscribe(length);
                                        griverProgressBar.onNext(max);
                                    }
                                } catch (Throwable th) {
                                    registerNode.getMax(th);
                                    interfacePluginInfo.addThrowable(th);
                                    this.done = true;
                                }
                            }
                        }
                    } else {
                        inittitlesegcontrol.clear();
                        Throwable terminate2 = interfacePluginInfo.terminate();
                        if (getdynamicdataencryptcomp != null) {
                            this.window = null;
                            getdynamicdataencryptcomp.onError(terminate2);
                        }
                        griverProgressBar.onError(terminate2);
                        return;
                    }
                }
                inittitlesegcontrol.clear();
                this.window = null;
            }
        }
    }

    static final class length<T, B> extends setGlobalUserData<B> {
        final setMax<T, B> getMin;
        boolean setMax;

        length(setMax<T, B> setmax) {
            this.getMin = setmax;
        }

        public final void onNext(B b) {
            if (!this.setMax) {
                this.setMax = true;
                dispose();
                this.getMin.innerNext(this);
            }
        }

        public final void onError(Throwable th) {
            if (this.setMax) {
                SecuritySignature.getMax(th);
                return;
            }
            this.setMax = true;
            this.getMin.innerError(th);
        }

        public final void onComplete() {
            if (!this.setMax) {
                this.setMax = true;
                this.getMin.innerComplete();
            }
        }
    }
}
