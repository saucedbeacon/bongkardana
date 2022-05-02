package com.iap.ac.android.diagnoselog.api;

import android.app.Application;
import androidx.annotation.NonNull;
import com.iap.ac.android.common.config.ACConfig;
import com.iap.ac.android.diagnoselog.a.a;
import com.iap.ac.android.diagnoselog.a.b;
import com.iap.ac.android.diagnoselog.a.c;
import com.iap.ac.android.diagnoselog.core.DiagnoseLogContext;
import java.util.Date;

public class DiagnoseLogService {
    private static OnLogUploadListener onLogUploadListener;

    @Deprecated
    public static void flush() {
        DiagnoseLogContext b = DiagnoseLogContext.b();
        b.c.execute(new c(b));
    }

    public static void init(Application application) {
        DiagnoseLogContext.i = new DiagnoseLogContext(application);
        ACConfig.addCommonConfigChangeListener("DIAGNOSE_LOG_COMMAND", DiagnoseLogContext.b());
    }

    public static void setEnabled(boolean z) {
        DiagnoseLogContext.b().e = z;
    }

    public static void setOnLogUploadListener(@NonNull OnLogUploadListener onLogUploadListener2) {
        onLogUploadListener = onLogUploadListener2;
    }

    public static void upload(String str) {
        DiagnoseLogContext b = DiagnoseLogContext.b();
        b.c.execute(new a(b, str));
    }

    public static void upload(@NonNull Date date) {
        DiagnoseLogContext b = DiagnoseLogContext.b();
        b.c.execute(new b(b, onLogUploadListener, date));
    }
}
