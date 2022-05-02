package com.iap.ac.android.biz.internal.impl;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.griver.api.common.GriverExtensionManifest;
import com.alibaba.griver.api.common.account.GriverAccountExtension;
import com.alibaba.griver.core.Griver;
import com.alibaba.griver.core.GriverInitializeCallback;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.alibaba.griver.init.IAPIntegrationConfiguration;
import com.alibaba.griver.init.IAPIntegrationHelper;
import com.alipay.ac.pa.foundation.PSAadpterAC;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.acs.plugin.biz.region.RegionManager;
import com.iap.ac.android.acs.plugin.downgrade.jsapi.IAPJSAPIInterceptorManager;
import com.iap.ac.android.biz.BuildConfig;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.callback.InitCallback;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.CommonConfig;
import com.iap.ac.android.biz.common.model.InitConfig;
import com.iap.ac.android.biz.common.model.InitErrorCode;
import com.iap.ac.android.biz.common.proxy.common.CommonRegionNetworkProxy;
import com.iap.ac.android.biz.common.proxy.common.NetworkProxy;
import com.iap.ac.android.biz.common.proxy.common.ProxyScene;
import com.iap.ac.android.biz.common.rpc.ssl.IAPSslPinner;
import com.iap.ac.android.biz.common.spi.SPIManager;
import com.iap.ac.android.biz.common.utils.Utils;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.biz.core.ACCoreManager;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.mpm.MPM;
import com.iap.ac.android.mpm.interceptor.provider.UAProvider;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class ACInitManager {
    public static void init(@NonNull final Application application, @NonNull final InitConfig initConfig, @Nullable final InitCallback initCallback) {
        if (application == null || initConfig == null) {
            StringBuilder sb = new StringBuilder("empty input parameters, context: ");
            sb.append(application);
            sb.append(", initConfig:");
            sb.append(initConfig);
            String obj = sb.toString();
            ACLog.e(Constants.TAG, obj);
            if (initCallback != null) {
                initCallback.onFailure(InitErrorCode.INITIALIZE_PARAM_ILLEGAL, obj);
            }
            ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_common_init").addParams("sdkVersion", BuildConfig.VERSION_NAME).addParams("result", "F").addParams("resultMessage", obj).event();
            return;
        }
        initACManager(application, initConfig);
        if (!ACManager.getInstance().isInitialized()) {
            ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_common_init").addParams("sdkVersion", BuildConfig.VERSION_NAME).addParams("result", "F").addParams("resultMessage", "parse preset config error, please import the resource file from AC").event();
            if (initCallback != null) {
                initCallback.onFailure(InitErrorCode.INITIALIZE_UNKNOWN_EXCEPTION, "parse preset config error, please import the resource file from AC");
                return;
            }
            return;
        }
        initACCore(application, initConfig);
        initPACore(application, initConfig);
        initGriver(application, initConfig, new InitCallback() {
            public final void onFailure(InitErrorCode initErrorCode, String str) {
                int length = str != null ? str.length() : 0;
                int max = dispatchOnCancelled.setMax(length);
                if (length != max) {
                    onCanceled oncanceled = new onCanceled(length, max, 1);
                    onCancelLoad.setMax(501953998, oncanceled);
                    onCancelLoad.getMin(501953998, oncanceled);
                }
                InitCallback initCallback = initCallback;
                if (initCallback != null) {
                    initCallback.onFailure(initErrorCode, str);
                }
            }

            public final void onSuccess() {
                ACInitManager.initContainer();
                ACInitManager.initRegion(application, initConfig);
                InitCallback initCallback = initCallback;
                if (initCallback != null) {
                    initCallback.onSuccess();
                }
            }
        });
    }

    public static void initACCore(Context context, InitConfig initConfig) {
        ACLog.i(Constants.TAG, "initACCore begin");
        if (!Utils.checkClassExist(Constants.PACKAGE_NAME_AC_CORE_MANAGER)) {
            ACLog.w(Constants.TAG, "initACCore error, can not find the package, skip it");
        } else {
            ACCoreManager.getInstance().init(context, initConfig);
        }
    }

    public static void initACManager(Context context, InitConfig initConfig) {
        ACManager.getInstance().init(context, initConfig);
        UAProvider.setPspUA(initConfig.userAgent);
        NetworkProxy commonNetworkProxy = initConfig.getCommonNetworkProxy(ProxyScene.PROXY_SCENE_PAY);
        if (commonNetworkProxy != null) {
            CommonRegionNetworkProxy.getInstance().setHttpTransporter(ProxyScene.PROXY_SCENE_PAY, commonNetworkProxy);
        } else if (initConfig.networkProxy != null) {
            com.iap.ac.android.biz.common.proxy.NetworkProxy.getInstance().setHttpTransporter(initConfig.networkProxy);
        }
        if (isSslPinningEnable()) {
            IAPSslPinner.INSTANCE.init(context);
        }
        ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_common_init").addParams("sdkVersion", BuildConfig.VERSION_NAME).addParams("result", DiskFormatter.TB).event();
    }

    public static void initContainer() {
        MPM.get().initContainer();
        if (Utils.checkClassExist(Constants.PACKAGE_NAME_AC_JSAPI_INTERCEPTOR_MANAGER)) {
            IAPJSAPIInterceptorManager.getInstance().init();
        }
    }

    public static void initGriver(Application application, InitConfig initConfig, final InitCallback initCallback) {
        ACLog.i(Constants.TAG, "initGriver begin");
        if (!Utils.checkClassExist("com.alibaba.griver.init.IAPIntegrationConfiguration") || !Utils.checkClassExist("com.alibaba.griver.init.IAPIntegrationHelper")) {
            ACLog.w(Constants.TAG, "initGriver error, can not find the package, skip it");
            if (initCallback != null) {
                initCallback.onSuccess();
                return;
            }
            return;
        }
        IAPIntegrationConfiguration iAPIntegrationConfiguration = new IAPIntegrationConfiguration();
        CommonConfig commonConfig = ACManager.getInstance().getCommonConfig();
        iAPIntegrationConfiguration.setEnv(commonConfig.envType);
        iAPIntegrationConfiguration.setAppendUserAgent(initConfig.userAgent);
        iAPIntegrationConfiguration.setAppId(commonConfig.appId);
        iAPIntegrationConfiguration.setGatewayUrl(commonConfig.gatewayUrl);
        iAPIntegrationConfiguration.setLogUploadURL(commonConfig.logGatewayUrl);
        iAPIntegrationConfiguration.setWorkSpaceId(commonConfig.getWorkspaceId());
        iAPIntegrationConfiguration.setLogProductId(commonConfig.getLogProductId());
        iAPIntegrationConfiguration.setBizCode("ac_biz");
        IAPIntegrationHelper.init(application, iAPIntegrationConfiguration, new GriverInitializeCallback() {
            public final void onInitializeFailed(int i, String str) {
                StringBuilder sb = new StringBuilder("initGriver callback, initGriver fail: ");
                sb.append(i);
                sb.append(", errorMessage: ");
                sb.append(str);
                ACLog.i(Constants.TAG, sb.toString());
                ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_common_init_griver").addParams("sdkVersion", BuildConfig.VERSION_NAME).addParams("result", "F").addParams("resultMessage", str).event();
                if (initCallback != null) {
                    InitErrorCode initErrorCode = InitErrorCode.INITIALIZE_UNKNOWN_EXCEPTION;
                    if (i == 90001) {
                        initErrorCode = InitErrorCode.INITIALIZE_AUTHENTICATION_FAILED;
                    } else if (i == 90002) {
                        initErrorCode = InitErrorCode.INITIALIZE_PARAM_ILLEGAL;
                    }
                    initCallback.onFailure(initErrorCode, str);
                }
            }

            public final void onInitializedSuccess() {
                ACLog.i(Constants.TAG, "initGriver callback, initGriver success");
                ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_common_init_griver").addParams("sdkVersion", BuildConfig.VERSION_NAME).addParams("result", DiskFormatter.TB).event();
                Griver.registerExtension(new GriverExtensionManifest(GriverAccountExtension.class, new GriverAccountExtension() {
                    public String getUserId() {
                        return SPIManager.getInstance().getOpenId();
                    }
                }));
                InitCallback initCallback = initCallback;
                if (initCallback != null) {
                    initCallback.onSuccess();
                }
            }
        });
    }

    public static void initPACore(Application application, InitConfig initConfig) {
        ACLog.i(Constants.TAG, "InitPACore begin");
        if (!Utils.checkClassExist(Constants.PACKAGE_NAME_PA_CORE_MANAGER)) {
            ACLog.w(Constants.TAG, "initPACore error, can not find the package, skip it");
        } else {
            PSAadpterAC.getInstance().setupWithConfig(application, initConfig);
        }
    }

    public static void initRegion(Context context, InitConfig initConfig) {
        RegionManager.getInstance().initRegion(context, initConfig);
    }

    public static void initWithContext(@NonNull Context context, @NonNull InitConfig initConfig) {
        if (context == null || initConfig == null) {
            StringBuilder sb = new StringBuilder("empty input parameters, context: ");
            sb.append(context);
            sb.append(", initConfig:");
            sb.append(initConfig);
            String obj = sb.toString();
            ACLog.e(Constants.TAG, obj);
            ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_common_init").addParams("sdkVersion", BuildConfig.VERSION_NAME).addParams("result", "F").addParams("resultMessage", obj).event();
            return;
        }
        initACManager(context, initConfig);
    }

    public static boolean isSslPinningEnable() {
        List<String> sslCertList = ACManager.getInstance().getSslCertList();
        return (sslCertList == null || sslCertList.size() == 0) ? false : true;
    }
}
