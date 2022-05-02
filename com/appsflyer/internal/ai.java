package com.appsflyer.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.OneLinkHttpTask;
import com.appsflyer.ServerConfigHandler;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public final class ai extends OneLinkHttpTask {

    /* renamed from: ॱ  reason: contains not printable characters */
    private static List<String> f8681 = Arrays.asList(new String[]{"onelink.me", "onelnk.com", "app.aflink.com"});

    /* renamed from: ˋ  reason: contains not printable characters */
    public e f8682;

    /* renamed from: ˏ  reason: contains not printable characters */
    public String f8683;

    public interface e {
        /* renamed from: ˋ  reason: contains not printable characters */
        void m1239(String str);

        /* renamed from: ˎ  reason: contains not printable characters */
        void m1240(Map<String, String> map);
    }

    public ai(Uri uri, AppsFlyerLibCore appsFlyerLibCore) {
        super(appsFlyerLibCore);
        if (!TextUtils.isEmpty(uri.getHost()) && !TextUtils.isEmpty(uri.getPath())) {
            boolean z = false;
            for (String contains : f8681) {
                if (uri.getHost().contains(contains)) {
                    z = true;
                }
            }
            if (f.f8742 != null) {
                StringBuilder sb = new StringBuilder("Validate custom domain URLs: ");
                sb.append(Arrays.asList(f.f8742));
                AFLogger.afRDLog(sb.toString());
                for (String str : f.f8742) {
                    if (uri.getHost().contains(str) && str != "") {
                        StringBuilder sb2 = new StringBuilder("DeepLink matches customDomain: ");
                        sb2.append(uri.toString());
                        AFLogger.afDebugLog(sb2.toString());
                        z = true;
                    }
                }
            }
            String[] split = uri.getPath().split("/");
            if (z && split.length == 3) {
                this.f8639 = split[1];
                this.f8683 = split[2];
            }
        }
    }

    /* renamed from: ˎ  reason: contains not printable characters */
    public final void m1236(HttpsURLConnection httpsURLConnection) throws JSONException, IOException {
        httpsURLConnection.setRequestMethod("GET");
    }

    /* renamed from: ॱ  reason: contains not printable characters */
    public final String m1238() {
        StringBuilder sb = new StringBuilder();
        sb.append(ServerConfigHandler.getUrl("https://%sonelink.%s/shortlink-sdk/v1"));
        sb.append("/");
        sb.append(this.f8639);
        sb.append("?id=");
        sb.append(this.f8683);
        return sb.toString();
    }

    /* renamed from: ˊ  reason: contains not printable characters */
    public final void m1235(String str) {
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            this.f8682.m1240(hashMap);
        } catch (JSONException e2) {
            this.f8682.m1239("Can't parse one link data");
            AFLogger.afErrorLog("Error while parsing to json ".concat(String.valueOf(str)), e2);
        }
    }

    /* renamed from: ˏ  reason: contains not printable characters */
    public final void m1237() {
        this.f8682.m1239("Can't get one link data");
    }
}
