package o;

import androidx.annotation.NonNull;
import com.google.common.base.Preconditions;

public class getNoCaptchaComp {
    private static final String AUTH_SERVICE_ENDPOINT = "https://auth.split.io/api";
    private static final String EVENTS_ENDPOINT = "https://events.split.io/api";
    private static final String SDK_ENDPOINT = "https://sdk.split.io/api";
    private static final String STREAMING_SERVICE_ENDPOINT = "https://streaming.split.io/sse";
    private String mAuthServiceEndpoint;
    private String mEventsEndpoint;
    private String mSdkEndpoint;
    private String mStreamingServiceEndpoint;

    private getNoCaptchaComp() {
        this.mSdkEndpoint = SDK_ENDPOINT;
        this.mEventsEndpoint = EVENTS_ENDPOINT;
        this.mAuthServiceEndpoint = AUTH_SERVICE_ENDPOINT;
        this.mStreamingServiceEndpoint = STREAMING_SERVICE_ENDPOINT;
    }

    public String getSdkEndpoint() {
        return this.mSdkEndpoint;
    }

    /* access modifiers changed from: private */
    public void setSdkEndpoint(String str) {
        this.mSdkEndpoint = str;
    }

    public String getEventsEndpoint() {
        return this.mEventsEndpoint;
    }

    /* access modifiers changed from: private */
    public void setEventsEndpoint(String str) {
        this.mEventsEndpoint = str;
    }

    public String getAuthServiceEndpoint() {
        return this.mAuthServiceEndpoint;
    }

    /* access modifiers changed from: private */
    public void setAuthServiceEndpoint(String str) {
        this.mAuthServiceEndpoint = str;
    }

    public String getStreamingServiceEndpoint() {
        return this.mStreamingServiceEndpoint;
    }

    /* access modifiers changed from: private */
    public void setStreamingServiceEndpoint(String str) {
        this.mStreamingServiceEndpoint = str;
    }

    public static length builder() {
        return new length();
    }

    public static class length {
        getNoCaptchaComp mServiceEndpoints = new getNoCaptchaComp();

        protected length() {
        }

        public length apiEndpoint(@NonNull String str) {
            this.mServiceEndpoints.setSdkEndpoint((String) Preconditions.checkNotNull(str));
            return this;
        }

        public length eventsEndpoint(@NonNull String str) {
            this.mServiceEndpoints.setEventsEndpoint((String) Preconditions.checkNotNull(str));
            return this;
        }

        public length sseAuthServiceEndpoint(@NonNull String str) {
            this.mServiceEndpoints.setAuthServiceEndpoint((String) Preconditions.checkNotNull(str));
            return this;
        }

        public length streamingServiceEndpoint(@NonNull String str) {
            this.mServiceEndpoints.setStreamingServiceEndpoint((String) Preconditions.checkNotNull(str));
            return this;
        }

        public getNoCaptchaComp build() {
            return this.mServiceEndpoints;
        }
    }
}
