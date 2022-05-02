package o;

final class RVRemoteDebugProxy implements RedDotDrawable {
    private final String getMax;
    private final RDConstant length;

    public RVRemoteDebugProxy(RDConstant rDConstant, String str) {
        this.length = rDConstant;
        this.getMax = str;
    }

    public final Object apply(Object obj) {
        return this.length.lambda$getSplitBillDetail$1(this.getMax, (onSocketClose) obj);
    }
}
