package o;

final class enableTyroBlock implements RedDotDrawable {
    private final RDConstant getMax;

    public enableTyroBlock(RDConstant rDConstant) {
        this.getMax = rDConstant;
    }

    public final Object apply(Object obj) {
        return this.getMax.lambda$getPayerSplitBillDetail$4((onSocketClose) obj);
    }
}
