package o;

import com.google.gson.annotations.SerializedName;

class getOtp {
    @SerializedName("x-ably-capability")
    private final String channelList;
    @SerializedName("exp")
    private final long expirationAt;
    @SerializedName("iat")
    private final long issuedAt;

    public getOtp(String str, long j, long j2) {
        this.channelList = str;
        this.issuedAt = j;
        this.expirationAt = j2;
    }

    public String getChannelList() {
        return this.channelList;
    }

    public long getIssuedAt() {
        return this.issuedAt;
    }

    public long getExpirationAt() {
        return this.expirationAt;
    }
}
