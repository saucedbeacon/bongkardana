package o;

final class hasWindowFocus implements Runnable {
    private final long getMax;
    private final setSelector getMin;

    public hasWindowFocus(setSelector setselector, long j) {
        this.getMin = setselector;
        this.getMax = j;
    }

    public final void run() {
        setSelector.setMax(this.getMin, this.getMax);
    }
}
