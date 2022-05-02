package com.alipay.multigateway.sdk.adapter.network.quake;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.imobile.network.quake.NetworkResponse;
import com.alipay.imobile.network.quake.Request;
import com.alipay.imobile.network.quake.request.RequestInterceptor;
import com.alipay.imobile.network.quake.util.SignUtil;
import com.alipay.multigateway.sdk.GatewayController;
import com.alipay.multigateway.sdk.GatewayInfo;
import com.alipay.multigateway.sdk.NetworkDelegate;
import java.util.Map;

public class QuakeNetworkDelegate implements NetworkDelegate, RequestInterceptor {
    private static final String TAG = "QuakeNetworkDelegate";

    public void afterReceiveResponse(@NonNull Request request, @NonNull NetworkResponse networkResponse) {
    }

    public void beforeSendRequest(@NonNull Request request) {
        GatewayController controller = QuakeGatewayControllerFactory.getController();
        if (controller != null) {
            controller.processRequest(request);
        }
    }

    public void setGatewayInfo(@NonNull GatewayInfo gatewayInfo, @NonNull Object obj) {
        if (Request.class.isInstance(obj)) {
            LoggerWrapper.i(TAG, "setGatewayInfo be invoked.GatewayInfo:".concat(String.valueOf(gatewayInfo)));
            Request request = (Request) obj;
            String targetUrl = gatewayInfo.getTargetUrl();
            if (!TextUtils.isEmpty(targetUrl)) {
                request.setOriginUrl(targetUrl);
            }
            Map<String, String> map = gatewayInfo.headers;
            if (map != null) {
                for (String next : map.keySet()) {
                    String str = map.get(next);
                    if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(str)) {
                        request.addExternalInfo(next, str);
                    }
                }
            }
            if (gatewayInfo.signInfo != null && gatewayInfo.signInfo.extra != null) {
                Map<String, String> map2 = gatewayInfo.signInfo.extra;
                String str2 = map2.get("appKey");
                String str3 = map2.get("authCode");
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    SignUtil.SignInfo signInfo = new SignUtil.SignInfo();
                    signInfo.appKey = str2;
                    signInfo.authCode = str3;
                    request.setSignInfo(signInfo);
                    LoggerWrapper.i(TAG, String.format("set sign info success. appKey = %s, authCode = %s.", new Object[]{str2, str3}));
                }
            }
        }
    }
}
