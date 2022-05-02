package o;

import java.util.concurrent.Callable;

final class traceEndSection implements Callable {
    private final RVTraceKey setMax;

    public traceEndSection(RVTraceKey rVTraceKey) {
        this.setMax = rVTraceKey;
    }

    public final Object call() {
        return this.setMax.getMenuCategories();
    }
}
