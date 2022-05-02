package com.iap.ac.android.loglite.b;

import android.app.Application;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.iap.ac.android.loglite.core.AnalyticsContext;
import com.iap.ac.android.loglite.storage.AsyncFileStorage;
import java.io.File;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class c extends AsyncFileStorage {

    @VisibleForTesting
    public static class a extends ThreadPoolExecutor.DiscardOldestPolicy {

        /* renamed from: a  reason: collision with root package name */
        public long f9728a = 0;
        public long b = 0;
        public final Object c = new Object();

        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            super.rejectedExecution(runnable, threadPoolExecutor);
            synchronized (this.c) {
                this.b++;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.f9728a > DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS) {
                    new Thread(new b(this)).start();
                    this.f9728a = currentTimeMillis;
                }
            }
        }
    }

    public c(Application application, String str) {
        super(application, str);
    }

    public File a(String str) {
        String productId = AnalyticsContext.getInstance().getProductId();
        StringBuilder sb = new StringBuilder();
        sb.append(productId);
        sb.append(this.f);
        sb.append(str);
        String obj = sb.toString();
        File file = this.b.get(obj);
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
        this.b.put(obj, file3);
        return file3;
    }

    public BlockingQueue<Runnable> e() {
        return new LinkedBlockingQueue(1024);
    }

    public RejectedExecutionHandler f() {
        return new a();
    }
}
