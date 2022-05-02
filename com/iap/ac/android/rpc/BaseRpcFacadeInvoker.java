package com.iap.ac.android.rpc;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.alipay.mobile.common.rpc.RpcException;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.log.ACMonitor;
import com.iap.ac.android.common.log.event.LogEvent;
import com.iap.ac.android.common.log.event.LogEventType;
import com.iap.ac.android.common.rpc.RpcAppInfo;
import com.iap.ac.android.common.rpc.RpcRequest;
import com.iap.ac.android.common.rpc.interfaces.FacadeInvoker;
import com.iap.ac.android.common.rpc.model.HttpMethod;
import com.iap.ac.android.rpc.constant.RpcLogEvent;
import com.iap.ac.android.rpc.utils.RpcUtils;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import kotlin.text.Typography;

public class BaseRpcFacadeInvoker implements FacadeInvoker {
    private static final String TAG = RpcUtils.logTag("BaseRpcFacadeInvoker");
    private static int getMin = 0;
    private static int length = 0;
    private static int setMax = 1;
    private String bizCode;
    protected RpcProxyImpl mRpcProxy;

    static void getMax() {
        getMin = 34;
    }

    static /* synthetic */ String access$000(BaseRpcFacadeInvoker baseRpcFacadeInvoker) {
        int i = length + 109;
        setMax = i % 128;
        boolean z = true;
        boolean z2 = i % 2 != 0;
        String str = baseRpcFacadeInvoker.bizCode;
        if (!z2) {
            int i2 = 8 / 0;
        }
        int i3 = length + 5;
        setMax = i3 % 128;
        if (i3 % 2 == 0) {
            z = false;
        }
        if (z) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        return str;
    }

