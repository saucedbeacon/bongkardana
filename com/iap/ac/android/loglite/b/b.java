package com.iap.ac.android.loglite.b;

import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.iap.ac.android.loglite.api.AnalyticsHelper;
import com.iap.ac.android.loglite.b.c;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c.a f9727a;

    public b(c.a aVar) {
        this.f9727a = aVar;
    }

    public void run() {
        try {
            TimeUnit.MILLISECONDS.sleep(DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS);
        } catch (InterruptedException unused) {
        }
        HashMap hashMap = new HashMap();
        hashMap.put("discardCount", String.valueOf(this.f9727a.b));
        AnalyticsHelper.sendPerformanceLog("sendLogTooMuch", hashMap);
        synchronized (this.f9727a.c) {
            this.f9727a.b = 0;
        }
    }
}
