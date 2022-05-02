package o;

final class findViewByPosition implements Runnable {
    private final getReverseLayout getMax;
    private final boolean length;

    public findViewByPosition(getReverseLayout getreverselayout, boolean z) {
        this.getMax = getreverselayout;
        this.length = z;
    }

    public final void run() {
        this.getMax.getMin.length(this.length);
    }
}
