package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.appsflyer.AFEvent;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.ServerConfigHandler;
import com.appsflyer.ServerParameters;
import com.appsflyer.internal.model.event.Validate;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.data.constant.BranchLinkConstant;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class u implements Runnable {

    /* renamed from: ʻ  reason: contains not printable characters */
    private String f8913;

    /* renamed from: ʽ  reason: contains not printable characters */
    private String f8914;

    /* renamed from: ˊ  reason: contains not printable characters */
    private final Intent f8915;

    /* renamed from: ˋ  reason: contains not printable characters */
    private String f8916;

    /* renamed from: ˎ  reason: contains not printable characters */
    private String f8917;

    /* renamed from: ˏ  reason: contains not printable characters */
    Map<String, String> f8918;

    /* renamed from: ॱ  reason: contains not printable characters */
    WeakReference<Context> f8919;

    /* renamed from: ॱॱ  reason: contains not printable characters */
    private String f8920;

    /* renamed from: ᐝ  reason: contains not printable characters */
    private String f8921;

    public u(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, @Nullable Intent intent) {
        this.f8919 = new WeakReference<>(context);
        this.f8917 = str;
        this.f8916 = str2;
        this.f8913 = str4;
        this.f8921 = str5;
        this.f8914 = str6;
        this.f8918 = map;
        this.f8920 = str3;
        this.f8915 = intent;
    }

    public final void run() {
        String str = this.f8917;
        if (str != null && str.length() != 0 && !AppsFlyerLib.getInstance().isTrackingStopped()) {
            HttpURLConnection httpURLConnection = null;
            try {
                Context context = this.f8919.get();
                if (context != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("public-key", this.f8916);
                    hashMap.put("sig-data", this.f8913);
                    hashMap.put(BranchLinkConstant.OauthParams.SIGNATURE, this.f8920);
                    final HashMap hashMap2 = new HashMap();
                    hashMap2.putAll(hashMap);
                    Executors.newSingleThreadScheduledExecutor().schedule(new Runnable() {
                        public final void run() {
                            u uVar = u.this;
                            u.m1346(uVar, hashMap2, uVar.f8918, u.this.f8919);
                        }
                    }, 5, TimeUnit.MILLISECONDS);
                    hashMap.put("dev_key", this.f8917);
                    hashMap.put("app_id", context.getPackageName());
                    hashMap.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
                    hashMap.put(ServerParameters.ADVERTISING_ID_PARAM, AppsFlyerProperties.getInstance().getString(ServerParameters.ADVERTISING_ID_PARAM));
                    String jSONObject = new JSONObject(hashMap).toString();
                    String url = ServerConfigHandler.getUrl("https://%ssdk-services.%s/validate-android-signature");
                    if (am.f8691 == null) {
                        am.f8691 = new am();
                    }
                    am.f8691.m1247("server_request", url, jSONObject);
                    HttpURLConnection r2 = m1345(jSONObject, url);
                    int i = -1;
                    if (r2 != null) {
                        i = r2.getResponseCode();
                    }
                    AppsFlyerLibCore.getInstance();
                    String r5 = AppsFlyerLibCore.m1170(r2);
                    if (am.f8691 == null) {
                        am.f8691 = new am();
                    }
                    am.f8691.m1247("server_response", url, String.valueOf(i), r5);
                    JSONObject jSONObject2 = new JSONObject(r5);
                    jSONObject2.put("code", i);
                    if (i == 200) {
                        StringBuilder sb = new StringBuilder("Validate response 200 ok: ");
                        sb.append(jSONObject2.toString());
                        AFLogger.afInfoLog(sb.toString());
                        m1347(jSONObject2.optBoolean("result") ? jSONObject2.getBoolean("result") : false, this.f8913, this.f8921, this.f8914, jSONObject2.toString());
                    } else {
                        AFLogger.afInfoLog("Failed Validate request");
                        m1347(false, this.f8913, this.f8921, this.f8914, jSONObject2.toString());
                    }
                    if (r2 != null) {
                        r2.disconnect();
                    }
                }
            } catch (Throwable th) {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        }
    }

    /* renamed from: ˊ  reason: contains not printable characters */
    private static HttpURLConnection m1345(String str, String str2) throws IOException {
        try {
            ac acVar = new ac((Context) null, AppsFlyerLib.getInstance().isTrackingStopped());
            acVar.f8653 = str;
            acVar.f8654 = false;
            AFLogger.afDebugLog("Calling ".concat(String.valueOf(str2)));
            return acVar.m1218(str2);
        } catch (Throwable th) {
            AFLogger.afErrorLog("Could not send callStats request", th);
            return null;
        }
    }

    /* renamed from: ˏ  reason: contains not printable characters */
    private static void m1347(boolean z, String str, String str2, String str3, String str4) {
        if (AppsFlyerLibCore.f8577 != null) {
            StringBuilder sb = new StringBuilder("Validate callback parameters: ");
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            sb.append(" ");
            sb.append(str3);
            AFLogger.afDebugLog(sb.toString());
            if (z) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AppsFlyerLibCore.f8577.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AppsFlyerLibCore.f8577;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.net.HttpURLConnection, java.lang.String] */
    /* renamed from: ˋ  reason: contains not printable characters */
    static /* synthetic */ void m1346(u uVar, Map map, Map map2, WeakReference weakReference) {
        if (weakReference.get() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(ServerConfigHandler.getUrl("https://%svalidate.%s/api/v4.11/androidevent?buildnumber=5.1.1&app_id="));
            sb.append(((Context) weakReference.get()).getPackageName());
            String obj = sb.toString();
            ? r2 = 0;
            String string = AppsFlyerLibCore.m1180((Context) weakReference.get()).getString("referrer", r2);
            if (string == null) {
                string = "";
            }
            AppsFlyerLibCore instance = AppsFlyerLibCore.getInstance();
            AFEvent context = new Validate().context((Context) weakReference.get());
            context.f8536 = uVar.f8917;
            context.f8548 = AFInAppEventType.PURCHASE;
            context.f8544 = string;
            context.f8545 = uVar.f8915;
            Map<String, Object> r9 = instance.m1198(context);
            r9.put(FirebaseAnalytics.Param.PRICE, uVar.f8921);
            r9.put(FirebaseAnalytics.Param.CURRENCY, uVar.f8914);
            JSONObject jSONObject = new JSONObject(r9);
            JSONObject jSONObject2 = new JSONObject();
            try {
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                }
                jSONObject.put("receipt_data", jSONObject2);
            } catch (JSONException e) {
                AFLogger.afErrorLog("Failed to build 'receipt_data'", e);
            }
            if (map2 != null) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    for (Map.Entry entry2 : map2.entrySet()) {
                        jSONObject3.put((String) entry2.getKey(), entry2.getValue());
                    }
                    jSONObject.put("extra_prms", jSONObject3);
                } catch (JSONException e2) {
                    AFLogger.afErrorLog("Failed to build 'extra_prms'", e2);
                }
            }
            String jSONObject4 = jSONObject.toString();
            if (am.f8691 == null) {
                am.f8691 = new am();
            }
            am.f8691.m1247("server_request", obj, jSONObject4);
            try {
                HttpURLConnection r22 = m1345(jSONObject4, obj);
                int i = -1;
                if (r22 != null) {
                    i = r22.getResponseCode();
                }
                AppsFlyerLibCore.getInstance();
                String r7 = AppsFlyerLibCore.m1170(r22);
                if (am.f8691 == null) {
                    am.f8691 = new am();
                }
                am.f8691.m1247("server_response", obj, String.valueOf(i), r7);
                JSONObject jSONObject5 = new JSONObject(r7);
                if (i == 200) {
                    StringBuilder sb2 = new StringBuilder("Validate-WH response - 200: ");
                    sb2.append(jSONObject5.toString());
                    AFLogger.afInfoLog(sb2.toString());
                } else {
                    StringBuilder sb3 = new StringBuilder("Validate-WH response failed - ");
                    sb3.append(i);
                    sb3.append(": ");
                    sb3.append(jSONObject5.toString());
                    AFLogger.afWarnLog(sb3.toString());
                }
                if (r22 != null) {
                    r22.disconnect();
                }
            } catch (Throwable th) {
                if (r2 != 0) {
                    r2.disconnect();
                }
                throw th;
            }
        }
    }
}
