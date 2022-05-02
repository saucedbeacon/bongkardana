package o;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alipay.iap.android.common.product.delegate.UserInfoManager;
import com.alipay.mobile.verifyidentity.base.message.RequestConstants;
import com.alipay.mobile.verifyidentity.business.activity.SecVIVerify;
import com.alipay.mobile.verifyidentity.business.activity.SecVIVerifyInterface;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import com.alipay.mobile.verifyidentity.framework.engine.VIEngine;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class getAppPerfKey {
    @Inject
    public getAppPerfKey() {
        SecVIVerify.setSecVIVerifyInterface(new SecVIVerifyInterface() {
            public final String tntInstId() {
                return null;
            }

            public final String userId() {
                return UserInfoManager.instance().getUserId();
            }
        });
        VIEngine.registerOnClickUrl(getCommonDatas.setMin);
    }

    public final void setMin(Context context) {
        AnonymousClass5 r0 = new VIEngine.OnQueryResult() {
            public final void onFail() {
            }

            public final void onSuccess() {
            }
        };
        HashMap hashMap = new HashMap();
        hashMap.put("verifyType", "4");
        hashMap.put("productCode", "APP_SETTING_NATIVE");
        hashMap.put("sceneId", "dana_app_securitysetting");
        HashMap hashMap2 = new HashMap();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", (Object) new setCurrentAppId("https://m.dana.id/m/portal/emailSettings", "email").length());
        jSONObject.put("kyc", (Object) new setCurrentAppId("https://m.dana.id/m/kyc/landingPage?entryPoint=profile", "kyc").length());
        hashMap2.put(RequestConstants.SecVIKeySecuritySettingsConfig, jSONObject.toJSONString());
        VIEngine.startProduct(context, hashMap, hashMap2, r0);
    }

    public final void getMax(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put("sceneId", "dana_app_securitysetting");
        hashMap.put("userId", UserInfoManager.instance().getUserId());
        hashMap.put("productCode", SecurityConstants.KEY_SQ);
        hashMap.put("productId", "sq_20001");
        VIEngine.startProduct(context, hashMap, (Map<String, String>) null, new VIEngine.OnQueryResult() {
            public final void onSuccess() {
            }

            public final void onFail() {
                updateActionSheetContent.exception(DanaLogConstants.BizType.SECURITY_SETTINGS, DanaLogConstants.ExceptionType.SECURITY_SETTING_QUERY_EXCEPTION, "open security questions page failed");
            }
        });
    }
}
