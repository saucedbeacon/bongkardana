package o;

import org.json.JSONArray;

final class com_alibaba_ariver_engine_api_ExtOpt$34$1 implements RedDotDrawable {
    private final createWorker getMin;

    public com_alibaba_ariver_engine_api_ExtOpt$34$1(createWorker createworker) {
        this.getMin = createworker;
    }

    public final Object apply(Object obj) {
        return this.getMin.onGotMerchantOrder((JSONArray) obj);
    }
}
