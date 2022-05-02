package com.iap.ac.android.loglite.storage;

import android.app.Application;
import com.iap.ac.android.loglite.core.AnalyticsContext;
import com.iap.ac.android.loglite.log.LogEvent;
import java.io.File;

public class CrashFileStorage extends AnalyticsFileStorage {
    public File h;

    public CrashFileStorage(Application application, String str) {
        super(application, str);
    }

    public void a(LogEvent logEvent) {
        a(logEvent.f(), logEvent.c());
    }

    public void a() {
        d();
    }

    public File a(String str) {
        if (this.h == null) {
            String productId = AnalyticsContext.getInstance().getProductId();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f9737a.getFilesDir());
            String str2 = File.separator;
            sb.append(str2);
            sb.append("loglite");
            sb.append(str2);
            sb.append(productId);
            File file = new File(sb.toString(), this.f);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.h = new File(file, "crash");
        }
        return this.h;
    }
}
