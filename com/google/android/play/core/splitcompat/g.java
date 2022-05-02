package com.google.android.play.core.splitcompat;

import com.google.android.play.core.internal.ci;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.zip.ZipFile;

final class g implements i {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Set f9610a;
    final /* synthetic */ q b;
    final /* synthetic */ ZipFile c;

    g(Set set, q qVar, ZipFile zipFile) {
        this.f9610a = set;
        this.b = qVar;
        this.c = zipFile;
    }

    public final void a(j jVar, File file, boolean z) throws IOException {
        FileOutputStream fileOutputStream;
        this.f9610a.add(file);
        if (!z) {
            this.b.b();
            String str = jVar.f9611a;
            this.b.a().getAbsolutePath();
            jVar.b.getName();
            file.getAbsolutePath();
            byte[] bArr = new byte[4096];
            InputStream inputStream = this.c.getInputStream(jVar.b);
            try {
                fileOutputStream = new FileOutputStream(file);
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.close();
                if (inputStream != null) {
                    inputStream.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        ci.a(th, th2);
                    }
                }
                throw th;
            }
        } else {
            return;
        }
        throw th;
    }
}
