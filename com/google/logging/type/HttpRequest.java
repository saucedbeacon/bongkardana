package com.google.logging.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Duration;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class HttpRequest extends GeneratedMessageLite<HttpRequest, Builder> implements HttpRequestOrBuilder {
    public static final int CACHE_FILL_BYTES_FIELD_NUMBER = 12;
    public static final int CACHE_HIT_FIELD_NUMBER = 9;
    public static final int CACHE_LOOKUP_FIELD_NUMBER = 11;
    public static final int CACHE_VALIDATED_WITH_ORIGIN_SERVER_FIELD_NUMBER = 10;
    /* access modifiers changed from: private */
    public static final HttpRequest DEFAULT_INSTANCE;
    public static final int LATENCY_FIELD_NUMBER = 14;
    private static volatile Parser<HttpRequest> PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 15;
    public static final int REFERER_FIELD_NUMBER = 8;
    public static final int REMOTE_IP_FIELD_NUMBER = 7;
    public static final int REQUEST_METHOD_FIELD_NUMBER = 1;
    public static final int REQUEST_SIZE_FIELD_NUMBER = 3;
    public static final int REQUEST_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_SIZE_FIELD_NUMBER = 5;
    public static final int SERVER_IP_FIELD_NUMBER = 13;
    public static final int STATUS_FIELD_NUMBER = 4;
    public static final int USER_AGENT_FIELD_NUMBER = 6;
    private long cacheFillBytes_;
    private boolean cacheHit_;
    private boolean cacheLookup_;
    private boolean cacheValidatedWithOriginServer_;
    private Duration latency_;
    private String protocol_ = "";
    private String referer_ = "";
    private String remoteIp_ = "";
    private String requestMethod_ = "";
    private long requestSize_;
    private String requestUrl_ = "";
    private long responseSize_;
    private String serverIp_ = "";
    private int status_;
    private String userAgent_ = "";

    private HttpRequest() {
    }

    public final String getRequestMethod() {
        return this.requestMethod_;
    }

    public final ByteString getRequestMethodBytes() {
        return ByteString.copyFromUtf8(this.requestMethod_);
    }

    /* access modifiers changed from: private */
    public void setRequestMethod(String str) {
        this.requestMethod_ = str;
    }

    /* access modifiers changed from: private */
    public void clearRequestMethod() {
        this.requestMethod_ = getDefaultInstance().getRequestMethod();
    }

    /* access modifiers changed from: private */
    public void setRequestMethodBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.requestMethod_ = byteString.toStringUtf8();
    }

    public final String getRequestUrl() {
        return this.requestUrl_;
    }

    public final ByteString getRequestUrlBytes() {
        return ByteString.copyFromUtf8(this.requestUrl_);
    }

    /* access modifiers changed from: private */
    public void setRequestUrl(String str) {
        this.requestUrl_ = str;
    }

    /* access modifiers changed from: private */
    public void clearRequestUrl() {
        this.requestUrl_ = getDefaultInstance().getRequestUrl();
    }

    /* access modifiers changed from: private */
    public void setRequestUrlBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.requestUrl_ = byteString.toStringUtf8();
    }

    public final long getRequestSize() {
        return this.requestSize_;
    }

    /* access modifiers changed from: private */
    public void setRequestSize(long j) {
        this.requestSize_ = j;
    }

    /* access modifiers changed from: private */
    public void clearRequestSize() {
        this.requestSize_ = 0;
    }

    public final int getStatus() {
        return this.status_;
    }

    /* access modifiers changed from: private */
    public void setStatus(int i) {
        this.status_ = i;
    }

    /* access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    public final long getResponseSize() {
        return this.responseSize_;
    }

    /* access modifiers changed from: private */
    public void setResponseSize(long j) {
        this.responseSize_ = j;
    }

    /* access modifiers changed from: private */
    public void clearResponseSize() {
        this.responseSize_ = 0;
    }

    public final String getUserAgent() {
        return this.userAgent_;
    }

    public final ByteString getUserAgentBytes() {
        return ByteString.copyFromUtf8(this.userAgent_);
    }

    /* access modifiers changed from: private */
    public void setUserAgent(String str) {
        this.userAgent_ = str;
    }

    /* access modifiers changed from: private */
    public void clearUserAgent() {
        this.userAgent_ = getDefaultInstance().getUserAgent();
    }

    /* access modifiers changed from: private */
    public void setUserAgentBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.userAgent_ = byteString.toStringUtf8();
    }

    public final String getRemoteIp() {
        return this.remoteIp_;
    }

    public final ByteString getRemoteIpBytes() {
        return ByteString.copyFromUtf8(this.remoteIp_);
    }

    /* access modifiers changed from: private */
    public void setRemoteIp(String str) {
        this.remoteIp_ = str;
    }

    /* access modifiers changed from: private */
    public void clearRemoteIp() {
        this.remoteIp_ = getDefaultInstance().getRemoteIp();
    }

    /* access modifiers changed from: private */
    public void setRemoteIpBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.remoteIp_ = byteString.toStringUtf8();
    }

    public final String getServerIp() {
        return this.serverIp_;
    }

    public final ByteString getServerIpBytes() {
        return ByteString.copyFromUtf8(this.serverIp_);
    }

    /* access modifiers changed from: private */
    public void setServerIp(String str) {
        this.serverIp_ = str;
    }

    /* access modifiers changed from: private */
    public void clearServerIp() {
        this.serverIp_ = getDefaultInstance().getServerIp();
    }

    /* access modifiers changed from: private */
    public void setServerIpBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.serverIp_ = byteString.toStringUtf8();
    }

    public final String getReferer() {
        return this.referer_;
    }

    public final ByteString getRefererBytes() {
        return ByteString.copyFromUtf8(this.referer_);
    }

    /* access modifiers changed from: private */
    public void setReferer(String str) {
        this.referer_ = str;
    }

    /* access modifiers changed from: private */
    public void clearReferer() {
        this.referer_ = getDefaultInstance().getReferer();
    }

    /* access modifiers changed from: private */
    public void setRefererBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.referer_ = byteString.toStringUtf8();
    }

    public final boolean hasLatency() {
        return this.latency_ != null;
    }

    public final Duration getLatency() {
        Duration duration = this.latency_;
        return duration == null ? Duration.getDefaultInstance() : duration;
    }

    /* access modifiers changed from: private */
    public void setLatency(Duration duration) {
        this.latency_ = duration;
    }

    /* access modifiers changed from: private */
    public void mergeLatency(Duration duration) {
        Duration duration2 = this.latency_;
        if (duration2 == null || duration2 == Duration.getDefaultInstance()) {
            this.latency_ = duration;
        } else {
            this.latency_ = (Duration) ((Duration.Builder) Duration.newBuilder(this.latency_).mergeFrom(duration)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearLatency() {
        this.latency_ = null;
    }

    public final boolean getCacheLookup() {
        return this.cacheLookup_;
    }

    /* access modifiers changed from: private */
    public void setCacheLookup(boolean z) {
        this.cacheLookup_ = z;
    }

    /* access modifiers changed from: private */
    public void clearCacheLookup() {
        this.cacheLookup_ = false;
    }

    public final boolean getCacheHit() {
        return this.cacheHit_;
    }

    /* access modifiers changed from: private */
    public void setCacheHit(boolean z) {
        this.cacheHit_ = z;
    }

    /* access modifiers changed from: private */
    public void clearCacheHit() {
        this.cacheHit_ = false;
    }

    public final boolean getCacheValidatedWithOriginServer() {
        return this.cacheValidatedWithOriginServer_;
    }

    /* access modifiers changed from: private */
    public void setCacheValidatedWithOriginServer(boolean z) {
        this.cacheValidatedWithOriginServer_ = z;
    }

    /* access modifiers changed from: private */
    public void clearCacheValidatedWithOriginServer() {
        this.cacheValidatedWithOriginServer_ = false;
    }

    public final long getCacheFillBytes() {
        return this.cacheFillBytes_;
    }

    /* access modifiers changed from: private */
    public void setCacheFillBytes(long j) {
        this.cacheFillBytes_ = j;
    }

    /* access modifiers changed from: private */
    public void clearCacheFillBytes() {
        this.cacheFillBytes_ = 0;
    }

    public final String getProtocol() {
        return this.protocol_;
    }

    public final ByteString getProtocolBytes() {
        return ByteString.copyFromUtf8(this.protocol_);
    }

    /* access modifiers changed from: private */
    public void setProtocol(String str) {
        this.protocol_ = str;
    }

    /* access modifiers changed from: private */
    public void clearProtocol() {
        this.protocol_ = getDefaultInstance().getProtocol();
    }

    /* access modifiers changed from: private */
    public void setProtocolBytes(ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.protocol_ = byteString.toStringUtf8();
    }

    public static HttpRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static HttpRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static HttpRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static HttpRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static HttpRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HttpRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static HttpRequest parseFrom(InputStream inputStream) throws IOException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HttpRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HttpRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HttpRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HttpRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static HttpRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(HttpRequest httpRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(httpRequest);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<HttpRequest, Builder> implements HttpRequestOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        private Builder() {
            super(HttpRequest.DEFAULT_INSTANCE);
        }

        public final String getRequestMethod() {
            return ((HttpRequest) this.instance).getRequestMethod();
        }

        public final ByteString getRequestMethodBytes() {
            return ((HttpRequest) this.instance).getRequestMethodBytes();
        }

        public final Builder setRequestMethod(String str) {
            copyOnWrite();
            ((HttpRequest) this.instance).setRequestMethod(str);
            return this;
        }

        public final Builder clearRequestMethod() {
            copyOnWrite();
            ((HttpRequest) this.instance).clearRequestMethod();
            return this;
        }

        public final Builder setRequestMethodBytes(ByteString byteString) {
            copyOnWrite();
            ((HttpRequest) this.instance).setRequestMethodBytes(byteString);
            return this;
        }

        public final String getRequestUrl() {
            return ((HttpRequest) this.instance).getRequestUrl();
        }

        public final ByteString getRequestUrlBytes() {
            return ((HttpRequest) this.instance).getRequestUrlBytes();
        }

        public final Builder setRequestUrl(String str) {
            copyOnWrite();
            ((HttpRequest) this.instance).setRequestUrl(str);
            return this;
        }

        public final Builder clearRequestUrl() {
            copyOnWrite();
            ((HttpRequest) this.instance).clearRequestUrl();
            return this;
        }

        public final Builder setRequestUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((HttpRequest) this.instance).setRequestUrlBytes(byteString);
            return this;
        }

        public final long getRequestSize() {
            return ((HttpRequest) this.instance).getRequestSize();
        }

        public final Builder setRequestSize(long j) {
            copyOnWrite();
            ((HttpRequest) this.instance).setRequestSize(j);
            return this;
        }

        public final Builder clearRequestSize() {
            copyOnWrite();
            ((HttpRequest) this.instance).clearRequestSize();
            return this;
        }

        public final int getStatus() {
            return ((HttpRequest) this.instance).getStatus();
        }

        public final Builder setStatus(int i) {
            copyOnWrite();
            ((HttpRequest) this.instance).setStatus(i);
            return this;
        }

        public final Builder clearStatus() {
            copyOnWrite();
            ((HttpRequest) this.instance).clearStatus();
            return this;
        }

        public final long getResponseSize() {
            return ((HttpRequest) this.instance).getResponseSize();
        }

        public final Builder setResponseSize(long j) {
            copyOnWrite();
            ((HttpRequest) this.instance).setResponseSize(j);
            return this;
        }

        public final Builder clearResponseSize() {
            copyOnWrite();
            ((HttpRequest) this.instance).clearResponseSize();
            return this;
        }

        public final String getUserAgent() {
            return ((HttpRequest) this.instance).getUserAgent();
        }

        public final ByteString getUserAgentBytes() {
            return ((HttpRequest) this.instance).getUserAgentBytes();
        }

        public final Builder setUserAgent(String str) {
            copyOnWrite();
            ((HttpRequest) this.instance).setUserAgent(str);
            return this;
        }

        public final Builder clearUserAgent() {
            copyOnWrite();
            ((HttpRequest) this.instance).clearUserAgent();
            return this;
        }

        public final Builder setUserAgentBytes(ByteString byteString) {
            copyOnWrite();
            ((HttpRequest) this.instance).setUserAgentBytes(byteString);
            return this;
        }

        public final String getRemoteIp() {
            return ((HttpRequest) this.instance).getRemoteIp();
        }

        public final ByteString getRemoteIpBytes() {
            return ((HttpRequest) this.instance).getRemoteIpBytes();
        }

        public final Builder setRemoteIp(String str) {
            copyOnWrite();
            ((HttpRequest) this.instance).setRemoteIp(str);
            return this;
        }

        public final Builder clearRemoteIp() {
            copyOnWrite();
            ((HttpRequest) this.instance).clearRemoteIp();
            return this;
        }

        public final Builder setRemoteIpBytes(ByteString byteString) {
            copyOnWrite();
            ((HttpRequest) this.instance).setRemoteIpBytes(byteString);
            return this;
        }

        public final String getServerIp() {
            return ((HttpRequest) this.instance).getServerIp();
        }

        public final ByteString getServerIpBytes() {
            return ((HttpRequest) this.instance).getServerIpBytes();
        }

        public final Builder setServerIp(String str) {
            copyOnWrite();
            ((HttpRequest) this.instance).setServerIp(str);
            return this;
        }

        public final Builder clearServerIp() {
            copyOnWrite();
            ((HttpRequest) this.instance).clearServerIp();
            return this;
        }

        public final Builder setServerIpBytes(ByteString byteString) {
            copyOnWrite();
            ((HttpRequest) this.instance).setServerIpBytes(byteString);
            return this;
        }

        public final String getReferer() {
            return ((HttpRequest) this.instance).getReferer();
        }

        public final ByteString getRefererBytes() {
            return ((HttpRequest) this.instance).getRefererBytes();
        }

        public final Builder setReferer(String str) {
            copyOnWrite();
            ((HttpRequest) this.instance).setReferer(str);
            return this;
        }

        public final Builder clearReferer() {
            copyOnWrite();
            ((HttpRequest) this.instance).clearReferer();
            return this;
        }

        public final Builder setRefererBytes(ByteString byteString) {
            copyOnWrite();
            ((HttpRequest) this.instance).setRefererBytes(byteString);
            return this;
        }

        public final boolean hasLatency() {
            return ((HttpRequest) this.instance).hasLatency();
        }

        public final Duration getLatency() {
            return ((HttpRequest) this.instance).getLatency();
        }

        public final Builder setLatency(Duration duration) {
            copyOnWrite();
            ((HttpRequest) this.instance).setLatency(duration);
            return this;
        }

        public final Builder setLatency(Duration.Builder builder) {
            copyOnWrite();
            ((HttpRequest) this.instance).setLatency((Duration) builder.build());
            return this;
        }

        public final Builder mergeLatency(Duration duration) {
            copyOnWrite();
            ((HttpRequest) this.instance).mergeLatency(duration);
            return this;
        }

        public final Builder clearLatency() {
            copyOnWrite();
            ((HttpRequest) this.instance).clearLatency();
            return this;
        }

        public final boolean getCacheLookup() {
            return ((HttpRequest) this.instance).getCacheLookup();
        }

        public final Builder setCacheLookup(boolean z) {
            copyOnWrite();
            ((HttpRequest) this.instance).setCacheLookup(z);
            return this;
        }

        public final Builder clearCacheLookup() {
            copyOnWrite();
            ((HttpRequest) this.instance).clearCacheLookup();
            return this;
        }

        public final boolean getCacheHit() {
            return ((HttpRequest) this.instance).getCacheHit();
        }

        public final Builder setCacheHit(boolean z) {
            copyOnWrite();
            ((HttpRequest) this.instance).setCacheHit(z);
            return this;
        }

        public final Builder clearCacheHit() {
            copyOnWrite();
            ((HttpRequest) this.instance).clearCacheHit();
            return this;
        }

        public final boolean getCacheValidatedWithOriginServer() {
            return ((HttpRequest) this.instance).getCacheValidatedWithOriginServer();
        }

        public final Builder setCacheValidatedWithOriginServer(boolean z) {
            copyOnWrite();
            ((HttpRequest) this.instance).setCacheValidatedWithOriginServer(z);
            return this;
        }

        public final Builder clearCacheValidatedWithOriginServer() {
            copyOnWrite();
            ((HttpRequest) this.instance).clearCacheValidatedWithOriginServer();
            return this;
        }

        public final long getCacheFillBytes() {
            return ((HttpRequest) this.instance).getCacheFillBytes();
        }

        public final Builder setCacheFillBytes(long j) {
            copyOnWrite();
            ((HttpRequest) this.instance).setCacheFillBytes(j);
            return this;
        }

        public final Builder clearCacheFillBytes() {
            copyOnWrite();
            ((HttpRequest) this.instance).clearCacheFillBytes();
            return this;
        }

        public final String getProtocol() {
            return ((HttpRequest) this.instance).getProtocol();
        }

        public final ByteString getProtocolBytes() {
            return ((HttpRequest) this.instance).getProtocolBytes();
        }

        public final Builder setProtocol(String str) {
            copyOnWrite();
            ((HttpRequest) this.instance).setProtocol(str);
            return this;
        }

        public final Builder clearProtocol() {
            copyOnWrite();
            ((HttpRequest) this.instance).clearProtocol();
            return this;
        }

        public final Builder setProtocolBytes(ByteString byteString) {
            copyOnWrite();
            ((HttpRequest) this.instance).setProtocolBytes(byteString);
            return this;
        }
    }

    /* renamed from: com.google.logging.type.HttpRequest$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.logging.type.HttpRequest.AnonymousClass1.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new HttpRequest();
            case 2:
                return new Builder((AnonymousClass1) null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u000f\u000f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0004\u0005\u0002\u0006Ȉ\u0007Ȉ\bȈ\t\u0007\n\u0007\u000b\u0007\f\u0002\rȈ\u000e\t\u000fȈ", new Object[]{"requestMethod_", "requestUrl_", "requestSize_", "status_", "responseSize_", "userAgent_", "remoteIp_", "referer_", "cacheHit_", "cacheValidatedWithOriginServer_", "cacheLookup_", "cacheFillBytes_", "serverIp_", "latency_", "protocol_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<HttpRequest> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (HttpRequest.class) {
                    parser = PARSER;
                    if (parser == null) {
                        parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                        PARSER = parser;
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        HttpRequest httpRequest = new HttpRequest();
        DEFAULT_INSTANCE = httpRequest;
        GeneratedMessageLite.registerDefaultInstance(HttpRequest.class, httpRequest);
    }

    public static HttpRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<HttpRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
