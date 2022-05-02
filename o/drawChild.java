package o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class drawChild {
    private static final ConcurrentMap<String, setPivotY> length = new ConcurrentHashMap();

    @NonNull
    public static setPivotY getMin(@NonNull Context context) {
        String str;
        String packageName = context.getPackageName();
        setPivotY setpivoty = (setPivotY) length.get(packageName);
        if (setpivoty != null) {
            return setpivoty;
        }
        PackageInfo max = setMax(context);
        if (max != null) {
            str = String.valueOf(max.versionCode);
        } else {
            str = UUID.randomUUID().toString();
        }
        layoutChild layoutchild = new layoutChild(str);
        setPivotY putIfAbsent = length.putIfAbsent(packageName, layoutchild);
        return putIfAbsent == null ? layoutchild : putIfAbsent;
    }

    @Nullable
    private static PackageInfo setMax(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
