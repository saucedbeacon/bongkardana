package o;

public final class isEyeBlink extends isHasFace {
    public int equals = -1;
    public isHasFace isInside;
    public int toDoubleRange = -1;
    public isHasFace toFloatRange;
    public isHasFace toIntRange;

    public isEyeBlink() {
        this.getMin = 103;
    }

    public isEyeBlink(int i, int i2) {
        super(i, i2);
        this.getMin = 103;
    }

    public final boolean toDoubleRange() {
        isHasFace ishasface;
        if (this.toFloatRange != null && (ishasface = this.isInside) != null && this.toIntRange != null) {
            return ishasface.toDoubleRange() && this.toIntRange.toDoubleRange();
        }
        throw getStyleId.setMin();
    }
}
