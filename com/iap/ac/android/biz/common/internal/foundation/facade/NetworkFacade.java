package com.iap.ac.android.biz.common.internal.foundation.facade;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.griver.base.common.constants.SecurityConstants;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant;
import com.iap.ac.android.a.a;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.BuildConfig;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.internal.foundation.FoundationProxy;
import com.iap.ac.android.biz.common.model.CommonConfig;
import com.iap.ac.android.biz.common.rpc.ssl.IAPSslPinner;
import com.iap.ac.android.biz.common.utils.Utils;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.log.event.LogEventType;
import com.iap.ac.android.common.rpc.RPCProxyHost;
import com.iap.ac.android.common.rpc.RpcAppInfo;
import com.iap.ac.android.common.rpc.interfaces.SslPinningPlugin;
import com.iap.ac.android.d.e;
import com.iap.ac.android.rpc.RpcProxyImpl;
import com.iap.ac.android.rpc.multigateway.RpcGatewayController;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class NetworkFacade extends BaseFacade {
    public static boolean mInitialized = false;

    public void initComponent(Context context, String str, final CommonConfig commonConfig) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(107287100, oncanceled);
                onCancelLoad.getMin(107287100, oncanceled);
            }
        }
        super.initComponent(context, str, commonConfig);
        synchronized (this) {
            mInitialized = false;
            if (!Utils.checkClassExist("com.iap.ac.android.rpc.RpcProxyImpl") || !Utils.checkClassExist("com.iap.ac.android.rpc.multigateway.RpcGatewayController")) {
                FoundationProxy.getInstance(str).setNetworkType(FoundationProxy.NetworkType.NETWORK_TYPE_EXTERNAL);
                ACLog.e(Constants.TAG, "NetworkFacade init error, without dependent libraries");
                return;
            }
            RpcProxyImpl instance = RpcProxyImpl.getInstance(str);
            RpcAppInfo rpcAppInfo = new RpcAppInfo();
            if ("SANDBOX".equals(commonConfig.envType)) {
                rpcAppInfo.appId = String.format(CommonConfig.SANDBOXMOCK, new Object[]{commonConfig.appId});
                StringBuilder sb = new StringBuilder();
                sb.append(rpcAppInfo.appId);
                sb.append("_ANDROID");
                rpcAppInfo.appKey = sb.toString();
            } else {
                rpcAppInfo.appId = commonConfig.appId;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(commonConfig.appId);
                sb2.append("_ANDROID");
                rpcAppInfo.appKey = sb2.toString();
            }
            String a2 = e.a(context, SecurityConstants.DEFAULT_AUTH_CODE, commonConfig.envType, commonConfig.gpSignature);
            try {
                ACLog.i(Constants.TAG, "authCode for SG is: ".concat(String.valueOf(a2)));
                SecurityGuardManager.getInstance(context, a2);
            } catch (Throwable th) {
                StringBuilder sb3 = new StringBuilder("init security guard exception, errorMessage is: ");
                sb3.append(Utils.formatSecurityGuardException(th));
                ACLog.e(Constants.TAG, sb3.toString());
            }
            rpcAppInfo.authCode = a2;
            rpcAppInfo.rpcGateWayUrl = commonConfig.gatewayUrl;
            rpcAppInfo.addHeader(HeaderConstant.HEADER_KEY_WORKSPACE_ID, commonConfig.getWorkspaceId());
            instance.setSslPinningPlugin(new SslPinningPlugin() {
                public void verifyConnection(HttpsURLConnection httpsURLConnection) throws SSLException {
                    if (httpsURLConnection != null && httpsURLConnection.getURL() != null) {
                        String host = httpsURLConnection.getURL().getHost();
                        try {
                            if (TextUtils.equals(Uri.parse(commonConfig.gatewayUrl).getHost(), host)) {
                                IAPSslPinner.INSTANCE.verifyConnection(httpsURLConnection);
                            }
                        } catch (SSLException e) {
                            ACLogEvent newLogger = ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_common_sslpinning_check_fail");
                            StringBuilder a2 = a.a("Verify ssl pinning error! error: ");
                            a2.append(e.getMessage());
                            newLogger.addParams("resultMessage", a2.toString()).addParams("sdkVersion", BuildConfig.VERSION_NAME).addParams("url", host).setEventType(LogEventType.CRUCIAL_LOG).event();
                            throw e;
                        }
                    }
                }
            });
            instance.initialize(context, rpcAppInfo);
            RPCProxyHost.setRpcProxy(instance, str);
            RpcGatewayController.initGatewayController(context, str);
            ACLog.i(Constants.TAG, "Network component initialize finish");
            mInitialized = true;
        }
    }

    public boolean isInitialized() {
        return mInitialized;
    }
}
