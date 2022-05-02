package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import o.GriverProgressBar;
import o.GriverPullRefreshService;
import o.TitleBarRightButtonView;

public final class GriverSwipeRefreshLayout<T> extends GriverPullRefreshService.IGRiverRefreshStyle<T> {

    public final class WMLAScrollerInfo<T> extends onLoadMoreStateChanged<T, Boolean> {
        final getChildren<? super T> setMax;

        public WMLAScrollerInfo(TitleBarRightButtonView.AnonymousClass4<T> r1, getChildren<? super T> getchildren) {
            super(r1);
            this.setMax = getchildren;
        }

        public final void subscribeActual(GriverProgressBar<? super Boolean> griverProgressBar) {
            this.setMin.subscribe(new getMin(griverProgressBar, this.setMax));
        }

        static final class getMin<T> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
            final GriverProgressBar<? super Boolean> getMax;
            final getChildren<? super T> getMin;
            GriverProgressBar.UpdateRunnable setMax;
            boolean setMin;

            getMin(GriverProgressBar<? super Boolean> griverProgressBar, getChildren<? super T> getchildren) {
                this.getMax = griverProgressBar;
                this.getMin = getchildren;
            }

            public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
                if (DisposableHelper.validate(this.setMax, updateRunnable)) {
                    this.setMax = updateRunnable;
                    this.getMax.onSubscribe(this);
                }
            }

            public final void onNext(T t) {
                if (!this.setMin) {
                    try {
                        if (this.getMin.test(t)) {
                            this.setMin = true;
                            this.setMax.dispose();
                            this.getMax.onNext(Boolean.TRUE);
                            this.getMax.onComplete();
                        }
                    } catch (Throwable th) {
                        registerNode.getMax(th);
                        this.setMax.dispose();
                        onError(th);
                    }
                }
            }

            public final void onError(Throwable th) {
                if (this.setMin) {
                    SecuritySignature.getMax(th);
                    return;
                }
                this.setMin = true;
                this.getMax.onError(th);
            }

            public final void onComplete() {
                if (!this.setMin) {
                    this.setMin = true;
                    this.getMax.onNext(Boolean.FALSE);
                    this.getMax.onComplete();
                }
            }

            public final void dispose() {
                this.setMax.dispose();
            }

