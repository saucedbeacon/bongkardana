package o;

import io.reactivex.internal.disposables.EmptyDisposable;
import o.TitleBarRightButtonView;

public final class setPageTitle extends TitleBarRightButtonView.AnonymousClass1<Object> {
    public static final TitleBarRightButtonView.AnonymousClass1<Object> length = new setPageTitle();

    private setPageTitle() {
    }

    public final void subscribeActual(GriverProgressBar<? super Object> griverProgressBar) {
        griverProgressBar.onSubscribe(EmptyDisposable.NEVER);
    }
}
