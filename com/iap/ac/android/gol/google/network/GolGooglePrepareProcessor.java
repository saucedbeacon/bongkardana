package com.iap.ac.android.gol.google.network;

import android.content.Context;
import android.text.TextUtils;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.CommonConfig;
import com.iap.ac.android.biz.common.model.http.HttpMethod;
import com.iap.ac.android.biz.common.model.http.HttpRequest;
import com.iap.ac.android.biz.common.model.http.HttpResponse;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.d.b;
import com.iap.ac.android.d.e;
import com.iap.ac.android.d.f;
import com.iap.ac.android.gol.google.supergw.SuperGwExtendInfo;
import com.iap.ac.android.gol.google.supergw.SuperGwPrepareResponse;
import com.iap.ac.android.gol.google.supergw.SuperGwPrepareResponseBody;
import com.iap.ac.android.gol.google.supergw.SuperGwPrepareResponseInner;
import com.iap.ac.android.gol.google.supergw.SuperGwUtils;
import java.util.Map;

public class GolGooglePrepareProcessor {
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String CONTENT_TYPE_JSON = "application/json";
    public static final String KEY_AUTHENTICATION_RESPONSE = "gspAuthenticationResponse";
    public static final String KEY_CALLBACK_URL = "gspCallbackUrl";
    public CommonConfig config = ACManager.getInstance().getCommonConfig();
    public Context mContext;
    public b mHttpClient;

    public GolGooglePrepareProcessor(Context context) {
        this.mContext = context;
        this.mHttpClient = new b(false, context);
    }

    private String getGatewayUrl() {
        return this.config.golGoogleUrl;
    }

    public static GolGooglePrepareResponse parseResponse(SuperGwPrepareResponse superGwPrepareResponse) {
        SuperGwPrepareResponseInner superGwPrepareResponseInner;
        SuperGwPrepareResponseBody superGwPrepareResponseBody;
        SuperGwPrepareResponseBody superGwPrepareResponseBody2;
        Map<String, String> map;
        String str = null;
        if (superGwPrepareResponse == null || (superGwPrepareResponseInner = superGwPrepareResponse.response) == null || (superGwPrepareResponseBody = superGwPrepareResponseInner.body) == null || !SuperGwUtils.parseResultInfo(superGwPrepareResponseBody.resultInfo) || (map = superGwPrepareResponseBody2.merchantAuthenticationResponse) == null) {
            return null;
        }
        String str2 = (superGwPrepareResponseBody2 = superGwPrepareResponse.response.body).extendInfo;
        SuperGwExtendInfo superGwExtendInfo = str2 != null ? (SuperGwExtendInfo) e.a(str2, SuperGwExtendInfo.class) : null;
        GolGooglePrepareResponse golGooglePrepareResponse = new GolGooglePrepareResponse();
        if (superGwExtendInfo != null) {
            str = superGwExtendInfo.authUrl;
        }
        golGooglePrepareResponse.authUrl = str;
        golGooglePrepareResponse.gspAuthenticationResponse = map.get("gspAuthenticationResponse");
        return golGooglePrepareResponse;
    }

    private void reportError(String str) {
        ACLog.i(Constants.TAG, str);
    }

    public boolean isSuccess(HttpResponse httpResponse) {
        return (httpResponse == null || httpResponse.statusCode != 200 || httpResponse.data == null) ? false : true;
    }

    public GolGooglePrepareResponse prepare(Map<String, String> map) {
        ACLog.i(Constants.TAG, "GolGooglePrepareProcessor prepare begin: ".concat(String.valueOf(map)));
        String a2 = e.a((Object) SuperGwUtils.generatePrepareRequest(map));
        if (a2 == null) {
            reportError("GolGooglePrepareProcessor prepare error, null body");
            return null;
        }
        HttpRequest httpRequest = new HttpRequest(getGatewayUrl(), HttpMethod.POST, a2);
        httpRequest.addHeader("Content-Type", "application/json");
        try {
            b bVar = this.mHttpClient;
            HttpResponse a3 = new f(bVar, httpRequest, bVar.c).a();
            if (isSuccess(a3)) {
                SuperGwPrepareResponse superGwPrepareResponse = (SuperGwPrepareResponse) e.a(new String(a3.data), SuperGwPrepareResponse.class);
                GolGooglePrepareResponse parseResponse = parseResponse(superGwPrepareResponse);
                StringBuilder sb = new StringBuilder("GolGooglePrepareProcessor prepare response: ");
                sb.append(superGwPrepareResponse);
                sb.append(", callbackUrl: ");
                sb.append(parseResponse == null ? "" : parseResponse.authUrl);
                ACLog.i(Constants.TAG, sb.toString());
                if (parseResponse == null || TextUtils.isEmpty(parseResponse.authUrl)) {
                    reportError("callback url from server is empty: ".concat(String.valueOf(superGwPrepareResponse)));
                }
                return parseResponse;
            }
        } catch (Throwable th) {
            reportError("GolGooglePrepareProcessor prepare exception,  errorCode is: ".concat(String.valueOf(th)));
        }
        return null;
    }
}
