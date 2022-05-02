package com.alipay.multigateway.sdk.adapter.network.quake;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.SecurityGuardParamContext;
import com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent;
import com.alibaba.wireless.security.open.securesignature.SecureSignatureDefine;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.multigateway.sdk.GatewayInfo;
import com.alipay.multigateway.sdk.adapter.signature.SignatureHandler;
import java.util.HashMap;
import java.util.Map;

public class QuakeSGSignatureHandler implements SignatureHandler {
    public static final String APP_ID = "appId";
    public static final String APP_KEY = "appKey";
    public static final String AUTH_CODE = "authCode";
    public static final String REQUEST_TYPE = "requestType";
    public static final String SIGN_TYPE_WIRELESS_SG = "wireless_sg";
    private static final String TAG = "QuakeSGSignatureHandler";
    private ISecureSignatureComponent signatureComponent;

    public QuakeSGSignatureHandler(Context context) throws SecException {
        this.signatureComponent = SecurityGuardManager.getInstance(context).getSecureSignatureComp();
    }

    public String signRequest(String str, @NonNull GatewayInfo.SignInfo signInfo) throws Exception {
        Map<String, String> map = signInfo.extra;
        String str2 = map.get("appKey");
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        String str3 = map.get("authCode");
        int i = 4;
        String str4 = map.get(REQUEST_TYPE);
        if (!TextUtils.isEmpty(str4)) {
            try {
                i = Integer.valueOf(str4).intValue();
            } catch (NumberFormatException e) {
                LoggerWrapper.e(TAG, "Cannot parse requestType for sign!", e);
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put(SecureSignatureDefine.OPEN_KEY_SIGN_INPUT, str);
        SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
        securityGuardParamContext.appKey = str2;
        securityGuardParamContext.paramMap = hashMap;
        securityGuardParamContext.requestType = i;
        return this.signatureComponent.signRequest(securityGuardParamContext, str3);
    }
}
