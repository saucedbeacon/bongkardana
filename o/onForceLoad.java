package o;

public abstract class onForceLoad implements onActivityPreDestroyed {
    private final long setMax;
    private final int setMin;

    protected onForceLoad(long j, int i) {
        this.setMax = j;
        this.setMin = i;
    }

    private boolean getMin(int i) {
        return (i & this.setMin) != 0;
    }

    public final boolean getMin() {
        return getMin(1);
    }

    public final boolean setMax() {
        return getMin(2);
    }

    public final boolean setMin() {
        return getMin(4);
    }

    public final boolean length() {
        return getMin(8);
    }

    public final boolean getMax() {
        return getMin(16);
    }

    public final boolean toFloatRange() {
        return getMin(32);
    }

    public final boolean isInside() {
        return getMin(128);
    }

    public final boolean toIntRange() {
        return getMin(256);
    }

    public final boolean equals() {
        return getMin(64);
    }

    public final boolean IsOverlapping() {
        return getMin(512);
    }
}
