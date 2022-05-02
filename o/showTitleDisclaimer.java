package o;

import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class showTitleDisclaimer<T, R> extends onLoadMoreStateChanged<T, R> {
    @Nullable
    final Iterable<? extends TitleBarRightButtonView.AnonymousClass4<?>> getMin;
    @Nullable
    final TitleBarRightButtonView.AnonymousClass4<?>[] length;
    @NonNull
    final RedDotDrawable<? super Object[], R> setMax;

    public showTitleDisclaimer(@NonNull TitleBarRightButtonView.AnonymousClass4<T> r1, @NonNull TitleBarRightButtonView.AnonymousClass4<?>[] r2, @NonNull RedDotDrawable<? super Object[], R> redDotDrawable) {
        super(r1);
        this.length = r2;
        this.getMin = null;
        this.setMax = redDotDrawable;
    }

    public showTitleDisclaimer(@NonNull TitleBarRightButtonView.AnonymousClass4<T> r1, @NonNull Iterable<? extends TitleBarRightButtonView.AnonymousClass4<?>> iterable, @NonNull RedDotDrawable<? super Object[], R> redDotDrawable) {
        super(r1);
        this.length = null;
        this.getMin = iterable;
        this.setMax = redDotDrawable;
    }

    public final void subscribeActual(GriverProgressBar<? super R> griverProgressBar) {
        int i;
        TitleBarRightButtonView.AnonymousClass4<?>[] r0 = this.length;
        if (r0 == null) {
            r0 = new TitleBarRightButtonView.AnonymousClass4[8];
            try {
                i = 0;
                for (TitleBarRightButtonView.AnonymousClass4<?> r3 : this.getMin) {
                    if (i == r0.length) {
                        r0 = (TitleBarRightButtonView.AnonymousClass4[]) Arrays.copyOf(r0, (i >> 1) + i);
                    }
                    int i2 = i + 1;
                    r0[i] = r3;
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
            new GriverTitleBar(this.setMin, new setMax()).subscribeActual(griverProgressBar);
            return;
        }
        setMin setmin = new setMin(griverProgressBar, this.setMax, i);
        griverProgressBar.onSubscribe(setmin);
        setmin.subscribe(r0, i);
        this.setMin.subscribe(setmin);
    }

    static final class setMin<T, R> extends AtomicInteger implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = 1577321883966341961L;
        final RedDotDrawable<? super Object[], R> combiner;
        volatile boolean done;
        final GriverProgressBar<? super R> downstream;
        final InterfacePluginInfo error;
        final length[] observers;
        final AtomicReference<GriverProgressBar.UpdateRunnable> upstream;
        final AtomicReferenceArray<Object> values;

        setMin(GriverProgressBar<? super R> griverProgressBar, RedDotDrawable<? super Object[], R> redDotDrawable, int i) {
            this.downstream = griverProgressBar;
            this.combiner = redDotDrawable;
            length[] lengthArr = new length[i];
            for (int i2 = 0; i2 < i; i2++) {
                lengthArr[i2] = new length(this, i2);
            }
            this.observers = lengthArr;
            this.values = new AtomicReferenceArray<>(i);
            this.upstream = new AtomicReference<>();
            this.error = new InterfacePluginInfo();
        }

        /* access modifiers changed from: package-private */
        public final void subscribe(TitleBarRightButtonView.AnonymousClass4<?>[] r6, int i) {
            length[] lengthArr = this.observers;
            AtomicReference<GriverProgressBar.UpdateRunnable> atomicReference = this.upstream;
            for (int i2 = 0; i2 < i && !DisposableHelper.isDisposed(atomicReference.get()) && !this.done; i2++) {
                r6[i2].subscribe(lengthArr[i2]);
            }
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            DisposableHelper.setOnce(this.upstream, updateRunnable);
        }

        public final void onNext(T t) {
            if (!this.done) {
                AtomicReferenceArray<Object> atomicReferenceArray = this.values;
                int length = atomicReferenceArray.length();
                Object[] objArr = new Object[(length + 1)];
                int i = 0;
                objArr[0] = t;
                while (i < length) {
                    Object obj = atomicReferenceArray.get(i);
                    if (obj != null) {
                        i++;
                        objArr[i] = obj;
                    } else {
                        return;
                    }
                }
                try {
                    addUtRecord.getMax(this.downstream, setRefreshAnimation.getMax(this.combiner.apply(objArr), "combiner returned a null value"), this, this.error);
                } catch (Throwable th) {
                    registerNode.getMax(th);
                    dispose();
                    onError(th);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                SecuritySignature.getMax(th);
                return;
            }
            this.done = true;
            cancelAllBut(-1);
            GriverProgressBar<? super R> griverProgressBar = this.downstream;
            InterfacePluginInfo interfacePluginInfo = this.error;
            if (!interfacePluginInfo.addThrowable(th)) {
                SecuritySignature.getMax(th);
            } else if (getAndIncrement() == 0) {
                griverProgressBar.onError(interfacePluginInfo.terminate());
            }
        }

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                cancelAllBut(-1);
                GriverProgressBar<? super R> griverProgressBar = this.downstream;
                InterfacePluginInfo interfacePluginInfo = this.error;
                if (getAndIncrement() == 0) {
                    Throwable terminate = interfacePluginInfo.terminate();
                    if (terminate != null) {
                        griverProgressBar.onError(terminate);
                    } else {
                        griverProgressBar.onComplete();
                    }
                }
            }
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }

        public final void dispose() {
            DisposableHelper.dispose(this.upstream);
            for (length dispose : this.observers) {
                dispose.dispose();
            }
        }

        /* access modifiers changed from: package-private */
        public final void innerNext(int i, Object obj) {
            this.values.set(i, obj);
        }

        /* access modifiers changed from: package-private */
        public final void innerError(int i, Throwable th) {
            this.done = true;
            DisposableHelper.dispose(this.upstream);
            cancelAllBut(i);
            GriverProgressBar<? super R> griverProgressBar = this.downstream;
            InterfacePluginInfo interfacePluginInfo = this.error;
            if (!interfacePluginInfo.addThrowable(th)) {
                SecuritySignature.getMax(th);
            } else if (getAndIncrement() == 0) {
                griverProgressBar.onError(interfacePluginInfo.terminate());
            }
        }

        /* access modifiers changed from: package-private */
        public final void innerComplete(int i, boolean z) {
            if (!z) {
                this.done = true;
                cancelAllBut(i);
                GriverProgressBar<? super R> griverProgressBar = this.downstream;
                InterfacePluginInfo interfacePluginInfo = this.error;
                if (getAndIncrement() == 0) {
                    Throwable terminate = interfacePluginInfo.terminate();
                    if (terminate != null) {
                        griverProgressBar.onError(terminate);
                    } else {
                        griverProgressBar.onComplete();
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void cancelAllBut(int i) {
            length[] lengthArr = this.observers;
            for (int i2 = 0; i2 < lengthArr.length; i2++) {
                if (i2 != i) {
                    lengthArr[i2].dispose();
                }
            }
        }
    }

    static final class length extends AtomicReference<GriverProgressBar.UpdateRunnable> implements GriverProgressBar<Object> {
        private static final long serialVersionUID = 3256684027868224024L;
        boolean hasValue;
        final int index;
        final setMin<?, ?> parent;

        length(setMin<?, ?> setmin, int i) {
            this.parent = setmin;
            this.index = i;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            DisposableHelper.setOnce(this, updateRunnable);
        }

        public final void onNext(Object obj) {
            if (!this.hasValue) {
                this.hasValue = true;
            }
            this.parent.innerNext(this.index, obj);
        }

        public final void onError(Throwable th) {
            this.parent.innerError(this.index, th);
        }

        public final void onComplete() {
            this.parent.innerComplete(this.index, this.hasValue);
        }

        public final void dispose() {
            DisposableHelper.dispose(this);
        }
    }

    final class setMax implements RedDotDrawable<T, R> {
        setMax() {
        }

        public final R apply(T t) throws Exception {
            return setRefreshAnimation.getMax(showTitleDisclaimer.this.setMax.apply(new Object[]{t}), "The combiner returned a null value");
        }
    }
}
