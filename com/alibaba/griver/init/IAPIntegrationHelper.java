package com.alibaba.griver.init;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.GriverExtensionManifest;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.api.constants.GriverErrors;
import com.alibaba.griver.base.common.config.GriverAmcsConfig;
import com.alibaba.griver.base.common.config.GriverAmcsLiteConfig;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.base.common.constants.AMCSConstants;
import com.alibaba.griver.base.common.constants.GriverBaseConstants;
import com.alibaba.griver.base.common.constants.SecurityConstants;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import com.alibaba.griver.base.common.rpc.GriverRpcExtension;
import com.alibaba.griver.base.common.utils.KitUtils;
import com.alibaba.griver.base.common.utils.ReflectUtils;
import com.alibaba.griver.base.resource.appinfo.GriverAMCSAppUpdater;
import com.alibaba.griver.base.resource.appinfo.GriverAMCSLiteAppUpdater;
import com.alibaba.griver.base.resource.appinfo.GriverAppUpdater;
import com.alibaba.griver.core.Griver;
import com.alibaba.griver.core.GriverInitializeCallback;
import com.alibaba.griver.init.config.AmcsLiteManager;
import com.alibaba.griver.init.monitor.LogLiteManager;
import com.alibaba.griver.init.rpc.GriverRpcExtensionImpl;
import com.alibaba.griver.init.rpc.GriverRpcUtils;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.staticdatastore.IStaticDataStoreComponent;
import com.alipay.iap.android.common.securityprofiles.extractor.ProfileExtractor;
import com.alipay.iap.android.common.syncintegration.api.IAPSyncCommand;
import com.alipay.iap.android.wallet.acl.WalletServiceManager;
import com.alipay.iap.android.wallet.acl.base.APIContext;
import com.alipay.iap.android.wallet.acl.base.Callback;
import com.alipay.iap.android.wallet.acl.member.MemberInfoResult;
import com.alipay.iap.android.wallet.acl.member.MemberInfoScope;
import com.alipay.iap.android.wallet.acl.member.MemberService;
import com.iap.ac.android.biz.BuildConfig;
import com.iap.ac.android.common.account.ACUserInfo;
import com.iap.ac.android.common.account.ACUserInfoManager;
import com.iap.ac.android.common.account.IUserInfoManager;
import com.iap.ac.android.common.log.ACLog;
import id.dana.lib.gcontainer.app.bridge.contact.ContactEventType;
import java.lang.reflect.Method;

public class IAPIntegrationHelper {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f9202a;
    private static GriverInitializeCallback b;
    private static Application c;
    /* access modifiers changed from: private */
    public static String d;

