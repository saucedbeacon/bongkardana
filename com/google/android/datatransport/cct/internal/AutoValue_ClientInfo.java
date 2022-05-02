package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.ClientInfo;

final class AutoValue_ClientInfo extends ClientInfo {
    private final AndroidClientInfo androidClientInfo;
    private final ClientInfo.ClientType clientType;

    private AutoValue_ClientInfo(@Nullable ClientInfo.ClientType clientType2, @Nullable AndroidClientInfo androidClientInfo2) {
        this.clientType = clientType2;
        this.androidClientInfo = androidClientInfo2;
    }

    @Nullable
    public final ClientInfo.ClientType getClientType() {
        return this.clientType;
    }

    @Nullable
    public final AndroidClientInfo getAndroidClientInfo() {
        return this.androidClientInfo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientInfo{clientType=");
        sb.append(this.clientType);
        sb.append(", androidClientInfo=");
        sb.append(this.androidClientInfo);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ClientInfo) {
            ClientInfo clientInfo = (ClientInfo) obj;
            ClientInfo.ClientType clientType2 = this.clientType;
            if (clientType2 != null ? clientType2.equals(clientInfo.getClientType()) : clientInfo.getClientType() == null) {
                AndroidClientInfo androidClientInfo2 = this.androidClientInfo;
                return androidClientInfo2 != null ? androidClientInfo2.equals(clientInfo.getAndroidClientInfo()) : clientInfo.getAndroidClientInfo() == null;
            }
        }
    }

    public final int hashCode() {
        ClientInfo.ClientType clientType2 = this.clientType;
        int i = 0;
        int hashCode = ((clientType2 == null ? 0 : clientType2.hashCode()) ^ 1000003) * 1000003;
        AndroidClientInfo androidClientInfo2 = this.androidClientInfo;
        if (androidClientInfo2 != null) {
            i = androidClientInfo2.hashCode();
        }
        return hashCode ^ i;
    }

    static final class Builder extends ClientInfo.Builder {
        private AndroidClientInfo androidClientInfo;
        private ClientInfo.ClientType clientType;

        Builder() {
        }

        public final ClientInfo.Builder setClientType(@Nullable ClientInfo.ClientType clientType2) {
            this.clientType = clientType2;
            return this;
        }

        public final ClientInfo.Builder setAndroidClientInfo(@Nullable AndroidClientInfo androidClientInfo2) {
            this.androidClientInfo = androidClientInfo2;
            return this;
        }

        public final ClientInfo build() {
            return new AutoValue_ClientInfo(this.clientType, this.androidClientInfo);
        }
    }
}
