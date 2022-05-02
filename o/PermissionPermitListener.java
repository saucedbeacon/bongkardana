package o;

final class PermissionPermitListener implements RedDotDrawable {
    private final RDConstant getMin;

    public PermissionPermitListener(RDConstant rDConstant) {
        this.getMin = rDConstant;
    }

    public final Object apply(Object obj) {
        return this.getMin.lambda$getSplitBillHistories$0((tyroRequest) obj);
    }
}
