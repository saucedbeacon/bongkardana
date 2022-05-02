package o;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class onEmbedViewDetachedFromWebView {
    private byte[] data;
    private Map<String, List<String>> headers;
    private int statusCode;
    private String statusMessage;

    public onEmbedViewDetachedFromWebView() {
    }

    public onEmbedViewDetachedFromWebView(int i, String str, byte[] bArr, Map<String, List<String>> map) {
        this.statusCode = i;
        this.statusMessage = str;
        this.data = bArr;
        this.headers = map;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public void setStatusMessage(String str) {
        this.statusMessage = str;
    }

    public byte[] getData() {
        return this.data;
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    public Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public void setHeaders(Map<String, List<String>> map) {
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
        StringBuilder sb = new StringBuilder("HttpResponse{statusCode=");
        sb.append(this.statusCode);
        sb.append(", statusMessage='");
        sb.append(this.statusMessage);
        sb.append('\'');
        sb.append(", data=");
        sb.append(getDataString());
        sb.append(", headers=");
        sb.append(this.headers);
        sb.append('}');
        return sb.toString();
    }
}
