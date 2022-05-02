package o;

import com.bca.xco.widget.connection.httpclient.internal.b.e;
import com.bca.xco.widget.connection.httpclient.internal.http2.a;
import com.bca.xco.widget.connection.httpclient.p;
import com.bca.xco.widget.connection.httpclient.s;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o.getPreventCornerOverlap;
import o.getRadius;
import o.setContentPadding;

public final class saveBitmap extends setContentPadding.setMin implements getInflatedId {
    public int IsOverlapping;
    public final List<Reference<onBind>> equals = new ArrayList();
    public Socket getMax;
    public getContentPaddingRight getMin;
    public long hashCode = Long.MAX_VALUE;
    public boolean isInside;
    public volatile setContentPadding length;
    public final access$201 setMax;
    public int setMin;
    private s toDoubleRange;
    public resize toFloatRange;
    public put toIntRange;
    private Socket toString;

    public saveBitmap(access$201 access_201) {
        this.setMax = access_201;
    }

    public final void getMin(int i, int i2, int i3, List<BrowserActionsIntent$BrowserActionsItemId> list, boolean z) {
        if (this.toDoubleRange == null) {
            loadBitmap loadbitmap = new loadBitmap(list);
            if (this.setMax.length.isInside == null) {
                if (list.contains(BrowserActionsIntent$BrowserActionsItemId.getMax)) {
                    String str = this.setMax.length.setMax.setMax;
                    if (!PostMessageService.getMax().getMax(str)) {
                        StringBuilder sb = new StringBuilder("CLEARTEXT communication to ");
                        sb.append(str);
                        sb.append(" not permitted by network security policy");
                        throw new e(new UnknownServiceException(sb.toString()));
                    }
                } else {
                    throw new e(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
                }
            }
            e eVar = null;
            while (this.toDoubleRange == null) {
                try {
                    if (this.setMax.getMin()) {
                        getRadius.length length2 = new getRadius.length();
                        p pVar = this.setMax.length.setMax;
                        if (pVar != null) {
                            length2.getMin = pVar;
                            getRadius.length max = length2.setMax(HttpHeaders.HOST, CustomTabsIntent$ShareState.length(this.setMax.length.setMax, true)).setMax("Proxy-Connection", "Keep-Alive").setMax(HttpHeaders.USER_AGENT, "okhttp/${project.version}");
                            if (max.getMin != null) {
                                getRadius getradius = new getRadius(max, (byte) 0);
                                p pVar2 = getradius.length;
                                setMin(i, i2);
                                StringBuilder sb2 = new StringBuilder("CONNECT ");
                                sb2.append(CustomTabsIntent$ShareState.length(pVar2, true));
                                sb2.append(" HTTP/1.1");
                                String obj = sb2.toString();
                                cleanUpSession cleanupsession = new cleanUpSession((getCardElevation) null, (onBind) null, this.toIntRange, this.toFloatRange);
                                this.toIntRange.setMin().length((long) i2, TimeUnit.MILLISECONDS);
                                this.toFloatRange.setMin().length((long) i3, TimeUnit.MILLISECONDS);
                                cleanupsession.length(getradius.setMin, obj);
                                cleanupsession.setMin.flush();
                                getPreventCornerOverlap.setMax min = cleanupsession.setMin();
                                min.setMax = getradius;
                                getPreventCornerOverlap min2 = min.getMin();
                                long max2 = onCancelNotification.getMax(min2.toFloatRange.setMax("Content-Length"));
                                if (max2 == -1) {
                                    max2 = 0;
                                }
                                safeSizeOf min3 = cleanupsession.setMin(max2);
                                CustomTabsIntent$ShareState.getMin(min3, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
                                min3.close();
                                int i4 = min2.length;
                                if (i4 != 200) {
                                    if (i4 != 407) {
                                        StringBuilder sb3 = new StringBuilder("Unexpected response code for CONNECT: ");
                                        sb3.append(min2.length);
                                        throw new IOException(sb3.toString());
                                    }
                                    throw new IOException("Failed to authenticate with proxy");
                                } else if (!this.toIntRange.setMax().length() || !this.toFloatRange.setMax().length()) {
                                    throw new IOException("TLS tunnel buffered too many bytes!");
                                } else {
                                    getMin(loadbitmap);
                                }
                            } else {
                                throw new IllegalStateException("url == null");
                            }
                        } else {
                            throw new NullPointerException("url == null");
                        }
                    } else {
                        setMin(i, i2);
                        getMin(loadbitmap);
                    }
                } catch (IOException e) {
                    CustomTabsIntent$ShareState.setMax(this.getMax);
                    CustomTabsIntent$ShareState.setMax(this.toString);
                    this.getMax = null;
                    this.toString = null;
                    this.toIntRange = null;
                    this.toFloatRange = null;
                    this.getMin = null;
                    this.toDoubleRange = null;
                    if (eVar == null) {
                        eVar = new e(e);
                    } else {
                        eVar.a(e);
                    }
                    if (!z || !loadbitmap.length(e)) {
                        throw eVar;
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("already connected");
    }

    private void setMin(int i, int i2) {
        Socket socket;
        Proxy proxy = this.setMax.getMax;
        getLayoutInflater getlayoutinflater = this.setMax.length;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) {
            socket = getlayoutinflater.getMax.createSocket();
        } else {
            socket = new Socket(proxy);
        }
        this.toString = socket;
        socket.setSoTimeout(i2);
        try {
            PostMessageService.getMax().getMax(this.toString, this.setMax.getMin, i);
            this.toIntRange = putCount.getMax(putCount.setMax(this.toString));
            this.toFloatRange = putCount.getMax(putCount.setMin(this.toString));
        } catch (ConnectException unused) {
            StringBuilder sb = new StringBuilder("Failed to connect to ");
            sb.append(this.setMax.getMin);
            throw new ConnectException(sb.toString());
        }
    }

    private void getMin(loadBitmap loadbitmap) {
        if (this.setMax.length.isInside != null) {
            getMax(loadbitmap);
        } else {
            this.toDoubleRange = s.HTTP_1_1;
            this.getMax = this.toString;
        }
        if (this.toDoubleRange == s.HTTP_2) {
            this.getMax.setSoTimeout(0);
            setContentPadding.getMax getmax = new setContentPadding.getMax();
            Socket socket = this.getMax;
            String str = this.setMax.length.setMax.setMax;
            put put = this.toIntRange;
            resize resize = this.toFloatRange;
            getmax.setMax = socket;
            getmax.length = str;
            getmax.getMin = put;
            getmax.getMax = resize;
            getmax.setMin = this;
            setContentPadding setcontentpadding = new setContentPadding(getmax, (byte) 0);
            setcontentpadding.setMin();
            this.IsOverlapping = setcontentpadding.setMax();
            this.length = setcontentpadding;
            return;
        }
        this.IsOverlapping = 1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.net.Socket, javax.net.ssl.SSLSocket] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ea A[Catch:{ all -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f0 A[Catch:{ all -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f3  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void getMax(o.loadBitmap r8) {
        /*
            r7 = this;
            o.access$201 r0 = r7.setMax
            o.getLayoutInflater r0 = r0.length
            javax.net.ssl.SSLSocketFactory r1 = r0.isInside
            r2 = 0
            java.net.Socket r3 = r7.toString     // Catch:{ AssertionError -> 0x00e3 }
            com.bca.xco.widget.connection.httpclient.p r4 = r0.setMax     // Catch:{ AssertionError -> 0x00e3 }
            java.lang.String r4 = r4.setMax     // Catch:{ AssertionError -> 0x00e3 }
            com.bca.xco.widget.connection.httpclient.p r5 = r0.setMax     // Catch:{ AssertionError -> 0x00e3 }
            int r5 = r5.getMax     // Catch:{ AssertionError -> 0x00e3 }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ AssertionError -> 0x00e3 }
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ AssertionError -> 0x00e3 }
            o.BrowserActionsIntent$BrowserActionsItemId r8 = r8.getMax(r1)     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            boolean r3 = r8.length()     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            if (r3 == 0) goto L_0x002f
            o.PostMessageService r3 = o.PostMessageService.getMax()     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            com.bca.xco.widget.connection.httpclient.p r4 = r0.setMax     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            java.lang.String r4 = r4.setMax     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            java.util.List<com.bca.xco.widget.connection.httpclient.s> r5 = r0.getMin     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            r3.setMax((javax.net.ssl.SSLSocket) r1, (java.lang.String) r4, (java.util.List<com.bca.xco.widget.connection.httpclient.s>) r5)     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
        L_0x002f:
            r1.startHandshake()     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            o.getContentPaddingRight r3 = o.getContentPaddingRight.getMax(r3)     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            javax.net.ssl.HostnameVerifier r4 = r0.toIntRange     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            com.bca.xco.widget.connection.httpclient.p r5 = r0.setMax     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            java.lang.String r5 = r5.setMax     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            javax.net.ssl.SSLSession r6 = r1.getSession()     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            boolean r4 = r4.verify(r5, r6)     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            if (r4 == 0) goto L_0x0092
            o.setLayoutInflater r4 = r0.toString     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            com.bca.xco.widget.connection.httpclient.p r0 = r0.setMax     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            java.lang.String r0 = r0.setMax     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            java.util.List<java.security.cert.Certificate> r5 = r3.getMax     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            r4.length(r0, r5)     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            boolean r8 = r8.length()     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            if (r8 == 0) goto L_0x0063
            o.PostMessageService r8 = o.PostMessageService.getMax()     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            java.lang.String r2 = r8.getMin(r1)     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
        L_0x0063:
            r7.getMax = r1     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            o.safeSizeOf r8 = o.putCount.setMax(r1)     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            o.put r8 = o.putCount.getMax((o.safeSizeOf) r8)     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            r7.toIntRange = r8     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            java.net.Socket r8 = r7.getMax     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            o.entryRemoved r8 = o.putCount.setMin((java.net.Socket) r8)     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            o.resize r8 = o.putCount.getMax((o.entryRemoved) r8)     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            r7.toFloatRange = r8     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            r7.getMin = r3     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            if (r2 == 0) goto L_0x0084
            com.bca.xco.widget.connection.httpclient.s r8 = com.bca.xco.widget.connection.httpclient.s.a(r2)     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            goto L_0x0086
        L_0x0084:
            com.bca.xco.widget.connection.httpclient.s r8 = com.bca.xco.widget.connection.httpclient.s.HTTP_1_1     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
        L_0x0086:
            r7.toDoubleRange = r8     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            if (r1 == 0) goto L_0x0091
            o.PostMessageService r8 = o.PostMessageService.getMax()
            r8.setMin((javax.net.ssl.SSLSocket) r1)
        L_0x0091:
            return
        L_0x0092:
            java.util.List<java.security.cert.Certificate> r8 = r3.getMax     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            r2 = 0
            java.lang.Object r8 = r8.get(r2)     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            java.lang.String r4 = "Hostname "
            r3.<init>(r4)     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            com.bca.xco.widget.connection.httpclient.p r0 = r0.setMax     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            java.lang.String r0 = r0.setMax     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            r3.append(r0)     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            java.lang.String r0 = " not verified:\n    certificate: "
            r3.append(r0)     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            java.lang.String r0 = o.setLayoutInflater.setMin(r8)     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            r3.append(r0)     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            java.lang.String r0 = "\n    DN: "
            r3.append(r0)     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            java.security.Principal r0 = r8.getSubjectDN()     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            java.lang.String r0 = r0.getName()     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            r3.append(r0)     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            java.lang.String r0 = "\n    subjectAltNames: "
            r3.append(r0)     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            java.util.List r8 = o.onNotifyNotificationWithChannel.getMax(r8)     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            r3.append(r8)     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            java.lang.String r8 = r3.toString()     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            r2.<init>(r8)     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
            throw r2     // Catch:{ AssertionError -> 0x00de, all -> 0x00db }
        L_0x00db:
            r8 = move-exception
            r2 = r1
            goto L_0x00f1
        L_0x00de:
            r8 = move-exception
            r2 = r1
            goto L_0x00e4
        L_0x00e1:
            r8 = move-exception
            goto L_0x00f1
        L_0x00e3:
            r8 = move-exception
        L_0x00e4:
            boolean r0 = o.CustomTabsIntent$ShareState.getMin((java.lang.AssertionError) r8)     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00f0
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00e1 }
            r0.<init>(r8)     // Catch:{ all -> 0x00e1 }
            throw r0     // Catch:{ all -> 0x00e1 }
        L_0x00f0:
            throw r8     // Catch:{ all -> 0x00e1 }
        L_0x00f1:
            if (r2 == 0) goto L_0x00fa
            o.PostMessageService r0 = o.PostMessageService.getMax()
            r0.setMin((javax.net.ssl.SSLSocket) r2)
        L_0x00fa:
            o.CustomTabsIntent$ShareState.setMax((java.net.Socket) r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.saveBitmap.getMax(o.loadBitmap):void");
    }

    public final access$201 setMin() {
        return this.setMax;
    }

    public final boolean getMax(boolean z) {
        int soTimeout;
        if (this.getMax.isClosed() || this.getMax.isInputShutdown() || this.getMax.isOutputShutdown()) {
            return false;
        }
        if (this.length == null && z) {
            try {
                soTimeout = this.getMax.getSoTimeout();
                this.getMax.setSoTimeout(1);
                if (this.toIntRange.length()) {
                    this.getMax.setSoTimeout(soTimeout);
                    return false;
                }
                this.getMax.setSoTimeout(soTimeout);
                return true;
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            } catch (Throwable th) {
                this.getMax.setSoTimeout(soTimeout);
                throw th;
            }
        }
        return true;
    }

    public final void getMax(setMinimumWidth setminimumwidth) {
        a aVar = a.REFUSED_STREAM;
        if (setminimumwidth.getMin(aVar)) {
            setminimumwidth.setMin.getMin(setminimumwidth.getMax, aVar);
        }
    }

    public final void getMax(setContentPadding setcontentpadding) {
        this.IsOverlapping = setcontentpadding.setMax();
    }

    public final boolean setMax() {
        return this.length != null;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.setMax.length.setMax.setMax);
        sb.append(":");
        sb.append(this.setMax.length.setMax.getMax);
        sb.append(", proxy=");
        sb.append(this.setMax.getMax);
        sb.append(" hostAddress=");
        sb.append(this.setMax.getMin);
        sb.append(" cipherSuite=");
        getContentPaddingRight getcontentpaddingright = this.getMin;
        if (getcontentpaddingright != null) {
            obj = getcontentpaddingright.setMax;
        } else {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.toDoubleRange);
        sb.append('}');
        return sb.toString();
    }
}
