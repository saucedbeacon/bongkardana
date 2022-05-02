package o;

final class addUnit implements RedDotManager {
    private final BLEServiceUnit getMax;

    public addUnit(BLEServiceUnit bLEServiceUnit) {
        this.getMax = bLEServiceUnit;
    }

    public final void accept(Object obj) {
        BLEServiceUnit.setMax(this.getMax);
    }
}
