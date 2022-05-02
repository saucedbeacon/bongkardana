package com.alibaba.ariver.kernel.common.network.http;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class RVHttpRequest {
    public static final String APP_ID = "appId";
    public static final String PLUGIN_ID = "pluginId";
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public String f10106a;
    /* access modifiers changed from: private */
    public String b;
    /* access modifiers changed from: private */
    public Map<String, String> c;
    /* access modifiers changed from: private */
    public byte[] d;
    /* access modifiers changed from: private */
    public long e;
    /* access modifiers changed from: private */
    public boolean f;
    /* access modifiers changed from: private */
    public boolean g;
    /* access modifiers changed from: private */
    public boolean h;
    private Map<String, String> i;

    public static Builder newBuilder() {
        return new Builder();
    }

    private RVHttpRequest() {
        this.i = new HashMap();
    }

    public String getUrl() {
        return this.f10106a;
    }

    public String getMethod() {
        if (TextUtils.isEmpty(this.b)) {
            return "GET";
        }
        return this.b;
    }

    public Map<String, String> getHeaders() {
        return this.c;
    }

    public byte[] getRequestData() {
        return this.d;
    }

    public long getTimeout() {
        return this.e;
    }

    public boolean isUseSpdy() {
        return this.f;
    }

    public boolean isUseCache() {
        return this.h;
    }

    public boolean isPackageRequest() {
        return this.g;
    }

    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private RVHttpRequest f10107a = new RVHttpRequest();

        public Builder url(String str) {
            String unused = this.f10107a.f10106a = str;
            return this;
        }

        public Builder method(String str) {
            String unused = this.f10107a.b = str;
            return this;
        }

        public Builder headers(@NonNull Map<String, String> map) {
            Map unused = this.f10107a.c = map;
            return this;
        }

        public Builder requestData(byte[] bArr) {
            byte[] unused = this.f10107a.d = bArr;
            return this;
        }

        public Builder timeout(long j) {
            long unused = this.f10107a.e = j;
            return this;
        }

        public Builder useSpdy(boolean z) {
            boolean unused = this.f10107a.f = z;
            return this;
        }

        public Builder useCache(boolean z) {
            boolean unused = this.f10107a.h = z;
            return this;
        }

        public Builder setPackageRequest(boolean z) {
            boolean unused = this.f10107a.g = z;
            return this;
        }

        public RVHttpRequest build() {
            return this.f10107a;
        }
    }

    public void addExtParams(String str, String str2) {
        if (this.i == null) {
            this.i = new HashMap();
        }
        this.i.put(str, str2);
    }

    public String getExtParams(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-792475137, oncanceled);
            onCancelLoad.getMin(-792475137, oncanceled);
        }
        Map<String, String> map = this.i;
        return (map == null || !map.containsKey(str)) ? "" : this.i.get(str);
    }
}
