package com.appsflyer;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.appsflyer.share.Constants;
import com.appsflyer.share.LinkGenerator;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public class CreateOneLinkHttpTask extends OneLinkHttpTask {

    /* renamed from: ʽ  reason: contains not printable characters */
    private boolean f8864 = false;

    /* renamed from: ˊ  reason: contains not printable characters */
    private Map<String, String> f8865;

    /* renamed from: ˋ  reason: contains not printable characters */
    private String f8866;

    /* renamed from: ˏ  reason: contains not printable characters */
    private ResponseListener f8867;

    /* renamed from: ॱ  reason: contains not printable characters */
    private String f8868 = "";

    /* renamed from: ᐝ  reason: contains not printable characters */
    private Context f8869;

    public interface ResponseListener {
        @WorkerThread
        void onResponse(String str);

        @WorkerThread
        void onResponseError(String str);
    }

    public CreateOneLinkHttpTask(@NonNull String str, @NonNull Map<String, String> map, AppsFlyerLibCore appsFlyerLibCore, @NonNull Context context, boolean z) {
        super(appsFlyerLibCore);
        this.f8864 = z;
        this.f8869 = context;
        if (context != null) {
            this.f8868 = context.getPackageName();
        } else {
            AFLogger.afWarnLog("CreateOneLinkHttpTask: context can't be null");
        }
        this.f8639 = str;
        this.f8866 = "-1";
        this.f8865 = map;
    }

    public void setListener(@NonNull ResponseListener responseListener) {
        this.f8867 = responseListener;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ˎ  reason: contains not printable characters */
    public final void m1335(HttpsURLConnection httpsURLConnection) throws JSONException, IOException {
        if (!this.f8864) {
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setUseCaches(false);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject(this.f8865);
            jSONObject.put("ttl", this.f8866);
            jSONObject.put("data", jSONObject2);
            httpsURLConnection.connect();
            DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
            dataOutputStream.writeBytes(jSONObject.toString());
            dataOutputStream.flush();
            dataOutputStream.close();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ॱ  reason: contains not printable characters */
    public final String m1337() {
        StringBuilder sb = new StringBuilder();
        sb.append(ServerConfigHandler.getUrl("https://%sonelink.%s/shortlink-sdk/v1"));
        sb.append("/");
        sb.append(this.f8639);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ˊ  reason: contains not printable characters */
    public final void m1334(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                this.f8867.onResponse(jSONObject.optString(keys.next()));
            }
        } catch (JSONException e) {
            this.f8867.onResponseError("Can't parse one link data");
            AFLogger.afErrorLog("Error while parsing to json ".concat(String.valueOf(str)), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ˏ  reason: contains not printable characters */
    public final void m1336() {
        LinkGenerator addParameters = new LinkGenerator(Constants.USER_INVITE_LINK_TYPE).setBaseURL(this.f8639, AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_DOMAIN), this.f8868).addParameter(Constants.URL_SITE_ID, this.f8868).addParameters(this.f8865);
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
        if (string != null) {
            addParameters.setReferrerCustomerId(string);
        }
        this.f8867.onResponse(addParameters.generateLink());
    }
}
