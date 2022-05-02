package com.iap.ac.android.biz.common.proxy;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.account.ACUserInfo;
import com.iap.ac.android.common.account.ACUserInfoManager;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.rpc.http.HttpTransportFactory;
import com.iap.ac.android.common.rpc.interfaces.AbstractHttpTransport;
import com.iap.ac.android.common.rpc.model.HttpRequest;
import com.iap.ac.android.common.rpc.model.HttpResponse;
import java.util.List;
import java.util.Map;

public class NetworkProxy {

    /* renamed from: a  reason: collision with root package name */
    public static NetworkProxy f9684a;

    public static NetworkProxy getInstance() {
        if (f9684a == null) {
            f9684a = new NetworkProxy();
        }
        return f9684a;
    }

    public void setHttpTransporter(@NonNull final HttpTransporter httpTransporter) throws IllegalArgumentException {
        if (httpTransporter != null) {
            ACLog.i("NetworkProxy", "set network proxy");
            HttpTransportFactory.setCreater(new HttpTransportFactory.Creater() {

                /* renamed from: com.iap.ac.android.biz.common.proxy.NetworkProxy$1$a */
                public class a implements AbstractHttpTransport {
                    public a() {
                    }

                    @Nullable
                    public HttpResponse performRequest(@NonNull HttpRequest httpRequest) throws Exception {
                        ACLog.d("NetworkProxy", "performRequest");
                        HttpResponse sendHttpRequest = httpTransporter.sendHttpRequest(httpRequest);
                        Map<String, List<String>> map = sendHttpRequest.headers;
                        if (map == null || !map.containsKey("Ac-UserId")) {
                            ACLog.d("NetworkProxy", "can not resolve user id key");
                        } else {
                            List list = map.get("Ac-UserId");
                            if (list == null || list.isEmpty()) {
                                ACLog.d("NetworkProxy", "can not resolve user id from header");
                            } else {
                                ACUserInfo aCUserInfo = new ACUserInfo();
                                aCUserInfo.openId = (String) list.get(0);
                                ACUserInfoManager.getInstance("ac_biz").setUserInfo(aCUserInfo);
                                StringBuilder sb = new StringBuilder("resolve user id: ");
                                sb.append(aCUserInfo.openId);
                                ACLog.d("NetworkProxy", sb.toString());
                            }
                        }
                        return sendHttpRequest;
                    }
                }

                public AbstractHttpTransport createHttpTransport(@NonNull Context context) throws Exception {
                    return new a();
                }
            }, "ac_biz");
            return;
        }
        ACLog.e("NetworkProxy", "HttpTransporter proxy can not be null");
        throw new IllegalArgumentException("HttpTransporter proxy can not be null");
    }
}
