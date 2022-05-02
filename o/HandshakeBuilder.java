package o;

import com.google.common.net.HttpHeaders;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

public final class HandshakeBuilder implements increaseBuffer {
    public volatile boolean getMax;
    public volatile isFin getMin;
    public Object length;
    private final generateKey setMax;
    private final boolean setMin;

    public HandshakeBuilder(generateKey generatekey, boolean z) {
        this.setMax = generatekey;
        this.setMin = z;
    }

    public final boolean length() {
        return this.getMax;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e5, code lost:
        if (r4.equals(com.google.firebase.perf.FirebasePerformance.HttpMethod.HEAD) == false) goto L_0x0176;
     */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x016e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0179 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0101 A[Catch:{ IOException -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0106 A[Catch:{ IOException -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x012c A[Catch:{ IOException -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x015c A[Catch:{ IOException -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0167 A[Catch:{ IOException -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x017d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.InvalidHandshakeException getMax(o.increaseBuffer.setMax r15) throws java.io.IOException {
        /*
            r14 = this;
            o.InvalidDataException r0 = r15.getMin()
            o.Framedata$Opcode r15 = (o.Framedata.Opcode) r15
            o.checkAlloc r7 = r15.getMin
            o.translateSingleFrame r8 = r15.isInside
            o.isFin r9 = new o.isFin
            o.generateKey r1 = r14.setMax
            o.Draft_10 r2 = r1.b
            o.Draft_76 r1 = r0.setMin
            o.postProcessHandshakeResponseAsServer r3 = r14.setMax(r1)
            java.lang.Object r6 = r14.length
            r1 = r9
            r4 = r7
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r14.getMin = r9
            r10 = 0
            r11 = 0
            r1 = r11
            r2 = 0
        L_0x0024:
            boolean r3 = r14.getMax
            if (r3 != 0) goto L_0x022b
            o.InvalidHandshakeException r0 = r15.length(r0, r9, r11, r11)     // Catch:{ RouteException -> 0x0212, IOException -> 0x0201 }
            if (r1 == 0) goto L_0x0051
            o.InvalidHandshakeException$getMin r3 = new o.InvalidHandshakeException$getMin
            r3.<init>(r0)
            o.InvalidHandshakeException$getMin r0 = new o.InvalidHandshakeException$getMin
            r0.<init>(r1)
            r0.toIntRange = r11
            o.InvalidHandshakeException r0 = r0.length()
            o.NotSendableException r1 = r0.toFloatRange
            if (r1 != 0) goto L_0x0049
            r3.IsOverlapping = r0
            o.InvalidHandshakeException r0 = r3.length()
            goto L_0x0051
        L_0x0049:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "priorResponse.body != null"
            r15.<init>(r0)
            throw r15
        L_0x0051:
            o.getCloseCode r1 = r9.getMin     // Catch:{ IOException -> 0x01fa }
            if (r0 == 0) goto L_0x01f4
            int r3 = r0.getMax     // Catch:{ IOException -> 0x01fa }
            o.InvalidDataException r4 = r0.getMin     // Catch:{ IOException -> 0x01fa }
            java.lang.String r4 = r4.getMin     // Catch:{ IOException -> 0x01fa }
            r5 = 307(0x133, float:4.3E-43)
            java.lang.String r6 = "GET"
            if (r3 == r5) goto L_0x00d9
            r5 = 308(0x134, float:4.32E-43)
            if (r3 == r5) goto L_0x00d9
            r5 = 401(0x191, float:5.62E-43)
            if (r3 == r5) goto L_0x00ce
            r5 = 503(0x1f7, float:7.05E-43)
            if (r3 == r5) goto L_0x00b8
            r5 = 407(0x197, float:5.7E-43)
            if (r3 == r5) goto L_0x009d
            r1 = 408(0x198, float:5.72E-43)
            if (r3 == r1) goto L_0x007a
            switch(r3) {
                case 300: goto L_0x00e7;
                case 301: goto L_0x00e7;
                case 302: goto L_0x00e7;
                case 303: goto L_0x00e7;
                default: goto L_0x0078;
            }
        L_0x0078:
            goto L_0x0176
        L_0x007a:
            o.generateKey r3 = r14.setMax     // Catch:{ IOException -> 0x01fa }
            boolean r3 = r3.getMax()     // Catch:{ IOException -> 0x01fa }
            if (r3 == 0) goto L_0x0176
            o.InvalidDataException r3 = r0.getMin     // Catch:{ IOException -> 0x01fa }
            o.getPart r3 = r3.setMax     // Catch:{ IOException -> 0x01fa }
            boolean r3 = r3 instanceof o.setResourceDescriptor     // Catch:{ IOException -> 0x01fa }
            if (r3 != 0) goto L_0x0176
            o.InvalidHandshakeException r3 = r0.equals     // Catch:{ IOException -> 0x01fa }
            if (r3 == 0) goto L_0x0094
            o.InvalidHandshakeException r3 = r0.equals     // Catch:{ IOException -> 0x01fa }
            int r3 = r3.getMax     // Catch:{ IOException -> 0x01fa }
            if (r3 == r1) goto L_0x0176
        L_0x0094:
            int r1 = length(r0, r10)     // Catch:{ IOException -> 0x01fa }
            if (r1 > 0) goto L_0x0176
            o.InvalidDataException r1 = r0.getMin     // Catch:{ IOException -> 0x01fa }
            goto L_0x00d6
        L_0x009d:
            java.net.Proxy r3 = r1.length     // Catch:{ IOException -> 0x01fa }
            java.net.Proxy$Type r3 = r3.type()     // Catch:{ IOException -> 0x01fa }
            java.net.Proxy$Type r4 = java.net.Proxy.Type.HTTP     // Catch:{ IOException -> 0x01fa }
            if (r3 != r4) goto L_0x00b0
            o.generateKey r3 = r14.setMax     // Catch:{ IOException -> 0x01fa }
            o.translateFrame r3 = r3.Grayscale$Algorithm     // Catch:{ IOException -> 0x01fa }
            o.InvalidDataException r1 = r3.authenticate(r1, r0)     // Catch:{ IOException -> 0x01fa }
            goto L_0x00d6
        L_0x00b0:
            java.net.ProtocolException r15 = new java.net.ProtocolException     // Catch:{ IOException -> 0x01fa }
            java.lang.String r0 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r15.<init>(r0)     // Catch:{ IOException -> 0x01fa }
            throw r15     // Catch:{ IOException -> 0x01fa }
        L_0x00b8:
            o.InvalidHandshakeException r1 = r0.equals     // Catch:{ IOException -> 0x01fa }
            if (r1 == 0) goto L_0x00c2
            o.InvalidHandshakeException r1 = r0.equals     // Catch:{ IOException -> 0x01fa }
            int r1 = r1.getMax     // Catch:{ IOException -> 0x01fa }
            if (r1 == r5) goto L_0x0176
        L_0x00c2:
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r1 = length(r0, r1)     // Catch:{ IOException -> 0x01fa }
            if (r1 != 0) goto L_0x0176
            o.InvalidDataException r1 = r0.getMin     // Catch:{ IOException -> 0x01fa }
            goto L_0x00d6
        L_0x00ce:
            o.generateKey r3 = r14.setMax     // Catch:{ IOException -> 0x01fa }
            o.translateFrame r3 = r3.invokeSuspend     // Catch:{ IOException -> 0x01fa }
            o.InvalidDataException r1 = r3.authenticate(r1, r0)     // Catch:{ IOException -> 0x01fa }
        L_0x00d6:
            r12 = r1
            goto L_0x0177
        L_0x00d9:
            boolean r1 = r4.equals(r6)     // Catch:{ IOException -> 0x01fa }
            if (r1 != 0) goto L_0x00e7
            java.lang.String r1 = "HEAD"
            boolean r1 = r4.equals(r1)     // Catch:{ IOException -> 0x01fa }
            if (r1 == 0) goto L_0x0176
        L_0x00e7:
            o.generateKey r1 = r14.setMax     // Catch:{ IOException -> 0x01fa }
            boolean r1 = r1.length()     // Catch:{ IOException -> 0x01fa }
            if (r1 == 0) goto L_0x0176
            java.lang.String r1 = "Location"
            java.lang.String r1 = r0.getMax(r1)     // Catch:{ IOException -> 0x01fa }
            if (r1 == 0) goto L_0x0176
            o.InvalidDataException r3 = r0.getMin     // Catch:{ IOException -> 0x01fa }
            o.Draft_76 r3 = r3.setMin     // Catch:{ IOException -> 0x01fa }
            o.Draft_76$getMin r1 = r3.length(r1)     // Catch:{ IOException -> 0x01fa }
            if (r1 == 0) goto L_0x0106
            o.Draft_76 r1 = r1.setMin()     // Catch:{ IOException -> 0x01fa }
            goto L_0x0107
        L_0x0106:
            r1 = r11
        L_0x0107:
            if (r1 == 0) goto L_0x0176
            java.lang.String r3 = r1.setMin     // Catch:{ IOException -> 0x01fa }
            o.InvalidDataException r5 = r0.getMin     // Catch:{ IOException -> 0x01fa }
            o.Draft_76 r5 = r5.setMin     // Catch:{ IOException -> 0x01fa }
            java.lang.String r5 = r5.setMin     // Catch:{ IOException -> 0x01fa }
            boolean r3 = r3.equals(r5)     // Catch:{ IOException -> 0x01fa }
            if (r3 != 0) goto L_0x011f
            o.generateKey r3 = r14.setMax     // Catch:{ IOException -> 0x01fa }
            boolean r3 = r3.setMax()     // Catch:{ IOException -> 0x01fa }
            if (r3 == 0) goto L_0x0176
        L_0x011f:
            o.InvalidDataException r3 = r0.getMin     // Catch:{ IOException -> 0x01fa }
            o.InvalidDataException$getMin r5 = new o.InvalidDataException$getMin     // Catch:{ IOException -> 0x01fa }
            r5.<init>(r3)     // Catch:{ IOException -> 0x01fa }
            boolean r3 = o.ClientHandshakeBuilder.length(r4)     // Catch:{ IOException -> 0x01fa }
            if (r3 == 0) goto L_0x0156
            boolean r3 = o.ClientHandshakeBuilder.getMax(r4)     // Catch:{ IOException -> 0x01fa }
            boolean r12 = o.ClientHandshakeBuilder.getMin(r4)     // Catch:{ IOException -> 0x01fa }
            if (r12 == 0) goto L_0x013a
            r5.length((java.lang.String) r6, (o.getPart) r11)     // Catch:{ IOException -> 0x01fa }
            goto L_0x0145
        L_0x013a:
            if (r3 == 0) goto L_0x0141
            o.InvalidDataException r6 = r0.getMin     // Catch:{ IOException -> 0x01fa }
            o.getPart r6 = r6.setMax     // Catch:{ IOException -> 0x01fa }
            goto L_0x0142
        L_0x0141:
            r6 = r11
        L_0x0142:
            r5.length((java.lang.String) r4, (o.getPart) r6)     // Catch:{ IOException -> 0x01fa }
        L_0x0145:
            if (r3 != 0) goto L_0x0156
            java.lang.String r3 = "Transfer-Encoding"
            r5.getMax(r3)     // Catch:{ IOException -> 0x01fa }
            java.lang.String r3 = "Content-Length"
            r5.getMax(r3)     // Catch:{ IOException -> 0x01fa }
            java.lang.String r3 = "Content-Type"
            r5.getMax(r3)     // Catch:{ IOException -> 0x01fa }
        L_0x0156:
            boolean r3 = getMin(r0, r1)     // Catch:{ IOException -> 0x01fa }
            if (r3 != 0) goto L_0x0161
            java.lang.String r3 = "Authorization"
            r5.getMax(r3)     // Catch:{ IOException -> 0x01fa }
        L_0x0161:
            r5.getMin = r1     // Catch:{ IOException -> 0x01fa }
            o.Draft_76 r1 = r5.getMin     // Catch:{ IOException -> 0x01fa }
            if (r1 == 0) goto L_0x016e
            o.InvalidDataException r1 = new o.InvalidDataException     // Catch:{ IOException -> 0x01fa }
            r1.<init>(r5)     // Catch:{ IOException -> 0x01fa }
            goto L_0x00d6
        L_0x016e:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x01fa }
            java.lang.String r0 = "url == null"
            r15.<init>(r0)     // Catch:{ IOException -> 0x01fa }
            throw r15     // Catch:{ IOException -> 0x01fa }
        L_0x0176:
            r12 = r11
        L_0x0177:
            if (r12 != 0) goto L_0x017d
            r9.setMin()
            return r0
        L_0x017d:
            o.NotSendableException r1 = r0.toFloatRange
            o.initCloseCode.getMin((java.io.Closeable) r1)
            int r13 = r2 + 1
            r1 = 20
            if (r13 > r1) goto L_0x01e1
            o.getPart r1 = r12.setMax
            boolean r1 = r1 instanceof o.setResourceDescriptor
            if (r1 != 0) goto L_0x01d4
            o.Draft_76 r1 = r12.setMin
            boolean r1 = getMin(r0, r1)
            if (r1 != 0) goto L_0x01b0
            r9.setMin()
            o.isFin r9 = new o.isFin
            o.generateKey r1 = r14.setMax
            o.Draft_10 r2 = r1.b
            o.Draft_76 r1 = r12.setMin
            o.postProcessHandshakeResponseAsServer r3 = r14.setMax(r1)
            java.lang.Object r6 = r14.length
            r1 = r9
            r4 = r7
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r14.getMin = r9
            goto L_0x01b6
        L_0x01b0:
            o.getOpcode r1 = r9.getMax()
            if (r1 != 0) goto L_0x01bb
        L_0x01b6:
            r1 = r0
            r0 = r12
            r2 = r13
            goto L_0x0024
        L_0x01bb:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Closing the body of "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " didn't close its backing stream. Bad interceptor?"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r15.<init>(r0)
            throw r15
        L_0x01d4:
            r9.setMin()
            java.net.HttpRetryException r15 = new java.net.HttpRetryException
            int r0 = r0.getMax
            java.lang.String r1 = "Cannot retry streamed HTTP body"
            r15.<init>(r1, r0)
            throw r15
        L_0x01e1:
            r9.setMin()
            java.net.ProtocolException r15 = new java.net.ProtocolException
            java.lang.String r0 = java.lang.String.valueOf(r13)
            java.lang.String r1 = "Too many follow-up requests: "
            java.lang.String r0 = r1.concat(r0)
            r15.<init>(r0)
            throw r15
        L_0x01f4:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x01fa }
            r15.<init>()     // Catch:{ IOException -> 0x01fa }
            throw r15     // Catch:{ IOException -> 0x01fa }
        L_0x01fa:
            r15 = move-exception
            r9.setMin()
            throw r15
        L_0x01ff:
            r15 = move-exception
            goto L_0x0224
        L_0x0201:
            r3 = move-exception
            boolean r4 = r3 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x01ff }
            if (r4 != 0) goto L_0x0208
            r4 = 1
            goto L_0x0209
        L_0x0208:
            r4 = 0
        L_0x0209:
            boolean r4 = r14.getMin(r3, r9, r4, r0)     // Catch:{ all -> 0x01ff }
            if (r4 == 0) goto L_0x0211
            goto L_0x0024
        L_0x0211:
            throw r3     // Catch:{ all -> 0x01ff }
        L_0x0212:
            r3 = move-exception
            java.io.IOException r4 = r3.getLastConnectException()     // Catch:{ all -> 0x01ff }
            boolean r4 = r14.getMin(r4, r9, r10, r0)     // Catch:{ all -> 0x01ff }
            if (r4 == 0) goto L_0x021f
            goto L_0x0024
        L_0x021f:
            java.io.IOException r15 = r3.getFirstConnectException()     // Catch:{ all -> 0x01ff }
            throw r15     // Catch:{ all -> 0x01ff }
        L_0x0224:
            r9.setMin(r11)
            r9.setMin()
            throw r15
        L_0x022b:
            r9.setMin()
            java.io.IOException r15 = new java.io.IOException
            java.lang.String r0 = "Canceled"
            r15.<init>(r0)
            goto L_0x0237
        L_0x0236:
            throw r15
        L_0x0237:
            goto L_0x0236
        */
        throw new UnsupportedOperationException("Method not decompiled: o.HandshakeBuilder.getMax(o.increaseBuffer$setMax):o.InvalidHandshakeException");
    }

    private postProcessHandshakeResponseAsServer setMax(Draft_76 draft_76) {
        setParseMode setparsemode;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        Draft_76 draft_762 = draft_76;
        if (draft_76.setMin()) {
            SSLSocketFactory sSLSocketFactory2 = this.setMax.toDoubleRange;
            hostnameVerifier = this.setMax.Mean$Arithmetic;
            sSLSocketFactory = sSLSocketFactory2;
            setparsemode = this.setMax.invoke;
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            setparsemode = null;
        }
        return new postProcessHandshakeResponseAsServer(draft_762.getMin, draft_762.setMax, this.setMax.ICustomTabsCallback, this.setMax.values, sSLSocketFactory, hostnameVerifier, setparsemode, this.setMax.Grayscale$Algorithm, this.setMax.getMin, this.setMax.setMax, this.setMax.isInside, this.setMax.toIntRange);
    }

    private boolean getMin(IOException iOException, isFin isfin, boolean z, InvalidDataException invalidDataException) {
        isfin.setMin(iOException);
        if (!this.setMax.getMax()) {
            return false;
        }
        if ((!z || !setMin(iOException, invalidDataException)) && getMax(iOException, z) && isfin.toIntRange()) {
            return true;
        }
        return false;
    }

    private static boolean getMax(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || z) {
                return false;
            }
            return true;
        } else if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean setMin(IOException iOException, InvalidDataException invalidDataException) {
        return (invalidDataException.setMax instanceof setResourceDescriptor) || (iOException instanceof FileNotFoundException);
    }

    private static int length(InvalidHandshakeException invalidHandshakeException, int i) {
        String length2 = invalidHandshakeException.toIntRange.length(HttpHeaders.RETRY_AFTER);
        if (length2 == null) {
            length2 = null;
        }
        if (length2 == null) {
            return i;
        }
        if (length2.matches("\\d+")) {
            return Integer.valueOf(length2).intValue();
        }
        return Integer.MAX_VALUE;
    }

    private static boolean getMin(InvalidHandshakeException invalidHandshakeException, Draft_76 draft_76) {
        Draft_76 draft_762 = invalidHandshakeException.getMin.setMin;
        return draft_762.getMin.equals(draft_76.getMin) && draft_762.setMax == draft_76.setMax && draft_762.setMin.equals(draft_76.setMin);
    }
}
