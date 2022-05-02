package com.iap.ac.android.biz.common.proxy.common;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.rpc.http.HttpTransportFactory;
import com.iap.ac.android.common.rpc.interfaces.AbstractHttpTransport;
import com.iap.ac.android.common.rpc.model.HttpRequest;
import com.iap.ac.android.common.rpc.model.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class HttpTransportCreatorUtils {

    public static class CommonNetworkProxyHttpTransport implements AbstractHttpTransport {
        public final NetworkProxy proxy;
        public final ProxyScene proxyScene;

        private String assembleHeader2Str(Map<String, String> map) {
            if (map == null) {
                map = new HashMap<>();
            }
            if (this.proxyScene == ProxyScene.PROXY_SCENE_MINI_PROGRAM) {
                map.put("AppId", "GMP_ECO_REGION");
            }
            return JsonUtils.toJson(map);
        }

        private void eventTrack(HttpProxyRequestInfo httpProxyRequestInfo, HttpProxyResponseInfo httpProxyResponseInfo) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5 = "";
            if (httpProxyRequestInfo != null) {
                str2 = httpProxyRequestInfo.getRequestHeader() == null ? str5 : httpProxyRequestInfo.getRequestHeader();
                str = httpProxyRequestInfo.getProxyRequestData() == null ? str5 : httpProxyRequestInfo.getProxyRequestData();
            } else {
                str = str5;
                str2 = str;
            }
            if (httpProxyResponseInfo != null) {
                String proxyResponseHeader = httpProxyResponseInfo.getProxyResponseHeader() == null ? str5 : httpProxyResponseInfo.getProxyResponseHeader();
                str4 = httpProxyResponseInfo.getProxyResponseData() == null ? str5 : httpProxyResponseInfo.getProxyResponseData();
                if (httpProxyResponseInfo.getErrorCode() != null) {
                    str5 = httpProxyResponseInfo.getErrorCode();
                }
                str3 = str5;
                str5 = proxyResponseHeader;
            } else {
                str3 = str5;
                str4 = str3;
            }
            ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_region_rpc_spi_call_record").addParams("proxyRequestHeader", str2).addParams("proxyRequestData", str).addParams("proxyResponseHeader", str5).addParams("proxyResponseData", str4).addParams("errorCode", str3).event();
        }

        private Map<String, List<String>> headerStr2Map(String str) {
            String str2;
            int length = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(-831445990, oncanceled);
                onCancelLoad.getMin(-831445990, oncanceled);
            }
            HashMap hashMap = new HashMap();
            try {
                Map map = (Map) JsonUtils.fromJson(str, Map.class);
                if (map == null) {
                    return hashMap;
                }
                for (Object next : map.keySet()) {
                    if (next != null || (next instanceof String)) {
                        List list = (List) hashMap.get(next);
                        if (list == null) {
                            list = new ArrayList();
                            hashMap.put(next.toString(), list);
                        }
                        Object obj = map.get(next);
                        if (obj instanceof String) {
                            if (obj == null) {
                                str2 = "";
                            } else {
                                str2 = obj.toString();
                            }
                            list.add(str2);
                        } else if (obj instanceof List) {
                            list.addAll((List) obj);
                        }
                    }
                }
                return hashMap;
            } catch (Exception e) {
                ACLog.e(Constants.TAG, e.getMessage());
            }
        }

        @Nullable
        public HttpResponse performRequest(@NonNull HttpRequest httpRequest) throws Exception {
            HttpResponse httpResponse;
            ACLog.d(Constants.TAG, "performRequest");
            HttpProxyRequestInfo httpProxyRequestInfo = new HttpProxyRequestInfo();
            httpProxyRequestInfo.setRequestHeader(assembleHeader2Str(httpRequest.headers));
            httpProxyRequestInfo.setProxyRequestData(httpRequest.data);
            httpProxyRequestInfo.setScene(this.proxyScene);
            HttpProxyResponseInfo sendHttpRequest = this.proxy.sendHttpRequest(httpProxyRequestInfo);
            if (sendHttpRequest == null) {
                httpResponse = new HttpResponse(500, "proxy request fail:common network proxy SPI return null", (byte[]) null, (Map<String, List<String>>) null);
            } else {
                httpResponse = new HttpResponse(200, "request success", (sendHttpRequest.getProxyResponseData() == null ? "{}" : sendHttpRequest.getProxyResponseData()).toString().getBytes(), headerStr2Map(sendHttpRequest.getProxyResponseHeader()));
            }
            eventTrack(httpProxyRequestInfo, sendHttpRequest);
            return httpResponse;
        }

        public CommonNetworkProxyHttpTransport(@NonNull NetworkProxy networkProxy, ProxyScene proxyScene2) {
            this.proxy = networkProxy;
            this.proxyScene = proxyScene2;
        }
    }

    public static HttpTransportFactory.Creater createHttpTransporter(@NonNull final NetworkProxy networkProxy, final ProxyScene proxyScene) {
        return new HttpTransportFactory.Creater() {
            public final AbstractHttpTransport createHttpTransport(@NonNull Context context) throws Exception {
                return new CommonNetworkProxyHttpTransport(networkProxy, proxyScene);
            }
        };
    }
}
