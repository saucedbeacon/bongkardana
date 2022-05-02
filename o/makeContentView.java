package o;

import java.util.concurrent.Callable;

final class makeContentView implements Callable {
    private final String getMin;

    public makeContentView(String str) {
        this.getMin = str;
    }

    public final Object call() {
        return BottomPopup.length(this.getMin);
    }
}
