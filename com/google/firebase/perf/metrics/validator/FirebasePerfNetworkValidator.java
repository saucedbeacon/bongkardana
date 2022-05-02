package com.google.firebase.perf.metrics.validator;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.URLAllowlist;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.net.URI;

final class FirebasePerfNetworkValidator extends PerfMetricValidator {
    private static final int EMPTY_PORT = -1;
    private static final String HTTPS = "https";
    private static final String HTTP_SCHEMA = "http";
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final Context appContext;
    private final NetworkRequestMetric networkMetric;

    private boolean isValidHttpResponseCode(int i) {
        return i > 0;
    }

    private boolean isValidPayload(long j) {
        return j >= 0;
    }

    private boolean isValidPort(int i) {
        return i == -1 || i > 0;
    }

    private boolean isValidTime(long j) {
        return j >= 0;
    }

    private boolean isValidUserInfo(@Nullable String str) {
        return str == null;
    }

    FirebasePerfNetworkValidator(NetworkRequestMetric networkRequestMetric, Context context) {
        this.appContext = context;
        this.networkMetric = networkRequestMetric;
    }

    public final boolean isValidPerfMetric() {
        if (isEmptyUrl(this.networkMetric.getUrl())) {
            AndroidLogger androidLogger = logger;
            StringBuilder sb = new StringBuilder("URL is missing:");
            sb.append(this.networkMetric.getUrl());
            androidLogger.info(sb.toString());
            return false;
        }
        URI resultUrl = getResultUrl(this.networkMetric.getUrl());
        if (resultUrl == null) {
            logger.info("URL cannot be parsed");
            return false;
        } else if (!isAllowlisted(resultUrl, this.appContext)) {
            logger.info("URL fails allowlist rule: ".concat(String.valueOf(resultUrl)));
            return false;
        } else if (!isValidHost(resultUrl.getHost())) {
            logger.info("URL host is null or invalid");
            return false;
        } else if (!isValidScheme(resultUrl.getScheme())) {
            logger.info("URL scheme is null or invalid");
            return false;
        } else if (!isValidUserInfo(resultUrl.getUserInfo())) {
            logger.info("URL user info is null");
            return false;
        } else if (!isValidPort(resultUrl.getPort())) {
            logger.info("URL port is less than or equal to 0");
            return false;
        } else {
            if (!isValidHttpMethod(this.networkMetric.hasHttpMethod() ? this.networkMetric.getHttpMethod() : null)) {
                AndroidLogger androidLogger2 = logger;
                StringBuilder sb2 = new StringBuilder("HTTP Method is null or invalid: ");
                sb2.append(this.networkMetric.getHttpMethod());
                androidLogger2.info(sb2.toString());
                return false;
            } else if (this.networkMetric.hasHttpResponseCode() && !isValidHttpResponseCode(this.networkMetric.getHttpResponseCode())) {
                AndroidLogger androidLogger3 = logger;
                StringBuilder sb3 = new StringBuilder("HTTP ResponseCode is a negative value:");
                sb3.append(this.networkMetric.getHttpResponseCode());
                androidLogger3.info(sb3.toString());
                return false;
            } else if (this.networkMetric.hasRequestPayloadBytes() && !isValidPayload(this.networkMetric.getRequestPayloadBytes())) {
                AndroidLogger androidLogger4 = logger;
                StringBuilder sb4 = new StringBuilder("Request Payload is a negative value:");
                sb4.append(this.networkMetric.getRequestPayloadBytes());
                androidLogger4.info(sb4.toString());
                return false;
            } else if (this.networkMetric.hasResponsePayloadBytes() && !isValidPayload(this.networkMetric.getResponsePayloadBytes())) {
                AndroidLogger androidLogger5 = logger;
                StringBuilder sb5 = new StringBuilder("Response Payload is a negative value:");
                sb5.append(this.networkMetric.getResponsePayloadBytes());
                androidLogger5.info(sb5.toString());
                return false;
            } else if (!this.networkMetric.hasClientStartTimeUs() || this.networkMetric.getClientStartTimeUs() <= 0) {
                AndroidLogger androidLogger6 = logger;
                StringBuilder sb6 = new StringBuilder("Start time of the request is null, or zero, or a negative value:");
                sb6.append(this.networkMetric.getClientStartTimeUs());
                androidLogger6.info(sb6.toString());
                return false;
            } else if (this.networkMetric.hasTimeToRequestCompletedUs() && !isValidTime(this.networkMetric.getTimeToRequestCompletedUs())) {
                AndroidLogger androidLogger7 = logger;
                StringBuilder sb7 = new StringBuilder("Time to complete the request is a negative value:");
                sb7.append(this.networkMetric.getTimeToRequestCompletedUs());
                androidLogger7.info(sb7.toString());
                return false;
            } else if (this.networkMetric.hasTimeToResponseInitiatedUs() && !isValidTime(this.networkMetric.getTimeToResponseInitiatedUs())) {
                AndroidLogger androidLogger8 = logger;
                StringBuilder sb8 = new StringBuilder("Time from the start of the request to the start of the response is null or a negative value:");
                sb8.append(this.networkMetric.getTimeToResponseInitiatedUs());
                androidLogger8.info(sb8.toString());
                return false;
            } else if (!this.networkMetric.hasTimeToResponseCompletedUs() || this.networkMetric.getTimeToResponseCompletedUs() <= 0) {
                AndroidLogger androidLogger9 = logger;
                StringBuilder sb9 = new StringBuilder("Time from the start of the request to the end of the response is null, negative or zero:");
                sb9.append(this.networkMetric.getTimeToResponseCompletedUs());
                androidLogger9.info(sb9.toString());
                return false;
            } else if (this.networkMetric.hasHttpResponseCode()) {
                return true;
            } else {
                logger.info("Did not receive a HTTP Response Code");
                return false;
            }
        }
    }

    private boolean isEmptyUrl(@Nullable String str) {
        return isBlank(str);
    }

    @Nullable
    private URI getResultUrl(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e) {
            logger.warn("getResultUrl throws exception %s", e.getMessage());
            return null;
        }
    }

    private boolean isAllowlisted(@Nullable URI uri, @NonNull Context context) {
        if (uri == null) {
            return false;
        }
        return URLAllowlist.isURLAllowlisted(uri, context);
    }

    private boolean isValidHost(@Nullable String str) {
        return str != null && !isBlank(str) && str.length() <= 255;
    }

    private boolean isValidScheme(@Nullable String str) {
        if (str == null) {
            return false;
        }
        return HTTP_SCHEMA.equalsIgnoreCase(str) || HTTPS.equalsIgnoreCase(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean isValidHttpMethod(@Nullable NetworkRequestMetric.HttpMethod httpMethod) {
        return (httpMethod == null || httpMethod == NetworkRequestMetric.HttpMethod.HTTP_METHOD_UNKNOWN) ? false : true;
    }

    private boolean isBlank(@Nullable String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }
}
