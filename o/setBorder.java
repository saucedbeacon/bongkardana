package o;

public final class setBorder extends isHasFace {
    public isHasFace isInside;

    public setBorder() {
        this.getMin = 73;
    }

    public setBorder(int i, int i2, isHasFace ishasface) {
        super(i, i2);
        this.getMin = 73;
        this.isInside = ishasface;
        if (ishasface != null) {
            ishasface.getMax(this);
        }
    }
}
