package o;

import java.util.concurrent.Callable;

final class com_alibaba_ariver_resource_api_ExtOpt$16$1 implements Callable {
    private final createWorker length;

    public com_alibaba_ariver_resource_api_ExtOpt$16$1(createWorker createworker) {
        this.length = createworker;
    }

    public final Object call() {
        return this.length.getMerchantCategoriesFromConfig();
    }
}
