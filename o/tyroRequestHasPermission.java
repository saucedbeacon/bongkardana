package o;

final class tyroRequestHasPermission implements RedDotDrawable {
    private final RDConstant getMin;

    public tyroRequestHasPermission(RDConstant rDConstant) {
        this.getMin = rDConstant;
    }

    public final Object apply(Object obj) {
        return this.getMin.getSplitBillDeeplinkIfEmpty((onSocketClose) obj);
    }
}
