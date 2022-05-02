package o;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.util.HashMap;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class setSupportCompoundDrawablesTintMode {
    private static final String[] getMax = {"-journal", "-shm", "-wal"};
    private static final String setMin = setSupportBackgroundTintList.length("WrkDbPathHelper");

    @NonNull
    public static String getMax() {
        return "androidx.work.workdb";
    }

    public static void length(@NonNull Context context) {
        File file;
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        if (Build.VERSION.SDK_INT >= 23 && databasePath.exists()) {
            setSupportBackgroundTintList.getMax();
            HashMap hashMap = new HashMap();
            if (Build.VERSION.SDK_INT >= 23) {
                File databasePath2 = context.getDatabasePath("androidx.work.workdb");
                if (Build.VERSION.SDK_INT < 23) {
                    file = context.getDatabasePath("androidx.work.workdb");
                } else {
                    file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
                }
                hashMap.put(databasePath2, file);
                for (String str : getMax) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(databasePath2.getPath());
                    sb.append(str);
                    File file2 = new File(sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(file.getPath());
                    sb2.append(str);
                    hashMap.put(file2, new File(sb2.toString()));
                }
            }
            for (File file3 : hashMap.keySet()) {
                File file4 = (File) hashMap.get(file3);
                if (file3.exists() && file4 != null) {
                    if (file4.exists()) {
                        setSupportBackgroundTintList.getMax();
                    }
                    file3.renameTo(file4);
                    setSupportBackgroundTintList.getMax();
                }
            }
        }
    }
}
