package o;

final class getGatewaySignKey implements RedDotManager {
    private final BLEServiceUnit setMax;

    public getGatewaySignKey(BLEServiceUnit bLEServiceUnit) {
        this.setMax = bLEServiceUnit;
    }

    public final void accept(Object obj) {
        BLEServiceUnit.getMax(this.setMax, (String) obj);
    }
}
