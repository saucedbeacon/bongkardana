package o;

import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.annotation.NonNull;

public final class IntDef {
    public static long getMin(@NonNull PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return packageInfo.getLongVersionCode();
        }
        return (long) packageInfo.versionCode;
    }
}
