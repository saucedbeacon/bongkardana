package com.iap.ac.android.gol.google.supergw;

import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.CommonConfig;
import com.iap.ac.android.biz.common.model.remoteconfig.common.OAuthConfig;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.d.e;
import com.iap.ac.android.gol.google.supergw.SuperGwRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public class SuperGwUtils {
    public static final String GATEWAY_SECRET = "secret";
    public static final String KEY_AUTHENTICATION_RESPONSE = "gspAuthenticationResponse";
    public static final String KEY_MERCHANT_CLIENT_ID = "merchantClientId";
    public static final String MERCHANT_CLIENT_ID = "3200000A50000001";
    public static final String MERCHANT_ID = "2188400000001035";
    public static final String PREPARE_FUNCTION = "alipaynet.site.oauth.auth.extension.prepare";
    public static final String REQUEST_VERSION = "3.0.1";
    public static final String RESULT_CODE_OK = "00000000";
    public static final String SIGN_TYPE = "RSA";
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.getDefault());

    public static SuperGwRequest<SuperGwPrepareRequestBody> generatePrepareRequest(Map<String, String> map) {
        SuperGwRequest<SuperGwPrepareRequestBody> superGwRequest = new SuperGwRequest<>();
        SuperGwRequest.Request<T> request = new SuperGwRequest.Request<>();
        U superGwPrepareRequestBody = new SuperGwPrepareRequestBody();
        superGwPrepareRequestBody.authSiteId = getAuthSiteId();
        superGwPrepareRequestBody.merchantId = "2188400000001035";
        superGwPrepareRequestBody.merchantOriginalRequest = map;
        superGwPrepareRequestBody.extendInfo = e.a((Object) new HashMap());
        SuperGwHead superGwHead = new SuperGwHead();
        superGwHead.version = REQUEST_VERSION;
        superGwHead.function = PREPARE_FUNCTION;
        superGwHead.clientId = getClientId();
        superGwHead.reqTime = simpleDateFormat.format(new Date(System.currentTimeMillis()));
        superGwHead.clientSecret = GATEWAY_SECRET;
        superGwHead.reqMsgId = UUID.randomUUID().toString().replace("-", "");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("merchantClientId", "3200000A50000001");
            superGwHead.reserve = jSONObject.toString();
        } catch (JSONException e) {
            ACLog.e(Constants.TAG, "SuperGwUtils, json exception for head utils: ".concat(String.valueOf(e)));
        }
        request.body = superGwPrepareRequestBody;
        request.head = superGwHead;
        superGwRequest.request = request;
        return superGwRequest;
    }

    public static String getAuthSiteId() {
        CommonConfig commonConfig = ACManager.getInstance().getCommonConfig();
        if (commonConfig != null) {
            return commonConfig.pspId;
        }
        return null;
    }

    public static String getClientId() {
        OAuthConfig oAuthConfig = ACManager.getInstance().getOAuthConfig();
        if (oAuthConfig != null) {
            return oAuthConfig.clientId;
        }
        return null;
    }

    public static boolean parseResultInfo(SuperGwResultInfo superGwResultInfo) {
        return "00000000".equals(superGwResultInfo.resultCodeId);
    }
}
