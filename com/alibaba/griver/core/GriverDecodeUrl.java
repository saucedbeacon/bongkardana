package com.alibaba.griver.core;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSON;
import com.alibaba.griver.api.callback.GriverDecodeUrlCallback;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import com.alibaba.griver.base.common.rpc.OnRpcResultListener;
import com.alibaba.griver.core.model.codec.UrlCodecRequest;
import com.alibaba.griver.core.model.codec.UrlCodecResult;
import com.alibaba.griver.core.rpc.a;

public class GriverDecodeUrl {
    public static synchronized void decodeUrlContent(final String str, final GriverDecodeUrlCallback griverDecodeUrlCallback) {
        synchronized (GriverDecodeUrl.class) {
            if (!Griver.alreadyInitialized()) {
                griverDecodeUrlCallback.onDecodeFailed(2, "SDK is not initialized.");
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                if (str.contains("mini-qr")) {
                    new a().a(new UrlCodecRequest(str), (OnRpcResultListener) new OnRpcResultListener<UrlCodecResult>() {
                        public final void onResultSuccess(final UrlCodecResult urlCodecResult) {
                            StringBuilder sb = new StringBuilder("onResultSuccess == ");
                            sb.append(JSON.toJSONString(urlCodecResult));
                            GriverLogger.d("DecodeUrlUtils", sb.toString());
                            if (urlCodecResult == null || !urlCodecResult.success || TextUtils.isEmpty(urlCodecResult.getSchema())) {
                                onResultFailed(1, "decode failed.");
                            } else {
                                GriverExecutors.getExecutor(ExecutorType.UI).execute(new Runnable() {
                                    public void run() {
                                        griverDecodeUrlCallback.onDecodeSuccess(urlCodecResult.getSchema());
                                    }
                                });
                            }
                        }

                        public final void onResultFailed(final int i, final String str) {
                            GriverLogger.e("DecodeUrlUtils", "onResultFailed errorCode == ".concat(String.valueOf(i)));
                            GriverExecutors.getExecutor(ExecutorType.UI).execute(new Runnable() {
                                public void run() {
                                    griverDecodeUrlCallback.onDecodeFailed(i, str);
                                }
                            });
                            MonitorMap.Builder builder = new MonitorMap.Builder();
                            builder.append("operationType", "alipay.intl.gmp.rpc.app.codec.route").url(str).code(String.valueOf(i)).message(str);
                            GriverMonitor.error(GriverMonitorConstants.ERROR_RPC_EXCEPTION, "GriverAppContainer", builder.build());
                        }
                    });
                    return;
                }
            }
            griverDecodeUrlCallback.onDecodeFailed(0, "invalid url.");
            MonitorMap.Builder builder = new MonitorMap.Builder();
            builder.append("operationType", "alipay.intl.gmp.rpc.app.codec.route").url(str).code("0").message("invalid url.");
            GriverMonitor.error(GriverMonitorConstants.ERROR_RPC_EXCEPTION, "GriverAppContainer", builder.build());
        }
    }

    public static synchronized boolean canDecodeUrl(String str) {
        synchronized (GriverDecodeUrl.class) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (str.contains("mini-qr")) {
                return true;
            }
            return false;
        }
    }
}
