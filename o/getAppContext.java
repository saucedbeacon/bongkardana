package o;

import com.alibaba.fastjson.JSONObject;
import java.util.concurrent.Callable;

final class getAppContext implements Callable {
    private final JSONObject getMin;
    private final handleMessage setMin;

    public getAppContext(handleMessage handlemessage, JSONObject jSONObject) {
        this.setMin = handlemessage;
        this.getMin = jSONObject;
    }

    public final Object call() {
        return this.setMin.lambda$getDonationCampaignConfig$30(this.getMin);
    }
}
