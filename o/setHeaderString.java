package o;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.iap.android.common.utils.security.RSAHelper;
import com.alipayplus.mobile.component.common.facade.base.MobileEnvInfo;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.data.foundation.logger.rds.RDSConstant;
import id.dana.data.foundation.logger.rds.RdsType;
import java.io.Serializable;
import java.util.HashMap;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.ConnectionLog;
import o.EventLog;
import o.TitleBarRightButtonView;

@Singleton
public class setHeaderString extends setRepeatCount<DefaultAppLoggerImpl> implements ConnectionLog.AnonymousClass1 {
    private final onRelease rdsTracker;

    @Inject
    public setHeaderString(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context, onRelease onrelease) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
        this.rdsTracker = onrelease;
    }

    public Class<DefaultAppLoggerImpl> getFacadeClass() {
        return DefaultAppLoggerImpl.class;
    }

    public TitleBarRightButtonView.AnonymousClass1<EventLog> checkRegistrationAndSendOtp(String str, String str2, String str3, String str4, Boolean bool) {
        EventLog.AnonymousClass1 r0 = new Serializable() {
            public String cashierUrl;
            public String clientId;
            public String merchantRedirectUrl;
            public String otpChannel;
            public String phoneNumber;
            public Boolean skipSendOtp;
            public String subMerchantId;
        };
        MobileEnvInfo generateMobileEnvInfo = generateMobileEnvInfo();
        if (str2 == null) {
            HashMap hashMap = new HashMap();
            hashMap.put(RdsType.KEY_RDS, this.rdsTracker.onPageEndAndZip(str));
            hashMap.put(RdsType.KEY_RDS_SCENE, RDSConstant.NEXT_CHECK_REGISTER);
            generateMobileEnvInfo.extendInfo = hashMap;
        }
        r0.envInfo = generateMobileEnvInfo;
        r0.phoneNumber = str;
        r0.otpChannel = str2;
        r0.clientId = str3;
        r0.subMerchantId = str4;
        r0.skipSendOtp = bool;
        return wrapper(new setErrMsg(r0));
    }

    public TitleBarRightButtonView.AnonymousClass1<setEventName> register(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        DefaultAppLogConfigProxyImpl defaultAppLogConfigProxyImpl = new DefaultAppLogConfigProxyImpl();
        HashMap hashMap = new HashMap();
        hashMap.put(RdsType.KEY_RDS, this.rdsTracker.onPageEndAndZip(str));
        desc.setUserCity(hashMap, str8);
        MobileEnvInfo generateMobileEnvInfo = generateMobileEnvInfo();
        generateMobileEnvInfo.extendInfo = hashMap;
        defaultAppLogConfigProxyImpl.envInfo = generateMobileEnvInfo;
        defaultAppLogConfigProxyImpl.envInfo.clientKey = getClientKey();
        defaultAppLogConfigProxyImpl.phoneNumber = normalizePhoneNumber(str);
        defaultAppLogConfigProxyImpl.passcode = RSAHelper.encrypt(str2, str3);
        defaultAppLogConfigProxyImpl.nickname = str4;
        defaultAppLogConfigProxyImpl.avatarUrl = str5;
        defaultAppLogConfigProxyImpl.referralCode = str6;
        defaultAppLogConfigProxyImpl.verifyMethod = str7;
        reportWhenNullPhoneNumber(str, defaultAppLogConfigProxyImpl);
        return wrapper(new setMethod(defaultAppLogConfigProxyImpl));
    }

    private void reportWhenNullPhoneNumber(String str, DefaultAppLogConfigProxyImpl defaultAppLogConfigProxyImpl) {
        StringBuilder sb = new StringBuilder("register with params: [phoneNumber: ");
        sb.append(str);
        sb.append(" ]\t\t[request: phoneNumber=");
        sb.append(defaultAppLogConfigProxyImpl.phoneNumber);
        sb.append(", nickname=");
        sb.append(defaultAppLogConfigProxyImpl.nickname);
        sb.append("]");
        updateActionSheetContent.behaviorAndLog(DanaLogConstants.TAG.PHONE_NUMBER_EMPTY_TAG, sb.toString());
        if (TextUtils.isEmpty(defaultAppLogConfigProxyImpl.phoneNumber)) {
            StringBuilder sb2 = new StringBuilder("register with params: [phoneNumber: ");
            sb2.append(str);
            sb2.append(" ]\t\t[request: phoneNumber=");
            sb2.append(defaultAppLogConfigProxyImpl.phoneNumber);
            updateActionSheetContent.exception(DanaLogConstants.BizType.REGISTER, DanaLogConstants.TAG.PHONE_NUMBER_EMPTY_TAG, sb2.toString());
        }
    }
}
