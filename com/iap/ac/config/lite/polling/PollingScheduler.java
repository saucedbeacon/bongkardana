package com.iap.ac.config.lite.polling;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.utils.NetworkUtils;
import com.iap.ac.android.common.utils.ProcessOwnerLifecycleWatcher;
import com.iap.ac.config.lite.ConfigCenterContext;
import com.iap.ac.config.lite.common.ICancelableTask;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class PollingScheduler<T> implements ICancelableTask {
    /* access modifiers changed from: private */
    public static final String k = com.iap.ac.config.lite.c.e.b("PollingScheduler");
    private static boolean l = true;
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    private PollingStatus f9816a = PollingStatus.WAITING;
    private volatile boolean b = false;
    @NonNull
    protected final Handler c;
    @NonNull
    public final ConfigCenterContext d;
    @NonNull
    private final List<f<T>> e = new ArrayList();
    public int f = 0;
    public int g = 0;
    /* access modifiers changed from: private */
    @Nullable
    public ProcessOwnerLifecycleWatcher h;
    @Nullable
    private NetworkUtils.NetworkStateListener i;
    private Handler j;

    enum PollingStatus {
        CANCELED,
        POLLING,
        WAITING
    }

    class a implements Runnable {
        a() {
        }

        public void run() {
            PollingScheduler.this.l();
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            PollingScheduler.this.l();
        }
    }

    class c implements NetworkUtils.NetworkStateListener {
        c() {
        }

        public void onNetworkChanged(int i, int i2) {
            if (i2 != 0) {
                ACLog.i(PollingScheduler.k, "onNetworkChanged to available, will try scheduleTask");
                PollingScheduler.this.k();
            }
        }
    }

    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f9821a;

        class a implements ProcessOwnerLifecycleWatcher.LifecycleCallback {
            a() {
            }

            public void onAppToBackground() {
            }

            public void onAppToForeground() {
                ACLog.i(PollingScheduler.k, "onAppToForeground, will try scheduleTask");
                PollingScheduler.this.k();
            }
        }

        d(Context context) {
            this.f9821a = context;
        }

        public void run() {
            String j = PollingScheduler.k;
            StringBuilder sb = new StringBuilder("Add app-foreground observer from: ");
            sb.append(Thread.currentThread().getName());
            ACLog.d(j, sb.toString());
            ProcessOwnerLifecycleWatcher unused = PollingScheduler.this.h = ProcessOwnerLifecycleWatcher.INSTANCE;
            PollingScheduler.this.h.addLifecycleCallback(new a());
            PollingScheduler.this.h.startWatcher(this.f9821a);
        }
    }

    class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f9823a;

        e(Context context) {
            this.f9823a = context;
        }

        public void run() {
            String j = PollingScheduler.k;
            StringBuilder sb = new StringBuilder("Remove app-foreground observer from: ");
            sb.append(Thread.currentThread().getName());
            ACLog.d(j, sb.toString());
            PollingScheduler.this.h.stopWatcher(this.f9823a);
        }
    }

    public static class f<P> {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public long f9824a;
        /* access modifiers changed from: private */
        @NonNull
        public P b;

        public f(@NonNull P p, long j) {
            this.b = p;
            this.f9824a = j;
        }

        public String toString() {
            return String.format("%s - delay %s ms", new Object[]{this.b, Long.valueOf(this.f9824a)});
        }
    }

    public PollingScheduler(@NonNull ConfigCenterContext configCenterContext) {
        this.d = configCenterContext;
        HandlerThread handlerThread = new HandlerThread("ConfigPollingScheduler-Thread");
        handlerThread.start();
        this.c = new Handler(handlerThread.getLooper());
        this.j = new Handler(Looper.getMainLooper());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.b     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0010
            boolean r0 = r1.m()     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0010
            monitor-exit(r1)
            r1.i()
            return
        L_0x0010:
            monitor-exit(r1)
            return
        L_0x0012:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.config.lite.polling.PollingScheduler.k():void");
    }

    /* access modifiers changed from: private */
    @WorkerThread
    public void l() {
        if (isCanceled()) {
            ACLog.w(k, "Scheduler already canceled. will skip doPollingTaskInternal.");
        } else if (this.g >= this.e.size()) {
            ACLog.w(k, "All tasks finished. will skip.");
        } else if (!m()) {
            String str = k;
            StringBuilder sb = new StringBuilder("AppInBackground or NoNetwork now! will not polling. mCurrentTaskIndex = ");
            sb.append(this.g);
            ACLog.e(str, sb.toString());
        } else {
            f();
            f fVar = this.e.get(this.g);
            if (a(fVar.b)) {
                cancel();
                return;
            }
            int i2 = this.g + 1;
            this.g = i2;
            if (i2 < this.e.size()) {
                a(fVar.f9824a);
                return;
            }
            ACLog.i(k, "All tasks finished.");
            int i3 = this.f + 1;
            this.f = i3;
            if (i3 >= a()) {
                ACLog.e(k, "** All retry turn finished, will not retry.");
                g();
                return;
            }
            long a2 = a(false);
            ACLog.i(k, String.format("** Will schedule next retry. mPollingCount = %s, delay = %s", new Object[]{Integer.valueOf(this.f), Long.valueOf(a2)}));
            this.g = 0;
            a(a2);
        }
    }

    private boolean m() {
        boolean z = false;
        if (l) {
            n();
            b(false);
            return true;
        }
        Context context = this.d.getContext();
        boolean a2 = com.iap.ac.config.lite.c.e.a(context);
        boolean isNetworkAvailable = NetworkUtils.isNetworkAvailable(context);
        ACLog.i(k, String.format("scheduleTask. appInForeground = %s, hasNetwork = %s", new Object[]{Boolean.valueOf(a2), Boolean.valueOf(isNetworkAvailable)}));
        if (a2 && isNetworkAvailable) {
            z = true;
        }
        b(!z);
        return z;
    }

    private static void n() {
        l = false;
    }

    private void o() {
        if (this.f9816a != PollingStatus.CANCELED) {
            this.f9816a = PollingStatus.POLLING;
        }
    }

    private void p() {
        Context context = this.d.getContext();
        if (!NetworkUtils.isNetworkAvailable(context)) {
            ACLog.d(k, "Add network observer");
            c cVar = new c();
            this.i = cVar;
            NetworkUtils.addNetworkStateListener(context, cVar);
        }
        if (!com.iap.ac.config.lite.c.e.a(context)) {
            if (this.j == null) {
                this.j = new Handler(Looper.getMainLooper());
            }
            this.j.post(new d(context));
        }
    }

    private void q() {
        Context context = this.d.getContext();
        if (this.i != null) {
            ACLog.d(k, "Remove network observer");
            NetworkUtils.removeNetworkStateListener(context, this.i);
            this.i = null;
        }
        if (this.h != null) {
            if (this.j == null) {
                this.j = new Handler(Looper.getMainLooper());
            }
            this.j.post(new e(context));
            this.i = null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract int a();

    /* access modifiers changed from: protected */
    public abstract long a(boolean z);

    /* access modifiers changed from: protected */
    @WorkerThread
    public abstract boolean a(@NonNull T t);

    /* access modifiers changed from: protected */
    public abstract String c();

    public void cancel() {
        if (this.f9816a != PollingStatus.CANCELED) {
            String str = k;
            StringBuilder sb = new StringBuilder("Will stop scheduler. mCurrentTaskIndex = ");
            sb.append(this.g);
            ACLog.d(str, sb.toString());
            this.f9816a = PollingStatus.CANCELED;
            this.c.removeCallbacksAndMessages((Object) null);
            b(false);
            Looper looper = this.c.getLooper();
            if (looper != null) {
                looper.quit();
            }
        }
    }

    public boolean d() {
        return this.f9816a == PollingStatus.POLLING;
    }

    public void e() {
        ACLog.d(k, "ConfigPollingScheduler tasks: ");
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            ACLog.d(k, String.format("    %s %s", new Object[]{Integer.valueOf(i2), this.e.get(i2)}));
        }
    }

    /* access modifiers changed from: protected */
    public abstract void f();

    public abstract void g();

    public void h() {
        a(a(false));
    }

    public void i() {
        if (isCanceled()) {
            ACLog.w(k, "Scheduler already canceled. will skip scheduleTask.");
            return;
        }
        o();
        this.c.post(new a());
    }

    public boolean isCanceled() {
        return this.f9816a == PollingStatus.CANCELED;
    }

    public int b() {
        return this.f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000c, code lost:
        if (r1.b == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000e, code lost:
        p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0011, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0012, code lost:
        q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0015, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(boolean r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.b     // Catch:{ all -> 0x0016 }
            if (r0 != r2) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            r1.b = r2     // Catch:{ all -> 0x0016 }
            monitor-exit(r1)     // Catch:{ all -> 0x0016 }
            boolean r2 = r1.b
            if (r2 == 0) goto L_0x0012
            r1.p()
            return
        L_0x0012:
            r1.q()
            return
        L_0x0016:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.config.lite.polling.PollingScheduler.b(boolean):void");
    }

    public void a(long j2) {
        if (isCanceled()) {
            ACLog.w(k, "Scheduler already canceled. will skip scheduleTask.");
        } else if (j2 < 0) {
            ACLog.i(k, "delay is less than zero, will not schedule");
        } else {
            ACLog.i(k, String.format("Will retry refresh for task %s after %s ms, mCurrentTaskIndex = %s.", new Object[]{c(), Long.valueOf(j2), Integer.valueOf(this.g)}));
            o();
            this.c.postDelayed(new b(), j2);
        }
    }

    public void a(f<T>... fVarArr) {
        if (fVarArr != null && fVarArr.length > 0) {
            this.e.clear();
            Collections.addAll(this.e, fVarArr);
        }
    }
}
