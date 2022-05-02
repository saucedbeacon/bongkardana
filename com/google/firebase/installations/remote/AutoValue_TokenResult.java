package com.google.firebase.installations.remote;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.installations.remote.TokenResult;

final class AutoValue_TokenResult extends TokenResult {
    private final TokenResult.ResponseCode responseCode;
    private final String token;
    private final long tokenExpirationTimestamp;

    private AutoValue_TokenResult(@Nullable String str, long j, @Nullable TokenResult.ResponseCode responseCode2) {
        this.token = str;
        this.tokenExpirationTimestamp = j;
        this.responseCode = responseCode2;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    @NonNull
    public final long getTokenExpirationTimestamp() {
        return this.tokenExpirationTimestamp;
    }

    @Nullable
    public final TokenResult.ResponseCode getResponseCode() {
        return this.responseCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.token);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.tokenExpirationTimestamp);
        sb.append(", responseCode=");
        sb.append(this.responseCode);
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        r1 = r7.responseCode;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.firebase.installations.remote.TokenResult
            r2 = 0
            if (r1 == 0) goto L_0x0040
            com.google.firebase.installations.remote.TokenResult r8 = (com.google.firebase.installations.remote.TokenResult) r8
            java.lang.String r1 = r7.token
            if (r1 != 0) goto L_0x0016
            java.lang.String r1 = r8.getToken()
            if (r1 != 0) goto L_0x0040
            goto L_0x0020
        L_0x0016:
            java.lang.String r3 = r8.getToken()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0040
        L_0x0020:
            long r3 = r7.tokenExpirationTimestamp
            long r5 = r8.getTokenExpirationTimestamp()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0040
            com.google.firebase.installations.remote.TokenResult$ResponseCode r1 = r7.responseCode
            if (r1 != 0) goto L_0x0035
            com.google.firebase.installations.remote.TokenResult$ResponseCode r8 = r8.getResponseCode()
            if (r8 != 0) goto L_0x0040
            goto L_0x003f
        L_0x0035:
            com.google.firebase.installations.remote.TokenResult$ResponseCode r8 = r8.getResponseCode()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0040
        L_0x003f:
            return r0
        L_0x0040:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.remote.AutoValue_TokenResult.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.token;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.tokenExpirationTimestamp;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        TokenResult.ResponseCode responseCode2 = this.responseCode;
        if (responseCode2 != null) {
            i = responseCode2.hashCode();
        }
        return i2 ^ i;
    }

    public final TokenResult.Builder toBuilder() {
        return new Builder(this);
    }

    static final class Builder extends TokenResult.Builder {
        private TokenResult.ResponseCode responseCode;
        private String token;
        private Long tokenExpirationTimestamp;

        Builder() {
        }

        private Builder(TokenResult tokenResult) {
            this.token = tokenResult.getToken();
            this.tokenExpirationTimestamp = Long.valueOf(tokenResult.getTokenExpirationTimestamp());
            this.responseCode = tokenResult.getResponseCode();
        }

        public final TokenResult.Builder setToken(String str) {
            this.token = str;
            return this;
        }

        public final TokenResult.Builder setTokenExpirationTimestamp(long j) {
            this.tokenExpirationTimestamp = Long.valueOf(j);
            return this;
        }

        public final TokenResult.Builder setResponseCode(TokenResult.ResponseCode responseCode2) {
            this.responseCode = responseCode2;
            return this;
        }

        public final TokenResult build() {
            String str = "";
            if (this.tokenExpirationTimestamp == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" tokenExpirationTimestamp");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_TokenResult(this.token, this.tokenExpirationTimestamp.longValue(), this.responseCode);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }
}
