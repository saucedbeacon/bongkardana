package io.split.android.client.service.sseclient.notifications;

public class StreamingError {
    private final int code;
    private final String message;
    private final int statusCode;

    public StreamingError(String str, int i, int i2) {
        this.message = str;
        this.code = i;
        this.statusCode = i2;
    }

    public String getMessage() {
        return this.message;
    }

    public int getCode() {
        return this.code;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public boolean shouldBeIgnored() {
        int i = this.code;
        return i < 40000 || i > 49999;
    }

    public boolean isRetryable() {
        int i = this.code;
        return i >= 40140 && i <= 40149;
    }
}
