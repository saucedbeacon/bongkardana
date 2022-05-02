package com.iap.ac.android.biz.common.internal.rpc;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.SecurityGuardParamContext;
import com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent;
import com.alibaba.wireless.security.open.securesignature.SecureSignatureDefine;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.utils.Utils;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.rpc.RpcAppInfo;
import com.iap.ac.android.common.rpc.interfaces.SignRpcRequestPlugin;
import java.util.HashMap;
import java.util.Map;

public class SignRpcRequestPluginImpl implements SignRpcRequestPlugin {

    /* renamed from: a  reason: collision with root package name */
    public SignConfig f9683a;

    public SignConfig getSignConfig() {
        return this.f9683a;
    }

    public void setSignConfig(SignConfig signConfig) {
        this.f9683a = signConfig;
    }

    public String signRequest(@NonNull RpcAppInfo rpcAppInfo, @NonNull String str, @NonNull Map<String, String> map) {
        String str2;
        String str3;
        RpcAppInfo rpcAppInfo2 = rpcAppInfo;
        String str4 = str;
        if (TextUtils.isEmpty(str)) {
            ACLog.w(Constants.TAG, "the content is empty, will not do signing.");
            ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_sign_fail", "the content is empty, will not do signing.");
            return null;
        }
        SignConfig signConfig = this.f9683a;
        if (signConfig == null || TextUtils.isEmpty(signConfig.appKey)) {
            str2 = rpcAppInfo2.appKey;
        } else {
            str2 = this.f9683a.appKey;
        }
        SignConfig signConfig2 = this.f9683a;
        int i = signConfig2 == null ? 4 : signConfig2.signAlgorithm;
        SignConfig signConfig3 = this.f9683a;
        if (signConfig3 == null || (str3 = signConfig3.authCode) == null) {
            str3 = rpcAppInfo2.authCode;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(SecureSignatureDefine.OPEN_KEY_SIGN_INPUT, str4);
        SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
        securityGuardParamContext.paramMap = hashMap;
        securityGuardParamContext.requestType = i;
        securityGuardParamContext.appKey = str2;
        try {
            SecurityGuardManager instance = SecurityGuardManager.getInstance(ACManager.getInstance().getContext());
            if (instance == null) {
                ACLog.e(Constants.TAG, "request data sign fail, sgMng is null");
                ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_sign_fail", "request data sign fail, sgMng is null");
                return null;
            }
            ISecureSignatureComponent secureSignatureComp = instance.getSecureSignatureComp();
            if (secureSignatureComp == null) {
                ACLog.e(Constants.TAG, "request data sign fail, ssComp is null");
                ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_sign_fail", "request data sign fail, ssComp is null");
                return null;
            }
            String signRequest = secureSignatureComp.signRequest(securityGuardParamContext, str3);
            ACLog.i(Constants.TAG, String.format("Sign success: appKey = %s, authCode = %s, requestType = %d, sign = %s, content = %s", new Object[]{str2, str3, Integer.valueOf(i), signRequest, str4}));
            return signRequest;
        } catch (Exception e) {
            String format = String.format("Cannot sign request! appKey = %s, authCode = %s, requestType = %d, errorMessage = %s", new Object[]{str2, str3, Integer.valueOf(i), Utils.formatSecurityGuardException(e)});
            ACLog.e(Constants.TAG, format);
            ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_sign_fail", format);
            return null;
        }
    }
}
