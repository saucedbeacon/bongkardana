package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

final class by extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    private final dd f10879a = new dd();
    private final File b;
    private final dr c;
    private long d;
    private long e;
    private FileOutputStream f;
    private dx g;

    by(File file, dr drVar) {
        this.b = file;
        this.c = drVar;
    }

    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        while (i2 > 0) {
            if (this.d == 0 && this.e == 0) {
                int a2 = this.f10879a.a(bArr, i, i2);
                if (a2 != -1) {
                    i += a2;
                    i2 -= a2;
                    dx a3 = this.f10879a.a();
                    this.g = a3;
                    if (a3.g()) {
                        this.d = 0;
                        this.c.b(this.g.h(), this.g.h().length);
                        this.e = (long) this.g.h().length;
                    } else if (!this.g.b() || this.g.a()) {
                        byte[] h = this.g.h();
                        this.c.b(h, h.length);
                        this.d = this.g.d();
                    } else {
                        this.c.a(this.g.h());
                        File file = new File(this.b, this.g.c());
                        file.getParentFile().mkdirs();
                        this.d = this.g.d();
                        this.f = new FileOutputStream(file);
                    }
                } else {
                    return;
                }
            }
            if (!this.g.a()) {
                if (this.g.g()) {
                    this.c.a(this.e, bArr, i, i2);
                    this.e += (long) i2;
                    i3 = i2;
                } else if (this.g.b()) {
                    i3 = (int) Math.min((long) i2, this.d);
                    this.f.write(bArr, i, i3);
                    long j = this.d - ((long) i3);
                    this.d = j;
                    if (j == 0) {
                        this.f.close();
                    }
                } else {
                    i3 = (int) Math.min((long) i2, this.d);
                    int length = this.g.h().length;
                    this.c.a((((long) length) + this.g.d()) - this.d, bArr, i, i3);
                    this.d -= (long) i3;
                }
                i += i3;
                i2 -= i3;
            }
        }
    }
}
