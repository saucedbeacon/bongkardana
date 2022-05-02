package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class setBackButtonColor<T> extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<T> {
    final setMinDuration<? extends T> getMax;
    final hasCornerMarking getMin;

    public setBackButtonColor(setMinDuration<? extends T> setminduration, hasCornerMarking hascornermarking) {
        this.getMax = setminduration;
        this.getMin = hascornermarking;
    }

    public final void setMin(TitleBarRightButtonView.CornerMarkingUIController<? super T> cornerMarkingUIController) {
        setMax setmax = new setMax(cornerMarkingUIController, this.getMax);
        cornerMarkingUIController.onSubscribe(setmax);
        setmax.task.replace(this.getMin.scheduleDirect(setmax));
    }

    static final class setMax<T> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements TitleBarRightButtonView.CornerMarkingUIController<T>, GriverProgressBar.UpdateRunnable, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        final TitleBarRightButtonView.CornerMarkingUIController<? super T> downstream;
        final setMinDuration<? extends T> source;
        final setLoadMoreTipColor task = new setLoadMoreTipColor();

        setMax(TitleBarRightButtonView.CornerMarkingUIController<? super T> cornerMarkingUIController, setMinDuration<? extends T> setminduration) {
            this.downstream = cornerMarkingUIController;
            this.source = setminduration;
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

        public final void dispose() {
            DisposableHelper.dispose(this);
            this.task.dispose();
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((GriverProgressBar.UpdateRunnable) get());
        }

        public final void run() {
            this.source.getMin(this);
        }
    }
}
