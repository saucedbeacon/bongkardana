package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.NebulaTitleView;
import o.TitleBarRightButtonView;

public final class SplashViewSpecProvider<T, U> extends onLoadMoreStateChanged<T, U> {
    final int getMax;
    final RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<? extends U>> getMin;
    final boolean length;
    final int setMax;

    public SplashViewSpecProvider(TitleBarRightButtonView.AnonymousClass4<T> r1, RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<? extends U>> redDotDrawable, boolean z, int i, int i2) {
        super(r1);
        this.getMin = redDotDrawable;
        this.length = z;
        this.setMax = i;
        this.getMax = i2;
    }

    public final void subscribeActual(GriverProgressBar<? super U> griverProgressBar) {
        if (!H5NavMenuItem.setMin(this.setMin, griverProgressBar, this.getMin)) {
            this.setMin.subscribe(new setMax(griverProgressBar, this.getMin, this.length, this.setMax, this.getMax));
        }
    }

    static final class setMax<T, U> extends AtomicInteger implements GriverProgressBar.UpdateRunnable, GriverProgressBar<T> {
        static final getMin<?, ?>[] CANCELLED = new getMin[0];
        static final getMin<?, ?>[] EMPTY = new getMin[0];
        private static final long serialVersionUID = -2117620485640801370L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final GriverProgressBar<? super U> downstream;
        final InterfacePluginInfo errors = new InterfacePluginInfo();
        long lastId;
        int lastIndex;
        final RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<? extends U>> mapper;
        final int maxConcurrency;
        final AtomicReference<getMin<?, ?>[]> observers;
        volatile getRefreshViewHeight<U> queue;
        Queue<TitleBarRightButtonView.AnonymousClass4<? extends U>> sources;
        long uniqueId;
        GriverProgressBar.UpdateRunnable upstream;
        int wip;

