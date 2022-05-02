package com.alibaba.griver.base.nebula;

import android.util.Log;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.account.GriverAccount;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alipay.mobile.verifyidentity.business.securitycommon.widget.ConvertUtils;
import id.dana.data.constant.BranchLinkConstant;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CommonUtil {
    public static final String TAG = "CommonUtil";

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<SimpleDateFormat> f10229a = new ThreadLocal<SimpleDateFormat>() {
        /* access modifiers changed from: protected */
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
        }
    };

    public static boolean isForeground() {
        return true;
    }

    public static void dumpDir(File file) {
        File[] listFiles;
        if (file == null) {
            RVLogger.d(TAG, "cannot dump null directory!");
            return;
        }
        dumpFile(file);
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    dumpDir(file2);
                } else {
                    dumpFile(file2);
                }
            }
        }
    }

    public static void dumpFile(File file) {
        if (file == null || !file.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append(file);
            sb.append(" not exist!");
            RVLogger.d(TAG, sb.toString());
            return;
        }
        String str = "-";
        String str2 = file.canRead() ? BranchLinkConstant.PayloadKey.REFERRAL : str;
        String str3 = file.canWrite() ? "w" : str;
        if (file.canExecute()) {
            str = "x";
        }
        String str4 = file.isDirectory() ? "d" : "f";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str);
        sb2.append(str4);
        String obj = sb2.toString();
        SimpleDateFormat simpleDateFormat = f10229a.get();
        String format = simpleDateFormat != null ? simpleDateFormat.format(new Date(file.lastModified())) : "";
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj);
        sb3.append(" ");
        sb3.append(file);
        sb3.append(" ");
        sb3.append(file.length() / ConvertUtils.KB);
        sb3.append("kb ");
        sb3.append(format);
        RVLogger.d(TAG, sb3.toString());
    }

    public static String stringify(Throwable th) {
        if (th == null) {
            return null;
        }
        if (a()) {
            return Log.getStackTraceString(th);
        }
        return th.toString();
    }

    private static boolean a() {
        return !"no".equalsIgnoreCase(GriverConfig.getConfig("h5_upload_allStack", ""));
    }

    public static String getUserId() {
        return GriverAccount.getUserId();
    }

    public static void logFolderTree(File file, String str) {
        if (file != null) {
            try {
                if (b()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    StringBuilder sb2 = new StringBuilder(" ");
                    sb2.append(file.getAbsolutePath());
                    sb.append(sb2.toString());
                    sb.append("\n");
                    if (file.isDirectory()) {
                        a(file, sb, 1);
                    } else {
                        sb.append(file.getName());
                        sb.append(" ");
                        sb.append("file");
                    }
                    RVLogger.d(TAG, sb.toString());
                }
            } catch (Exception e) {
                RVLogger.e(TAG, "logFolderTree exception : ", e);
            }
        }
    }

    private static void a(File file, StringBuilder sb, int i) {
        try {
            File[] listFiles = file.listFiles();
            if (listFiles.length == 0) {
                for (int i2 = 1; i2 <= i; i2++) {
                    sb.append(" ");
                }
                sb.append(file.getName());
                sb.append(" is empty");
                return;
            }
            for (int i3 = 0; i3 < listFiles.length; i3++) {
                if (listFiles[i3].isDirectory()) {
                    StringBuilder sb2 = new StringBuilder();
                    a(listFiles[i3], sb2, i + 1);
                    for (int i4 = 1; i4 <= i; i4++) {
                        sb.append(" ");
                    }
                    sb.append("/");
                    sb.append(listFiles[i3].getName());
                    sb.append(" ");
                    sb.append("dir");
                    sb.append("\n");
                    sb.append(sb2);
                } else if (listFiles[i3].isFile()) {
                    for (int i5 = 1; i5 <= i; i5++) {
                        sb.append(" ");
                    }
                    sb.append(listFiles[i3].getName());
                    sb.append(" ");
                    sb.append("file");
                    sb.append("\n");
                } else {
                    for (int i6 = 1; i6 <= i; i6++) {
                        sb.append("  ");
                    }
                    sb.append(listFiles[i3].getName());
                    sb.append(" ");
                    sb.append("ghost");
                    sb.append("\n");
                }
            }
        } catch (Exception e) {
            RVLogger.e(TAG, "appendFolderInfo error", e);
        }
    }

    private static boolean b() {
        return !"no".equalsIgnoreCase(GriverConfig.getConfigWithProcessCache("h5_enableLogFolderTree", ""));
    }
}
