package o;

final class measureHeightOfChildrenCompat implements Runnable {
    private final int getMax;
    private final setSelector setMin;

    public measureHeightOfChildrenCompat(setSelector setselector, int i) {
        this.setMin = setselector;
        this.getMax = i;
    }

    public final void run() {
        this.setMin.length.getMin(this.getMax);
    }
}
