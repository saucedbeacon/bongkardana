package o;

import android.text.TextUtils;
import id.dana.domain.registration.AuthenticationMethod;
import id.dana.domain.registration.CheckUserAction;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J \u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001a\u0010\u0010\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J \u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\fH\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lid/dana/data/registration/source/RegistrationMapper;", "", "loginAuthenticationMapper", "Lid/dana/data/registration/source/LoginAuthenticationMapper;", "(Lid/dana/data/registration/source/LoginAuthenticationMapper;)V", "doWhenActionIsTrustRiskLogin", "", "response", "Lid/dana/domain/model/rpc/response/CheckRegistrationResponse;", "findAuthenticationMethodIndex", "", "responses", "", "Lid/dana/domain/model/rpc/response/LoginAuthenticationOptionResponse;", "authMethod", "", "isLoginAuthResponseEqual", "", "transform", "Lid/dana/domain/user/CurrencyAmount;", "prizeAmount", "Lid/dana/data/model/CurrencyAmountResult;", "result", "Lid/dana/data/registration/source/network/result/CheckUserRegistrationStatusResult;", "loginAuthenticationOptionResults", "Lid/dana/data/registration/model/LoginAuthenticationOptionResult;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setStatusCode {
    private final setGroupId loginAuthenticationMapper;

    @Inject
    public setStatusCode(@Nullable setGroupId setgroupid) {
        this.loginAuthenticationMapper = setgroupid;
    }

    @Nullable
    public final setEncryptProxy transform(@Nullable EventLog eventLog) {
        if (eventLog == null) {
            return null;
        }
        setEncryptProxy setencryptproxy = new setEncryptProxy();
        setencryptproxy.setUserName(eventLog.userName);
        setencryptproxy.setAction(eventLog.action);
        setencryptproxy.setExpirySeconds(eventLog.expirySeconds);
        setencryptproxy.setLocalPhoneNumber(eventLog.localPhoneNumber);
        setencryptproxy.setOtpCodeLength(eventLog.otpCodeLength);
        setencryptproxy.setRetrySendSeconds(eventLog.retrySendSeconds);
        setencryptproxy.setCampaignEnabled(eventLog.campaignEnabled);
        setencryptproxy.setPrizeName(eventLog.prizeName);
        setencryptproxy.setOtpChannel(eventLog.otpChannel);
        setencryptproxy.setPrizeAmount(transform(eventLog.prizeAmount));
        setencryptproxy.setExtendInfo(eventLog.extendInfo);
        setencryptproxy.setSecurityId(eventLog.securityId);
        setencryptproxy.setLoginAuthenticationOptionResponses(transform((List<? extends BaseAppLog>) eventLog.loginAuthenticationOptions));
        doWhenActionIsTrustRiskLogin(setencryptproxy);
        uncheckAllItems.transform(setencryptproxy, eventLog);
        return setencryptproxy;
    }

    private final void doWhenActionIsTrustRiskLogin(setEncryptProxy setencryptproxy) {
        if (StringsKt.equals(CheckUserAction.TRUST_RISK_LOGIN, setencryptproxy.getAction(), true)) {
            setencryptproxy.setFaceLoginAuthMethodIndex(findAuthenticationMethodIndex(setencryptproxy.getLoginAuthenticationOptionResponses(), AuthenticationMethod.FACE_LOGIN));
            setencryptproxy.setPasswordAuthMethodIndex(findAuthenticationMethodIndex(setencryptproxy.getLoginAuthenticationOptionResponses(), "PASSWORD"));
        }
    }

    private final int findAuthenticationMethodIndex(List<? extends initWithKey> list, String str) {
        if (list == null || list.isEmpty()) {
            return -1;
        }
        for (initWithKey initwithkey : list) {
            if (isLoginAuthResponseEqual(initwithkey, str)) {
                return list.indexOf(initwithkey);
            }
        }
        return -1;
    }

    private final boolean isLoginAuthResponseEqual(initWithKey initwithkey, String str) {
        return initwithkey != null && !TextUtils.isEmpty(initwithkey.getAuthenticationMethod()) && Intrinsics.areEqual((Object) str, (Object) initwithkey.getAuthenticationMethod());
    }

    private final List<initWithKey> transform(List<? extends BaseAppLog> list) {
        List<initWithKey> arrayList = new ArrayList<>();
        if (list != null && !list.isEmpty()) {
            for (BaseAppLog baseAppLog : list) {
                if (baseAppLog != null) {
                    setGroupId setgroupid = this.loginAuthenticationMapper;
                    Intrinsics.checkNotNull(setgroupid);
                    Object apply = setgroupid.apply(baseAppLog);
                    Intrinsics.checkNotNullExpressionValue(apply, "loginAuthenticationMapper!!.apply(result)");
                    arrayList.add(apply);
                }
            }
        }
        return arrayList;
    }

    private final stopBleScan transform(registerWorker registerworker) {
        if (registerworker != null) {
            return new stopBleScan(registerworker.getAmount(), registerworker.getCurrency());
        }
        return null;
    }
}
