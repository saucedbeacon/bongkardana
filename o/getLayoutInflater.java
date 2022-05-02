package o;

import com.bca.xco.widget.connection.httpclient.p;
import com.bca.xco.widget.connection.httpclient.s;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import o.Toolbar;

public final class getLayoutInflater {
    public final ProxySelector IsOverlapping;
    public final Proxy equals;
    public final SocketFactory getMax;
    public final List<s> getMin;
    public final SSLSocketFactory isInside;
    public final ViewStubCompat length;
    public final p setMax;
    public final Toolbar.LayoutParams setMin;
    public final List<BrowserActionsIntent$BrowserActionsItemId> toFloatRange;
    public final HostnameVerifier toIntRange;
    public final setLayoutInflater toString;

    public getLayoutInflater(String str, int i, Toolbar.LayoutParams layoutParams, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, setLayoutInflater setlayoutinflater, ViewStubCompat viewStubCompat, Proxy proxy, List<s> list, List<BrowserActionsIntent$BrowserActionsItemId> list2, ProxySelector proxySelector) {
        String str2 = str;
        int i2 = i;
        Toolbar.LayoutParams layoutParams2 = layoutParams;
        SocketFactory socketFactory2 = socketFactory;
        SSLSocketFactory sSLSocketFactory2 = sSLSocketFactory;
        ViewStubCompat viewStubCompat2 = viewStubCompat;
        ProxySelector proxySelector2 = proxySelector;
        p.a aVar = new p.a();
        String str3 = sSLSocketFactory2 != null ? "https" : "http";
        if (str3.equalsIgnoreCase("http")) {
            aVar.getMax = "http";
        } else if (str3.equalsIgnoreCase("https")) {
            aVar.getMax = "https";
        } else {
            throw new IllegalArgumentException("unexpected scheme: ".concat(str3));
        }
        if (str2 != null) {
            String min = p.a.getMin(str, 0, str.length());
            if (min != null) {
                aVar.length = min;
                if (i2 <= 0 || i2 > 65535) {
                    throw new IllegalArgumentException("unexpected port: ".concat(String.valueOf(i)));
                }
                aVar.setMax = i2;
                this.setMax = aVar.getMin();
                if (layoutParams2 != null) {
                    this.setMin = layoutParams2;
                    if (socketFactory2 != null) {
                        this.getMax = socketFactory2;
                        if (viewStubCompat2 != null) {
                            this.length = viewStubCompat2;
                            if (list != null) {
                                this.getMin = CustomTabsIntent$ShareState.setMin(list);
                                if (list2 != null) {
                                    this.toFloatRange = CustomTabsIntent$ShareState.setMin(list2);
                                    if (proxySelector2 != null) {
                                        this.IsOverlapping = proxySelector2;
                                        this.equals = proxy;
                                        this.isInside = sSLSocketFactory2;
                                        this.toIntRange = hostnameVerifier;
                                        this.toString = setlayoutinflater;
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

    public final boolean equals(Object obj) {
        if (obj instanceof getLayoutInflater) {
            getLayoutInflater getlayoutinflater = (getLayoutInflater) obj;
            if (!this.setMax.equals(getlayoutinflater.setMax) || !this.setMin.equals(getlayoutinflater.setMin) || !this.length.equals(getlayoutinflater.length) || !this.getMin.equals(getlayoutinflater.getMin) || !this.toFloatRange.equals(getlayoutinflater.toFloatRange) || !this.IsOverlapping.equals(getlayoutinflater.IsOverlapping) || !CustomTabsIntent$ShareState.getMax((Object) this.equals, (Object) getlayoutinflater.equals) || !CustomTabsIntent$ShareState.getMax((Object) this.isInside, (Object) getlayoutinflater.isInside) || !CustomTabsIntent$ShareState.getMax((Object) this.toIntRange, (Object) getlayoutinflater.toIntRange) || !CustomTabsIntent$ShareState.getMax((Object) this.toString, (Object) getlayoutinflater.toString)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((((this.setMax.hashCode() + 527) * 31) + this.setMin.hashCode()) * 31) + this.length.hashCode()) * 31) + this.getMin.hashCode()) * 31) + this.toFloatRange.hashCode()) * 31) + this.IsOverlapping.hashCode()) * 31;
        Proxy proxy = this.equals;
        int i = 0;
        int hashCode2 = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.isInside;
        int hashCode3 = (hashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.toIntRange;
        int hashCode4 = (hashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        setLayoutInflater setlayoutinflater = this.toString;
        if (setlayoutinflater != null) {
            i = setlayoutinflater.hashCode();
        }
        return hashCode4 + i;
    }
}
