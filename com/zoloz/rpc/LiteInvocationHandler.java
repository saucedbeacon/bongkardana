package com.zoloz.rpc;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant;
import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.security.bio.service.local.rpc.IRpcException;
import com.google.common.net.HttpHeaders;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.zoloz.rpccommon.InterceptorManager;
import com.zoloz.rpccommon.NetRequest;
import com.zoloz.rpccommon.NetResponse;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.getTabbarModel;
import o.onActivityPostResumed;

public class LiteInvocationHandler implements InvocationHandler {
    private static final String EKYC_INIT_API = "com.zoloz.ekyc.init.client";
    public static String TAG = "LiteInvocationHandler";
    private static int[] getMax = null;
    private static int length = 0;
    private static int requestID = 0;
    private static boolean sInit = false;
    private static int setMax = 1;
    public String host;
    private Object mDebugObject;

    static void setMin() {
        getMax = new int[]{-789359843, 188125306, 2075422017, -1625399352, -2059576550, 1344345671, -1991766073, -1158968761, -1047344682, 997842832, 1619331302, -1950489056, 1955802407, -1252247693, 387059281, -1547146860, 551037969, -418011324};
    }

    static /* synthetic */ Object access$002(LiteInvocationHandler liteInvocationHandler, Object obj) {
        int i = length + 53;
        setMax = i % 128;
        boolean z = i % 2 != 0;
        liteInvocationHandler.mDebugObject = obj;
        if (!z) {
            int i2 = 96 / 0;
        }
        return obj;
    }

    static /* synthetic */ Object access$100(LiteInvocationHandler liteInvocationHandler, Object obj, Method method, Object[] objArr) throws ZolozRpcException {
        int i = length + 109;
        setMax = i % 128;
        boolean z = i % 2 == 0;
        Object performRequest = liteInvocationHandler.performRequest(obj, method, objArr);
        if (z) {
            Object obj2 = null;
            super.hashCode();
        }
        return performRequest;
    }

