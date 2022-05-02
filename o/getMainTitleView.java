package o;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import o.TitleBarRightButtonView;

public final class getMainTitleView<T> extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<T> {
    final Callable<? extends Throwable> getMin;

    public getMainTitleView(Callable<? extends Throwable> callable) {
        this.getMin = callable;
    }

    public final void setMin(TitleBarRightButtonView.CornerMarkingUIController<? super T> cornerMarkingUIController) {
        try {
            th = (Throwable) setRefreshAnimation.getMax(this.getMin.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            registerNode.getMax(th);
        }
        EmptyDisposable.error(th, (TitleBarRightButtonView.CornerMarkingUIController<?>) cornerMarkingUIController);
    }
}
