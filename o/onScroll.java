package o;

import android.content.Context;
import android.util.Base64;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.network.HttpRequest;
import com.alibaba.griver.api.common.network.HttpResponse;
import com.alipay.iap.android.lbs.LBSLocation;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.j256.ormlite.stmt.query.SimpleComparison;
import id.dana.data.foundation.RpcException;
import id.dana.lib.gcontainer.app.bridge.requestpermissions.RequestPermissionsEvent;
import id.dana.ocr.constant.ErrorUploadReceipt;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.net.ssl.SSLHandshakeException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lid/dana/data/network/RpcProxy;", "Lid/dana/data/foundation/toolbox/AbstractHttpTransport;", "context", "Landroid/content/Context;", "apSecurityFacade", "Lid/dana/data/foundation/facade/ApSecurityFacade;", "securityGuardFacade", "Lid/dana/data/foundation/facade/SecurityGuardFacade;", "httpTransportFactory", "Lid/dana/data/foundation/toolbox/HttpTransportFactory;", "httpSessionInterceptor", "Lid/dana/data/network/interceptor/HttpSessionInterceptor;", "userLocation", "Lid/dana/data/globalnetwork/source/local/UserLocation;", "(Landroid/content/Context;Lid/dana/data/foundation/facade/ApSecurityFacade;Lid/dana/data/foundation/facade/SecurityGuardFacade;Lid/dana/data/foundation/toolbox/HttpTransportFactory;Lid/dana/data/network/interceptor/HttpSessionInterceptor;Lid/dana/data/globalnetwork/source/local/UserLocation;)V", "checkNetworkAvailability", "", "performRequest", "Lcom/alibaba/griver/api/common/network/HttpResponse;", "request", "Lcom/alibaba/griver/api/common/network/HttpRequest;", "setupApdidToken", "setupClientKey", "setupLocalConfig", "setupSign", "setupXLocation", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onScroll implements AgreementConfirmPoint {
    @NotNull
    public static final setMax setMax = new setMax((byte) 0);
    private final Context getMax;
    private final BackKeyDownPoint getMin;
    private final ColorSchemeModelTemplate isInside;
    private final getList length;
    private final onAppResume setMin;
    private final RemoteCallbackPool toIntRange;

    @Inject
    public onScroll(@NotNull Context context, @NotNull onAppResume onappresume, @NotNull BackKeyDownPoint backKeyDownPoint, @NotNull getList getlist, @NotNull RemoteCallbackPool remoteCallbackPool, @NotNull ColorSchemeModelTemplate colorSchemeModelTemplate) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(onappresume, "apSecurityFacade");
        Intrinsics.checkNotNullParameter(backKeyDownPoint, "securityGuardFacade");
        Intrinsics.checkNotNullParameter(getlist, "httpTransportFactory");
        Intrinsics.checkNotNullParameter(remoteCallbackPool, "httpSessionInterceptor");
        Intrinsics.checkNotNullParameter(colorSchemeModelTemplate, "userLocation");
        this.getMax = context;
        this.setMin = onappresume;
        this.getMin = backKeyDownPoint;
        this.length = getlist;
        this.toIntRange = remoteCallbackPool;
        this.isInside = colorSchemeModelTemplate;
    }

    @NotNull
    public final HttpResponse performRequest(@NotNull HttpRequest httpRequest) {
        Intrinsics.checkNotNullParameter(httpRequest, RequestPermissionsEvent.REQUEST);
        StringBuilder sb = new StringBuilder("performRequest [before request] request=");
        sb.append(httpRequest);
        sb.append("\t url=");
        sb.append(httpRequest.getUrl());
        updateActionSheetContent.d("RpcProxy", sb.toString());
        if (unregisterReceiver.isUrlMatchWhiteList(httpRequest.getUrl()) || getOriginStartParams.isNetworkAvailable(this.getMax)) {
            if (getAlign.isAliDomains(httpRequest.getUrl())) {
                String url = httpRequest.getUrl();
                useMultiplexLink ctokenFromCookie = getAlign.getCtokenFromCookie();
                httpRequest.setUrl(getAlign.replaceOrAddParameter(url, ctokenFromCookie != null ? ctokenFromCookie.toString() : null));
                String apdidToken = this.setMin.getApdidToken();
                CharSequence charSequence = apdidToken;
                if (!(charSequence == null || charSequence.length() == 0)) {
                    if (httpRequest.getHeaders() == null) {
                        httpRequest.setHeaders(new HashMap());
                    }
                    Map<String, String> headers = httpRequest.getHeaders();
                    Intrinsics.checkNotNullExpressionValue(headers, "request.headers");
                    headers.put("X-Apdid-Token", apdidToken);
                }
                String clientKey = getBadgeList.getClientKey(this.getMin, "");
                Intrinsics.checkNotNullExpressionValue(clientKey, "clientKey");
                if (clientKey.length() == 0) {
                    if (httpRequest.getHeaders() == null) {
                        httpRequest.setHeaders(new HashMap());
                    }
                    Map<String, String> headers2 = httpRequest.getHeaders();
                    Intrinsics.checkNotNullExpressionValue(headers2, "request.headers");
                    headers2.put("X-Client-Key", "");
                } else {
                    Map<String, String> headers3 = httpRequest.getHeaders();
                    Intrinsics.checkNotNullExpressionValue(headers3, "request.headers");
                    headers3.put("X-Client-Key", clientKey);
                }
                getMin(httpRequest);
                int legacyConfigVersion = getBadgeList.getLegacyConfigVersion();
                if (httpRequest.getHeaders() == null) {
                    httpRequest.setHeaders(new HashMap());
                }
                Map<String, String> headers4 = httpRequest.getHeaders();
                Intrinsics.checkNotNullExpressionValue(headers4, "request.headers");
                headers4.put("X-Local-Config", String.valueOf(legacyConfigVersion));
                try {
                    LBSLocation latestLocation = handlePushWindow.getLatestLocation(this.getMax);
                    JSONObject jSONObject = new JSONObject();
                    Intrinsics.checkNotNullExpressionValue(latestLocation, "lbsLocation");
                    jSONObject.put("latitude", String.valueOf(latestLocation.getLatitude()));
                    jSONObject.put("longitude", String.valueOf(latestLocation.getLongitude()));
                    jSONObject.put("updateTime", Long.valueOf(latestLocation.getTime()));
                    jSONObject.put("type", latestLocation.getType());
                    jSONObject.put("status", String.valueOf(latestLocation.getErrorCode()));
                    jSONObject.put("userCountryCurrent", this.isInside.getCurrentCountryCode());
                    if (httpRequest.getHeaders() == null) {
                        httpRequest.setHeaders(new HashMap());
                    }
                    Map<String, String> headers5 = httpRequest.getHeaders();
                    Intrinsics.checkNotNullExpressionValue(headers5, "request.headers");
                    String obj = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(obj, "jsonObject.toString()");
                    Charset charset = Charsets.UTF_8;
                    if (obj != null) {
                        byte[] bytes = obj.getBytes(charset);
                        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                        headers5.put("X-Location", Base64.encodeToString(bytes, 2));
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                } catch (Exception e) {
                    updateActionSheetContent.e("RpcProxy", e.getMessage());
                }
            }
            try {
                StringBuilder sb2 = new StringBuilder("performRequest [later request] request=");
                sb2.append(httpRequest);
                sb2.append("\t url=");
                sb2.append(httpRequest.getUrl());
                updateActionSheetContent.d("RpcProxy", sb2.toString());
                HttpResponse performRequest = getList.createHttpTransport$default(this.length, false, 1, (Object) null).performRequest(httpRequest);
                Intrinsics.checkNotNullExpressionValue(performRequest, "httpTransportFactory.cre…).performRequest(request)");
                HttpResponse max = this.toIntRange.setMax(this, httpRequest, performRequest);
                Intrinsics.checkNotNullExpressionValue(max, "httpSessionInterceptor.i…(this, request, response)");
                updateActionSheetContent.d("RpcProxy", "response=".concat(String.valueOf(max)));
                return max;
            } catch (SocketTimeoutException e2) {
                throw new RpcException("005", (Throwable) e2);
            } catch (SSLHandshakeException e3) {
                throw new RpcException("002", (Throwable) e3);
            } catch (MalformedURLException e4) {
                throw new RpcException("006", (Throwable) e4);
            } catch (IOException e5) {
                throw new RpcException("000", (Throwable) e5);
            } catch (NoSuchAlgorithmException e6) {
                throw new RpcException("000", (Throwable) e6);
            } catch (KeyManagementException e7) {
                throw new RpcException("000", (Throwable) e7);
            } catch (Exception e8) {
                throw new RpcException("000", (Throwable) e8);
            }
        } else {
            throw new RpcException(ErrorUploadReceipt.DATA_NOT_FOUND);
        }
    }

    private final void getMin(HttpRequest httpRequest) {
        if (httpRequest.getHeaders() == null) {
            httpRequest.setHeaders(new HashMap());
        }
        Map<String, String> headers = httpRequest.getHeaders();
        Intrinsics.checkNotNullExpressionValue(headers, "request.headers");
        headers.put("X-Timestamp", String.valueOf(System.currentTimeMillis()));
        Map<String, String> headers2 = httpRequest.getHeaders();
        Intrinsics.checkNotNullExpressionValue(headers2, "request.headers");
        headers2.put("X-AppKey", this.getMin.getAppKey());
        Map<String, String> headers3 = httpRequest.getHeaders();
        Intrinsics.checkNotNullExpressionValue(headers3, "request.headers");
        headers3.put("X-Nonce", getBadgeList.getNonce(32));
        byte[] requestData = httpRequest.getRequestData();
        if (requestData == null) {
            requestData = new byte[0];
        }
        httpRequest.setRequestData(requestData);
        TreeMap treeMap = new TreeMap();
        Map map = treeMap;
        map.put("Timestamp", httpRequest.getHeaders().get("X-Timestamp"));
        byte[] requestData2 = httpRequest.getRequestData();
        Intrinsics.checkNotNullExpressionValue(requestData2, "request.requestData");
        map.put("Body", new String(requestData2, Charsets.UTF_8));
        map.put("Path", getBadgeList.getStringNoNull(getBadgeList.getEncodedParam(httpRequest.getUrl())));
        map.put("UserId", getBadgeList.getStringNoNull(getAlign.getUserId()));
        map.put("AppKey", httpRequest.getHeaders().get("X-AppKey"));
        map.put("Nonce", httpRequest.getHeaders().get("X-Nonce"));
        map.put("ClientKey", getBadgeList.getStringNoNull(httpRequest.getHeaders().get("X-Client-Key")));
        map.put("Env", getBadgeList.getStringNoNull(httpRequest.getHeaders().get("X-Env")));
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            StringBuilder sb2 = new StringBuilder("key=");
            sb2.append(str);
            sb2.append(",value=");
            sb2.append((String) treeMap.get(str));
            updateActionSheetContent.w("RpcProxy", sb2.toString());
            sb.append("&");
            sb.append(str);
            sb.append(SimpleComparison.EQUAL_TO_OPERATION);
            sb.append((String) entry.getValue());
        }
        try {
            String substring = sb.substring(1);
            updateActionSheetContent.w("RpcProxy", "source=".concat(String.valueOf(substring)));
            String signRequest = this.getMin.signRequest(substring);
            Map<String, String> headers4 = httpRequest.getHeaders();
            Intrinsics.checkNotNullExpressionValue(headers4, "request.headers");
            headers4.put("X-Sign", signRequest);
            updateActionSheetContent.w("RpcProxy", "X-Sign=".concat(String.valueOf(signRequest)));
        } catch (Exception e) {
            updateActionSheetContent.e("RpcProxy", "setupSign", e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/data/network/RpcProxy$Companion;", "", "()V", "TAG", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }
}
