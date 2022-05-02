package com.alibaba.griver.bluetooth.altbeacon.beacon.powersave;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconManager;
import com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager;

@TargetApi(18)
public class BackgroundPowerSaver implements Application.ActivityLifecycleCallbacks {
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    private final BeaconManager f10254a;
    private int b;

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    @Deprecated
    public BackgroundPowerSaver(Context context, boolean z) {
        this(context);
    }

    public BackgroundPowerSaver(Context context) {
        this.b = 0;
        if (Build.VERSION.SDK_INT < 18) {
            LogManager.w("BackgroundPowerSaver", "BackgroundPowerSaver requires API 18 or higher.", new Object[0]);
        }
        this.f10254a = BeaconManager.getInstanceForApplication(context);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    public void onActivityResumed(Activity activity) {
        int i = this.b + 1;
        this.b = i;
        if (i <= 0) {
            LogManager.d("BackgroundPowerSaver", "reset active activity count on resume.  It was %s", Integer.valueOf(i));
            this.b = 1;
        }
        this.f10254a.setBackgroundMode(false);
        LogManager.d("BackgroundPowerSaver", "activity resumed: %s active activities: %s", activity, Integer.valueOf(this.b));
    }

    public void onActivityPaused(Activity activity) {
        int i = this.b - 1;
        this.b = i;
        LogManager.d("BackgroundPowerSaver", "activity paused: %s active activities: %s", activity, Integer.valueOf(i));
        if (this.b <= 0) {
            LogManager.d("BackgroundPowerSaver", "setting background mode", new Object[0]);
            this.f10254a.setBackgroundMode(true);
        }
    }
}
