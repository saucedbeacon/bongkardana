package com.alibaba.griver.biz.jsapi.open;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingRequest;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.biz.R;
import com.alibaba.griver.biz.WalletAPIUtils;
import com.alipay.iap.android.wallet.acl.WalletServiceManager;
import com.alipay.iap.android.wallet.acl.base.APIContext;
import com.alipay.iap.android.wallet.acl.base.Callback;
import com.alipay.iap.android.wallet.acl.member.MemberInfo;
import com.alipay.iap.android.wallet.acl.member.MemberInfoResult;
import com.alipay.iap.android.wallet.acl.member.MemberInfoScope;
import com.alipay.iap.android.wallet.acl.member.MemberService;
import com.alipay.iap.android.wallet.acl.oauth.OAuthCodeFlowType;
import com.alipay.iap.android.wallet.acl.oauth.OAuthPageConfirmResult;
import com.alipay.iap.android.wallet.acl.oauth.OAuthResult;
import com.alipay.iap.android.wallet.acl.oauth.OAuthScopeQueryResult;
import com.alipay.iap.android.wallet.acl.oauth.OAuthService;
import com.alipay.iap.android.wallet.acl.payment.PaymentAmount;
import com.alipay.iap.android.wallet.acl.payment.PaymentRequest;
import com.alipay.iap.android.wallet.acl.payment.PaymentResult;
import com.alipay.iap.android.wallet.acl.payment.PaymentService;
import com.alipay.iap.android.wallet.acl.payment.PaymentType;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.iap.ac.android.acs.plugin.utils.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import o.desc;

@Keep
public class OpenAPIBridgeExtension extends SimpleBridgeExtension {
    private static final String SCOPE_AUTH_USER_INFO = "auth_user";
    private static final String SCOPE_USER_INFO = "userInfo";
    private static final String TAG = "OpenAPIBridgeExtension";
    private static final int USER_CANCEL = 11;
    private static final Map<String, String> scopesMap;

    /* access modifiers changed from: private */
    public String ifNullConvertToEmpty(String str) {
        return str == null ? "" : str;
    }

    static {
        HashMap hashMap = new HashMap();
        scopesMap = hashMap;
        hashMap.put("userInfo", "auth_user");
    }

