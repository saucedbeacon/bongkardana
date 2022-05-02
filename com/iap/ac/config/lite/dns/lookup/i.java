package com.iap.ac.config.lite.dns.lookup;

import com.iap.ac.config.lite.c.e;
import java.text.DecimalFormat;

public abstract class i {
    private static final DecimalFormat d;

    /* renamed from: a  reason: collision with root package name */
    protected Name f9810a;
    protected int b;
    protected int c;

    static {
        e.b("Record");
        DecimalFormat decimalFormat = new DecimalFormat();
        d = decimalFormat;
        decimalFormat.setMinimumIntegerDigits(3);
    }

    protected i() {
    }

    private static i a(Name name, int i, int i2, long j, boolean z) {
        i iVar;
        if (!z || i != 16) {
            iVar = new d();
        } else {
            iVar = new k();
        }
        iVar.f9810a = name;
        iVar.b = i;
        iVar.c = i2;
        return iVar;
    }

    /* access modifiers changed from: package-private */
    public abstract void a(a aVar) throws Exception;

    public int b() {
        return this.b;
    }

    private static i a(Name name, int i, int i2, long j, int i3, a aVar) throws Exception {
        i a2 = a(name, i, i2, j, aVar != null);
        if (aVar != null) {
            if (aVar.g() >= i3) {
                aVar.c(i3);
                a2.a(aVar);
                if (aVar.g() <= 0) {
                    aVar.a();
                } else {
                    throw new DNSException("invalid record length");
                }
            } else {
                throw new DNSException("truncated record");
            }
        }
        return a2;
    }

    public static i a(Name name, int i, int i2, long j) throws Exception {
        if (name.a()) {
            c.a(j);
            return a(name, i, i2, j, false);
        }
        StringBuilder sb = new StringBuilder("'");
        sb.append(name);
        sb.append("' is not an absolute name");
        throw new DNSException(sb.toString());
    }

    public static i a(Name name, int i, int i2) throws Exception {
        return a(name, i, i2, 0);
    }

    static i a(a aVar, int i, boolean z) throws Exception {
        Name name = new Name(aVar);
        int d2 = aVar.d();
        int d3 = aVar.d();
        if (i == 0) {
            return a(name, d2, d3);
        }
        long e = aVar.e();
        int d4 = aVar.d();
        if (d4 == 0 && z && (i == 1 || i == 2)) {
            return a(name, d2, d3, e);
        }
        return a(name, d2, d3, e, d4, aVar);
    }

    /* access modifiers changed from: package-private */
    public void a(b bVar) {
        this.f9810a.a(bVar);
        bVar.a(this.b);
        bVar.a(this.c);
    }

    protected static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            byte b3 = b2 & 255;
            if (b3 < 32 || b3 >= Byte.MAX_VALUE) {
                sb.append('\\');
                sb.append(d.format((long) b3));
            } else if (b3 == 34 || b3 == 92) {
                sb.append('\\');
                sb.append((char) b3);
            } else {
                sb.append((char) b3);
            }
        }
        return sb.toString();
    }

    public int a() {
        return this.c;
    }
}
