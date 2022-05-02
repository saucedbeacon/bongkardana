package o;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.os.StatFs;
import androidx.core.content.FileProvider;
import com.alipay.mobile.verifyidentity.business.securitycommon.widget.ConvertUtils;
import java.io.File;

public final class setLeftSelectedIndex {
    private static final String setMin = setLeftSelectedIndex.class.getSimpleName();

    private setLeftSelectedIndex() {
    }

    public static long setMin() {
        return length(Environment.getExternalStorageDirectory().getPath());
    }

    public static long length() {
        return length(Environment.getDataDirectory().getPath());
    }

    public static boolean getMin(String str) {
        return setMax(str);
    }

    public static String setMin(String str) {
        return str.replaceAll("[^A-Za-z0-9]", "");
    }

    public static File setMin(Context context) {
        return new File(context.getFilesDir(), "/DANA/");
    }

    public static Uri getMax(Context context, File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".provider");
        return FileProvider.getUriForFile(context, sb.toString(), file);
    }

    public static File length(Context context) {
        if (!setMax()) {
            return context.getFilesDir();
        }
        File[] min = IntRange.getMin(context, Environment.DIRECTORY_PICTURES);
        if (min.length > 0) {
            return min[0];
        }
        return context.getFilesDir();
    }

    private static boolean setMax() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    private static long length(String str) {
        long blockSize;
        long availableBlocks;
        try {
            StatFs statFs = new StatFs(str);
            if (getRightSelectedOption.getMin()) {
                blockSize = statFs.getBlockSizeLong();
                availableBlocks = statFs.getAvailableBlocksLong();
            } else {
                blockSize = (long) statFs.getBlockSize();
                availableBlocks = (long) statFs.getAvailableBlocks();
            }
            return (blockSize * availableBlocks) / ConvertUtils.MB;
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    private static boolean setMax(String str) {
        File file = new File(str);
        if (file.isDirectory()) {
            return false;
        }
        file.mkdirs();
        return file.exists();
    }

    public static boolean getMax(String str) {
        return str != null && new File(str).exists();
    }

    public static File setMin(Context context, String str) {
        return new File(new File(context.getFilesDir(), "/DANA/"), str);
    }
}