    @ThreadType(ExecutorType.NETWORK)
    @ActionFilter
    public void getAuthCode(@BindingParam({"platform"}) String str, @BindingParam({"scopeNicks"}) JSONArray jSONArray, @BindingParam({"extInfo"}) JSONObject jSONObject, @BindingParam({"appId"}) String str2, @BindingParam({"isvAppId"}) String str3, @BindingParam(booleanDefault = true, value = {"showErrorTip"}) boolean z, @BindingParam({"landscape"}) String str4, @BindingParam({"paladinMode"}) String str5, @BindingNode(Page.class) Page page, @BindingCallback BridgeCallback bridgeCallback, @BindingRequest JSONObject jSONObject2, @BindingApiContext ApiContext apiContext) {
        BridgeCallback bridgeCallback2 = bridgeCallback;
        if (jSONArray == null || jSONArray.size() == 0) {
            bridgeCallback2.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else if (page == null || page.getApp() == null || page.isExited() || page.isDestroyed()) {
            bridgeCallback2.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else {
            String appId = TextUtils.isEmpty(str2) ? page.getApp().getAppId() : str2;
            if (TextUtils.isEmpty(appId)) {
                bridgeCallback2.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
                return;
            }
            HashSet hashSet = new HashSet();
            for (int i = 0; i < jSONArray.size(); i++) {
                hashSet.add(jSONArray.getString(i));
            }
            executeGetAuthCode(appId, WalletAPIUtils.createApiContext(page), hashSet, page, bridgeCallback, 3);
        }
    }

    /* access modifiers changed from: private */
    public void executeGetAuthCode(String str, APIContext aPIContext, Set<String> set, Page page, BridgeCallback bridgeCallback, int i) {
        BridgeCallback bridgeCallback2 = bridgeCallback;
        try {
            OAuthService oAuthService = (OAuthService) WalletServiceManager.getInstance().getService(OAuthService.class);
            try {
                Map<String, String> extendInfoFromApp = getExtendInfoFromApp(page.getApp());
                final BridgeCallback bridgeCallback3 = bridgeCallback;
                final Page page2 = page;
                final OAuthService oAuthService2 = oAuthService;
                final String str2 = str;
                final Set<String> set2 = set;
                final Map<String, String> map = extendInfoFromApp;
                final APIContext aPIContext2 = aPIContext;
                final int i2 = i;
                oAuthService.getAuthCode(str, set, OAuthCodeFlowType.LOCAL_MINI_PROGRAM, extendInfoFromApp, aPIContext, new Callback<OAuthResult>() {
                    public void result(OAuthResult oAuthResult) {
                        String str;
                        String str2;
                        if (oAuthResult == null) {
                            bridgeCallback3.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                        } else if (!oAuthResult.isHasError()) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("authCode", (Object) oAuthResult.authCode);
                            jSONObject.put("authErrorScopes", (Object) oAuthResult.authErrorScopes);
                            jSONObject.put("authSuccessScopes", (Object) oAuthResult.authSuccessScopes);
                            bridgeCallback3.sendJSONResponse(jSONObject);
                        } else if (oAuthResult.getResultError().errorCode == 2001) {
                            AppModel appModel = (AppModel) page2.getApp().getData(AppModel.class);
                            if (appModel == null || appModel.getAppInfoModel() == null) {
                                str2 = "";
                                str = str2;
                            } else {
                                String name = appModel.getAppInfoModel().getName();
                                str = appModel.getAppInfoModel().getLogo();
                                str2 = name;
                            }
                            oAuthService2.showAuthPage(str2, str2, str, set2, map, aPIContext2, new Callback<OAuthPageConfirmResult>() {
                                public void result(OAuthPageConfirmResult oAuthPageConfirmResult) {
                                    if (oAuthPageConfirmResult.isHasError()) {
                                        if (oAuthPageConfirmResult.getResultError().errorCode == 1001) {
                                            bridgeCallback3.sendBridgeResponse(BridgeResponse.newError(11, "Unauthorized to get user info "));
                                        } else if (oAuthPageConfirmResult.getResultError().errorCode == 1005) {
                                            bridgeCallback3.sendBridgeResponse(BridgeResponse.newError(10, "Empty Data"));
                                        } else {
                                            bridgeCallback3.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                                        }
                                    } else if (i2 > 0) {
                                        OpenAPIBridgeExtension.this.executeGetAuthCode(str2, aPIContext2, set2, page2, bridgeCallback3, i2 - 1);
                                    } else {
                                        bridgeCallback3.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                                    }
                                }
                            });
                        } else {
                            bridgeCallback3.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                        }
                    }
                });
            } catch (WalletServiceManager.ServiceNotFoundException e) {
                e = e;
                RVLogger.e(TAG, "getAuthCode failed", e);
                bridgeCallback2.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            } catch (Throwable th) {
                th = th;
                RVLogger.e(TAG, "getAuthCode failed", th);
                bridgeCallback2.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            }
        } catch (WalletServiceManager.ServiceNotFoundException e2) {
            e = e2;
            RVLogger.e(TAG, "getAuthCode failed", e);
            bridgeCallback2.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } catch (Throwable th2) {
            th = th2;
            RVLogger.e(TAG, "getAuthCode failed", th);
            bridgeCallback2.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        }
    }

    /* access modifiers changed from: private */
    public Map<String, String> getExtendInfoFromApp(App app) {
        HashMap hashMap = new HashMap();
        if (app == null) {
            RVLogger.d(TAG, "app is null, return empty extend info");
            return hashMap;
        }
        AppModel appModel = (AppModel) app.getData(AppModel.class);
        if (appModel == null) {
            RVLogger.d(TAG, "app model is null in app, return empty extend info");
            return hashMap;
        }
        JSONObject extendInfos = appModel.getExtendInfos();
        if (extendInfos == null) {
            RVLogger.d(TAG, "extend info in app model is null, return empty extend info");
            return hashMap;
        }
        for (Map.Entry next : extendInfos.entrySet()) {
            hashMap.put(next.getKey(), next.getValue() == null ? "" : next.getValue().toString());
        }
        return hashMap;
    }

    @ThreadType(ExecutorType.URGENT)
    @ActionFilter
    public void tradePay(@BindingApiContext ApiContext apiContext, @BindingParam({"tradeNO"}) String str, @BindingParam({"orderStr"}) String str2, @BindingParam({"paymentUrl"}) String str3, @BindingNode(App.class) App app, @BindingNode(Page.class) Page page, @BindingCallback final BridgeCallback bridgeCallback) {
        PaymentRequest paymentRequest;
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            try {
                PaymentService paymentService = (PaymentService) WalletServiceManager.getInstance().getService(PaymentService.class);
                if (!TextUtils.isEmpty(str3)) {
                    paymentRequest = new PaymentRequest(PaymentType.CASHIER_URL, str3, (PaymentAmount) null, getExtendInfoFromApp(app));
                } else if (!TextUtils.isEmpty(str2)) {
                    paymentRequest = new PaymentRequest(PaymentType.ORDER_STRING, str2, (PaymentAmount) null, getExtendInfoFromApp(app));
                } else {
                    paymentRequest = new PaymentRequest(PaymentType.ORDER_ID, str, (PaymentAmount) null, getExtendInfoFromApp(app));
                }
                paymentService.pay(paymentRequest, WalletAPIUtils.createApiContext(page), new Callback<PaymentResult>() {
                    public void result(PaymentResult paymentResult) {
                        if (paymentResult == null) {
                            RVLogger.w(OpenAPIBridgeExtension.TAG, "tradePay failed with empty payment result");
                            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                            return;
                        }
                        RVLogger.d(OpenAPIBridgeExtension.TAG, "tradePay succeeds");
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("resultCode", (Object) paymentResult.getResultCode());
                        bridgeCallback.sendJSONResponse(jSONObject);
                    }
                });
            } catch (WalletServiceManager.ServiceNotFoundException e) {
                RVLogger.e(TAG, "tradePay failed", e);
                bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            } catch (Throwable th) {
                RVLogger.e(TAG, "tradePay failed", th);
                bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            }
        } else {
            RVLogger.w(TAG, "tradePay but params are empty, return");
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        }
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void getComponentAuth(@BindingParam({"platform"}) String str, @BindingParam({"scopeNicks"}) JSONArray jSONArray, @BindingParam({"extInfo"}) JSONObject jSONObject, @BindingParam({"appId"}) String str2, @BindingParam({"isvAppId"}) String str3, @BindingParam(booleanDefault = true, value = {"showErrorTip"}) boolean z, @BindingNode(Page.class) Page page, @BindingCallback BridgeCallback bridgeCallback, @BindingApiContext ApiContext apiContext) {
        JSONArray jSONArray2 = jSONArray;
        BridgeCallback bridgeCallback2 = bridgeCallback;
        if (page == null || page.getApp() == null || page.isExited() || page.isDestroyed()) {
            bridgeCallback2.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            return;
        }
        AppModel appModel = (AppModel) page.getApp().getData(AppModel.class);
        if (appModel == null || appModel.getAppInfoModel() == null) {
            bridgeCallback2.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        } else if (jSONArray2 == null || jSONArray.size() == 0) {
            bridgeCallback2.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else {
            String appId = TextUtils.isEmpty(str2) ? page.getApp().getAppId() : str2;
            if (TextUtils.isEmpty(appId)) {
                bridgeCallback2.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
                return;
            }
            try {
                HashSet hashSet = new HashSet();
                for (int i = 0; i < jSONArray.size(); i++) {
                    String string = jSONArray.getString(i);
                    if (scopesMap.containsKey(string)) {
                        string = scopesMap.get(string);
                    }
                    hashSet.add(string);
                }
                executeGetAuthCode(appId, WalletAPIUtils.createApiContext(page), hashSet, page, bridgeCallback, 3);
            } catch (Throwable th) {
                RVLogger.e(TAG, "getAuthCode failed", th);
                bridgeCallback2.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            }
        }
    }

    @ThreadType(ExecutorType.URGENT)
    @ActionFilter
    public void appxrpc(@BindingParam({"operationType"}) String str, @BindingParam({"headers"}) JSONObject jSONObject, @BindingParam({"requestData"}) JSONArray jSONArray, @BindingNode(App.class) App app, @BindingNode(Page.class) Page page, @BindingCallback BridgeCallback bridgeCallback, @BindingApiContext ApiContext apiContext) {
        if (page == null) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(3, "page is null"));
            RVLogger.d(TAG, "page is null");
        } else if (TextUtils.isEmpty(str)) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(2, "operationType is null"));
            RVLogger.d(TAG, "operationType is null");
        } else if (jSONArray == null || jSONArray.size() == 0) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(2, "requestData is null"));
            RVLogger.d(TAG, "requestData is null");
        } else {
            char c = 0;
            JSONObject jSONObject2 = jSONArray.getJSONObject(0);
            if (!jSONObject2.containsKey(FirebaseAnalytics.Param.METHOD)) {
                bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(2, "request method is null"));
                RVLogger.d(TAG, "request method is null");
                return;
            }
            String string = jSONObject2.getString(FirebaseAnalytics.Param.METHOD);
            if (string.hashCode() != -446948871 || !string.equals(Constants.JS_API_GET_OPEN_USER_INFO)) {
                c = 65535;
            }
            if (c == 0) {
                getUserInfo(app, WalletAPIUtils.createApiContext(page), apiContext, bridgeCallback);
            }
        }
    }

    private void getUserInfo(App app, APIContext aPIContext, ApiContext apiContext, BridgeCallback bridgeCallback) {
        try {
            final BridgeCallback bridgeCallback2 = bridgeCallback;
            final ApiContext apiContext2 = apiContext;
            final App app2 = app;
            final APIContext aPIContext2 = aPIContext;
            ((OAuthService) WalletServiceManager.getInstance().getService(OAuthService.class)).getAuthorizedScopes(app.getAppId(), getExtendInfoFromApp(app), aPIContext, new Callback<OAuthScopeQueryResult>() {
                public void result(OAuthScopeQueryResult oAuthScopeQueryResult) {
                    if (oAuthScopeQueryResult == null) {
                        bridgeCallback2.sendBridgeResponse(BridgeResponse.newError(10, apiContext2.getAppContext().getString(R.string.griver_biz_user_unauthorized)));
                        return;
                    }
                    String[] authorizedScopes = oAuthScopeQueryResult.getAuthorizedScopes();
                    if (authorizedScopes == null || authorizedScopes.length == 0) {
                        bridgeCallback2.sendBridgeResponse(BridgeResponse.newError(10, apiContext2.getAppContext().getString(R.string.griver_biz_user_unauthorized)));
                        return;
                    }
                    Arrays.sort(authorizedScopes);
                    if (Arrays.binarySearch(authorizedScopes, "auth_user") < 0) {
                        bridgeCallback2.sendBridgeResponse(BridgeResponse.newError(10, apiContext2.getAppContext().getString(R.string.griver_biz_user_unauthorized)));
                        return;
                    }
                    try {
                        HashSet hashSet = new HashSet();
                        hashSet.add("auth_user");
                        ((MemberService) WalletServiceManager.getInstance().getService(MemberService.class)).getMemberInfo(MemberService.MemberInfoFetchStrategy.REMOTE_FETCH, new MemberInfoScope(app2.getAppId(), hashSet, OpenAPIBridgeExtension.this.getExtendInfoFromApp(app2)), aPIContext2, new Callback<MemberInfoResult>() {
                            public void result(MemberInfoResult memberInfoResult) {
                                if (memberInfoResult == null || memberInfoResult.getMemberInfo() == null) {
                                    bridgeCallback2.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                                    return;
                                }
                                MemberInfo memberInfo = memberInfoResult.getMemberInfo();
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("avatar", (Object) OpenAPIBridgeExtension.this.ifNullConvertToEmpty(memberInfo.avatar));
                                jSONObject.put("nickName", (Object) OpenAPIBridgeExtension.this.ifNullConvertToEmpty(memberInfo.userName));
                                jSONObject.put("gender", (Object) OpenAPIBridgeExtension.this.ifNullConvertToEmpty(memberInfo.gender));
                                if (memberInfo.getExtendedInfo() != null) {
                                    Map<String, String> extendedInfo = memberInfo.getExtendedInfo();
                                    jSONObject.put(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, (Object) OpenAPIBridgeExtension.this.ifNullConvertToEmpty(extendedInfo.get(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE)));
                                    jSONObject.put("province", (Object) OpenAPIBridgeExtension.this.ifNullConvertToEmpty(extendedInfo.get("province")));
                                    jSONObject.put(desc.USER_CITY, (Object) OpenAPIBridgeExtension.this.ifNullConvertToEmpty(extendedInfo.get(desc.USER_CITY)));
                                } else {
                                    jSONObject.put(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, (Object) "");
                                    jSONObject.put("province", (Object) "");
                                    jSONObject.put(desc.USER_CITY, (Object) "");
                                }
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("response", (Object) jSONObject);
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("response", (Object) JSON.toJSONString(jSONObject2));
                                bridgeCallback2.sendJSONResponse(jSONObject3);
                            }
                        });
                    } catch (WalletServiceManager.ServiceNotFoundException e) {
                        RVLogger.e(OpenAPIBridgeExtension.TAG, "getOpenUserInfo failed", e);
                        bridgeCallback2.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                    } catch (Throwable th) {
                        RVLogger.e(OpenAPIBridgeExtension.TAG, "getOpenUserInfo failed", th);
                        bridgeCallback2.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                    }
                }
            });
        } catch (Exception e) {
            RVLogger.e(TAG, "getOpenUserInfo failed", e);
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        }
    }
}
