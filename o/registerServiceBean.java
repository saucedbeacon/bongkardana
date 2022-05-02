package o;

import o.TitleBarRightButtonView;

final class registerServiceBean implements RedDotDrawable {
    private final Local getMin;

    public registerServiceBean(Local local) {
        this.getMin = local;
    }

    public final Object apply(Object obj) {
        return TitleBarRightButtonView.AnonymousClass1.just(this.getMin);
    }
}
