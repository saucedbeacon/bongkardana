package com.iap.ac.config.lite.dns.lookup;

import java.security.SecureRandom;
import java.util.Random;

public class e implements Cloneable {
    private static final Random d = new SecureRandom();

    /* renamed from: a  reason: collision with root package name */
    private int f9806a;
    private int b;
    private int[] c;

    public e(int i) {
        this();
        e(i);
    }

    private static void g(int i) {
        if (!h(i)) {
            throw new IllegalArgumentException("invalid flag bit ".concat(String.valueOf(i)));
        }
    }

    private static boolean h(int i) {
        return i >= 0 && i <= 15 && c.a(i);
    }

    /* access modifiers changed from: package-private */
    public void a(b bVar) {
        bVar.a(a());
        bVar.a(this.b);
        for (int a2 : this.c) {
            bVar.a(a2);
        }
    }

    public boolean b(int i) {
        g(i);
        return ((1 << (15 - i)) & this.b) != 0;
    }

    public int c() {
        return this.b & 15;
    }

    public void d(int i) {
        g(i);
        this.b = a(this.b, i);
    }

    public void e(int i) {
        if (i < 0 || i > 65535) {
            StringBuilder sb = new StringBuilder("DNS message ID ");
            sb.append(i);
            sb.append(" is out of range");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f9806a = i;
    }

    public void f(int i) {
        if (i < 0 || i > 15) {
            StringBuilder sb = new StringBuilder("DNS Opcode ");
            sb.append(i);
            sb.append("is out of range");
            throw new IllegalArgumentException(sb.toString());
        }
        int i2 = this.b & 34815;
        this.b = i2;
        this.b = (i << 11) | i2;
    }

    /* access modifiers changed from: package-private */
    public void c(int i) {
        int[] iArr = this.c;
        if (iArr[i] != 65535) {
            iArr[i] = iArr[i] + 1;
            return;
        }
        throw new IllegalStateException("DNS section count cannot be incremented");
    }

    public e() {
        this.c = new int[4];
        this.b = 0;
        this.f9806a = -1;
    }

    public int b() {
        return (this.b >> 11) & 15;
    }

    static int a(int i, int i2) {
        g(i2);
        return i | (1 << (15 - i2));
    }

    public int a() {
        int i;
        synchronized (d) {
            if (this.f9806a < 0) {
                this.f9806a = d.nextInt(65535);
            }
            i = this.f9806a;
        }
        return i;
    }

    e(a aVar) throws Exception {
        this(aVar.d());
        this.b = aVar.d();
        int i = 0;
        while (true) {
            int[] iArr = this.c;
            if (i < iArr.length) {
                iArr[i] = aVar.d();
                i++;
            } else {
                return;
            }
        }
    }

    public int a(int i) {
        return this.c[i];
    }
}
