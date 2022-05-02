package com.ta.audid.f;

import android.content.Context;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.ta.audid.g.j;
import java.util.concurrent.ScheduledFuture;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static d f9841a;

    /* renamed from: a  reason: collision with other field name */
    private ScheduledFuture f8830a;
    private Context mContext = null;

    private d(Context context) {
        this.mContext = context;
    }

    public static synchronized d a(Context context) {
        d dVar;
        synchronized (d.class) {
            if (f9841a == null) {
                f9841a = new d(context);
            }
            dVar = f9841a;
        }
        return dVar;
    }

    public synchronized void start() {
        if (this.f8830a != null) {
            this.f8830a.cancel(true);
        }
        e();
    }

    public synchronized void stop() {
        if (this.f8830a != null) {
            this.f8830a.cancel(true);
        }
    }

    private void e() {
        this.f8830a = j.a().a(this.f8830a, new g(this.mContext), DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS, 180000);
    }
}
