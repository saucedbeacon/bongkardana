package o;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import java.util.Map;

public final class setWidth implements convertSpToPx {
    Map<String, Object> getMax;
    String length;
    Context setMax;

    public setWidth(Context context, String str, Map<String, Object> map) {
        this.setMax = context;
        this.length = str;
        this.getMax = map;
    }

    public final void length() {
        AppsFlyerLib.getInstance().trackEvent(this.setMax, this.length, this.getMax);
    }
}
