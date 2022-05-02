package o;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.impl.background.systemjob.SystemJobService;
import o.AlertDialogLayout;

@RequiresApi(api = 23)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
class getSupportButtonTintMode {
    private static final String setMin = setSupportBackgroundTintList.length("SystemJobInfoConverter");
    private final ComponentName getMax;

    @VisibleForTesting(otherwise = 3)
    getSupportButtonTintMode(@NonNull Context context) {
        this.getMax = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    /* access modifiers changed from: package-private */
    public JobInfo setMin(getInternalPopup getinternalpopup, int i) {
        setDefaultActionButtonContentDescription setdefaultactionbuttoncontentdescription = getinternalpopup.toFloatRange;
        int length = length(setdefaultactionbuttoncontentdescription.length);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", getinternalpopup.getMax);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", getinternalpopup.length());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.getMax).setRequiredNetworkType(length).setRequiresCharging(setdefaultactionbuttoncontentdescription.length()).setRequiresDeviceIdle(setdefaultactionbuttoncontentdescription.setMin()).setExtras(persistableBundle);
        if (!setdefaultactionbuttoncontentdescription.setMin()) {
            extras.setBackoffCriteria(getinternalpopup.toString, getinternalpopup.FastBitmap$CoordinateSystem == BackoffPolicy.LINEAR ? 0 : 1);
        }
        long max = Math.max(getinternalpopup.getMin() - System.currentTimeMillis(), 0);
        if (Build.VERSION.SDK_INT <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else {
            extras.setImportantWhileForeground(true);
        }
        if (Build.VERSION.SDK_INT >= 24 && setdefaultactionbuttoncontentdescription.setMax()) {
            for (AlertDialogLayout.getMax max2 : setdefaultactionbuttoncontentdescription.equals.setMin) {
                extras.addTriggerContentUri(getMax(max2));
            }
            extras.setTriggerContentUpdateDelay(setdefaultactionbuttoncontentdescription.isInside);
            extras.setTriggerContentMaxDelay(setdefaultactionbuttoncontentdescription.IsOverlapping);
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(setdefaultactionbuttoncontentdescription.getMin());
            extras.setRequiresStorageNotLow(setdefaultactionbuttoncontentdescription.getMax());
        }
        return extras.build();
    }

    @RequiresApi(24)
    private static JobInfo.TriggerContentUri getMax(AlertDialogLayout.getMax getmax) {
        return new JobInfo.TriggerContentUri(getmax.setMax, getmax.getMax() ? 1 : 0);
    }

    /* renamed from: o.getSupportButtonTintMode$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] getMax;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.work.NetworkType[] r0 = androidx.work.NetworkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                getMax = r0
                androidx.work.NetworkType r1 = androidx.work.NetworkType.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.work.NetworkType r1 = androidx.work.NetworkType.CONNECTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.work.NetworkType r1 = androidx.work.NetworkType.UNMETERED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.work.NetworkType r1 = androidx.work.NetworkType.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.work.NetworkType r1 = androidx.work.NetworkType.METERED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getSupportButtonTintMode.AnonymousClass4.<clinit>():void");
        }
    }

    static int length(NetworkType networkType) {
        int i = AnonymousClass4.getMax[networkType.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            if (i == 5 && Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            return 3;
        }
        setSupportBackgroundTintList.getMax();
        return 1;
    }
}
