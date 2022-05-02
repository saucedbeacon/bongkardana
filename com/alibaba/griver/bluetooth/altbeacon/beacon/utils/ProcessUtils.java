package com.alibaba.griver.bluetooth.altbeacon.beacon.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import androidx.annotation.NonNull;
import id.dana.danah5.akulaku.AkuEventParamsKey;

public class ProcessUtils {
    Context mContext;

    public ProcessUtils(@NonNull Context context) {
        this.mContext = context;
    }

    public String getProcessName() {
        for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) this.mContext.getSystemService(AkuEventParamsKey.KEY_ACTIVITY)).getRunningAppProcesses()) {
            if (next.pid == getPid()) {
                return next.processName;
            }
        }
        return null;
    }

    public String getPackageName() {
        return this.mContext.getApplicationContext().getPackageName();
    }

    public int getPid() {
        return Process.myPid();
    }

    public boolean isMainProcess() {
        return getPackageName().equals(getProcessName());
    }
}
