package com.alipay.alipaysecuritysdk.rds.v2.b;

import android.content.Context;
import com.alipay.alipaysecuritysdk.common.collector.b;
import com.alipay.alipaysecuritysdk.common.collector.c;
import com.alipay.mobile.verifyidentity.base.message.EnvDataConstants;
import id.dana.lib.gcontainer.app.bridge.logging.H5GetLogInfoBridge;
import id.dana.sendmoney.summary.SummaryActivity;
import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class d extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f9285a = {"asdk", "board", H5GetLogInfoBridge.RESULT_BRAND, TwilioIdentityVerificationActivity.CHALLENGE_INFO_DEVICE, "displayid", "em", EnvDataConstants.MANUFACTURER, H5GetLogInfoBridge.RESULT_MODEL, "name", "incremental", H5GetLogInfoBridge.RESULT_OS, "qemu", "osRelease", "kerver", "root", "tags", "processor", "pf", "pn", "pm"};
    private Map<String, Object> b;

    public d(Context context) {
        this();
        this.b.put("asdk", c.l());
        this.b.put("board", c.c());
        this.b.put(H5GetLogInfoBridge.RESULT_BRAND, c.d());
        this.b.put(TwilioIdentityVerificationActivity.CHALLENGE_INFO_DEVICE, c.e());
        this.b.put("displayid", c.f());
        Map<String, Object> map = this.b;
        boolean a2 = c.a(context);
        String str = SummaryActivity.CHECKED;
        map.put("em", a2 ? str : "false");
        this.b.put(EnvDataConstants.MANUFACTURER, c.h());
        this.b.put(H5GetLogInfoBridge.RESULT_MODEL, c.i());
        this.b.put("name", c.j());
        this.b.put("incremental", c.g());
        this.b.put(H5GetLogInfoBridge.RESULT_OS, c.a());
        this.b.put("qemu", c.n());
        this.b.put("osRelease", c.k());
        this.b.put("kerver", b.l());
        this.b.put("root", !c.b() ? "false" : str);
        this.b.put("tags", c.m());
        this.b.put("processor", b.g());
        this.b.put("pf", b.f());
        this.b.put("pn", b.e());
        this.b.put("pm", b.d());
    }

    private d() {
        this.b = new HashMap();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        for (String str : f9285a) {
            Object obj = this.b.get(str);
            if (obj != null && (obj instanceof String)) {
                try {
                    jSONObject.put(str, obj);
                } catch (JSONException unused) {
                }
            }
        }
        return jSONObject;
    }
}
