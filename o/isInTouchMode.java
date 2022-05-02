package o;

final class isInTouchMode implements Runnable {
    private final setSelector getMax;
    private final DialogTitle setMax;

    public isInTouchMode(setSelector setselector, DialogTitle dialogTitle) {
        this.getMax = setselector;
        this.setMax = dialogTitle;
    }

    public final void run() {
        setSelector.getMax(this.getMax, this.setMax);
    }
}
