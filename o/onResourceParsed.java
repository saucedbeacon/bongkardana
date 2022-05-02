package o;

import java.util.concurrent.Callable;

final class onResourceParsed implements Callable {
    private final createWorker getMin;

    public onResourceParsed(createWorker createworker) {
        this.getMin = createworker;
    }

    public final Object call() {
        return this.getMin.getMerchantTopupsFromConfig();
    }
}
