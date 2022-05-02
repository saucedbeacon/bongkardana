package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
public abstract class JobIntentService extends Service {
    static final boolean DEBUG = false;
    static final String TAG = "JobIntentService";
    static final HashMap<ComponentName, isInside> sClassWorkEnqueuer = new HashMap<>();
    static final Object sLock = new Object();
    final ArrayList<getMin> mCompatQueue;
    isInside mCompatWorkEnqueuer;
    setMin mCurProcessor;
    boolean mDestroyed = false;
    boolean mInterruptIfStopped = false;
    getMax mJobImpl;
    boolean mStopped = false;

    interface getMax {
        setMax getMax();

        IBinder getMin();
    }

    interface setMax {
        Intent getMax();

        void length();
    }

    /* access modifiers changed from: protected */
    public abstract void onHandleWork(@NonNull Intent intent);

    public boolean onStopCurrentWork() {
        return true;
    }

    static abstract class isInside {
        int length;
        boolean setMax;
        final ComponentName setMin;

        public void getMin() {
        }

        /* access modifiers changed from: package-private */
        public abstract void getMin(Intent intent);

        public void setMax() {
        }

        public void setMin() {
        }

        isInside(ComponentName componentName) {
            this.setMin = componentName;
        }

        /* access modifiers changed from: package-private */
        public void setMax(int i) {
            if (!this.setMax) {
                this.setMax = true;
                this.length = i;
            } else if (this.length != i) {
                StringBuilder sb = new StringBuilder("Given job ID ");
                sb.append(i);
                sb.append(" is different than previous ");
                sb.append(this.length);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    static final class length extends isInside {
        private final PowerManager.WakeLock IsOverlapping;
        private final PowerManager.WakeLock equals;
        boolean getMax;
        boolean getMin;
        private final Context toFloatRange;

        length(Context context, ComponentName componentName) {
            super(componentName);
            this.toFloatRange = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            StringBuilder sb = new StringBuilder();
            sb.append(componentName.getClassName());
            sb.append(":launch");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, sb.toString());
            this.equals = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(componentName.getClassName());
            sb2.append(":run");
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, sb2.toString());
            this.IsOverlapping = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        /* access modifiers changed from: package-private */
        public final void getMin(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.setMin);
            if (this.toFloatRange.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.getMin) {
                        this.getMin = true;
                        if (!this.getMax) {
                            this.equals.acquire(DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS);
                        }
                    }
                }
            }
        }

        public final void getMin() {
            synchronized (this) {
                this.getMin = false;
            }
        }

        public final void setMin() {
            synchronized (this) {
                if (!this.getMax) {
                    this.getMax = true;
                    this.IsOverlapping.acquire(600000);
                    this.equals.release();
                }
            }
        }

