package com.google.firebase.perf.session.gauges;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Utils;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class GaugeMetadataManager {
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final ActivityManager activityManager;
    private final Context appContext;
    private final String currentProcessName;
    private final ActivityManager.MemoryInfo memoryInfo;
    private final Runtime runtime;

    GaugeMetadataManager(Context context) {
        this(Runtime.getRuntime(), context);
    }

    @VisibleForTesting
    GaugeMetadataManager(Runtime runtime2, Context context) {
        this.runtime = runtime2;
        this.appContext = context;
        this.activityManager = (ActivityManager) context.getSystemService(AkuEventParamsKey.KEY_ACTIVITY);
        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
        this.memoryInfo = memoryInfo2;
        this.activityManager.getMemoryInfo(memoryInfo2);
        this.currentProcessName = getCurrentProcessName();
    }

    public String getProcessName() {
        return this.currentProcessName;
    }

    public int getMaxAppJavaHeapMemoryKb() {
        return Utils.saturatedIntCast(StorageUnit.BYTES.toKilobytes(this.runtime.maxMemory()));
    }

    public int getMaxEncouragedAppJavaHeapMemoryKb() {
        return Utils.saturatedIntCast(StorageUnit.MEGABYTES.toKilobytes((long) this.activityManager.getMemoryClass()));
    }

    public int getDeviceRamSizeKb() {
        if (Build.VERSION.SDK_INT >= 16) {
            return Utils.saturatedIntCast(StorageUnit.BYTES.toKilobytes(this.memoryInfo.totalMem));
        }
        return readTotalRAM("/proc/meminfo");
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public int readTotalRAM(String str) {
        BufferedReader bufferedReader;
        String readLine;
        try {
            bufferedReader = new BufferedReader(new FileReader(str));
            do {
                readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    return 0;
                }
            } while (!readLine.startsWith("MemTotal"));
            Matcher matcher = Pattern.compile("\\d+").matcher(readLine);
            int parseInt = matcher.find() ? Integer.parseInt(matcher.group()) : 0;
            bufferedReader.close();
            return parseInt;
        } catch (IOException e) {
            AndroidLogger androidLogger = logger;
            StringBuilder sb = new StringBuilder("Unable to read '");
            sb.append(str);
            sb.append("' file: ");
            sb.append(e.getMessage());
            androidLogger.warn(sb.toString());
        } catch (NumberFormatException e2) {
            AndroidLogger androidLogger2 = logger;
            StringBuilder sb2 = new StringBuilder("Unable to parse '");
            sb2.append(str);
            sb2.append("' file: ");
            sb2.append(e2.getMessage());
            androidLogger2.warn(sb2.toString());
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    private String getCurrentProcessName() {
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = this.activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.pid == myPid) {
                    return next.processName;
                }
            }
        }
        return this.appContext.getPackageName();
    }
}
