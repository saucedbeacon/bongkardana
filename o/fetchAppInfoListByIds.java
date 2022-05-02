package o;

final class fetchAppInfoListByIds implements RedDotManager {
    private final BLEServiceUnit setMin;

    public fetchAppInfoListByIds(BLEServiceUnit bLEServiceUnit) {
        this.setMin = bLEServiceUnit;
    }

    public final void accept(Object obj) {
        this.setMin.create.getMax(false, "ID");
    }
}
