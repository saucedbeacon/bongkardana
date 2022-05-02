package com.iap.ac.android.loglite.b;

import android.app.Application;
import com.iap.ac.android.loglite.core.AnalyticsContext;
import com.iap.ac.android.loglite.storage.AsyncFileStorage;
import java.io.File;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class d extends AsyncFileStorage {
    public d(Application application, String str) {
        super(application, str);
    }

    public File a(String str) {
        String productId = AnalyticsContext.getInstance().getProductId();
        StringBuilder sb = new StringBuilder();
        sb.append(productId);
        sb.append(this.f);
        sb.append(str);
        String obj = sb.toString();
        File file = this.c.get(obj);
        if (file != null) {
            return file;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f9737a.getFilesDir());
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append("loglite");
        sb2.append(str2);
        sb2.append(productId);
        File file2 = new File(sb2.toString(), this.f);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f);
        sb3.append("_");
        sb3.append(str);
        File file3 = new File(file2, sb3.toString());
        this.c.put(obj, file3);
        return file3;
    }

    public BlockingQueue<Runnable> e() {
        return new LinkedBlockingQueue(512);
    }

    public RejectedExecutionHandler f() {
        return new ThreadPoolExecutor.DiscardOldestPolicy();
    }
}
