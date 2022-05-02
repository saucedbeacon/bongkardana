package o;

import java.util.concurrent.Callable;

final class register implements Callable {
    private final RVParams getMin;
    private final deserializ length;
    private final String setMin;

    public register(deserializ deserializ, String str, RVParams rVParams) {
        this.length = deserializ;
        this.setMin = str;
        this.getMin = rVParams;
    }

    public final Object call() {
        return this.length.lambda$saveUserLastCoordinate$2(this.setMin, this.getMin);
    }
}
