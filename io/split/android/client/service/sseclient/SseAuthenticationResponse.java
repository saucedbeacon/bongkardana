package io.split.android.client.service.sseclient;

import com.google.gson.annotations.SerializedName;

public class SseAuthenticationResponse {
    private boolean isClientError = false;
    @SerializedName("pushEnabled")
    private boolean isStreamingEnabled;
    private String token;

    public SseAuthenticationResponse() {
    }

    public SseAuthenticationResponse(boolean z) {
        this.isClientError = z;
    }

    public boolean isClientError() {
        return this.isClientError;
    }

    public boolean isStreamingEnabled() {
        return this.isStreamingEnabled;
    }

    public String getToken() {
        return this.token;
    }
}
