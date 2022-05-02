package com.alibaba.griver.core.worker;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.api.H5CallBack;
import java.util.ArrayList;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public abstract class H5Worker {

    /* renamed from: a  reason: collision with root package name */
    private final Object f10394a = new Object();
    protected String b;
    protected String c;
    protected boolean d = false;
    protected boolean e = false;
    protected Bundle f;
    protected boolean g = false;
    protected boolean h = false;
    protected String i = null;
    protected List<WorkerReadyListener> j;
    protected List<RenderReadyListener> k;

    public interface RenderReadyListener {
        void onRenderReady();
    }

    public interface WorkerReadyListener {
        void onWorkerReady();
    }

    public abstract void a(String str, String str2, String str3, H5CallBack h5CallBack);

    /* access modifiers changed from: protected */
    public abstract String g();

    /* access modifiers changed from: protected */
    public abstract void h();

    public void a(String str) {
        this.b = str;
    }

    public void b(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-2089632271, oncanceled);
            onCancelLoad.getMin(-2089632271, oncanceled);
        }
        this.c = str;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.i;
    }

    public boolean e() {
        return this.e;
    }

    public void a(Bundle bundle) {
        this.f = BundleUtils.clone(bundle);
    }

    public boolean f() {
        return this.h;
    }

    public void b() {
        RVLogger.d(g(), "onAlipayJSBridgeReady");
        this.g = true;
        h();
    }

    /* access modifiers changed from: protected */
    public void i() {
        List<WorkerReadyListener> list;
        RVLogger.e(g(), "setWorkerReady");
        synchronized (this.f10394a) {
            this.d = true;
            list = this.j;
            this.j = null;
        }
        if (list != null) {
            for (WorkerReadyListener onWorkerReady : list) {
                onWorkerReady.onWorkerReady();
            }
            list.clear();
        }
    }

    public void j() {
        List<RenderReadyListener> list;
        RVLogger.e(g(), "setRenderReady");
        synchronized (this.f10394a) {
            this.e = true;
            list = this.k;
            this.k = null;
        }
        if (list != null) {
            for (RenderReadyListener onRenderReady : list) {
                onRenderReady.onRenderReady();
            }
            list.clear();
        }
    }

    public void a(WorkerReadyListener workerReadyListener) {
        synchronized (this.f10394a) {
            if (this.j == null) {
                this.j = new ArrayList();
            }
            if (workerReadyListener != null && !this.j.contains(workerReadyListener)) {
                this.j.add(workerReadyListener);
            }
        }
    }

    public void a(RenderReadyListener renderReadyListener) {
        synchronized (this.f10394a) {
            if (this.k == null) {
                this.k = new ArrayList();
            }
            if (renderReadyListener != null && !this.k.contains(renderReadyListener)) {
                this.k.add(renderReadyListener);
            }
        }
    }

    public void k() {
        synchronized (this.f10394a) {
            this.h = true;
            if (this.j != null) {
                this.j.clear();
            }
            if (this.k != null) {
                this.k.clear();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(@Nullable JSONObject jSONObject, String str, String str2, H5CallBack h5CallBack) {
        if (h5CallBack != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            if (TextUtils.isEmpty(str)) {
                str = this.c;
            }
            jSONObject.put("appId", (Object) str);
            jSONObject.put("result", (Object) "0");
            if (TextUtils.isEmpty(str2)) {
                StringBuilder sb = new StringBuilder("");
                sb.append(System.currentTimeMillis());
                str2 = sb.toString();
            }
            jSONObject.put("messageId", (Object) str2);
            h5CallBack.onCallBack(jSONObject);
        }
    }

    /* access modifiers changed from: protected */
    public void a(String str, String str2, H5CallBack h5CallBack) {
        a((JSONObject) null, str, str2, h5CallBack);
    }

    public void a(String str, String str2, JSONObject jSONObject) {
        a(str, str2, jSONObject, (H5CallBack) null);
    }

    public void a(String str, String str2, JSONObject jSONObject, H5CallBack h5CallBack) {
        a(str, str2, jSONObject == null ? "{}" : jSONObject.toJSONString(), h5CallBack);
    }
}
