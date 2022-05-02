package com.alipay.iap.android.matamata.plugins;

import com.facebook.flipper.core.FlipperObject;
import o.DANAJobIntentService;

public class AnalyticsPlugin extends DANAJobIntentService {
    public static final String ID = "Analytics";

    public String getId() {
        return ID;
    }

    public void reportNewAnalytics(String str) {
        send("newAnalytics", new FlipperObject(new FlipperObject.setMax().getMax("raw", str).getMax));
    }
}
