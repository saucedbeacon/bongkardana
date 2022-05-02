package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class getDownloadImageUrl<T> extends SecurityCipher<T> implements isPreRenderPage<T> {
    final AtomicReference<setMin<T>> getMax;
    final TitleBarRightButtonView.AnonymousClass4<T> getMin;
    final TitleBarRightButtonView.AnonymousClass4<T> setMax;

    public static <T> SecurityCipher<T> getMin(TitleBarRightButtonView.AnonymousClass4<T> r3) {
        AtomicReference atomicReference = new AtomicReference();
        getDownloadImageUrl getdownloadimageurl = new getDownloadImageUrl(new getMin(atomicReference), r3, atomicReference);
        RedDotDrawable<? super SecurityCipher, ? extends SecurityCipher> redDotDrawable = SecuritySignature.toDoubleRange;
        return redDotDrawable != null ? (SecurityCipher) SecuritySignature.getMax(redDotDrawable, getdownloadimageurl) : getdownloadimageurl;
    }

    private getDownloadImageUrl(TitleBarRightButtonView.AnonymousClass4<T> r1, TitleBarRightButtonView.AnonymousClass4<T> r2, AtomicReference<setMin<T>> atomicReference) {
        this.setMax = r1;
        this.getMin = r2;
        this.getMax = atomicReference;
    }

    public final TitleBarRightButtonView.AnonymousClass4<T> length() {
        return this.getMin;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        this.setMax.subscribe(griverProgressBar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMin(o.RedDotManager<? super o.GriverProgressBar.UpdateRunnable> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<o.getDownloadImageUrl$setMin<T>> r0 = r4.getMax
            java.lang.Object r0 = r0.get()
            o.getDownloadImageUrl$setMin r0 = (o.getDownloadImageUrl.setMin) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.isDisposed()
            if (r1 == 0) goto L_0x0020
        L_0x0010:
            o.getDownloadImageUrl$setMin r1 = new o.getDownloadImageUrl$setMin
            java.util.concurrent.atomic.AtomicReference<o.getDownloadImageUrl$setMin<T>> r2 = r4.getMax
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicReference<o.getDownloadImageUrl$setMin<T>> r2 = r4.getMax
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L_0x0000
            r0 = r1
        L_0x0020:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.setMin
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0033
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.setMin
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            r5.accept(r0)     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x003e
            o.TitleBarRightButtonView$4<T> r5 = r4.getMin
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
        throw new UnsupportedOperationException("Method not decompiled: o.getDownloadImageUrl.setMin(o.RedDotManager):void");
    }

    static final class setMin<T> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        static final getMax[] getMax = new getMax[0];
        static final getMax[] length = new getMax[0];
        final AtomicReference<getMax<T>[]> getMin = new AtomicReference<>(length);
        final AtomicReference<setMin<T>> setMax;
        final AtomicBoolean setMin;
        final AtomicReference<GriverProgressBar.UpdateRunnable> toIntRange = new AtomicReference<>();

        setMin(AtomicReference<setMin<T>> atomicReference) {
            this.setMax = atomicReference;
            this.setMin = new AtomicBoolean();
        }

        public final void dispose() {
            if (((getMax[]) this.getMin.getAndSet(getMax)) != getMax) {
                this.setMax.compareAndSet(this, (Object) null);
                DisposableHelper.dispose(this.toIntRange);
            }
        }

        public final boolean isDisposed() {
            return this.getMin.get() == getMax;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            DisposableHelper.setOnce(this.toIntRange, updateRunnable);
        }

        public final void onNext(T t) {
            for (getMax getmax : (getMax[]) this.getMin.get()) {
                getmax.child.onNext(t);
            }
        }

        public final void onError(Throwable th) {
            this.setMax.compareAndSet(this, (Object) null);
            getMax[] getmaxArr = (getMax[]) this.getMin.getAndSet(getMax);
            if (getmaxArr.length != 0) {
                for (getMax getmax : getmaxArr) {
                    getmax.child.onError(th);
                }
                return;
            }
            SecuritySignature.getMax(th);
        }

        public final void onComplete() {
            this.setMax.compareAndSet(this, (Object) null);
            for (getMax getmax : (getMax[]) this.getMin.getAndSet(getMax)) {
                getmax.child.onComplete();
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean getMax(getMax<T> getmax) {
            getMax[] getmaxArr;
            getMax[] getmaxArr2;
            do {
                getmaxArr = (getMax[]) this.getMin.get();
                if (getmaxArr == getMax) {
                    return false;
                }
                int length2 = getmaxArr.length;
                getmaxArr2 = new getMax[(length2 + 1)];
                System.arraycopy(getmaxArr, 0, getmaxArr2, 0, length2);
                getmaxArr2[length2] = getmax;
            } while (!this.getMin.compareAndSet(getmaxArr, getmaxArr2));
            return true;
        }

        /* access modifiers changed from: package-private */
        public final void length(getMax<T> getmax) {
            getMax[] getmaxArr;
            getMax[] getmaxArr2;
            do {
                getmaxArr = (getMax[]) this.getMin.get();
                int length2 = getmaxArr.length;
                if (length2 != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        } else if (getmaxArr[i2].equals(getmax)) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length2 == 1) {
                            getmaxArr2 = length;
                        } else {
                            getMax[] getmaxArr3 = new getMax[(length2 - 1)];
                            System.arraycopy(getmaxArr, 0, getmaxArr3, 0, i);
                            System.arraycopy(getmaxArr, i + 1, getmaxArr3, i, (length2 - i) - 1);
                            getmaxArr2 = getmaxArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.getMin.compareAndSet(getmaxArr, getmaxArr2));
        }
    }

    static final class getMax<T> extends AtomicReference<Object> implements GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = -1100270633763673112L;
        final GriverProgressBar<? super T> child;

        getMax(GriverProgressBar<? super T> griverProgressBar) {
            this.child = griverProgressBar;
        }

        public final boolean isDisposed() {
            return get() == this;
        }

        public final void dispose() {
            Object andSet = getAndSet(this);
            if (andSet != null && andSet != this) {
                ((setMin) andSet).length(this);
            }
        }

        /* access modifiers changed from: package-private */
        public final void setParent(setMin<T> setmin) {
            if (!compareAndSet((Object) null, setmin)) {
                setmin.length(this);
            }
        }
    }

    static final class getMin<T> implements TitleBarRightButtonView.AnonymousClass4<T> {
        private final AtomicReference<setMin<T>> length;

        getMin(AtomicReference<setMin<T>> atomicReference) {
            this.length = atomicReference;
        }

        public final void subscribe(GriverProgressBar<? super T> griverProgressBar) {
            getMax getmax = new getMax(griverProgressBar);
            griverProgressBar.onSubscribe(getmax);
            while (true) {
                setMin setmin = this.length.get();
                if (setmin == null || setmin.isDisposed()) {
                    setMin setmin2 = new setMin(this.length);
                    if (this.length.compareAndSet(setmin, setmin2)) {
                        setmin = setmin2;
                    } else {
                        continue;
                    }
                }
                if (setmin.getMax(getmax)) {
                    getmax.setParent(setmin);
                    return;
                }
            }
        }
    }
}
