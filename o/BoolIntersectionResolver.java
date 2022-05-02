package o;

import java.util.concurrent.Callable;

final class BoolIntersectionResolver implements Callable {
    private final int getMax;
    private final String length;
    private final String setMax;
    private final Plugin setMin;

    public BoolIntersectionResolver(Plugin plugin, String str, int i, String str2) {
        this.setMin = plugin;
        this.length = str;
        this.getMax = i;
        this.setMax = str2;
    }

    public final Object call() {
        return this.setMin.lambda$setSeedExtra$2(this.length, this.getMax, this.setMax);
    }
}
