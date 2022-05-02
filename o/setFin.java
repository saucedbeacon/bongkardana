package o;

import com.alibaba.wireless.security.SecExceptionCode;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import o.Draft;
import o.HandshakedataImpl1;
import o.InvalidDataException;
import o.InvalidHandshakeException;
import okhttp3.Protocol;
import okhttp3.internal.http2.ErrorCode;

public final class setFin extends HandshakedataImpl1.setMax implements Draft.HandshakeState {
    public final List<Reference<isFin>> FastBitmap$CoordinateSystem = new ArrayList();
    public int IsOverlapping = 1;
    public boolean equals;
    public final getCloseCode getMax;
    HandshakedataImpl1 getMin;
    public long hashCode = Long.MAX_VALUE;
    executeSerial isInside;
    public Socket length;
    public Socket setMax;
    public createBuffer setMin;
    schedule toFloatRange;
    public int toIntRange;
    private final Draft_10 toString;
    private Protocol values;

    public setFin(Draft_10 draft_10, getCloseCode getclosecode) {
        this.toString = draft_10;
        this.getMax = getclosecode;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x00a6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0230 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007d A[Catch:{ IOException -> 0x0236 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00cb A[Catch:{ IOException -> 0x0234 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x021f A[Catch:{ all -> 0x0226 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0225 A[Catch:{ all -> 0x0226 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0229 A[SYNTHETIC, Splitter:B:92:0x0229] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMax(int r17, int r18, int r19, int r20, boolean r21, o.checkAlloc r22, o.translateSingleFrame r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r20
            r9 = r22
            r10 = r23
            okhttp3.Protocol r0 = r7.values
            if (r0 != 0) goto L_0x0287
            o.getCloseCode r0 = r7.getMax
            o.postProcessHandshakeResponseAsServer r0 = r0.setMax
            java.util.List<o.generateFinalKey> r0 = r0.equals
            o.FrameBuilder r11 = new o.FrameBuilder
            r11.<init>(r0)
            o.getCloseCode r1 = r7.getMax
            o.postProcessHandshakeResponseAsServer r1 = r1.setMax
            javax.net.ssl.SSLSocketFactory r1 = r1.toFloatRange
            if (r1 != 0) goto L_0x0065
            o.generateFinalKey r1 = o.generateFinalKey.getMax
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0058
            o.getCloseCode r0 = r7.getMax
            o.postProcessHandshakeResponseAsServer r0 = r0.setMax
            o.Draft_76 r0 = r0.setMax
            java.lang.String r0 = r0.getMin
            o.MPaaSSCLogCatImpl r1 = o.MPaaSSCLogCatImpl.toIntRange()
            boolean r1 = r1.setMin((java.lang.String) r0)
            if (r1 == 0) goto L_0x003a
            goto L_0x0073
        L_0x003a:
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0058:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0065:
            o.getCloseCode r0 = r7.getMax
            o.postProcessHandshakeResponseAsServer r0 = r0.setMax
            java.util.List<okhttp3.Protocol> r0 = r0.getMin
            okhttp3.Protocol r1 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x027a
        L_0x0073:
            r12 = 0
            r13 = r12
        L_0x0075:
            o.getCloseCode r0 = r7.getMax     // Catch:{ IOException -> 0x0236 }
            boolean r0 = r0.length()     // Catch:{ IOException -> 0x0236 }
            if (r0 == 0) goto L_0x0097
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.getMin(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x0236 }
            java.net.Socket r0 = r7.setMax     // Catch:{ IOException -> 0x0236 }
            if (r0 != 0) goto L_0x0092
            goto L_0x01e3
        L_0x0092:
            r14 = r17
            r15 = r18
            goto L_0x009e
        L_0x0097:
            r14 = r17
            r15 = r18
            r7.getMin(r14, r15, r9, r10)     // Catch:{ IOException -> 0x0234 }
        L_0x009e:
            o.getCloseCode r0 = r7.getMax     // Catch:{ IOException -> 0x0234 }
            o.postProcessHandshakeResponseAsServer r0 = r0.setMax     // Catch:{ IOException -> 0x0234 }
            javax.net.ssl.SSLSocketFactory r0 = r0.toFloatRange     // Catch:{ IOException -> 0x0234 }
            if (r0 != 0) goto L_0x00cb
            o.getCloseCode r0 = r7.getMax     // Catch:{ IOException -> 0x0234 }
            o.postProcessHandshakeResponseAsServer r0 = r0.setMax     // Catch:{ IOException -> 0x0234 }
            java.util.List<okhttp3.Protocol> r0 = r0.getMin     // Catch:{ IOException -> 0x0234 }
            okhttp3.Protocol r1 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE     // Catch:{ IOException -> 0x0234 }
            boolean r0 = r0.contains(r1)     // Catch:{ IOException -> 0x0234 }
            if (r0 == 0) goto L_0x00c1
            java.net.Socket r0 = r7.setMax     // Catch:{ IOException -> 0x0234 }
            r7.length = r0     // Catch:{ IOException -> 0x0234 }
            okhttp3.Protocol r0 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE     // Catch:{ IOException -> 0x0234 }
            r7.values = r0     // Catch:{ IOException -> 0x0234 }
            r7.getMax((int) r8)     // Catch:{ IOException -> 0x0234 }
            goto L_0x01d6
        L_0x00c1:
            java.net.Socket r0 = r7.setMax     // Catch:{ IOException -> 0x0234 }
            r7.length = r0     // Catch:{ IOException -> 0x0234 }
            okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_1     // Catch:{ IOException -> 0x0234 }
            r7.values = r0     // Catch:{ IOException -> 0x0234 }
            goto L_0x01d6
        L_0x00cb:
            r10.secureConnectStart(r9)     // Catch:{ IOException -> 0x0234 }
            o.getCloseCode r0 = r7.getMax     // Catch:{ IOException -> 0x0234 }
            o.postProcessHandshakeResponseAsServer r0 = r0.setMax     // Catch:{ IOException -> 0x0234 }
            javax.net.ssl.SSLSocketFactory r1 = r0.toFloatRange     // Catch:{ IOException -> 0x0234 }
            java.net.Socket r2 = r7.setMax     // Catch:{ AssertionError -> 0x0217, all -> 0x0214 }
            o.Draft_76 r3 = r0.setMax     // Catch:{ AssertionError -> 0x0217, all -> 0x0214 }
            java.lang.String r3 = r3.getMin     // Catch:{ AssertionError -> 0x0217, all -> 0x0214 }
            o.Draft_76 r4 = r0.setMax     // Catch:{ AssertionError -> 0x0217, all -> 0x0214 }
            int r4 = r4.setMax     // Catch:{ AssertionError -> 0x0217, all -> 0x0214 }
            r5 = 1
            java.net.Socket r1 = r1.createSocket(r2, r3, r4, r5)     // Catch:{ AssertionError -> 0x0217, all -> 0x0214 }
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ AssertionError -> 0x0217, all -> 0x0214 }
            o.generateFinalKey r2 = r11.setMax((javax.net.ssl.SSLSocket) r1)     // Catch:{ AssertionError -> 0x0212 }
            boolean r3 = r2.setMin()     // Catch:{ AssertionError -> 0x0212 }
            if (r3 == 0) goto L_0x00fc
            o.MPaaSSCLogCatImpl r3 = o.MPaaSSCLogCatImpl.toIntRange()     // Catch:{ AssertionError -> 0x0212 }
            o.Draft_76 r4 = r0.setMax     // Catch:{ AssertionError -> 0x0212 }
            java.lang.String r4 = r4.getMin     // Catch:{ AssertionError -> 0x0212 }
            java.util.List<okhttp3.Protocol> r5 = r0.getMin     // Catch:{ AssertionError -> 0x0212 }
            r3.getMin(r1, r4, r5)     // Catch:{ AssertionError -> 0x0212 }
        L_0x00fc:
            r1.startHandshake()     // Catch:{ AssertionError -> 0x0212 }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ AssertionError -> 0x0212 }
            o.createBuffer r4 = o.createBuffer.getMax(r3)     // Catch:{ AssertionError -> 0x0212 }
            javax.net.ssl.HostnameVerifier r5 = r0.IsOverlapping     // Catch:{ AssertionError -> 0x0212 }
            o.Draft_76 r6 = r0.setMax     // Catch:{ AssertionError -> 0x0212 }
            java.lang.String r6 = r6.getMin     // Catch:{ AssertionError -> 0x0212 }
            boolean r3 = r5.verify(r6, r3)     // Catch:{ AssertionError -> 0x0212 }
            if (r3 != 0) goto L_0x017f
            java.util.List<java.security.cert.Certificate> r2 = r4.getMin     // Catch:{ AssertionError -> 0x0212 }
            boolean r3 = r2.isEmpty()     // Catch:{ AssertionError -> 0x0212 }
            if (r3 != 0) goto L_0x0162
            r3 = 0
            java.lang.Object r2 = r2.get(r3)     // Catch:{ AssertionError -> 0x0212 }
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2     // Catch:{ AssertionError -> 0x0212 }
            javax.net.ssl.SSLPeerUnverifiedException r3 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0212 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0212 }
            java.lang.String r5 = "Hostname "
            r4.<init>(r5)     // Catch:{ AssertionError -> 0x0212 }
            o.Draft_76 r0 = r0.setMax     // Catch:{ AssertionError -> 0x0212 }
            java.lang.String r0 = r0.getMin     // Catch:{ AssertionError -> 0x0212 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x0212 }
            java.lang.String r0 = " not verified:\n    certificate: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x0212 }
            java.lang.String r0 = o.setParseMode.length(r2)     // Catch:{ AssertionError -> 0x0212 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x0212 }
            java.lang.String r0 = "\n    DN: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x0212 }
            java.security.Principal r0 = r2.getSubjectDN()     // Catch:{ AssertionError -> 0x0212 }
            java.lang.String r0 = r0.getName()     // Catch:{ AssertionError -> 0x0212 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x0212 }
            java.lang.String r0 = "\n    subjectAltNames: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x0212 }
            java.util.List r0 = o.executeIO.getMax(r2)     // Catch:{ AssertionError -> 0x0212 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x0212 }
            java.lang.String r0 = r4.toString()     // Catch:{ AssertionError -> 0x0212 }
            r3.<init>(r0)     // Catch:{ AssertionError -> 0x0212 }
            throw r3     // Catch:{ AssertionError -> 0x0212 }
        L_0x0162:
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0212 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0212 }
            java.lang.String r4 = "Hostname "
            r3.<init>(r4)     // Catch:{ AssertionError -> 0x0212 }
            o.Draft_76 r0 = r0.setMax     // Catch:{ AssertionError -> 0x0212 }
            java.lang.String r0 = r0.getMin     // Catch:{ AssertionError -> 0x0212 }
            r3.append(r0)     // Catch:{ AssertionError -> 0x0212 }
            java.lang.String r0 = " not verified (no certificates)"
            r3.append(r0)     // Catch:{ AssertionError -> 0x0212 }
            java.lang.String r0 = r3.toString()     // Catch:{ AssertionError -> 0x0212 }
            r2.<init>(r0)     // Catch:{ AssertionError -> 0x0212 }
            throw r2     // Catch:{ AssertionError -> 0x0212 }
        L_0x017f:
            o.setParseMode r3 = r0.toString     // Catch:{ AssertionError -> 0x0212 }
            o.Draft_76 r0 = r0.setMax     // Catch:{ AssertionError -> 0x0212 }
            java.lang.String r0 = r0.getMin     // Catch:{ AssertionError -> 0x0212 }
            java.util.List<java.security.cert.Certificate> r5 = r4.getMin     // Catch:{ AssertionError -> 0x0212 }
            r3.setMax(r0, r5)     // Catch:{ AssertionError -> 0x0212 }
            boolean r0 = r2.setMin()     // Catch:{ AssertionError -> 0x0212 }
            if (r0 == 0) goto L_0x0199
            o.MPaaSSCLogCatImpl r0 = o.MPaaSSCLogCatImpl.toIntRange()     // Catch:{ AssertionError -> 0x0212 }
            java.lang.String r0 = r0.setMin((javax.net.ssl.SSLSocket) r1)     // Catch:{ AssertionError -> 0x0212 }
            goto L_0x019a
        L_0x0199:
            r0 = r12
        L_0x019a:
            r7.length = r1     // Catch:{ AssertionError -> 0x0212 }
            o.recordWsHsTime r2 = o.recordMonitorOfSndMsg.setMax((java.net.Socket) r1)     // Catch:{ AssertionError -> 0x0212 }
            o.schedule r2 = o.recordMonitorOfSndMsg.setMin((o.recordWsHsTime) r2)     // Catch:{ AssertionError -> 0x0212 }
            r7.toFloatRange = r2     // Catch:{ AssertionError -> 0x0212 }
            java.net.Socket r2 = r7.length     // Catch:{ AssertionError -> 0x0212 }
            o.recordDnsTime r2 = o.recordMonitorOfSndMsg.getMax((java.net.Socket) r2)     // Catch:{ AssertionError -> 0x0212 }
            o.executeSerial r2 = o.recordMonitorOfSndMsg.getMax((o.recordDnsTime) r2)     // Catch:{ AssertionError -> 0x0212 }
            r7.isInside = r2     // Catch:{ AssertionError -> 0x0212 }
            r7.setMin = r4     // Catch:{ AssertionError -> 0x0212 }
            if (r0 == 0) goto L_0x01bb
            okhttp3.Protocol r0 = okhttp3.Protocol.get(r0)     // Catch:{ AssertionError -> 0x0212 }
            goto L_0x01bd
        L_0x01bb:
            okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_1     // Catch:{ AssertionError -> 0x0212 }
        L_0x01bd:
            r7.values = r0     // Catch:{ AssertionError -> 0x0212 }
            if (r1 == 0) goto L_0x01c8
            o.MPaaSSCLogCatImpl r0 = o.MPaaSSCLogCatImpl.toIntRange()     // Catch:{ IOException -> 0x0234 }
            r0.setMax((javax.net.ssl.SSLSocket) r1)     // Catch:{ IOException -> 0x0234 }
        L_0x01c8:
            o.createBuffer r0 = r7.setMin     // Catch:{ IOException -> 0x0234 }
            r10.secureConnectEnd(r9, r0)     // Catch:{ IOException -> 0x0234 }
            okhttp3.Protocol r0 = r7.values     // Catch:{ IOException -> 0x0234 }
            okhttp3.Protocol r1 = okhttp3.Protocol.HTTP_2     // Catch:{ IOException -> 0x0234 }
            if (r0 != r1) goto L_0x01d6
            r7.getMax((int) r8)     // Catch:{ IOException -> 0x0234 }
        L_0x01d6:
            o.getCloseCode r0 = r7.getMax     // Catch:{ IOException -> 0x0234 }
            java.net.InetSocketAddress r0 = r0.getMax     // Catch:{ IOException -> 0x0234 }
            o.getCloseCode r1 = r7.getMax     // Catch:{ IOException -> 0x0234 }
            java.net.Proxy r1 = r1.length     // Catch:{ IOException -> 0x0234 }
            okhttp3.Protocol r2 = r7.values     // Catch:{ IOException -> 0x0234 }
            r10.connectEnd(r9, r0, r1, r2)     // Catch:{ IOException -> 0x0234 }
        L_0x01e3:
            o.getCloseCode r0 = r7.getMax
            boolean r0 = r0.length()
            if (r0 == 0) goto L_0x01fd
            java.net.Socket r0 = r7.setMax
            if (r0 == 0) goto L_0x01f0
            goto L_0x01fd
        L_0x01f0:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Too many tunnel connections attempted: 21"
            r0.<init>(r1)
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            r1.<init>(r0)
            throw r1
        L_0x01fd:
            o.HandshakedataImpl1 r0 = r7.getMin
            if (r0 == 0) goto L_0x0211
            o.Draft_10 r1 = r7.toString
            monitor-enter(r1)
            o.HandshakedataImpl1 r0 = r7.getMin     // Catch:{ all -> 0x020e }
            int r0 = r0.length()     // Catch:{ all -> 0x020e }
            r7.IsOverlapping = r0     // Catch:{ all -> 0x020e }
            monitor-exit(r1)     // Catch:{ all -> 0x020e }
            return
        L_0x020e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0211:
            return
        L_0x0212:
            r0 = move-exception
            goto L_0x0219
        L_0x0214:
            r0 = move-exception
            r1 = r12
            goto L_0x0227
        L_0x0217:
            r0 = move-exception
            r1 = r12
        L_0x0219:
            boolean r2 = o.initCloseCode.getMax((java.lang.AssertionError) r0)     // Catch:{ all -> 0x0226 }
            if (r2 == 0) goto L_0x0225
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0226 }
            r2.<init>(r0)     // Catch:{ all -> 0x0226 }
            throw r2     // Catch:{ all -> 0x0226 }
        L_0x0225:
            throw r0     // Catch:{ all -> 0x0226 }
        L_0x0226:
            r0 = move-exception
        L_0x0227:
            if (r1 == 0) goto L_0x0230
            o.MPaaSSCLogCatImpl r2 = o.MPaaSSCLogCatImpl.toIntRange()     // Catch:{ IOException -> 0x0234 }
            r2.setMax((javax.net.ssl.SSLSocket) r1)     // Catch:{ IOException -> 0x0234 }
        L_0x0230:
            o.initCloseCode.getMax((java.net.Socket) r1)     // Catch:{ IOException -> 0x0234 }
            throw r0     // Catch:{ IOException -> 0x0234 }
        L_0x0234:
            r0 = move-exception
            goto L_0x023b
        L_0x0236:
            r0 = move-exception
            r14 = r17
            r15 = r18
        L_0x023b:
            java.net.Socket r1 = r7.length
            o.initCloseCode.getMax((java.net.Socket) r1)
            java.net.Socket r1 = r7.setMax
            o.initCloseCode.getMax((java.net.Socket) r1)
            r7.length = r12
            r7.setMax = r12
            r7.toFloatRange = r12
            r7.isInside = r12
            r7.setMin = r12
            r7.values = r12
            r7.getMin = r12
            o.getCloseCode r1 = r7.getMax
            java.net.InetSocketAddress r3 = r1.getMax
            o.getCloseCode r1 = r7.getMax
            java.net.Proxy r4 = r1.length
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.connectFailed(r2, r3, r4, r5, r6)
            if (r13 != 0) goto L_0x026c
            okhttp3.internal.connection.RouteException r13 = new okhttp3.internal.connection.RouteException
            r13.<init>(r0)
            goto L_0x026f
        L_0x026c:
            r13.addConnectException(r0)
        L_0x026f:
            if (r21 == 0) goto L_0x0279
            boolean r0 = r11.setMax((java.io.IOException) r0)
            if (r0 == 0) goto L_0x0279
            goto L_0x0075
        L_0x0279:
            throw r13
        L_0x027a:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0287:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            r0.<init>(r1)
            goto L_0x0290
        L_0x028f:
            throw r0
        L_0x0290:
            goto L_0x028f
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setFin.getMax(int, int, int, int, boolean, o.checkAlloc, o.translateSingleFrame):void");
    }

    private void getMin(int i, int i2, checkAlloc checkalloc, translateSingleFrame translatesingleframe) throws IOException {
        Socket socket;
        Proxy proxy = this.getMax.length;
        postProcessHandshakeResponseAsServer postprocesshandshakeresponseasserver = this.getMax.setMax;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) {
            socket = postprocesshandshakeresponseasserver.setMin.createSocket();
        } else {
            socket = new Socket(proxy);
        }
        this.setMax = socket;
        translatesingleframe.connectStart(checkalloc, this.getMax.getMax, proxy);
        this.setMax.setSoTimeout(i2);
        try {
            MPaaSSCLogCatImpl.toIntRange().length(this.setMax, this.getMax.getMax, i);
            try {
                this.toFloatRange = recordMonitorOfSndMsg.setMin(recordMonitorOfSndMsg.setMax(this.setMax));
                this.isInside = recordMonitorOfSndMsg.getMax(recordMonitorOfSndMsg.getMax(this.setMax));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            StringBuilder sb = new StringBuilder("Failed to connect to ");
            sb.append(this.getMax.getMax);
            ConnectException connectException = new ConnectException(sb.toString());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    private void getMax(int i) throws IOException {
        this.length.setSoTimeout(0);
        HandshakedataImpl1.getMax getmax = new HandshakedataImpl1.getMax();
        Socket socket = this.length;
        String str = this.getMax.setMax.setMax.getMin;
        schedule schedule = this.toFloatRange;
        executeSerial executeserial = this.isInside;
        getmax.length = socket;
        getmax.setMax = str;
        getmax.getMin = schedule;
        getmax.setMin = executeserial;
        getmax.getMax = this;
        getmax.equals = i;
        HandshakedataImpl1 handshakedataImpl1 = new HandshakedataImpl1(getmax);
        this.getMin = handshakedataImpl1;
        handshakedataImpl1.setMin();
    }

    public final boolean length(postProcessHandshakeResponseAsServer postprocesshandshakeresponseasserver, @Nullable getCloseCode getclosecode) {
        if (this.FastBitmap$CoordinateSystem.size() >= this.IsOverlapping || this.equals || !LimitExedeedException.length.length(this.getMax.setMax, postprocesshandshakeresponseasserver)) {
            return false;
        }
        if (postprocesshandshakeresponseasserver.setMax.getMin.equals(this.getMax.setMax.setMax.getMin)) {
            return true;
        }
        if (this.getMin == null || getclosecode == null || getclosecode.length.type() != Proxy.Type.DIRECT || this.getMax.length.type() != Proxy.Type.DIRECT || !this.getMax.getMax.equals(getclosecode.getMax) || getclosecode.setMax.IsOverlapping != executeIO.length || !length(postprocesshandshakeresponseasserver.setMax)) {
            return false;
        }
        try {
            postprocesshandshakeresponseasserver.toString.setMax(postprocesshandshakeresponseasserver.setMax.getMin, this.setMin.getMin);
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean setMax(boolean z) {
        int soTimeout;
        if (this.length.isClosed() || this.length.isInputShutdown() || this.length.isOutputShutdown()) {
            return false;
        }
        HandshakedataImpl1 handshakedataImpl1 = this.getMin;
        if (handshakedataImpl1 != null) {
            return handshakedataImpl1.length(System.nanoTime());
        }
        if (z) {
            try {
                soTimeout = this.length.getSoTimeout();
                this.length.setSoTimeout(1);
                if (this.toFloatRange.setMax()) {
                    this.length.setSoTimeout(soTimeout);
                    return false;
                }
                this.length.setSoTimeout(soTimeout);
                return true;
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            } catch (Throwable th) {
                this.length.setSoTimeout(soTimeout);
                throw th;
            }
        }
        return true;
    }

    public final void getMax(ServerHandshakeBuilder serverHandshakeBuilder) throws IOException {
        ErrorCode errorCode = ErrorCode.REFUSED_STREAM;
        if (serverHandshakeBuilder.getMax(errorCode)) {
            HandshakedataImpl1 handshakedataImpl1 = serverHandshakeBuilder.getMax;
            handshakedataImpl1.invoke.getMin(serverHandshakeBuilder.setMin, errorCode);
        }
    }

    public final void length(HandshakedataImpl1 handshakedataImpl1) {
        synchronized (this.toString) {
            this.IsOverlapping = handshakedataImpl1.length();
        }
    }

    public final boolean setMax() {
        return this.getMin != null;
    }

    public final Protocol getMax() {
        return this.values;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.getMax.setMax.setMax.getMin);
        sb.append(":");
        sb.append(this.getMax.setMax.setMax.setMax);
        sb.append(", proxy=");
        sb.append(this.getMax.length);
        sb.append(" hostAddress=");
        sb.append(this.getMax.getMax);
        sb.append(" cipherSuite=");
        createBuffer createbuffer = this.setMin;
        if (createbuffer != null) {
            obj = createbuffer.getMax;
        } else {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.values);
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [o.isFin, o.generateKey] */
    /* JADX WARNING: type inference failed for: r5v21 */
    /* JADX WARNING: type inference failed for: r5v22 */
    private void getMin(int i, int i2, int i3, checkAlloc checkalloc, translateSingleFrame translatesingleframe) throws IOException {
        int i4 = i2;
        checkAlloc checkalloc2 = checkalloc;
        translateSingleFrame translatesingleframe2 = translatesingleframe;
        InvalidDataException.getMin getmin = new InvalidDataException.getMin();
        Draft_76 draft_76 = this.getMax.setMax.setMax;
        if (draft_76 != null) {
            getmin.getMin = draft_76;
            boolean z = false;
            boolean z2 = true;
            InvalidDataException.getMin max = getmin.length(FirebasePerformance.HttpMethod.CONNECT, (getPart) null).setMax(HttpHeaders.HOST, initCloseCode.getMin(this.getMax.setMax.setMax, true)).setMax("Proxy-Connection", "Keep-Alive").setMax(HttpHeaders.USER_AGENT, "okhttp/3.12.12");
            if (max.getMin != null) {
                InvalidDataException invalidDataException = new InvalidDataException(max);
                InvalidHandshakeException.getMin getmin2 = new InvalidHandshakeException.getMin();
                getmin2.setMin = invalidDataException;
                getmin2.getMax = Protocol.HTTP_1_1;
                getmin2.getMin = SecExceptionCode.SEC_ERROR_DYN_ENC_DECRYPT_MISMATCH_KEY_DATA;
                getmin2.setMax = "Preemptive Authenticate";
                getmin2.toIntRange = initCloseCode.getMax;
                getmin2.toString = -1;
                getmin2.values = -1;
                getmin2.equals.setMin(HttpHeaders.PROXY_AUTHENTICATE, "OkHttp-Preemptive");
                InvalidDataException authenticate = this.getMax.setMax.getMax.authenticate(this.getMax, getmin2.length());
                if (authenticate != null) {
                    invalidDataException = authenticate;
                }
                Draft_76 draft_762 = invalidDataException.setMin;
                int i5 = 0;
                while (i5 < 21) {
                    getMin(i, i4, checkalloc2, translatesingleframe2);
                    StringBuilder sb = new StringBuilder("CONNECT ");
                    sb.append(initCloseCode.getMin(draft_762, z2));
                    sb.append(" HTTP/1.1");
                    String obj = sb.toString();
                    ? r5 = z;
                    while (true) {
                        iterateHttpFields iteratehttpfields = new iterateHttpFields(r5, r5, this.toFloatRange, this.isInside);
                        this.toFloatRange.getMin().length((long) i4, TimeUnit.MILLISECONDS);
                        this.isInside.getMin().length((long) i3, TimeUnit.MILLISECONDS);
                        iteratehttpfields.length(invalidDataException.length, obj);
                        iteratehttpfields.getMax.flush();
                        InvalidHandshakeException.getMin max2 = iteratehttpfields.setMax(false);
                        max2.setMin = invalidDataException;
                        InvalidHandshakeException length2 = max2.length();
                        long max3 = ClientHandshake.getMax(length2);
                        if (max3 == -1) {
                            max3 = 0;
                        }
                        recordWsHsTime min = iteratehttpfields.setMin(max3);
                        initCloseCode.setMin(min, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
                        min.close();
                        int i6 = length2.getMax;
                        if (i6 != 200) {
                            if (i6 == 407) {
                                invalidDataException = this.getMax.setMax.getMax.authenticate(this.getMax, length2);
                                if (invalidDataException == null) {
                                    throw new IOException("Failed to authenticate with proxy");
                                } else if ("close".equalsIgnoreCase(length2.getMax(HttpHeaders.CONNECTION))) {
                                    break;
                                } else {
                                    r5 = 0;
                                }
                            } else {
                                StringBuilder sb2 = new StringBuilder("Unexpected response code for CONNECT: ");
                                sb2.append(length2.getMax);
                                throw new IOException(sb2.toString());
                            }
                        } else if (!this.toFloatRange.getMax().setMax() || !this.isInside.getMax().setMax()) {
                            throw new IOException("TLS tunnel buffered too many bytes!");
                        } else {
                            invalidDataException = null;
                        }
                    }
                    if (invalidDataException != null) {
                        initCloseCode.getMax(this.setMax);
                        z = false;
                        this.setMax = null;
                        this.isInside = null;
                        this.toFloatRange = null;
                        translatesingleframe2.connectEnd(checkalloc2, this.getMax.getMax, this.getMax.length, (Protocol) null);
                        i5++;
                        z2 = true;
                    } else {
                        return;
                    }
                }
                return;
            }
            throw new IllegalStateException("url == null");
        }
        throw new NullPointerException("url == null");
    }

    public final boolean length(Draft_76 draft_76) {
        if (draft_76.setMax != this.getMax.setMax.setMax.setMax) {
            return false;
        }
        if (draft_76.getMin.equals(this.getMax.setMax.setMax.getMin)) {
            return true;
        }
        if (this.setMin != null) {
            executeIO executeio = executeIO.length;
            if (executeIO.length(draft_76.getMin, (X509Certificate) this.setMin.getMin.get(0))) {
                return true;
            }
        }
        return false;
    }
}
