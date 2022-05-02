package o;

public final class setRoundWidth extends isHasFace {
    public isHasFace isInside;

    public setRoundWidth() {
        this.getMin = 50;
    }

    public setRoundWidth(int i, int i2, isHasFace ishasface) {
        super(i, i2);
        this.getMin = 50;
        if (ishasface != null) {
            this.isInside = ishasface;
            ishasface.getMax(this);
            return;
        }
        throw new IllegalArgumentException("arg cannot be null");
    }
}