    static {
        getMax();
        int i = setMax + 55;
        length = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = null;
            int length2 = objArr.length;
        }
    }

    public BaseRpcFacadeInvoker(@NonNull RpcProxyImpl rpcProxyImpl, @NonNull String str) {
        this.mRpcProxy = rpcProxyImpl;
        this.bizCode = str;
    }

    public Object invokeMethod(@NonNull Method method, @NonNull RpcRequest rpcRequest) throws RpcException {
        long j;
        RpcException rpcException;
        int i = setMax + 107;
        length = i % 128;
        if ((i % 2 != 0 ? 27 : '%') != 27) {
            j = System.currentTimeMillis();
            try {
                return postRequest(method, rpcRequest);
            } catch (Exception e) {
                long currentTimeMillis = System.currentTimeMillis() - j;
                String str = rpcRequest.operationType;
                RpcAppInfo rpcAppInfo = rpcRequest.getRpcAppInfo();
                if (rpcAppInfo == null) {
                    rpcAppInfo = getRpcAppInfo();
                }
                try {
                    try {
                        boolean z = false;
                        ACLog.w(TAG, String.format("Cannot invoke rpc with UrlTransport! operationType = %s, message = %s", new Object[]{str, e.getMessage()}));
                        if (e instanceof RpcException) {
                            z = true;
                        }
                        if (z) {
                            int i2 = length + 109;
                            setMax = i2 % 128;
                            int i3 = i2 % 2;
                            rpcException = (RpcException) e;
                        } else {
                            rpcException = new RpcException((Integer) 5000, (Throwable) e);
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(rpcException.getCode());
                        reportRpcError(sb.toString(), rpcException.getMsg(), str, rpcAppInfo.rpcGateWayUrl, currentTimeMillis);
                        throw rpcException;
                    } catch (Exception e2) {
                        throw e2;
                    }
                } catch (Exception e3) {
                    throw e3;
                }
            }
        } else {
            j = System.currentTimeMillis();
            Object postRequest = postRequest(method, rpcRequest);
            Object obj = null;
            super.hashCode();
            return postRequest;
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public <Response> Response postRequest(@NonNull Method method, @NonNull RpcRequest rpcRequest) throws RpcException, IOException {
        int i = length + 75;
        setMax = i % 128;
        int i2 = i % 2;
        try {
            Response performRequest = performRequest(method, HttpMethod.POST, rpcRequest);
            int i3 = length + 69;
            setMax = i3 % 128;
            int i4 = i3 % 2;
            return performRequest;
        } catch (Exception e) {
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    @NonNull
    public RpcAppInfo getRpcAppInfo() {
        int i = setMax + 117;
        length = i % 128;
        if (i % 2 == 0) {
            try {
                try {
                    return this.mRpcProxy.getRpcAppInfo();
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            RpcAppInfo rpcAppInfo = this.mRpcProxy.getRpcAppInfo();
            Object obj = null;
            super.hashCode();
            return rpcAppInfo;
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public void reportRpcError(String str, String str2, String str3, String str4, long j) {
        HashMap hashMap = new HashMap(5);
        hashMap.put("code", str);
        hashMap.put("message", str2);
        hashMap.put(RpcLogEvent.PARAM_KEY_OPERATION_TYPE, str3);
        hashMap.put("url", str4);
        hashMap.put("duration", String.valueOf(j));
        ACMonitor.getInstance(this.bizCode).logEvent(new LogEvent(RpcLogEvent.RPC_NET_ERROR, hashMap));
        HashMap hashMap2 = new HashMap(4);
        hashMap2.put(RpcLogEvent.PARAM_KEY_RPC_ID, str3);
        hashMap2.put(RpcLogEvent.PARAM_KEY_RPC_TIME, String.valueOf(j));
        hashMap2.put(RpcLogEvent.PARAM_KEY_RPC_RESULT_CODE, str);
        hashMap2.put(RpcLogEvent.PARAM_KEY_RPC_RESULT, str2);
        hashMap2.put(RpcLogEvent.PARAM_KEY_RPC_TRACE_ID, getTraceIdFromErrorMsg(str2));
        LogEvent logEvent = new LogEvent(RpcLogEvent.RPC_NATIVE_RPC_PERFORMANCE, hashMap2);
        logEvent.eventType = LogEventType.PERFORMANCE_LOG;
        ACMonitor.getInstance(this.bizCode).logEvent(logEvent);
        try {
            int i = length + 65;
            setMax = i % 128;
            if ((i % 2 == 0 ? 'I' : Typography.quote) != '\"') {
                Object obj = null;
                super.hashCode();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v44, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v47, resolved type: com.iap.ac.android.rpc.model.RpcResult} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01dd, code lost:
        if (r0.size() > 0) goto L_0x01df;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03cf  */
    @androidx.annotation.Nullable
    @androidx.annotation.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Response> Response performRequest(@androidx.annotation.NonNull java.lang.reflect.Method r25, @androidx.annotation.NonNull com.iap.ac.android.common.rpc.model.HttpMethod r26, @androidx.annotation.NonNull com.iap.ac.android.common.rpc.RpcRequest r27) throws com.alipay.mobile.common.rpc.RpcException, java.io.IOException {
        /*
            r24 = this;
            r7 = r24
            r8 = r27
            java.lang.String r9 = ""
            long r10 = java.lang.System.currentTimeMillis()
            com.iap.ac.android.common.rpc.RpcAppInfo r0 = r27.getRpcAppInfo()
            if (r0 != 0) goto L_0x0014
            com.iap.ac.android.common.rpc.RpcAppInfo r0 = r24.getRpcAppInfo()
        L_0x0014:
            r12 = r0
            java.lang.String r0 = r8.operationType
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x040c
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = r12.appId
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r13 = 2
            r14 = 0
            if (r1 != 0) goto L_0x004a
            int r1 = length
            int r1 = r1 + 33
            int r2 = r1 % 128
            setMax = r2
            int r1 = r1 % r13
            java.lang.String r2 = "AppId"
            if (r1 != 0) goto L_0x0045
            java.lang.String r1 = r12.appId
            r0.put(r2, r1)
            r1 = 52
            int r1 = r1 / r14
            goto L_0x004a
        L_0x0042:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x0045:
            java.lang.String r1 = r12.appId
            r0.put(r2, r1)
        L_0x004a:
            java.lang.String r1 = r12.appKey
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r15 = 0
            r6 = 1
            if (r1 != 0) goto L_0x0080
            int r1 = setMax
            int r1 = r1 + 101
            int r2 = r1 % 128
            length = r2
            int r1 = r1 % r13
            if (r1 == 0) goto L_0x0061
            r1 = 0
            goto L_0x0062
        L_0x0061:
            r1 = 1
        L_0x0062:
            java.lang.String r2 = "AppKey"
            if (r1 == r6) goto L_0x0072
            java.lang.String r1 = r12.appKey
            r0.put(r2, r1)
            super.hashCode()     // Catch:{ all -> 0x006f }
            goto L_0x0077
        L_0x006f:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x0072:
            java.lang.String r1 = r12.appKey
            r0.put(r2, r1)
        L_0x0077:
            int r1 = setMax
            int r1 = r1 + 79
            int r2 = r1 % 128
            length = r2
            int r1 = r1 % r13
        L_0x0080:
            java.util.Map<java.lang.String, java.lang.String> r1 = r12.headers
            if (r1 == 0) goto L_0x0086
            r1 = 1
            goto L_0x0087
        L_0x0086:
            r1 = 0
        L_0x0087:
            if (r1 == r6) goto L_0x008a
            goto L_0x008f
        L_0x008a:
            java.util.Map<java.lang.String, java.lang.String> r1 = r12.headers
            r0.putAll(r1)
        L_0x008f:
            java.lang.String r1 = "Content-Type"
            boolean r2 = r0.containsKey(r1)
            if (r2 != 0) goto L_0x009c
            java.lang.String r2 = "application/x-www-form-urlencoded"
            r0.put(r1, r2)
        L_0x009c:
            java.lang.String r1 = "Accept-Language"
            boolean r2 = r0.containsKey(r1)
            if (r2 != 0) goto L_0x00ab
            java.lang.String r2 = com.iap.ac.android.rpc.http.utils.HttpTransportUtils.getLanguage()
            r0.put(r1, r2)
        L_0x00ab:
            java.lang.Object r1 = r8.request
            boolean r1 = r1 instanceof java.lang.String
            if (r1 == 0) goto L_0x00d1
            int r1 = setMax
            int r1 = r1 + 111
            int r2 = r1 % 128
            length = r2
            int r1 = r1 % r13
            if (r1 == 0) goto L_0x00be
            r1 = 0
            goto L_0x00bf
        L_0x00be:
            r1 = 1
        L_0x00bf:
            if (r1 == 0) goto L_0x00c6
            java.lang.Object r1 = r8.request
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x00d7
        L_0x00c6:
            java.lang.Object r1 = r8.request
            java.lang.String r1 = (java.lang.String) r1
            r2 = 19
            int r2 = r2 / r14
            goto L_0x00d7
        L_0x00ce:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x00d1:
            java.lang.Object r1 = r8.request
            java.lang.String r1 = com.iap.ac.android.common.json.JsonUtils.toJson(r1)
        L_0x00d7:
            java.lang.String r2 = "["
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x00e7
            java.lang.String r2 = "]"
            boolean r2 = r1.endsWith(r2)
            if (r2 != 0) goto L_0x00f1
        L_0x00e7:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r14] = r1
            java.lang.String r1 = "[%s]"
            java.lang.String r1 = java.lang.String.format(r1, r2)
        L_0x00f1:
            r5 = r1
            java.lang.String r3 = r8.operationType
            r1 = r24
            r2 = r25
            r4 = r12
            r15 = 1
            r6 = r0
            java.lang.String r5 = r1.prepareRequestBody(r2, r3, r4, r5, r6)
            java.lang.String r1 = TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "http request url="
            r2.<init>(r3)
            java.lang.String r3 = r12.rpcGateWayUrl
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.iap.ac.android.common.log.ACLog.i(r1, r2)
            int r1 = r12.timeoutMS
            if (r1 <= 0) goto L_0x0127
            com.iap.ac.android.common.rpc.model.HttpRequest r16 = new com.iap.ac.android.common.rpc.model.HttpRequest
            java.lang.String r2 = r12.rpcGateWayUrl
            int r6 = r12.timeoutMS
            r1 = r16
            r3 = r26
            r4 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0130
        L_0x0127:
            com.iap.ac.android.common.rpc.model.HttpRequest r1 = new com.iap.ac.android.common.rpc.model.HttpRequest
            java.lang.String r2 = r12.rpcGateWayUrl
            r3 = r26
            r1.<init>(r2, r3, r0, r5)
        L_0x0130:
            long r2 = java.lang.System.currentTimeMillis()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r4 = r8.operationType
            java.lang.String r5 = "operation_type"
            r0.put(r5, r4)
            java.lang.String r4 = r12.rpcGateWayUrl
            java.lang.String r6 = "url"
            r0.put(r6, r4)
            java.lang.String r4 = r7.bizCode
            com.iap.ac.android.common.log.IACMonitor r4 = com.iap.ac.android.common.log.ACMonitor.getInstance(r4)
            com.iap.ac.android.common.log.event.LogEvent r13 = new com.iap.ac.android.common.log.event.LogEvent
            java.lang.String r14 = "iap_net_start"
            r13.<init>(r14, r0)
            r4.logEvent(r13)
            com.iap.ac.android.rpc.RpcProxyImpl r0 = r7.mRpcProxy     // Catch:{ Exception -> 0x03ff }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ Exception -> 0x03ff }
            java.lang.String r4 = r7.bizCode     // Catch:{ Exception -> 0x03ff }
            com.iap.ac.android.common.rpc.interfaces.AbstractHttpTransport r0 = com.iap.ac.android.common.rpc.http.HttpTransportFactory.createHttpTransport(r0, r4)     // Catch:{ Exception -> 0x03ff }
            boolean r4 = r0 instanceof com.iap.ac.android.rpc.http.impl.HttpUrlTransport     // Catch:{ Exception -> 0x03ff }
            if (r4 == 0) goto L_0x0173
            r4 = r0
            com.iap.ac.android.rpc.http.impl.HttpUrlTransport r4 = (com.iap.ac.android.rpc.http.impl.HttpUrlTransport) r4     // Catch:{ Exception -> 0x03ff }
            com.iap.ac.android.rpc.BaseRpcFacadeInvoker$1 r13 = new com.iap.ac.android.rpc.BaseRpcFacadeInvoker$1     // Catch:{ Exception -> 0x03ff }
            r13.<init>()     // Catch:{ Exception -> 0x03ff }
            r4.setEventListener(r13)     // Catch:{ Exception -> 0x03ff }
        L_0x0173:
            com.iap.ac.android.common.rpc.model.HttpResponse r1 = r0.performRequest(r1)     // Catch:{ Exception -> 0x03ff }
            long r13 = java.lang.System.currentTimeMillis()
            long r13 = r13 - r2
            if (r1 == 0) goto L_0x03f6
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r1.headers
            if (r0 == 0) goto L_0x0184
            r0 = 1
            goto L_0x0185
        L_0x0184:
            r0 = 0
        L_0x0185:
            if (r0 == r15) goto L_0x018a
            r2 = r9
            goto L_0x0230
        L_0x018a:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r1.headers
            java.lang.String r2 = "Mgw-TraceId"
            java.lang.Object r0 = r0.get(r2)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x01a5
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x01a5
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            r2 = r0
            goto L_0x01a6
        L_0x01a5:
            r2 = r9
        L_0x01a6:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r1.headers
            java.lang.String r3 = "Server-Time"
            java.lang.Object r0 = r0.get(r3)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x01e9
            int r3 = length
            int r3 = r3 + 113
            int r4 = r3 % 128
            setMax = r4
            r4 = 2
            int r3 = r3 % r4
            if (r3 != 0) goto L_0x01c0
            r3 = 1
            goto L_0x01c1
        L_0x01c0:
            r3 = 0
        L_0x01c1:
            if (r3 == r15) goto L_0x01d5
            int r3 = r0.size()
            r4 = 75
            if (r3 <= 0) goto L_0x01ce
            r3 = 75
            goto L_0x01d0
        L_0x01ce:
            r3 = 42
        L_0x01d0:
            if (r3 == r4) goto L_0x01d3
            goto L_0x01e9
        L_0x01d3:
            r15 = 0
            goto L_0x01df
        L_0x01d5:
            int r3 = r0.size()
            r4 = 47
            r15 = 0
            int r4 = r4 / r15
            if (r3 <= 0) goto L_0x01e9
        L_0x01df:
            java.lang.Object r0 = r0.get(r15)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x01ea
        L_0x01e6:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x01e9:
            r0 = 0
        L_0x01ea:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x022c
            int r3 = setMax
            int r3 = r3 + 117
            int r4 = r3 % 128
            length = r4
            r4 = 2
            int r3 = r3 % r4
            long r3 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x0221 }
            java.lang.String r0 = r7.bizCode     // Catch:{ Exception -> 0x0221 }
            com.iap.ac.android.rpc.RpcProxyImpl r0 = com.iap.ac.android.rpc.RpcProxyImpl.getInstance(r0)     // Catch:{ Exception -> 0x0221 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ Exception -> 0x0221 }
            java.lang.String r15 = r7.bizCode     // Catch:{ Exception -> 0x0221 }
            com.iap.ac.android.common.timesync.TimeSyncManager r0 = com.iap.ac.android.common.timesync.TimeSyncManager.getInstance(r0, r15)     // Catch:{ Exception -> 0x0221 }
            if (r0 == 0) goto L_0x0215
            r26 = r2
            r2 = 1
            r15 = 0
            goto L_0x0219
        L_0x0215:
            r26 = r2
            r2 = 1
            r15 = 1
        L_0x0219:
            if (r15 == r2) goto L_0x022e
            r0.setServerTime(r13, r3)     // Catch:{ Exception -> 0x021f }
            goto L_0x022e
        L_0x021f:
            r0 = move-exception
            goto L_0x0224
        L_0x0221:
            r0 = move-exception
            r26 = r2
        L_0x0224:
            java.lang.String r2 = TAG
            java.lang.String r3 = "get server time error!"
            com.iap.ac.android.common.log.ACLog.e(r2, r3, r0)
            goto L_0x022e
        L_0x022c:
            r26 = r2
        L_0x022e:
            r2 = r26
        L_0x0230:
            int r0 = r1.statusCode
            r3 = 200(0xc8, float:2.8E-43)
            r15 = 5000(0x1388, float:7.006E-42)
            if (r0 != r3) goto L_0x03cf
            byte[] r0 = r1.data
            if (r0 == 0) goto L_0x03b1
            java.lang.Class r3 = r25.getReturnType()
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            if (r3 == r0) goto L_0x0246
            r0 = 1
            goto L_0x0247
        L_0x0246:
            r0 = 0
        L_0x0247:
            r15 = 1
            if (r0 == r15) goto L_0x024b
            goto L_0x024f
        L_0x024b:
            java.lang.Class r0 = java.lang.Void.TYPE
            if (r3 != r0) goto L_0x0258
        L_0x024f:
            java.lang.String r0 = TAG
            java.lang.String r1 = "Rpc Result class is Void. will return null"
            com.iap.ac.android.common.log.ACLog.d(r0, r1)
            r1 = 0
            return r1
        L_0x0258:
            java.lang.String r15 = new java.lang.String
            byte[] r0 = r1.data
            int r1 = android.view.KeyEvent.getMaxKeyCode()
            int r1 = r1 >> 16
            int r1 = 102 - r1
            int r4 = android.view.MotionEvent.axisFromString(r9)
            int r4 = -r4
            r18 = r2
            r2 = 5
            char[] r7 = new char[r2]
            r7 = {-12, 17, 16, 2, -23} // fill-array
            boolean r9 = android.telephony.PhoneNumberUtils.isEmergencyNumber(r9)
            r17 = 0
            long r19 = android.widget.ExpandableListView.getPackedPositionForGroup(r17)
            r21 = 0
            int r23 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            r19 = r13
            int r13 = 5 - r23
            java.lang.String r1 = length(r1, r4, r7, r9, r13)
            java.lang.String r1 = r1.intern()
            r15.<init>(r0, r1)
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r3 != r0) goto L_0x0294
            r0 = 0
            goto L_0x0295
        L_0x0294:
            r0 = 1
        L_0x0295:
            if (r0 == 0) goto L_0x0299
            r0 = r3
            goto L_0x029b
        L_0x0299:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
        L_0x029b:
            com.iap.ac.android.common.json.type.ParameterizedTypeImpl r1 = new com.iap.ac.android.common.json.type.ParameterizedTypeImpl     // Catch:{ all -> 0x02b0 }
            java.lang.Class<com.iap.ac.android.rpc.model.RpcResult> r4 = com.iap.ac.android.rpc.model.RpcResult.class
            r7 = 1
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r7]     // Catch:{ all -> 0x02b0 }
            r7 = 0
            r9[r7] = r0     // Catch:{ all -> 0x02b0 }
            r1.<init>(r4, r9)     // Catch:{ all -> 0x02b0 }
            java.lang.Object r0 = com.iap.ac.android.common.json.JsonUtils.fromJson((java.lang.String) r15, (java.lang.reflect.Type) r1)     // Catch:{ all -> 0x02b0 }
            r1 = r0
            com.iap.ac.android.rpc.model.RpcResult r1 = (com.iap.ac.android.rpc.model.RpcResult) r1     // Catch:{ all -> 0x02b0 }
            goto L_0x02b9
        L_0x02b0:
            r0 = move-exception
            java.lang.String r1 = TAG
            java.lang.String r4 = "Rpc deserialize failed: "
            com.iap.ac.android.common.log.ACLog.e(r1, r4, r0)
            r1 = 0
        L_0x02b9:
            if (r1 == 0) goto L_0x0394
            long r13 = java.lang.System.currentTimeMillis()
            long r13 = r13 - r10
            int r0 = r1.resultStatus
            r4 = 1000(0x3e8, float:1.401E-42)
            r7 = 4
            if (r0 != r4) goto L_0x0366
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r2)
            java.lang.String r2 = r8.operationType
            r0.put(r5, r2)
            java.lang.String r2 = r12.rpcGateWayUrl
            r0.put(r6, r2)
            java.lang.String r2 = "T"
            java.lang.String r4 = "result"
            r0.put(r4, r2)
            java.lang.String r5 = java.lang.String.valueOf(r19)
            java.lang.String r6 = "net_cost"
            r0.put(r6, r5)
            java.lang.String r5 = java.lang.String.valueOf(r13)
            java.lang.String r6 = "duration"
            r0.put(r6, r5)
            r5 = r24
            java.lang.String r6 = r5.bizCode
            com.iap.ac.android.common.log.IACMonitor r6 = com.iap.ac.android.common.log.ACMonitor.getInstance(r6)
            com.iap.ac.android.common.log.event.LogEvent r9 = new com.iap.ac.android.common.log.event.LogEvent
            java.lang.String r10 = "iap_net_result"
            r9.<init>(r10, r0)
            r6.logEvent(r9)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r7)
            java.lang.String r6 = r8.operationType
            java.lang.String r7 = "rpc_id"
            r0.put(r7, r6)
            java.lang.String r6 = java.lang.String.valueOf(r13)
            java.lang.String r7 = "rpc_time"
            r0.put(r7, r6)
            java.lang.String r6 = "rpc_result_code"
            java.lang.String r7 = "1000"
            r0.put(r6, r7)
            java.lang.String r6 = "rpc_result"
            r0.put(r6, r2)
            java.lang.String r2 = "rpc_trace_id"
            r9 = r18
            r0.put(r2, r9)
            com.iap.ac.android.common.log.event.LogEvent r2 = new com.iap.ac.android.common.log.event.LogEvent
            java.lang.String r6 = "native_rpc_performance"
            r2.<init>(r6, r0)
            com.iap.ac.android.common.log.event.LogEventType r0 = com.iap.ac.android.common.log.event.LogEventType.PERFORMANCE_LOG
            r2.eventType = r0
            java.lang.String r0 = r5.bizCode
            com.iap.ac.android.common.log.IACMonitor r0 = com.iap.ac.android.common.log.ACMonitor.getInstance(r0)
            r0.logEvent(r2)
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r3 != r0) goto L_0x0343
            r14 = 0
            goto L_0x0344
        L_0x0343:
            r14 = 1
        L_0x0344:
            if (r14 == 0) goto L_0x0349
            T r0 = r1.result
            return r0
        L_0x0349:
            int r0 = setMax
            int r0 = r0 + 37
            int r1 = r0 % 128
            length = r1
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x0361
            java.lang.String r0 = com.iap.ac.android.common.json.JsonUtils.getJsonObjectFieldAsString(r15, r4)
            r1 = 0
            super.hashCode()     // Catch:{ all -> 0x035e }
            return r0
        L_0x035e:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x0361:
            java.lang.String r0 = com.iap.ac.android.common.json.JsonUtils.getJsonObjectFieldAsString(r15, r4)
            return r0
        L_0x0366:
            r5 = r24
            r9 = r18
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r2 = 0
            r0[r2] = r9
            int r2 = r1.resultStatus
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r0[r3] = r2
            java.lang.String r2 = r1.tips
            r3 = 2
            r0[r3] = r2
            java.lang.String r2 = r1.memo
            r3 = 3
            r0[r3] = r2
            java.lang.String r2 = "RpcError! traceId = %s, resultStatus = %s, tips = %s, memo = %s."
            java.lang.String r0 = java.lang.String.format(r2, r0)
            com.alipay.mobile.common.rpc.RpcException r2 = new com.alipay.mobile.common.rpc.RpcException
            int r1 = r1.resultStatus
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.<init>((java.lang.Integer) r1, (java.lang.String) r0)
            throw r2
        L_0x0394:
            r5 = r24
            r9 = r18
            com.alipay.mobile.common.rpc.RpcException r0 = new com.alipay.mobile.common.rpc.RpcException
            r1 = 10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r9
            java.lang.String r3 = "traceId = %s, Deserialize Rpc result returns null!"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>((java.lang.Integer) r1, (java.lang.String) r2)
            throw r0
        L_0x03b1:
            r9 = r2
            r5 = r7
            r3 = 0
            com.alipay.mobile.common.rpc.RpcException r0 = new com.alipay.mobile.common.rpc.RpcException
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r9
            java.lang.String r1 = r1.statusMessage
            r3 = 1
            r4[r3] = r1
            java.lang.String r1 = "traceId = %s, response.data == null! statusMessage = %s"
            java.lang.String r1 = java.lang.String.format(r1, r4)
            r0.<init>((java.lang.Integer) r2, (java.lang.String) r1)
            throw r0
        L_0x03cf:
            r9 = r2
            r5 = r7
            r3 = 0
            com.alipay.mobile.common.rpc.RpcException r0 = new com.alipay.mobile.common.rpc.RpcException
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r9
            int r3 = r1.statusCode
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6 = 1
            r4[r6] = r3
            java.lang.String r1 = r1.statusMessage
            r3 = 2
            r4[r3] = r1
            java.lang.String r1 = "traceId = %s, statusCode not HTTP_OK(200)! statusCode = %d, statusMessage = %s"
            java.lang.String r1 = java.lang.String.format(r1, r4)
            r0.<init>((java.lang.Integer) r2, (java.lang.String) r1)
            throw r0
        L_0x03f6:
            r5 = r7
            com.alipay.mobile.common.rpc.RpcException r0 = new com.alipay.mobile.common.rpc.RpcException
            java.lang.String r1 = "response == null!"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x03ff:
            r0 = move-exception
            r5 = r7
            java.lang.String r1 = TAG
            com.iap.ac.android.common.log.ACLog.e(r1, r9, r0)
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L_0x040c:
            r5 = r7
            com.alipay.mobile.common.rpc.RpcException r0 = new com.alipay.mobile.common.rpc.RpcException
            r1 = 3000(0xbb8, float:4.204E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "Error! request.operationType is empty!"
            r0.<init>((java.lang.Integer) r1, (java.lang.String) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.rpc.BaseRpcFacadeInvoker.performRequest(java.lang.reflect.Method, com.iap.ac.android.common.rpc.model.HttpMethod, com.iap.ac.android.common.rpc.RpcRequest):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        if ((r3 == null ? 5 : '!') != '!') goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        r3 = java.lang.String.valueOf(r3.getServerTime());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if (r3 == null) goto L_0x0040;
     */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String prepareRequestBody(@androidx.annotation.NonNull java.lang.reflect.Method r3, @androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.NonNull com.iap.ac.android.common.rpc.RpcAppInfo r5, @androidx.annotation.NonNull java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7) {
        /*
            r2 = this;
            int r3 = setMax
            int r3 = r3 + 87
            int r0 = r3 % 128
            length = r0
            int r3 = r3 % 2
            if (r3 == 0) goto L_0x000e
            r3 = 0
            goto L_0x000f
        L_0x000e:
            r3 = 1
        L_0x000f:
            if (r3 == 0) goto L_0x0024
            java.lang.String r3 = r2.bizCode
            com.iap.ac.android.rpc.RpcProxyImpl r3 = com.iap.ac.android.rpc.RpcProxyImpl.getInstance(r3)
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r0 = r2.bizCode
            com.iap.ac.android.common.timesync.TimeSyncManager r3 = com.iap.ac.android.common.timesync.TimeSyncManager.getInstance(r3, r0)
            if (r3 != 0) goto L_0x0053
            goto L_0x0040
        L_0x0024:
            java.lang.String r3 = r2.bizCode
            com.iap.ac.android.rpc.RpcProxyImpl r3 = com.iap.ac.android.rpc.RpcProxyImpl.getInstance(r3)
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r0 = r2.bizCode
            com.iap.ac.android.common.timesync.TimeSyncManager r3 = com.iap.ac.android.common.timesync.TimeSyncManager.getInstance(r3, r0)
            r0 = 0
            int r0 = r0.length     // Catch:{ all -> 0x0089 }
            r0 = 33
            if (r3 != 0) goto L_0x003c
            r1 = 5
            goto L_0x003e
        L_0x003c:
            r1 = 33
        L_0x003e:
            if (r1 == r0) goto L_0x0053
        L_0x0040:
            int r3 = setMax
            int r3 = r3 + 9
            int r0 = r3 % 128
            length = r0
            int r3 = r3 % 2
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            goto L_0x005b
        L_0x0053:
            long r0 = r3.getServerTime()
            java.lang.String r3 = java.lang.String.valueOf(r0)
        L_0x005b:
            java.lang.String r0 = r2.formatRequestBody(r4, r6, r3)
            java.lang.String r1 = r2.bizCode
            com.iap.ac.android.rpc.RpcProxyImpl r1 = com.iap.ac.android.rpc.RpcProxyImpl.getInstance(r1)
            java.lang.String r5 = r1.signRequest(r5, r0, r7)
            java.lang.String r3 = com.iap.ac.android.rpc.utils.RpcUtils.formatForUrlEncode(r4, r6, r3, r5)
            java.lang.String r4 = TAG
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "prepareRequestBody rawBody = "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r6 = ", encodedBody = "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            com.iap.ac.android.common.log.ACLog.d(r4, r5)
            return r3
        L_0x0089:
            r3 = move-exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.rpc.BaseRpcFacadeInvoker.prepareRequestBody(java.lang.reflect.Method, java.lang.String, com.iap.ac.android.common.rpc.RpcAppInfo, java.lang.String, java.util.Map):java.lang.String");
    }

    private String formatRequestBody(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        StringBuilder sb = new StringBuilder("operationType=");
        sb.append(str);
        sb.append("&requestData=");
        sb.append(str2);
        sb.append("&ts=");
        sb.append(str3);
        String obj = sb.toString();
        int i = setMax + 19;
        length = i % 128;
        if ((i % 2 != 0 ? '=' : 'V') != '=') {
            return obj;
        }
        int i2 = 56 / 0;
        return obj;
    }

    private String getTraceIdFromErrorMsg(String str) {
        char c = 2;
        if (!TextUtils.isEmpty(str)) {
            try {
                String[] split = str.split(",");
                int length2 = split.length;
                int i = 0;
                while (i < length2) {
                    String str2 = split[i];
                    try {
                        if ((!TextUtils.isEmpty(str2) ? 5 : 'O') != 'O') {
                            int i2 = length + 23;
                            setMax = i2 % 128;
                            int i3 = i2 % 2;
                            if (!(!str2.contains("traceId"))) {
                                String[] split2 = str2.split(SimpleComparison.EQUAL_TO_OPERATION);
                                if (split2.length != 2) {
                                    return "";
                                }
                                String trim = split2[1].trim();
                                int i4 = length + 45;
                                setMax = i4 % 128;
                                if (i4 % 2 != 0) {
                                    c = ':';
                                }
                                if (c == ':') {
                                    return trim;
                                }
                                int i5 = 29 / 0;
                                return trim;
                            }
                        }
                        i++;
                    } catch (Exception e) {
                        throw e;
                    }
                }
                return "";
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            int i6 = length + 3;
            setMax = i6 % 128;
            int i7 = i6 % 2;
            return "";
        }
    }

    private static String length(int i, int i2, char[] cArr, boolean z, int i3) {
        int i4;
        char[] cArr2;
        char[] cArr3 = new char[i3];
        int i5 = 0;
        while (true) {
            if (i5 >= i3) {
                break;
            }
            try {
                int i6 = length + 13;
                try {
                    setMax = i6 % 128;
                    if ((i6 % 2 == 0 ? 'B' : '[') != '[') {
                        cArr3[i5] = (char) (i % cArr[i5]);
                        cArr3[i5] = (char) (cArr3[i5] % getMin);
                        i5 += 18;
                    } else {
                        cArr3[i5] = (char) (cArr[i5] + i);
                        cArr3[i5] = (char) (cArr3[i5] - getMin);
                        i5++;
                    }
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        if (i2 > 0) {
            char[] cArr4 = new char[i3];
            System.arraycopy(cArr3, 0, cArr4, 0, i3);
            int i7 = i3 - i2;
            System.arraycopy(cArr4, 0, cArr3, i7, i2);
            System.arraycopy(cArr4, i2, cArr3, 0, i7);
        }
        if (z) {
            int i8 = length + 63;
            setMax = i8 % 128;
            if (i8 % 2 == 0) {
                cArr2 = new char[i3];
                i4 = 1;
            } else {
                cArr2 = new char[i3];
                i4 = 0;
            }
            while (true) {
                if (i4 >= i3) {
                    break;
                }
                cArr2[i4] = cArr3[(i3 - i4) - 1];
                i4++;
            }
            cArr3 = cArr2;
        }
        String str = new String(cArr3);
        int i9 = length + 1;
        setMax = i9 % 128;
        if (i9 % 2 != 0) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        return str;
    }
}
