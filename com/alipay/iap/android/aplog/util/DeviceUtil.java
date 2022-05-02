package com.alipay.iap.android.aplog.util;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.mobile.verifyidentity.business.securitycommon.widget.ConvertUtils;
import id.dana.danah5.akulaku.AkuEventParamsKey;

public class DeviceUtil {
    public static int getNumCoresOfCPU() {
        return DeviceHWInfo.getNumberOfCPUCores();
    }

    public static int getCPUMaxFreqMHz() {
        int cPUMaxFreqKHz = DeviceHWInfo.getCPUMaxFreqKHz();
        if (cPUMaxFreqKHz == -1 || cPUMaxFreqKHz <= 0) {
            return -1;
        }
        return cPUMaxFreqKHz / 1000;
    }

    public static long getTotalMem(Context context) {
        long totalMemory = DeviceHWInfo.getTotalMemory(context);
        if (totalMemory == -1 || totalMemory <= 0) {
            return -1;
        }
        return totalMemory / ConvertUtils.MB;
    }

    public static int getPidMemorySize(Context context) {
        int i = 0;
        try {
            Debug.MemoryInfo[] processMemoryInfo = ((ActivityManager) context.getSystemService(AkuEventParamsKey.KEY_ACTIVITY)).getProcessMemoryInfo(new int[]{Process.myPid()});
            processMemoryInfo[0].getTotalSharedDirty();
            i = processMemoryInfo[0].getTotalPss();
        } catch (Exception unused) {
        }
        return i / 1024;
    }

    public static String getDeviceInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("App Version = ");
        sb.append(LoggerFactory.getLogContext().getProductVersion());
        sb.append("\r\n");
        sb.append("Device Model = ");
        sb.append(Build.MODEL);
        sb.append("\r\n");
        sb.append("OS Version = ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("\r\n");
        sb.append("Language = ");
        sb.append(LoggerFactory.getLogContext().getLanguage());
        sb.append("\r\n");
        sb.append("CPU CoreNum = ");
        sb.append(getNumCoresOfCPU());
        sb.append("\r\n");
        sb.append("CPU MaxFreq = ");
        sb.append(getCPUMaxFreqMHz());
        sb.append("\r\n");
        sb.append("TotalMem = ");
        sb.append(getTotalMem(LoggerFactory.getLogContext().getApplicationContext()));
        return sb.toString();
    }
}
