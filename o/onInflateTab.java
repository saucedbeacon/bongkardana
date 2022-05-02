package o;

import o.TitleBarRightButtonView;

public final class onInflateTab<T> extends TitleBarRightButtonView.AnonymousClass1<T> {
    final TitleBarRightButtonView.AnonymousClass4<T> setMin;

    public onInflateTab(TitleBarRightButtonView.AnonymousClass4<T> r1) {
        this.setMin = r1;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        this.setMin.subscribe(griverProgressBar);
    }
}
