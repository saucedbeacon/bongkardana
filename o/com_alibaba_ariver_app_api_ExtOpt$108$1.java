package o;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alipay.iap.android.common.utils.security.RSAHelper;
import com.alipayplus.mobile.component.common.facade.base.MobileEnvInfo;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.data.foundation.logger.rds.RdsType;
import id.dana.data.login.source.network.HoldLoginException;
import id.dana.data.login.source.network.model.LoginIdType;
import id.dana.data.login.source.network.model.LoginType;
import id.dana.data.login.source.network.model.VerifyMethod;
import id.dana.domain.foundation.logger.LoginScenarioConstant;
import java.util.HashMap;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;
import o.b;

@Singleton
public class com_alibaba_ariver_app_api_ExtOpt$108$1 extends setRepeatCount<b.AnonymousClass9> implements b.AnonymousClass6 {
    private final Context context;
    private final b.AnonymousClass13 holdLoginEntityDataFactory;
    private final onRelease rdsTracker;

    @Inject
    public com_alibaba_ariver_app_api_ExtOpt$108$1(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context2, onRelease onrelease, b.AnonymousClass13 r6) {
        super(setisurgentresource, appxloadfailed, onappresume, context2);
        this.rdsTracker = onrelease;
        this.holdLoginEntityDataFactory = r6;
        this.context = context2;
    }

    public Class<b.AnonymousClass9> getFacadeClass() {
        return b.AnonymousClass9.class;
    }

    public TitleBarRightButtonView.AnonymousClass1<com_alibaba_ariver_app_api_ExtOpt$69$1> login(String str, String str2, String str3, String str4, String str5) {
        com_alibaba_ariver_app_api_ExtOpt$64$1 com_alibaba_ariver_app_api_extopt_64_1 = new com_alibaba_ariver_app_api_ExtOpt$64$1();
        com_alibaba_ariver_app_api_extopt_64_1.credentials = RSAHelper.encrypt(str2, str3);
        com_alibaba_ariver_app_api_extopt_64_1.envInfo = getMobileEnvInfo(str);
        com_alibaba_ariver_app_api_extopt_64_1.loginId = str;
        com_alibaba_ariver_app_api_extopt_64_1.loginIdType = LoginIdType.MOBILE_NO;
        boolean equals = LoginScenarioConstant.TRUSTRISKLOGIN.equals(str5);
        String str6 = LoginType.TRUST_RISK_LOGIN;
        if (equals) {
            com_alibaba_ariver_app_api_extopt_64_1.loginType = str6;
            com_alibaba_ariver_app_api_extopt_64_1.securityId = str4;
            com_alibaba_ariver_app_api_extopt_64_1.verifyAnswer = com_alibaba_ariver_app_api_extopt_64_1.credentials;
            com_alibaba_ariver_app_api_extopt_64_1.verifyMethod = "PASSWORD";
        } else if (LoginScenarioConstant.NORMAL_BOKU_LOGIN.equals(str5) || LoginScenarioConstant.TRUST_BOKU_LOGIN.equals(str5)) {
            if (LoginScenarioConstant.NORMAL_BOKU_LOGIN.equals(str5)) {
                str6 = LoginType.NORMAL_LOGIN;
            }
            com_alibaba_ariver_app_api_extopt_64_1.loginType = str6;
            com_alibaba_ariver_app_api_extopt_64_1.securityId = str4;
            com_alibaba_ariver_app_api_extopt_64_1.verifyMethod = VerifyMethod.VERIFY_BOKU;
        } else {
            com_alibaba_ariver_app_api_extopt_64_1.loginType = LoginType.NORMAL_LOGIN;
        }
        reportWhenNullPhoneNumber(com_alibaba_ariver_app_api_extopt_64_1, str5);
        return wrapper(new com_alibaba_ariver_app_api_ExtOpt$106$1(com_alibaba_ariver_app_api_extopt_64_1));
    }

    public TitleBarRightButtonView.AnonymousClass1<com_alibaba_ariver_app_api_ExtOpt$69$1> holdLogin(String str, String str2) {
        return this.holdLoginEntityDataFactory.createData("network").holdLogin(str, str2).doOnError(checkHoldLoginResult());
    }

    public TitleBarRightButtonView.AnonymousClass1<com_alibaba_ariver_app_api_ExtOpt$69$1> otpLogin(String str, String str2, String str3, String str4, String str5, String str6) {
        com_alibaba_ariver_app_api_ExtOpt$64$1 com_alibaba_ariver_app_api_extopt_64_1 = new com_alibaba_ariver_app_api_ExtOpt$64$1();
        com_alibaba_ariver_app_api_extopt_64_1.credentials = RSAHelper.encrypt(str2, str3);
        com_alibaba_ariver_app_api_extopt_64_1.envInfo = getMobileEnvInfo(str);
        com_alibaba_ariver_app_api_extopt_64_1.loginId = str;
        com_alibaba_ariver_app_api_extopt_64_1.loginIdType = LoginIdType.MOBILE_NO;
        com_alibaba_ariver_app_api_extopt_64_1.securityId = str4;
        com_alibaba_ariver_app_api_extopt_64_1.verifyMethod = "OTP_SMS";
        com_alibaba_ariver_app_api_extopt_64_1.verifyAnswer = str5;
        if (LoginType.TRUST_RISK_LOGIN.equalsIgnoreCase(str6)) {
            com_alibaba_ariver_app_api_extopt_64_1.loginType = LoginType.TRUST_RISK_LOGIN;
        } else {
            com_alibaba_ariver_app_api_extopt_64_1.loginType = LoginType.NORMAL_LOGIN;
        }
        reportWhenNullPhoneNumber(com_alibaba_ariver_app_api_extopt_64_1, LoginScenarioConstant.OTPLOGIN);
        return wrapper(new com_alibaba_ariver_app_api_ExtOpt$60$1(com_alibaba_ariver_app_api_extopt_64_1));
    }

