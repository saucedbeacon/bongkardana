package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import com.appsflyer.AFExecutor;
import com.appsflyer.AFLogger;
import java.lang.ref.WeakReference;
import java.util.concurrent.RejectedExecutionException;

@RequiresApi(api = 14)
public final class ah implements Application.ActivityLifecycleCallbacks {

    /* renamed from: ˎ  reason: contains not printable characters */
    public static ah f8675;

    /* renamed from: ˊ  reason: contains not printable characters */
    boolean f8676 = true;

    /* renamed from: ˋ  reason: contains not printable characters */
    boolean f8677 = false;

    /* renamed from: ॱ  reason: contains not printable characters */
    public d f8678 = null;

    public interface d {
        /* renamed from: ˋ  reason: contains not printable characters */
        void m1233(WeakReference<Context> weakReference);

        /* renamed from: ˏ  reason: contains not printable characters */
        void m1234(Activity activity);
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        this.f8676 = false;
        boolean z = !this.f8677;
        this.f8677 = true;
        if (z) {
            try {
                this.f8678.m1234(activity);
            } catch (Exception e) {
                AFLogger.afErrorLog("Listener threw exception! ", e);
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        this.f8676 = true;
        try {
            new b(new WeakReference(activity.getApplicationContext())).executeOnExecutor(AFExecutor.getInstance().getThreadPoolExecutor(), new Void[0]);
        } catch (RejectedExecutionException e) {
            AFLogger.afErrorLog("backgroundTask.executeOnExecutor failed with RejectedExecutionException Exception", e);
        } catch (Throwable th) {
            AFLogger.afErrorLog("backgroundTask.executeOnExecutor failed with Exception", th);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        f.m1271();
        Intent intent = activity.getIntent();
        if (f.m1273(intent) != null && intent.getData() != f.f8744) {
            f.f8744 = intent.getData();
        }
    }

    class b extends AsyncTask<Void, Void, Void> {

        /* renamed from: ॱ  reason: contains not printable characters */
        private WeakReference<Context> f8680;

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return m1232();
        }

        public b(WeakReference<Context> weakReference) {
            this.f8680 = weakReference;
        }

        /* renamed from: ˏ  reason: contains not printable characters */
        private Void m1232() {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                AFLogger.afErrorLog("Sleeping attempt failed (essential for background state verification)\n", e);
            }
            if (ah.this.f8677 && ah.this.f8676) {
                ah.this.f8677 = false;
                try {
                    ah.this.f8678.m1233(this.f8680);
                } catch (Exception e2) {
                    AFLogger.afErrorLog("Listener threw exception! ", e2);
                    cancel(true);
                }
            }
            this.f8680.clear();
            return null;
        }
    }
}
