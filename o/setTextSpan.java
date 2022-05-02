package o;

public final class setTextSpan extends isHasFace {
    public isHasFace isInside;

    public setTextSpan() {
        this.getMin = 4;
    }

    public setTextSpan(int i, int i2, isHasFace ishasface) {
        super(i, i2);
        this.getMin = 4;
        this.isInside = ishasface;
        if (ishasface != null) {
            ishasface.getMax(this);
        }
    }
}
