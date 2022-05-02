package o;

final class BLEStateUnit implements RedDotManager {
    private final String getMax;
    private final String setMax;
    private final BLEServiceUnit setMin;

    public BLEStateUnit(BLEServiceUnit bLEServiceUnit, String str, String str2) {
        this.setMin = bLEServiceUnit;
        this.setMax = str;
        this.getMax = str2;
    }

    public final void accept(Object obj) {
        BLEServiceUnit.getMin(this.setMin, this.setMax, this.getMax, (Boolean) obj);
    }
}
