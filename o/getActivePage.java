package o;

import org.json.JSONObject;

final class getActivePage implements RedDotDrawable {
    private final handleMessage getMax;
    private final boolean setMax;

    public getActivePage(handleMessage handlemessage, boolean z) {
        this.getMax = handlemessage;
        this.setMax = z;
    }

    public final Object apply(Object obj) {
        return this.getMax.lambda$getPromoCenterConfig$27(this.setMax, (JSONObject) obj);
    }
}
