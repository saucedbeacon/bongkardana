package com.iap.ac.android.p;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.biz.common.configcenter.ConfigCenter;
import com.iap.ac.android.biz.common.utils.Utils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.utils.MiscUtils;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f11061a = new Object();

    public static boolean a(@NonNull Context context, @NonNull String str, @Nullable String str2, @NonNull String str3) {
        synchronized (f11061a) {
            File a2 = a(context, a(str, str2));
            if (a2 == null) {
                return false;
            }
            boolean a3 = a(a2, str3);
            return a3;
        }
    }

    public static File b(Context context) {
        if (context == null) {
            return null;
        }
        File cacheDir = context.getCacheDir();
        if (!cacheDir.canWrite()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cacheDir.getAbsolutePath());
        sb.append(File.separator);
        sb.append("ac_multi_language");
        File file = new File(sb.toString());
        boolean z = true;
        if (!file.exists()) {
            z = file.mkdir();
        }
        if (!z) {
            return null;
        }
        return file;
    }

    public static void a(Context context) {
        synchronized (f11061a) {
            File b = b(context);
            if (b != null) {
                for (File file : b.listFiles()) {
                    if (file.exists() && file.lastModified() + ConfigCenter.INSTANCE.getMultiLanguageCacheExpirationTime() < System.currentTimeMillis()) {
                        boolean delete = file.delete();
                        StringBuilder sb = new StringBuilder("HttpCache#clearInvalidCache delete");
                        sb.append(file.getName());
                        sb.append(",result=");
                        sb.append(delete);
                        ACLog.d("HttpCache", sb.toString());
                    }
                }
            }
        }
    }

    public static String a(@NonNull String str, @Nullable String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
        }
        return MiscUtils.md5(sb.toString());
    }

    public static File a(Context context, String str) {
        File b = b(context);
        if (b == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(b.getAbsolutePath());
        sb.append(File.separator);
        sb.append(str);
        File file = new File(sb.toString());
        boolean z = true;
        if (!file.exists()) {
            try {
                z = file.createNewFile();
            } catch (Throwable th) {
                ACLog.e("HttpCache", String.format("Create %s error, the error=%s", new Object[]{str, Utils.e(th)}));
            }
        }
        if (!z) {
            return null;
        }
        return file;
    }

    public static boolean a(File file, String str) {
        Throwable th;
        BufferedWriter bufferedWriter;
        if (file == null || !file.exists()) {
            return false;
        }
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            try {
                bufferedWriter.write(str);
                a((Closeable) bufferedWriter);
                return true;
            } catch (Throwable th2) {
                th = th2;
                try {
                    ACLog.e("HttpCache", String.format("Write str error, error=%s", new Object[]{Utils.e(th)}));
                    return false;
                } finally {
                    a((Closeable) bufferedWriter);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter = null;
            ACLog.e("HttpCache", String.format("Write str error, error=%s", new Object[]{Utils.e(th)}));
            return false;
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                ACLog.e("HttpCache", Utils.e(th));
            }
        }
    }
}
