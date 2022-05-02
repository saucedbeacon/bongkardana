package o;

final class Constant implements RedDotManager {
    private final BLEServiceUnit length;

    public Constant(BLEServiceUnit bLEServiceUnit) {
        this.length = bLEServiceUnit;
    }

    public final void accept(Object obj) {
        BLEServiceUnit.setMax(this.length, (PageProcessPoint) obj);
    }
}
