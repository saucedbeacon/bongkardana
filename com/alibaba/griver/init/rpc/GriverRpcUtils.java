package com.alibaba.griver.init.rpc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.ReflectUtils;
import com.alibaba.griver.init.IAPConfig;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.SecurityGuardParamContext;
import com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent;
import com.alibaba.wireless.security.open.securesignature.SecureSignatureDefine;
import com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant;
import com.iap.ac.android.biz.common.rpc.ssl.IAPSslPinner;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.rpc.RPCProxyHost;
import com.iap.ac.android.common.rpc.RpcAppInfo;
import com.iap.ac.android.common.rpc.interfaces.SignRpcRequestPlugin;
import com.iap.ac.android.common.rpc.interfaces.SslPinningPlugin;
import com.iap.ac.android.rpc.RpcProxyImpl;
import com.iap.ac.android.rpc.multigateway.RpcGatewayController;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class GriverRpcUtils {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static String f9204a;

    public static void init(final Context context, final IAPConfig iAPConfig) {
        RpcProxyImpl instance = RpcProxyImpl.getInstance("GriverAppContainer");
        RpcAppInfo rpcAppInfo = new RpcAppInfo();
        rpcAppInfo.appId = iAPConfig.getAppId();
        StringBuilder sb = new StringBuilder();
        sb.append(iAPConfig.getAppId());
        sb.append("_ANDROID");
        rpcAppInfo.appKey = sb.toString();
        rpcAppInfo.authCode = iAPConfig.getAuthCode();
        rpcAppInfo.rpcGateWayUrl = iAPConfig.getExtra().getGatewayUrl();
        rpcAppInfo.addHeader(HeaderConstant.HEADER_KEY_WORKSPACE_ID, iAPConfig.getExtra().getWorkSpaceId());
        instance.setSslPinningPlugin(new SslPinningPlugin() {
            public final void verifyConnection(HttpsURLConnection httpsURLConnection) {
                if (httpsURLConnection != null && httpsURLConnection.getURL() != null && ReflectUtils.classExist("com.iap.ac.android.biz.common.rpc.ssl.IAPSslPinner")) {
                    if (TextUtils.equals(Uri.parse(iAPConfig.getExtra().getGatewayUrl()).getHost(), httpsURLConnection.getURL().getHost())) {
                        IAPSslPinner.INSTANCE.verifyConnection(httpsURLConnection);
                    }
                }
            }
        });
        instance.initialize(context, rpcAppInfo);
        try {
            f9204a = GriverSignatureUtils.getAuthCodeForSecurityGuard(context, iAPConfig.getAuthCode(), iAPConfig.getEnv(), iAPConfig.getGpSignature());
            StringBuilder sb2 = new StringBuilder("authCode for SG is: ");
            sb2.append(f9204a);
            GriverLogger.d("GriverRpcUtils", sb2.toString());
            SecurityGuardManager.getInstance(context, f9204a);
        } catch (Exception e) {
            GriverLogger.e("GriverRpcUtils", "init security guard exception, errorCode is: ", e);
        }
        RPCProxyHost.setRpcProxy(instance, "GriverAppContainer");
        RpcGatewayController.initGatewayController(context, "GriverAppContainer");
        RPCProxyHost.getInstance("GriverAppContainer").setSignRequest(new SignRpcRequestPlugin() {
            public final String signRequest(@NonNull RpcAppInfo rpcAppInfo, @NonNull String str, @NonNull Map<String, String> map) {
                int length = str != null ? str.length() : 0;
                int max = dispatchOnCancelled.setMax(length);
                if (length != max) {
                    onCanceled oncanceled = new onCanceled(length, max, 1);
                    onCancelLoad.setMax(-961797293, oncanceled);
                    onCancelLoad.getMin(-961797293, oncanceled);
                }
                Context context = context;
                StringBuilder sb = new StringBuilder();
                sb.append(iAPConfig.getAppId());
                sb.append("_ANDROID");
                return GriverRpcUtils.a(context, sb.toString(), GriverRpcUtils.f9204a, 4, str);
            }
        });
        ACLog.i("GriverRpcUtils", "Network component initialize finish");
    }

    /* access modifiers changed from: private */
    @SuppressLint({"DefaultLocale"})
    @Nullable
    public static String a(@NonNull Context context, @NonNull String str, @NonNull String str2, int i, @NonNull String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            GriverLogger.d("GriverRpcUtils", "the appkey is empty, will not do signing.");
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(SecureSignatureDefine.OPEN_KEY_SIGN_INPUT, str3);
        SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
        securityGuardParamContext.paramMap = hashMap;
        securityGuardParamContext.requestType = i;
        securityGuardParamContext.appKey = str;
        try {
            SecurityGuardManager instance = SecurityGuardManager.getInstance(context);
            if (instance == null) {
                GriverLogger.d("GriverRpcUtils", "request data sign fail, sgMng is null");
                return null;
            }
            ISecureSignatureComponent secureSignatureComp = instance.getSecureSignatureComp();
            if (secureSignatureComp == null) {
                GriverLogger.d("GriverRpcUtils", "request data sign fail, ssComp is null");
                return null;
            }
            String signRequest = secureSignatureComp.signRequest(securityGuardParamContext, str2);
            GriverLogger.d("GriverRpcUtils", String.format("Sign success: appKey = %s, authCode = %s, requestType = %d, sign = %s, content = %s", new Object[]{str, str2, Integer.valueOf(i), signRequest, str3}));
            return signRequest;
        } catch (Exception e) {
            GriverLogger.e("GriverRpcUtils", String.format("Cannot sign request! appKey = %s, authCode = %s, requestType = %d", new Object[]{str, str2, Integer.valueOf(i)}), e);
            return null;
        }
    }
}
