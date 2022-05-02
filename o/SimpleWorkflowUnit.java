package o;

final class SimpleWorkflowUnit implements RedDotManager {
    private final BLEServiceUnit getMin;

    public SimpleWorkflowUnit(BLEServiceUnit bLEServiceUnit) {
        this.getMin = bLEServiceUnit;
    }

    public final void accept(Object obj) {
        BLEServiceUnit.getMin(this.getMin, (Boolean) obj);
    }
}
