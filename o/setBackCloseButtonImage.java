package o;

import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Callable;
import o.TitleBarRightButtonView;

public final class setBackCloseButtonImage<T> extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<T> {
    final Callable<? extends T> getMin;

    public setBackCloseButtonImage(Callable<? extends T> callable) {
        this.getMin = callable;
    }

    public final void setMin(TitleBarRightButtonView.CornerMarkingUIController<? super T> cornerMarkingUIController) {
        Runnable runnable = Functions.getMin;
        setRefreshAnimation.getMax(runnable, "run is null");
        OnStateChangeListener onStateChangeListener = new OnStateChangeListener(runnable);
        cornerMarkingUIController.onSubscribe(onStateChangeListener);
        if (!onStateChangeListener.isDisposed()) {
            try {
                Object max = setRefreshAnimation.getMax(this.getMin.call(), "The callable returned a null value");
                if (!onStateChangeListener.isDisposed()) {
                    cornerMarkingUIController.onSuccess(max);
                }
            } catch (Throwable th) {
                registerNode.getMax(th);
                if (!onStateChangeListener.isDisposed()) {
                    cornerMarkingUIController.onError(th);
                } else {
                    SecuritySignature.getMax(th);
                }
            }
        }
    }
}
