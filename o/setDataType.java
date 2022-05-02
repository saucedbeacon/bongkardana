package o;

final class setDataType implements RedDotManager {
    private final CaptureListener getMax;

    public setDataType(CaptureListener captureListener) {
        this.getMax = captureListener;
    }

    public final void accept(Object obj) {
        CaptureListener.getMin(this.getMax, (Boolean) obj);
    }
}
