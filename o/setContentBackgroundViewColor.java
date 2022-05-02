package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class setContentBackgroundViewColor<T> extends SecurityCipher<T> implements getLoadMoreTipView {
    final AtomicReference<setMax<T>> getMax = new AtomicReference<>();
    final TitleBarRightButtonView.AnonymousClass4<T> setMax;

    public setContentBackgroundViewColor(TitleBarRightButtonView.AnonymousClass4<T> r1) {
        this.setMax = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMin(o.RedDotManager<? super o.GriverProgressBar.UpdateRunnable> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<o.setContentBackgroundViewColor$setMax<T>> r0 = r4.getMax
            java.lang.Object r0 = r0.get()
            o.setContentBackgroundViewColor$setMax r0 = (o.setContentBackgroundViewColor.setMax) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.isDisposed()
            if (r1 == 0) goto L_0x0020
        L_0x0010:
            o.setContentBackgroundViewColor$setMax r1 = new o.setContentBackgroundViewColor$setMax
            java.util.concurrent.atomic.AtomicReference<o.setContentBackgroundViewColor$setMax<T>> r2 = r4.getMax
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicReference<o.setContentBackgroundViewColor$setMax<T>> r2 = r4.getMax
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L_0x0000
            r0 = r1
        L_0x0020:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.connect
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0033
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.connect
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            r5.accept(r0)     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x003e
            o.TitleBarRightButtonView$4<T> r5 = r4.setMax
            r5.subscribe(r0)
        L_0x003e:
            return
        L_0x003f:
            r5 = move-exception
            o.registerNode.getMax(r5)
            java.lang.RuntimeException r5 = o.utAvaiable.getMin(r5)
            goto L_0x0049
        L_0x0048:
            throw r5
        L_0x0049:
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setContentBackgroundViewColor.setMin(o.RedDotManager):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void subscribeActual(o.GriverProgressBar<? super T> r4) {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<o.setContentBackgroundViewColor$setMax<T>> r0 = r3.getMax
            java.lang.Object r0 = r0.get()
            o.setContentBackgroundViewColor$setMax r0 = (o.setContentBackgroundViewColor.setMax) r0
            if (r0 != 0) goto L_0x001a
            o.setContentBackgroundViewColor$setMax r1 = new o.setContentBackgroundViewColor$setMax
            java.util.concurrent.atomic.AtomicReference<o.setContentBackgroundViewColor$setMax<T>> r2 = r3.getMax
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicReference<o.setContentBackgroundViewColor$setMax<T>> r2 = r3.getMax
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L_0x0000
            r0 = r1
        L_0x001a:
            o.setContentBackgroundViewColor$setMin r1 = new o.setContentBackgroundViewColor$setMin
            r1.<init>(r4, r0)
            r4.onSubscribe(r1)
            boolean r2 = r0.add(r1)
            if (r2 == 0) goto L_0x0032
            boolean r4 = r1.isDisposed()
            if (r4 == 0) goto L_0x0031
            r0.remove(r1)
        L_0x0031:
            return
        L_0x0032:
            java.lang.Throwable r0 = r0.error
            if (r0 == 0) goto L_0x003a
            r4.onError(r0)
            return
        L_0x003a:
            r4.onComplete()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setContentBackgroundViewColor.subscribeActual(o.GriverProgressBar):void");
    }

    public final void setMin(GriverProgressBar.UpdateRunnable updateRunnable) {
        this.getMax.compareAndSet((setMax) updateRunnable, (Object) null);
    }

    static final class setMax<T> extends AtomicReference<setMin<T>[]> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        static final setMin[] EMPTY = new setMin[0];
        static final setMin[] TERMINATED = new setMin[0];
        private static final long serialVersionUID = -3251430252873581268L;
        final AtomicBoolean connect = new AtomicBoolean();
        final AtomicReference<setMax<T>> current;
        Throwable error;
        final AtomicReference<GriverProgressBar.UpdateRunnable> upstream;

        setMax(AtomicReference<setMax<T>> atomicReference) {
            this.current = atomicReference;
            this.upstream = new AtomicReference<>();
            lazySet(EMPTY);
        }

        public final void dispose() {
            getAndSet(TERMINATED);
            this.current.compareAndSet(this, (Object) null);
            DisposableHelper.dispose(this.upstream);
        }

        public final boolean isDisposed() {
            return get() == TERMINATED;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            DisposableHelper.setOnce(this.upstream, updateRunnable);
        }

        public final void onNext(T t) {
            for (setMin setmin : (setMin[]) get()) {
                setmin.downstream.onNext(t);
            }
        }

        public final void onError(Throwable th) {
            this.error = th;
            this.upstream.lazySet(DisposableHelper.DISPOSED);
            for (setMin setmin : (setMin[]) getAndSet(TERMINATED)) {
                setmin.downstream.onError(th);
            }
        }

        public final void onComplete() {
            this.upstream.lazySet(DisposableHelper.DISPOSED);
            for (setMin setmin : (setMin[]) getAndSet(TERMINATED)) {
                setmin.downstream.onComplete();
            }
        }

        public final boolean add(setMin<T> setmin) {
            setMin[] setminArr;
            setMin[] setminArr2;
            do {
                setminArr = (setMin[]) get();
                if (setminArr == TERMINATED) {
                    return false;
                }
                int length = setminArr.length;
                setminArr2 = new setMin[(length + 1)];
                System.arraycopy(setminArr, 0, setminArr2, 0, length);
                setminArr2[length] = setmin;
            } while (!compareAndSet(setminArr, setminArr2));
            return true;
        }

        public final void remove(setMin<T> setmin) {
            setMin<T>[] setminArr;
            setMin[] setminArr2;
            do {
                setminArr = (setMin[]) get();
                int length = setminArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (setminArr[i2] == setmin) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        setminArr2 = EMPTY;
                        if (length != 1) {
                            setminArr2 = new setMin[(length - 1)];
                            System.arraycopy(setminArr, 0, setminArr2, 0, i);
                            System.arraycopy(setminArr, i + 1, setminArr2, i, (length - i) - 1);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(setminArr, setminArr2));
        }
    }

    static final class setMin<T> extends AtomicReference<setMax<T>> implements GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = 7463222674719692880L;
        final GriverProgressBar<? super T> downstream;

        setMin(GriverProgressBar<? super T> griverProgressBar, setMax<T> setmax) {
            this.downstream = griverProgressBar;
            lazySet(setmax);
        }

        public final void dispose() {
            setMax setmax = (setMax) getAndSet((Object) null);
            if (setmax != null) {
                setmax.remove(this);
            }
        }

        public final boolean isDisposed() {
            return get() == null;
        }
    }
}
