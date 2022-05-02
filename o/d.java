package o;

import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class d implements RedDotDrawable {
    private final com_alibaba_ariver_resource_api_ExtOpt$22$1 setMax;
    private final Map setMin;

    public d(com_alibaba_ariver_resource_api_ExtOpt$22$1 com_alibaba_ariver_resource_api_extopt_22_1, Map map) {
        this.setMax = com_alibaba_ariver_resource_api_extopt_22_1;
        this.setMin = map;
    }

    public final Object apply(Object obj) {
        return this.setMax.lambda$getNewMerchantSubCategories$19(this.setMin, (Map.Entry) obj);
    }

    public final class a extends CountDownLatch implements RedDotManager<Throwable>, removeStateDidChangeHandler {
        public Throwable length;

        public final /* synthetic */ void accept(Object obj) throws Exception {
            this.length = (Throwable) obj;
            countDown();
        }

        public a() {
            super(1);
        }

        public final void getMax() {
            countDown();
        }
    }
}
