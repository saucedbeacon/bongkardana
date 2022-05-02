package com.alibaba.griver.core.jsapi.device.network;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import com.alibaba.griver.base.common.utils.RequestAPIConfigUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Keep
public class RequestBridgeExtension extends SimpleBridgeExtension {
    private static final int CODE_DECODING_ERROR = 14;
    private static final int CODE_HTTP_ERROR = 19;
    private static final int CODE_NETWORK_ERROR = 12;
    private static final int CODE_PERMISSION_ERROR = 11;
    private static final int CODE_REQUEST_NOT_ALLOWED = 2;
    private static final int CODE_TIMEOUT_ERROR = 13;
    private static final String TAG = "RequestBridgeExtension";

    @ThreadType(ExecutorType.NETWORK)
    @ActionFilter
    public void httpRequest(@BindingNode(Page.class) Page page, @BindingParam(name = {"url"}) String str, @BindingParam(name = {"headers"}) Object obj, @BindingParam(name = {"method"}) String str2, @BindingParam(name = {"data"}) String str3, @BindingParam(name = {"timeout"}) int i, @BindingParam(name = {"dataType"}) String str4, @BindingCallback BridgeCallback bridgeCallback) {
        Page page2 = page;
        String str5 = str;
        if (!RequestAPIConfigUtils.canSendRequest(page, str, bridgeCallback)) {
            monitorException(page, str, (Throwable) null, "request call is not allowed to send", "2");
        } else {
            sendHttp(page, str, obj, str2, str3, i, str4, bridgeCallback, true);
        }
    }

