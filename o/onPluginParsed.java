package o;

import java.util.concurrent.Callable;

final class onPluginParsed implements Callable {
    private final com_alibaba_ariver_resource_api_ExtOpt$22$1 getMin;
    private final String length;

    public onPluginParsed(com_alibaba_ariver_resource_api_ExtOpt$22$1 com_alibaba_ariver_resource_api_extopt_22_1, String str) {
        this.getMin = com_alibaba_ariver_resource_api_extopt_22_1;
        this.length = str;
    }

    public final Object call() {
        return this.getMin.lambda$getMerchantOrder$0(this.length);
    }
}
