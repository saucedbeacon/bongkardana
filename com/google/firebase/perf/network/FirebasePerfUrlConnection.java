package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.URLWrapper;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public class FirebasePerfUrlConnection {
    private FirebasePerfUrlConnection() {
    }

    @Keep
    public static InputStream openStream(URL url) throws IOException {
        return openStream(new URLWrapper(url), TransportManager.getInstance(), new Timer());
    }

    static InputStream openStream(URLWrapper uRLWrapper, TransportManager transportManager, Timer timer) throws IOException {
        timer.reset();
        long micros = timer.getMicros();
        NetworkRequestMetricBuilder builder = NetworkRequestMetricBuilder.builder(transportManager);
        try {
            URLConnection openConnection = uRLWrapper.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new InstrHttpsURLConnection((HttpsURLConnection) openConnection, timer, builder).getInputStream();
            }
            if (openConnection instanceof HttpURLConnection) {
                return new InstrHttpURLConnection((HttpURLConnection) openConnection, timer, builder).getInputStream();
            }
            return openConnection.getInputStream();
        } catch (IOException e) {
            builder.setRequestStartTimeMicros(micros);
            builder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            builder.setUrl(uRLWrapper.toString());
            NetworkRequestMetricBuilderUtil.logError(builder);
            throw e;
        }
    }

    @Keep
    public static Object getContent(URL url) throws IOException {
        return getContent(new URLWrapper(url), TransportManager.getInstance(), new Timer());
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        return getContent(new URLWrapper(url), clsArr, TransportManager.getInstance(), new Timer());
    }

    static Object getContent(URLWrapper uRLWrapper, TransportManager transportManager, Timer timer) throws IOException {
        timer.reset();
        long micros = timer.getMicros();
        NetworkRequestMetricBuilder builder = NetworkRequestMetricBuilder.builder(transportManager);
        try {
            URLConnection openConnection = uRLWrapper.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new InstrHttpsURLConnection((HttpsURLConnection) openConnection, timer, builder).getContent();
            }
            if (openConnection instanceof HttpURLConnection) {
                return new InstrHttpURLConnection((HttpURLConnection) openConnection, timer, builder).getContent();
            }
            return openConnection.getContent();
        } catch (IOException e) {
            builder.setRequestStartTimeMicros(micros);
            builder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            builder.setUrl(uRLWrapper.toString());
            NetworkRequestMetricBuilderUtil.logError(builder);
            throw e;
        }
    }

    static Object getContent(URLWrapper uRLWrapper, Class[] clsArr, TransportManager transportManager, Timer timer) throws IOException {
        timer.reset();
        long micros = timer.getMicros();
        NetworkRequestMetricBuilder builder = NetworkRequestMetricBuilder.builder(transportManager);
        try {
            URLConnection openConnection = uRLWrapper.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new InstrHttpsURLConnection((HttpsURLConnection) openConnection, timer, builder).getContent(clsArr);
            }
            if (openConnection instanceof HttpURLConnection) {
                return new InstrHttpURLConnection((HttpURLConnection) openConnection, timer, builder).getContent(clsArr);
            }
            return openConnection.getContent(clsArr);
        } catch (IOException e) {
            builder.setRequestStartTimeMicros(micros);
            builder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            builder.setUrl(uRLWrapper.toString());
            NetworkRequestMetricBuilderUtil.logError(builder);
            throw e;
        }
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
        if (obj instanceof HttpsURLConnection) {
            return new InstrHttpsURLConnection((HttpsURLConnection) obj, new Timer(), NetworkRequestMetricBuilder.builder(TransportManager.getInstance()));
        }
        return obj instanceof HttpURLConnection ? new InstrHttpURLConnection((HttpURLConnection) obj, new Timer(), NetworkRequestMetricBuilder.builder(TransportManager.getInstance())) : obj;
    }
}
