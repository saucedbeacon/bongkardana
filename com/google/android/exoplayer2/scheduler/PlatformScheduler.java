package com.google.android.exoplayer2.scheduler;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import androidx.annotation.RequiresPermission;
import com.google.android.exoplayer2.util.Util;

@TargetApi(21)
public final class PlatformScheduler implements Scheduler {
    private static final String KEY_REQUIREMENTS = "requirements";
    private static final String KEY_SERVICE_ACTION = "service_action";
    private static final String KEY_SERVICE_PACKAGE = "service_package";
    private static final String TAG = "PlatformScheduler";
    private final int jobId;
    private final JobScheduler jobScheduler;
    private final ComponentName jobServiceComponentName;

    /* access modifiers changed from: private */
    public static void logd(String str) {
    }

    @RequiresPermission("android.permission.RECEIVE_BOOT_COMPLETED")
    public PlatformScheduler(Context context, int i) {
        this.jobId = i;
        this.jobServiceComponentName = new ComponentName(context, PlatformSchedulerService.class);
        this.jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
    }

    public final boolean schedule(Requirements requirements, String str, String str2) {
        int schedule = this.jobScheduler.schedule(buildJobInfo(this.jobId, this.jobServiceComponentName, requirements, str2, str));
        StringBuilder sb = new StringBuilder("Scheduling job: ");
        sb.append(this.jobId);
        sb.append(" result: ");
        sb.append(schedule);
        logd(sb.toString());
        return schedule == 1;
    }

    public final boolean cancel() {
        StringBuilder sb = new StringBuilder("Canceling job: ");
        sb.append(this.jobId);
        logd(sb.toString());
        this.jobScheduler.cancel(this.jobId);
        return true;
    }

    private static JobInfo buildJobInfo(int i, ComponentName componentName, Requirements requirements, String str, String str2) {
        JobInfo.Builder builder = new JobInfo.Builder(i, componentName);
        int requiredNetworkType = requirements.getRequiredNetworkType();
        int i2 = 4;
        if (requiredNetworkType == 0) {
            i2 = 0;
        } else if (requiredNetworkType == 1) {
            i2 = 1;
        } else if (requiredNetworkType == 2) {
            i2 = 2;
        } else if (requiredNetworkType != 3) {
            if (requiredNetworkType != 4) {
                throw new UnsupportedOperationException();
            } else if (Util.SDK_INT < 26) {
                throw new UnsupportedOperationException();
            }
        } else if (Util.SDK_INT >= 24) {
            i2 = 3;
        } else {
            throw new UnsupportedOperationException();
        }
        builder.setRequiredNetworkType(i2);
        builder.setRequiresDeviceIdle(requirements.isIdleRequired());
        builder.setRequiresCharging(requirements.isChargingRequired());
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(KEY_SERVICE_ACTION, str);
        persistableBundle.putString(KEY_SERVICE_PACKAGE, str2);
        persistableBundle.putInt(KEY_REQUIREMENTS, requirements.getRequirementsData());
        builder.setExtras(persistableBundle);
        return builder.build();
    }

    public static final class PlatformSchedulerService extends JobService {
        public final boolean onStopJob(JobParameters jobParameters) {
            return false;
        }

        public final boolean onStartJob(JobParameters jobParameters) {
            PlatformScheduler.logd("PlatformSchedulerService started");
            PersistableBundle extras = jobParameters.getExtras();
            if (new Requirements(extras.getInt(PlatformScheduler.KEY_REQUIREMENTS)).checkRequirements(this)) {
                PlatformScheduler.logd("Requirements are met");
                String string = extras.getString(PlatformScheduler.KEY_SERVICE_ACTION);
                String string2 = extras.getString(PlatformScheduler.KEY_SERVICE_PACKAGE);
                Intent intent = new Intent(string).setPackage(string2);
                StringBuilder sb = new StringBuilder("Starting service action: ");
                sb.append(string);
                sb.append(" package: ");
                sb.append(string2);
                PlatformScheduler.logd(sb.toString());
                Util.startForegroundService(this, intent);
                return false;
            }
            PlatformScheduler.logd("Requirements are not met");
            jobFinished(jobParameters, true);
            return false;
        }
    }
}
