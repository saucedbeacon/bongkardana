package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class setBackHomeButtonColor<T> extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<T> {
    final TimeUnit getMax;
    final long getMin;
    final setMinDuration<T> length;
    final setMinDuration<? extends T> setMax = null;
    final hasCornerMarking setMin;

    public setBackHomeButtonColor(setMinDuration<T> setminduration, long j, TimeUnit timeUnit, hasCornerMarking hascornermarking) {
        this.length = setminduration;
        this.getMin = j;
        this.getMax = timeUnit;
        this.setMin = hascornermarking;
    }

    public final void setMin(TitleBarRightButtonView.CornerMarkingUIController<? super T> cornerMarkingUIController) {
        length length2 = new length(cornerMarkingUIController, this.setMax, this.getMin, this.getMax);
        cornerMarkingUIController.onSubscribe(length2);
        DisposableHelper.replace(length2.task, this.setMin.scheduleDirect(length2, this.getMin, this.getMax));
        this.length.getMin(length2);
    }

    static final class length<T> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements TitleBarRightButtonView.CornerMarkingUIController<T>, Runnable, GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = 37497744973048446L;
        final TitleBarRightButtonView.CornerMarkingUIController<? super T> downstream;
        final C0109length<T> fallback;
        setMinDuration<? extends T> other;
        final AtomicReference<GriverProgressBar.UpdateRunnable> task = new AtomicReference<>();
        final long timeout;
        final TimeUnit unit;

        /* renamed from: o.setBackHomeButtonColor$length$length  reason: collision with other inner class name */
        static final class C0109length<T> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements TitleBarRightButtonView.CornerMarkingUIController<T> {
            private static final long serialVersionUID = 2071387740092105509L;
            final TitleBarRightButtonView.CornerMarkingUIController<? super T> downstream;

            C0109length(TitleBarRightButtonView.CornerMarkingUIController<? super T> cornerMarkingUIController) {
                this.downstream = cornerMarkingUIController;
            }

            public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
                DisposableHelper.setOnce(this, updateRunnable);
            }

            public final void onSuccess(T t) {
                this.downstream.onSuccess(t);
            }

            public final void onError(Throwable th) {
                this.downstream.onError(th);
            }
        }

        length(TitleBarRightButtonView.CornerMarkingUIController<? super T> cornerMarkingUIController, setMinDuration<? extends T> setminduration, long j, TimeUnit timeUnit) {
            this.downstream = cornerMarkingUIController;
            this.other = setminduration;
            this.timeout = j;
            this.unit = timeUnit;
            if (setminduration != null) {
                this.fallback = new C0109length<>(cornerMarkingUIController);
            } else {
                this.fallback = null;
            }
        }

        public final void run() {
            GriverProgressBar.UpdateRunnable updateRunnable = (GriverProgressBar.UpdateRunnable) get();
            if (updateRunnable != DisposableHelper.DISPOSED && compareAndSet(updateRunnable, DisposableHelper.DISPOSED)) {
                if (updateRunnable != null) {
                    updateRunnable.dispose();
                }
                setMinDuration<? extends T> setminduration = this.other;
                if (setminduration == null) {
                    this.downstream.onError(new TimeoutException(utAvaiable.getMax(this.timeout, this.unit)));
                    return;
                }
                this.other = null;
                setminduration.getMin(this.fallback);
            }
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            DisposableHelper.setOnce(this, updateRunnable);
        }

        public final void onSuccess(T t) {
            GriverProgressBar.UpdateRunnable updateRunnable = (GriverProgressBar.UpdateRunnable) get();
            if (updateRunnable != DisposableHelper.DISPOSED && compareAndSet(updateRunnable, DisposableHelper.DISPOSED)) {
                DisposableHelper.dispose(this.task);
                this.downstream.onSuccess(t);
            }
        }

        public final void onError(Throwable th) {
            GriverProgressBar.UpdateRunnable updateRunnable = (GriverProgressBar.UpdateRunnable) get();
            if (updateRunnable == DisposableHelper.DISPOSED || !compareAndSet(updateRunnable, DisposableHelper.DISPOSED)) {
                SecuritySignature.getMax(th);
                return;
            }
            DisposableHelper.dispose(this.task);
            this.downstream.onError(th);
        }

        public final void dispose() {
            DisposableHelper.dispose(this);
            DisposableHelper.dispose(this.task);
            C0109length<T> length = this.fallback;
            if (length != null) {
                DisposableHelper.dispose(length);
            }
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((GriverProgressBar.UpdateRunnable) get());
        }
    }
}
