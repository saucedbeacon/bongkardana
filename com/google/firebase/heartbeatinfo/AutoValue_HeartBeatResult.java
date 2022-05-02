package com.google.firebase.heartbeatinfo;

import com.google.firebase.heartbeatinfo.HeartBeatInfo;

final class AutoValue_HeartBeatResult extends HeartBeatResult {
    private final HeartBeatInfo.HeartBeat heartBeat;
    private final long millis;
    private final String sdkName;

    AutoValue_HeartBeatResult(String str, long j, HeartBeatInfo.HeartBeat heartBeat2) {
        if (str != null) {
            this.sdkName = str;
            this.millis = j;
            if (heartBeat2 != null) {
                this.heartBeat = heartBeat2;
                return;
            }
            throw new NullPointerException("Null heartBeat");
        }
        throw new NullPointerException("Null sdkName");
    }

    public final String getSdkName() {
        return this.sdkName;
    }

    public final long getMillis() {
        return this.millis;
    }

    public final HeartBeatInfo.HeartBeat getHeartBeat() {
        return this.heartBeat;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeartBeatResult{sdkName=");
        sb.append(this.sdkName);
        sb.append(", millis=");
        sb.append(this.millis);
        sb.append(", heartBeat=");
        sb.append(this.heartBeat);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof HeartBeatResult) {
            HeartBeatResult heartBeatResult = (HeartBeatResult) obj;
            return this.sdkName.equals(heartBeatResult.getSdkName()) && this.millis == heartBeatResult.getMillis() && this.heartBeat.equals(heartBeatResult.getHeartBeat());
        }
    }

    public final int hashCode() {
        long j = this.millis;
        return ((((this.sdkName.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.heartBeat.hashCode();
    }
}
