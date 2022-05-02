package com.iap.ac.android.biz.common.model.http;

import androidx.annotation.Nullable;
import com.iap.ac.android.a.a;
import com.iap.ac.android.common.json.JsonUtils;
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
        byte[] bArr = this.data;
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr);
        } catch (Exception unused) {
            return Arrays.toString(this.data);
        }
    }

    public String toString() {
        StringBuilder a2 = a.a("{\"statusCode\": ");
        a2.append(this.statusCode);
        a2.append(",\"statusMessage\": \"");
        a2.append(this.statusMessage);
        a2.append("\",\"data\": ");
        a2.append(getDataString());
        a2.append(",\"headers\": ");
        a2.append(JsonUtils.toJson(this.headers));
        a2.append("}");
        return a2.toString();
    }
}