            public final boolean isDisposed() {
                return this.setMax.isDisposed();
            }
        }
    }

    public final void onNext(T t) {
        if (this.setMax == null) {
            this.setMax = t;
            this.setMin.dispose();
            countDown();
        }
    }

    public final class OnPushLoadMoreListener<T> implements Iterable<T> {
        final int length;
        final TitleBarRightButtonView.AnonymousClass4<? extends T> setMin;

        public OnPushLoadMoreListener(TitleBarRightButtonView.AnonymousClass4<? extends T> r1, int i) {
            this.setMin = r1;
            this.length = i;
        }

        public final Iterator<T> iterator() {
            setMax setmax = new setMax(this.length);
            this.setMin.subscribe(setmax);
            return setmax;
        }

        static final class setMax<T> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements GriverProgressBar<T>, Iterator<T>, GriverProgressBar.UpdateRunnable {
            private static final long serialVersionUID = 6695226475494099826L;
            final Condition condition;
            volatile boolean done;
            volatile Throwable error;
            final Lock lock;
            final setTitleBackgroundImage<T> queue;

            setMax(int i) {
                this.queue = new setTitleBackgroundImage<>(i);
                ReentrantLock reentrantLock = new ReentrantLock();
                this.lock = reentrantLock;
                this.condition = reentrantLock.newCondition();
            }

            public final boolean hasNext() {
                while (!isDisposed()) {
                    boolean z = this.done;
                    boolean isEmpty = this.queue.isEmpty();
                    if (z) {
                        Throwable th = this.error;
                        if (th != null) {
                            throw utAvaiable.getMin(th);
                        } else if (isEmpty) {
                            return false;
                        }
                    }
                    if (!isEmpty) {
                        return true;
                    }
                    SGPluginExtras.getMax();
                    this.lock.lock();
                    while (!this.done && this.queue.isEmpty() && !isDisposed()) {
                        try {
                            this.condition.await();
                        } catch (InterruptedException e) {
                            DisposableHelper.dispose(this);
                            signalConsumer();
                            throw utAvaiable.getMin(e);
                        } catch (Throwable th2) {
                            this.lock.unlock();
                            throw th2;
                        }
                    }
                    this.lock.unlock();
                }
                Throwable th3 = this.error;
                if (th3 == null) {
                    return false;
                }
                throw utAvaiable.getMin(th3);
            }

            public final T next() {
                if (hasNext()) {
                    return this.queue.poll();
                }
                throw new NoSuchElementException();
            }

            public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
                DisposableHelper.setOnce(this, updateRunnable);
            }

            public final void onNext(T t) {
                this.queue.offer(t);
                signalConsumer();
            }

            public final void onError(Throwable th) {
                this.error = th;
                this.done = true;
                signalConsumer();
            }

            public final void onComplete() {
                this.done = true;
                signalConsumer();
            }

            /* access modifiers changed from: package-private */
            public final void signalConsumer() {
                this.lock.lock();
                try {
                    this.condition.signalAll();
                } finally {
                    this.lock.unlock();
                }
            }

            public final void remove() {
                throw new UnsupportedOperationException("remove");
            }

            public final void dispose() {
                DisposableHelper.dispose(this);
                signalConsumer();
            }

            public final boolean isDisposed() {
                return DisposableHelper.isDisposed((GriverProgressBar.UpdateRunnable) get());
            }
        }
    }

    public final class OnReachDistanceRefreshListener<T> implements Iterable<T> {
        final TitleBarRightButtonView.AnonymousClass4<T> getMin;

        public OnReachDistanceRefreshListener(TitleBarRightButtonView.AnonymousClass4<T> r1) {
            this.getMin = r1;
        }

        public final Iterator<T> iterator() {
            setMax setmax = new setMax();
            TitleBarRightButtonView.AnonymousClass1.wrap(this.getMin).materialize().subscribe(setmax);
            return setmax;
        }

        static final class setMax<T> extends setGlobalUserData<getFavorite<T>> implements Iterator<T> {
            final AtomicReference<getFavorite<T>> length = new AtomicReference<>();
            final Semaphore setMax = new Semaphore(0);
            getFavorite<T> setMin;

            public final void onComplete() {
            }

            setMax() {
            }

            public final /* synthetic */ void onNext(Object obj) {
                if (this.length.getAndSet((getFavorite) obj) == null) {
                    this.setMax.release();
                }
            }

            public final void onError(Throwable th) {
                SecuritySignature.getMax(th);
            }

            public final boolean hasNext() {
                getFavorite<T> getfavorite = this.setMin;
                Throwable th = null;
                if (getfavorite == null || !getfavorite.setMin()) {
                    if (this.setMin == null) {
                        try {
                            SGPluginExtras.getMax();
                            this.setMax.acquire();
                            getFavorite<T> andSet = this.length.getAndSet((Object) null);
                            this.setMin = andSet;
                            if (andSet.setMin()) {
                                Object obj = andSet.setMax;
                                if (NotificationLite.isError(obj)) {
                                    th = NotificationLite.getError(obj);
                                }
                                throw utAvaiable.getMin(th);
                            }
                        } catch (InterruptedException e) {
                            dispose();
                            this.setMin = getFavorite.length(e);
                            throw utAvaiable.getMin(e);
                        }
                    }
                    return this.setMin.getMax();
                }
                Object obj2 = this.setMin.setMax;
                if (NotificationLite.isError(obj2)) {
                    th = NotificationLite.getError(obj2);
                }
                throw utAvaiable.getMin(th);
            }

            public final T next() {
                T t;
                if (hasNext()) {
                    getFavorite<T> getfavorite = this.setMin;
                    Object obj = getfavorite.setMax;
                    if (obj == null || NotificationLite.isError(obj)) {
                        t = null;
                    } else {
                        t = getfavorite.setMax;
                    }
                    this.setMin = null;
                    return t;
                }
                throw new NoSuchElementException();
            }

            public final void remove() {
                throw new UnsupportedOperationException("Read-only iterator.");
            }
        }
    }

    public final void onError(Throwable th) {
        if (this.setMax == null) {
            this.getMax = th;
        }
        countDown();
    }

    /* renamed from: o.GriverSwipeRefreshLayout$3  reason: invalid class name */
    public final class AnonymousClass3<T> extends TitleBarRightButtonView.AnonymousClass1<T> {
        final getOptionMenu<T> getMax;

        public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
            this.getMax.getMax(new getMax(griverProgressBar));
        }

        public static <T> setOptionMenuIcon<T> getMin(GriverProgressBar<? super T> griverProgressBar) {
            return new getMax(griverProgressBar);
        }

        /* renamed from: o.GriverSwipeRefreshLayout$3$getMax */
        static final class getMax<T> extends isChildScrollToTop<T> implements setOptionMenuIcon<T> {
            private static final long serialVersionUID = 7603343402964826922L;
            GriverProgressBar.UpdateRunnable upstream;

            getMax(GriverProgressBar<? super T> griverProgressBar) {
                super(griverProgressBar);
            }

            public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
                if (DisposableHelper.validate(this.upstream, updateRunnable)) {
                    this.upstream = updateRunnable;
                    this.downstream.onSubscribe(this);
                }
            }

            public final void onSuccess(T t) {
                complete(t);
            }

            public final void onError(Throwable th) {
                error(th);
            }

            public final void onComplete() {
                complete();
            }

            public final void dispose() {
                super.dispose();
                this.upstream.dispose();
            }
        }
    }

    public final class OnPullRefreshListener<T, R> extends TitleBarRightButtonView.AnonymousClass1<R> {
        final TitleBarRightButtonView.AnonymousClass1<T> getMin;
        final RedDotDrawable<? super T, ? extends getOptionMenu<? extends R>> length;
        final boolean setMax;

        public OnPullRefreshListener(TitleBarRightButtonView.AnonymousClass1<T> r1, RedDotDrawable<? super T, ? extends getOptionMenu<? extends R>> redDotDrawable, boolean z) {
            this.getMin = r1;
            this.length = redDotDrawable;
            this.setMax = z;
        }

        public final void subscribeActual(GriverProgressBar<? super R> griverProgressBar) {
            if (!onPullDistance.getMin(this.getMin, this.length, griverProgressBar)) {
                this.getMin.subscribe(new setMin(griverProgressBar, this.length, this.setMax));
            }
        }

        static final class setMin<T, R> extends AtomicInteger implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
            static final setMax<Object> INNER_DISPOSED = new setMax<>((setMin) null);
            private static final long serialVersionUID = -5402190102429853762L;
            volatile boolean cancelled;
            final boolean delayErrors;
            volatile boolean done;
            final GriverProgressBar<? super R> downstream;
            final InterfacePluginInfo errors = new InterfacePluginInfo();
            final AtomicReference<setMax<R>> inner = new AtomicReference<>();
            final RedDotDrawable<? super T, ? extends getOptionMenu<? extends R>> mapper;
            GriverProgressBar.UpdateRunnable upstream;

            setMin(GriverProgressBar<? super R> griverProgressBar, RedDotDrawable<? super T, ? extends getOptionMenu<? extends R>> redDotDrawable, boolean z) {
                this.downstream = griverProgressBar;
                this.mapper = redDotDrawable;
                this.delayErrors = z;
            }

            public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
                if (DisposableHelper.validate(this.upstream, updateRunnable)) {
                    this.upstream = updateRunnable;
                    this.downstream.onSubscribe(this);
                }
            }

            public final void onNext(T t) {
                setMax<Object> setmax;
                setMax setmax2 = this.inner.get();
                if (setmax2 != null) {
                    setmax2.dispose();
                }
                try {
                    getOptionMenu getoptionmenu = (getOptionMenu) setRefreshAnimation.getMax(this.mapper.apply(t), "The mapper returned a null MaybeSource");
                    setMax setmax3 = new setMax(this);
                    do {
                        setmax = this.inner.get();
                        if (setmax == INNER_DISPOSED) {
                            return;
                        }
                    } while (!this.inner.compareAndSet(setmax, setmax3));
                    getoptionmenu.getMax(setmax3);
                } catch (Throwable th) {
                    registerNode.getMax(th);
                    this.upstream.dispose();
                    this.inner.getAndSet(INNER_DISPOSED);
                    onError(th);
                }
            }

            public final void onError(Throwable th) {
                if (this.errors.addThrowable(th)) {
                    if (!this.delayErrors) {
                        disposeInner();
                    }
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

            /* access modifiers changed from: package-private */
            public final void disposeInner() {
                setMax<Object> andSet = this.inner.getAndSet(INNER_DISPOSED);
                if (andSet != null && andSet != INNER_DISPOSED) {
                    andSet.dispose();
                }
            }

            public final void dispose() {
                this.cancelled = true;
                this.upstream.dispose();
                disposeInner();
            }

            public final boolean isDisposed() {
                return this.cancelled;
            }

            /* access modifiers changed from: package-private */
            public final void innerError(setMax<R> setmax, Throwable th) {
                if (!this.inner.compareAndSet(setmax, (Object) null) || !this.errors.addThrowable(th)) {
                    SecuritySignature.getMax(th);
                    return;
                }
                if (!this.delayErrors) {
                    this.upstream.dispose();
                    disposeInner();
                }
                drain();
            }

            /* access modifiers changed from: package-private */
            public final void innerComplete(setMax<R> setmax) {
                if (this.inner.compareAndSet(setmax, (Object) null)) {
                    drain();
                }
            }

            /* access modifiers changed from: package-private */
            public final void drain() {
                if (getAndIncrement() == 0) {
                    GriverProgressBar<? super R> griverProgressBar = this.downstream;
                    InterfacePluginInfo interfacePluginInfo = this.errors;
                    AtomicReference<setMax<R>> atomicReference = this.inner;
                    int i = 1;
                    while (!this.cancelled) {
                        if (interfacePluginInfo.get() == null || this.delayErrors) {
                            boolean z = this.done;
                            setMax setmax = atomicReference.get();
                            boolean z2 = setmax == null;
                            if (z && z2) {
                                Throwable terminate = interfacePluginInfo.terminate();
                                if (terminate != null) {
                                    griverProgressBar.onError(terminate);
                                    return;
                                } else {
                                    griverProgressBar.onComplete();
                                    return;
                                }
                            } else if (z2 || setmax.item == null) {
                                i = addAndGet(-i);
                                if (i == 0) {
                                    return;
                                }
                            } else {
                                atomicReference.compareAndSet(setmax, (Object) null);
                                griverProgressBar.onNext(setmax.item);
                            }
                        } else {
                            griverProgressBar.onError(interfacePluginInfo.terminate());
                            return;
                        }
                    }
                }
            }

            static final class setMax<R> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements setOptionMenuIcon<R> {
                private static final long serialVersionUID = 8042919737683345351L;
                volatile R item;
                final setMin<?, R> parent;

                setMax(setMin<?, R> setmin) {
                    this.parent = setmin;
                }

                public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
                    DisposableHelper.setOnce(this, updateRunnable);
                }

                public final void onSuccess(R r) {
                    this.item = r;
                    this.parent.drain();
                }

                public final void onError(Throwable th) {
                    this.parent.innerError(this, th);
                }

                public final void onComplete() {
                    this.parent.innerComplete(this);
                }

                /* access modifiers changed from: package-private */
                public final void dispose() {
                    DisposableHelper.dispose(this);
                }
            }
        }
    }
}
