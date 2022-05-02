package com.alipay.plus.android.transport.sdk;

import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSON;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class HttpResponse implements Serializable {
    @Nullable
    public final byte[] data;
    @Nullable
    public final Map<String, List<String>> headers;
    public final int statusCode;
    @Nullable
    public final String statusMessage;

    public HttpResponse(int i, @Nullable String str, @Nullable byte[] bArr, @Nullable Map<String, List<String>> map) {
        this.statusCode = i;
        this.statusMessage = str;
        this.data = bArr;
        this.headers = map;
    }

    @Nullable
    private String getDataString() {
        if (this.data == null) {
            return null;
        }
        try {
            return new String(this.data);
        } catch (Exception unused) {
            return Arrays.toString(this.data);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{\"statusCode\": ");
        sb.append(this.statusCode);
        sb.append(",\"statusMessage\": \"");
        sb.append(this.statusMessage);
        sb.append("\",\"data\": ");
        sb.append(getDataString());
        sb.append(",\"headers\": ");
        sb.append(JSON.toJSONString(this.headers));
        sb.append("}");
        return sb.toString();
    }
}
