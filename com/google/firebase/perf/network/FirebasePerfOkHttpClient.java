package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import o.Draft_76;
import o.InvalidDataException;
import o.InvalidHandshakeException;
import o.NotSendableException;
import o.checkAlloc;
import o.getRole;
import o.translateRegularFrame;

public class FirebasePerfOkHttpClient {
    private FirebasePerfOkHttpClient() {
    }

    @Keep
    public static InvalidHandshakeException execute(checkAlloc checkalloc) throws IOException {
        NetworkRequestMetricBuilder builder = NetworkRequestMetricBuilder.builder(TransportManager.getInstance());
        Timer timer = new Timer();
        long micros = timer.getMicros();
        try {
            InvalidHandshakeException length = checkalloc.length();
            sendNetworkMetric(length, builder, micros, timer.getDurationMicros());
            return length;
        } catch (IOException e) {
            InvalidDataException min = checkalloc.getMin();
            if (min != null) {
                Draft_76 draft_76 = min.setMin;
                if (draft_76 != null) {
                    builder.setUrl(draft_76.getMax().toString());
                }
                if (min.getMin != null) {
                    builder.setHttpMethod(min.getMin);
                }
            }
            builder.setRequestStartTimeMicros(micros);
            builder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(builder);
            throw e;
        }
    }

    @Keep
    public static void enqueue(checkAlloc checkalloc, getRole getrole) {
        Timer timer = new Timer();
        getRole getrole2 = getrole;
        checkalloc.setMin(new InstrumentOkHttpEnqueueCallback(getrole2, TransportManager.getInstance(), timer, timer.getMicros()));
    }

    static void sendNetworkMetric(InvalidHandshakeException invalidHandshakeException, NetworkRequestMetricBuilder networkRequestMetricBuilder, long j, long j2) throws IOException {
        InvalidDataException invalidDataException = invalidHandshakeException.getMin;
        if (invalidDataException != null) {
            networkRequestMetricBuilder.setUrl(invalidDataException.setMin.getMax().toString());
            networkRequestMetricBuilder.setHttpMethod(invalidDataException.getMin);
            if (invalidDataException.setMax != null) {
                long min = invalidDataException.setMax.setMin();
                if (min != -1) {
                    networkRequestMetricBuilder.setRequestPayloadBytes(min);
                }
            }
            NotSendableException notSendableException = invalidHandshakeException.toFloatRange;
            if (notSendableException != null) {
                long max = notSendableException.setMax();
                if (max != -1) {
                    networkRequestMetricBuilder.setResponsePayloadBytes(max);
                }
                translateRegularFrame min2 = notSendableException.getMin();
                if (min2 != null) {
                    networkRequestMetricBuilder.setResponseContentType(min2.toString());
                }
            }
            networkRequestMetricBuilder.setHttpResponseCode(invalidHandshakeException.getMax);
            networkRequestMetricBuilder.setRequestStartTimeMicros(j);
            networkRequestMetricBuilder.setTimeToResponseCompletedMicros(j2);
            networkRequestMetricBuilder.build();
        }
    }
}
