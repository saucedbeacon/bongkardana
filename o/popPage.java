package o;

import com.alibaba.fastjson.JSONObject;

final class popPage implements RedDotManager {
    private final JSONObject length;

    public popPage(JSONObject jSONObject) {
        this.length = jSONObject;
    }

    public final void accept(Object obj) {
        handleMessage.lambda$getDonationCampaignConfig$31(this.length, (Throwable) obj);
    }
}
