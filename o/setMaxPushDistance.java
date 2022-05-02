package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class setMaxPushDistance<T> implements TitleBarRightButtonView.CornerMarkingUIController<T> {
    final TitleBarRightButtonView.CornerMarkingUIController<? super T> getMin;
    final AtomicReference<GriverProgressBar.UpdateRunnable> setMax;

    public setMaxPushDistance(AtomicReference<GriverProgressBar.UpdateRunnable> atomicReference, TitleBarRightButtonView.CornerMarkingUIController<? super T> cornerMarkingUIController) {
        this.setMax = atomicReference;
        this.getMin = cornerMarkingUIController;
    }

    public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
        DisposableHelper.replace(this.setMax, updateRunnable);
    }

    public final void onSuccess(T t) {
        this.getMin.onSuccess(t);
    }

    public final void onError(Throwable th) {
        this.getMin.onError(th);
    }
}
