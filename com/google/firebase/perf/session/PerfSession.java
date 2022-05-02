package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.PerfSession;
import com.google.firebase.perf.v1.SessionVerbosity;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new Parcelable.Creator<PerfSession>() {
        public PerfSession createFromParcel(@NonNull Parcel parcel) {
            return new PerfSession(parcel);
        }

        public PerfSession[] newArray(int i) {
            return new PerfSession[i];
        }
    };
    private final Timer creationTime;
    private boolean isGaugeAndEventCollectionEnabled;
    private final String sessionId;

    public int describeContents() {
        return 0;
    }

    public static PerfSession create() {
        PerfSession perfSession = new PerfSession(UUID.randomUUID().toString().replaceAll("\\-", ""), new Clock());
        perfSession.setGaugeAndEventCollectionEnabled(shouldCollectGaugesAndEvents());
        return perfSession;
    }

    @VisibleForTesting(otherwise = 3)
    public PerfSession(String str, Clock clock) {
        this.isGaugeAndEventCollectionEnabled = false;
        this.sessionId = str;
        this.creationTime = clock.getTime();
    }

    private PerfSession(@NonNull Parcel parcel) {
        boolean z = false;
        this.isGaugeAndEventCollectionEnabled = false;
        this.sessionId = parcel.readString();
        this.isGaugeAndEventCollectionEnabled = parcel.readByte() != 0 ? true : z;
        this.creationTime = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }

    public String sessionId() {
        return this.sessionId;
    }

    public Timer getTimer() {
        return this.creationTime;
    }

    public void setGaugeAndEventCollectionEnabled(boolean z) {
        this.isGaugeAndEventCollectionEnabled = z;
    }

    public boolean isGaugeAndEventCollectionEnabled() {
        return this.isGaugeAndEventCollectionEnabled;
    }

    public boolean isVerbose() {
        return this.isGaugeAndEventCollectionEnabled;
    }

    @VisibleForTesting
    static boolean isVerbose(@NonNull com.google.firebase.perf.v1.PerfSession perfSession) {
        for (SessionVerbosity sessionVerbosity : perfSession.getSessionVerbosityList()) {
            if (sessionVerbosity == SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS) {
                return true;
            }
        }
        return false;
    }

    public boolean isExpired() {
        return TimeUnit.MICROSECONDS.toMinutes(this.creationTime.getDurationMicros()) > ConfigResolver.getInstance().getSessionsMaxDurationMinutes();
    }

    public com.google.firebase.perf.v1.PerfSession build() {
        PerfSession.Builder sessionId2 = com.google.firebase.perf.v1.PerfSession.newBuilder().setSessionId(this.sessionId);
        if (this.isGaugeAndEventCollectionEnabled) {
            sessionId2.addSessionVerbosity(SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS);
        }
        return (com.google.firebase.perf.v1.PerfSession) sessionId2.build();
    }

    @Nullable
    public static com.google.firebase.perf.v1.PerfSession[] buildAndSort(@NonNull List<PerfSession> list) {
        if (list.isEmpty()) {
            return null;
        }
        com.google.firebase.perf.v1.PerfSession[] perfSessionArr = new com.google.firebase.perf.v1.PerfSession[list.size()];
        com.google.firebase.perf.v1.PerfSession build = list.get(0).build();
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            com.google.firebase.perf.v1.PerfSession build2 = list.get(i).build();
            if (z || !list.get(i).isVerbose()) {
                perfSessionArr[i] = build2;
            } else {
                perfSessionArr[0] = build2;
                perfSessionArr[i] = build;
                z = true;
            }
        }
        if (!z) {
            perfSessionArr[0] = build;
        }
        return perfSessionArr;
    }

    public static boolean shouldCollectGaugesAndEvents() {
        ConfigResolver instance = ConfigResolver.getInstance();
        return instance.isPerformanceMonitoringEnabled() && Math.random() < ((double) instance.getSessionsSamplingRate());
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(this.sessionId);
        parcel.writeByte(this.isGaugeAndEventCollectionEnabled ? (byte) 1 : 0);
        parcel.writeParcelable(this.creationTime, 0);
    }
}
