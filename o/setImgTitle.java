package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class setImgTitle<T, R> extends TitleBarRightButtonView.AnonymousClass1<R> {
    final RedDotDrawable<? super Object[], ? extends R> getMax;
    final boolean getMin;
    final TitleBarRightButtonView.AnonymousClass4<? extends T>[] length;
    final int setMax;
    final Iterable<? extends TitleBarRightButtonView.AnonymousClass4<? extends T>> setMin;

    public setImgTitle(TitleBarRightButtonView.AnonymousClass4<? extends T>[] r1, Iterable<? extends TitleBarRightButtonView.AnonymousClass4<? extends T>> iterable, RedDotDrawable<? super Object[], ? extends R> redDotDrawable, int i, boolean z) {
        this.length = r1;
        this.setMin = iterable;
        this.getMax = redDotDrawable;
        this.setMax = i;
        this.getMin = z;
    }

    public final void subscribeActual(GriverProgressBar<? super R> griverProgressBar) {
        int i;
        TitleBarRightButtonView.AnonymousClass4<? extends T>[] r0 = this.length;
        if (r0 == null) {
            r0 = new TitleBarRightButtonView.AnonymousClass4[8];
            i = 0;
            for (TitleBarRightButtonView.AnonymousClass4<? extends T> r4 : this.setMin) {
                if (i == r0.length) {
                    TitleBarRightButtonView.AnonymousClass4<? extends T>[] r5 = new TitleBarRightButtonView.AnonymousClass4[((i >> 2) + i)];
                    System.arraycopy(r0, 0, r5, 0, i);
                    r0 = r5;
                }
                r0[i] = r4;
                i++;
            }
        } else {
            i = r0.length;
        }
        if (i == 0) {
            EmptyDisposable.complete((GriverProgressBar<?>) griverProgressBar);
        } else {
            new getMax(griverProgressBar, this.getMax, i, this.getMin).subscribe(r0, this.setMax);
        }
    }

    static final class getMax<T, R> extends AtomicInteger implements GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = 2983708048395377667L;
        volatile boolean cancelled;
        final boolean delayError;
        final GriverProgressBar<? super R> downstream;
        final getMin<T, R>[] observers;
        final T[] row;
        final RedDotDrawable<? super Object[], ? extends R> zipper;

        getMax(GriverProgressBar<? super R> griverProgressBar, RedDotDrawable<? super Object[], ? extends R> redDotDrawable, int i, boolean z) {
            this.downstream = griverProgressBar;
            this.zipper = redDotDrawable;
            this.observers = new getMin[i];
            this.row = (Object[]) new Object[i];
            this.delayError = z;
        }

        public final void subscribe(TitleBarRightButtonView.AnonymousClass4<? extends T>[] r6, int i) {
            getMin<T, R>[] getminArr = this.observers;
            int length = getminArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                getminArr[i2] = new getMin<>(this, i);
            }
            lazySet(0);
            this.downstream.onSubscribe(this);
            for (int i3 = 0; i3 < length && !this.cancelled; i3++) {
                r6[i3].subscribe(getminArr[i3]);
            }
        }

        public final void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                cancelSources();
                if (getAndIncrement() == 0) {
                    clear();
                }
            }
        }

        public final boolean isDisposed() {
            return this.cancelled;
        }

        /* access modifiers changed from: package-private */
        public final void cancel() {
            clear();
            cancelSources();
        }

        /* access modifiers changed from: package-private */
        public final void cancelSources() {
            for (getMin<T, R> getmin : this.observers) {
                DisposableHelper.dispose(getmin.getMax);
            }
        }

        /* access modifiers changed from: package-private */
        public final void clear() {
            for (getMin<T, R> getmin : this.observers) {
                getmin.setMax.clear();
            }
        }

        public final void drain() {
            Throwable th;
            if (getAndIncrement() == 0) {
                getMin<T, R>[] getminArr = this.observers;
                GriverProgressBar<? super R> griverProgressBar = this.downstream;
                T[] tArr = this.row;
                boolean z = this.delayError;
                int i = 1;
                while (true) {
                    int i2 = 0;
                    int i3 = 0;
                    for (getMin<T, R> getmin : getminArr) {
                        if (tArr[i3] == null) {
                            boolean z2 = getmin.getMin;
                            T poll = getmin.setMax.poll();
                            boolean z3 = poll == null;
                            if (!checkTerminated(z2, z3, griverProgressBar, z, getmin)) {
                                if (!z3) {
                                    tArr[i3] = poll;
                                } else {
                                    i2++;
                                }
                            } else {
                                return;
                            }
                        } else if (getmin.getMin && !z && (th = getmin.length) != null) {
                            this.cancelled = true;
                            cancel();
                            griverProgressBar.onError(th);
                            return;
                        }
                        i3++;
                    }
                    if (i2 == 0) {
                        try {
                            griverProgressBar.onNext(setRefreshAnimation.getMax(this.zipper.apply(tArr.clone()), "The zipper returned a null value"));
                            Arrays.fill(tArr, (Object) null);
                        } catch (Throwable th2) {
                            registerNode.getMax(th2);
                            cancel();
                            griverProgressBar.onError(th2);
                            return;
                        }
                    } else {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean checkTerminated(boolean z, boolean z2, GriverProgressBar<? super R> griverProgressBar, boolean z3, getMin<?, ?> getmin) {
            if (this.cancelled) {
                cancel();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!z3) {
                    Throwable th = getmin.length;
                    if (th != null) {
                        this.cancelled = true;
                        cancel();
                        griverProgressBar.onError(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        this.cancelled = true;
                        cancel();
                        griverProgressBar.onComplete();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = getmin.length;
                    this.cancelled = true;
                    cancel();
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

    static final class getMin<T, R> implements GriverProgressBar<T> {
        final AtomicReference<GriverProgressBar.UpdateRunnable> getMax = new AtomicReference<>();
        volatile boolean getMin;
        Throwable length;
        final setTitleBackgroundImage<T> setMax;
        final getMax<T, R> setMin;

        getMin(getMax<T, R> getmax, int i) {
            this.setMin = getmax;
            this.setMax = new setTitleBackgroundImage<>(i);
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            DisposableHelper.setOnce(this.getMax, updateRunnable);
        }

        public final void onNext(T t) {
            this.setMax.offer(t);
            this.setMin.drain();
        }

        public final void onError(Throwable th) {
            this.length = th;
            this.getMin = true;
            this.setMin.drain();
        }

        public final void onComplete() {
            this.getMin = true;
            this.setMin.drain();
        }
    }
}
