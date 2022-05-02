package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class ProgressView<T> extends TitleBarRightButtonView.AnonymousClass1<T> {
    final TitleBarRightButtonView.AnonymousClass4<? extends T>[] getMin;
    final Iterable<? extends TitleBarRightButtonView.AnonymousClass4<? extends T>> setMax;

    public ProgressView(TitleBarRightButtonView.AnonymousClass4<? extends T>[] r1, Iterable<? extends TitleBarRightButtonView.AnonymousClass4<? extends T>> iterable) {
        this.getMin = r1;
        this.setMax = iterable;
    }

    public final class TimerHandler<T, U extends Collection<? super T>> extends onLoadMoreStateChanged<T, U> {
        final Callable<U> getMax;
        final int getMin;
        final int setMax;

        public TimerHandler(TitleBarRightButtonView.AnonymousClass4<T> r1, int i, int i2, Callable<U> callable) {
            super(r1);
            this.setMax = i;
            this.getMin = i2;
            this.getMax = callable;
        }

        public final void subscribeActual(GriverProgressBar<? super U> griverProgressBar) {
            if (this.getMin == this.setMax) {
                length length2 = new length(griverProgressBar, this.setMax, this.getMax);
                if (length2.length()) {
                    this.setMin.subscribe(length2);
                    return;
                }
                return;
            }
            this.setMin.subscribe(new setMin(griverProgressBar, this.setMax, this.getMin, this.getMax));
        }

        static final class length<T, U extends Collection<? super T>> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
            GriverProgressBar.UpdateRunnable equals;
            U getMax;
            final GriverProgressBar<? super U> getMin;
            final int length;
            final Callable<U> setMax;
            int setMin;

            length(GriverProgressBar<? super U> griverProgressBar, int i, Callable<U> callable) {
                this.getMin = griverProgressBar;
                this.length = i;
                this.setMax = callable;
            }

            /* access modifiers changed from: package-private */
            public final boolean length() {
                try {
                    this.getMax = (Collection) setRefreshAnimation.getMax(this.setMax.call(), "Empty buffer supplied");
                    return true;
                } catch (Throwable th) {
                    registerNode.getMax(th);
                    this.getMax = null;
                    GriverProgressBar.UpdateRunnable updateRunnable = this.equals;
                    if (updateRunnable == null) {
                        EmptyDisposable.error(th, (GriverProgressBar<?>) this.getMin);
                        return false;
                    }
                    updateRunnable.dispose();
                    this.getMin.onError(th);
                    return false;
                }
            }

            public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
                if (DisposableHelper.validate(this.equals, updateRunnable)) {
                    this.equals = updateRunnable;
                    this.getMin.onSubscribe(this);
                }
            }

            public final void dispose() {
                this.equals.dispose();
            }

            public final boolean isDisposed() {
                return this.equals.isDisposed();
            }

            public final void onNext(T t) {
                U u = this.getMax;
                if (u != null) {
                    u.add(t);
                    int i = this.setMin + 1;
                    this.setMin = i;
                    if (i >= this.length) {
                        this.getMin.onNext(u);
                        this.setMin = 0;
                        length();
                    }
                }
            }

            public final void onError(Throwable th) {
                this.getMax = null;
                this.getMin.onError(th);
            }

            public final void onComplete() {
                U u = this.getMax;
                if (u != null) {
                    this.getMax = null;
                    if (!u.isEmpty()) {
                        this.getMin.onNext(u);
                    }
                    this.getMin.onComplete();
                }
            }
        }

        static final class setMin<T, U extends Collection<? super T>> extends AtomicBoolean implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
            private static final long serialVersionUID = -8223395059921494546L;
            final Callable<U> bufferSupplier;
            final ArrayDeque<U> buffers = new ArrayDeque<>();
            final int count;
            final GriverProgressBar<? super U> downstream;
            long index;
            final int skip;
            GriverProgressBar.UpdateRunnable upstream;

            setMin(GriverProgressBar<? super U> griverProgressBar, int i, int i2, Callable<U> callable) {
                this.downstream = griverProgressBar;
                this.count = i;
                this.skip = i2;
                this.bufferSupplier = callable;
            }

            public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
                if (DisposableHelper.validate(this.upstream, updateRunnable)) {
                    this.upstream = updateRunnable;
                    this.downstream.onSubscribe(this);
                }
            }

            public final void dispose() {
                this.upstream.dispose();
            }

            public final boolean isDisposed() {
                return this.upstream.isDisposed();
            }

            public final void onNext(T t) {
                long j = this.index;
                this.index = 1 + j;
                if (j % ((long) this.skip) == 0) {
                    try {
                        this.buffers.offer((Collection) setRefreshAnimation.getMax(this.bufferSupplier.call(), "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources."));
                    } catch (Throwable th) {
                        this.buffers.clear();
                        this.upstream.dispose();
                        this.downstream.onError(th);
                        return;
                    }
                }
                Iterator<U> it = this.buffers.iterator();
                while (it.hasNext()) {
                    Collection collection = (Collection) it.next();
                    collection.add(t);
                    if (this.count <= collection.size()) {
                        it.remove();
                        this.downstream.onNext(collection);
                    }
                }
            }

            public final void onError(Throwable th) {
                this.buffers.clear();
                this.downstream.onError(th);
            }

            public final void onComplete() {
                while (!this.buffers.isEmpty()) {
                    this.downstream.onNext(this.buffers.poll());
                }
                this.downstream.onComplete();
            }
        }
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        int i;
        TitleBarRightButtonView.AnonymousClass4<? extends T>[] r0 = this.getMin;
        if (r0 == null) {
            r0 = new TitleBarRightButtonView.AnonymousClass4[8];
            try {
                i = 0;
                for (TitleBarRightButtonView.AnonymousClass4<? extends T> r4 : this.setMax) {
                    if (r4 == null) {
                        EmptyDisposable.error((Throwable) new NullPointerException("One of the sources is null"), (GriverProgressBar<?>) griverProgressBar);
                        return;
                    }
                    if (i == r0.length) {
                        TitleBarRightButtonView.AnonymousClass4<? extends T>[] r5 = new TitleBarRightButtonView.AnonymousClass4[((i >> 2) + i)];
                        System.arraycopy(r0, 0, r5, 0, i);
                        r0 = r5;
                    }
                    int i2 = i + 1;
                    r0[i] = r4;
                    i = i2;
                }
            } catch (Throwable th) {
                registerNode.getMax(th);
                EmptyDisposable.error(th, (GriverProgressBar<?>) griverProgressBar);
                return;
            }
        } else {
            i = r0.length;
        }
        if (i == 0) {
            EmptyDisposable.complete((GriverProgressBar<?>) griverProgressBar);
        } else if (i == 1) {
            r0[0].subscribe(griverProgressBar);
        } else {
            new setMin(griverProgressBar, i).setMin(r0);
        }
    }

    static final class setMin<T> implements GriverProgressBar.UpdateRunnable {
        final getMin<T>[] getMax;
        final GriverProgressBar<? super T> setMax;
        final AtomicInteger setMin = new AtomicInteger();

        setMin(GriverProgressBar<? super T> griverProgressBar, int i) {
            this.setMax = griverProgressBar;
            this.getMax = new getMin[i];
        }

        public final void setMin(TitleBarRightButtonView.AnonymousClass4<? extends T>[] r8) {
            getMin<T>[] getminArr = this.getMax;
            int length = getminArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                getminArr[i] = new getMin<>(this, i2, this.setMax);
                i = i2;
            }
            this.setMin.lazySet(0);
            this.setMax.onSubscribe(this);
            for (int i3 = 0; i3 < length && this.setMin.get() == 0; i3++) {
                r8[i3].subscribe(getminArr[i3]);
            }
        }

        public final boolean setMin(int i) {
            int i2 = this.setMin.get();
            int i3 = 0;
            if (i2 != 0) {
                return i2 == i;
            }
            if (!this.setMin.compareAndSet(0, i)) {
                return false;
            }
            getMin<T>[] getminArr = this.getMax;
            int length = getminArr.length;
            while (i3 < length) {
                int i4 = i3 + 1;
                if (i4 != i) {
                    getminArr[i3].dispose();
                }
                i3 = i4;
            }
            return true;
        }

        public final void dispose() {
            if (this.setMin.get() != -1) {
                this.setMin.lazySet(-1);
                for (getMin<T> dispose : this.getMax) {
                    dispose.dispose();
                }
            }
        }

        public final boolean isDisposed() {
            return this.setMin.get() == -1;
        }
    }

    static final class getMin<T> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements GriverProgressBar<T> {
        private static final long serialVersionUID = -1185974347409665484L;
        final GriverProgressBar<? super T> downstream;
        final int index;
        final setMin<T> parent;
        boolean won;

        getMin(setMin<T> setmin, int i, GriverProgressBar<? super T> griverProgressBar) {
            this.parent = setmin;
            this.index = i;
            this.downstream = griverProgressBar;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            DisposableHelper.setOnce(this, updateRunnable);
        }

        public final void onNext(T t) {
            if (this.won) {
                this.downstream.onNext(t);
            } else if (this.parent.setMin(this.index)) {
                this.won = true;
                this.downstream.onNext(t);
            } else {
                ((GriverProgressBar.UpdateRunnable) get()).dispose();
            }
        }

        public final void onError(Throwable th) {
            if (this.won) {
                this.downstream.onError(th);
            } else if (this.parent.setMin(this.index)) {
                this.won = true;
                this.downstream.onError(th);
            } else {
                SecuritySignature.getMax(th);
            }
        }

        public final void onComplete() {
            if (this.won) {
                this.downstream.onComplete();
            } else if (this.parent.setMin(this.index)) {
                this.won = true;
                this.downstream.onComplete();
            }
        }

        public final void dispose() {
            DisposableHelper.dispose(this);
        }
    }
}
