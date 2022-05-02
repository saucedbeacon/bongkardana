package com.google.firebase.perf.metrics;

import androidx.annotation.NonNull;
import com.google.firebase.perf.v1.PerfSession;
import com.google.firebase.perf.v1.TraceMetric;
import java.util.Arrays;
import java.util.List;

class TraceMetricBuilder {
    private final Trace trace;

    TraceMetricBuilder(@NonNull Trace trace2) {
        this.trace = trace2;
    }

    /* access modifiers changed from: package-private */
    public TraceMetric build() {
        TraceMetric.Builder durationUs = TraceMetric.newBuilder().setName(this.trace.getName()).setClientStartTimeUs(this.trace.getStartTime().getMicros()).setDurationUs(this.trace.getStartTime().getDurationMicros(this.trace.getEndTime()));
        for (Counter next : this.trace.getCounters().values()) {
            durationUs.putCounters(next.getName(), next.getCount());
        }
        List<Trace> subtraces = this.trace.getSubtraces();
        if (!subtraces.isEmpty()) {
            for (Trace traceMetricBuilder : subtraces) {
                durationUs.addSubtraces(new TraceMetricBuilder(traceMetricBuilder).build());
            }
        }
        durationUs.putAllCustomAttributes(this.trace.getAttributes());
        PerfSession[] buildAndSort = com.google.firebase.perf.session.PerfSession.buildAndSort(this.trace.getSessions());
        if (buildAndSort != null) {
            durationUs.addAllPerfSessions(Arrays.asList(buildAndSort));
        }
        return (TraceMetric) durationUs.build();
    }
}
