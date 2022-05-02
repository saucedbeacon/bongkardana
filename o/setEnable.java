package o;

public final class setEnable extends isHasFace {
    private String isInside;
    public double toIntRange;

    public setEnable() {
        this.getMin = 40;
    }

    private setEnable(int i, String str) {
        super(i);
        this.getMin = 40;
        if (str != null) {
            this.isInside = str;
            equals(str.length());
            return;
        }
        throw new IllegalArgumentException("arg cannot be null");
    }

    public setEnable(int i, String str, double d) {
        this(i, str);
        this.toIntRange = d;
    }
}
