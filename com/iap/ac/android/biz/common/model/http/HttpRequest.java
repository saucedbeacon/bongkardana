package com.iap.ac.android.biz.common.model.http;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.json.JsonUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class HttpRequest implements Serializable {
    public static final int DEFAULT_TIMEOUT_MS = 30000;
    public boolean cache;
    @Nullable
    public String data;
    @Nullable
    public Map<String, String> headers;
    @Nullable
    public HttpMethod method;
    public boolean notFollowRedirects;
    public int timeoutMilliseconds;
    @NonNull
    public String url;

    public HttpRequest(@NonNull String str, @NonNull HttpMethod httpMethod, @Nullable String str2) {
        this(str, httpMethod, (Map<String, String>) null, str2);
    }

    public HttpRequest addHeader(@NonNull String str, @Nullable Object obj) {
        if (this.headers == null) {
            this.headers = new HashMap();
        }
        if (obj == null) {
            this.headers.put(str, (Object) null);
        } else {
            this.headers.put(str, String.valueOf(obj));
        }
        return this;
    }

    public HttpRequest setCache(boolean z) {
        this.cache = z;
        return this;
    }

    public String toString() {
        return JsonUtils.toJson(this);
    }

    public HttpRequest(@NonNull String str, @NonNull HttpMethod httpMethod, @Nullable Map<String, String> map, @Nullable String str2) {
        this(str, httpMethod, map, str2, 30000);
    }

    public HttpRequest(@NonNull String str, @NonNull HttpMethod httpMethod, @Nullable Map<String, String> map, @Nullable String str2, int i) {
        this.url = str;
        this.method = httpMethod;
        this.headers = map;
        this.data = str2;
        this.timeoutMilliseconds = i;
    }
}
