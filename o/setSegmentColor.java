package o;

import java.util.concurrent.atomic.AtomicInteger;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class setSegmentColor<T> extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<Boolean> implements getSecondFloorView<Boolean> {
    final TitleBarRightButtonView.AnonymousClass4<? extends T> getMax;
    final int getMin;
    final setBounds<? super T, ? super T> length;
    final TitleBarRightButtonView.AnonymousClass4<? extends T> setMin;

    public setSegmentColor(TitleBarRightButtonView.AnonymousClass4<? extends T> r1, TitleBarRightButtonView.AnonymousClass4<? extends T> r2, setBounds<? super T, ? super T> setbounds, int i) {
        this.getMax = r1;
        this.setMin = r2;
        this.length = setbounds;
        this.getMin = i;
    }

    public final void setMin(TitleBarRightButtonView.CornerMarkingUIController<? super Boolean> cornerMarkingUIController) {
        setMin setmin = new setMin(cornerMarkingUIController, this.getMin, this.getMax, this.setMin, this.length);
        cornerMarkingUIController.onSubscribe(setmin);
        setmin.subscribe();
    }

    public final TitleBarRightButtonView.AnonymousClass1<Boolean> setMax() {
        clearCheck clearcheck = new clearCheck(this.getMax, this.setMin, this.length, this.getMin);
        RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
        return redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, clearcheck) : clearcheck;
    }

    static final class setMin<T> extends AtomicInteger implements GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = -6178010334400373240L;
        volatile boolean cancelled;
        final setBounds<? super T, ? super T> comparer;
        final TitleBarRightButtonView.CornerMarkingUIController<? super Boolean> downstream;
        final TitleBarRightButtonView.AnonymousClass4<? extends T> first;
        final setMax<T>[] observers;
        final GriverLoadMoreFooter resources = new GriverLoadMoreFooter(2);
        final TitleBarRightButtonView.AnonymousClass4<? extends T> second;
        T v1;
        T v2;

        setMin(TitleBarRightButtonView.CornerMarkingUIController<? super Boolean> cornerMarkingUIController, int i, TitleBarRightButtonView.AnonymousClass4<? extends T> r3, TitleBarRightButtonView.AnonymousClass4<? extends T> r4, setBounds<? super T, ? super T> setbounds) {
            this.downstream = cornerMarkingUIController;
            this.first = r3;
            this.second = r4;
            this.comparer = setbounds;
            setMax<T>[] setmaxArr = new setMax[2];
            this.observers = setmaxArr;
            setmaxArr[0] = new setMax<>(this, 0, i);
            setmaxArr[1] = new setMax<>(this, 1, i);
        }

        /* access modifiers changed from: package-private */
        public final boolean setDisposable(GriverProgressBar.UpdateRunnable updateRunnable, int i) {
            return this.resources.setResource(i, updateRunnable);
        }

        /* access modifiers changed from: package-private */
        public final void subscribe() {
            setMax<T>[] setmaxArr = this.observers;
            this.first.subscribe(setmaxArr[0]);
            this.second.subscribe(setmaxArr[1]);
        }

        public final void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.resources.dispose();
                if (getAndIncrement() == 0) {
                    setMax<T>[] setmaxArr = this.observers;
                    setmaxArr[0].length.clear();
                    setmaxArr[1].length.clear();
                }
            }
        }

        public final boolean isDisposed() {
            return this.cancelled;
        }

        /* access modifiers changed from: package-private */
        public final void cancel(setTitleBackgroundImage<T> settitlebackgroundimage, setTitleBackgroundImage<T> settitlebackgroundimage2) {
            this.cancelled = true;
            settitlebackgroundimage.clear();
            settitlebackgroundimage2.clear();
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            Throwable th;
            Throwable th2;
            if (getAndIncrement() == 0) {
                setMax<T>[] setmaxArr = this.observers;
                setMax<T> setmax = setmaxArr[0];
                setTitleBackgroundImage<T> settitlebackgroundimage = setmax.length;
                setMax<T> setmax2 = setmaxArr[1];
                setTitleBackgroundImage<T> settitlebackgroundimage2 = setmax2.length;
                int i = 1;
                while (!this.cancelled) {
                    boolean z = setmax.getMax;
                    if (!z || (th2 = setmax.setMax) == null) {
                        boolean z2 = setmax2.getMax;
                        if (!z2 || (th = setmax2.setMax) == null) {
                            if (this.v1 == null) {
                                this.v1 = settitlebackgroundimage.poll();
                            }
                            boolean z3 = this.v1 == null;
                            if (this.v2 == null) {
                                this.v2 = settitlebackgroundimage2.poll();
                            }
                            boolean z4 = this.v2 == null;
                            if (z && z2 && z3 && z4) {
                                this.downstream.onSuccess(Boolean.TRUE);
                                return;
                            } else if (!z || !z2 || z3 == z4) {
                                if (!z3 && !z4) {
                                    try {
                                        if (!this.comparer.getMin(this.v1, this.v2)) {
                                            cancel(settitlebackgroundimage, settitlebackgroundimage2);
                                            this.downstream.onSuccess(Boolean.FALSE);
                                            return;
                                        }
                                        this.v1 = null;
                                        this.v2 = null;
                                    } catch (Throwable th3) {
                                        registerNode.getMax(th3);
                                        cancel(settitlebackgroundimage, settitlebackgroundimage2);
                                        this.downstream.onError(th3);
                                        return;
                                    }
                                }
                                if ((z3 || z4) && (i = addAndGet(-i)) == 0) {
                                    return;
                                }
                            } else {
                                cancel(settitlebackgroundimage, settitlebackgroundimage2);
                                this.downstream.onSuccess(Boolean.FALSE);
                                return;
                            }
                        } else {
                            cancel(settitlebackgroundimage, settitlebackgroundimage2);
                            this.downstream.onError(th);
                            return;
                        }
                    } else {
                        cancel(settitlebackgroundimage, settitlebackgroundimage2);
                        this.downstream.onError(th2);
                        return;
                    }
                }
                settitlebackgroundimage.clear();
                settitlebackgroundimage2.clear();
            }
        }
    }

    static final class setMax<T> implements GriverProgressBar<T> {
        volatile boolean getMax;
        final setMin<T> getMin;
        final setTitleBackgroundImage<T> length;
        Throwable setMax;
        final int setMin;

        setMax(setMin<T> setmin, int i, int i2) {
            this.getMin = setmin;
            this.setMin = i;
            this.length = new setTitleBackgroundImage<>(i2);
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            this.getMin.setDisposable(updateRunnable, this.setMin);
        }

        public final void onNext(T t) {
            this.length.offer(t);
            this.getMin.drain();
        }

        public final void onError(Throwable th) {
            this.setMax = th;
            this.getMax = true;
            this.getMin.drain();
        }

        public final void onComplete() {
            this.getMax = true;
            this.getMin.drain();
        }
    }
}
