package o;

import o.TitleBarRightButtonView;

final class setMaxFrame implements RedDotDrawable {
    private final TitleBarRightButtonView.AnonymousClass1 setMax;
    private final setMinProgress setMin;

    public setMaxFrame(setMinProgress setminprogress, TitleBarRightButtonView.AnonymousClass1 r2) {
        this.setMin = setminprogress;
        this.setMax = r2;
    }

    public final Object apply(Object obj) {
        return this.setMin.lambda$holdLoginAndRetry$2(this.setMax, (Throwable) obj);
    }
}
