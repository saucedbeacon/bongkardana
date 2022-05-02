package com.alibaba.griver.base.common.utils;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.io.File;

public class DiskUtil {
    public static final String TAG = "DiskUtil";

    public static String getAppDir(Context context) {
        File filesDir = context.getFilesDir();
        if (FileUtils.exists(filesDir)) {
            return filesDir.getParent();
        }
        return null;
    }

    public static String getSubDir(Context context, String str) {
        String appDir = getAppDir(context);
        if (TextUtils.isEmpty(appDir)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(appDir);
        sb.append("/");
        sb.append(str);
        return sb.toString();
    }

    public static boolean mediaMounted() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Throwable th) {
            RVLogger.e(TAG, th);
            return false;
        }
    }
}