    @ThreadType(ExecutorType.NETWORK)
    @ActionFilter
    public void request(@BindingNode(Page.class) Page page, @BindingParam(name = {"url"}) String str, @BindingParam(name = {"headers"}) Object obj, @BindingParam(name = {"method"}) String str2, @BindingParam(name = {"data"}) String str3, @BindingParam(name = {"timeout"}) int i, @BindingParam(name = {"dataType"}) String str4, @BindingCallback BridgeCallback bridgeCallback) {
        Page page2 = page;
        String str5 = str;
        if (!RequestAPIConfigUtils.canSendRequest(page, str, bridgeCallback)) {
            monitorException(page, str, (Throwable) null, "request call is not allowed to send", "2");
        } else {
            sendHttp(page, str, obj, str2, str3, i, str4, bridgeCallback, false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: com.alibaba.griver.api.common.network.HttpResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: com.alibaba.fastjson.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: com.alibaba.fastjson.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v27, resolved type: com.alibaba.fastjson.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v29, resolved type: com.alibaba.fastjson.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v30, resolved type: com.alibaba.fastjson.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v33, resolved type: com.alibaba.fastjson.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v34, resolved type: com.alibaba.fastjson.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v36, resolved type: com.alibaba.fastjson.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v33, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v34, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v37, resolved type: com.alibaba.fastjson.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v38, resolved type: com.alibaba.fastjson.JSONObject} */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.util.LinkedHashMap] */
    /* JADX WARNING: type inference failed for: r2v9, types: [java.util.Map] */
    /* JADX WARNING: type inference failed for: r8v32, types: [java.util.Map] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0258 A[Catch:{ Exception -> 0x02e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0323 A[SYNTHETIC, Splitter:B:151:0x0323] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0401 A[Catch:{ Exception -> 0x0447 }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0445  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void sendHttp(com.alibaba.ariver.app.api.Page r22, java.lang.String r23, java.lang.Object r24, java.lang.String r25, java.lang.String r26, int r27, java.lang.String r28, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r29, boolean r30) {
        /*
            r21 = this;
            r7 = r23
            r0 = r24
            r1 = r27
            r8 = r28
            java.lang.String r9 = "headers"
            java.lang.String r10 = "_online"
            java.lang.String r11 = "status"
            java.lang.String r12 = "network error"
            java.lang.String r13 = "data"
            java.lang.String r14 = "errorMessage"
            java.lang.String r15 = "error"
            com.alibaba.ariver.app.api.App r2 = r22.getApp()
            com.alibaba.ariver.app.api.AppContext r2 = r2.getAppContext()
            android.content.Context r6 = r2.getContext()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = " url = ["
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r3 = "], headers = ["
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = "], method = ["
            r2.append(r3)
            r3 = r25
            r2.append(r3)
            java.lang.String r4 = "], data = ["
            r2.append(r4)
            r5 = r26
            r2.append(r5)
            java.lang.String r4 = "], timeout = ["
            r2.append(r4)
            r2.append(r1)
            java.lang.String r4 = "], dataType = ["
            r2.append(r4)
            r2.append(r8)
            java.lang.String r4 = "]"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "http request: "
            java.lang.String r2 = r4.concat(r2)
            java.lang.String r4 = "RequestBridgeExtension"
            com.alibaba.griver.base.common.logger.GriverLogger.d(r4, r2)
            boolean r2 = r0 instanceof com.alibaba.fastjson.JSONObject
            r16 = 0
            r30 = r12
            if (r2 == 0) goto L_0x007b
            com.alibaba.fastjson.JSONObject r0 = (com.alibaba.fastjson.JSONObject) r0
            goto L_0x00c3
        L_0x007b:
            boolean r2 = r0 instanceof com.alibaba.fastjson.JSONArray
            if (r2 == 0) goto L_0x00c1
            com.alibaba.fastjson.JSONObject r2 = new com.alibaba.fastjson.JSONObject
            r2.<init>()
            r12 = 0
        L_0x0085:
            r3 = r0
            com.alibaba.fastjson.JSONArray r3 = (com.alibaba.fastjson.JSONArray) r3
            int r0 = r3.size()
            if (r12 >= r0) goto L_0x00bf
            com.alibaba.fastjson.JSONObject r0 = r3.getJSONObject(r12)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x009a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00ba
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r17 = r3.getKey()
            r18 = r0
            r0 = r17
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r3 = r3.getValue()
            r2.put((java.lang.String) r0, (java.lang.Object) r3)
            r0 = r18
            goto L_0x009a
        L_0x00ba:
            int r12 = r12 + 1
            r0 = r24
            goto L_0x0085
        L_0x00bf:
            r0 = r2
            goto L_0x00c3
        L_0x00c1:
            r0 = r16
        L_0x00c3:
            com.alibaba.griver.api.common.network.HttpRequest r12 = new com.alibaba.griver.api.common.network.HttpRequest
            r12.<init>()
            r12.setUrl(r7)
            java.lang.String r0 = com.alibaba.fastjson.JSON.toJSONString(r0)     // Catch:{ Exception -> 0x00e2 }
            com.alibaba.griver.core.jsapi.device.network.RequestBridgeExtension$1 r2 = new com.alibaba.griver.core.jsapi.device.network.RequestBridgeExtension$1     // Catch:{ Exception -> 0x00e2 }
            r3 = r21
            r2.<init>()     // Catch:{ Exception -> 0x00e2 }
            r3 = 0
            com.alibaba.fastjson.parser.Feature[] r5 = new com.alibaba.fastjson.parser.Feature[r3]     // Catch:{ Exception -> 0x00e2 }
            java.lang.Object r0 = com.alibaba.fastjson.JSON.parseObject((java.lang.String) r0, r2, (com.alibaba.fastjson.parser.Feature[]) r5)     // Catch:{ Exception -> 0x00e2 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x00e2 }
            r16 = r0
            goto L_0x00e8
        L_0x00e2:
            r0 = move-exception
            java.lang.String r2 = "transfer request header failed"
            com.alibaba.griver.base.common.logger.GriverLogger.e(r4, r2, r0)
        L_0x00e8:
            if (r16 != 0) goto L_0x00f1
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2 = r0
            goto L_0x00f3
        L_0x00f1:
            r2 = r16
        L_0x00f3:
            java.lang.String r0 = com.alibaba.griver.core.utils.f.a(r23)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x0102
            java.lang.String r3 = "Cookie"
            r2.put(r3, r0)
        L_0x0102:
            r12.setHeaders(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r25)
            if (r0 == 0) goto L_0x010f
            java.lang.String r0 = "GET"
            r3 = r0
            goto L_0x0111
        L_0x010f:
            r3 = r25
        L_0x0111:
            r12.setMethod(r3)
            r12.setTimeout(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r26)
            if (r0 != 0) goto L_0x0124
            byte[] r0 = r26.getBytes()
            r12.setRequestData(r0)
        L_0x0124:
            r12.setTimeout(r1)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r5 = r0.toString()
            android.os.Bundle r0 = r22.getStartParams()
            boolean r0 = com.alibaba.ariver.remotedebug.utils.RemoteDebugUtils.isRemoteDebugMode(r0)
            if (r0 == 0) goto L_0x0156
            com.alibaba.ariver.app.api.App r0 = r22.getApp()
            java.lang.String r0 = r0.getAppId()
            boolean r0 = com.alibaba.ariver.remotedebug.utils.RemoteDebugUtils.supportRemoteDebugMode(r0)
            if (r0 == 0) goto L_0x0156
            r1 = r22
            r19 = r4
            r4 = r23
            r24 = r5
            r7 = r6
            r6 = r26
            com.alibaba.ariver.remotedebug.utils.RemoteDebugMessageUtils.sendNetworkRequest(r1, r2, r3, r4, r5, r6)
            goto L_0x015b
        L_0x0156:
            r19 = r4
            r24 = r5
            r7 = r6
        L_0x015b:
            com.alibaba.fastjson.JSONObject r6 = new com.alibaba.fastjson.JSONObject
            r6.<init>()
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            r16 = 12
            android.os.Bundle r0 = r22.getStartParams()     // Catch:{ Exception -> 0x03c8 }
            java.lang.String r1 = "isH5app"
            r2 = 0
            boolean r0 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getBoolean(r0, r1, r2)     // Catch:{ Exception -> 0x03c8 }
            com.alibaba.griver.base.common.bridge.GriverHttpRequestAPIExtension$RequestContext r1 = new com.alibaba.griver.base.common.bridge.GriverHttpRequestAPIExtension$RequestContext     // Catch:{ Exception -> 0x03c8 }
            r1.<init>()     // Catch:{ Exception -> 0x03c8 }
            com.alibaba.ariver.app.api.App r2 = r22.getApp()     // Catch:{ Exception -> 0x03c8 }
            java.lang.String r2 = r2.getAppId()     // Catch:{ Exception -> 0x03c8 }
            if (r0 == 0) goto L_0x0192
            com.alibaba.griver.api.appinfo.GriverAppTypeEnum r0 = com.alibaba.griver.api.appinfo.GriverAppTypeEnum.H5     // Catch:{ Exception -> 0x0186 }
            r1.appType = r0     // Catch:{ Exception -> 0x0186 }
            goto L_0x0196
        L_0x0186:
            r0 = move-exception
            r10 = r23
            r12 = r30
            r4 = r0
            r8 = r5
            r7 = r6
        L_0x018e:
            r9 = r19
            goto L_0x03d2
        L_0x0192:
            com.alibaba.griver.api.appinfo.GriverAppTypeEnum r0 = com.alibaba.griver.api.appinfo.GriverAppTypeEnum.MINI_PROGRAM     // Catch:{ Exception -> 0x03c8 }
            r1.appType = r0     // Catch:{ Exception -> 0x03c8 }
        L_0x0196:
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x03c8 }
            java.lang.String r3 = ""
            if (r0 != 0) goto L_0x01b2
            java.lang.String r0 = "null_online"
            boolean r0 = android.text.TextUtils.equals(r2, r0)     // Catch:{ Exception -> 0x0186 }
            if (r0 != 0) goto L_0x01b2
            boolean r0 = r2.endsWith(r10)     // Catch:{ Exception -> 0x0186 }
            if (r0 == 0) goto L_0x01b0
            java.lang.String r2 = r2.replace(r10, r3)     // Catch:{ Exception -> 0x0186 }
        L_0x01b0:
            r1.appId = r2     // Catch:{ Exception -> 0x0186 }
        L_0x01b2:
            java.lang.Class<com.alibaba.griver.base.common.bridge.GriverHttpRequestAPIExtension> r0 = com.alibaba.griver.base.common.bridge.GriverHttpRequestAPIExtension.class
            java.lang.Object r0 = com.alibaba.ariver.kernel.common.RVProxy.get(r0)     // Catch:{ Exception -> 0x03c8 }
            com.alibaba.griver.base.common.bridge.GriverHttpRequestAPIExtension r0 = (com.alibaba.griver.base.common.bridge.GriverHttpRequestAPIExtension) r0     // Catch:{ Exception -> 0x03c8 }
            com.alibaba.griver.api.common.network.HttpResponse r10 = r0.performRequest(r1, r12)     // Catch:{ Exception -> 0x03c8 }
            if (r10 == 0) goto L_0x03a3
            int r0 = r10.getStatusCode()     // Catch:{ Exception -> 0x0399 }
            if (r0 <= 0) goto L_0x03a3
            int r0 = r10.getStatusCode()     // Catch:{ Exception -> 0x0399 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0399 }
            r6.put((java.lang.String) r11, (java.lang.Object) r0)     // Catch:{ Exception -> 0x0399 }
            java.io.InputStream r0 = r10.getInputStream()     // Catch:{ Exception -> 0x0399 }
            java.lang.String r12 = com.alibaba.ariver.kernel.common.utils.IOUtils.read((java.io.InputStream) r0)     // Catch:{ Exception -> 0x0399 }
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ Exception -> 0x0399 }
            if (r0 == 0) goto L_0x01e9
            r6.put((java.lang.String) r13, (java.lang.Object) r3)     // Catch:{ Exception -> 0x0186 }
        L_0x01e2:
            r20 = r5
            r17 = r7
            r7 = r6
            goto L_0x0244
        L_0x01e9:
            java.lang.String r0 = "base64"
            boolean r0 = r0.equalsIgnoreCase(r8)     // Catch:{ Exception -> 0x0399 }
            if (r0 == 0) goto L_0x023c
            byte[] r0 = r12.getBytes()     // Catch:{ Exception -> 0x01fe }
            r1 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)     // Catch:{ Exception -> 0x01fe }
            r6.put((java.lang.String) r13, (java.lang.Object) r0)     // Catch:{ Exception -> 0x01fe }
            goto L_0x01e2
        L_0x01fe:
            r0 = 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0232 }
            r6.put((java.lang.String) r15, (java.lang.Object) r0)     // Catch:{ Exception -> 0x0232 }
            int r0 = com.alibaba.griver.core.R.string.griver_core_http_decoding_failed     // Catch:{ Exception -> 0x0232 }
            java.lang.String r0 = r7.getString(r0)     // Catch:{ Exception -> 0x0232 }
            r6.put((java.lang.String) r14, (java.lang.Object) r0)     // Catch:{ Exception -> 0x0232 }
            r4 = 0
            java.lang.String r0 = "decoding base64 failed"
            java.lang.String r8 = "14"
            r1 = r21
            r2 = r22
            r3 = r23
            r20 = r5
            r5 = r0
            r17 = r7
            r7 = r6
            r6 = r8
            r1.monitorException(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0226 }
            goto L_0x0244
        L_0x0226:
            r0 = move-exception
            r10 = r23
            r12 = r30
            r4 = r0
            r9 = r19
            r8 = r20
            goto L_0x03d2
        L_0x0232:
            r0 = move-exception
            r7 = r6
            r10 = r23
            r12 = r30
            r4 = r0
            r8 = r5
            goto L_0x018e
        L_0x023c:
            r20 = r5
            r17 = r7
            r7 = r6
            r7.put((java.lang.String) r13, (java.lang.Object) r12)     // Catch:{ Exception -> 0x0391 }
        L_0x0244:
            com.alibaba.fastjson.JSONObject r0 = new com.alibaba.fastjson.JSONObject     // Catch:{ Exception -> 0x0391 }
            r0.<init>()     // Catch:{ Exception -> 0x0391 }
            r7.put((java.lang.String) r9, (java.lang.Object) r0)     // Catch:{ Exception -> 0x0391 }
            java.util.Map r0 = r10.getHeaders()     // Catch:{ Exception -> 0x02e2 }
            if (r0 == 0) goto L_0x02d9
            int r1 = r0.size()     // Catch:{ Exception -> 0x02e2 }
            if (r1 <= 0) goto L_0x02d9
            java.util.Map r1 = fixEmptyKeyHeader(r0)     // Catch:{ Exception -> 0x02e2 }
            java.util.Set r2 = r1.keySet()     // Catch:{ Exception -> 0x02e2 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x02e2 }
        L_0x0264:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x02e2 }
            if (r3 == 0) goto L_0x02cd
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x02e2 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x02e2 }
            if (r3 == 0) goto L_0x02c1
            java.lang.Object r4 = r0.get(r3)     // Catch:{ Exception -> 0x02e2 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ Exception -> 0x02e2 }
            if (r4 == 0) goto L_0x028f
            int r5 = r4.size()     // Catch:{ Exception -> 0x028b }
            if (r5 <= 0) goto L_0x028f
            r5 = 0
            java.lang.Object r6 = r4.get(r5)     // Catch:{ Exception -> 0x028b }
            r8 = r20
            r8.put(r3, r6)     // Catch:{ Exception -> 0x02bb }
            goto L_0x0292
        L_0x028b:
            r0 = move-exception
            r8 = r20
            goto L_0x02bc
        L_0x028f:
            r8 = r20
            r5 = 0
        L_0x0292:
            java.lang.String r6 = "set-cookie"
            boolean r3 = r6.equalsIgnoreCase(r3)     // Catch:{ Exception -> 0x02bb }
            if (r3 == 0) goto L_0x02b6
            if (r4 == 0) goto L_0x02b6
            int r3 = r4.size()     // Catch:{ Exception -> 0x02bb }
            if (r3 <= 0) goto L_0x02b6
            int r3 = r4.size()     // Catch:{ Exception -> 0x02bb }
            int r3 = r3 + -1
            java.lang.Object r3 = r4.get(r3)     // Catch:{ Exception -> 0x02bb }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x02bb }
            r6 = r23
            r4 = r17
            com.alibaba.griver.core.utils.f.a(r6, r3)     // Catch:{ Exception -> 0x02d7 }
            goto L_0x02c8
        L_0x02b6:
            r6 = r23
            r4 = r17
            goto L_0x02c8
        L_0x02bb:
            r0 = move-exception
        L_0x02bc:
            r6 = r23
            r4 = r17
            goto L_0x02e9
        L_0x02c1:
            r6 = r23
            r4 = r17
            r8 = r20
            r5 = 0
        L_0x02c8:
            r17 = r4
            r20 = r8
            goto L_0x0264
        L_0x02cd:
            r6 = r23
            r4 = r17
            r8 = r20
            r7.put((java.lang.String) r9, (java.lang.Object) r1)     // Catch:{ Exception -> 0x02d7 }
            goto L_0x02df
        L_0x02d7:
            r0 = move-exception
            goto L_0x02e9
        L_0x02d9:
            r6 = r23
            r4 = r17
            r8 = r20
        L_0x02df:
            r9 = r19
            goto L_0x02f0
        L_0x02e2:
            r0 = move-exception
            r6 = r23
            r4 = r17
            r8 = r20
        L_0x02e9:
            java.lang.String r1 = "parse header failed"
            r9 = r19
            com.alibaba.griver.base.common.logger.GriverLogger.e(r9, r1, r0)     // Catch:{ Exception -> 0x038b }
        L_0x02f0:
            int r0 = r10.getStatusCode()     // Catch:{ Exception -> 0x038b }
            r1 = 502(0x1f6, float:7.03E-43)
            if (r0 != r1) goto L_0x0323
            r0 = 13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x031c }
            r7.put((java.lang.String) r15, (java.lang.Object) r0)     // Catch:{ Exception -> 0x031c }
            int r0 = com.alibaba.griver.core.R.string.griver_core_timeout_error     // Catch:{ Exception -> 0x031c }
            java.lang.String r0 = r4.getString(r0)     // Catch:{ Exception -> 0x031c }
            r7.put((java.lang.String) r14, (java.lang.Object) r0)     // Catch:{ Exception -> 0x031c }
            r4 = 0
            java.lang.String r5 = "timeout error 502"
            java.lang.String r0 = "13"
            r1 = r21
            r2 = r22
            r3 = r23
            r10 = r6
            r6 = r0
            r1.monitorException(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x03c6 }
            goto L_0x03e9
        L_0x031c:
            r0 = move-exception
            r12 = r30
            r4 = r0
            r10 = r6
            goto L_0x03d2
        L_0x0323:
            int r0 = r10.getStatusCode()     // Catch:{ Exception -> 0x038b }
            r1 = 403(0x193, float:5.65E-43)
            if (r0 != r1) goto L_0x034f
            r0 = 11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x031c }
            r7.put((java.lang.String) r15, (java.lang.Object) r0)     // Catch:{ Exception -> 0x031c }
            int r0 = com.alibaba.griver.core.R.string.griver_core_access_forbidden     // Catch:{ Exception -> 0x031c }
            java.lang.String r0 = r4.getString(r0)     // Catch:{ Exception -> 0x031c }
            r7.put((java.lang.String) r14, (java.lang.Object) r0)     // Catch:{ Exception -> 0x031c }
            r4 = 0
            java.lang.String r5 = "access forbidden 403"
            java.lang.String r0 = "11"
            r1 = r21
            r2 = r22
            r3 = r23
            r10 = r6
            r6 = r0
            r1.monitorException(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x03c6 }
            goto L_0x03e9
        L_0x034f:
            int r0 = r10.getStatusCode()     // Catch:{ Exception -> 0x038b }
            r1 = 400(0x190, float:5.6E-43)
            if (r0 < r1) goto L_0x0388
            r0 = 19
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x038b }
            r7.put((java.lang.String) r15, (java.lang.Object) r0)     // Catch:{ Exception -> 0x038b }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x038b }
            java.lang.String r1 = "HTTP error with statusCode: "
            r0.<init>(r1)     // Catch:{ Exception -> 0x038b }
            int r1 = r10.getStatusCode()     // Catch:{ Exception -> 0x038b }
            r0.append(r1)     // Catch:{ Exception -> 0x038b }
            java.lang.String r5 = r0.toString()     // Catch:{ Exception -> 0x038b }
            r7.put((java.lang.String) r14, (java.lang.Object) r5)     // Catch:{ Exception -> 0x038b }
            r7.put((java.lang.String) r13, (java.lang.Object) r12)     // Catch:{ Exception -> 0x038b }
            r4 = 0
            java.lang.String r0 = "19"
            r1 = r21
            r2 = r22
            r3 = r23
            r10 = r6
            r6 = r0
            r1.monitorException(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x03c6 }
            goto L_0x03e9
        L_0x0388:
            r10 = r6
            goto L_0x03e9
        L_0x038b:
            r0 = move-exception
            r10 = r6
            goto L_0x03a0
        L_0x038e:
            r0 = move-exception
            r10 = r6
            goto L_0x039e
        L_0x0391:
            r0 = move-exception
            r10 = r23
            r9 = r19
            r8 = r20
            goto L_0x03a0
        L_0x0399:
            r0 = move-exception
            r10 = r23
            r8 = r5
            r7 = r6
        L_0x039e:
            r9 = r19
        L_0x03a0:
            r12 = r30
            goto L_0x03d1
        L_0x03a3:
            r10 = r23
            r8 = r5
            r7 = r6
            r9 = r19
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)     // Catch:{ Exception -> 0x03c6 }
            r7.put((java.lang.String) r15, (java.lang.Object) r0)     // Catch:{ Exception -> 0x03c6 }
            r12 = r30
            r7.put((java.lang.String) r14, (java.lang.Object) r12)     // Catch:{ Exception -> 0x03c4 }
            r4 = 0
            java.lang.String r5 = "network response is null"
            java.lang.String r6 = "12"
            r1 = r21
            r2 = r22
            r3 = r23
            r1.monitorException(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x03c4 }
            goto L_0x03e9
        L_0x03c4:
            r0 = move-exception
            goto L_0x03d1
        L_0x03c6:
            r0 = move-exception
            goto L_0x03a0
        L_0x03c8:
            r0 = move-exception
            r10 = r23
            r12 = r30
            r8 = r5
            r7 = r6
            r9 = r19
        L_0x03d1:
            r4 = r0
        L_0x03d2:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r7.put((java.lang.String) r15, (java.lang.Object) r0)
            r7.put((java.lang.String) r14, (java.lang.Object) r12)
            java.lang.String r5 = "network error"
            java.lang.String r6 = "12"
            r1 = r21
            r2 = r22
            r3 = r23
            r1.monitorException(r2, r3, r4, r5, r6)
        L_0x03e9:
            android.os.Bundle r0 = r22.getStartParams()     // Catch:{ Exception -> 0x0447 }
            boolean r0 = com.alibaba.ariver.remotedebug.utils.RemoteDebugUtils.isRemoteDebugMode(r0)     // Catch:{ Exception -> 0x0447 }
            if (r0 == 0) goto L_0x0445
            com.alibaba.ariver.app.api.App r0 = r22.getApp()     // Catch:{ Exception -> 0x0447 }
            java.lang.String r0 = r0.getAppId()     // Catch:{ Exception -> 0x0447 }
            boolean r0 = com.alibaba.ariver.remotedebug.utils.RemoteDebugUtils.supportRemoteDebugMode(r0)     // Catch:{ Exception -> 0x0447 }
            if (r0 == 0) goto L_0x0445
            boolean r0 = r7.containsKey(r15)     // Catch:{ Exception -> 0x0447 }
            if (r0 != 0) goto L_0x042a
            java.lang.Object r0 = r7.get(r11)     // Catch:{ Exception -> 0x0447 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0447 }
            int r4 = r0.intValue()     // Catch:{ Exception -> 0x0447 }
            java.lang.String r5 = ""
            java.lang.Object r0 = r7.get(r13)     // Catch:{ Exception -> 0x0447 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0447 }
            byte[] r0 = r0.getBytes()     // Catch:{ Exception -> 0x0447 }
            r1 = r22
            r2 = r8
            r3 = r23
            r6 = r24
            r8 = r7
            r7 = r0
            com.alibaba.ariver.remotedebug.utils.RemoteDebugMessageUtils.sendNetworkResponse(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0443 }
            goto L_0x044e
        L_0x042a:
            r8 = r7
            java.lang.Object r0 = r8.get(r15)     // Catch:{ Exception -> 0x0443 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0443 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x0443 }
            java.lang.Object r1 = r8.get(r14)     // Catch:{ Exception -> 0x0443 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0443 }
            r2 = r22
            r3 = r24
            com.alibaba.ariver.remotedebug.utils.RemoteDebugMessageUtils.sendNetworkError(r2, r10, r0, r1, r3)     // Catch:{ Exception -> 0x0443 }
            goto L_0x044e
        L_0x0443:
            r0 = move-exception
            goto L_0x0449
        L_0x0445:
            r8 = r7
            goto L_0x044e
        L_0x0447:
            r0 = move-exception
            r8 = r7
        L_0x0449:
            java.lang.String r1 = "send debug message failed"
            com.alibaba.griver.base.common.logger.GriverLogger.e(r9, r1, r0)
        L_0x044e:
            com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse r0 = new com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse
            r0.<init>(r8)
            r1 = r29
            r1.sendBridgeResponse(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.jsapi.device.network.RequestBridgeExtension.sendHttp(com.alibaba.ariver.app.api.Page, java.lang.String, java.lang.Object, java.lang.String, java.lang.String, int, java.lang.String, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback, boolean):void");
    }

    private static Map<String, List<String>> fixEmptyKeyHeader(Map<String, List<String>> map) {
        HashMap hashMap = new HashMap();
        for (String next : map.keySet()) {
            if (!TextUtils.isEmpty(next)) {
                hashMap.put(next, map.get(next));
            }
        }
        return hashMap;
    }

    private void monitorException(Page page, String str, Throwable th, String str2, String str3) {
        GriverMonitor.error(GriverMonitorConstants.ERROR_HTTP_REQUEST_EXCEPTION, "GriverAppContainer", new MonitorMap.Builder().appId(page.getApp().getAppId()).version(page.getApp()).url(str).requestUrl(str).pageUrl(page.getOriginalURI()).exception(th).message(str2).code(str3).needAsynAppType(true).build());
    }
}
