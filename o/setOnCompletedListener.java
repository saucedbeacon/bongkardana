package o;

final class setOnCompletedListener implements RedDotManager {
    private final BLEServiceUnit length;

    public setOnCompletedListener(BLEServiceUnit bLEServiceUnit) {
        this.length = bLEServiceUnit;
    }

    public final void accept(Object obj) {
        BLEServiceUnit.getMax(this.length, (initUC7zSo) obj);
    }
}
