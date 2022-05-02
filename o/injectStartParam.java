package o;

import java.util.concurrent.Callable;

final class injectStartParam implements Callable {
    private final createWorker getMin;

    public injectStartParam(createWorker createworker) {
        this.getMin = createworker;
    }

    public final Object call() {
        return this.getMin.getMerchantOrderFromConfig();
    }
}
