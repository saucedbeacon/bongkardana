package com.iap.ac.android.gol.rpc;

import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.model.CommonConfig;
import com.iap.ac.android.biz.common.model.remoteconfig.common.OAuthConfig;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.d.e;
import com.iap.ac.android.gol.google.supergw.SuperGwResultInfo;
import com.iap.ac.android.gol.rpc.request.AuthPrepareRequest;
import com.iap.ac.android.gol.rpc.request.AuthPrepareRequestBody;
import java.util.HashMap;
import java.util.Map;

public class AuthDataUtils {
    public static final String KEY_MERCHANT_CLIENT_ID = "merchantClientId";
    public static final String MERCHANT_CLIENT_ID = "3200000A50000001";
    public static final String MERCHANT_ID = "2188400000001035";
    public static final String RESULT_CODE_OK = "00000000";
    public static final String TAG = "AuthDataUtils";

    public static AuthPrepareRequest generatePrepareRequest(Map<String, String> map) {
        AuthPrepareRequest authPrepareRequest = new AuthPrepareRequest();
        authPrepareRequest.clientId = getClientId();
        AuthPrepareRequestBody authPrepareRequestBody = new AuthPrepareRequestBody();
        authPrepareRequestBody.authSiteId = getAuthSiteId();
        authPrepareRequestBody.merchantId = "2188400000001035";
        authPrepareRequestBody.merchantOriginalRequest = map;
        authPrepareRequestBody.extendInfo = e.a((Object) new HashMap());
        String a2 = e.a((Object) authPrepareRequestBody);
        if (a2 == null) {
            ACLog.e(TAG, "GolGooglePrepareProcessor prepare error, null body");
            return authPrepareRequest;
        }
        authPrepareRequest.content = a2;
        return authPrepareRequest;
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
