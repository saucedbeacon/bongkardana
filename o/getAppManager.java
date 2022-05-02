package o;

import org.json.JSONObject;

final class getAppManager implements RedDotDrawable {
    private final handleMessage length;

    public getAppManager(handleMessage handlemessage) {
        this.length = handlemessage;
    }

    public final Object apply(Object obj) {
        return this.length.convertJsonToInterstitialBannerConfig((JSONObject) obj);
    }
}
