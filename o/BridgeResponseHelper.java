package o;

final class BridgeResponseHelper implements RedDotDrawable {
    private final setTargetExtension setMax;

    public BridgeResponseHelper(setTargetExtension settargetextension) {
        this.setMax = settargetextension;
    }

    public final Object apply(Object obj) {
        return this.setMax.lambda$saveMerchantPromoToCache$12((EngineInitCallback) obj);
    }
}