    static {
        setMin();
        int i = setMax + 49;
        length = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        if (r0 != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006c, code lost:
        return performRequest(r10, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (com.zoloz.rpc.RpcConfig.needDebugRpc != false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r10, java.lang.reflect.Method r11, java.lang.Object[] r12) throws com.zoloz.rpc.ZolozRpcException {
        /*
            r9 = this;
            int r0 = setMax     // Catch:{ Exception -> 0x006f }
            int r0 = r0 + 85
            int r1 = r0 % 128
            length = r1     // Catch:{ Exception -> 0x006f }
            int r0 = r0 % 2
            r1 = 35
            if (r0 == 0) goto L_0x0011
            r0 = 35
            goto L_0x0013
        L_0x0011:
            r0 = 52
        L_0x0013:
            if (r0 == r1) goto L_0x001a
            boolean r0 = com.zoloz.rpc.RpcConfig.needDebugRpc
            if (r0 == 0) goto L_0x0068
            goto L_0x0022
        L_0x001a:
            boolean r0 = com.zoloz.rpc.RpcConfig.needDebugRpc
            r1 = 0
            super.hashCode()     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x0068
        L_0x0022:
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            java.lang.Thread r1 = new java.lang.Thread
            com.zoloz.rpc.LiteInvocationHandler$1 r8 = new com.zoloz.rpc.LiteInvocationHandler$1
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r0
            r2.<init>(r4, r5, r6, r7)
            r1.<init>(r8)
            r1.start()
            r10 = 30
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0061 }
            r0.await(r10, r12)     // Catch:{ InterruptedException -> 0x0061 }
            int r10 = setMax
            int r10 = r10 + 99
            int r11 = r10 % 128
            length = r11
            int r10 = r10 % 2
            java.lang.Object r10 = r9.mDebugObject
            if (r10 == 0) goto L_0x0051
            return r10
        L_0x0051:
            com.zoloz.rpc.ZolozRpcException r10 = new com.zoloz.rpc.ZolozRpcException
            r11 = 6666(0x1a0a, float:9.341E-42)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x005f }
            java.lang.String r12 = "rpc get null result"
            r10.<init>((java.lang.Integer) r11, (java.lang.String) r12)     // Catch:{ Exception -> 0x005f }
            throw r10     // Catch:{ Exception -> 0x005f }
        L_0x005f:
            r10 = move-exception
            throw r10
        L_0x0061:
            r10 = move-exception
            com.zoloz.rpc.ZolozRpcException r11 = new com.zoloz.rpc.ZolozRpcException
            r11.<init>((java.lang.Exception) r10)
            throw r11
        L_0x0068:
            java.lang.Object r10 = r9.performRequest(r10, r11, r12)
            return r10
        L_0x006d:
            r10 = move-exception
            throw r10
        L_0x006f:
            r10 = move-exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zoloz.rpc.LiteInvocationHandler.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }

    private Object performRequest(Object obj, Method method, Object[] objArr) throws ZolozRpcException {
        NetRequest netRequest;
        NetResponse netResponse;
        int i = length + 13;
        setMax = i % 128;
        int i2 = i % 2;
        OperationType operationType = (OperationType) method.getAnnotation(OperationType.class);
        if ((TextUtils.isEmpty(this.host) ? 31 : '!') != '!') {
            this.host = RpcConfig.getInstance().getRemoteUrl();
        }
        if (operationType == null) {
            throw new ZolozRpcException(Integer.valueOf(IRpcException.ErrorCode.PRC_OPERATIONTYPE_EMPTY), "operation type is null");
        } else if (!TextUtils.isEmpty(this.host)) {
            requestID++;
            try {
                String encode = URLEncoder.encode(args2List(objArr), getTabbarModel.ENC);
                String value = operationType.value();
                HashMap hashMap = new HashMap();
                hashMap.put("id", String.valueOf(requestID));
                hashMap.put("operationType", value);
                hashMap.put("requestData", encode);
                hashMap.put("ts", getTimeTamp());
                if (RpcConfig.getInstance().isEncodeParam()) {
                    int i3 = length + 31;
                    setMax = i3 % 128;
                    int i4 = i3 % 2;
                    hashMap.put("_aop_signature", SigApiUtil.generateSignature(this.host, hashMap));
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("AppId", RpcConfig.getInstance().getAppId());
                hashMap2.put(HeaderConstant.HEADER_KEY_WORKSPACE_ID, RpcConfig.getInstance().getWorkspaceId());
                hashMap2.put(HttpHeaders.CONNECTION, "Keep-Alive");
                boolean z = false;
                hashMap2.put("Charset", setMin(TextUtils.indexOf("", '0', 0, 0) + 6, new int[]{-128102868, 1060344638, 214996043, 195856185}).intern());
                if (TextUtils.equals(operationType.value(), EKYC_INIT_API)) {
                    netRequest = NetRequest.build(requestID, RpcConfig.getInstance().getRemoteInitUrl(), value, hashMap2, JSON.toJSONString(objArr[0]).getBytes());
                } else {
                    netRequest = NetRequest.build(requestID, this.host, value, hashMap2, getQuery(hashMap).getBytes());
                }
                if (RpcConfig.needCatchRpc) {
                    InterceptorManager.get().onPreExecute(netRequest);
                }
                if ((RpcConfig.getInstance().getRpcProxyImpl() != null ? '8' : ',') != ',') {
                    netResponse = RpcConfig.getInstance().getRpcProxyImpl().doRequest(netRequest);
                } else {
                    netResponse = NormalRequest.doRequest(this.host, hashMap2, netRequest.requestBody);
                }
                if (!RpcConfig.needCatchRpc) {
                    z = true;
                }
                if (!z) {
                    InterceptorManager.get().onPostExecute(netRequest, netResponse);
                }
                Class<?> returnType = method.getReturnType();
                if (netResponse.rpcCode == 4001) {
                    throw new ZolozRpcException((Integer) 4001, "time out of 10s");
                } else if (netResponse.responseBody != null) {
                    try {
                        return parseResultObj(new String(netResponse.responseBody), returnType);
                    } catch (JSONException unused) {
                        throw new ZolozRpcException((Integer) 6004, "json format error");
                    } catch (NullPointerException unused2) {
                        throw new ZolozRpcException((Integer) 6004, "json object null");
                    }
                } else {
                    throw new ZolozRpcException((Integer) 5000, "null result error");
                }
            } catch (UnsupportedEncodingException e) {
                throw new ZolozRpcException((Exception) e);
            }
        } else {
            throw new ZolozRpcException((Integer) 16, "host is null");
        }
    }

    private String getQuery(Map<String, String> map) {
        int i = length + 67;
        setMax = i % 128;
        if (i % 2 == 0) {
            Object[] objArr = null;
            int length2 = objArr.length;
            if ((map == null ? 15 : 'D') == 15) {
                return "";
            }
        } else if (map == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            boolean z = true;
            while (true) {
                if (!it.hasNext()) {
                    return sb.toString();
                }
                Map.Entry next = it.next();
                if ((z ? 'D' : 'Y') != 'D') {
                    sb.append("&");
                    int i2 = length + 121;
                    setMax = i2 % 128;
                    int i3 = i2 % 2;
                } else {
                    z = false;
                }
                sb.append((String) next.getKey());
                sb.append(SimpleComparison.EQUAL_TO_OPERATION);
                sb.append((String) next.getValue());
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r5 == 13802) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        throw new com.zoloz.rpc.ZolozRpcException(java.lang.Integer.valueOf(r5), "rpc return error");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        if (r5 == 1000) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object parseResultObj(java.lang.String r5, java.lang.Class r6) throws com.zoloz.rpc.ZolozRpcException {
        /*
            r4 = this;
            int r0 = length
            int r0 = r0 + 9
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 42
            if (r0 != 0) goto L_0x0011
            r0 = 42
            goto L_0x0013
        L_0x0011:
            r0 = 77
        L_0x0013:
            java.lang.String r2 = "resultStatus"
            java.lang.String r3 = "result"
            if (r0 == r1) goto L_0x002a
            com.alibaba.fastjson.JSONObject r5 = com.alibaba.fastjson.JSON.parseObject(r5)
            java.lang.String r0 = r5.getString(r3)
            int r5 = r5.getIntValue(r2)
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r5 != r1) goto L_0x0049
            goto L_0x003a
        L_0x002a:
            com.alibaba.fastjson.JSONObject r5 = com.alibaba.fastjson.JSON.parseObject(r5)     // Catch:{ Exception -> 0x0057 }
            java.lang.String r0 = r5.getString(r3)     // Catch:{ Exception -> 0x0055 }
            int r5 = r5.getIntValue(r2)     // Catch:{ Exception -> 0x0055 }
            r1 = 13802(0x35ea, float:1.9341E-41)
            if (r5 != r1) goto L_0x0049
        L_0x003a:
            java.lang.Object r5 = com.alibaba.fastjson.JSON.parseObject((java.lang.String) r0, r6)
            int r6 = setMax
            int r6 = r6 + 31
            int r0 = r6 % 128
            length = r0
            int r6 = r6 % 2
            return r5
        L_0x0049:
            com.zoloz.rpc.ZolozRpcException r6 = new com.zoloz.rpc.ZolozRpcException
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r0 = "rpc return error"
            r6.<init>((java.lang.Integer) r5, (java.lang.String) r0)
            throw r6
        L_0x0055:
            r5 = move-exception
            throw r5
        L_0x0057:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zoloz.rpc.LiteInvocationHandler.parseResultObj(java.lang.String, java.lang.Class):java.lang.Object");
    }

    private String getTimeTamp() {
        try {
            int i = length + 37;
            setMax = i % 128;
            int i2 = i % 2;
            String valueOf = String.valueOf(System.currentTimeMillis());
            int i3 = length + 125;
            setMax = i3 % 128;
            int i4 = i3 % 2;
            return valueOf;
        } catch (Exception e) {
            throw e;
        }
    }

    private String args2List(Object[] objArr) {
        if ((objArr == null ? 'N' : 18) != 'N') {
            ArrayList arrayList = new ArrayList();
            int length2 = objArr.length;
            int i = 0;
            int i2 = setMax + 63;
            length = i2 % 128;
            int i3 = i2 % 2;
            while (true) {
                if ((i < length2 ? '=' : 29) == 29) {
                    return arrayList.toString();
                }
                arrayList.add(JSON.parseObject(JSON.toJSONString(objArr[i])));
                i++;
            }
        } else {
            int i4 = setMax + 83;
            length = i4 % 128;
            int i5 = i4 % 2;
            return "";
        }
    }

    private static String setMin(int i, int[] iArr) {
        int i2 = setMax + 67;
        length = i2 % 128;
        int i3 = i2 % 2;
        char[] cArr = new char[4];
        char[] cArr2 = new char[(iArr.length << 1)];
        int[] iArr2 = (int[]) getMax.clone();
        int i4 = length + 123;
        setMax = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        while (true) {
            if ((i6 < iArr.length ? 'N' : '\'') != 'N') {
                return new String(cArr2, 0, i);
            }
            cArr[0] = (char) (iArr[i6] >> 16);
            cArr[1] = (char) iArr[i6];
            int i7 = i6 + 1;
            cArr[2] = (char) (iArr[i7] >> 16);
            cArr[3] = (char) iArr[i7];
            onActivityPostResumed.getMin(cArr, iArr2, false);
            int i8 = i6 << 1;
            cArr2[i8] = cArr[0];
            cArr2[i8 + 1] = cArr[1];
            cArr2[i8 + 2] = cArr[2];
            cArr2[i8 + 3] = cArr[3];
            i6 += 2;
        }
    }
}
