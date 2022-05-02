package o;

final class WorkflowUnit implements RedDotManager {
    private final BLEServiceUnit setMin;

    public WorkflowUnit(BLEServiceUnit bLEServiceUnit) {
        this.setMin = bLEServiceUnit;
    }

    public final void accept(Object obj) {
        this.setMin.create.getMin(BLEServiceUnit.toFloatRange((String) obj), (String) obj);
    }
}
