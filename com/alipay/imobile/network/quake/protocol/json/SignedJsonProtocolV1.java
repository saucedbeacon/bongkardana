package com.alipay.imobile.network.quake.protocol.json;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.imobile.network.quake.Quake;
import com.alipay.imobile.network.quake.Request;
import com.alipay.imobile.network.quake.ext.proxy.a;
import com.alipay.imobile.network.quake.f;
import com.alipay.imobile.network.quake.protocol.AbstractHttpProtocol;
import com.alipay.imobile.network.quake.rpc.RpcRequest;
import com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant;
import com.alipay.imobile.network.quake.util.SignUtil;
import com.alipay.mobile.common.rpc.RpcException;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class SignedJsonProtocolV1 extends AbstractHttpProtocol<Object> {
    private static int getMax = 0;
    private static int length = 1;
    private static int setMax = 78;

    /* renamed from: a  reason: collision with root package name */
    private a f9365a;

    public SignedJsonProtocolV1(Context context) {
        this.f9365a = a.a(context);
    }

    private static String a(String str, String str2) {
        int i;
        if ((str2 != null ? 8 : '[') != 8) {
            try {
                str2 = setMax(146 - Drawable.resolveOpacity(0, 0), 3 - View.combineMeasuredStates(0, 0), new char[]{2, 65513, 65524, 17, 16}, !URLUtil.isAboutUrl("about:"), View.MeasureSpec.getMode(0) + 5).intern();
                i = getMax + 97;
                length = i % 128;
            } catch (UnsupportedEncodingException e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            i = length + 11;
            getMax = i % 128;
        }
        int i2 = i % 2;
        return URLEncoder.encode(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        if ((r1 != null ? 17 : 'L') != 'L') goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        if ((r1 != null ? 5 : 'F') != 'F') goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        r1 = "";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.util.List<? extends com.alipay.imobile.network.quake.a.a> r5, java.lang.String r6) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0009:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x008f
            int r1 = getMax
            int r1 = r1 + 115
            int r2 = r1 % 128
            length = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L_0x0041
            java.lang.Object r1 = r5.next()     // Catch:{ Exception -> 0x003f }
            com.alipay.imobile.network.quake.a.a r1 = (com.alipay.imobile.network.quake.a.a) r1     // Catch:{ Exception -> 0x003f }
            java.lang.String r2 = r1.a()     // Catch:{ Exception -> 0x003f }
            java.lang.String r2 = a((java.lang.String) r2, (java.lang.String) r6)     // Catch:{ Exception -> 0x003f }
            java.lang.String r1 = r1.b()     // Catch:{ Exception -> 0x003f }
            r3 = 0
            super.hashCode()     // Catch:{ all -> 0x003d }
            r3 = 76
            if (r1 == 0) goto L_0x0038
            r4 = 17
            goto L_0x003a
        L_0x0038:
            r4 = 76
        L_0x003a:
            if (r4 == r3) goto L_0x0062
            goto L_0x005d
        L_0x003d:
            r5 = move-exception
            throw r5
        L_0x003f:
            r5 = move-exception
            throw r5
        L_0x0041:
            java.lang.Object r1 = r5.next()
            com.alipay.imobile.network.quake.a.a r1 = (com.alipay.imobile.network.quake.a.a) r1
            java.lang.String r2 = r1.a()
            java.lang.String r2 = a((java.lang.String) r2, (java.lang.String) r6)
            java.lang.String r1 = r1.b()
            r3 = 70
            if (r1 == 0) goto L_0x0059
            r4 = 5
            goto L_0x005b
        L_0x0059:
            r4 = 70
        L_0x005b:
            if (r4 == r3) goto L_0x0062
        L_0x005d:
            java.lang.String r1 = a((java.lang.String) r1, (java.lang.String) r6)
            goto L_0x0064
        L_0x0062:
            java.lang.String r1 = ""
        L_0x0064:
            int r3 = r0.length()
            r4 = 75
            if (r3 <= 0) goto L_0x006f
            r3 = 61
            goto L_0x0071
        L_0x006f:
            r3 = 75
        L_0x0071:
            if (r3 == r4) goto L_0x0082
            int r3 = getMax
            int r3 = r3 + 49
            int r4 = r3 % 128
            length = r4
            int r3 = r3 % 2
            java.lang.String r3 = "&"
            r0.append(r3)
        L_0x0082:
            r0.append(r2)
            java.lang.String r2 = "="
            r0.append(r2)
            r0.append(r1)
            goto L_0x0009
        L_0x008f:
            java.lang.String r5 = r0.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.imobile.network.quake.protocol.json.SignedJsonProtocolV1.a(java.util.List, java.lang.String):java.lang.String");
    }

    private String a(List<com.alipay.imobile.network.quake.a.a> list, String str, SignUtil.SignInfo signInfo) {
        b(list);
        StringBuilder sb = new StringBuilder();
        Iterator<com.alipay.imobile.network.quake.a.a> it = list.iterator();
        int i = length + 105;
        getMax = i % 128;
        int i2 = i % 2;
        while (true) {
            boolean z = false;
            if (it.hasNext()) {
                int i3 = length + 125;
                getMax = i3 % 128;
                if (i3 % 2 == 0) {
                    z = true;
                }
                if (z) {
                    com.alipay.imobile.network.quake.a.a next = it.next();
                    sb.append(next.a());
                    sb.append(SimpleComparison.EQUAL_TO_OPERATION);
                    sb.append(next.b());
                    sb.append("&");
                } else {
                    com.alipay.imobile.network.quake.a.a next2 = it.next();
                    sb.append(next2.a());
                    sb.append(SimpleComparison.EQUAL_TO_OPERATION);
                    sb.append(next2.b());
                    sb.append("&");
                    Object obj = null;
                    super.hashCode();
                }
            } else {
                try {
                    try {
                        LoggerWrapper.v(Quake.TAG, "before sign in SignedJsonProtocolV1");
                        return SignUtil.a(f.a().d(), signInfo, str, sb.deleteCharAt(sb.length() - 1).toString());
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
        }
    }

    private void a(List<com.alipay.imobile.network.quake.a.a> list, Request request) {
        try {
            int i = length + 83;
            getMax = i % 128;
            int i2 = i % 2;
            String actionType = request.getActionType();
            if (!TextUtils.isEmpty(actionType)) {
                list.add(new com.alipay.imobile.network.quake.a.a("operationType", actionType));
                try {
                    int i3 = getMax + 41;
                    length = i3 % 128;
                    int i4 = i3 % 2;
                } catch (Exception e) {
                    throw e;
                }
            }
            list.add(new com.alipay.imobile.network.quake.a.a("id", String.valueOf(request.getSequence())));
            list.add(new com.alipay.imobile.network.quake.a.a("requestData", getRequestDataJson(request)));
            String str = request.getExternalInfo().get("ts");
            if (!TextUtils.isEmpty(str)) {
                list.add(new com.alipay.imobile.network.quake.a.a("ts", String.valueOf(str)));
                int i5 = getMax + 63;
                length = i5 % 128;
                int i6 = i5 % 2;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private byte[] a(List<com.alipay.imobile.network.quake.a.a> list) {
        byte[] bArr;
        int i = getMax + 107;
        length = i % 128;
        if ((i % 2 == 0 ? 'W' : 10) != 10) {
            bArr = a((List<? extends com.alipay.imobile.network.quake.a.a>) list, getParamsEncoding()).getBytes();
            Object[] objArr = null;
            int length2 = objArr.length;
        } else {
            bArr = a((List<? extends com.alipay.imobile.network.quake.a.a>) list, getParamsEncoding()).getBytes();
        }
        int i2 = length + 123;
        getMax = i2 % 128;
        int i3 = i2 % 2;
        return bArr;
    }

    private void b(List<com.alipay.imobile.network.quake.a.a> list) {
        Collections.sort(list, new Comparator<com.alipay.imobile.network.quake.a.a>() {
            /* renamed from: a */
            public int compare(com.alipay.imobile.network.quake.a.a aVar, com.alipay.imobile.network.quake.a.a aVar2) {
                try {
                    return aVar.a().compareTo(aVar2.a());
                } catch (Exception e) {
                    LoggerWrapper.e(Quake.TAG, "", e);
                    return 0;
                }
            }
        });
        int i = getMax + 55;
        length = i % 128;
        if ((i % 2 == 0 ? '#' : 18) == '#') {
            int i2 = 57 / 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f4, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f5, code lost:
        r15 = new com.alipay.imobile.network.quake.exception.ClientException((java.lang.Integer) 10, (java.lang.Throwable) r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0103, code lost:
        r14 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x012b, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x012c, code lost:
        r15 = new com.alipay.imobile.network.quake.exception.ClientException((java.lang.Integer) 10, (java.lang.Throwable) r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0136, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013b, code lost:
        return com.alipay.imobile.network.quake.Response.error(r14);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f4 A[ExcHandler: Exception (r14v7 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:1:0x0004] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012b A[ExcHandler: UnsupportedEncodingException (r14v3 'e' java.io.UnsupportedEncodingException A[CUSTOM_DECLARE]), Splitter:B:1:0x0004] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0136 A[ExcHandler: RpcException (r14v1 'e' com.alipay.mobile.common.rpc.RpcException A[CUSTOM_DECLARE]), Splitter:B:1:0x0004] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.alipay.imobile.network.quake.Response<java.lang.Object> deserialize(com.alipay.imobile.network.quake.Request r14, com.alipay.imobile.network.quake.NetworkResponse r15) throws com.alipay.mobile.common.rpc.RpcException {
        /*
            r13 = this;
            java.lang.String r0 = ""
            r1 = 10
            java.util.Map<java.lang.String, java.lang.String> r2 = r15.extData     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x0103, Exception -> 0x00f4 }
            r3 = 0
            int r4 = android.text.TextUtils.getOffsetBefore(r0, r3)     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x0103, Exception -> 0x00f4 }
            int r4 = r4 + 146
            int r5 = android.view.KeyEvent.getMaxKeyCode()     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x0103, Exception -> 0x00f4 }
            r6 = 16
            int r5 = r5 >> r6
            r7 = 3
            int r5 = r5 + r7
            r8 = 5
            char[] r9 = new char[r8]     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x0103, Exception -> 0x00f4 }
            r10 = 2
            r9[r3] = r10     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x0103, Exception -> 0x00f4 }
            r11 = 65513(0xffe9, float:9.1803E-41)
            r12 = 1
            r9[r12] = r11     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x0103, Exception -> 0x00f4 }
            r11 = 65524(0xfff4, float:9.1819E-41)
            r9[r10] = r11     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x0103, Exception -> 0x00f4 }
            r11 = 17
            r9[r7] = r11     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x0103, Exception -> 0x00f4 }
            r7 = 4
            r9[r7] = r6     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x0103, Exception -> 0x00f4 }
            r6 = 48
            boolean r6 = android.telephony.PhoneNumberUtils.isStartsPostDial(r6)     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x0103, Exception -> 0x00f4 }
            int r7 = android.graphics.Color.red(r3)     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x0103, Exception -> 0x00f4 }
            int r8 = r8 - r7
            java.lang.String r4 = setMax(r4, r5, r9, r6, r8)     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x0103, Exception -> 0x00f4 }
            java.lang.String r4 = r4.intern()     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x0103, Exception -> 0x00f4 }
            java.lang.String r2 = r13.parseCharset(r2, r4)     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x0103, Exception -> 0x00f4 }
            java.lang.String r4 = new java.lang.String     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x0103, Exception -> 0x00f4 }
            byte[] r5 = r15.data     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x0103, Exception -> 0x00f4 }
            r4.<init>(r5, r2)     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x0103, Exception -> 0x00f4 }
            java.lang.String r0 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x00f1, Exception -> 0x00f4 }
            java.lang.String r2 = "the response to be deserialized is "
            java.lang.String r2 = r2.concat(r4)     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x00f1, Exception -> 0x00f4 }
            com.alipay.iap.android.common.log.LoggerWrapper.d(r0, r2)     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x00f1, Exception -> 0x00f4 }
            com.alibaba.fastjson.JSONObject r0 = com.alibaba.fastjson.JSON.parseObject(r4)     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x00f1, Exception -> 0x00f4 }
            java.lang.String r2 = "resultStatus"
            int r2 = r0.getIntValue(r2)     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x00f1, Exception -> 0x00f4 }
            r5 = 1000(0x3e8, float:1.401E-42)
            if (r2 != r5) goto L_0x0068
            r5 = 1
            goto L_0x0069
        L_0x0068:
            r5 = 0
        L_0x0069:
            if (r5 == 0) goto L_0x009a
            java.lang.reflect.Type r14 = r14.getResponseType()     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x00f1, Exception -> 0x00f4 }
            if (r14 == 0) goto L_0x0098
            java.lang.Class r2 = java.lang.Void.TYPE     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x00f1, Exception -> 0x00f4 }
            if (r2 != r14) goto L_0x0076
            goto L_0x0098
        L_0x0076:
            java.lang.String r2 = "result"
            java.lang.String r0 = r0.getString(r2)     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x00f1, Exception -> 0x00f4 }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r2 != r14) goto L_0x0089
            com.alipay.imobile.network.quake.cache.Cache$Entry r14 = r13.parseCacheHeaders(r15)     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x0103, Exception -> 0x00f4 }
            com.alipay.imobile.network.quake.Response r14 = com.alipay.imobile.network.quake.Response.success(r0, r14)     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x0103, Exception -> 0x00f4 }
            return r14
        L_0x0089:
            com.alibaba.fastjson.parser.Feature[] r2 = new com.alibaba.fastjson.parser.Feature[r3]     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x0103, Exception -> 0x00f4 }
            java.lang.Object r14 = com.alibaba.fastjson.JSON.parseObject((java.lang.String) r0, (java.lang.reflect.Type) r14, (com.alibaba.fastjson.parser.Feature[]) r2)     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x0103, Exception -> 0x00f4 }
            com.alipay.imobile.network.quake.cache.Cache$Entry r15 = r13.parseCacheHeaders(r15)     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x0103, Exception -> 0x00f4 }
            com.alipay.imobile.network.quake.Response r14 = com.alipay.imobile.network.quake.Response.success(r14, r15)     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x0103, Exception -> 0x00f4 }
            return r14
        L_0x0098:
            r14 = 0
            return r14
        L_0x009a:
            java.lang.String r14 = "Memo"
            java.lang.String r14 = r0.getString(r14)     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x00f1, Exception -> 0x00f4 }
            java.lang.String r15 = "Tips"
            java.lang.String r15 = r0.getString(r15)     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x00f1, Exception -> 0x00f4 }
            boolean r5 = android.text.TextUtils.isEmpty(r15)     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x00f1, Exception -> 0x00f4 }
            if (r5 != 0) goto L_0x00b6
            int r14 = getMax
            int r14 = r14 + 67
            int r5 = r14 % 128
            length = r5
            int r14 = r14 % r10
            r14 = r15
        L_0x00b6:
            com.alipay.imobile.network.quake.exception.ServerException r15 = new com.alipay.imobile.network.quake.exception.ServerException     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x00f1, Exception -> 0x00f4 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x00f1, Exception -> 0x00f4 }
            r15.<init>((java.lang.Integer) r5, (java.lang.String) r14)     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x00f1, Exception -> 0x00f4 }
            r14 = 1002(0x3ea, float:1.404E-42)
            if (r2 != r14) goto L_0x00f0
            int r14 = getMax
            int r14 = r14 + 115
            int r2 = r14 % 128
            length = r2
            int r14 = r14 % r10
            java.lang.String r14 = "Control"
            com.alibaba.fastjson.JSONObject r14 = r0.getJSONObject(r14)     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x00f1, Exception -> 0x00f4 }
            if (r14 == 0) goto L_0x00d5
            r3 = 1
        L_0x00d5:
            if (r3 == 0) goto L_0x00f0
            int r0 = getMax
            int r0 = r0 + 91
            int r2 = r0 % 128
            length = r2
            int r0 = r0 % r10
            java.lang.String r14 = r14.toJSONString()     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x00f1, Exception -> 0x00f4 }
            r15.setControl(r14)     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x00f1, Exception -> 0x00f4 }
            int r14 = length
            int r14 = r14 + 55
            int r0 = r14 % 128
            getMax = r0
            int r14 = r14 % r10
        L_0x00f0:
            throw r15     // Catch:{ RpcException -> 0x0136, UnsupportedEncodingException -> 0x012b, JSONException -> 0x00f1, Exception -> 0x00f4 }
        L_0x00f1:
            r14 = move-exception
            r0 = r4
            goto L_0x0104
        L_0x00f4:
            r14 = move-exception
            com.alipay.imobile.network.quake.exception.ClientException r15 = new com.alipay.imobile.network.quake.exception.ClientException
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r15.<init>((java.lang.Integer) r0, (java.lang.Throwable) r14)
        L_0x00fe:
            com.alipay.imobile.network.quake.Response r14 = com.alipay.imobile.network.quake.Response.error(r15)
            return r14
        L_0x0103:
            r14 = move-exception
        L_0x0104:
            com.alipay.imobile.network.quake.exception.ClientException r15 = new com.alipay.imobile.network.quake.exception.ClientException
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "response  ="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ":"
            r2.append(r0)
            java.lang.String r0 = r14.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r15.<init>((java.lang.Integer) r1, (java.lang.String) r0)
            r15.initCause(r14)
            goto L_0x00fe
        L_0x012b:
            r14 = move-exception
            com.alipay.imobile.network.quake.exception.ClientException r15 = new com.alipay.imobile.network.quake.exception.ClientException
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r15.<init>((java.lang.Integer) r0, (java.lang.Throwable) r14)
            goto L_0x00fe
        L_0x0136:
            r14 = move-exception
            com.alipay.imobile.network.quake.Response r14 = com.alipay.imobile.network.quake.Response.error(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.imobile.network.quake.protocol.json.SignedJsonProtocolV1.deserialize(com.alipay.imobile.network.quake.Request, com.alipay.imobile.network.quake.NetworkResponse):com.alipay.imobile.network.quake.Response");
    }

    @NonNull
    public String generateCacheKey(Request request) {
        char c = '!';
        int i = length + 33;
        getMax = i % 128;
        int i2 = i % 2;
        String cacheKey = request.getCacheKey();
        if (TextUtils.isEmpty(cacheKey)) {
            c = 'M';
        }
        if (c != 'M') {
            try {
                int i3 = getMax + 105;
                length = i3 % 128;
                if (i3 % 2 == 0) {
                    Object obj = null;
                    super.hashCode();
                }
                return cacheKey;
            } catch (Exception e) {
                throw e;
            }
        } else {
            String originUrl = request.getOriginUrl();
            StringBuilder sb = new StringBuilder();
            sb.append(originUrl);
            sb.append("#");
            sb.append(request.getActionType());
            String obj2 = sb.toString();
            if (request.getParams() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj2);
                sb2.append("#");
                sb2.append(getRequestDataJson(request));
                obj2 = sb2.toString();
            }
            request.setCacheKey(obj2);
            return obj2;
        }
    }

    public String getBodyContentType() {
        StringBuilder sb = new StringBuilder("application/x-www-form-urlencoded; charset=");
        sb.append(getParamsEncoding());
        String obj = sb.toString();
        int i = length + 23;
        getMax = i % 128;
        if (i % 2 == 0) {
            return obj;
        }
        Object obj2 = null;
        super.hashCode();
        return obj;
    }

    public Map<String, String> getExternalInfo(Request request) {
        f a2 = f.a();
        HashMap hashMap = new HashMap();
        String b = this.f9365a.b();
        if (!TextUtils.isEmpty(b)) {
            hashMap.put(HeaderConstant.HEADER_KEY_DID, b);
        }
        String a3 = this.f9365a.a();
        if (!TextUtils.isEmpty(a3)) {
            int i = length + 49;
            getMax = i % 128;
            int i2 = i % 2;
            hashMap.put("clientId", a3);
        }
        hashMap.put(HeaderConstant.HEADER_KEY_UUID, UUID.randomUUID().toString());
        String i3 = a2.i();
        if (!TextUtils.isEmpty(i3)) {
            int i4 = getMax + 27;
            length = i4 % 128;
            int i5 = i4 % 2;
            hashMap.put("AppId", i3);
        }
        String l = a2.l();
        if (!TextUtils.isEmpty(l)) {
            try {
                int i6 = length + 1;
                getMax = i6 % 128;
                int i7 = i6 % 2;
                hashMap.put("version", l);
            } catch (Exception e) {
                throw e;
            }
        }
        String m = a2.m();
        if ((!TextUtils.isEmpty(m) ? '^' : 'P') == '^') {
            int i8 = getMax + 85;
            length = i8 % 128;
            int i9 = i8 % 2;
            hashMap.put(HeaderConstant.HEADER_KEY_WORKSPACE_ID, m);
        }
        String n = a2.n();
        if (!TextUtils.isEmpty(n)) {
            int i10 = getMax + 27;
            length = i10 % 128;
            if (!(i10 % 2 != 0)) {
                hashMap.put(HeaderConstant.HEADER_KEY_TENANT_ID, n);
                int i11 = 45 / 0;
            } else {
                hashMap.put(HeaderConstant.HEADER_KEY_TENANT_ID, n);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public String getParamsEncoding() {
        int i = getMax + 53;
        length = i % 128;
        return (i % 2 == 0 ? setMax(19897 >>> MotionEvent.axisFromString(""), 4 % Color.blue(0), new char[]{2, 65513, 65524, 17, 16}, true | URLUtil.isDataUrl("data:"), (Process.myPid() << 71) + 4) : setMax(145 - MotionEvent.axisFromString(""), 3 - Color.blue(0), new char[]{2, 65513, 65524, 17, 16}, true ^ URLUtil.isDataUrl("data:"), 5 - (Process.myPid() >> 22))).intern();
    }

    public String getRequestDataJson(Request request) {
        int i = length + 105;
        getMax = i % 128;
        int i2 = i % 2;
        try {
            Object params = request.getParams();
            boolean z = false;
            if (!(params == null)) {
                SerializerFeature[] serializerFeatureArr = new SerializerFeature[1];
                serializerFeatureArr[0] = SerializerFeature.DisableCircularReferenceDetect;
                String jSONString = JSON.toJSONString(params, serializerFeatureArr);
                if (!jSONString.startsWith("[")) {
                    z = true;
                }
                if (z) {
                    int i3 = getMax + 99;
                    length = i3 % 128;
                    int i4 = i3 % 2;
                    jSONString = "[".concat(String.valueOf(jSONString));
                    int i5 = getMax + 65;
                    length = i5 % 128;
                    int i6 = i5 % 2;
                }
                try {
                    if (jSONString.endsWith("]")) {
                        return jSONString;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(jSONString);
                    sb.append("]");
                    return sb.toString();
                } catch (Exception e) {
                    throw e;
                }
            } else {
                int i7 = length + 37;
                getMax = i7 % 128;
                int i8 = i7 % 2;
                return "[]";
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public byte[] serialize(Request request) throws RpcException {
        try {
            int i = length + 11;
            getMax = i % 128;
            int i2 = i % 2;
            if ((request == null ? (char) 30 : 19) != 19) {
                int i3 = length + 93;
                getMax = i3 % 128;
                return i3 % 2 != 0 ? new byte[1] : new byte[0];
            }
            SignUtil.SignInfo signInfo = null;
            if ((request instanceof RpcRequest ? 'X' : '(') != '(') {
                int i4 = getMax + 111;
                length = i4 % 128;
                int i5 = i4 % 2;
                signInfo = request.getSignInfo();
            }
            if (signInfo == null) {
                f a2 = f.a();
                signInfo = new SignUtil.SignInfo(a2.j(), a2.k());
            }
            ArrayList arrayList = new ArrayList();
            a((List<com.alipay.imobile.network.quake.a.a>) arrayList, request);
            try {
                String a3 = a(arrayList, request.getUrl(), signInfo);
                if (!TextUtils.isEmpty(a3)) {
                    arrayList.add(new com.alipay.imobile.network.quake.a.a("sign", a3));
                    int i6 = getMax + 49;
                    length = i6 % 128;
                    int i7 = i6 % 2;
                }
                return a(arrayList);
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String setMax(int i, int i2, char[] cArr, boolean z, int i3) {
        char[] cArr2 = new char[i3];
        int i4 = 0;
        while (true) {
            if ((i4 < i3 ? 'B' : ',') == ',') {
                break;
            }
            int i5 = length + 57;
            getMax = i5 % 128;
            int i6 = i5 % 2;
            cArr2[i4] = (char) (cArr[i4] + i);
            cArr2[i4] = (char) (cArr2[i4] - setMax);
            i4++;
            int i7 = getMax + 47;
            length = i7 % 128;
            int i8 = i7 % 2;
        }
        if (i2 > 0) {
            int i9 = getMax + 75;
            length = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            int i11 = i3 - i2;
            System.arraycopy(cArr3, 0, cArr2, i11, i2);
            System.arraycopy(cArr3, i2, cArr2, 0, i11);
        }
        if ((z ? '_' : '4') != '4') {
            int i12 = getMax + 15;
            length = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr4 = new char[i3];
            int i14 = 0;
            while (i14 < i3) {
                int i15 = getMax + 29;
                length = i15 % 128;
                if (i15 % 2 == 0) {
                    cArr4[i14] = cArr2[(i3 / i14) / 0];
                    i14 += 25;
                } else {
                    cArr4[i14] = cArr2[(i3 - i14) - 1];
                    i14++;
                }
            }
            cArr2 = cArr4;
        }
        return new String(cArr2);
    }
}
