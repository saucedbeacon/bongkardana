package o;

final class isFocused implements Runnable {
    private final long getMax;
    private final setSelector getMin;

    public isFocused(setSelector setselector, long j) {
        this.getMin = setselector;
        this.getMax = j;
    }

    public final void run() {
        this.getMin.length.setMin(this.getMax);
    }
}
