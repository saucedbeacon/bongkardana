package o;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import o.TitleBarRightButtonView;
import o.switchIconFontToWhiteTheme;

public final class getDeveloperCustomMenu<T, R> extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<R> {
    final Callable<R> getMin;
    final TitleBarRightButtonView.AnonymousClass4<T> length;
    final removeNode<R, ? super T, R> setMax;

    public getDeveloperCustomMenu(TitleBarRightButtonView.AnonymousClass4<T> r1, Callable<R> callable, removeNode<R, ? super T, R> removenode) {
        this.length = r1;
        this.getMin = callable;
        this.setMax = removenode;
    }

    public final void setMin(TitleBarRightButtonView.CornerMarkingUIController<? super R> cornerMarkingUIController) {
        try {
            this.length.subscribe(new switchIconFontToWhiteTheme.getMin(cornerMarkingUIController, this.setMax, setRefreshAnimation.getMax(this.getMin.call(), "The seedSupplier returned a null value")));
        } catch (Throwable th) {
            registerNode.getMax(th);
            EmptyDisposable.error(th, (TitleBarRightButtonView.CornerMarkingUIController<?>) cornerMarkingUIController);
        }
    }
}
