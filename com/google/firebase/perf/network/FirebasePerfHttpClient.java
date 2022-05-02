package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

public class FirebasePerfHttpClient {
    private FirebasePerfHttpClient() {
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        return execute(httpClient, httpUriRequest, new Timer(), TransportManager.getInstance());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        return execute(httpClient, httpUriRequest, httpContext, new Timer(), TransportManager.getInstance());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        return execute(httpClient, httpUriRequest, responseHandler, new Timer(), TransportManager.getInstance());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        return execute(httpClient, httpUriRequest, responseHandler, httpContext, new Timer(), TransportManager.getInstance());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        return execute(httpClient, httpHost, httpRequest, new Timer(), TransportManager.getInstance());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        return execute(httpClient, httpHost, httpRequest, httpContext, new Timer(), TransportManager.getInstance());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        return execute(httpClient, httpHost, httpRequest, responseHandler, new Timer(), TransportManager.getInstance());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        return execute(httpClient, httpHost, httpRequest, responseHandler, httpContext, new Timer(), TransportManager.getInstance());
    }

    static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, Timer timer, TransportManager transportManager) throws IOException {
        NetworkRequestMetricBuilder builder = NetworkRequestMetricBuilder.builder(transportManager);
        try {
            builder.setUrl(httpUriRequest.getURI().toString()).setHttpMethod(httpUriRequest.getMethod());
            Long apacheHttpMessageContentLength = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength(httpUriRequest);
            if (apacheHttpMessageContentLength != null) {
                builder.setRequestPayloadBytes(apacheHttpMessageContentLength.longValue());
            }
            timer.reset();
            builder.setRequestStartTimeMicros(timer.getMicros());
            HttpResponse execute = httpClient.execute(httpUriRequest);
            builder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            builder.setHttpResponseCode(execute.getStatusLine().getStatusCode());
            Long apacheHttpMessageContentLength2 = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength(execute);
            if (apacheHttpMessageContentLength2 != null) {
                builder.setResponsePayloadBytes(apacheHttpMessageContentLength2.longValue());
            }
            String apacheHttpResponseContentType = NetworkRequestMetricBuilderUtil.getApacheHttpResponseContentType(execute);
            if (apacheHttpResponseContentType != null) {
                builder.setResponseContentType(apacheHttpResponseContentType);
            }
            builder.build();
            return execute;
        } catch (IOException e) {
            builder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(builder);
            throw e;
        }
    }

    static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext, Timer timer, TransportManager transportManager) throws IOException {
        NetworkRequestMetricBuilder builder = NetworkRequestMetricBuilder.builder(transportManager);
        try {
            builder.setUrl(httpUriRequest.getURI().toString()).setHttpMethod(httpUriRequest.getMethod());
            Long apacheHttpMessageContentLength = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength(httpUriRequest);
            if (apacheHttpMessageContentLength != null) {
                builder.setRequestPayloadBytes(apacheHttpMessageContentLength.longValue());
            }
            timer.reset();
            builder.setRequestStartTimeMicros(timer.getMicros());
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            builder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            builder.setHttpResponseCode(execute.getStatusLine().getStatusCode());
            Long apacheHttpMessageContentLength2 = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength(execute);
            if (apacheHttpMessageContentLength2 != null) {
                builder.setResponsePayloadBytes(apacheHttpMessageContentLength2.longValue());
            }
            String apacheHttpResponseContentType = NetworkRequestMetricBuilderUtil.getApacheHttpResponseContentType(execute);
            if (apacheHttpResponseContentType != null) {
                builder.setResponseContentType(apacheHttpResponseContentType);
            }
            builder.build();
            return execute;
        } catch (IOException e) {
            builder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(builder);
            throw e;
        }
    }

    static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, Timer timer, TransportManager transportManager) throws IOException {
        NetworkRequestMetricBuilder builder = NetworkRequestMetricBuilder.builder(transportManager);
        try {
            builder.setUrl(httpUriRequest.getURI().toString()).setHttpMethod(httpUriRequest.getMethod());
            Long apacheHttpMessageContentLength = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength(httpUriRequest);
            if (apacheHttpMessageContentLength != null) {
                builder.setRequestPayloadBytes(apacheHttpMessageContentLength.longValue());
            }
            timer.reset();
            builder.setRequestStartTimeMicros(timer.getMicros());
            return httpClient.execute(httpUriRequest, new InstrumentApacheHttpResponseHandler(responseHandler, timer, builder));
        } catch (IOException e) {
            builder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(builder);
            throw e;
        }
    }

    static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext, Timer timer, TransportManager transportManager) throws IOException {
        NetworkRequestMetricBuilder builder = NetworkRequestMetricBuilder.builder(transportManager);
        try {
            builder.setUrl(httpUriRequest.getURI().toString()).setHttpMethod(httpUriRequest.getMethod());
            Long apacheHttpMessageContentLength = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength(httpUriRequest);
            if (apacheHttpMessageContentLength != null) {
                builder.setRequestPayloadBytes(apacheHttpMessageContentLength.longValue());
            }
            timer.reset();
            builder.setRequestStartTimeMicros(timer.getMicros());
            return httpClient.execute(httpUriRequest, new InstrumentApacheHttpResponseHandler(responseHandler, timer, builder), httpContext);
        } catch (IOException e) {
            builder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(builder);
            throw e;
        }
    }

    static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, Timer timer, TransportManager transportManager) throws IOException {
        NetworkRequestMetricBuilder builder = NetworkRequestMetricBuilder.builder(transportManager);
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(httpHost.toURI());
            sb.append(httpRequest.getRequestLine().getUri());
            builder.setUrl(sb.toString()).setHttpMethod(httpRequest.getRequestLine().getMethod());
            Long apacheHttpMessageContentLength = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength(httpRequest);
            if (apacheHttpMessageContentLength != null) {
                builder.setRequestPayloadBytes(apacheHttpMessageContentLength.longValue());
            }
            timer.reset();
            builder.setRequestStartTimeMicros(timer.getMicros());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            builder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            builder.setHttpResponseCode(execute.getStatusLine().getStatusCode());
            Long apacheHttpMessageContentLength2 = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength(execute);
            if (apacheHttpMessageContentLength2 != null) {
                builder.setResponsePayloadBytes(apacheHttpMessageContentLength2.longValue());
            }
            String apacheHttpResponseContentType = NetworkRequestMetricBuilderUtil.getApacheHttpResponseContentType(execute);
            if (apacheHttpResponseContentType != null) {
                builder.setResponseContentType(apacheHttpResponseContentType);
            }
            builder.build();
            return execute;
        } catch (IOException e) {
            builder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(builder);
            throw e;
        }
    }

    static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext, Timer timer, TransportManager transportManager) throws IOException {
        NetworkRequestMetricBuilder builder = NetworkRequestMetricBuilder.builder(transportManager);
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(httpHost.toURI());
            sb.append(httpRequest.getRequestLine().getUri());
            builder.setUrl(sb.toString()).setHttpMethod(httpRequest.getRequestLine().getMethod());
            Long apacheHttpMessageContentLength = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength(httpRequest);
            if (apacheHttpMessageContentLength != null) {
                builder.setRequestPayloadBytes(apacheHttpMessageContentLength.longValue());
            }
            timer.reset();
            builder.setRequestStartTimeMicros(timer.getMicros());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            builder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            builder.setHttpResponseCode(execute.getStatusLine().getStatusCode());
            Long apacheHttpMessageContentLength2 = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength(execute);
            if (apacheHttpMessageContentLength2 != null) {
                builder.setResponsePayloadBytes(apacheHttpMessageContentLength2.longValue());
            }
            String apacheHttpResponseContentType = NetworkRequestMetricBuilderUtil.getApacheHttpResponseContentType(execute);
            if (apacheHttpResponseContentType != null) {
                builder.setResponseContentType(apacheHttpResponseContentType);
            }
            builder.build();
            return execute;
        } catch (IOException e) {
            builder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(builder);
            throw e;
        }
    }

    static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, Timer timer, TransportManager transportManager) throws IOException {
        NetworkRequestMetricBuilder builder = NetworkRequestMetricBuilder.builder(transportManager);
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(httpHost.toURI());
            sb.append(httpRequest.getRequestLine().getUri());
            builder.setUrl(sb.toString()).setHttpMethod(httpRequest.getRequestLine().getMethod());
            Long apacheHttpMessageContentLength = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength(httpRequest);
            if (apacheHttpMessageContentLength != null) {
                builder.setRequestPayloadBytes(apacheHttpMessageContentLength.longValue());
            }
            timer.reset();
            builder.setRequestStartTimeMicros(timer.getMicros());
            return httpClient.execute(httpHost, httpRequest, new InstrumentApacheHttpResponseHandler(responseHandler, timer, builder));
        } catch (IOException e) {
            builder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(builder);
            throw e;
        }
    }

    static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext, Timer timer, TransportManager transportManager) throws IOException {
        NetworkRequestMetricBuilder builder = NetworkRequestMetricBuilder.builder(transportManager);
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(httpHost.toURI());
            sb.append(httpRequest.getRequestLine().getUri());
            builder.setUrl(sb.toString()).setHttpMethod(httpRequest.getRequestLine().getMethod());
            Long apacheHttpMessageContentLength = NetworkRequestMetricBuilderUtil.getApacheHttpMessageContentLength(httpRequest);
            if (apacheHttpMessageContentLength != null) {
                builder.setRequestPayloadBytes(apacheHttpMessageContentLength.longValue());
            }
            timer.reset();
            builder.setRequestStartTimeMicros(timer.getMicros());
            return httpClient.execute(httpHost, httpRequest, new InstrumentApacheHttpResponseHandler(responseHandler, timer, builder), httpContext);
        } catch (IOException e) {
            builder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(builder);
            throw e;
        }
    }
}
