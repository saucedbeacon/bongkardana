package com.iap.ac.android.common.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.graphics.PointF;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.griver.base.common.utils.MD5Util;
import com.iap.ac.android.common.log.ACLog;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import o.upFrom;

public class MiscUtils {
    private static final String TAG = "MiscUtils";
    private static int length = 0;
    private static int setMax = 1;

    private MiscUtils() {
    }

    @NonNull
    public static String md5(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return md5(str.getBytes());
    }

    @NonNull
    public static String md5(@Nullable byte[] bArr) {
        if (!(bArr == null || bArr.length == 0)) {
            try {
                byte[] digest = MessageDigest.getInstance(MD5Util.ALGORIGTHM_MD5).digest(bArr);
                StringBuilder sb = new StringBuilder();
                for (byte b : digest) {
                    String hexString = Integer.toHexString(b & 255);
                    if (hexString.length() == 1) {
                        sb.append('0');
                    }
                    sb.append(hexString);
                }
                return sb.toString();
            } catch (NoSuchAlgorithmException e) {
                ACLog.e(TAG, "Calculate MD5 Error!", e);
            }
        }
        return "";
    }

    @NonNull
    public static String getAssetContent(@NonNull Context context, @NonNull String str) {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            AssetManager assets = context.getAssets();
            Object[] objArr = new Object[2];
            objArr[1] = str;
            objArr[0] = assets;
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader((InputStream) ((Class) upFrom.setMax(19 - (ViewConfiguration.getWindowTouchSlop() >> 8), ViewConfiguration.getEdgeSlop() >> 16, (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 56348))).getMethod("getMin", new Class[]{AssetManager.class, String.class}).invoke((Object) null, objArr)));
            int i = setMax + 13;
            length = i % 128;
            int i2 = i % 2;
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if ((readLine != null ? ')' : 16) != ')') {
                        break;
                    }
                    try {
                        int i3 = setMax + 95;
                        length = i3 % 128;
                        int i4 = i3 % 2;
                        sb.append(readLine);
                        sb.append("\r\n");
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (IOException e2) {
                    e = e2;
                    bufferedReader = bufferedReader2;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    close(bufferedReader);
                    throw th;
                }
            }
            close(bufferedReader2);
        } catch (IOException e3) {
            e = e3;
            try {
                ACLog.e(TAG, "getAssetContent Error!", e);
                close(bufferedReader);
                return sb.toString();
            } catch (Throwable th2) {
                th = th2;
                close(bufferedReader);
                throw th;
            }
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th3;
        }
        return sb.toString();
    }

    public static void close(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                ACLog.w(TAG, "Take it easy, just cannot close stream.", e);
            }
        }
    }

    @Nullable
    public static String getVersionName(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("getVersionName error! message: ");
            sb.append(th.getMessage());
            ACLog.e(TAG, sb.toString());
            return null;
        }
    }

    public static int getVersionCode(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            StringBuilder sb = new StringBuilder("getVersionCode error! message: ");
            sb.append(e.getMessage());
            ACLog.e(TAG, sb.toString());
            return 0;
        }
    }

    public static boolean isDebuggable(@NonNull Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || (applicationInfo.flags & 2) == 0) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            StringBuilder sb = new StringBuilder("isDebuggable error: ");
            sb.append(e.getMessage());
            ACLog.e(TAG, sb.toString());
            return false;
        }
    }

    public static boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean isMainProcess(@NonNull Context context) {
        try {
            return context.getPackageName().equals(getCurrentProcessName(context));
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("isMainProcess error: ");
            sb.append(th.toString());
            ACLog.e(TAG, sb.toString());
            return false;
        }
    }

    @Nullable
    public static String getCurrentProcessName(@NonNull Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(AkuEventParamsKey.KEY_ACTIVITY);
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.pid == myPid) {
                return next.processName;
            }
        }
        return null;
    }

    public static boolean isClassValid(@NonNull String str) {
        try {
            return Class.forName(str) != null;
        } catch (ClassNotFoundException unused) {
            ACLog.d(TAG, String.format("Take it easy, class %s not found!", new Object[]{str}));
            return false;
        }
    }

    @Nullable
    public static String getApkSignatureMd5(@NonNull Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            if (signatureArr != null) {
                if (signatureArr.length != 0) {
                    return md5(signatureArr[0].toByteArray());
                }
            }
            return null;
        } catch (Exception e) {
            ACLog.e(TAG, "getApkSignatureMd5 error!", e);
            return null;
        }
    }
}
