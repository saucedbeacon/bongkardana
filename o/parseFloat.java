package o;

import java.util.concurrent.Callable;

final class parseFloat implements Callable {
    private final parseColorLong getMax;

    public parseFloat(parseColorLong parsecolorlong) {
        this.getMax = parsecolorlong;
    }

    public final Object call() {
        return this.getMax.lambda$getMenuItemsFromFile$3();
    }
}
