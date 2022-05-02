package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class getIconSize<T, K, V> extends onLoadMoreStateChanged<T, encryptString<K, V>> {
    final RedDotDrawable<? super T, ? extends K> getMax;
    final int getMin;
    final boolean length;
    final RedDotDrawable<? super T, ? extends V> setMax;

    public getIconSize(TitleBarRightButtonView.AnonymousClass4<T> r1, RedDotDrawable<? super T, ? extends K> redDotDrawable, RedDotDrawable<? super T, ? extends V> redDotDrawable2, int i, boolean z) {
        super(r1);
        this.getMax = redDotDrawable;
        this.setMax = redDotDrawable2;
        this.getMin = i;
        this.length = z;
    }

    public final void subscribeActual(GriverProgressBar<? super encryptString<K, V>> griverProgressBar) {
        this.setMin.subscribe(new getMin(griverProgressBar, this.getMax, this.setMax, this.getMin, this.length));
    }

    public static final class getMin<T, K, V> extends AtomicInteger implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        static final Object NULL_KEY = new Object();
        private static final long serialVersionUID = -3688291656102519502L;
        final int bufferSize;
        final AtomicBoolean cancelled = new AtomicBoolean();
        final boolean delayError;
        final GriverProgressBar<? super encryptString<K, V>> downstream;
        final Map<Object, setMax<K, V>> groups;
        final RedDotDrawable<? super T, ? extends K> keySelector;
        GriverProgressBar.UpdateRunnable upstream;
        final RedDotDrawable<? super T, ? extends V> valueSelector;

        public getMin(GriverProgressBar<? super encryptString<K, V>> griverProgressBar, RedDotDrawable<? super T, ? extends K> redDotDrawable, RedDotDrawable<? super T, ? extends V> redDotDrawable2, int i, boolean z) {
            this.downstream = griverProgressBar;
            this.keySelector = redDotDrawable;
            this.valueSelector = redDotDrawable2;
            this.bufferSize = i;
            this.delayError = z;
            this.groups = new ConcurrentHashMap();
            lazySet(1);
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.upstream, updateRunnable)) {
                this.upstream = updateRunnable;
                this.downstream.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            Object obj;
            try {
                Object apply = this.keySelector.apply(t);
                if (apply != null) {
                    obj = apply;
                } else {
                    obj = NULL_KEY;
                }
                setMax setmax = this.groups.get(obj);
                if (setmax == null) {
                    if (!this.cancelled.get()) {
                        setmax = setMax.setMax(apply, this.bufferSize, this, this.delayError);
                        this.groups.put(obj, setmax);
                        getAndIncrement();
                        this.downstream.onNext(setmax);
                    } else {
                        return;
                    }
                }
                try {
                    setmax.getMin.onNext(setRefreshAnimation.getMax(this.valueSelector.apply(t), "The value supplied is null"));
                } catch (Throwable th) {
                    registerNode.getMax(th);
                    this.upstream.dispose();
                    onError(th);
                }
            } catch (Throwable th2) {
                registerNode.getMax(th2);
                this.upstream.dispose();
                onError(th2);
            }
        }

        public final void onError(Throwable th) {
            ArrayList<setMax> arrayList = new ArrayList<>(this.groups.values());
            this.groups.clear();
            for (setMax setmax : arrayList) {
                setmax.getMin.onError(th);
            }
            this.downstream.onError(th);
        }

        public final void onComplete() {
            ArrayList<setMax> arrayList = new ArrayList<>(this.groups.values());
            this.groups.clear();
            for (setMax setmax : arrayList) {
                setmax.getMin.onComplete();
            }
            this.downstream.onComplete();
        }

        public final void dispose() {
            if (this.cancelled.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.upstream.dispose();
            }
        }

        public final boolean isDisposed() {
            return this.cancelled.get();
        }

        public final void cancel(K k) {
            if (k == null) {
                k = NULL_KEY;
            }
            this.groups.remove(k);
            if (decrementAndGet() == 0) {
                this.upstream.dispose();
            }
        }
    }

    static final class setMax<K, T> extends encryptString<K, T> {
        final getMax<T, K> getMin;

        public static <T, K> setMax<K, T> setMax(K k, int i, getMin<?, K, T> getmin, boolean z) {
            return new setMax<>(k, new getMax(i, getmin, k, z));
        }

        private setMax(K k, getMax<T, K> getmax) {
            super(k);
            this.getMin = getmax;
        }

        public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
            this.getMin.subscribe(griverProgressBar);
        }
    }

    static final class getMax<T, K> extends AtomicInteger implements GriverProgressBar.UpdateRunnable, TitleBarRightButtonView.AnonymousClass4<T> {
        private static final long serialVersionUID = -3852313036005250360L;
        final AtomicReference<GriverProgressBar<? super T>> actual = new AtomicReference<>();
        final AtomicBoolean cancelled = new AtomicBoolean();
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final K key;
        final AtomicBoolean once = new AtomicBoolean();
        final getMin<?, K, T> parent;
        final setTitleBackgroundImage<T> queue;

        getMax(int i, getMin<?, K, T> getmin, K k, boolean z) {
            this.queue = new setTitleBackgroundImage<>(i);
            this.parent = getmin;
            this.key = k;
            this.delayError = z;
        }

        public final void dispose() {
            if (this.cancelled.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.actual.lazySet((Object) null);
                this.parent.cancel(this.key);
            }
        }

        public final boolean isDisposed() {
            return this.cancelled.get();
        }

        public final void subscribe(GriverProgressBar<? super T> griverProgressBar) {
            if (this.once.compareAndSet(false, true)) {
                griverProgressBar.onSubscribe(this);
                this.actual.lazySet(griverProgressBar);
                if (this.cancelled.get()) {
                    this.actual.lazySet((Object) null);
                } else {
                    drain();
                }
            } else {
                EmptyDisposable.error((Throwable) new IllegalStateException("Only one Observer allowed!"), (GriverProgressBar<?>) griverProgressBar);
            }
        }

        public final void onNext(T t) {
            this.queue.offer(t);
            drain();
        }

        public final void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        public final void onComplete() {
            this.done = true;
            drain();
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            if (getAndIncrement() == 0) {
                setTitleBackgroundImage<T> settitlebackgroundimage = this.queue;
                boolean z = this.delayError;
                GriverProgressBar griverProgressBar = this.actual.get();
                int i = 1;
                while (true) {
                    if (griverProgressBar != null) {
                        while (true) {
                            boolean z2 = this.done;
                            T poll = settitlebackgroundimage.poll();
                            boolean z3 = poll == null;
                            if (!checkTerminated(z2, z3, griverProgressBar, z)) {
                                if (z3) {
                                    break;
                                }
                                griverProgressBar.onNext(poll);
                            } else {
                                return;
                            }
                        }
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                    if (griverProgressBar == null) {
                        griverProgressBar = this.actual.get();
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean checkTerminated(boolean z, boolean z2, GriverProgressBar<? super T> griverProgressBar, boolean z3) {
            if (this.cancelled.get()) {
                this.queue.clear();
                this.parent.cancel(this.key);
                this.actual.lazySet((Object) null);
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!z3) {
                    Throwable th = this.error;
                    if (th != null) {
                        this.queue.clear();
                        this.actual.lazySet((Object) null);
                        griverProgressBar.onError(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        this.actual.lazySet((Object) null);
                        griverProgressBar.onComplete();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = this.error;
                    this.actual.lazySet((Object) null);
                    if (th2 != null) {
                        griverProgressBar.onError(th2);
                    } else {
                        griverProgressBar.onComplete();
                    }
                    return true;
                }
            }
        }
    }
}
