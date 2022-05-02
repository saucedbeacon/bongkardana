package o;

import java.util.concurrent.Callable;

final class WheelPicker implements Callable {
    private final String getMax;
    private final int getMin = 100;
    private final int setMin;

    public WheelPicker(String str, int i) {
        this.getMax = str;
        this.setMin = i;
    }

    public final Object call() {
        return BottomPopup.getMin(this.getMax, this.setMin, this.getMin);
    }
}
