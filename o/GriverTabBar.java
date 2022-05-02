package o;

import io.reactivex.internal.disposables.EmptyDisposable;
import o.TitleBarRightButtonView;

public final class GriverTabBar extends TitleBarRightButtonView.AnonymousClass1<Object> implements switchStyle<Object> {
    public static final TitleBarRightButtonView.AnonymousClass1<Object> setMax = new GriverTabBar();

    public final Object call() {
        return null;
    }

    private GriverTabBar() {
    }

    public final void subscribeActual(GriverProgressBar<? super Object> griverProgressBar) {
        EmptyDisposable.complete((GriverProgressBar<?>) griverProgressBar);
    }
}
