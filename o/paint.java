package o;

import java.util.concurrent.Callable;

final class paint implements Callable {
    private final getFrameMarginVertical$core getMax;
    private final Long getMin;

    /* renamed from: o.paint$default  reason: invalid class name */
    final class Cdefault implements Callable {
        private final getFrameMarginVertical$core getMin;
        private final Long length;

        public Cdefault(getFrameMarginVertical$core getframemarginvertical_core, Long l) {
            this.getMin = getframemarginvertical_core;
            this.length = l;
        }

        public final Object call() {
            return this.getMin.lambda$savePocketLastTimestamp$14(this.length);
        }
    }

    public paint(getFrameMarginVertical$core getframemarginvertical_core, Long l) {
        this.getMax = getframemarginvertical_core;
        this.getMin = l;
    }

    public final Object call() {
        return this.getMax.lambda$setLastActiveTimestamp$12(this.getMin);
    }
}
