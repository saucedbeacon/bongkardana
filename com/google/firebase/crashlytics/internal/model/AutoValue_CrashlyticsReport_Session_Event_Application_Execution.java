package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution extends CrashlyticsReport.Session.Event.Application.Execution {
    private final ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> binaries;
    private final CrashlyticsReport.Session.Event.Application.Execution.Exception exception;
    private final CrashlyticsReport.Session.Event.Application.Execution.Signal signal;
    private final ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread> threads;

    private AutoValue_CrashlyticsReport_Session_Event_Application_Execution(ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread> immutableList, CrashlyticsReport.Session.Event.Application.Execution.Exception exception2, CrashlyticsReport.Session.Event.Application.Execution.Signal signal2, ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> immutableList2) {
        this.threads = immutableList;
        this.exception = exception2;
        this.signal = signal2;
        this.binaries = immutableList2;
    }

    @NonNull
    public final ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread> getThreads() {
        return this.threads;
    }

    @NonNull
    public final CrashlyticsReport.Session.Event.Application.Execution.Exception getException() {
        return this.exception;
    }

    @NonNull
    public final CrashlyticsReport.Session.Event.Application.Execution.Signal getSignal() {
        return this.signal;
    }

    @NonNull
    public final ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> getBinaries() {
        return this.binaries;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Execution{threads=");
        sb.append(this.threads);
        sb.append(", exception=");
        sb.append(this.exception);
        sb.append(", signal=");
        sb.append(this.signal);
        sb.append(", binaries=");
        sb.append(this.binaries);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Application.Execution) {
            CrashlyticsReport.Session.Event.Application.Execution execution = (CrashlyticsReport.Session.Event.Application.Execution) obj;
            return this.threads.equals(execution.getThreads()) && this.exception.equals(execution.getException()) && this.signal.equals(execution.getSignal()) && this.binaries.equals(execution.getBinaries());
        }
    }

    public final int hashCode() {
        return ((((((this.threads.hashCode() ^ 1000003) * 1000003) ^ this.exception.hashCode()) * 1000003) ^ this.signal.hashCode()) * 1000003) ^ this.binaries.hashCode();
    }

    static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Builder {
        private ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> binaries;
        private CrashlyticsReport.Session.Event.Application.Execution.Exception exception;
        private CrashlyticsReport.Session.Event.Application.Execution.Signal signal;
        private ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread> threads;

        Builder() {
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.Builder setThreads(ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread> immutableList) {
            if (immutableList != null) {
                this.threads = immutableList;
                return this;
            }
            throw new NullPointerException("Null threads");
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.Builder setException(CrashlyticsReport.Session.Event.Application.Execution.Exception exception2) {
            if (exception2 != null) {
                this.exception = exception2;
                return this;
            }
            throw new NullPointerException("Null exception");
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.Builder setSignal(CrashlyticsReport.Session.Event.Application.Execution.Signal signal2) {
            if (signal2 != null) {
                this.signal = signal2;
                return this;
            }
            throw new NullPointerException("Null signal");
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.Builder setBinaries(ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> immutableList) {
            if (immutableList != null) {
                this.binaries = immutableList;
                return this;
            }
            throw new NullPointerException("Null binaries");
        }

        public final CrashlyticsReport.Session.Event.Application.Execution build() {
            String str = "";
            if (this.threads == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" threads");
                str = sb.toString();
            }
            if (this.exception == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" exception");
                str = sb2.toString();
            }
            if (this.signal == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" signal");
                str = sb3.toString();
            }
            if (this.binaries == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" binaries");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution(this.threads, this.exception, this.signal, this.binaries);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }
}
