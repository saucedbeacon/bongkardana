package com.google.firebase.perf.metrics;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.application.AppStateUpdateHandler;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.network.NetworkRequestMetricBuilderUtil;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionAwareObject;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Utils;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class NetworkRequestMetricBuilder extends AppStateUpdateHandler implements SessionAwareObject {
    private static final char HIGHEST_ASCII_CHAR = '';
    private static final char HIGHEST_CONTROL_CHAR = '\u001f';
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final NetworkRequestMetric.Builder builder;
    private final GaugeManager gaugeManager;
    private boolean isManualNetworkRequestMetric;
    private boolean isReportSent;
    private final List<PerfSession> sessions;
    private final TransportManager transportManager;
    @Nullable
    private String userAgent;
    private final WeakReference<SessionAwareObject> weakReference;

    public final void updateSession(PerfSession perfSession) {
        if (perfSession == null) {
            logger.info("Unable to add new SessionId to the Network Trace. Continuing without it.");
        } else if (hasStarted() && !isStopped()) {
            this.sessions.add(perfSession);
        }
    }

    public static NetworkRequestMetricBuilder builder(TransportManager transportManager2) {
        return new NetworkRequestMetricBuilder(transportManager2);
    }

    private NetworkRequestMetricBuilder(TransportManager transportManager2) {
        this(transportManager2, AppStateMonitor.getInstance(), GaugeManager.getInstance());
    }

    public NetworkRequestMetricBuilder(TransportManager transportManager2, AppStateMonitor appStateMonitor, GaugeManager gaugeManager2) {
        super(appStateMonitor);
        this.builder = NetworkRequestMetric.newBuilder();
        this.weakReference = new WeakReference<>(this);
        this.transportManager = transportManager2;
        this.gaugeManager = gaugeManager2;
        this.sessions = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }

    public final void setManualNetworkRequestMetric() {
        this.isManualNetworkRequestMetric = true;
    }

    public final NetworkRequestMetricBuilder setUrl(@Nullable String str) {
        if (str != null) {
            this.builder.setUrl(Utils.truncateURL(Utils.stripSensitiveInfo(str), 2000));
        }
        return this;
    }

    public final String getUrl() {
        return this.builder.getUrl();
    }

    public final NetworkRequestMetricBuilder setUserAgent(@Nullable String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-335049439, oncanceled);
            onCancelLoad.getMin(-335049439, oncanceled);
        }
        this.userAgent = str;
        return this;
    }

    public final NetworkRequestMetricBuilder setHttpMethod(@Nullable String str) {
        NetworkRequestMetric.HttpMethod httpMethod;
        if (str != null) {
            NetworkRequestMetric.HttpMethod httpMethod2 = NetworkRequestMetric.HttpMethod.HTTP_METHOD_UNKNOWN;
            String upperCase = str.toUpperCase();
            char c = 65535;
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals(FirebasePerformance.HttpMethod.OPTIONS)) {
                        c = 6;
                        break;
                    }
                    break;
                case 70454:
                    if (upperCase.equals("GET")) {
                        c = 0;
                        break;
                    }
                    break;
                case 79599:
                    if (upperCase.equals(FirebasePerformance.HttpMethod.PUT)) {
                        c = 1;
                        break;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals(FirebasePerformance.HttpMethod.HEAD)) {
                        c = 4;
                        break;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals("POST")) {
                        c = 2;
                        break;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals(FirebasePerformance.HttpMethod.PATCH)) {
                        c = 5;
                        break;
                    }
                    break;
                case 80083237:
                    if (upperCase.equals(FirebasePerformance.HttpMethod.TRACE)) {
                        c = 7;
                        break;
                    }
                    break;
                case 1669334218:
                    if (upperCase.equals(FirebasePerformance.HttpMethod.CONNECT)) {
                        c = 8;
                        break;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals(FirebasePerformance.HttpMethod.DELETE)) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    httpMethod = NetworkRequestMetric.HttpMethod.GET;
                    break;
                case 1:
                    httpMethod = NetworkRequestMetric.HttpMethod.PUT;
                    break;
                case 2:
                    httpMethod = NetworkRequestMetric.HttpMethod.POST;
                    break;
                case 3:
                    httpMethod = NetworkRequestMetric.HttpMethod.DELETE;
                    break;
                case 4:
                    httpMethod = NetworkRequestMetric.HttpMethod.HEAD;
                    break;
                case 5:
                    httpMethod = NetworkRequestMetric.HttpMethod.PATCH;
                    break;
                case 6:
                    httpMethod = NetworkRequestMetric.HttpMethod.OPTIONS;
                    break;
                case 7:
                    httpMethod = NetworkRequestMetric.HttpMethod.TRACE;
                    break;
                case 8:
                    httpMethod = NetworkRequestMetric.HttpMethod.CONNECT;
                    break;
                default:
                    httpMethod = NetworkRequestMetric.HttpMethod.HTTP_METHOD_UNKNOWN;
                    break;
            }
            this.builder.setHttpMethod(httpMethod);
        }
        return this;
    }

    public final NetworkRequestMetricBuilder setHttpResponseCode(int i) {
        this.builder.setHttpResponseCode(i);
        return this;
    }

    public final boolean hasHttpResponseCode() {
        return this.builder.hasHttpResponseCode();
    }

    public final NetworkRequestMetricBuilder setRequestPayloadBytes(long j) {
        this.builder.setRequestPayloadBytes(j);
        return this;
    }

    public final NetworkRequestMetricBuilder setCustomAttributes(Map<String, String> map) {
        this.builder.clearCustomAttributes().putAllCustomAttributes(map);
        return this;
    }

    public final NetworkRequestMetricBuilder setRequestStartTimeMicros(long j) {
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.weakReference);
        this.builder.setClientStartTimeUs(j);
        updateSession(perfSession);
        if (perfSession.isGaugeAndEventCollectionEnabled()) {
            this.gaugeManager.collectGaugeMetricOnce(perfSession.getTimer());
        }
        return this;
    }

    public final NetworkRequestMetricBuilder setTimeToRequestCompletedMicros(long j) {
        this.builder.setTimeToRequestCompletedUs(j);
        return this;
    }

    public final NetworkRequestMetricBuilder setTimeToResponseInitiatedMicros(long j) {
        this.builder.setTimeToResponseInitiatedUs(j);
        return this;
    }

    public final long getTimeToResponseInitiatedMicros() {
        return this.builder.getTimeToResponseInitiatedUs();
    }

    public final NetworkRequestMetricBuilder setTimeToResponseCompletedMicros(long j) {
        this.builder.setTimeToResponseCompletedUs(j);
        if (SessionManager.getInstance().perfSession().isGaugeAndEventCollectionEnabled()) {
            this.gaugeManager.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().getTimer());
        }
        return this;
    }

    public final NetworkRequestMetricBuilder setResponsePayloadBytes(long j) {
        this.builder.setResponsePayloadBytes(j);
        return this;
    }

    public final NetworkRequestMetricBuilder setResponseContentType(@Nullable String str) {
        if (str == null) {
            this.builder.clearResponseContentType();
            return this;
        }
        if (isValidContentType(str)) {
            this.builder.setResponseContentType(str);
        } else {
            logger.info("The content type of the response is not a valid content-type:".concat(String.valueOf(str)));
        }
        return this;
    }

    public final NetworkRequestMetricBuilder setNetworkClientErrorReason() {
        this.builder.setNetworkClientErrorReason(NetworkRequestMetric.NetworkClientErrorReason.GENERIC_CLIENT_ERROR);
        return this;
    }

    public final NetworkRequestMetric build() {
        SessionManager.getInstance().unregisterForSessionUpdates(this.weakReference);
        unregisterForAppState();
        com.google.firebase.perf.v1.PerfSession[] buildAndSort = PerfSession.buildAndSort(getSessions());
        if (buildAndSort != null) {
            this.builder.addAllPerfSessions(Arrays.asList(buildAndSort));
        }
        NetworkRequestMetric networkRequestMetric = (NetworkRequestMetric) this.builder.build();
        if (!NetworkRequestMetricBuilderUtil.isAllowedUserAgent(this.userAgent)) {
            logger.debug("Dropping network request from a 'User-Agent' that is not allowed");
            return networkRequestMetric;
        } else if (!this.isReportSent) {
            this.transportManager.log(networkRequestMetric, getAppState());
            this.isReportSent = true;
            return networkRequestMetric;
        } else {
            if (this.isManualNetworkRequestMetric) {
                logger.info("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
            }
            return networkRequestMetric;
        }
    }

    private boolean isStopped() {
        return this.builder.hasTimeToResponseCompletedUs();
    }

    private boolean hasStarted() {
        return this.builder.hasClientStartTimeUs();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final List<PerfSession> getSessions() {
        List<PerfSession> unmodifiableList;
        synchronized (this.sessions) {
            ArrayList arrayList = new ArrayList();
            for (PerfSession next : this.sessions) {
                if (next != null) {
                    arrayList.add(next);
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final boolean isReportSent() {
        return this.isReportSent;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final void setReportSent() {
        this.isReportSent = true;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final void clearBuilderFields() {
        this.builder.clear();
    }

    private static boolean isValidContentType(String str) {
        if (str.length() > 128) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt > 127) {
                return false;
            }
        }
        return true;
    }
}
