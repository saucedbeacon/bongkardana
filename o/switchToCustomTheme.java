package o;

import io.reactivex.internal.disposables.EmptyDisposable;
import o.TitleBarRightButtonView;

public final class switchToCustomTheme<T> extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<T> {
    final T setMin;

    public switchToCustomTheme(T t) {
        this.setMin = t;
    }

    public final void setMin(TitleBarRightButtonView.CornerMarkingUIController<? super T> cornerMarkingUIController) {
        cornerMarkingUIController.onSubscribe(EmptyDisposable.INSTANCE);
        cornerMarkingUIController.onSuccess(this.setMin);
    }
}
