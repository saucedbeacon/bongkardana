package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
public final class cancelAll {
    private static final ThreadLocal<TypedValue> getMax = new ThreadLocal<>();
    private static final WeakHashMap<Context, SparseArray<setMax>> setMax = new WeakHashMap<>(0);
    private static final Object setMin = new Object();

    public static ColorStateList setMin(@NonNull Context context, @ColorRes int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList max = getMax(context, i);
        if (max != null) {
            return max;
        }
        ColorStateList length = length(context, i);
        if (length == null) {
            return IntRange.getMin(context, i);
        }
        getMax(context, i, length);
        return length;
    }

    @Nullable
    public static Drawable getMin(@NonNull Context context, @DrawableRes int i) {
        return getRepeatMode.setMin().getMax(context, i);
    }

    @Nullable
    private static ColorStateList length(Context context, int i) {
        if (setMax(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return LayoutRes.setMax(resources, resources.getXml(i), context.getTheme());
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        return null;
     */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList getMax(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.ColorRes int r5) {
        /*
            java.lang.Object r0 = setMin
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<o.cancelAll$setMax>> r1 = setMax     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0035 }
            o.cancelAll$setMax r2 = (o.cancelAll.setMax) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.setMax     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            android.content.res.ColorStateList r4 = r2.getMin     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r4
        L_0x002f:
            r1.remove(r5)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cancelAll.getMax(android.content.Context, int):android.content.res.ColorStateList");
    }

    private static void getMax(@NonNull Context context, @ColorRes int i, @NonNull ColorStateList colorStateList) {
        synchronized (setMin) {
            SparseArray sparseArray = setMax.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                setMax.put(context, sparseArray);
            }
            sparseArray.append(i, new setMax(colorStateList, context.getResources().getConfiguration()));
        }
    }

    private static boolean setMax(@NonNull Context context, @ColorRes int i) {
        Resources resources = context.getResources();
        TypedValue length = length();
        resources.getValue(i, length, true);
        if (length.type < 28 || length.type > 31) {
            return false;
        }
        return true;
    }

    @NonNull
    private static TypedValue length() {
        TypedValue typedValue = getMax.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        getMax.set(typedValue2);
        return typedValue2;
    }

    static class setMax {
        final ColorStateList getMin;
        final Configuration setMax;

        setMax(@NonNull ColorStateList colorStateList, @NonNull Configuration configuration) {
            this.getMin = colorStateList;
            this.setMax = configuration;
        }
    }
}
