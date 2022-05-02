package o;

import java.util.concurrent.Callable;

final class getExtensionsByPoint implements Callable {
    private final int getMin;
    private final String setMax;
    private final Plugin setMin;

    public getExtensionsByPoint(Plugin plugin, String str, int i) {
        this.setMin = plugin;
        this.setMax = str;
        this.getMin = i;
    }

    public final Object call() {
        return this.setMin.lambda$start$0(this.setMax, this.getMin);
    }
}
