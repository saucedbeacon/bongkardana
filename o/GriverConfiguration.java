package o;

final class GriverConfiguration implements RedDotManager {
    private final BLEServiceUnit setMax;

    public GriverConfiguration(BLEServiceUnit bLEServiceUnit) {
        this.setMax = bLEServiceUnit;
    }

    public final void accept(Object obj) {
        BLEServiceUnit.getMin(this.setMax, (String) obj);
    }
}
