package o;

final class sendBridgeResult implements RedDotDrawable {
    private final double getMax;
    private final setTargetExtension getMin;
    private final double setMin;

    public sendBridgeResult(setTargetExtension settargetextension, double d, double d2) {
        this.getMin = settargetextension;
        this.setMin = d;
        this.getMax = d2;
    }

    public final Object apply(Object obj) {
        return this.getMin.lambda$getOtherStoreList$15(this.setMin, this.getMax, (EngineSetupCallback) obj);
    }
}
