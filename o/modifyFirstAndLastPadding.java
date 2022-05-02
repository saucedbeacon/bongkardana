package o;

import o.TitleBarRightButtonView;

final class modifyFirstAndLastPadding implements RedDotDrawable {
    private final Boolean getMin;
    private final getFrameMarginVertical$core setMax;

    /* renamed from: o.modifyFirstAndLastPadding$default  reason: invalid class name */
    final class Cdefault implements RedDotDrawable {
        private final TitleBarRightButtonView.AnonymousClass1 getMin;

        public Cdefault(TitleBarRightButtonView.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final Object apply(Object obj) {
            return getFrameMarginVertical$core.lambda$initAndRetry$35(this.getMin, (Boolean) obj);
        }
    }

    public modifyFirstAndLastPadding(getFrameMarginVertical$core getframemarginvertical_core, Boolean bool) {
        this.setMax = getframemarginvertical_core;
        this.getMin = bool;
    }

    public final Object apply(Object obj) {
        return this.setMax.lambda$setBalanceVisibility$31(this.getMin, (Boolean) obj);
    }
}
