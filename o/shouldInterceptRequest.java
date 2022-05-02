package o;

import java.util.concurrent.Callable;

final class shouldInterceptRequest implements Callable {
    private final createWorker getMax;

    public shouldInterceptRequest(createWorker createworker) {
        this.getMax = createworker;
    }

    public final Object call() {
        return this.getMax.getSubMerchantCategoriesFromConfig();
    }
}
