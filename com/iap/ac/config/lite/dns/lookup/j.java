package com.iap.ac.config.lite.dns.lookup;

import com.iap.ac.config.lite.c.e;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class j {
    private static final String c = e.b("Resolver");
    private static final ExecutorService d = new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS, new LinkedBlockingDeque(100), new ThreadPoolExecutor.AbortPolicy());
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public InetSocketAddress f9811a;
    /* access modifiers changed from: private */
    public long b = 10000;

    class a implements Callable<g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f9812a;

        a(g gVar) {
            this.f9812a = gVar;
        }

        public g call() throws Exception {
            int a2 = this.f9812a.a().a();
            byte[] a3 = h.a(j.this.f9811a, this.f9812a.c(), j.this.b);
            if (a3 == null || a3.length < 12) {
                throw new DNSException("invalid DNS header - too short");
            }
            int i = ((a3[0] & 255) << 8) + (a3[1] & 255);
            if (i == a2) {
                g gVar = new g(a3);
                if (this.f9812a.b().a() == gVar.b().a() && this.f9812a.b().b() == gVar.b().b()) {
                    return gVar;
                }
                throw new DNSException("invalid message");
            }
            StringBuilder sb = new StringBuilder("invalid message id: expected ");
            sb.append(a2);
            sb.append("; got id ");
            sb.append(i);
            throw new DNSException(sb.toString());
        }
    }

    public j(String str) throws UnknownHostException {
        if (str == null) {
            str = String.format(Locale.US, "ns%d.alipay.com.", new Object[]{Integer.valueOf(((int) (Math.random() * 4.0d)) + 1)});
        }
        this.f9811a = new InetSocketAddress(InetAddress.getByName(str), 53);
    }

    public long a() {
        return this.b;
    }

    public Future<g> b(g gVar) {
        return d.submit(new a(gVar));
    }

    /* access modifiers changed from: package-private */
    public g a(g gVar) throws Exception {
        return b(gVar).get(a(), TimeUnit.MILLISECONDS);
    }
}
