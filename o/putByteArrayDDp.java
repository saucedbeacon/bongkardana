package o;

import android.content.Context;
import com.google.common.base.Strings;
import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import io.split.android.client.network.HttpClient;
import io.split.android.client.network.HttpMethod;
import io.split.android.client.network.HttpRequest;
import io.split.android.client.network.HttpStreamRequest;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import o.InvalidDataException;
import o.generateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class putByteArrayDDp implements HttpClient {
    private static final String PROXY_AUTHORIZATION_HEADER = "Proxy-Authorization";
    private static final long STREAMING_READ_TIMEOUT_IN_MILLISECONDS = 80000;
    private Map<String, String> mCommonHeaders;
    private generateKey mOkHttpClient;
    private generateKey mOkHttpClientStreaming;
    private Map<String, String> mStreamingHeaders;

    private putByteArrayDDp(generateKey generatekey, generateKey generatekey2) {
        this.mCommonHeaders = new HashMap();
        this.mStreamingHeaders = new HashMap();
        this.mOkHttpClient = generatekey;
        this.mOkHttpClientStreaming = generatekey2;
    }

    public final HttpRequest request(URI uri, HttpMethod httpMethod, String str, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.mCommonHeaders);
        if (map != null) {
            hashMap.putAll(map);
        }
        return new removeStringDDp(this.mOkHttpClient, uri, httpMethod, str, hashMap);
    }

    public final HttpRequest request(URI uri, HttpMethod httpMethod) {
        return request(uri, httpMethod, (String) null);
    }

    public final HttpRequest request(URI uri, HttpMethod httpMethod, String str) {
        return request(uri, httpMethod, str, (Map<String, String>) null);
    }

    public final HttpStreamRequest streamRequest(URI uri) {
        return new removeByteArrayDDp(this.mOkHttpClientStreaming, uri, this.mStreamingHeaders);
    }

    public final void setHeader(String str, String str2) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException(String.format("Invalid value for header %s: %s", new Object[]{str, str2}));
        } else {
            this.mCommonHeaders.put(str, str2);
        }
    }

    public final void setStreamingHeader(String str, String str2) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException(String.format("Invalid value for streaming header %s: %s", new Object[]{str, str2}));
        } else {
            this.mStreamingHeaders.put(str, str2);
        }
    }

    public final void addHeaders(Map<String, String> map) {
        for (Map.Entry next : map.entrySet()) {
            setHeader((String) next.getKey(), (String) next.getValue());
        }
    }

    public final void addStreamingHeaders(Map<String, String> map) {
        for (Map.Entry next : map.entrySet()) {
            setStreamingHeader((String) next.getKey(), (String) next.getValue());
        }
    }

    public final void close() {
        this.mOkHttpClient.b.length();
        this.mOkHttpClientStreaming.b.length();
    }

    public static class getMax {
        private long connectionTimeout = -1;
        private boolean isSslDevelopmentMode = false;
        private Context mHostAppContext;
        private getStringDDp mProxy;
        private translateFrame mProxyAuthenticator;
        private long readTimeout = -1;

        public getMax setContext(Context context) {
            this.mHostAppContext = context;
            return this;
        }

        public getMax setProxy(getStringDDp getstringddp) {
            this.mProxy = getstringddp;
            return this;
        }

        public getMax setProxyAuthenticator(translateFrame translateframe) {
            this.mProxyAuthenticator = translateframe;
            return this;
        }

        public getMax setReadTimeout(long j) {
            this.readTimeout = j;
            return this;
        }

        public getMax setConnectionTimeout(long j) {
            this.connectionTimeout = j;
            return this;
        }

        public getMax enableSslDevelopmentMode(boolean z) {
            this.isSslDevelopmentMode = z;
            return this;
        }

        public HttpClient build() {
            translateFrame translateframe;
            Proxy proxy;
            getStringDDp getstringddp = this.mProxy;
            if (getstringddp != null) {
                proxy = createProxy(getstringddp);
                translateframe = this.mProxyAuthenticator;
                if (translateframe == null) {
                    translateframe = !Strings.isNullOrEmpty(this.mProxy.getUsername()) ? createBasicAuthenticator(this.mProxy.getUsername(), this.mProxy.getPassword()) : null;
                }
            } else {
                proxy = null;
                translateframe = null;
            }
            translateFrame translateframe2 = translateframe;
            return new putByteArrayDDp(createOkHttpClient(proxy, translateframe2, Long.valueOf(this.readTimeout), Long.valueOf(this.connectionTimeout), this.isSslDevelopmentMode, this.mHostAppContext), createOkHttpClient(proxy, translateframe2, Long.valueOf(putByteArrayDDp.STREAMING_READ_TIMEOUT_IN_MILLISECONDS), Long.valueOf(this.connectionTimeout), this.isSslDevelopmentMode, this.mHostAppContext));
        }

        private generateKey createOkHttpClient(Proxy proxy, translateFrame translateframe, Long l, Long l2, boolean z, Context context) {
            generateKey.getMax getmax = new generateKey.getMax();
            if (proxy != null) {
                getmax.getMax = proxy;
            }
            if (translateframe != null) {
                if (translateframe != null) {
                    getmax.invokeSuspend = translateframe;
                } else {
                    throw new NullPointerException("proxyAuthenticator == null");
                }
            }
            if (l != null && l.longValue() > 0) {
                getmax.extraCallback = initCloseCode.getMax(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT, l.longValue(), TimeUnit.MILLISECONDS);
            }
            if (l2 != null && l2.longValue() > 0) {
                getmax.getCause = initCloseCode.getMax(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT, l2.longValue(), TimeUnit.MILLISECONDS);
            }
            if (z) {
                setupDevelopmentSslSocketFactory(getmax);
            } else if (putStringDDpEx.couldBeOld()) {
                forceTls12OnOldAndroid(getmax, context);
            }
            return new generateKey(getmax);
        }

        private Proxy createProxy(getStringDDp getstringddp) {
            if (getstringddp == null) {
                return null;
            }
            return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(getstringddp.getHost(), getstringddp.getPort()));
        }

        private translateFrame createBasicAuthenticator(final String str, final String str2) {
            return new translateFrame() {
                @Nullable
                public final InvalidDataException authenticate(@Nullable getCloseCode getclosecode, @NotNull InvalidHandshakeException invalidHandshakeException) throws IOException {
                    String str = str;
                    String str2 = str2;
                    Charset charset = initCloseCode.toFloatRange;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(":");
                    sb.append(str2);
                    InvalidDataException.getMin max = new InvalidDataException.getMin(invalidHandshakeException.getMin).setMax("Proxy-Authorization", "Basic ".concat(String.valueOf(printConnMonitorLog.encodeString(sb.toString(), charset).base64())));
                    if (max.getMin != null) {
                        return new InvalidDataException(max);
                    }
                    throw new IllegalStateException("url == null");
                }
            };
        }

        private void setupDevelopmentSslSocketFactory(generateKey.getMax getmax) {
            getByteArrayDDp getbytearrayddp = new getByteArrayDDp();
            SSLSocketFactory sslSocketFactory = getbytearrayddp.sslSocketFactory();
            if (sslSocketFactory != null) {
                getmax.setMin(sslSocketFactory, getbytearrayddp.x509TrustManager());
                HostnameVerifier hostnameVerifier = getbytearrayddp.hostnameVerifier();
                if (hostnameVerifier != null) {
                    getmax.toDoubleRange = hostnameVerifier;
                    return;
                }
                throw new NullPointerException("hostnameVerifier == null");
            }
        }

        private void forceTls12OnOldAndroid(generateKey.getMax getmax, Context context) {
            putStringDDpEx.update(context);
            try {
                removeByteArrayDDpEx removebytearrayddpex = new removeByteArrayDDpEx();
                getmax.setMin(removebytearrayddpex, removebytearrayddpex.defaultTrustManager());
            } catch (KeyManagementException | NoSuchAlgorithmException e) {
                StringBuilder sb = new StringBuilder("TLS v12 algorithm not available: ");
                sb.append(e.getLocalizedMessage());
                createLoadingDialog.e(sb.toString());
            } catch (GeneralSecurityException e2) {
                StringBuilder sb2 = new StringBuilder("TLS v12 security error: ");
                sb2.append(e2.getLocalizedMessage());
                createLoadingDialog.e(sb2.toString());
            } catch (Exception e3) {
                StringBuilder sb3 = new StringBuilder("Unknown TLS v12 error: ");
                sb3.append(e3.getLocalizedMessage());
                createLoadingDialog.e(sb3.toString());
            }
        }
    }
}
