package com.alipay.imobile.network.quake;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.log.MonitorWrapper;
import com.alipay.imobile.network.quake.cache.Cache;
import com.alipay.imobile.network.quake.protocol.Protocol;
import com.alipay.imobile.network.quake.transport.Transporter;
import com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant;
import com.alipay.imobile.network.quake.transport.strategy.DefaultRetryPolicy;
import com.alipay.imobile.network.quake.transport.strategy.RetryPolicy;
import com.alipay.imobile.network.quake.util.SignUtil;
import com.alipay.imobile.network.quake.util.f;
import com.alipay.mobile.common.rpc.RpcException;
import com.iap.ac.android.rpc.constant.RpcLogEvent;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Request implements Comparable<Request> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final f f9341a;
    private String b;
    private Type c;
    private String d;
    private ErrorListener e;
    private Listener f;
    private CheckLoginListener g;
    private a h;
    private Integer i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    protected final String mAction;
    private RetryPolicy n;

    /* renamed from: o  reason: collision with root package name */
    private Cache.Entry f9342o;
    private Object p;
    private Object q;
    private String r;
    private String s;
    private String t;
    private Map<String, String> u;
    private String v;
    private SignUtil.SignInfo w;

    public interface CheckLoginListener {
        void checkLogin(Request request) throws RpcException;
    }

    public interface ErrorListener {
        void onErrorResponse(RpcException rpcException);
    }

    public interface Listener {
        void onResponse(Object obj);
    }

    public enum Priority {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    interface a {
        void a(Request request);
    }

    public Request(String str, Type type, Listener listener, ErrorListener errorListener) {
        String str2 = null;
        this.f9341a = LoggerWrapper.isDebuggable() ? new f() : null;
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.f9342o = null;
        this.q = null;
        this.u = new HashMap();
        this.v = null;
        this.b = str;
        this.c = type == null ? Object[].class.getComponentType() : type;
        this.f = listener;
        this.e = errorListener;
        f a2 = f.a();
        setRetryPolicy(new DefaultRetryPolicy());
        setProtocolName(a2.f());
        setCacheName(a2.g());
        setTransportName(a2.h());
        try {
            str2 = new URL(str).getPath();
        } catch (MalformedURLException unused) {
        }
        this.mAction = str2;
    }

    private String a() {
        return getProtocol().generateCacheKey(this);
    }

    public void addExternalInfo(String str, String str2) {
        this.u.put(str, str2);
    }

    public void addExternalInfo(Map<String, String> map) {
        if (map != null) {
            this.u.putAll(map);
        }
    }

    public void addMarker(String str) {
        if (LoggerWrapper.isDebuggable()) {
            this.f9341a.a(str, Thread.currentThread().getId());
        }
    }

    public void addRpcTraceId(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        String str = this.u.get(HeaderConstant.HEADER_KEY_DID);
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        String str2 = this.u.get("ts");
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
        }
        map.put(RpcLogEvent.PARAM_KEY_RPC_TRACE_ID, sb.toString());
    }

    public void addSofaId(Map<String, String> map) {
        String str = this.u.get("Mgw-TraceId");
        if (!TextUtils.isEmpty(str)) {
            map.put("sofa_id", str);
        }
    }

    public void cancel() {
        this.k = true;
    }

    public void checkLogin() {
        CheckLoginListener checkLoginListener = this.g;
        if (checkLoginListener != null) {
            checkLoginListener.checkLogin(this);
        }
    }

    public int compareTo(@NonNull Request request) {
        Priority priority = getPriority();
        Priority priority2 = request.getPriority();
        return priority == priority2 ? this.i.intValue() - request.i.intValue() : priority2.ordinal() - priority.ordinal();
    }

    public Request compress() {
        this.l = true;
        return this;
    }

    public void deliverError(RpcException rpcException) {
        LoggerWrapper.e(Quake.TAG, LoggerWrapper.buildMessage("error[code=%s, msg=%s] need to be handle ", Integer.valueOf(rpcException.getCode()), rpcException.getMessage()));
        ErrorListener errorListener = this.e;
        if (errorListener != null) {
            errorListener.onErrorResponse(rpcException);
        }
        HashMap hashMap = new HashMap(5);
        hashMap.put("code", String.valueOf(rpcException.getCode()));
        hashMap.put("message", rpcException.getMessage());
        hashMap.put(RpcLogEvent.PARAM_KEY_OPERATION_TYPE, getActionType());
        addSofaId(hashMap);
        addRpcTraceId(hashMap);
        MonitorWrapper.behaviour(RpcLogEvent.RPC_NET_ERROR, hashMap);
        HashMap hashMap2 = new HashMap(4);
        hashMap2.put("result", "F");
        hashMap2.put(RpcLogEvent.PARAM_KEY_OPERATION_TYPE, getActionType());
        addSofaId(hashMap2);
        addRpcTraceId(hashMap2);
        MonitorWrapper.behaviour(RpcLogEvent.RPC_NET_RESULT, hashMap2);
    }

    /* access modifiers changed from: protected */
    public void deliverResponse(Object obj) {
        Listener listener = this.f;
        if (listener != null) {
            listener.onResponse(obj);
        }
        HashMap hashMap = new HashMap(4);
        hashMap.put("result", DiskFormatter.TB);
        hashMap.put(RpcLogEvent.PARAM_KEY_OPERATION_TYPE, getActionType());
        addSofaId(hashMap);
        addRpcTraceId(hashMap);
        MonitorWrapper.behaviour(RpcLogEvent.RPC_NET_RESULT, hashMap);
    }

    /* access modifiers changed from: package-private */
    public void finish(final String str) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.a(this);
            onFinish();
        }
        if (LoggerWrapper.isDebuggable()) {
            final long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        Request.this.f9341a.a(str, id2);
                        Request.this.f9341a.a(toString());
                    }
                });
                return;
            }
            this.f9341a.a(str, id2);
            this.f9341a.a(toString());
        }
    }

    public String getActionType() {
        return this.mAction;
    }

    public final Cache getCache() throws RpcException {
        return f.a().d(this.s);
    }

    public Cache.Entry getCacheEntry() {
        return this.f9342o;
    }

    public String getCacheKey() {
        return this.v;
    }

    public final String getCacheName() {
        return this.s;
    }

    @Nullable
    public final Map<String, String> getExternalInfo() {
        return this.u;
    }

    public String getOriginUrl() {
        return this.b;
    }

    @Nullable
    public Object getParams() {
        return this.q;
    }

    public Priority getPriority() {
        return Priority.NORMAL;
    }

    public final Protocol getProtocol() throws RpcException {
        return f.a().b(this.r);
    }

    public final String getProtocolName() {
        return this.r;
    }

    public Type getResponseType() {
        return this.c;
    }

    public RetryPolicy getRetryPolicy() {
        return this.n;
    }

    public final int getSequence() {
        Integer num = this.i;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    @Nullable
    public SignUtil.SignInfo getSignInfo() {
        return this.w;
    }

    public Object getTag() {
        return this.p;
    }

    public final int getTimeoutMs() {
        return this.n.getCurrentTimeout();
    }

    public final Transporter getTransport() throws RpcException {
        return f.a().f(this.t);
    }

    public final String getTransportName() {
        return this.t;
    }

    public String getUrl() {
        String str = this.d;
        return str != null ? str : this.b;
    }

    public boolean hasHadResponseDelivered() {
        return this.m;
    }

    public boolean isCanceled() {
        return this.k;
    }

    public boolean isCompressed() {
        return this.l;
    }

    public void markDelivered() {
        this.m = true;
    }

    /* access modifiers changed from: protected */
    public void onFinish() {
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.f9342o = null;
        this.n = null;
        this.q = null;
        this.u.clear();
    }

    /* access modifiers changed from: protected */
    public RpcException parseNetworkError(RpcException rpcException) {
        return rpcException;
    }

    public Request setCacheEntry(Cache.Entry entry) {
        this.f9342o = entry;
        return this;
    }

    public void setCacheKey(String str) {
        this.v = str;
    }

    public final void setCacheName(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.s = str;
        }
    }

    public void setCheckLoginListener(CheckLoginListener checkLoginListener) {
        this.g = checkLoginListener;
    }

    /* access modifiers changed from: package-private */
    public void setFinishListener(a aVar) {
        this.h = aVar;
    }

    public void setOriginUrl(String str) {
        this.b = str;
    }

    public void setParams(Object obj) {
        this.q = obj;
    }

    public final void setProtocolName(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.r = str;
        }
    }

    public void setRedirectUrl(String str) {
        this.d = str;
    }

    public void setRetryPolicy(RetryPolicy retryPolicy) {
        this.n = retryPolicy;
    }

    public final Request setSequence(int i2) {
        this.i = Integer.valueOf(i2);
        return this;
    }

    public final Request setShouldCache(boolean z) {
        this.j = z;
        return this;
    }

    public void setSignInfo(@Nullable SignUtil.SignInfo signInfo) {
        this.w = signInfo;
    }

    public Request setTag(Object obj) {
        this.p = obj;
        return this;
    }

    public final void setTransportName(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.t = str;
        }
    }

    public final boolean shouldCache() {
        return this.j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.k ? "[X] " : "[ ] ");
        sb.append(a());
        sb.append(" ");
        sb.append(getPriority());
        sb.append(" ");
        sb.append(this.i);
        return sb.toString();
    }
}
