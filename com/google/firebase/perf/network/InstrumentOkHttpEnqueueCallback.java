package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import o.Draft_76;
import o.InvalidDataException;
import o.InvalidHandshakeException;
import o.checkAlloc;
import o.getRole;

public class InstrumentOkHttpEnqueueCallback implements getRole {
    private final getRole callback;
    private final NetworkRequestMetricBuilder networkMetricBuilder;
    private final long startTimeMicros;
    private final Timer timer;

    public InstrumentOkHttpEnqueueCallback(getRole getrole, TransportManager transportManager, Timer timer2, long j) {
        this.callback = getrole;
        this.networkMetricBuilder = NetworkRequestMetricBuilder.builder(transportManager);
        this.startTimeMicros = j;
        this.timer = timer2;
    }

    public void onFailure(checkAlloc checkalloc, IOException iOException) {
        InvalidDataException min = checkalloc.getMin();
        if (min != null) {
            Draft_76 draft_76 = min.setMin;
            if (draft_76 != null) {
                this.networkMetricBuilder.setUrl(draft_76.getMax().toString());
            }
            if (min.getMin != null) {
                this.networkMetricBuilder.setHttpMethod(min.getMin);
            }
        }
        this.networkMetricBuilder.setRequestStartTimeMicros(this.startTimeMicros);
        this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
        NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
        this.callback.onFailure(checkalloc, iOException);
    }

    public void onResponse(checkAlloc checkalloc, InvalidHandshakeException invalidHandshakeException) throws IOException {
        InvalidHandshakeException invalidHandshakeException2 = invalidHandshakeException;
        FirebasePerfOkHttpClient.sendNetworkMetric(invalidHandshakeException2, this.networkMetricBuilder, this.startTimeMicros, this.timer.getDurationMicros());
        this.callback.onResponse(checkalloc, invalidHandshakeException);
    }
}
