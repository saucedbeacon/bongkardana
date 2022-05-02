package o;

import java.util.concurrent.Callable;

final class RegistryException implements Callable {
    private final Plugin getMin;
    private final int length;
    private final String setMax;

    public RegistryException(Plugin plugin, String str, int i) {
        this.getMin = plugin;
        this.setMax = str;
        this.length = i;
    }

    public final Object call() {
        return this.getMin.lambda$reStart$1(this.setMax, this.length);
    }
}
