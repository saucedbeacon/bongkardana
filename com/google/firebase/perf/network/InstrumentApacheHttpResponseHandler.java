package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

public class InstrumentApacheHttpResponseHandler<T> implements ResponseHandler<T> {
    private final NetworkRequestMetricBuilder networkMetricBuilder;
    private final ResponseHandler<? extends T> responseHandlerDelegate;
    private final Timer timer;

    public InstrumentApacheHttpResponseHandler(ResponseHandler<? extends T> responseHandler, Timer timer2, NetworkRequestMetricBuilder networkRequestMetricBuilder) {
        this.responseHandlerDelegate = responseHandler;
        this.timer = timer2;
        this.networkMetricBuilder = networkRequestMetricBuilder;
    }

    public T handleResponse(HttpResponse httpResponse) throws IOException {
        this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
        this.networkMetricBuilder.setHttpResponseCode(httpResponse.getStatusLine().getStatusCode());
        Long apacheHttpMessageContentLength = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength(httpResponse);
        if (apacheHttpMessageContentLength != null) {
            this.networkMetricBuilder.setResponsePayloadBytes(apacheHttpMessageContentLength.longValue());
        }
        String apacheHttpResponseContentType = NetworkRequestMetricBuilderUtil.getApacheHttpResponseContentType(httpResponse);
        if (apacheHttpResponseContentType != null) {
            this.networkMetricBuilder.setResponseContentType(apacheHttpResponseContentType);
        }
        this.networkMetricBuilder.build();
        return this.responseHandlerDelegate.handleResponse(httpResponse);
    }
}
