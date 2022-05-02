package io.split.android.client.service.sseclient;

import java.util.List;

public class SseJwtToken {
    private final List<String> channels;
    private final long expirationTime;
    private final long issuedAtTime;
    private final String rawJwt;

    public SseJwtToken(long j, long j2, List<String> list, String str) {
        this.issuedAtTime = j;
        this.expirationTime = j2;
        this.channels = list;
        this.rawJwt = str;
    }

    public long getExpirationTime() {
        return this.expirationTime;
    }

    public long getIssuedAtTime() {
        return this.issuedAtTime;
    }

    public List<String> getChannels() {
        return this.channels;
    }

    public String getRawJwt() {
        return this.rawJwt;
    }
}
