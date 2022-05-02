package com.alibaba.ariver.resource.parser.a;

import com.alibaba.ariver.kernel.common.utils.IOUtils;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class e extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private b f10194a;
    private long b = 0;
    private long c = 0;
    private boolean d = false;

    public boolean markSupported() {
        return false;
    }

    public e(InputStream inputStream) {
        super(inputStream);
    }

    public synchronized void mark(int i) {
    }

    public synchronized void reset() {
        throw new IOException("mark/reset not supported");
    }

    public int read() {
        byte[] bArr = new byte[1];
        int read = read(bArr, 0, 1);
        return read != -1 ? bArr[0] & 255 : read;
    }

    public int read(byte[] bArr, int i, int i2) {
        b bVar = this.f10194a;
        if (bVar != null) {
            if (this.b == bVar.b()) {
                return -1;
            }
            if (this.f10194a.b() - this.b < ((long) i2)) {
                i2 = (int) (this.f10194a.b() - this.b);
            }
        }
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            if (this.f10194a != null) {
                this.b += (long) read;
            }
            this.c += (long) read;
        }
        return read;
    }

    public b a() {
        b();
        byte[] buf = IOUtils.getBuf(512);
        byte[] buf2 = IOUtils.getBuf(512);
        boolean z = false;
        int i = 0;
        while (i < 512) {
            int read = read(buf2, 0, 512 - i);
            if (read < 0) {
                break;
            }
            System.arraycopy(buf2, 0, buf, i, read);
            i += read;
        }
        int length = buf.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = true;
                break;
            } else if (buf[i2] != 0) {
                break;
            } else {
                i2++;
            }
        }
        if (!z) {
            this.f10194a = new b(buf);
        }
        IOUtils.returnBuf(buf);
        IOUtils.returnBuf(buf2);
        return this.f10194a;
    }

    /* access modifiers changed from: protected */
    public void b() {
        b bVar = this.f10194a;
        if (bVar != null) {
            if (bVar.b() > this.b) {
                long j = 0;
                while (j < this.f10194a.b() - this.b) {
                    long skip = skip((this.f10194a.b() - this.b) - j);
                    if (skip != 0 || this.f10194a.b() - this.b <= 0) {
                        j += skip;
                    } else {
                        throw new IOException("Possible tar file corruption");
                    }
                }
            }
            this.f10194a = null;
            this.b = 0;
            c();
        }
    }

    /* access modifiers changed from: protected */
    public void c() {
        int i;
        long j = this.c;
        long j2 = 0;
        if (j > 0 && (i = (int) (j % 512)) > 0) {
            while (true) {
                long j3 = (long) (512 - i);
                if (j2 < j3) {
                    j2 += skip(j3 - j2);
                } else {
                    return;
                }
            }
        }
    }

    public long skip(long j) {
        if (this.d) {
            long skip = super.skip(j);
            this.c += skip;
            return skip;
        } else if (j <= 0) {
            return 0;
        } else {
            byte[] buf = IOUtils.getBuf(2048);
            long j2 = j;
            while (j2 > 0) {
                long j3 = 2048;
                if (j2 < 2048) {
                    j3 = j2;
                }
                int read = read(buf, 0, (int) j3);
                if (read < 0) {
                    break;
                }
                j2 -= (long) read;
            }
            IOUtils.returnBuf(buf);
            return j - j2;
        }
    }
}
