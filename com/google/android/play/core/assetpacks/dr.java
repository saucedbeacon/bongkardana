package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.af;
import com.google.android.play.core.internal.ci;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;

final class dr {

    /* renamed from: a  reason: collision with root package name */
    private static final af f10923a = new af("SliceMetadataManager");
    private final byte[] b = new byte[8192];
    private final bb c;
    private final String d;
    private final int e;
    private final long f;
    private final String g;
    private int h;

    dr(bb bbVar, String str, int i, long j, String str2) {
        this.c = bbVar;
        this.d = str;
        this.e = i;
        this.f = j;
        this.g = str2;
        this.h = -1;
    }

    private final File e() {
        File f2 = this.c.f(this.d, this.e, this.f, this.g);
        if (!f2.exists()) {
            f2.mkdirs();
        }
        return f2;
    }

    private final File f() throws IOException {
        File c2 = this.c.c(this.d, this.e, this.f, this.g);
        c2.getParentFile().mkdirs();
        c2.createNewFile();
        return c2;
    }

    /* access modifiers changed from: package-private */
    public final dq a() throws IOException {
        File c2 = this.c.c(this.d, this.e, this.f, this.g);
        if (c2.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(c2);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                    throw new bv("Slice checkpoint file corrupt.");
                }
                try {
                    int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                    String property = properties.getProperty("fileName");
                    long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                    long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                    int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                    this.h = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                    return new dq(parseInt, property, parseLong, parseLong2, parseInt2);
                } catch (NumberFormatException e2) {
                    throw new bv("Slice checkpoint file corrupt.", (Exception) e2);
                }
            } catch (Throwable th) {
                ci.a(th, th);
            }
        } else {
            throw new bv("Slice checkpoint file does not exist.");
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(b().length()));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.h));
        FileOutputStream fileOutputStream = new FileOutputStream(f());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            ci.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final void a(long j, byte[] bArr, int i, int i2) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(b(), "rw");
        try {
            randomAccessFile.seek(j);
            randomAccessFile.write(bArr, i, i2);
            randomAccessFile.close();
            return;
        } catch (Throwable th) {
            ci.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final void a(InputStream inputStream, long j) throws IOException {
        int read;
        RandomAccessFile randomAccessFile = new RandomAccessFile(b(), "rw");
        try {
            randomAccessFile.seek(j);
            do {
                read = inputStream.read(this.b);
                if (read > 0) {
                    randomAccessFile.write(this.b, 0, read);
                }
            } while (read == this.b.length);
            randomAccessFile.close();
            return;
        } catch (Throwable th) {
            ci.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, long j, long j2, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j));
        properties.put("remainingBytes", String.valueOf(j2));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.h));
        FileOutputStream fileOutputStream = new FileOutputStream(f());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            ci.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final void a(byte[] bArr) throws IOException {
        FileOutputStream fileOutputStream;
        this.h++;
        try {
            fileOutputStream = new FileOutputStream(new File(e(), String.format("%s-LFH.dat", new Object[]{Integer.valueOf(this.h)})));
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            return;
        } catch (IOException e2) {
            throw new bv("Could not write metadata file.", (Exception) e2);
        } catch (Throwable th) {
            ci.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final void a(byte[] bArr, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.h));
        FileOutputStream fileOutputStream = new FileOutputStream(f());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            File d2 = this.c.d(this.d, this.e, this.f, this.g);
            if (d2.exists()) {
                d2.delete();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(d2);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
                return;
            } catch (Throwable th) {
                ci.a(th, th);
            }
            throw th;
            throw th;
        } catch (Throwable th2) {
            ci.a(th, th2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(byte[] bArr, InputStream inputStream) throws IOException {
        this.h++;
        FileOutputStream fileOutputStream = new FileOutputStream(b());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.b);
            while (read > 0) {
                fileOutputStream.write(this.b, 0, read);
                read = inputStream.read(this.b);
            }
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            ci.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final File b() {
        return new File(e(), String.format("%s-NAM.dat", new Object[]{Integer.valueOf(this.h)}));
    }

    /* access modifiers changed from: package-private */
    public final void b(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.h));
        FileOutputStream fileOutputStream = new FileOutputStream(f());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            ci.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final void b(byte[] bArr, int i) throws IOException {
        this.h++;
        FileOutputStream fileOutputStream = new FileOutputStream(b());
        try {
            fileOutputStream.write(bArr, 0, i);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            ci.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final int c() throws IOException {
        File c2 = this.c.c(this.d, this.e, this.f, this.g);
        if (!c2.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(c2);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new bv("Slice checkpoint file corrupt.");
        } catch (Throwable th) {
            ci.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        FileInputStream fileInputStream;
        File c2 = this.c.c(this.d, this.e, this.f, this.g);
        if (!c2.exists()) {
            return false;
        }
        try {
            fileInputStream = new FileInputStream(c2);
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("fileStatus") != null) {
                return Integer.parseInt(properties.getProperty("fileStatus")) == 4;
            }
            f10923a.b("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
            return false;
        } catch (IOException e2) {
            f10923a.b("Could not read checkpoint while checking if extraction finished. %s", e2);
            return false;
        } catch (Throwable th) {
            ci.a(th, th);
        }
        throw th;
    }
}
