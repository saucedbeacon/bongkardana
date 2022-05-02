package com.ta.audid.g;

import com.ta.audid.f.e;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private static FileChannel f9845a;

    /* renamed from: a  reason: collision with other field name */
    private static FileLock f8834a;
    private static File b;

    /* renamed from: b  reason: collision with other field name */
    private static FileChannel f8835b;

    /* renamed from: b  reason: collision with other field name */
    private static FileLock f8836b;
    private static File c;

    public static synchronized void g() {
        synchronized (f.class) {
            m.d();
            if (b == null) {
                b = new File(e.P());
            }
            if (!b.exists()) {
                try {
                    b.createNewFile();
                } catch (Exception unused) {
                    return;
                }
            }
            if (f9845a == null) {
                try {
                    f9845a = new RandomAccessFile(b, "rw").getChannel();
                } catch (Exception unused2) {
                    return;
                }
            }
            try {
                f8834a = f9845a.lock();
            } catch (Throwable unused3) {
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0010 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void h() {
        /*
            java.lang.Class<com.ta.audid.g.f> r0 = com.ta.audid.g.f.class
            monitor-enter(r0)
            com.ta.audid.g.m.d()     // Catch:{ all -> 0x002e }
            java.nio.channels.FileLock r1 = f8834a     // Catch:{ all -> 0x002e }
            r2 = 0
            if (r1 == 0) goto L_0x0017
            java.nio.channels.FileLock r1 = f8834a     // Catch:{ Exception -> 0x0010, all -> 0x0013 }
            r1.release()     // Catch:{ Exception -> 0x0010, all -> 0x0013 }
        L_0x0010:
            f8834a = r2     // Catch:{ all -> 0x002e }
            goto L_0x0017
        L_0x0013:
            r1 = move-exception
            f8834a = r2     // Catch:{ all -> 0x002e }
            throw r1     // Catch:{ all -> 0x002e }
        L_0x0017:
            java.nio.channels.FileChannel r1 = f9845a     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x002c
            java.nio.channels.FileChannel r1 = f9845a     // Catch:{ Exception -> 0x0028, all -> 0x0024 }
            r1.close()     // Catch:{ Exception -> 0x0028, all -> 0x0024 }
            f9845a = r2     // Catch:{ all -> 0x002e }
            monitor-exit(r0)
            return
        L_0x0024:
            r1 = move-exception
            f9845a = r2     // Catch:{ all -> 0x002e }
            throw r1     // Catch:{ all -> 0x002e }
        L_0x0028:
            f9845a = r2     // Catch:{ all -> 0x002e }
            monitor-exit(r0)
            return
        L_0x002c:
            monitor-exit(r0)
            return
        L_0x002e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.audid.g.f.h():void");
    }

    public static synchronized boolean d() {
        synchronized (f.class) {
            m.d();
            if (c == null) {
                c = new File(e.Q());
            }
            if (!c.exists()) {
                try {
                    c.createNewFile();
                } catch (Exception unused) {
                    return false;
                }
            }
            if (f8835b == null) {
                try {
                    f8835b = new RandomAccessFile(c, "rw").getChannel();
                } catch (Exception unused2) {
                    return false;
                }
            }
            try {
                FileLock tryLock = f8835b.tryLock();
                if (tryLock != null) {
                    f8836b = tryLock;
                    return true;
                }
            } catch (Throwable unused3) {
            }
        }
        return false;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0010 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void i() {
        /*
            java.lang.Class<com.ta.audid.g.f> r0 = com.ta.audid.g.f.class
            monitor-enter(r0)
            com.ta.audid.g.m.d()     // Catch:{ all -> 0x002e }
            java.nio.channels.FileLock r1 = f8836b     // Catch:{ all -> 0x002e }
            r2 = 0
            if (r1 == 0) goto L_0x0017
            java.nio.channels.FileLock r1 = f8836b     // Catch:{ Exception -> 0x0010, all -> 0x0013 }
            r1.release()     // Catch:{ Exception -> 0x0010, all -> 0x0013 }
        L_0x0010:
            f8836b = r2     // Catch:{ all -> 0x002e }
            goto L_0x0017
        L_0x0013:
            r1 = move-exception
            f8836b = r2     // Catch:{ all -> 0x002e }
            throw r1     // Catch:{ all -> 0x002e }
        L_0x0017:
            java.nio.channels.FileChannel r1 = f8835b     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x002c
            java.nio.channels.FileChannel r1 = f8835b     // Catch:{ Exception -> 0x0028, all -> 0x0024 }
            r1.close()     // Catch:{ Exception -> 0x0028, all -> 0x0024 }
            f8835b = r2     // Catch:{ all -> 0x002e }
            monitor-exit(r0)
            return
        L_0x0024:
            r1 = move-exception
            f8835b = r2     // Catch:{ all -> 0x002e }
            throw r1     // Catch:{ all -> 0x002e }
        L_0x0028:
            f8835b = r2     // Catch:{ all -> 0x002e }
            monitor-exit(r0)
            return
        L_0x002c:
            monitor-exit(r0)
            return
        L_0x002e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.audid.g.f.i():void");
    }
}
