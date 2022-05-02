package com.google.firebase.heartbeatinfo;

final class AutoValue_SdkHeartBeatResult extends SdkHeartBeatResult {
    private final long millis;
    private final String sdkName;

    AutoValue_SdkHeartBeatResult(String str, long j) {
        if (str != null) {
            this.sdkName = str;
            this.millis = j;
            return;
        }
        throw new NullPointerException("Null sdkName");
    }

    public final String getSdkName() {
        return this.sdkName;
    }

    public final long getMillis() {
        return this.millis;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkHeartBeatResult{sdkName=");
        sb.append(this.sdkName);
        sb.append(", millis=");
        sb.append(this.millis);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SdkHeartBeatResult) {
            SdkHeartBeatResult sdkHeartBeatResult = (SdkHeartBeatResult) obj;
            return this.sdkName.equals(sdkHeartBeatResult.getSdkName()) && this.millis == sdkHeartBeatResult.getMillis();
        }
    }

    public final int hashCode() {
        long j = this.millis;
        return ((this.sdkName.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }
}
