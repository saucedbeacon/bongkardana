package o;

import o.H5NavMenuItem;
import o.TitleBarRightButtonView;

public final class transparentTitleBar<T> extends TitleBarRightButtonView.AnonymousClass1<T> implements switchStyle<T> {
    private final T getMin;

    public transparentTitleBar(T t) {
        this.getMin = t;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        H5NavMenuItem.setMax setmax = new H5NavMenuItem.setMax(griverProgressBar, this.getMin);
        griverProgressBar.onSubscribe(setmax);
        setmax.run();
    }

    public final T call() {
        return this.getMin;
    }
}