    public TitleBarRightButtonView.AnonymousClass1<com_alibaba_ariver_app_api_ExtOpt$69$1> verifyPushLogin(String str, String str2, String str3, String str4, String str5, String str6) {
        com_alibaba_ariver_app_api_ExtOpt$64$1 com_alibaba_ariver_app_api_extopt_64_1 = new com_alibaba_ariver_app_api_ExtOpt$64$1();
        com_alibaba_ariver_app_api_extopt_64_1.credentials = RSAHelper.encrypt(str2, str3);
        com_alibaba_ariver_app_api_extopt_64_1.envInfo = getMobileEnvInfo(str);
        com_alibaba_ariver_app_api_extopt_64_1.loginId = str;
        com_alibaba_ariver_app_api_extopt_64_1.loginIdType = LoginIdType.MOBILE_NO;
        com_alibaba_ariver_app_api_extopt_64_1.securityId = str4;
        com_alibaba_ariver_app_api_extopt_64_1.verifyMethod = VerifyMethod.PUSH_VERIFY;
        com_alibaba_ariver_app_api_extopt_64_1.verifyAnswer = str5;
        if (LoginType.TRUST_RISK_LOGIN.equalsIgnoreCase(str6)) {
            com_alibaba_ariver_app_api_extopt_64_1.loginType = LoginType.TRUST_RISK_LOGIN;
        } else {
            com_alibaba_ariver_app_api_extopt_64_1.loginType = LoginType.NORMAL_LOGIN;
        }
        reportWhenNullPhoneNumber(com_alibaba_ariver_app_api_extopt_64_1, LoginScenarioConstant.OTPLOGIN);
        return wrapper(new com_alibaba_ariver_app_api_ExtOpt$57$1(com_alibaba_ariver_app_api_extopt_64_1));
    }

    public TitleBarRightButtonView.AnonymousClass1<com_alibaba_ariver_app_api_ExtOpt$68$1> logout() {
        com_alibaba_ariver_app_api_ExtOpt$65$1 com_alibaba_ariver_app_api_extopt_65_1 = new com_alibaba_ariver_app_api_ExtOpt$65$1();
        com_alibaba_ariver_app_api_extopt_65_1.envInfo = generateMobileEnvInfo();
        return wrapper(new com_alibaba_ariver_app_api_ExtOpt$56$1(com_alibaba_ariver_app_api_extopt_65_1));
    }

    private MobileEnvInfo getMobileEnvInfo(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(RdsType.KEY_RDS, this.rdsTracker.onPageEndAndZip(str));
        MobileEnvInfo generateMobileEnvInfo = generateMobileEnvInfo();
        generateMobileEnvInfo.extendInfo = hashMap;
        return generateMobileEnvInfo;
    }

    private RedDotManager<Throwable> checkHoldLoginResult() {
        return new com_alibaba_ariver_app_api_ExtOpt$58$1(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$checkHoldLoginResult$4(Throwable th) throws Exception {
        if (th instanceof HoldLoginException) {
            holdLoginFail();
            updateActionSheetContent.exception(DanaLogConstants.Prefix.HOLDLOGIN_PREFIX, DanaLogConstants.ExceptionType.HOLDLOGIN_EXCEPTION, ((HoldLoginException) th).getMessage());
        } else if (th != null) {
            updateActionSheetContent.exception(DanaLogConstants.Prefix.HOLDLOGIN_PREFIX, DanaLogConstants.ExceptionType.HOLDLOGIN_EXCEPTION, th.toString());
        }
    }

    private void holdLoginFail() {
        if (this.context != null) {
            Intent intent = new Intent();
            intent.setAction("id.dana.splash");
            restorePresenterStates.length(this.context).setMin(intent);
        }
    }

    private void reportWhenNullPhoneNumber(com_alibaba_ariver_app_api_ExtOpt$64$1 com_alibaba_ariver_app_api_extopt_64_1, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" with params: [request: phoneNumber=");
        sb.append(com_alibaba_ariver_app_api_extopt_64_1.loginId);
        sb.append("]");
        updateActionSheetContent.behaviorAndLog(DanaLogConstants.TAG.PHONE_NUMBER_EMPTY_TAG, sb.toString());
        if (TextUtils.isEmpty(com_alibaba_ariver_app_api_extopt_64_1.loginId)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" with params: [phoneNumber: ");
            sb2.append(com_alibaba_ariver_app_api_extopt_64_1.loginId);
            sb2.append(" ]");
            updateActionSheetContent.exception("login", DanaLogConstants.TAG.PHONE_NUMBER_EMPTY_TAG, sb2.toString());
        }
    }
}
