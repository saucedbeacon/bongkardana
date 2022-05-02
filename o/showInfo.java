package o;

public final class showInfo extends isHasFace {
    public showInfo() {
    }

    public showInfo(int i, int i2, int i3) {
        super(i, i2);
        setMax(i3);
    }

    /* access modifiers changed from: private */
    /* renamed from: toIntRange */
    public showInfo setMax(int i) {
        if (i == 43 || i == 42 || i == 45 || i == 44 || i == 161) {
            this.getMin = i;
            return this;
        }
        throw new IllegalArgumentException("Invalid node type: ".concat(String.valueOf(i)));
    }
}
