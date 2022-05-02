package com.iap.ac.android.biz.common.spi;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.griver.base.common.constants.GriverBaseConstants;
import com.alipay.iap.android.wallet.acl.member.MemberInfoScope;
import com.alipay.iap.android.wallet.acl.member.MemberService;
import com.alipay.iap.android.wallet.acl.oauth.OAuthCodeFlowType;
import com.alipay.iap.android.wallet.acl.onboarding.OnboardingService;
import com.alipay.iap.android.wallet.acl.payment.PaymentAmount;
import com.alipay.iap.android.wallet.acl.payment.PaymentRequest;
import com.alipay.iap.android.wallet.acl.payment.PaymentType;
import com.alipay.iap.android.wallet.foundation.code.CodeType;
import com.alipay.iap.android.wallet.foundation.deeplink.DeeplinkService;
import com.iap.ac.android.a.a;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.callback.IAuthCallback;
import com.iap.ac.android.biz.common.callback.IOAuth;
import com.iap.ac.android.biz.common.callback.IPay;
import com.iap.ac.android.biz.common.callback.IPayCallback;
import com.iap.ac.android.biz.common.callback.OpenAbilityDelegate;
import com.iap.ac.android.biz.common.callback.OpenBizSceneCallback;
import com.iap.ac.android.biz.common.callback.UserDelegate;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.AcCallback;
import com.iap.ac.android.biz.common.model.AuthResult;
import com.iap.ac.android.biz.common.model.InitConfig;
import com.iap.ac.android.biz.common.model.OAuthUserInfo;
import com.iap.ac.android.biz.common.model.OpenUserInfo;
import com.iap.ac.android.biz.common.model.OpenUserInfoCallback;
import com.iap.ac.android.biz.common.model.PayResult;
import com.iap.ac.android.biz.common.model.PayResultCode;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.biz.common.model.ScanCallback;
import com.iap.ac.android.biz.common.model.ScanErrorCode;
import com.iap.ac.android.biz.common.model.ScanType;
import com.iap.ac.android.biz.common.model.ScannerOption;
import com.iap.ac.android.biz.common.model.acl.AclAPIContext;
import com.iap.ac.android.biz.common.model.auth.AuthPageRequest;
import com.iap.ac.android.biz.common.model.auth.AuthPageResult;
import com.iap.ac.android.biz.common.model.auth.AuthRequest;
import com.iap.ac.android.biz.common.model.auth.TrustLoginInfo;
import com.iap.ac.android.biz.common.proxy.HttpTransporter;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.rpc.model.HttpRequest;
import com.iap.ac.android.common.rpc.model.HttpResponse;
import com.iap.ac.android.d.e;
import com.iap.ac.android.mpm.base.model.route.DecodeActionType;
import com.iap.ac.android.u.b;
import com.iap.ac.android.u.c;
import com.iap.ac.android.u.d;
import com.iap.ac.android.u.f;
import com.iap.ac.android.u.g;
import com.iap.ac.android.u.h;
import com.iap.ac.android.u.i;
import com.iap.ac.android.u.j;
import com.iap.ac.android.u.k;
import com.iap.ac.android.u.l;
import com.iap.ac.android.u.m;
import com.iap.ac.android.u.n;
import com.iap.ac.android.u.o;
import com.iap.ac.android.u.p;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SPIManager {
    public static volatile SPIManager l;

    /* renamed from: a  reason: collision with root package name */
    public boolean f9687a = false;
    public IOAuth b;
    public f c;
    public UserDelegate d;
    public p e;
    public IPay f;
    public m g;
    public HttpTransporter h;
    public OpenAbilityDelegate i;
    public k j;
    public h k;

    public static SPIManager getInstance() {
        if (l == null) {
            synchronized (SPIManager.class) {
                if (l == null) {
                    l = new SPIManager();
                }
            }
        }
        return l;
    }

    public final void a(String str, OpenUserInfoCallback openUserInfoCallback) {
        ACLog.e(Constants.TAG, str);
        ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_common_spi_get_open_user_info_fail", str);
        if (openUserInfoCallback != null) {
            openUserInfoCallback.onGetOpenUserInfo((OpenUserInfo) null);
        }
    }

    public final void b(String str) {
        ACLog.e(Constants.TAG, str);
        ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_common_spi_start_scheme_fail", str);
    }

    public void fetchTrustLoginCredentials(@NonNull AcCallback<TrustLoginInfo> acCallback) {
        if (!initialized()) {
            ACLog.e(Constants.TAG, "SPIManager, fetchTrustLoginCredentials error, not initialized");
            ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_common_spi_fetch_login_credentials_fail", "SPIManager, fetchTrustLoginCredentials error, not initialized");
            if (acCallback != null) {
                TrustLoginInfo trustLoginInfo = new TrustLoginInfo();
                trustLoginInfo.success = false;
                trustLoginInfo.errorCode = ResultCode.UNKNOWN_EXCEPTION;
                trustLoginInfo.errorMessage = "SPIManager, fetchTrustLoginCredentials error, not initialized";
                acCallback.onResult(trustLoginInfo);
            }
        }
        h hVar = this.k;
        AclAPIContext a2 = e.a();
        OnboardingService onboardingService = hVar.f9763a;
        if (onboardingService != null) {
            onboardingService.fetchTrustLoginCredentials(e.a(a2), new g(hVar, acCallback));
            return;
        }
        if (acCallback != null) {
            acCallback.onResult(hVar.a("ACL OnboardingService is empty"));
        }
        hVar.a("fetchTrustLoginCredentials", "ACL OnboardingService is empty");
    }

    public void getAuthCode(@NonNull String str, @NonNull String str2, @NonNull List<String> list, @NonNull IAuthCallback iAuthCallback) {
        getAuthCode(str, str2, list, e.a(), iAuthCallback);
    }

    public String getOpenId() {
        return getOpenId(e.a());
    }

    public void getOpenUserInfo(OAuthUserInfo oAuthUserInfo, OpenUserInfoCallback openUserInfoCallback) {
        getOpenUserInfo(oAuthUserInfo, e.a(), openUserInfoCallback);
    }

    public synchronized void init(InitConfig initConfig) {
        if (initialized()) {
            ACLog.w(Constants.TAG, "SPIManager initialized, skip it");
            return;
        }
        IOAuth iOAuth = initConfig.oAuth;
        this.b = iOAuth;
        if (iOAuth == null) {
            this.c = new f();
        }
        UserDelegate userDelegate = initConfig.userDelegate;
        this.d = userDelegate;
        if (userDelegate == null) {
            this.e = new p();
        }
        IPay iPay = initConfig.pay;
        this.f = iPay;
        if (iPay == null) {
            this.g = new m();
        }
        OpenAbilityDelegate openAbilityDelegate = initConfig.openAbilityDelegate;
        this.i = openAbilityDelegate;
        if (openAbilityDelegate == null) {
            this.j = new k();
        }
        this.h = initConfig.networkProxy;
        this.k = new h();
        this.f9687a = true;
        ACLog.w(Constants.TAG, "SPIManager initialize success");
    }

    public synchronized boolean initialized() {
        return this.f9687a;
    }

    public void openBizScene(@NonNull String str, @NonNull Map<String, String> map, @NonNull OpenBizSceneCallback openBizSceneCallback) {
        openBizScene(str, map, e.a(), openBizSceneCallback);
    }

    public boolean openScheme(@NonNull Uri uri) {
        return openScheme(uri, e.a());
    }

    public void pay(@NonNull String str, @NonNull String str2, @NonNull IPayCallback iPayCallback) {
        pay(str, str2, e.a(), iPayCallback);
    }

    public void scan(@NonNull ScannerOption scannerOption, @NonNull ScanCallback scanCallback) {
        scan(scannerOption, e.a(), scanCallback);
    }

    @Nullable
    public HttpResponse sendHttpRequest(@NonNull HttpRequest httpRequest) throws IOException {
        if (initialized()) {
            HttpTransporter httpTransporter = this.h;
            if (httpTransporter != null) {
                return httpTransporter.sendHttpRequest(httpRequest);
            }
            a("SPIManager, pay error, pay impl is null");
            throw null;
        }
        a("SPIManager, sendHttpRequest error, not initialized");
        throw null;
    }

    public void showAuthPage(@NonNull AuthPageRequest authPageRequest, @NonNull AcCallback<AuthPageResult> acCallback) {
        showAuthPage(authPageRequest, e.a(), acCallback);
    }

    public void getAuthCode(@NonNull String str, @NonNull String str2, @NonNull List<String> list, @NonNull AclAPIContext aclAPIContext, @NonNull IAuthCallback iAuthCallback) {
        ACLog.i(Constants.TAG, "getAuthCode with clientId enter");
        if (!initialized()) {
            a("SPIManager, getAuthCode error, not initialized", iAuthCallback);
            return;
        }
        IOAuth iOAuth = this.b;
        if (iOAuth != null) {
            iOAuth.getAuthCode(str, str2, list, iAuthCallback);
            return;
        }
        f fVar = this.c;
        if (fVar == null) {
            a("SPIManager, getAuthCode error, oAuth impl is null", iAuthCallback);
        } else if (fVar.f9761a != null) {
            HashSet hashSet = new HashSet();
            if (list != null && list.size() > 0) {
                hashSet.addAll(list);
            }
            HashMap hashMap = new HashMap();
            hashMap.put(GriverBaseConstants.KEY_CLIENT_ID, str2);
            fVar.f9761a.getAuthCode(str, hashSet, OAuthCodeFlowType.ALIPAY_CONNECT, hashMap, e.a(aclAPIContext), new b(fVar, iAuthCallback));
        } else {
            StringBuilder a2 = a.a("No implementation found for getAuthCode, isAclAvailable: ");
            a2.append(fVar.a());
            fVar.a(com.iap.ac.android.acs.plugin.utils.Constants.JS_API_GET_AUTH_CODE, a2.toString());
        }
    }

    public String getOpenId(@NonNull AclAPIContext aclAPIContext) {
        if (!initialized()) {
            ACLog.e(Constants.TAG, "SPIManager, getOpenId error, not initialized");
            ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_common_spi_get_open_id_fail", "SPIManager, getOpenId error, not initialized");
            return null;
        }
        UserDelegate userDelegate = this.d;
        if (userDelegate != null) {
            return userDelegate.getOpenId();
        }
        p pVar = this.e;
        if (pVar != null) {
            pVar.b = null;
            if (pVar.f9771a != null) {
                pVar.f9771a.getMemberInfo(MemberService.MemberInfoFetchStrategy.LOCAL_USER_ID_ONLY, (MemberInfoScope) null, e.a(aclAPIContext), new n(pVar));
            } else {
                StringBuilder a2 = a.a("implementation of ACL cannot be found, isAclAvailable: ");
                a2.append(pVar.a());
                pVar.a("getOpenId", a2.toString());
            }
            return pVar.b;
        }
        ACLog.e(Constants.TAG, "SPIManager, getOpenId error, userDelegate is null");
        ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_common_spi_get_open_id_fail", "SPIManager, getOpenId error, userDelegate is null");
        return null;
    }

    public void getOpenUserInfo(OAuthUserInfo oAuthUserInfo, AclAPIContext aclAPIContext, OpenUserInfoCallback openUserInfoCallback) {
        ACLog.i(Constants.TAG, "SPIManager, getOpenUserInfo enter");
        if (!initialized()) {
            a("SPIManager, getOpenUserInfo error, not initialized", openUserInfoCallback);
            return;
        }
        UserDelegate userDelegate = this.d;
        if (userDelegate != null) {
            userDelegate.getOpenUserInfo(oAuthUserInfo, openUserInfoCallback);
            return;
        }
        p pVar = this.e;
        if (pVar == null) {
            a("SPIManager, getOpenUserInfo error, userDelegate is null", openUserInfoCallback);
        } else if (pVar.f9771a != null) {
            MemberService.MemberInfoFetchStrategy memberInfoFetchStrategy = MemberService.MemberInfoFetchStrategy.REMOTE_FETCH;
            HashSet hashSet = new HashSet();
            List<String> list = oAuthUserInfo.scopes;
            if (list != null && list.size() > 0) {
                hashSet.addAll(oAuthUserInfo.scopes);
            }
            pVar.f9771a.getMemberInfo(memberInfoFetchStrategy, new MemberInfoScope(oAuthUserInfo.appId, hashSet, (Map<String, String>) null), e.a(aclAPIContext), new o(pVar, openUserInfoCallback));
        } else {
            StringBuilder a2 = a.a("implementation of ACL cannot be found, isAclAvailable: ");
            a2.append(pVar.a());
            pVar.a(com.iap.ac.android.acs.plugin.utils.Constants.JS_API_GET_OPEN_USER_INFO, a2.toString());
        }
    }

    public void openBizScene(@NonNull String str, @NonNull Map<String, String> map, @NonNull AclAPIContext aclAPIContext, @NonNull OpenBizSceneCallback openBizSceneCallback) {
        if (!initialized()) {
            b("SPIManager, openBizScene error, not initialized");
            return;
        }
        OpenAbilityDelegate openAbilityDelegate = this.i;
        if (openAbilityDelegate != null) {
            openAbilityDelegate.openBizScene(str, map, openBizSceneCallback);
            return;
        }
        k kVar = this.j;
        if (kVar != null) {
            DeeplinkService deeplinkService = kVar.f9766a;
            if (deeplinkService != null) {
                deeplinkService.open(str, map, e.a(aclAPIContext), new j(kVar, openBizSceneCallback));
                return;
            }
            StringBuilder a2 = a.a("implementation of ACL cannot be found, isAclAvailable: ");
            a2.append(kVar.a());
            kVar.a("openBizScene", a2.toString());
            return;
        }
        b("SPIManager, openBizScene error, open ability delegate is not implemented");
    }

    public boolean openScheme(@NonNull Uri uri, @NonNull AclAPIContext aclAPIContext) {
        if (!initialized()) {
            b("SPIManager, startScheme error, not initialized");
            return false;
        }
        OpenAbilityDelegate openAbilityDelegate = this.i;
        if (openAbilityDelegate != null) {
            return openAbilityDelegate.openScheme(uri);
        }
        k kVar = this.j;
        if (kVar != null) {
            DeeplinkService deeplinkService = kVar.f9766a;
            if (deeplinkService != null) {
                return deeplinkService.open(uri, e.a(aclAPIContext));
            }
            StringBuilder a2 = a.a("implementation of ACL cannot be found, isAclAvailable: ");
            a2.append(kVar.a());
            kVar.a("openScheme", a2.toString());
            return false;
        }
        b("SPIManager, startScheme error, open ability delegate is not implemented");
        return false;
    }

    public void pay(@NonNull String str, @NonNull String str2, @NonNull AclAPIContext aclAPIContext, @NonNull IPayCallback iPayCallback) {
        PaymentRequest paymentRequest;
        ACLog.i(Constants.TAG, "SPIManager, pay enter");
        if (!initialized()) {
            a("SPIManager, pay error, not initialized", iPayCallback);
            return;
        }
        IPay iPay = this.f;
        if (iPay != null) {
            iPay.pay(str, str2, iPayCallback);
            return;
        }
        m mVar = this.g;
        if (mVar == null) {
            a("SPIManager, pay error, pay impl is null", iPayCallback);
        } else if (mVar.f9768a != null) {
            if (!TextUtils.isEmpty(str)) {
                paymentRequest = new PaymentRequest(PaymentType.CASHIER_URL, str, (PaymentAmount) null, (Map<String, String>) null);
            } else {
                paymentRequest = new PaymentRequest(PaymentType.ORDER_ID, str2, (PaymentAmount) null, (Map<String, String>) null);
            }
            mVar.f9768a.pay(paymentRequest, e.a(aclAPIContext), new l(mVar, iPayCallback));
        } else {
            StringBuilder a2 = a.a("implementation of ACL cannot be found, isAclAvailable: ");
            a2.append(mVar.a());
            mVar.a(DecodeActionType.PAY, a2.toString());
            if (iPayCallback != null) {
                PayResult payResult = new PayResult();
                payResult.setResultCode(PayResultCode.PAY_FAILURE);
                payResult.setResultMessage("Oops! System busy. Try again later!");
                iPayCallback.onResult(payResult);
            }
        }
    }

    public void scan(@NonNull ScannerOption scannerOption, @NonNull AclAPIContext aclAPIContext, @NonNull ScanCallback scanCallback) {
        if (!initialized()) {
            a(ScanErrorCode.OPERATION_FAIL, "SPIManager, startScan error, not initialized", scanCallback);
            return;
        }
        OpenAbilityDelegate openAbilityDelegate = this.i;
        if (openAbilityDelegate != null) {
            openAbilityDelegate.scan(scannerOption, scanCallback);
            return;
        }
        k kVar = this.j;
        if (kVar == null) {
            a(ScanErrorCode.OPERATION_FAIL, "SPIManager, startScan error, open ability delegate is not implemented", scanCallback);
        } else if (kVar.b != null) {
            CodeType codeType = CodeType.QRCODE;
            if (scannerOption != null && scannerOption.type == ScanType.BAR) {
                codeType = CodeType.BARCODE;
            }
            boolean z = false;
            if (scannerOption != null) {
                z = scannerOption.hideAlbum;
            }
            kVar.b.scan(new com.alipay.iap.android.wallet.foundation.code.ScannerOption(codeType, z, (Map<String, String>) null), e.a(aclAPIContext), new i(kVar, scanCallback));
        } else {
            StringBuilder a2 = a.a("implementation of ACL cannot be found, isAclAvailable: ");
            a2.append(kVar.a());
            kVar.a("scan", a2.toString());
        }
    }

    public void showAuthPage(@NonNull AuthPageRequest authPageRequest, @NonNull AclAPIContext aclAPIContext, @NonNull AcCallback<AuthPageResult> acCallback) {
        ACLog.i(Constants.TAG, "SPIManager, showAuthPage enter");
        if (!initialized()) {
            a("SPIManager, getAuthPage error, not initialized", acCallback);
            return;
        }
        IOAuth iOAuth = this.b;
        if (iOAuth != null) {
            iOAuth.showAuthPage(authPageRequest, acCallback);
            return;
        }
        f fVar = this.c;
        if (fVar == null) {
            a("SPIManager, getAuthPage error, oAuth impl is null", acCallback);
        } else if (fVar.f9761a != null) {
            HashSet hashSet = new HashSet();
            Set<String> set = authPageRequest.scopes;
            if (set != null && set.size() > 0) {
                hashSet.addAll(authPageRequest.scopes);
            }
            HashMap hashMap = new HashMap();
            String str = authPageRequest.passThroughInfo;
            if (str != null) {
                hashMap.put("passThroughInfo", str);
            }
            fVar.f9761a.showAuthPage(authPageRequest.clientId, authPageRequest.authClientName, authPageRequest.authClientLogo, hashSet, hashMap, e.a(aclAPIContext), new com.iap.ac.android.u.e(fVar, acCallback));
        } else {
            StringBuilder a2 = a.a("No implementation found for showAuthPage, isAclAvailable: ");
            a2.append(fVar.a());
            fVar.a(com.iap.ac.android.acs.plugin.utils.Constants.JS_API_GET_AUTH_CODE, a2.toString());
        }
    }

    public final void a(String str, IAuthCallback iAuthCallback) {
        ACLog.e(Constants.TAG, str);
        ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_common_spi_get_authcode_fail", str);
        if (iAuthCallback != null) {
            iAuthCallback.onResult(new AuthResult());
        }
    }

    public final void a(String str, AcCallback<AuthPageResult> acCallback) {
        ACLog.e(Constants.TAG, str);
        ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_common_spi_get_authcode_fail", str);
        if (acCallback != null) {
            acCallback.onResult(new AuthPageResult());
        }
    }

    public final void a(String str, IPayCallback iPayCallback) {
        ACLog.e(Constants.TAG, str);
        ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_common_spi_pay_fail", str);
        if (iPayCallback != null) {
            PayResult payResult = new PayResult();
            payResult.setResultCode(PayResultCode.PAY_FAILURE);
            payResult.setResultMessage("Oops! System busy. Try again later!");
            iPayCallback.onResult(payResult);
        }
    }

    public final void a(String str) throws IOException {
        ACLog.e(Constants.TAG, str);
        ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_common_spi_send_http_request_fail", str);
        throw new IOException(str);
    }

    public final void a(ScanErrorCode scanErrorCode, String str, ScanCallback scanCallback) {
        ACLog.e(Constants.TAG, str);
        ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_common_spi_scan_fail", str);
        if (scanCallback != null) {
            scanCallback.onFailure(scanErrorCode, str);
        }
    }

    public void getAuthCode(@NonNull String str, @NonNull IAuthCallback iAuthCallback) {
        getAuthCode(str, e.a(), iAuthCallback);
    }

    public void getAuthCode(@NonNull String str, @NonNull AclAPIContext aclAPIContext, @NonNull IAuthCallback iAuthCallback) {
        ACLog.i(Constants.TAG, "SPIManager, getAuthCode for authorize with authUrl enter");
        if (!initialized()) {
            a("SPIManager, getAuthCode for authorize error, not initialized", iAuthCallback);
            return;
        }
        IOAuth iOAuth = this.b;
        if (iOAuth != null) {
            iOAuth.getAuthCode(str, iAuthCallback);
            return;
        }
        f fVar = this.c;
        if (fVar == null) {
            a("SPIManager, getAuthCode for authorize error, oAuth impl is null", iAuthCallback);
        } else if (fVar.f9761a != null) {
            String str2 = str;
            fVar.f9761a.getAuthCode(str2, OAuthCodeFlowType.ALIPAY_CONNECT, new HashMap(), e.a(aclAPIContext), new c(fVar, iAuthCallback));
        } else {
            StringBuilder a2 = a.a("No implementation found for getAuthCode, isAclAvailable: ");
            a2.append(fVar.a());
            fVar.a(com.iap.ac.android.acs.plugin.utils.Constants.JS_API_GET_AUTH_CODE, a2.toString());
        }
    }

    public void getAuthCode(@NonNull AuthRequest authRequest, @NonNull IAuthCallback iAuthCallback) {
        getAuthCode(authRequest, e.a(), iAuthCallback);
    }

    public void getAuthCode(@NonNull AuthRequest authRequest, @NonNull AclAPIContext aclAPIContext, @NonNull IAuthCallback iAuthCallback) {
        ACLog.i(Constants.TAG, "SPIManager, getAuthCode for authorize with AuthRequest enter");
        if (!initialized()) {
            a("SPIManager, getAuthCode for authorize with AuthRequest error, not initialized", iAuthCallback);
            return;
        }
        IOAuth iOAuth = this.b;
        if (iOAuth != null) {
            iOAuth.getAuthCode(authRequest, iAuthCallback);
            return;
        }
        f fVar = this.c;
        if (fVar == null) {
            a("SPIManager, getAuthCode for authorize with AuthRequest error, oAuth impl is null", iAuthCallback);
        } else if (fVar.f9761a != null) {
            HashSet hashSet = new HashSet();
            Set<String> set = authRequest.scopes;
            if (set != null && set.size() > 0) {
                hashSet.addAll(authRequest.scopes);
            }
            HashMap hashMap = new HashMap();
            String str = authRequest.acquirerId;
            if (str != null) {
                hashMap.put(GriverBaseConstants.KEY_SOURCE_SITE, str);
            }
            hashMap.put(GriverBaseConstants.KEY_CLIENT_ID, authRequest.authClientId);
            String str2 = authRequest.authRedirectUrl;
            if (str2 != null) {
                hashMap.put("authRedirectUrl", str2);
            }
            String str3 = authRequest.referenceAgreementId;
            if (str3 != null) {
                hashMap.put("referenceAgreementId", str3);
            }
            fVar.f9761a.getAuthCode(authRequest.clientId, hashSet, OAuthCodeFlowType.ALIPAY_CONNECT, hashMap, e.a(aclAPIContext), new d(fVar, iAuthCallback));
        } else {
            StringBuilder a2 = a.a("No implementation found for getAuthCode, isAclAvailable: ");
            a2.append(fVar.a());
            fVar.a(com.iap.ac.android.acs.plugin.utils.Constants.JS_API_GET_AUTH_CODE, a2.toString());
        }
    }
}