    public static synchronized void init(Application application, IAPIntegrationConfiguration iAPIntegrationConfiguration, GriverInitializeCallback griverInitializeCallback) {
        IAPConfig iAPConfig;
        synchronized (IAPIntegrationHelper.class) {
            b = griverInitializeCallback;
            if (application == null) {
                a((int) GriverErrors.INITIALIZE_ERROR_PARAM, "application is null");
            } else if (iAPIntegrationConfiguration == null) {
                a((int) GriverErrors.INITIALIZE_ERROR_PARAM, "Missing all necessary param");
            } else {
                c = application;
                iAPIntegrationConfiguration.setEnv("PROD");
                iAPIntegrationConfiguration.setGatewayUrl("https://imgs-ac.alipay.com/imgw.htm");
                if (!TextUtils.isEmpty(IAPGriverConfig.getInstance().getAppId())) {
                    iAPConfig = IAPGriverConfig.getInstance();
                } else {
                    iAPConfig = a(application);
                }
                if (TextUtils.isEmpty(iAPConfig.getAppId())) {
                    iAPConfig.setAppId(iAPIntegrationConfiguration.getAppId());
                }
                if (TextUtils.isEmpty(iAPConfig.getWorkSpaceId())) {
                    iAPConfig.setWorkSpaceId(iAPIntegrationConfiguration.getWorkSpaceId());
                }
                if (TextUtils.isEmpty(iAPConfig.getEnv())) {
                    iAPConfig.setEnv(iAPIntegrationConfiguration.getEnv());
                }
                if (TextUtils.isEmpty(iAPConfig.getAppendUserAgent())) {
                    iAPConfig.setAppendUserAgent(iAPIntegrationConfiguration.getAppendUserAgent());
                }
                if (!TextUtils.isEmpty(iAPConfig.getGatewayUrl())) {
                    iAPIntegrationConfiguration.setGatewayUrl(iAPConfig.getGatewayUrl());
                }
                if (!TextUtils.isEmpty(iAPConfig.getEnvironment())) {
                    GriverEnv.setEnvironment(iAPConfig.getEnvironment().toLowerCase());
                }
                GriverEnv.setAlwaysShowDiagnosticTool(iAPConfig.getAlwaysShowDiagnosticTool());
                if (iAPConfig.getExtra() == null) {
                    iAPConfig.setExtra(iAPIntegrationConfiguration);
                }
                if (TextUtils.isEmpty(iAPConfig.getAppId())) {
                    a((int) GriverErrors.INITIALIZE_ERROR_PARAM, "Missing necessary param(appId)");
                } else if (TextUtils.isEmpty(iAPConfig.getWorkSpaceId())) {
                    a((int) GriverErrors.INITIALIZE_ERROR_PARAM, "Missing necessary param(workSpaceId)");
                } else if (TextUtils.isEmpty(iAPConfig.getEnv())) {
                    a((int) GriverErrors.INITIALIZE_ERROR_PARAM, "Missing necessary param(env)");
                } else {
                    if (TextUtils.isEmpty(iAPConfig.getExtra().getGatewayUrl())) {
                        iAPConfig.getExtra().setGatewayUrl("https://imgs-ac.alipay.com/imgw.htm");
                    }
                    if (TextUtils.isEmpty(iAPConfig.getExtra().getLogProductId())) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(iAPConfig.getAppId());
                        sb.append("_ANDROID-");
                        sb.append(iAPConfig.getEnv().toUpperCase());
                        iAPConfig.getExtra().setLogProductId(sb.toString());
                    }
                    if (TextUtils.isEmpty(iAPConfig.getExtra().getLogUploadURL())) {
                        iAPConfig.getExtra().setLogUploadURL(BuildConfig.GATEWAY_LOG_PROD);
                    }
                    boolean equalsIgnoreCase = "yes".equalsIgnoreCase(iAPConfig.getUseSecurityGuard());
                    if (!equalsIgnoreCase || ReflectUtils.classExist(SecurityConstants.SG_CLASS)) {
                        if (TextUtils.isEmpty(iAPConfig.getVerifyPackagePublicKey())) {
                            ACLog.w("IAPIntegrationHelper", "Verify package public key is not in config");
                        } else {
                            iAPConfig.setVerifyPackagePublicKey(iAPConfig.getVerifyPackagePublicKey());
                        }
                        if (equalsIgnoreCase) {
                            try {
                                String extraData = getExtraData(iAPConfig, "verifyPackagePublicKey");
                                if (TextUtils.isEmpty(extraData)) {
                                    ACLog.w("IAPIntegrationHelper", "Verify package public key is not in security guard");
                                } else {
                                    iAPConfig.setVerifyPackagePublicKey(extraData);
                                }
                            } catch (Exception e) {
                                ACLog.e("IAPIntegrationHelper", "read security guard failed", e);
                            }
                        }
                        a();
                        ACLog.d("IAPIntegrationHelper", JSON.toJSONString(iAPConfig));
                        GriverRpcUtils.init(application, iAPConfig);
                        if (a(iAPConfig)) {
                            if (ReflectUtils.classExist("com.iap.ac.android.loglite.api.AnalyticsConfig")) {
                                try {
                                    LogLiteManager.init(application, iAPConfig);
                                    if (isDebuggable()) {
                                        try {
                                            Class<?> cls = Class.forName("com.alipay.wallet.profiler.core.ProfilerMgr");
                                            Method declaredMethod = cls.getDeclaredMethod(ContactEventType.CONTACT_GET, new Class[0]);
                                            cls.getDeclaredMethod(IAPSyncCommand.COMMAND_INIT, new Class[]{Application.class}).invoke(declaredMethod.invoke(cls, new Object[0]), new Object[]{c});
                                        } catch (Exception unused) {
                                            ACLog.e("IAPIntegrationHelper", "reflect to use FELIX FAILED");
                                        }
                                    }
                                    Griver.initialize(application, iAPConfig, griverInitializeCallback);
                                    a(application, iAPConfig);
                                    if (isDebuggable()) {
                                        try {
                                            Class<?> cls2 = Class.forName("com.alipay.wallet.profiler.core.ProfilerMgr");
                                            Method declaredMethod2 = cls2.getDeclaredMethod(ContactEventType.CONTACT_GET, new Class[0]);
                                            cls2.getDeclaredMethod("postInit", new Class[]{Application.class}).invoke(declaredMethod2.invoke(cls2, new Object[0]), new Object[]{c});
                                        } catch (Exception unused2) {
                                            ACLog.e("IAPIntegrationHelper", "reflect to use FELIX FAILED");
                                        }
                                    }
                                } catch (Exception unused3) {
                                    a((int) GriverErrors.INITIALIZE_EXCEPTION, "Init log failed.");
                                }
                            } else {
                                a((int) GriverErrors.INITIALIZE_EXCEPTION, "Log SDK is not exist.");
                            }
                        }
                    } else {
                        a((int) GriverErrors.INITIALIZE_EXCEPTION, "Security Guard SDK is not exist");
                    }
                }
            }
        }
    }

    private static void a() {
        try {
            b();
            AnonymousClass1 r0 = new IUserInfoManager() {
                public final boolean setUserInfo(ACUserInfo aCUserInfo) {
                    return false;
                }

                public final ACUserInfo getUserInfo() {
                    IAPIntegrationHelper.b();
                    if (TextUtils.isEmpty(IAPIntegrationHelper.d)) {
                        return new ACUserInfo();
                    }
                    ACUserInfo aCUserInfo = new ACUserInfo();
                    aCUserInfo.openId = IAPIntegrationHelper.d;
                    return aCUserInfo;
                }

                public final String getOpenId() {
                    IAPIntegrationHelper.b();
                    if (!TextUtils.isEmpty(IAPIntegrationHelper.d)) {
                        return IAPIntegrationHelper.d;
                    }
                    return null;
                }
            };
            ACUserInfoManager.setUserInfoManager(r0);
            ACUserInfoManager.setUserInfoManager(r0, "GriverAppContainer");
        } catch (Exception e) {
            ACLog.e("IAPIntegrationHelper", "try to set userId to common failed", e);
        }
    }

    /* access modifiers changed from: private */
    public static void b() {
        try {
            ((MemberService) WalletServiceManager.getInstance().getService(MemberService.class)).getMemberInfo(MemberService.MemberInfoFetchStrategy.LOCAL_USER_ID_ONLY, (MemberInfoScope) null, (APIContext) null, new Callback<MemberInfoResult>() {
                public final void result(MemberInfoResult memberInfoResult) {
                    if (memberInfoResult == null || memberInfoResult.memberInfo == null) {
                        ACLog.e("IAPIntegrationHelper", "userId not implemented in wallet API");
                    } else {
                        String unused = IAPIntegrationHelper.d = memberInfoResult.memberInfo.userId;
                    }
                }
            });
        } catch (Exception e) {
            ACLog.e("IAPIntegrationHelper", "try to set userId to common failed", e);
        }
    }

    private static IAPConfig a(Application application) {
        IAPConfig iAPConfig = (IAPConfig) JSON.parseObject(KitUtils.getAssetContent(application, GriverBaseConstants.GRIVER_CONFIG_ASSET_PATH), IAPConfig.class);
        return iAPConfig == null ? new IAPConfig() : iAPConfig;
    }

    private static void a(int i, String str) {
        GriverInitializeCallback griverInitializeCallback = b;
        if (griverInitializeCallback != null) {
            griverInitializeCallback.onInitializeFailed(i, str);
        }
        MonitorMap.Builder builder = new MonitorMap.Builder();
        builder.code(String.valueOf(i)).message(str);
        GriverMonitor.error(GriverMonitorConstants.ERROR_INIT_CONTAINER, "GriverAppContainer", builder.build());
    }

    private static void a(Application application, IAPConfig iAPConfig) {
        Griver.registerExtension(new GriverExtensionManifest(GriverRpcExtension.class, new GriverRpcExtensionImpl("GriverAppContainer")));
    }

    private static boolean a(IAPConfig iAPConfig) {
        if (!(!"no".equalsIgnoreCase(iAPConfig.getUseAmcsLite()))) {
            GriverConfig.setConfigProxy(new GriverAmcsConfig());
            GriverAppUpdater.setGriverAppUpdateProxy(new GriverAMCSAppUpdater());
        } else if (ReflectUtils.classExist(AMCSConstants.AMCS_LITE_MAIN_CLASS)) {
            AmcsLiteManager.initAmcs(c, iAPConfig);
            GriverConfig.setConfigProxy(new GriverAmcsLiteConfig());
            GriverAppUpdater.setGriverAppUpdateProxy(new GriverAMCSLiteAppUpdater("GriverAppContainer"));
        } else {
            a((int) GriverErrors.INITIALIZE_EXCEPTION, "AMCS Lite SDK is not exist");
            return false;
        }
        return true;
    }

    public static String getExtraData(IAPConfig iAPConfig, String str) {
        StringBuilder sb = new StringBuilder("authCode == ");
        sb.append(iAPConfig.getAuthCode());
        ACLog.d("IAPIntegrationHelper", sb.toString());
        JSONObject parseObject = JSON.parseObject(getSecurityExtraData(c, iAPConfig.getAuthCode(), ProfileExtractor.KEY_DEFAULT_RPC_PROFILES));
        StringBuilder sb2 = new StringBuilder("GriverConfig == ");
        sb2.append(JSON.toJSONString(parseObject));
        ACLog.d("IAPIntegrationHelper", sb2.toString());
        return (!JSONUtils.contains(parseObject, "prod") || !JSONUtils.contains(parseObject.getJSONObject("prod"), "extras")) ? "" : parseObject.getJSONObject("prod").getJSONObject("extras").getString(str);
    }

    @Nullable
    public static String getSecurityExtraData(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        IStaticDataStoreComponent staticDataStoreComp = SecurityGuardManager.getInstance(context).getStaticDataStoreComp();
        if (staticDataStoreComp != null) {
            return staticDataStoreComp.getExtraData(str2, str);
        }
        return null;
    }

    public static boolean isDebuggable() {
        Boolean bool = f9202a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            if ((c.getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            ACLog.e("GriverEnv", "exception detail", th);
            return false;
        }
    }
}
