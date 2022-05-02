package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;

final class AutoValue_PersistedInstallationEntry extends PersistedInstallationEntry {
    private final String authToken;
    private final long expiresInSecs;
    private final String firebaseInstallationId;
    private final String fisError;
    private final String refreshToken;
    private final PersistedInstallation.RegistrationStatus registrationStatus;
    private final long tokenCreationEpochInSecs;

    private AutoValue_PersistedInstallationEntry(@Nullable String str, PersistedInstallation.RegistrationStatus registrationStatus2, @Nullable String str2, @Nullable String str3, long j, long j2, @Nullable String str4) {
        this.firebaseInstallationId = str;
        this.registrationStatus = registrationStatus2;
        this.authToken = str2;
        this.refreshToken = str3;
        this.expiresInSecs = j;
        this.tokenCreationEpochInSecs = j2;
        this.fisError = str4;
    }

    @Nullable
    public final String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    @NonNull
    public final PersistedInstallation.RegistrationStatus getRegistrationStatus() {
        return this.registrationStatus;
    }

    @Nullable
    public final String getAuthToken() {
        return this.authToken;
    }

    @Nullable
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final long getExpiresInSecs() {
        return this.expiresInSecs;
    }

    public final long getTokenCreationEpochInSecs() {
        return this.tokenCreationEpochInSecs;
    }

    @Nullable
    public final String getFisError() {
        return this.fisError;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.firebaseInstallationId);
        sb.append(", registrationStatus=");
        sb.append(this.registrationStatus);
        sb.append(", authToken=");
        sb.append(this.authToken);
        sb.append(", refreshToken=");
        sb.append(this.refreshToken);
        sb.append(", expiresInSecs=");
        sb.append(this.expiresInSecs);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.tokenCreationEpochInSecs);
        sb.append(", fisError=");
        sb.append(this.fisError);
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r7.authToken;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r1 = r7.refreshToken;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006a, code lost:
        r1 = r7.fisError;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.firebase.installations.local.PersistedInstallationEntry
            r2 = 0
            if (r1 == 0) goto L_0x0080
            com.google.firebase.installations.local.PersistedInstallationEntry r8 = (com.google.firebase.installations.local.PersistedInstallationEntry) r8
            java.lang.String r1 = r7.firebaseInstallationId
            if (r1 != 0) goto L_0x0016
            java.lang.String r1 = r8.getFirebaseInstallationId()
            if (r1 != 0) goto L_0x0080
            goto L_0x0020
        L_0x0016:
            java.lang.String r3 = r8.getFirebaseInstallationId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0080
        L_0x0020:
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r1 = r7.registrationStatus
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r3 = r8.getRegistrationStatus()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0080
            java.lang.String r1 = r7.authToken
            if (r1 != 0) goto L_0x0037
            java.lang.String r1 = r8.getAuthToken()
            if (r1 != 0) goto L_0x0080
            goto L_0x0041
        L_0x0037:
            java.lang.String r3 = r8.getAuthToken()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0080
        L_0x0041:
            java.lang.String r1 = r7.refreshToken
            if (r1 != 0) goto L_0x004c
            java.lang.String r1 = r8.getRefreshToken()
            if (r1 != 0) goto L_0x0080
            goto L_0x0056
        L_0x004c:
            java.lang.String r3 = r8.getRefreshToken()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0080
        L_0x0056:
            long r3 = r7.expiresInSecs
            long r5 = r8.getExpiresInSecs()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0080
            long r3 = r7.tokenCreationEpochInSecs
            long r5 = r8.getTokenCreationEpochInSecs()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0080
            java.lang.String r1 = r7.fisError
            if (r1 != 0) goto L_0x0075
            java.lang.String r8 = r8.getFisError()
            if (r8 != 0) goto L_0x0080
            goto L_0x007f
        L_0x0075:
            java.lang.String r8 = r8.getFisError()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0080
        L_0x007f:
            return r0
        L_0x0080:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.firebaseInstallationId;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.registrationStatus.hashCode()) * 1000003;
        String str2 = this.authToken;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.refreshToken;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.expiresInSecs;
        long j2 = this.tokenCreationEpochInSecs;
        int i2 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.fisError;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i2 ^ i;
    }

    public final PersistedInstallationEntry.Builder toBuilder() {
        return new Builder(this);
    }

    static final class Builder extends PersistedInstallationEntry.Builder {
        private String authToken;
        private Long expiresInSecs;
        private String firebaseInstallationId;
        private String fisError;
        private String refreshToken;
        private PersistedInstallation.RegistrationStatus registrationStatus;
        private Long tokenCreationEpochInSecs;

        Builder() {
        }

        private Builder(PersistedInstallationEntry persistedInstallationEntry) {
            this.firebaseInstallationId = persistedInstallationEntry.getFirebaseInstallationId();
            this.registrationStatus = persistedInstallationEntry.getRegistrationStatus();
            this.authToken = persistedInstallationEntry.getAuthToken();
            this.refreshToken = persistedInstallationEntry.getRefreshToken();
            this.expiresInSecs = Long.valueOf(persistedInstallationEntry.getExpiresInSecs());
            this.tokenCreationEpochInSecs = Long.valueOf(persistedInstallationEntry.getTokenCreationEpochInSecs());
            this.fisError = persistedInstallationEntry.getFisError();
        }

        public final PersistedInstallationEntry.Builder setFirebaseInstallationId(String str) {
            this.firebaseInstallationId = str;
            return this;
        }

        public final PersistedInstallationEntry.Builder setRegistrationStatus(PersistedInstallation.RegistrationStatus registrationStatus2) {
            if (registrationStatus2 != null) {
                this.registrationStatus = registrationStatus2;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        public final PersistedInstallationEntry.Builder setAuthToken(@Nullable String str) {
            this.authToken = str;
            return this;
        }

        public final PersistedInstallationEntry.Builder setRefreshToken(@Nullable String str) {
            this.refreshToken = str;
            return this;
        }

        public final PersistedInstallationEntry.Builder setExpiresInSecs(long j) {
            this.expiresInSecs = Long.valueOf(j);
            return this;
        }

        public final PersistedInstallationEntry.Builder setTokenCreationEpochInSecs(long j) {
            this.tokenCreationEpochInSecs = Long.valueOf(j);
            return this;
        }

        public final PersistedInstallationEntry.Builder setFisError(@Nullable String str) {
            this.fisError = str;
            return this;
        }

        public final PersistedInstallationEntry build() {
            String str = "";
            if (this.registrationStatus == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" registrationStatus");
                str = sb.toString();
            }
            if (this.expiresInSecs == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" expiresInSecs");
                str = sb2.toString();
            }
            if (this.tokenCreationEpochInSecs == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" tokenCreationEpochInSecs");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_PersistedInstallationEntry(this.firebaseInstallationId, this.registrationStatus, this.authToken, this.refreshToken, this.expiresInSecs.longValue(), this.tokenCreationEpochInSecs.longValue(), this.fisError);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }
}
