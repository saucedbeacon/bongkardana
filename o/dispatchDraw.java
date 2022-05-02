package o;

final class dispatchDraw implements Runnable {
    private final int getMax;
    private final setSelector setMax;

    public dispatchDraw(setSelector setselector, int i) {
        this.setMax = setselector;
        this.getMax = i;
    }

    public final void run() {
        this.setMax.length.setMax(this.getMax);
    }
}
