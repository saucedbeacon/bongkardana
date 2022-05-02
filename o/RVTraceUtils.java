package o;

import java.util.List;

final class RVTraceUtils implements RedDotDrawable {
    private final RVTraceKey getMax;

    public RVTraceUtils(RVTraceKey rVTraceKey) {
        this.getMax = rVTraceKey;
    }

    public final Object apply(Object obj) {
        return this.getMax.getSendMoneyMenuItems((List) obj);
    }
}
