package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import com.google.android.exoplayer2.C;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o.compatMeasureContentWidth;
import o.getAutoSizeMinTextSize;
import o.getDropDownHorizontalOffset;
import o.getInternalPopup;
import o.getPopupContext;
import o.getTextMetricsParamsCompat;
import o.setCheckMarkDrawable;
import o.setLineHeight;
import o.setSupportBackgroundTintList;
import o.setSupportCompoundDrawablesTintList;
import o.setSupportCompoundDrawablesTintMode;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ForceStopRunnable implements Runnable {
    private static final long getMax = TimeUnit.DAYS.toMillis(3650);
    private static final String getMin = setSupportBackgroundTintList.length("ForceStopRunnable");
    private int length = 0;
    private final Context setMax;
    private final setSupportCompoundDrawablesTintList setMin;

    public ForceStopRunnable(@NonNull Context context, @NonNull setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist) {
        this.setMax = context.getApplicationContext();
        this.setMin = setsupportcompounddrawablestintlist;
    }

    public final void run() {
        if (setMax()) {
            while (true) {
                setSupportCompoundDrawablesTintMode.length(this.setMax);
                setSupportBackgroundTintList.getMax();
                try {
                    boolean length2 = length();
                    if (getMin()) {
                        setSupportBackgroundTintList.getMax();
                        this.setMin.getMin();
                        getTextMetricsParamsCompat gettextmetricsparamscompat = this.setMin.IsOverlapping;
                        gettextmetricsparamscompat.setMax.isInside().getMin(new getPopupContext("reschedule_needed"));
                    } else if (getMax()) {
                        setSupportBackgroundTintList.getMax();
                        this.setMin.getMin();
                    } else if (length2) {
                        setSupportBackgroundTintList.getMax();
                        getAutoSizeMinTextSize.setMax(this.setMin.getMax, this.setMin.setMax, this.setMin.getMin);
                    }
                    this.setMin.getMax();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e) {
                    int i = this.length + 1;
                    this.length = i;
                    if (i >= 3) {
                        setSupportBackgroundTintList.getMax();
                        new Throwable[1][0] = e;
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        if (this.setMin.getMax.isInside != null) {
                            setSupportBackgroundTintList.getMax();
                            new Throwable[1][0] = illegalStateException;
                            return;
                        }
                        throw illegalStateException;
                    }
                    setSupportBackgroundTintList.getMax();
                    Long.valueOf(((long) i) * 300);
                    new Throwable[1][0] = e;
                    try {
                        Thread.sleep(((long) this.length) * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    @VisibleForTesting
    private boolean getMax() {
        Context context = this.setMax;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        if (PendingIntent.getBroadcast(context, -1, intent, C.ENCODING_PCM_A_LAW) != null) {
            return false;
        }
        getMax(this.setMax);
        return true;
    }

    @VisibleForTesting
    private boolean length() {
        boolean max = Build.VERSION.SDK_INT >= 23 ? setCheckMarkDrawable.getMax(this.setMax, this.setMin) : false;
        WorkDatabase workDatabase = this.setMin.setMax;
        compatMeasureContentWidth max2 = workDatabase.getMax();
        getDropDownHorizontalOffset equals = workDatabase.equals();
        workDatabase.beginTransaction();
        try {
            List<getInternalPopup> min = max2.getMin();
            boolean z = !min.isEmpty();
            if (z) {
                for (getInternalPopup next : min) {
                    max2.setMin(WorkInfo.State.ENQUEUED, next.getMax);
                    max2.getMin(next.getMax, -1);
                }
            }
            equals.getMax();
            workDatabase.setTransactionSuccessful();
            if (z || max) {
                return true;
            }
            return false;
        } finally {
            workDatabase.endTransaction();
        }
    }

    @VisibleForTesting
    private boolean getMin() {
        return this.setMin.IsOverlapping.length();
    }

    @VisibleForTesting
    private boolean setMax() {
        if (this.setMin.setMin() == null) {
            return true;
        }
        setSupportBackgroundTintList.getMax();
        boolean max = setLineHeight.getMax(this.setMax, this.setMin.getMax);
        setSupportBackgroundTintList.getMax();
        Boolean.valueOf(max);
        return max;
    }

    static void getMax(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent max = setMax(context);
        long currentTimeMillis = System.currentTimeMillis() + getMax;
        if (alarmManager == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, currentTimeMillis, max);
        } else {
            alarmManager.set(0, currentTimeMillis, max);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        private static final String getMax = setSupportBackgroundTintList.length("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                setSupportBackgroundTintList.getMax();
                ForceStopRunnable.getMax(context);
            }
        }
    }

    private static PendingIntent setMax(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return PendingIntent.getBroadcast(context, -1, intent, 134217728);
    }
}
