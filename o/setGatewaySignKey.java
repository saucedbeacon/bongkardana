package o;

final class setGatewaySignKey implements RedDotManager {
    private final BLEServiceUnit getMax;

    public setGatewaySignKey(BLEServiceUnit bLEServiceUnit) {
        this.getMax = bLEServiceUnit;
    }

    public final void accept(Object obj) {
        this.getMax.create.setMax(BLEServiceUnit.toFloatRange((String) obj), (String) obj);
    }
}
