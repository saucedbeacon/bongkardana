package o;

import kotlin.Pair;

final class IPCCallable implements RedDotDrawable {
    private final int equals;
    private final getIpcProxy getMax;
    private final double getMin;
    private final double length;
    private final String setMax;
    private final Integer setMin;

    public IPCCallable(getIpcProxy getipcproxy, String str, double d, double d2, Integer num, int i) {
        this.getMax = getipcproxy;
        this.setMax = str;
        this.length = d;
        this.getMin = d2;
        this.setMin = num;
        this.equals = i;
    }

    public final Object apply(Object obj) {
        return this.getMax.lambda$getPromoAdsWithComparedCoordinate$2(this.setMax, this.length, this.getMin, this.setMin, this.equals, (Pair) obj);
    }
}
