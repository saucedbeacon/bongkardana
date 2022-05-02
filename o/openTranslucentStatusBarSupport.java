package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class openTranslucentStatusBarSupport<T> extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<T> {
    final setMinDuration<T> getMin;
    final hasCornerMarking length;

    public openTranslucentStatusBarSupport(setMinDuration<T> setminduration, hasCornerMarking hascornermarking) {
        this.getMin = setminduration;
        this.length = hascornermarking;
    }

    public final void setMin(TitleBarRightButtonView.CornerMarkingUIController<? super T> cornerMarkingUIController) {
        this.getMin.getMin(new getMax(cornerMarkingUIController, this.length));
    }

    static final class getMax<T> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements TitleBarRightButtonView.CornerMarkingUIController<T>, GriverProgressBar.UpdateRunnable, Runnable {
        private static final long serialVersionUID = 3528003840217436037L;
        final TitleBarRightButtonView.CornerMarkingUIController<? super T> downstream;
        Throwable error;
        final hasCornerMarking scheduler;
        T value;

        getMax(TitleBarRightButtonView.CornerMarkingUIController<? super T> cornerMarkingUIController, hasCornerMarking hascornermarking) {
            this.downstream = cornerMarkingUIController;
            this.scheduler = hascornermarking;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.setOnce(this, updateRunnable)) {
                this.downstream.onSubscribe(this);
            }
        }

        public final void onSuccess(T t) {
            this.value = t;
            DisposableHelper.replace(this, this.scheduler.scheduleDirect(this));
        }

        public final void onError(Throwable th) {
            this.error = th;
            DisposableHelper.replace(this, this.scheduler.scheduleDirect(this));
        }

        public final void run() {
            Throwable th = this.error;
            if (th != null) {
                this.downstream.onError(th);
            } else {
                this.downstream.onSuccess(this.value);
            }
        }

        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((GriverProgressBar.UpdateRunnable) get());
        }
    }
}
