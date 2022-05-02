package com.alipay.mobile.rome.syncsdk.transport.connection;

import com.alipay.mobile.rome.syncsdk.transport.b.a;
import com.alipay.mobile.rome.syncsdk.transport.b.b;
import com.alipay.mobile.rome.syncsdk.util.SyncThreadManager;
import com.alipay.mobile.rome.syncsdk.util.c;
import com.alipay.mobile.rome.syncsdk.util.j;
import java.io.DataInputStream;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f9450a = d.class.getSimpleName();
    public Thread b;
    public volatile boolean c = false;
    private DataInputStream d;
    private a e;

    public d(a aVar) {
        this.e = aVar;
        this.d = aVar.c;
        e eVar = new e(this);
        this.b = eVar;
        eVar.setName("longLink Packet Reader");
        this.b.setDaemon(true);
    }

    static /* synthetic */ void a(d dVar) {
        c.b(f9450a, "parsePackets: reader ");
        while (!dVar.c) {
            try {
                byte[] bArr = new byte[b.c];
                dVar.d.readFully(bArr, 0, b.c);
                a a2 = com.alipay.mobile.rome.syncsdk.transport.b.c.a(dVar.e.f);
                a2.c(bArr);
                int c2 = a2.c();
                c.b(f9450a, "parsePackets: reader dataLen:".concat(String.valueOf(c2)));
                if (c2 < 0 || c2 > 10485760) {
                    StringBuilder sb = new StringBuilder("parsePackets dataLen exception [ dataLen=");
                    sb.append(c2);
                    sb.append(" ][");
                    sb.append(a2.f());
                    sb.append("]");
                    throw new Exception(sb.toString());
                }
                byte[] bArr2 = new byte[c2];
                dVar.d.readFully(bArr2, 0, c2);
                if (a2.d() == 1) {
                    a2.b(bArr2);
                } else {
                    a2.a(bArr2);
                }
                c.a(f9450a, "recvPacket: reader  ");
                if (!a.a(a2)) {
                    c.d(f9450a, "recvPacket: it's unsupported packet!");
                } else {
                    a aVar = dVar.e;
                    if (aVar.f9447a != null && aVar.f9447a.b(a2)) {
                        j.f9463a.a(SyncThreadManager.ThreadType.SYNC_RECEIVE, new b(aVar, a2));
                    }
                }
            } catch (Throwable th) {
                String str = f9450a;
                StringBuilder sb2 = new StringBuilder("parsePackets: [ link is disconnected ][ Exception=");
                sb2.append(th);
                sb2.append(" ][ isDone=");
                sb2.append(dVar.c);
                sb2.append(" ]");
                c.d(str, sb2.toString());
                if (!dVar.c) {
                    dVar.c = true;
                    dVar.e.a(th);
                    return;
                }
                return;
            }
        }
    }
}
