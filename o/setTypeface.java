package o;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.WeakHashMap;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class setTypeface {
    private static final WeakHashMap<PowerManager.WakeLock, String> setMax = new WeakHashMap<>();
    private static final String setMin = setSupportBackgroundTintList.length("WakeLocks");

    public static PowerManager.WakeLock setMax(@NonNull Context context, @NonNull String str) {
        String concat = "WorkManager: ".concat(String.valueOf(str));
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, concat);
        synchronized (setMax) {
            setMax.put(newWakeLock, concat);
        }
        return newWakeLock;
    }

    public static void getMax() {
        HashMap hashMap = new HashMap();
        synchronized (setMax) {
            hashMap.putAll(setMax);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                hashMap.get(wakeLock);
                setSupportBackgroundTintList.getMax();
            }
        }
    }
}
