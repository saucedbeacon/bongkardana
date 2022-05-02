package o;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import o.Draft_76;
import okhttp3.Protocol;

public final class postProcessHandshakeResponseAsServer {
    @Nullable
    public final HostnameVerifier IsOverlapping;
    public final List<generateFinalKey> equals;
    public final translateFrame getMax;
    public final List<Protocol> getMin;
    @Nullable
    public final Proxy isInside;
    public final toOpcode length;
    public final Draft_76 setMax;
    public final SocketFactory setMin;
    @Nullable
    public final SSLSocketFactory toFloatRange;
    public final ProxySelector toIntRange;
    @Nullable
    public final setParseMode toString;

    public postProcessHandshakeResponseAsServer(String str, int i, toOpcode toopcode, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable setParseMode setparsemode, translateFrame translateframe, @Nullable Proxy proxy, List<Protocol> list, List<generateFinalKey> list2, ProxySelector proxySelector) {
        String str2 = str;
        int i2 = i;
        toOpcode toopcode2 = toopcode;
        SocketFactory socketFactory2 = socketFactory;
        SSLSocketFactory sSLSocketFactory2 = sSLSocketFactory;
        translateFrame translateframe2 = translateframe;
        ProxySelector proxySelector2 = proxySelector;
        Draft_76.getMin getmin = new Draft_76.getMin();
        String str3 = sSLSocketFactory2 != null ? "https" : "http";
        if (str3.equalsIgnoreCase("http")) {
            getmin.setMin = "http";
        } else if (str3.equalsIgnoreCase("https")) {
            getmin.setMin = "https";
        } else {
            throw new IllegalArgumentException("unexpected scheme: ".concat(str3));
        }
        if (str2 != null) {
            String min = initCloseCode.getMin(Draft_76.getMin(str, 0, str.length(), false));
            if (min != null) {
                getmin.length = min;
                if (i2 <= 0 || i2 > 65535) {
                    throw new IllegalArgumentException("unexpected port: ".concat(String.valueOf(i)));
                }
                getmin.getMax = i2;
                this.setMax = getmin.setMin();
                if (toopcode2 != null) {
                    this.length = toopcode2;
                    if (socketFactory2 != null) {
                        this.setMin = socketFactory2;
                        if (translateframe2 != null) {
                            this.getMax = translateframe2;
                            if (list != null) {
                                this.getMin = initCloseCode.setMin(list);
                                if (list2 != null) {
                                    this.equals = initCloseCode.setMin(list2);
                                    if (proxySelector2 != null) {
                                        this.toIntRange = proxySelector2;
                                        this.isInside = proxy;
                                        this.toFloatRange = sSLSocketFactory2;
                                        this.IsOverlapping = hostnameVerifier;
                                        this.toString = setparsemode;
                                        return;
                                    }
                                    throw new NullPointerException("proxySelector == null");
                                }
                                throw new NullPointerException("connectionSpecs == null");
                            }
                            throw new NullPointerException("protocols == null");
                        }
                        throw new NullPointerException("proxyAuthenticator == null");
                    }
                    throw new NullPointerException("socketFactory == null");
                }
                throw new NullPointerException("dns == null");
            }
            throw new IllegalArgumentException("unexpected host: ".concat(String.valueOf(str)));
        }
        throw new NullPointerException("host == null");
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof postProcessHandshakeResponseAsServer)) {
            return false;
        }
        postProcessHandshakeResponseAsServer postprocesshandshakeresponseasserver = (postProcessHandshakeResponseAsServer) obj;
        return this.setMax.equals(postprocesshandshakeresponseasserver.setMax) && getMin(postprocesshandshakeresponseasserver);
    }

    public final int hashCode() {
        int hashCode = (((((((((((this.setMax.hashCode() + 527) * 31) + this.length.hashCode()) * 31) + this.getMax.hashCode()) * 31) + this.getMin.hashCode()) * 31) + this.equals.hashCode()) * 31) + this.toIntRange.hashCode()) * 31;
        Proxy proxy = this.isInside;
        int i = 0;
        int hashCode2 = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.toFloatRange;
        int hashCode3 = (hashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.IsOverlapping;
        int hashCode4 = (hashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        setParseMode setparsemode = this.toString;
        if (setparsemode != null) {
            i = setparsemode.hashCode();
        }
        return hashCode4 + i;
    }

    /* access modifiers changed from: package-private */
    public final boolean getMin(postProcessHandshakeResponseAsServer postprocesshandshakeresponseasserver) {
        return this.length.equals(postprocesshandshakeresponseasserver.length) && this.getMax.equals(postprocesshandshakeresponseasserver.getMax) && this.getMin.equals(postprocesshandshakeresponseasserver.getMin) && this.equals.equals(postprocesshandshakeresponseasserver.equals) && this.toIntRange.equals(postprocesshandshakeresponseasserver.toIntRange) && initCloseCode.setMin((Object) this.isInside, (Object) postprocesshandshakeresponseasserver.isInside) && initCloseCode.setMin((Object) this.toFloatRange, (Object) postprocesshandshakeresponseasserver.toFloatRange) && initCloseCode.setMin((Object) this.IsOverlapping, (Object) postprocesshandshakeresponseasserver.IsOverlapping) && initCloseCode.setMin((Object) this.toString, (Object) postprocesshandshakeresponseasserver.toString) && this.setMax.setMax == postprocesshandshakeresponseasserver.setMax.setMax;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        sb.append(this.setMax.getMin);
        sb.append(":");
        sb.append(this.setMax.setMax);
        if (this.isInside != null) {
            sb.append(", proxy=");
            sb.append(this.isInside);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.toIntRange);
        }
        sb.append("}");
        return sb.toString();
    }
}
