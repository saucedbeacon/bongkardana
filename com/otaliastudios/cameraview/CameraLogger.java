package com.otaliastudios.cameraview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class CameraLogger {
    @VisibleForTesting
    static getMax getMax;
    @VisibleForTesting
    static String getMin;
    @VisibleForTesting
    static String length;
    private static List<getMax> setMax = new ArrayList();
    private static int setMin = 3;
    @NonNull
    private String IsOverlapping;

    @Retention(RetentionPolicy.SOURCE)
    public @interface LogLevel {
    }

    public interface getMax {
    }

    static {
        AnonymousClass5 r0 = new getMax() {
        };
        getMax = r0;
        setMax.add(r0);
    }

    public static CameraLogger setMin(@NonNull String str) {
        return new CameraLogger(str);
    }

    private CameraLogger(@NonNull String str) {
        this.IsOverlapping = str;
    }

    private static boolean setMin(int i) {
        return setMin <= i && setMax.size() > 0;
    }

    @Nullable
    public final String length(@NonNull Object... objArr) {
        return getMax(0, objArr);
    }

    @Nullable
    public final String setMax(@NonNull Object... objArr) {
        return getMax(1, objArr);
    }

    @Nullable
    public final String getMin(@NonNull Object... objArr) {
        return getMax(2, objArr);
    }

    @Nullable
    public final String setMin(@NonNull Object... objArr) {
        return getMax(3, objArr);
    }

    @Nullable
    public final String getMax(int i, @NonNull Object... objArr) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1241054478, oncanceled);
            onCancelLoad.getMin(1241054478, oncanceled);
        }
        if (!setMin(i)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Object valueOf : objArr) {
            sb.append(String.valueOf(valueOf));
            sb.append(" ");
        }
        String trim = sb.toString().trim();
        Iterator<getMax> it = setMax.iterator();
        while (it.hasNext()) {
            it.next();
        }
        getMin = trim;
        length = this.IsOverlapping;
        return trim;
    }
}
