package o;

import com.bca.xco.widget.connection.httpclient.z;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

public final class getContentPaddingRight {
    public final List<Certificate> getMax;
    private final List<Certificate> getMin;
    private final z length;
    public final BrowserServiceFileProvider setMax;

    private getContentPaddingRight(z zVar, BrowserServiceFileProvider browserServiceFileProvider, List<Certificate> list, List<Certificate> list2) {
        this.length = zVar;
        this.setMax = browserServiceFileProvider;
        this.getMax = list;
        this.getMin = list2;
    }

    public static getContentPaddingRight getMax(SSLSession sSLSession) {
        Certificate[] certificateArr;
        List list;
        List list2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            BrowserServiceFileProvider max = BrowserServiceFileProvider.setMax(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol != null) {
                z a2 = z.a(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                if (certificateArr != null) {
                    list = CustomTabsIntent$ShareState.getMin((T[]) certificateArr);
                } else {
                    list = Collections.emptyList();
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                if (localCertificates != null) {
                    list2 = CustomTabsIntent$ShareState.getMin((T[]) localCertificates);
                } else {
                    list2 = Collections.emptyList();
                }
                return new getContentPaddingRight(a2, max, list, list2);
            }
            throw new IllegalStateException("tlsVersion == null");
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof getContentPaddingRight)) {
            return false;
        }
        getContentPaddingRight getcontentpaddingright = (getContentPaddingRight) obj;
        if (!CustomTabsIntent$ShareState.getMax((Object) this.setMax, (Object) getcontentpaddingright.setMax) || !this.setMax.equals(getcontentpaddingright.setMax) || !this.getMax.equals(getcontentpaddingright.getMax) || !this.getMin.equals(getcontentpaddingright.getMin)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        z zVar = this.length;
        return (((((((zVar != null ? zVar.hashCode() : 0) + 527) * 31) + this.setMax.hashCode()) * 31) + this.getMax.hashCode()) * 31) + this.getMin.hashCode();
    }
}
