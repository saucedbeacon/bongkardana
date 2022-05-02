package o;

import com.alibaba.griver.base.common.utils.NetworkUtils;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import okhttp3.TlsVersion;

public final class createBuffer {
    public final readVersion getMax;
    public final List<Certificate> getMin;
    final List<Certificate> length;
    final TlsVersion setMin;

    private createBuffer(TlsVersion tlsVersion, readVersion readversion, List<Certificate> list, List<Certificate> list2) {
        this.setMin = tlsVersion;
        this.getMax = readversion;
        this.getMin = list;
        this.length = list2;
    }

    public static createBuffer getMax(SSLSession sSLSession) throws IOException {
        Certificate[] certificateArr;
        List list;
        List list2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        } else if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            readVersion max = readVersion.getMax(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            } else if (!NetworkUtils.NETWORK_TYPE_NONE.equals(protocol)) {
                TlsVersion forJavaName = TlsVersion.forJavaName(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                if (certificateArr != null) {
                    list = initCloseCode.setMin((T[]) certificateArr);
                } else {
                    list = Collections.emptyList();
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                if (localCertificates != null) {
                    list2 = initCloseCode.setMin((T[]) localCertificates);
                } else {
                    list2 = Collections.emptyList();
                }
                return new createBuffer(forJavaName, max, list, list2);
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
    }

    public static createBuffer setMin(TlsVersion tlsVersion, readVersion readversion, List<Certificate> list, List<Certificate> list2) {
        if (tlsVersion == null) {
            throw new NullPointerException("tlsVersion == null");
        } else if (readversion != null) {
            return new createBuffer(tlsVersion, readversion, initCloseCode.setMin(list), initCloseCode.setMin(list2));
        } else {
            throw new NullPointerException("cipherSuite == null");
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof createBuffer)) {
            return false;
        }
        createBuffer createbuffer = (createBuffer) obj;
        if (!this.setMin.equals(createbuffer.setMin) || !this.getMax.equals(createbuffer.getMax) || !this.getMin.equals(createbuffer.getMin) || !this.length.equals(createbuffer.length)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((this.setMin.hashCode() + 527) * 31) + this.getMax.hashCode()) * 31) + this.getMin.hashCode()) * 31) + this.length.hashCode();
    }
}
