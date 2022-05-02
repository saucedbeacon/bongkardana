package o;

public final class setOffset implements Runnable {
    private final PhotoInfo getMin;

    public setOffset(PhotoInfo photoInfo) {
        this.getMin = photoInfo;
    }

    public final void run() {
        this.getMin.notifyDataSetChanged();
    }
}
