package o;

import io.reactivex.exceptions.CompositeException;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class getPopAnchor<T> extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<T> {
    final setMinDuration<T> getMin;
    final RedDotManager<? super Throwable> setMax;

    public getPopAnchor(setMinDuration<T> setminduration, RedDotManager<? super Throwable> redDotManager) {
        this.getMin = setminduration;
        this.setMax = redDotManager;
    }

    public final void setMin(TitleBarRightButtonView.CornerMarkingUIController<? super T> cornerMarkingUIController) {
        this.getMin.getMin(new setMin(cornerMarkingUIController));
    }

    final class setMin implements TitleBarRightButtonView.CornerMarkingUIController<T> {
        private final TitleBarRightButtonView.CornerMarkingUIController<? super T> length;

        setMin(TitleBarRightButtonView.CornerMarkingUIController<? super T> cornerMarkingUIController) {
            this.length = cornerMarkingUIController;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            this.length.onSubscribe(updateRunnable);
        }

        public final void onSuccess(T t) {
            this.length.onSuccess(t);
        }

        public final void onError(Throwable th) {
            try {
                getPopAnchor.this.setMax.accept(th);
            } catch (Throwable th2) {
                registerNode.getMax(th2);
                th = new CompositeException(th, th2);
            }
            this.length.onError(th);
        }
    }
}
