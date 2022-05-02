package me.zhanghai.android.materialprogressbar.internal;

import android.animation.ValueAnimator;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ValueAnimatorCompat {
    @Nullable
    private static Method sValueAnimatorGetDurationScaleMethod;
    private static boolean sValueAnimatorGetDurationScaleMethodInitialized;
    @NonNull
    private static final Object sValueAnimatorGetDurationScaleMethodLock = new Object();
    @Nullable
    private static Field sValueAnimatorSDurationScaleField;
    private static boolean sValueAnimatorSDurationScaleFieldInitialized;
    @NonNull
    private static final Object sValueAnimatorSDurationScaleFieldLock = new Object();

    private ValueAnimatorCompat() {
    }

    public static boolean areAnimatorsEnabled() {
        Field valueAnimatorSDurationScaleField;
        Method valueAnimatorGetDurationScaleMethod;
        if (Build.VERSION.SDK_INT >= 26) {
            return ValueAnimator.areAnimatorsEnabled();
        }
        if (Build.VERSION.SDK_INT >= 17 && (valueAnimatorGetDurationScaleMethod = getValueAnimatorGetDurationScaleMethod()) != null) {
            try {
                return ((Float) valueAnimatorGetDurationScaleMethod.invoke((Object) null, new Object[0])).floatValue() != 0.0f;
            } catch (Exception unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 16 && (valueAnimatorSDurationScaleField = getValueAnimatorSDurationScaleField()) != null) {
            try {
                return ((Float) valueAnimatorSDurationScaleField.get((Object) null)).floatValue() != 0.0f;
            } catch (Exception unused2) {
            }
        }
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0018 */
    @android.annotation.SuppressLint({"PrivateApi"})
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Method getValueAnimatorGetDurationScaleMethod() {
        /*
            java.lang.Object r0 = sValueAnimatorGetDurationScaleMethodLock
            monitor-enter(r0)
            boolean r1 = sValueAnimatorGetDurationScaleMethodInitialized     // Catch:{ all -> 0x001e }
            if (r1 != 0) goto L_0x001a
            r1 = 1
            java.lang.Class<android.animation.ValueAnimator> r2 = android.animation.ValueAnimator.class
            java.lang.String r3 = "getDurationScale"
            r4 = 0
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0018 }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch:{ Exception -> 0x0018 }
            sValueAnimatorGetDurationScaleMethod = r2     // Catch:{ Exception -> 0x0018 }
            r2.setAccessible(r1)     // Catch:{ Exception -> 0x0018 }
        L_0x0018:
            sValueAnimatorGetDurationScaleMethodInitialized = r1     // Catch:{ all -> 0x001e }
        L_0x001a:
            java.lang.reflect.Method r1 = sValueAnimatorGetDurationScaleMethod     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return r1
        L_0x001e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: me.zhanghai.android.materialprogressbar.internal.ValueAnimatorCompat.getValueAnimatorGetDurationScaleMethod():java.lang.reflect.Method");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0015 */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Field getValueAnimatorSDurationScaleField() {
        /*
            java.lang.Object r0 = sValueAnimatorSDurationScaleFieldLock
            monitor-enter(r0)
            boolean r1 = sValueAnimatorSDurationScaleFieldInitialized     // Catch:{ all -> 0x001b }
            if (r1 != 0) goto L_0x0017
            r1 = 1
            java.lang.Class<android.animation.ValueAnimator> r2 = android.animation.ValueAnimator.class
            java.lang.String r3 = "sDurationScale"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0015 }
            sValueAnimatorSDurationScaleField = r2     // Catch:{ Exception -> 0x0015 }
            r2.setAccessible(r1)     // Catch:{ Exception -> 0x0015 }
        L_0x0015:
            sValueAnimatorSDurationScaleFieldInitialized = r1     // Catch:{ all -> 0x001b }
        L_0x0017:
            java.lang.reflect.Field r1 = sValueAnimatorSDurationScaleField     // Catch:{ all -> 0x001b }
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return r1
        L_0x001b:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: me.zhanghai.android.materialprogressbar.internal.ValueAnimatorCompat.getValueAnimatorSDurationScaleField():java.lang.reflect.Field");
    }
}
