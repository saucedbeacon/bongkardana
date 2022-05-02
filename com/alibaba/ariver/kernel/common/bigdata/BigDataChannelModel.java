package com.alibaba.ariver.kernel.common.bigdata;

import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class BigDataChannelModel {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f10091a = new AtomicInteger(0);
    private String b;
    private String c;
    private String d;
    private int e;
    private int f;
    private int g = 0;
    private JSONObject h;
    private boolean i = true;
    private LinkedBlockingQueue<JSONObject> j;
    private IBigDataConsumerReadyCallback k;

    BigDataChannelModel() {
    }

    BigDataChannelModel(String str, int i2, JSONObject jSONObject) {
        this.b = str;
        this.g = i2;
        this.h = jSONObject;
        if (i2 > 0) {
            this.j = new LinkedBlockingQueue<>();
        }
    }

    /* access modifiers changed from: package-private */
    public String getChannelId() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public void setChannelId(String str) {
        this.b = str;
    }

    public String getViewId() {
        return this.d;
    }

    public void setViewId(String str) {
        this.d = str;
    }

    public String getWorkerId() {
        return this.c;
    }

    public void setWorkerId(String str) {
        this.c = str;
    }

    public int getBizType() {
        return this.e;
    }

    public void setBizType(int i2) {
        this.e = i2;
    }

    /* access modifiers changed from: package-private */
    public int getBufferSize() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public void setBufferSize(int i2) {
        this.g = i2;
    }

    /* access modifiers changed from: package-private */
    public int getPolicy() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public void setPolicy(int i2) {
        this.f = i2;
    }

    public boolean isConsumerReady() {
        return this.i;
    }

    public void setConsumerReady(boolean z) {
        this.i = z;
    }

    /* access modifiers changed from: package-private */
    public IBigDataConsumerReadyCallback getCallback() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public void setCallback(IBigDataConsumerReadyCallback iBigDataConsumerReadyCallback) {
        this.k = iBigDataConsumerReadyCallback;
    }

    /* access modifiers changed from: package-private */
    public void enqueueBuffer(JSONObject jSONObject) {
        if (this.f10091a.get() >= 10) {
            RVLogger.w("AriverKernel:BigDataChannelModel", "buffer size limit : 10");
            return;
        }
        try {
            this.j.put(jSONObject);
            this.f10091a.incrementAndGet();
        } catch (Throwable th) {
            RVLogger.e("AriverKernel:BigDataChannelModel", "enqueueBuffer exception, ", th);
        }
    }

    /* access modifiers changed from: package-private */
    public JSONObject getBufferedData() {
        LinkedBlockingQueue<JSONObject> linkedBlockingQueue = this.j;
        if (linkedBlockingQueue != null && !linkedBlockingQueue.isEmpty()) {
            try {
                this.f10091a.decrementAndGet();
                return this.j.take();
            } catch (Throwable th) {
                RVLogger.e("AriverKernel:BigDataChannelModel", "getBufferedData exception, ", th);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void releaseBuffer() {
        if (this.j != null) {
            this.h.clear();
        }
        this.j = null;
    }
}
