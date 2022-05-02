package o;

import java.util.concurrent.Callable;

final class modifyScrollViewPadding implements Callable {
    private final getFrameMarginVertical$core length;
    private final isItemChecked setMin;

    /* renamed from: o.modifyScrollViewPadding$default  reason: invalid class name */
    final class Cdefault implements Callable {
        private final getFrameMarginVertical$core getMax;

        public Cdefault(getFrameMarginVertical$core getframemarginvertical_core) {
            this.getMax = getframemarginvertical_core;
        }

        public final Object call() {
            return this.getMax.lambda$getLatestTransaction$34();
        }
    }

    public modifyScrollViewPadding(getFrameMarginVertical$core getframemarginvertical_core, isItemChecked isitemchecked) {
        this.length = getframemarginvertical_core;
        this.setMin = isitemchecked;
    }

    public final Object call() {
        return this.length.lambda$saveLastTransaction$33(this.setMin);
    }
}
