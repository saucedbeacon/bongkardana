package com.alipay.mobile.rome.syncsdk.transport.connection.proxy;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.SocketFactory;

public class b extends SocketFactory {
    private static final String b = b.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    int f9455a = 15;
    private final ProxyInfo c;

    public b(ProxyInfo proxyInfo) {
        this.c = proxyInfo;
    }

    public Socket createSocket(String str, int i) {
        return a(str, i, this.f9455a);
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return a(str, i, this.f9455a);
    }

    public Socket createSocket(InetAddress inetAddress, int i) {
        return a(inetAddress.getHostAddress(), i, this.f9455a);
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return a(inetAddress.getHostAddress(), i, this.f9455a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.net.Socket a(java.lang.String r9, int r10, int r11) {
        /*
            r8 = this;
            java.lang.String r0 = ":"
            com.alipay.mobile.rome.syncsdk.transport.connection.proxy.ProxyInfo r1 = r8.c
            java.lang.String r1 = r1.f9453a
            com.alipay.mobile.rome.syncsdk.transport.connection.proxy.ProxyInfo r2 = r8.c
            int r2 = r2.b
            java.lang.String r3 = b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "socketOverHttpProxy: [ proxyHost="
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r5 = " ][ proxyPort="
            r4.append(r5)
            r4.append(r2)
            java.lang.String r5 = " ]"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.alipay.mobile.rome.syncsdk.util.c.a(r3, r4)
            r3 = 0
            java.net.Socket r4 = new java.net.Socket     // Catch:{ IOException -> 0x00eb }
            java.net.Proxy r6 = java.net.Proxy.NO_PROXY     // Catch:{ IOException -> 0x00eb }
            r4.<init>(r6)     // Catch:{ IOException -> 0x00eb }
            r6 = 1
            r4.setTcpNoDelay(r6)     // Catch:{ IOException -> 0x00e8 }
            r4.setKeepAlive(r6)     // Catch:{ IOException -> 0x00e8 }
            java.net.InetSocketAddress r6 = new java.net.InetSocketAddress     // Catch:{ IOException -> 0x00e8 }
            r6.<init>(r1, r2)     // Catch:{ IOException -> 0x00e8 }
            int r11 = r11 * 1000
            r4.connect(r6, r11)     // Catch:{ IOException -> 0x00e8 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x00e8 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x00e8 }
            java.io.InputStream r6 = r4.getInputStream()     // Catch:{ IOException -> 0x00e8 }
            r2.<init>(r6)     // Catch:{ IOException -> 0x00e8 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x00e8 }
            java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x00e8 }
            java.io.OutputStreamWriter r6 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x00e8 }
            java.io.OutputStream r7 = r4.getOutputStream()     // Catch:{ IOException -> 0x00e8 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x00e8 }
            r2.<init>(r6)     // Catch:{ IOException -> 0x00e8 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00e8 }
            java.lang.String r7 = "CONNECT "
            r6.<init>(r7)     // Catch:{ IOException -> 0x00e8 }
            r6.append(r9)     // Catch:{ IOException -> 0x00e8 }
            r6.append(r0)     // Catch:{ IOException -> 0x00e8 }
            r6.append(r10)     // Catch:{ IOException -> 0x00e8 }
            java.lang.String r7 = " HTTP/1.1\r\nHost: "
            r6.append(r7)     // Catch:{ IOException -> 0x00e8 }
            r6.append(r9)     // Catch:{ IOException -> 0x00e8 }
            r6.append(r0)     // Catch:{ IOException -> 0x00e8 }
            r6.append(r10)     // Catch:{ IOException -> 0x00e8 }
            java.lang.String r9 = "\r\nProxy-Connection: Keep-Alive\r\n\r\n"
            r6.append(r9)     // Catch:{ IOException -> 0x00e8 }
            java.lang.String r9 = r6.toString()     // Catch:{ IOException -> 0x00e8 }
            r2.write(r9)     // Catch:{ IOException -> 0x00e8 }
            r2.flush()     // Catch:{ IOException -> 0x00e8 }
            r4.setSoTimeout(r11)     // Catch:{ IOException -> 0x00e8 }
            java.lang.String r9 = r1.readLine()     // Catch:{ IOException -> 0x00e8 }
        L_0x0094:
            java.lang.String r10 = r1.readLine()     // Catch:{ IOException -> 0x00e8 }
            if (r10 == 0) goto L_0x00a6
            java.lang.String r10 = r10.trim()     // Catch:{ IOException -> 0x00e8 }
            java.lang.String r11 = ""
            boolean r10 = r10.equals(r11)     // Catch:{ IOException -> 0x00e8 }
            if (r10 == 0) goto L_0x0094
        L_0x00a6:
            r10 = 0
            r4.setSoTimeout(r10)     // Catch:{ IOException -> 0x00e8 }
            if (r9 == 0) goto L_0x00cd
            java.lang.String r10 = "200"
            boolean r10 = r9.contains(r10)     // Catch:{ IOException -> 0x00e8 }
            if (r10 == 0) goto L_0x00cd
            java.lang.String r10 = b     // Catch:{ IOException -> 0x00e8 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00e8 }
            java.lang.String r0 = "socketOverHttpProxy: connect success [ result="
            r11.<init>(r0)     // Catch:{ IOException -> 0x00e8 }
            r11.append(r9)     // Catch:{ IOException -> 0x00e8 }
            r11.append(r5)     // Catch:{ IOException -> 0x00e8 }
            java.lang.String r9 = r11.toString()     // Catch:{ IOException -> 0x00e8 }
            com.alipay.mobile.rome.syncsdk.util.c.a(r10, r9)     // Catch:{ IOException -> 0x00e8 }
            r3 = r4
            goto L_0x00e7
        L_0x00cd:
            java.lang.String r10 = b     // Catch:{ IOException -> 0x00e8 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00e8 }
            java.lang.String r0 = "socketOverHttpProxy: connect failed [ result="
            r11.<init>(r0)     // Catch:{ IOException -> 0x00e8 }
            r11.append(r9)     // Catch:{ IOException -> 0x00e8 }
            r11.append(r5)     // Catch:{ IOException -> 0x00e8 }
            java.lang.String r9 = r11.toString()     // Catch:{ IOException -> 0x00e8 }
            com.alipay.mobile.rome.syncsdk.util.c.c(r10, r9)     // Catch:{ IOException -> 0x00e8 }
            r4.close()     // Catch:{ IOException -> 0x00e8 }
        L_0x00e7:
            return r3
        L_0x00e8:
            r9 = move-exception
            r3 = r4
            goto L_0x00ec
        L_0x00eb:
            r9 = move-exception
        L_0x00ec:
            if (r3 == 0) goto L_0x00f1
            r3.close()
        L_0x00f1:
            goto L_0x00f3
        L_0x00f2:
            throw r9
        L_0x00f3:
            goto L_0x00f2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.rome.syncsdk.transport.connection.proxy.b.a(java.lang.String, int, int):java.net.Socket");
    }
}
