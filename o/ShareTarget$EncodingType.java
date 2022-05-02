package o;

import com.bca.xco.widget.connection.httpclient.p;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import o.PostMessageService;

public final class ShareTarget$EncodingType implements setLayoutResource {
    private boolean getMax;
    private onBind getMin;
    private volatile boolean setMax;
    private final getCardElevation setMin;

    public ShareTarget$EncodingType(getCardElevation getcardelevation) {
        this.setMin = getcardelevation;
    }

    public final boolean getMax() {
        return this.setMax;
    }

    public final boolean getMin() {
        return this.getMax;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ad, code lost:
        if (r6.equals(com.google.firebase.perf.FirebasePerformance.HttpMethod.HEAD) == false) goto L_0x013d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0140 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.getPreventCornerOverlap getMax(o.setLayoutResource.getMin r11) {
        /*
            r10 = this;
            o.getRadius r0 = r11.setMax()
            o.onBind r1 = new o.onBind
            o.getCardElevation r2 = r10.setMin
            o.BrowserActionsIntent$BrowserActionsUrlType r2 = r2.invoke
            com.bca.xco.widget.connection.httpclient.p r3 = r0.length
            o.getLayoutInflater r3 = r10.getMax((com.bca.xco.widget.connection.httpclient.p) r3)
            r1.<init>(r2, r3)
            r10.getMin = r1
            r1 = 0
            r2 = 0
            r3 = r2
            r4 = 0
        L_0x0019:
            boolean r5 = r10.setMax
            r6 = 1
            if (r5 != 0) goto L_0x01ec
            r5 = r11
            o.getTokenStore r5 = (o.getTokenStore) r5     // Catch:{ e -> 0x01cf, IOException -> 0x01c5 }
            o.onBind r7 = r10.getMin     // Catch:{ e -> 0x01cf, IOException -> 0x01c5 }
            o.getPreventCornerOverlap r0 = r5.setMax(r0, r7, r2, r2)     // Catch:{ e -> 0x01cf, IOException -> 0x01c5 }
            if (r3 == 0) goto L_0x004c
            o.getPreventCornerOverlap$setMax r5 = new o.getPreventCornerOverlap$setMax
            r5.<init>(r0, r1)
            o.getPreventCornerOverlap$setMax r0 = new o.getPreventCornerOverlap$setMax
            r0.<init>(r3, r1)
            r0.toIntRange = r2
            o.getPreventCornerOverlap r0 = r0.getMin()
            o.setPreventCornerOverlap r3 = r0.IsOverlapping
            if (r3 != 0) goto L_0x0044
            r5.isInside = r0
            o.getPreventCornerOverlap r0 = r5.getMin()
            goto L_0x004c
        L_0x0044:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "priorResponse.body != null"
            r11.<init>(r0)
            throw r11
        L_0x004c:
            r3 = r0
            if (r3 == 0) goto L_0x01bd
            o.onBind r0 = r10.getMin
            o.saveBitmap r0 = r0.getMin()
            if (r0 == 0) goto L_0x005c
            o.access$201 r0 = r0.setMin()
            goto L_0x005d
        L_0x005c:
            r0 = r2
        L_0x005d:
            int r5 = r3.length
            o.getRadius r6 = r3.getMin
            java.lang.String r6 = r6.setMax
            r7 = 307(0x133, float:4.3E-43)
            java.lang.String r8 = "GET"
            if (r5 == r7) goto L_0x00a1
            r7 = 308(0x134, float:4.32E-43)
            if (r5 == r7) goto L_0x00a1
            r7 = 407(0x197, float:5.7E-43)
            if (r5 == r7) goto L_0x0086
            r0 = 408(0x198, float:5.72E-43)
            if (r5 == r0) goto L_0x007a
            switch(r5) {
                case 300: goto L_0x00af;
                case 301: goto L_0x00af;
                case 302: goto L_0x00af;
                case 303: goto L_0x00af;
                default: goto L_0x0078;
            }
        L_0x0078:
            goto L_0x013d
        L_0x007a:
            o.getRadius r0 = r3.getMin
            o.get r0 = r0.getMin
            boolean r0 = r0 instanceof o.PostMessageService.AnonymousClass1
            if (r0 != 0) goto L_0x013d
            o.getRadius r0 = r3.getMin
            goto L_0x013e
        L_0x0086:
            if (r0 == 0) goto L_0x008b
            java.net.Proxy r0 = r0.getMax
            goto L_0x008f
        L_0x008b:
            o.getCardElevation r0 = r10.setMin
            java.net.Proxy r0 = r0.getMax
        L_0x008f:
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r5 = java.net.Proxy.Type.HTTP
            if (r0 != r5) goto L_0x0099
            goto L_0x013d
        L_0x0099:
            java.net.ProtocolException r11 = new java.net.ProtocolException
            java.lang.String r0 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r11.<init>(r0)
            throw r11
        L_0x00a1:
            boolean r0 = r6.equals(r8)
            if (r0 != 0) goto L_0x00af
            java.lang.String r0 = "HEAD"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x013d
        L_0x00af:
            o.getCardElevation r0 = r10.setMin
            boolean r0 = r0.getMin()
            if (r0 == 0) goto L_0x013d
            java.lang.String r0 = "Location"
            java.lang.String r0 = r3.setMax(r0)
            if (r0 == 0) goto L_0x013d
            o.getRadius r5 = r3.getMin
            com.bca.xco.widget.connection.httpclient.p r5 = r5.length
            com.bca.xco.widget.connection.httpclient.p$a r0 = r5.getMin(r0)
            if (r0 == 0) goto L_0x00ce
            com.bca.xco.widget.connection.httpclient.p r0 = r0.getMin()
            goto L_0x00cf
        L_0x00ce:
            r0 = r2
        L_0x00cf:
            if (r0 == 0) goto L_0x013d
            java.lang.String r5 = r0.length
            o.getRadius r7 = r3.getMin
            com.bca.xco.widget.connection.httpclient.p r7 = r7.length
            java.lang.String r7 = r7.length
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x00e7
            o.getCardElevation r5 = r10.setMin
            boolean r5 = r5.getMax()
            if (r5 == 0) goto L_0x013d
        L_0x00e7:
            o.getRadius r5 = r3.getMin
            o.getRadius$length r7 = new o.getRadius$length
            r7.<init>(r5, r1)
            boolean r5 = o.onGetSmallIconBitmap.setMax(r6)
            if (r5 == 0) goto L_0x011e
            boolean r5 = o.onGetSmallIconBitmap.getMin(r6)
            boolean r9 = o.onGetSmallIconBitmap.setMin(r6)
            if (r9 == 0) goto L_0x0102
            r7.length(r8, r2)
            goto L_0x010d
        L_0x0102:
            if (r5 == 0) goto L_0x0109
            o.getRadius r8 = r3.getMin
            o.get r8 = r8.getMin
            goto L_0x010a
        L_0x0109:
            r8 = r2
        L_0x010a:
            r7.length(r6, r8)
        L_0x010d:
            if (r5 != 0) goto L_0x011e
            java.lang.String r5 = "Transfer-Encoding"
            r7.setMax(r5)
            java.lang.String r5 = "Content-Length"
            r7.setMax(r5)
            java.lang.String r5 = "Content-Type"
            r7.setMax(r5)
        L_0x011e:
            boolean r5 = length(r3, r0)
            if (r5 != 0) goto L_0x0129
            java.lang.String r5 = "Authorization"
            r7.setMax(r5)
        L_0x0129:
            r7.getMin = r0
            com.bca.xco.widget.connection.httpclient.p r0 = r7.getMin
            if (r0 == 0) goto L_0x0135
            o.getRadius r0 = new o.getRadius
            r0.<init>(r7, r1)
            goto L_0x013e
        L_0x0135:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "url == null"
            r11.<init>(r0)
            throw r11
        L_0x013d:
            r0 = r2
        L_0x013e:
            if (r0 != 0) goto L_0x014a
            boolean r11 = r10.getMax
            if (r11 != 0) goto L_0x0149
            o.onBind r11 = r10.getMin
            r11.length()
        L_0x0149:
            return r3
        L_0x014a:
            o.setPreventCornerOverlap r5 = r3.IsOverlapping
            o.CustomTabsIntent$ShareState.setMin((java.io.Closeable) r5)
            int r4 = r4 + 1
            r5 = 20
            if (r4 > r5) goto L_0x01a8
            o.get r5 = r0.getMin
            boolean r5 = r5 instanceof o.PostMessageService.AnonymousClass1
            if (r5 != 0) goto L_0x019e
            com.bca.xco.widget.connection.httpclient.p r5 = r0.length
            boolean r5 = length(r3, r5)
            if (r5 != 0) goto L_0x017b
            o.onBind r5 = r10.getMin
            r5.length()
            o.onBind r5 = new o.onBind
            o.getCardElevation r6 = r10.setMin
            o.BrowserActionsIntent$BrowserActionsUrlType r6 = r6.invoke
            com.bca.xco.widget.connection.httpclient.p r7 = r0.length
            o.getLayoutInflater r7 = r10.getMax((com.bca.xco.widget.connection.httpclient.p) r7)
            r5.<init>(r6, r7)
            r10.getMin = r5
            goto L_0x0019
        L_0x017b:
            o.onBind r5 = r10.getMin
            o.ScreenOrientation$LockType r5 = r5.setMax()
            if (r5 != 0) goto L_0x0185
            goto L_0x0019
        L_0x0185:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Closing the body of "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = " didn't close its backing stream. Bad interceptor?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        L_0x019e:
            java.net.HttpRetryException r11 = new java.net.HttpRetryException
            int r0 = r3.length
            java.lang.String r1 = "Cannot retry streamed HTTP body"
            r11.<init>(r1, r0)
            throw r11
        L_0x01a8:
            o.onBind r11 = r10.getMin
            r11.length()
            java.net.ProtocolException r11 = new java.net.ProtocolException
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "Too many follow-up requests: "
            java.lang.String r0 = r1.concat(r0)
            r11.<init>(r0)
            throw r11
        L_0x01bd:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>()
            throw r11
        L_0x01c3:
            r11 = move-exception
            goto L_0x01e1
        L_0x01c5:
            r5 = move-exception
            boolean r6 = r10.getMin(r5, r1, r0)     // Catch:{ all -> 0x01c3 }
            if (r6 == 0) goto L_0x01ce
            goto L_0x0019
        L_0x01ce:
            throw r5     // Catch:{ all -> 0x01c3 }
        L_0x01cf:
            r5 = move-exception
            java.io.IOException r7 = r5.a()     // Catch:{ all -> 0x01c3 }
            boolean r6 = r10.getMin(r7, r6, r0)     // Catch:{ all -> 0x01c3 }
            if (r6 == 0) goto L_0x01dc
            goto L_0x0019
        L_0x01dc:
            java.io.IOException r11 = r5.a()     // Catch:{ all -> 0x01c3 }
            throw r11     // Catch:{ all -> 0x01c3 }
        L_0x01e1:
            o.onBind r0 = r10.getMin
            r0.getMax(r2)
            o.onBind r0 = r10.getMin
            r0.length()
            throw r11
        L_0x01ec:
            o.onBind r11 = r10.getMin
            r11.getMax(r1, r6, r1)
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r0 = "Canceled"
            r11.<init>(r0)
            goto L_0x01fa
        L_0x01f9:
            throw r11
        L_0x01fa:
            goto L_0x01f9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ShareTarget$EncodingType.getMax(o.setLayoutResource$getMin):o.getPreventCornerOverlap");
    }

    private getLayoutInflater getMax(p pVar) {
        setLayoutInflater setlayoutinflater;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        p pVar2 = pVar;
        if (pVar.setMin()) {
            SSLSocketFactory sSLSocketFactory2 = this.setMin.values;
            hostnameVerifier = this.setMin.toDoubleRange;
            sSLSocketFactory = sSLSocketFactory2;
            setlayoutinflater = this.setMin.hashCode;
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            setlayoutinflater = null;
        }
        return new getLayoutInflater(pVar2.setMax, pVar2.getMax, this.setMin.Mean$Arithmetic, this.setMin.toString, sSLSocketFactory, hostnameVerifier, setlayoutinflater, this.setMin.Grayscale$Algorithm, this.setMin.getMax, this.setMin.setMin, this.setMin.setMax, this.setMin.isInside);
    }

    private boolean getMin(IOException iOException, boolean z, getRadius getradius) {
        this.getMin.getMax(iOException);
        if (!this.setMin.setMax()) {
            return false;
        }
        if ((z || !(getradius.getMin instanceof PostMessageService.AnonymousClass1)) && getMax(iOException, z) && this.getMin.getMax()) {
            return true;
        }
        return false;
    }

    private static boolean getMax(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
            return true;
        } else if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean length(getPreventCornerOverlap getpreventcorneroverlap, p pVar) {
        p pVar2 = getpreventcorneroverlap.getMin.length;
        return pVar2.setMax.equals(pVar.setMax) && pVar2.getMax == pVar.getMax && pVar2.length.equals(pVar.length);
    }
}
