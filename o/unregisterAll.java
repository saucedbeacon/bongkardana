package o;

import java.util.concurrent.Callable;

final class unregisterAll implements Callable {
    private final int length;
    private final String setMax;
    private final deserializ setMin;

    public unregisterAll(deserializ deserializ, String str, int i) {
        this.setMin = deserializ;
        this.setMax = str;
        this.length = i;
    }

    public final Object call() {
        return this.setMin.lambda$saveCurrentAdsPageNumber$3(this.setMax, this.length);
    }
}
