package com.google.android.gms.common.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import androidx.annotation.Nullable;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.ap.zoloz.hummer.h5.ZolozEkycH5Handler;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.wrappers.Wrappers;
import id.dana.lib.gcontainer.app.bridge.contact.ContactEventType;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@KeepForSdk
public class WorkSourceUtil {
    private static final int zza = Process.myUid();
    private static final Method zzb = zza();
    private static final Method zzc = zzb();
    private static final Method zzd = zzc();
    private static final Method zze = zzd();
    private static final Method zzf = zze();
    private static final Method zzg = zzf();
    private static final Method zzh = zzg();

    private WorkSourceUtil() {
    }

    private static WorkSource zza(int i, String str) {
        WorkSource workSource = new WorkSource();
        zza(workSource, i, str);
        return workSource;
    }

    @KeepForSdk
    @Nullable
    public static WorkSource fromPackage(Context context, @Nullable String str) {
        if (!(context == null || context.getPackageManager() == null || str == null)) {
            try {
                ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
                if (applicationInfo == null) {
                    return null;
                }
                return zza(applicationInfo.uid, str);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return null;
    }

    private static void zza(WorkSource workSource, int i, @Nullable String str) {
        if (zzc != null) {
            if (str == null) {
                str = "";
            }
            try {
                zzc.invoke(workSource, new Object[]{Integer.valueOf(i), str});
            } catch (Exception unused) {
            }
        } else {
            Method method = zzb;
            if (method != null) {
                try {
                    method.invoke(workSource, new Object[]{Integer.valueOf(i)});
                } catch (Exception unused2) {
                }
            }
        }
    }

    @KeepForSdk
    public static WorkSource fromPackageAndModuleExperimentalPi(Context context, String str, String str2) {
        WorkSource workSource = null;
        if (!(context == null || context.getPackageManager() == null || str2 == null || str == null)) {
            int zza2 = zza(context, str);
            if (zza2 < 0) {
                return null;
            }
            workSource = new WorkSource();
            Method method = zzg;
            if (method == null || zzh == null) {
                zza(workSource, zza2, str);
            } else {
                try {
                    Object invoke = method.invoke(workSource, new Object[0]);
                    if (zza2 != zza) {
                        zzh.invoke(invoke, new Object[]{Integer.valueOf(zza2), str});
                    }
                    zzh.invoke(invoke, new Object[]{Integer.valueOf(zza), str2});
                } catch (Exception unused) {
                }
            }
        }
        return workSource;
    }

    private static int zza(WorkSource workSource) {
        Method method = zzd;
        if (method != null) {
            try {
                return ((Integer) method.invoke(workSource, new Object[0])).intValue();
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    @Nullable
    private static String zza(WorkSource workSource, int i) {
        Method method = zzf;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, new Object[]{Integer.valueOf(i)});
        } catch (Exception unused) {
            return null;
        }
    }

    @KeepForSdk
    public static List<String> getNames(@Nullable WorkSource workSource) {
        int zza2 = workSource == null ? 0 : zza(workSource);
        if (zza2 == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < zza2; i++) {
            String zza3 = zza(workSource, i);
            if (!Strings.isEmptyOrWhitespace(zza3)) {
                arrayList.add(zza3);
            }
        }
        return arrayList;
    }

    @KeepForSdk
    public static boolean hasWorkSourcePermission(Context context) {
        if (context == null || context.getPackageManager() == null || Wrappers.packageManager(context).checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) {
            return false;
        }
        return true;
    }

    private static int zza(Context context, String str) {
        try {
            ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
            if (applicationInfo == null) {
                return -1;
            }
            return applicationInfo.uid;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    private static Method zza() {
        try {
            return WorkSource.class.getMethod(ZolozEkycH5Handler.HUMMER_FOUNDATION_ADD, new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            return null;
        }
    }

    private static Method zzb() {
        if (PlatformVersion.isAtLeastJellyBeanMR2()) {
            try {
                return WorkSource.class.getMethod(ZolozEkycH5Handler.HUMMER_FOUNDATION_ADD, new Class[]{Integer.TYPE, String.class});
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static Method zzc() {
        try {
            return WorkSource.class.getMethod(GriverMonitorConstants.KEY_SIZE, new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Method zzd() {
        try {
            return WorkSource.class.getMethod(ContactEventType.CONTACT_GET, new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            return null;
        }
    }

    private static Method zze() {
        if (PlatformVersion.isAtLeastJellyBeanMR2()) {
            try {
                return WorkSource.class.getMethod("getName", new Class[]{Integer.TYPE});
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static final Method zzf() {
        if (PlatformVersion.isAtLeastP()) {
            try {
                return WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static final Method zzg() {
        if (PlatformVersion.isAtLeastP()) {
            try {
                return Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[]{Integer.TYPE, String.class});
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
