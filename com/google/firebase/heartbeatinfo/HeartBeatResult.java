package com.google.firebase.heartbeatinfo;

import com.google.auto.value.AutoValue;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;

@AutoValue
public abstract class HeartBeatResult {
    public abstract HeartBeatInfo.HeartBeat getHeartBeat();

    public abstract long getMillis();

    public abstract String getSdkName();

    public static HeartBeatResult create(String str, long j, HeartBeatInfo.HeartBeat heartBeat) {
        return new AutoValue_HeartBeatResult(str, j, heartBeat);
    }
}
