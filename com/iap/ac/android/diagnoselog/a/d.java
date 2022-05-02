package com.iap.ac.android.diagnoselog.a;

import com.iap.ac.android.diagnoselog.core.UserDiagnosing;
import com.iap.ac.android.diagnoselog.util.ZipUtil$ZipFileHandler;
import com.iap.ac.android.loglite.utils.LoggerWrapper;
import java.io.File;
import java.util.Date;

public class d implements ZipUtil$ZipFileHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UserDiagnosing f11043a;

    public d(UserDiagnosing userDiagnosing) {
        this.f11043a = userDiagnosing;
    }

    public String a(File file) {
        String name = file.getName();
        try {
            String str = name.split("_")[0];
            return name.replace(str, this.f11043a.c.format(new Date(Long.parseLong(str))));
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append(" handleFileNameInZip");
            LoggerWrapper.w("UserDiagnosing", sb.toString(), th);
            return name;
        }
    }
}
