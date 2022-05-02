package o;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Iterator;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class TabBarLayout<T, R> extends onLoadMoreStateChanged<T, R> {
    final RedDotDrawable<? super T, ? extends Iterable<? extends R>> setMax;

    public final class H5TabListener<T> extends TitleBarRightButtonView.AnonymousClass1<T> {
        final Iterable<? extends T> getMax;

        public H5TabListener(Iterable<? extends T> iterable) {
            this.getMax = iterable;
        }

        public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
            try {
                Iterator<? extends T> it = this.getMax.iterator();
                try {
                    if (!it.hasNext()) {
                        EmptyDisposable.complete((GriverProgressBar<?>) griverProgressBar);
                        return;
                    }
                    setMax setmax = new setMax(griverProgressBar, it);
                    griverProgressBar.onSubscribe(setmax);
                    if (!setmax.setMin) {
                        while (!setmax.isDisposed()) {
                            try {
                                setmax.length.onNext(setRefreshAnimation.getMax(setmax.getMin.next(), "The iterator returned a null value"));
                                if (!setmax.isDisposed()) {
                                    try {
                                        if (!setmax.getMin.hasNext()) {
                                            if (!setmax.isDisposed()) {
                                                setmax.length.onComplete();
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        registerNode.getMax(th);
                                        setmax.length.onError(th);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } catch (Throwable th2) {
                                registerNode.getMax(th2);
                                setmax.length.onError(th2);
                                return;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    registerNode.getMax(th3);
                    EmptyDisposable.error(th3, (GriverProgressBar<?>) griverProgressBar);
                }
            } catch (Throwable th4) {
                registerNode.getMax(th4);
                EmptyDisposable.error(th4, (GriverProgressBar<?>) griverProgressBar);
            }
        }

        static final class setMax<T> extends GriverRefreshHeader<T> {
            boolean getMax;
            final Iterator<? extends T> getMin;
            final GriverProgressBar<? super T> length;
            volatile boolean setMax;
            boolean setMin;
            boolean toIntRange;

            setMax(GriverProgressBar<? super T> griverProgressBar, Iterator<? extends T> it) {
                this.length = griverProgressBar;
                this.getMin = it;
            }

            public final int requestFusion(int i) {
                if ((i & 1) == 0) {
                    return 0;
                }
                this.setMin = true;
                return 1;
            }

            @Nullable
            public final T poll() {
                if (this.getMax) {
                    return null;
                }
                if (!this.toIntRange) {
                    this.toIntRange = true;
                } else if (!this.getMin.hasNext()) {
                    this.getMax = true;
                    return null;
                }
                return setRefreshAnimation.getMax(this.getMin.next(), "The iterator returned a null value");
            }

            public final boolean isEmpty() {
                return this.getMax;
            }

            public final void clear() {
                this.getMax = true;
            }

            public final void dispose() {
                this.setMax = true;
            }

            public final boolean isDisposed() {
                return this.setMax;
            }
        }
    }

    public TabBarLayout(TitleBarRightButtonView.AnonymousClass4<T> r1, RedDotDrawable<? super T, ? extends Iterable<? extends R>> redDotDrawable) {
        super(r1);
        this.setMax = redDotDrawable;
    }

    public final void subscribeActual(GriverProgressBar<? super R> griverProgressBar) {
        this.setMin.subscribe(new setMin(griverProgressBar, this.setMax));
    }

    static final class setMin<T, R> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        final GriverProgressBar<? super R> getMax;
        GriverProgressBar.UpdateRunnable length;
        final RedDotDrawable<? super T, ? extends Iterable<? extends R>> setMin;

        setMin(GriverProgressBar<? super R> griverProgressBar, RedDotDrawable<? super T, ? extends Iterable<? extends R>> redDotDrawable) {
            this.getMax = griverProgressBar;
            this.setMin = redDotDrawable;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.length, updateRunnable)) {
                this.length = updateRunnable;
                this.getMax.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            if (this.length != DisposableHelper.DISPOSED) {
                try {
                    GriverProgressBar<? super R> griverProgressBar = this.getMax;
                    for (Object max : (Iterable) this.setMin.apply(t)) {
                        try {
                            try {
                                griverProgressBar.onNext(setRefreshAnimation.getMax(max, "The iterator returned a null value"));
                            } catch (Throwable th) {
                                registerNode.getMax(th);
                                this.length.dispose();
                                onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            registerNode.getMax(th2);
                            this.length.dispose();
                            onError(th2);
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    registerNode.getMax(th3);
                    this.length.dispose();
                    onError(th3);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.length == DisposableHelper.DISPOSED) {
                SecuritySignature.getMax(th);
                return;
            }
            this.length = DisposableHelper.DISPOSED;
            this.getMax.onError(th);
        }

        public final void onComplete() {
            if (this.length != DisposableHelper.DISPOSED) {
                this.length = DisposableHelper.DISPOSED;
                this.getMax.onComplete();
            }
        }

        public final boolean isDisposed() {
            return this.length.isDisposed();
        }

        public final void dispose() {
            this.length.dispose();
            this.length = DisposableHelper.DISPOSED;
        }
    }
}
