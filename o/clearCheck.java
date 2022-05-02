package o;

import java.util.concurrent.atomic.AtomicInteger;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class clearCheck<T> extends TitleBarRightButtonView.AnonymousClass1<Boolean> {
    final TitleBarRightButtonView.AnonymousClass4<? extends T> getMax;
    final setBounds<? super T, ? super T> getMin;
    final TitleBarRightButtonView.AnonymousClass4<? extends T> length;
    final int setMax;

    public clearCheck(TitleBarRightButtonView.AnonymousClass4<? extends T> r1, TitleBarRightButtonView.AnonymousClass4<? extends T> r2, setBounds<? super T, ? super T> setbounds, int i) {
        this.length = r1;
        this.getMax = r2;
        this.getMin = setbounds;
        this.setMax = i;
    }

    public final void subscribeActual(GriverProgressBar<? super Boolean> griverProgressBar) {
        getMin getmin = new getMin(griverProgressBar, this.setMax, this.length, this.getMax, this.getMin);
        griverProgressBar.onSubscribe(getmin);
        getmin.subscribe();
    }

    static final class getMin<T> extends AtomicInteger implements GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = -6178010334400373240L;
        volatile boolean cancelled;
        final setBounds<? super T, ? super T> comparer;
        final GriverProgressBar<? super Boolean> downstream;
        final TitleBarRightButtonView.AnonymousClass4<? extends T> first;
        final setMin<T>[] observers;
        final GriverLoadMoreFooter resources = new GriverLoadMoreFooter(2);
        final TitleBarRightButtonView.AnonymousClass4<? extends T> second;
        T v1;
        T v2;

        getMin(GriverProgressBar<? super Boolean> griverProgressBar, int i, TitleBarRightButtonView.AnonymousClass4<? extends T> r3, TitleBarRightButtonView.AnonymousClass4<? extends T> r4, setBounds<? super T, ? super T> setbounds) {
            this.downstream = griverProgressBar;
            this.first = r3;
            this.second = r4;
            this.comparer = setbounds;
            setMin<T>[] setminArr = new setMin[2];
            this.observers = setminArr;
            setminArr[0] = new setMin<>(this, 0, i);
            setminArr[1] = new setMin<>(this, 1, i);
        }

        /* access modifiers changed from: package-private */
        public final boolean setDisposable(GriverProgressBar.UpdateRunnable updateRunnable, int i) {
            return this.resources.setResource(i, updateRunnable);
        }

        /* access modifiers changed from: package-private */
        public final void subscribe() {
            setMin<T>[] setminArr = this.observers;
            this.first.subscribe(setminArr[0]);
            this.second.subscribe(setminArr[1]);
        }

        public final void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.resources.dispose();
                if (getAndIncrement() == 0) {
                    setMin<T>[] setminArr = this.observers;
                    setminArr[0].setMax.clear();
                    setminArr[1].setMax.clear();
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
                setMin<T>[] setminArr = this.observers;
                setMin<T> setmin = setminArr[0];
                setTitleBackgroundImage<T> settitlebackgroundimage = setmin.setMax;
                setMin<T> setmin2 = setminArr[1];
                setTitleBackgroundImage<T> settitlebackgroundimage2 = setmin2.setMax;
                int i = 1;
                while (!this.cancelled) {
                    boolean z = setmin.getMax;
                    if (!z || (th2 = setmin.getMin) == null) {
                        boolean z2 = setmin2.getMax;
                        if (!z2 || (th = setmin2.getMin) == null) {
                            if (this.v1 == null) {
                                this.v1 = settitlebackgroundimage.poll();
                            }
                            boolean z3 = this.v1 == null;
                            if (this.v2 == null) {
                                this.v2 = settitlebackgroundimage2.poll();
                            }
                            boolean z4 = this.v2 == null;
                            if (z && z2 && z3 && z4) {
                                this.downstream.onNext(Boolean.TRUE);
                                this.downstream.onComplete();
                                return;
                            } else if (!z || !z2 || z3 == z4) {
                                if (!z3 && !z4) {
                                    try {
                                        if (!this.comparer.getMin(this.v1, this.v2)) {
                                            cancel(settitlebackgroundimage, settitlebackgroundimage2);
                                            this.downstream.onNext(Boolean.FALSE);
                                            this.downstream.onComplete();
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
                                this.downstream.onNext(Boolean.FALSE);
                                this.downstream.onComplete();
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

    static final class setMin<T> implements GriverProgressBar<T> {
        volatile boolean getMax;
        Throwable getMin;
        final int length;
        final setTitleBackgroundImage<T> setMax;
        final getMin<T> setMin;

        setMin(getMin<T> getmin, int i, int i2) {
            this.setMin = getmin;
            this.length = i;
            this.setMax = new setTitleBackgroundImage<>(i2);
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            this.setMin.setDisposable(updateRunnable, this.length);
        }

        public final void onNext(T t) {
            this.setMax.offer(t);
            this.setMin.drain();
        }

        public final void onError(Throwable th) {
            this.getMin = th;
            this.getMax = true;
            this.setMin.drain();
        }

        public final void onComplete() {
            this.getMax = true;
            this.setMin.drain();
        }
    }
}
