package o;

import java.util.concurrent.Callable;

final class matchAppIdRaw implements Callable {
    private final parseColorLong setMin;

    public matchAppIdRaw(parseColorLong parsecolorlong) {
        this.setMin = parsecolorlong;
    }

    public final Object call() {
        return this.setMin.lambda$getMenuCategories$6();
    }
}
