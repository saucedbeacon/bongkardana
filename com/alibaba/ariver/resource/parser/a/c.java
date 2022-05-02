package com.alibaba.ariver.resource.parser.a;

import com.alibaba.ariver.kernel.common.utils.IOUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import id.dana.data.constant.BranchLinkConstant;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class c implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final String f10191a;
    private File b;
    private RandomAccessFile c;
    private MappedByteBuffer d;
    private b e;
    private long f;
    private long g;

    public c(String str) {
        this(new File(str), 1);
    }

    public c(File file, int i) {
        this.f10191a = file.getPath();
        if (i == 1 || i == 5) {
            if ((i & 4) != 0) {
                this.b = file;
                file.deleteOnExit();
            } else {
                this.b = null;
            }
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.f10191a, BranchLinkConstant.PayloadKey.REFERRAL);
                this.c = randomAccessFile;
                this.d = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, 0, this.c.length());
            } catch (Throwable th) {
                IOUtils.freeMappedBuffer(this.d);
                IOUtils.closeQuietly(this.c);
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Bad mode: ".concat(String.valueOf(i)));
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            super.finalize();
        } catch (Throwable th) {
            throw new AssertionError(th);
        }
    }

    public void close() {
        RandomAccessFile randomAccessFile = this.c;
        if (randomAccessFile != null) {
            synchronized (randomAccessFile) {
                IOUtils.freeMappedBuffer(this.d);
                this.c = null;
                randomAccessFile.close();
            }
            File file = this.b;
            if (file != null) {
                file.delete();
                this.b = null;
            }
        }
    }

    private void d() {
        if (this.c == null) {
            throw new IllegalStateException("Tar file closed");
        }
    }

    public int a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public int a(byte[] bArr, int i, int i2) {
        int i3;
        d();
        b bVar = this.e;
        if (bVar != null) {
            if (this.f == bVar.b()) {
                return -1;
            }
            if (this.e.b() - this.f < ((long) i2)) {
                i2 = (int) (this.e.b() - this.f);
            }
        }
        try {
            this.d.get(bArr, i, i2);
            i3 = i2;
        } catch (BufferUnderflowException e2) {
            RVLogger.e("TarFile", (Throwable) e2);
            i3 = -1;
        }
        if (i3 != -1) {
            if (this.e != null) {
                this.f += (long) i2;
            }
            this.g += (long) i2;
            return i2;
        }
        throw new IOException();
    }

    public b a() {
        d();
        b();
        byte[] buf = IOUtils.getBuf(512);
        boolean z = false;
        try {
            this.d.get(buf, 0, 512);
        } catch (BufferUnderflowException e2) {
            RVLogger.e("TarFile", (Throwable) e2);
        }
        int length = buf.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            } else if (buf[i] != 0) {
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            this.e = new b(buf);
        }
        IOUtils.returnBuf(buf);
        return this.e;
    }

    /* access modifiers changed from: protected */
    public void b() {
        b bVar = this.e;
        if (bVar != null) {
            if (bVar.b() > this.f) {
                long j = 0;
                while (j < this.e.b() - this.f) {
                    long a2 = a((this.e.b() - this.f) - j);
                    if (a2 != 0 || this.e.b() - this.f <= 0) {
                        j += a2;
                    } else {
                        throw new IOException("Possible tar file corruption");
                    }
                }
            }
            this.e = null;
            this.f = 0;
            c();
        }
    }

    /* access modifiers changed from: protected */
    public void c() {
        int i;
        long j = this.g;
        long j2 = 0;
        if (j > 0 && (i = (int) (j % 512)) > 0) {
            while (true) {
                long j3 = (long) (512 - i);
                if (j2 < j3) {
                    j2 += a(j3 - j2);
                } else {
                    return;
                }
            }
        }
    }

    public long a(long j) {
        if (j <= 0) {
            return 0;
        }
        byte[] buf = IOUtils.getBuf(2048);
        long j2 = j;
        while (j2 > 0) {
            long j3 = 2048;
            if (j2 < 2048) {
                j3 = j2;
            }
            int a2 = a(buf, 0, (int) j3);
            if (a2 < 0) {
                break;
            }
            j2 -= (long) a2;
        }
        IOUtils.returnBuf(buf);
        return j - j2;
    }
}
