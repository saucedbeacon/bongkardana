package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;

public final class InstrHttpURLConnection extends HttpURLConnection {
    private final InstrURLConnectionBase delegate;

    InstrHttpURLConnection(HttpURLConnection httpURLConnection, Timer timer, NetworkRequestMetricBuilder networkRequestMetricBuilder) {
        super(httpURLConnection.getURL());
        this.delegate = new InstrURLConnectionBase(httpURLConnection, timer, networkRequestMetricBuilder);
    }

    public final void connect() throws IOException {
        this.delegate.connect();
    }

    public final void disconnect() {
        this.delegate.disconnect();
    }

    public final Object getContent() throws IOException {
        return this.delegate.getContent();
    }

    public final Object getContent(Class[] clsArr) throws IOException {
        return this.delegate.getContent(clsArr);
    }

    public final InputStream getInputStream() throws IOException {
        return this.delegate.getInputStream();
    }

    public final long getLastModified() {
        return this.delegate.getLastModified();
    }

    public final OutputStream getOutputStream() throws IOException {
        return this.delegate.getOutputStream();
    }

    public final Permission getPermission() throws IOException {
        return this.delegate.getPermission();
    }

    public final int getResponseCode() throws IOException {
        return this.delegate.getResponseCode();
    }

    public final String getResponseMessage() throws IOException {
        return this.delegate.getResponseMessage();
    }

    public final long getExpiration() {
        return this.delegate.getExpiration();
    }

    public final String getHeaderField(int i) {
        return this.delegate.getHeaderField(i);
    }

    public final String getHeaderField(String str) {
        return this.delegate.getHeaderField(str);
    }

    public final long getHeaderFieldDate(String str, long j) {
        return this.delegate.getHeaderFieldDate(str, j);
    }

    public final int getHeaderFieldInt(String str, int i) {
        return this.delegate.getHeaderFieldInt(str, i);
    }

    public final long getHeaderFieldLong(String str, long j) {
        return this.delegate.getHeaderFieldLong(str, j);
    }

    public final String getHeaderFieldKey(int i) {
        return this.delegate.getHeaderFieldKey(i);
    }

    public final Map<String, List<String>> getHeaderFields() {
        return this.delegate.getHeaderFields();
    }

    public final String getContentEncoding() {
        return this.delegate.getContentEncoding();
    }

    public final int getContentLength() {
        return this.delegate.getContentLength();
    }

    public final long getContentLengthLong() {
        return this.delegate.getContentLengthLong();
    }

    public final String getContentType() {
        return this.delegate.getContentType();
    }

    public final long getDate() {
        return this.delegate.getDate();
    }

    public final void addRequestProperty(String str, String str2) {
        this.delegate.addRequestProperty(str, str2);
    }

    public final boolean equals(Object obj) {
        return this.delegate.equals(obj);
    }

    public final boolean getAllowUserInteraction() {
        return this.delegate.getAllowUserInteraction();
    }

    public final int getConnectTimeout() {
        return this.delegate.getConnectTimeout();
    }

    public final boolean getDefaultUseCaches() {
        return this.delegate.getDefaultUseCaches();
    }

    public final boolean getDoInput() {
        return this.delegate.getDoInput();
    }

    public final boolean getDoOutput() {
        return this.delegate.getDoOutput();
    }

    public final InputStream getErrorStream() {
        return this.delegate.getErrorStream();
    }

    public final long getIfModifiedSince() {
        return this.delegate.getIfModifiedSince();
    }

    public final boolean getInstanceFollowRedirects() {
        return this.delegate.getInstanceFollowRedirects();
    }

    public final int getReadTimeout() {
        return this.delegate.getReadTimeout();
    }

    public final String getRequestMethod() {
        return this.delegate.getRequestMethod();
    }

    public final Map<String, List<String>> getRequestProperties() {
        return this.delegate.getRequestProperties();
    }

    public final String getRequestProperty(String str) {
        return this.delegate.getRequestProperty(str);
    }

    public final URL getURL() {
        return this.delegate.getURL();
    }

    public final boolean getUseCaches() {
        return this.delegate.getUseCaches();
    }

    public final int hashCode() {
        return this.delegate.hashCode();
    }

    public final void setAllowUserInteraction(boolean z) {
        this.delegate.setAllowUserInteraction(z);
    }

    public final void setChunkedStreamingMode(int i) {
        this.delegate.setChunkedStreamingMode(i);
    }

    public final void setConnectTimeout(int i) {
        this.delegate.setConnectTimeout(i);
    }

    public final void setDefaultUseCaches(boolean z) {
        this.delegate.setDefaultUseCaches(z);
    }

    public final void setDoInput(boolean z) {
        this.delegate.setDoInput(z);
    }

    public final void setDoOutput(boolean z) {
        this.delegate.setDoOutput(z);
    }

    public final void setFixedLengthStreamingMode(int i) {
        this.delegate.setFixedLengthStreamingMode(i);
    }

    public final void setFixedLengthStreamingMode(long j) {
        this.delegate.setFixedLengthStreamingMode(j);
    }

    public final void setIfModifiedSince(long j) {
        this.delegate.setIfModifiedSince(j);
    }

    public final void setInstanceFollowRedirects(boolean z) {
        this.delegate.setInstanceFollowRedirects(z);
    }

    public final void setReadTimeout(int i) {
        this.delegate.setReadTimeout(i);
    }

    public final void setRequestMethod(String str) throws ProtocolException {
        this.delegate.setRequestMethod(str);
    }

    public final void setRequestProperty(String str, String str2) {
        this.delegate.setRequestProperty(str, str2);
    }

    public final void setUseCaches(boolean z) {
        this.delegate.setUseCaches(z);
    }

    public final String toString() {
        return this.delegate.toString();
    }

    public final boolean usingProxy() {
        return this.delegate.usingProxy();
    }
}