        public final void setMax() {
            synchronized (this) {
                if (this.getMax) {
                    if (this.getMin) {
                        this.equals.acquire(DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS);
                    }
                    this.getMax = false;
                    this.IsOverlapping.release();
                }
            }
        }
    }

    @RequiresApi(26)
    static final class toFloatRange extends JobServiceEngine implements getMax {
        JobParameters getMax;
        final JobIntentService getMin;
        final Object setMax = new Object();

        final class getMax implements setMax {
            final JobWorkItem getMin;

            getMax(JobWorkItem jobWorkItem) {
                this.getMin = jobWorkItem;
            }

            public final Intent getMax() {
                return this.getMin.getIntent();
            }

            public final void length() {
                synchronized (toFloatRange.this.setMax) {
                    if (toFloatRange.this.getMax != null) {
                        toFloatRange.this.getMax.completeWork(this.getMin);
                    }
                }
            }
        }

        toFloatRange(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.getMin = jobIntentService;
        }

        public final IBinder getMin() {
            return getBinder();
        }

        public final boolean onStartJob(JobParameters jobParameters) {
            this.getMax = jobParameters;
            this.getMin.ensureProcessorRunningLocked(false);
            return true;
        }

        public final boolean onStopJob(JobParameters jobParameters) {
            boolean doStopCurrentWork = this.getMin.doStopCurrentWork();
            synchronized (this.setMax) {
                this.getMax = null;
            }
            return doStopCurrentWork;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
            r1.getIntent().setExtrasClassLoader(r3.getMin.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
            return new androidx.core.app.JobIntentService.toFloatRange.getMax(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r1 == null) goto L_0x0026;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.core.app.JobIntentService.setMax getMax() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.setMax
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.getMax     // Catch:{ all -> 0x0027 }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                return r2
            L_0x000a:
                android.app.job.JobParameters r1 = r3.getMax     // Catch:{ all -> 0x0027 }
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ all -> 0x0027 }
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                if (r1 == 0) goto L_0x0026
                android.content.Intent r0 = r1.getIntent()
                androidx.core.app.JobIntentService r2 = r3.getMin
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                androidx.core.app.JobIntentService$toFloatRange$getMax r0 = new androidx.core.app.JobIntentService$toFloatRange$getMax
                r0.<init>(r1)
                return r0
            L_0x0026:
                return r2
            L_0x0027:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.JobIntentService.toFloatRange.getMax():androidx.core.app.JobIntentService$setMax");
        }
    }

    @RequiresApi(26)
    static final class toIntRange extends isInside {
        private final JobScheduler getMax;
        private final JobInfo getMin;

        toIntRange(Context context, ComponentName componentName, int i) {
            super(componentName);
            setMax(i);
            this.getMin = new JobInfo.Builder(i, this.setMin).setOverrideDeadline(0).build();
            this.getMax = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        /* access modifiers changed from: package-private */
        public final void getMin(Intent intent) {
            this.getMax.enqueue(this.getMin, new JobWorkItem(intent));
        }
    }

    final class getMin implements setMax {
        final Intent length;
        final int setMax;

        getMin(Intent intent, int i) {
            this.length = intent;
            this.setMax = i;
        }

        public final Intent getMax() {
            return this.length;
        }

        public final void length() {
            JobIntentService.this.stopSelf(this.setMax);
        }
    }

    final class setMin extends AsyncTask<Void, Void, Void> {
        setMin() {
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onCancelled(Object obj) {
            JobIntentService.this.processorFinished();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            JobIntentService.this.processorFinished();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            while (true) {
                setMax dequeueWork = JobIntentService.this.dequeueWork();
                if (dequeueWork == null) {
                    return null;
                }
                JobIntentService.this.onHandleWork(dequeueWork.getMax());
                dequeueWork.length();
            }
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mCompatQueue = null;
        } else {
            this.mCompatQueue = new ArrayList<>();
        }
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.mJobImpl = new toFloatRange(this);
            this.mCompatWorkEnqueuer = null;
            return;
        }
        this.mJobImpl = null;
        this.mCompatWorkEnqueuer = getWorkEnqueuer(this, new ComponentName(this, getClass()), false, 0);
    }

    public int onStartCommand(@Nullable Intent intent, int i, int i2) {
        if (this.mCompatQueue == null) {
            return 2;
        }
        this.mCompatWorkEnqueuer.getMin();
        synchronized (this.mCompatQueue) {
            ArrayList<getMin> arrayList = this.mCompatQueue;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new getMin(intent, i2));
            ensureProcessorRunningLocked(true);
        }
        return 3;
    }

    public IBinder onBind(@NonNull Intent intent) {
        getMax getmax = this.mJobImpl;
        if (getmax != null) {
            return getmax.getMin();
        }
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList<getMin> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.setMax();
            }
        }
    }

    public static void enqueueWork(@NonNull Context context, @NonNull Class<?> cls, int i, @NonNull Intent intent) {
        enqueueWork(context, new ComponentName(context, cls), i, intent);
    }

    public static void enqueueWork(@NonNull Context context, @NonNull ComponentName componentName, int i, @NonNull Intent intent) {
        if (intent != null) {
            synchronized (sLock) {
                isInside workEnqueuer = getWorkEnqueuer(context, componentName, true, i);
                workEnqueuer.setMax(i);
                workEnqueuer.getMin(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    static isInside getWorkEnqueuer(Context context, ComponentName componentName, boolean z, int i) {
        isInside isinside;
        isInside isinside2 = sClassWorkEnqueuer.get(componentName);
        if (isinside2 != null) {
            return isinside2;
        }
        if (Build.VERSION.SDK_INT < 26) {
            isinside = new length(context, componentName);
        } else if (z) {
            isinside = new toIntRange(context, componentName, i);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        isInside isinside3 = isinside;
        sClassWorkEnqueuer.put(componentName, isinside3);
        return isinside3;
    }

    public void setInterruptIfStopped(boolean z) {
        this.mInterruptIfStopped = z;
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    /* access modifiers changed from: package-private */
    public boolean doStopCurrentWork() {
        setMin setmin = this.mCurProcessor;
        if (setmin != null) {
            setmin.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return onStopCurrentWork();
    }

    /* access modifiers changed from: package-private */
    public void ensureProcessorRunningLocked(boolean z) {
        if (this.mCurProcessor == null) {
            this.mCurProcessor = new setMin();
            isInside isinside = this.mCompatWorkEnqueuer;
            if (isinside != null && z) {
                isinside.setMin();
            }
            this.mCurProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public void processorFinished() {
        ArrayList<getMin> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mCurProcessor = null;
                if (this.mCompatQueue != null && this.mCompatQueue.size() > 0) {
                    ensureProcessorRunningLocked(false);
                } else if (!this.mDestroyed) {
                    this.mCompatWorkEnqueuer.setMax();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public setMax dequeueWork() {
        getMax getmax = this.mJobImpl;
        if (getmax != null) {
            return getmax.getMax();
        }
        synchronized (this.mCompatQueue) {
            if (this.mCompatQueue.size() <= 0) {
                return null;
            }
            setMax remove = this.mCompatQueue.remove(0);
            return remove;
        }
    }
}
