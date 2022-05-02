package o;

public final class LogContext {
    private final boolean getMax;
    private final boolean setMax;

    public LogContext(boolean z, boolean z2) {
        this.getMax = z;
        this.setMax = z2;
    }

    public final boolean getMin() {
        return this.getMax;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("implicit=[");
        sb.append(this.getMax);
        sb.append(", ");
        sb.append(this.setMax);
        sb.append("]");
        return sb.toString();
    }
}