        setMax(GriverProgressBar<? super U> griverProgressBar, RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<? extends U>> redDotDrawable, boolean z, int i, int i2) {
            this.downstream = griverProgressBar;
            this.mapper = redDotDrawable;
            this.delayErrors = z;
            this.maxConcurrency = i;
            this.bufferSize = i2;
            if (i != Integer.MAX_VALUE) {
                this.sources = new ArrayDeque(i);
            }
            this.observers = new AtomicReference<>(EMPTY);
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.upstream, updateRunnable)) {
                this.upstream = updateRunnable;
                this.downstream.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            if (!this.done) {
                try {
                    TitleBarRightButtonView.AnonymousClass4 r3 = (TitleBarRightButtonView.AnonymousClass4) setRefreshAnimation.getMax(this.mapper.apply(t), "The mapper returned a null ObservableSource");
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        synchronized (this) {
                            if (this.wip == this.maxConcurrency) {
                                this.sources.offer(r3);
                                return;
                            }
                            this.wip++;
                        }
                    }
                    subscribeInner(r3);
                } catch (Throwable th) {
                    registerNode.getMax(th);
                    this.upstream.dispose();
                    onError(th);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void subscribeInner(TitleBarRightButtonView.AnonymousClass4<? extends U> r6) {
            TitleBarRightButtonView.AnonymousClass4<? extends U> poll;
            while (r6 instanceof Callable) {
                if (tryEmitScalar((Callable) r6) && this.maxConcurrency != Integer.MAX_VALUE) {
                    boolean z = false;
                    synchronized (this) {
                        poll = this.sources.poll();
                        if (poll == null) {
                            this.wip--;
                            z = true;
                        }
                    }
                    if (z) {
                        drain();
                        return;
                    }
                    r6 = poll;
                } else {
                    return;
                }
            }
            long j = this.uniqueId;
            this.uniqueId = 1 + j;
            getMin getmin = new getMin(this, j);
            if (addInner(getmin)) {
                r6.subscribe(getmin);
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean addInner(getMin<T, U> getmin) {
            getMin<?, ?>[] getminArr;
            getMin[] getminArr2;
            do {
                getminArr = (getMin[]) this.observers.get();
                if (getminArr == CANCELLED) {
                    getmin.dispose();
                    return false;
                }
                int length = getminArr.length;
                getminArr2 = new getMin[(length + 1)];
                System.arraycopy(getminArr, 0, getminArr2, 0, length);
                getminArr2[length] = getmin;
            } while (!this.observers.compareAndSet(getminArr, getminArr2));
            return true;
        }

        /* access modifiers changed from: package-private */
        public final void removeInner(getMin<T, U> getmin) {
            getMin<T, U>[] getminArr;
            getMin<?, ?>[] getminArr2;
            do {
                getminArr = (getMin[]) this.observers.get();
                int length = getminArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (getminArr[i2] == getmin) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            getminArr2 = EMPTY;
                        } else {
                            getMin<?, ?>[] getminArr3 = new getMin[(length - 1)];
                            System.arraycopy(getminArr, 0, getminArr3, 0, i);
                            System.arraycopy(getminArr, i + 1, getminArr3, i, (length - i) - 1);
                            getminArr2 = getminArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.observers.compareAndSet(getminArr, getminArr2));
        }

        /* access modifiers changed from: package-private */
        public final boolean tryEmitScalar(Callable<? extends U> callable) {
            try {
                Object call = callable.call();
                if (call == null) {
                    return true;
                }
                if (get() != 0 || !compareAndSet(0, 1)) {
                    getRefreshViewHeight<U> getrefreshviewheight = this.queue;
                    if (getrefreshviewheight == null) {
                        if (this.maxConcurrency == Integer.MAX_VALUE) {
                            getrefreshviewheight = new setTitleBackgroundImage<>(this.bufferSize);
                        } else {
                            getrefreshviewheight = new NebulaTitleView.Theme<>(this.maxConcurrency);
                        }
                        this.queue = getrefreshviewheight;
                    }
                    if (!getrefreshviewheight.offer(call)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    } else if (getAndIncrement() != 0) {
                        return false;
                    }
                } else {
                    this.downstream.onNext(call);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                }
                drainLoop();
                return true;
            } catch (Throwable th) {
                registerNode.getMax(th);
                this.errors.addThrowable(th);
                drain();
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public final void tryEmit(U u, getMin<T, U> getmin) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                GriverPullRefreshService griverPullRefreshService = getmin.queue;
                if (griverPullRefreshService == null) {
                    griverPullRefreshService = new setTitleBackgroundImage(this.bufferSize);
                    getmin.queue = griverPullRefreshService;
                }
                griverPullRefreshService.offer(u);
                if (getAndIncrement() != 0) {
                    return;
                }
            } else {
                this.downstream.onNext(u);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            drainLoop();
        }

        public final void onError(Throwable th) {
            if (this.done) {
                SecuritySignature.getMax(th);
            } else if (this.errors.addThrowable(th)) {
                this.done = true;
                drain();
            } else {
                SecuritySignature.getMax(th);
            }
        }

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                drain();
            }
        }

        public final void dispose() {
            Throwable terminate;
            if (!this.cancelled) {
                this.cancelled = true;
                if (disposeAll() && (terminate = this.errors.terminate()) != null && terminate != utAvaiable.setMax) {
                    SecuritySignature.getMax(terminate);
                }
            }
        }

        public final boolean isDisposed() {
            return this.cancelled;
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        /* access modifiers changed from: package-private */
        public final void drainLoop() {
            int i;
            int i2;
            GriverProgressBar<? super U> griverProgressBar = this.downstream;
            int i3 = 1;
            while (!checkTerminate()) {
                getRefreshViewHeight<U> getrefreshviewheight = this.queue;
                if (getrefreshviewheight != null) {
                    while (!checkTerminate()) {
                        U poll = getrefreshviewheight.poll();
                        if (poll != null) {
                            griverProgressBar.onNext(poll);
                        }
                    }
                    return;
                }
                boolean z = this.done;
                getRefreshViewHeight<U> getrefreshviewheight2 = this.queue;
                getMin[] getminArr = (getMin[]) this.observers.get();
                int length = getminArr.length;
                int i4 = 0;
                if (this.maxConcurrency != Integer.MAX_VALUE) {
                    synchronized (this) {
                        i = this.sources.size();
                    }
                } else {
                    i = 0;
                }
                if (!z || !((getrefreshviewheight2 == null || getrefreshviewheight2.isEmpty()) && length == 0 && i == 0)) {
                    if (length != 0) {
                        long j = this.lastId;
                        int i5 = this.lastIndex;
                        if (length <= i5 || getminArr[i5].f9919id != j) {
                            if (length <= i5) {
                                i5 = 0;
                            }
                            for (int i6 = 0; i6 < length && getminArr[i5].f9919id != j; i6++) {
                                i5++;
                                if (i5 == length) {
                                    i5 = 0;
                                }
                            }
                            this.lastIndex = i5;
                            this.lastId = getminArr[i5].f9919id;
                        }
                        int i7 = 0;
                        int i8 = 0;
                        while (i7 < length) {
                            if (!checkTerminate()) {
                                getMin getmin = getminArr[i5];
                                GriverPullRefreshService<U> griverPullRefreshService = getmin.queue;
                                if (griverPullRefreshService != null) {
                                    while (true) {
                                        try {
                                            U poll2 = griverPullRefreshService.poll();
                                            if (poll2 == null) {
                                                break;
                                            }
                                            griverProgressBar.onNext(poll2);
                                            if (checkTerminate()) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            registerNode.getMax(th);
                                            getmin.dispose();
                                            this.errors.addThrowable(th);
                                            if (!checkTerminate()) {
                                                removeInner(getmin);
                                                i8++;
                                                i2 = i5 + 1;
                                                if (i2 != length) {
                                                }
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                }
                                boolean z2 = getmin.done;
                                GriverPullRefreshService<U> griverPullRefreshService2 = getmin.queue;
                                if (z2 && (griverPullRefreshService2 == null || griverPullRefreshService2.isEmpty())) {
                                    removeInner(getmin);
                                    if (!checkTerminate()) {
                                        i8++;
                                    } else {
                                        return;
                                    }
                                }
                                i2 = i5 + 1;
                                if (i2 != length) {
                                    i7++;
                                }
                                i2 = 0;
                                i7++;
                            } else {
                                return;
                            }
                        }
                        this.lastIndex = i5;
                        this.lastId = getminArr[i5].f9919id;
                        i4 = i8;
                    }
                    if (i4 == 0) {
                        i3 = addAndGet(-i3);
                        if (i3 == 0) {
                            return;
                        }
                    } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                        while (true) {
                            int i9 = i4 - 1;
                            if (i4 == 0) {
                                continue;
                                break;
                            }
                            synchronized (this) {
                                TitleBarRightButtonView.AnonymousClass4 poll3 = this.sources.poll();
                                if (poll3 == null) {
                                    this.wip--;
                                } else {
                                    subscribeInner(poll3);
                                }
                            }
                            i4 = i9;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Throwable terminate = this.errors.terminate();
                    if (terminate == utAvaiable.setMax) {
                        return;
                    }
                    if (terminate == null) {
                        griverProgressBar.onComplete();
                        return;
                    } else {
                        griverProgressBar.onError(terminate);
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean checkTerminate() {
            if (this.cancelled) {
                return true;
            }
            Throwable th = (Throwable) this.errors.get();
            if (this.delayErrors || th == null) {
                return false;
            }
            disposeAll();
            Throwable terminate = this.errors.terminate();
            if (terminate != utAvaiable.setMax) {
                this.downstream.onError(terminate);
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public final boolean disposeAll() {
            getMin<?, ?>[] getminArr;
            this.upstream.dispose();
            getMin<?, ?>[] getminArr2 = (getMin[]) this.observers.get();
            getMin<?, ?>[] getminArr3 = CANCELLED;
            if (getminArr2 == getminArr3 || (getminArr = (getMin[]) this.observers.getAndSet(getminArr3)) == CANCELLED) {
                return false;
            }
            for (getMin<?, ?> dispose : getminArr) {
                dispose.dispose();
            }
            return true;
        }
    }

    static final class getMin<T, U> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements GriverProgressBar<U> {
        private static final long serialVersionUID = -4606175640614850599L;
        volatile boolean done;
        int fusionMode;

        /* renamed from: id  reason: collision with root package name */
        final long f9919id;
        final setMax<T, U> parent;
        volatile GriverPullRefreshService<U> queue;

        getMin(setMax<T, U> setmax, long j) {
            this.f9919id = j;
            this.parent = setmax;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.setOnce(this, updateRunnable) && (updateRunnable instanceof setRefreshTips)) {
                setRefreshTips setrefreshtips = (setRefreshTips) updateRunnable;
                int requestFusion = setrefreshtips.requestFusion(7);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = setrefreshtips;
                    this.done = true;
                    this.parent.drain();
                } else if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = setrefreshtips;
                }
            }
        }

        public final void onNext(U u) {
            if (this.fusionMode == 0) {
                this.parent.tryEmit(u, this);
            } else {
                this.parent.drain();
            }
        }

        public final void onError(Throwable th) {
            if (this.parent.errors.addThrowable(th)) {
                if (!this.parent.delayErrors) {
                    this.parent.disposeAll();
                }
                this.done = true;
                this.parent.drain();
                return;
            }
            SecuritySignature.getMax(th);
        }

        public final void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        public final void dispose() {
            DisposableHelper.dispose(this);
        }
    }
}
