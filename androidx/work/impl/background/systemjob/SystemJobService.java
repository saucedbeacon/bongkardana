package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;
import o.getAutoSizeStepGranularity;
import o.getAutoSizeTextAvailableSizes;
import o.setSupportBackgroundTintList;
import o.setSupportCompoundDrawablesTintList;
import o.setTextFuture;

@RequiresApi(23)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemJobService extends JobService implements getAutoSizeTextAvailableSizes {
    private static final String length = setSupportBackgroundTintList.length("SystemJobService");
    private setSupportCompoundDrawablesTintList getMax;
    private final Map<String, JobParameters> setMax = new HashMap();

    public void onCreate() {
        super.onCreate();
        try {
            setSupportCompoundDrawablesTintList length2 = setSupportCompoundDrawablesTintList.length(getApplicationContext());
            this.getMax = length2;
            length2.toIntRange.getMin((getAutoSizeTextAvailableSizes) this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                setSupportBackgroundTintList.getMax();
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = this.getMax;
        if (setsupportcompounddrawablestintlist != null) {
            getAutoSizeStepGranularity getautosizestepgranularity = setsupportcompounddrawablestintlist.toIntRange;
            synchronized (getautosizestepgranularity.getMin) {
                getautosizestepgranularity.length.remove(this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (android.os.Build.VERSION.SDK_INT < 24) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        r2 = new androidx.work.WorkerParameters.getMax();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        if (r6.getTriggeredContentUris() == null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        r2.setMax = java.util.Arrays.asList(r6.getTriggeredContentUris());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0054, code lost:
        if (r6.getTriggeredContentAuthorities() == null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        r2.setMin = java.util.Arrays.asList(r6.getTriggeredContentAuthorities());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0064, code lost:
        if (android.os.Build.VERSION.SDK_INT < 28) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        r2.getMin = r6.getNetwork();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006c, code lost:
        r6 = r5.getMax;
        r6.length.length(new o.setCompoundDrawablesWithIntrinsicBounds(r6, r0, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0078, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(@androidx.annotation.NonNull android.app.job.JobParameters r6) {
        /*
            r5 = this;
            o.setSupportCompoundDrawablesTintList r0 = r5.getMax
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x000d
            o.setSupportBackgroundTintList.getMax()
            r5.jobFinished(r6, r1)
            return r2
        L_0x000d:
            java.lang.String r0 = length(r6)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x001b
            o.setSupportBackgroundTintList.getMax()
            return r2
        L_0x001b:
            java.util.Map<java.lang.String, android.app.job.JobParameters> r3 = r5.setMax
            monitor-enter(r3)
            java.util.Map<java.lang.String, android.app.job.JobParameters> r4 = r5.setMax     // Catch:{ all -> 0x0079 }
            boolean r4 = r4.containsKey(r0)     // Catch:{ all -> 0x0079 }
            if (r4 == 0) goto L_0x002b
            o.setSupportBackgroundTintList.getMax()     // Catch:{ all -> 0x0079 }
            monitor-exit(r3)     // Catch:{ all -> 0x0079 }
            return r2
        L_0x002b:
            o.setSupportBackgroundTintList.getMax()     // Catch:{ all -> 0x0079 }
            java.util.Map<java.lang.String, android.app.job.JobParameters> r2 = r5.setMax     // Catch:{ all -> 0x0079 }
            r2.put(r0, r6)     // Catch:{ all -> 0x0079 }
            monitor-exit(r3)     // Catch:{ all -> 0x0079 }
            r2 = 0
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r3 < r4) goto L_0x006c
            androidx.work.WorkerParameters$getMax r2 = new androidx.work.WorkerParameters$getMax
            r2.<init>()
            android.net.Uri[] r3 = r6.getTriggeredContentUris()
            if (r3 == 0) goto L_0x0050
            android.net.Uri[] r3 = r6.getTriggeredContentUris()
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.setMax = r3
        L_0x0050:
            java.lang.String[] r3 = r6.getTriggeredContentAuthorities()
            if (r3 == 0) goto L_0x0060
            java.lang.String[] r3 = r6.getTriggeredContentAuthorities()
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.setMin = r3
        L_0x0060:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 < r4) goto L_0x006c
            android.net.Network r6 = r6.getNetwork()
            r2.getMin = r6
        L_0x006c:
            o.setSupportCompoundDrawablesTintList r6 = r5.getMax
            o.getMinWidthMinor r3 = r6.length
            o.setCompoundDrawablesWithIntrinsicBounds r4 = new o.setCompoundDrawablesWithIntrinsicBounds
            r4.<init>(r6, r0, r2)
            r3.length(r4)
            return r1
        L_0x0079:
            r6 = move-exception
            monitor-exit(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public boolean onStopJob(@NonNull JobParameters jobParameters) {
        if (this.getMax == null) {
            setSupportBackgroundTintList.getMax();
            return true;
        }
        String length2 = length(jobParameters);
        if (TextUtils.isEmpty(length2)) {
            setSupportBackgroundTintList.getMax();
            return false;
        }
        setSupportBackgroundTintList.getMax();
        synchronized (this.setMax) {
            this.setMax.remove(length2);
        }
        setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = this.getMax;
        setsupportcompounddrawablestintlist.length.length(new setTextFuture(setsupportcompounddrawablestintlist, length2, false));
        if (!this.getMax.toIntRange.IsOverlapping(length2)) {
            return true;
        }
        return false;
    }

    public void onExecuted(@NonNull String str, boolean z) {
        JobParameters remove;
        setSupportBackgroundTintList.getMax();
        synchronized (this.setMax) {
            remove = this.setMax.remove(str);
        }
        if (remove != null) {
            jobFinished(remove, z);
        }
    }

    @Nullable
    private static String length(@NonNull JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }
}
