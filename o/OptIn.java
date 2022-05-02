package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FontRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

public final class OptIn {
    private static final WeakHashMap<getMax, SparseArray<length>> getMax = new WeakHashMap<>(0);
    private static final Object getMin = new Object();
    private static final ThreadLocal<TypedValue> length = new ThreadLocal<>();

    @Nullable
    public static Drawable getMax(@NonNull Resources resources, @DrawableRes int i, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    @ColorInt
    public static int setMin(@NonNull Resources resources, @ColorRes int i, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColor(i, theme);
        }
        return resources.getColor(i);
    }

    @Nullable
    public static ColorStateList setMax(@NonNull Resources resources, @ColorRes int i, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColorStateList(i, theme);
        }
        getMax getmax = new getMax(resources, theme);
        ColorStateList min = getMin(getmax, i);
        if (min != null) {
            return min;
        }
        ColorStateList min2 = getMin(resources, i, theme);
        if (min2 == null) {
            return resources.getColorStateList(i);
        }
        getMax(getmax, i, min2);
        return min2;
    }

    @Nullable
    private static ColorStateList getMin(Resources resources, int i, @Nullable Resources.Theme theme) {
        if (getMin(resources, i)) {
            return null;
        }
        try {
            return LayoutRes.setMax(resources, resources.getXml(i), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        return null;
     */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList getMin(@androidx.annotation.NonNull o.OptIn.getMax r4, @androidx.annotation.ColorRes int r5) {
        /*
            java.lang.Object r0 = getMin
            monitor-enter(r0)
            java.util.WeakHashMap<o.OptIn$getMax, android.util.SparseArray<o.OptIn$length>> r1 = getMax     // Catch:{ all -> 0x0033 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0033 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x0030
            int r2 = r1.size()     // Catch:{ all -> 0x0033 }
            if (r2 <= 0) goto L_0x0030
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0033 }
            o.OptIn$length r2 = (o.OptIn.length) r2     // Catch:{ all -> 0x0033 }
            if (r2 == 0) goto L_0x0030
            android.content.res.Configuration r3 = r2.setMin     // Catch:{ all -> 0x0033 }
            android.content.res.Resources r4 = r4.getMax     // Catch:{ all -> 0x0033 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0033 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x002d
            android.content.res.ColorStateList r4 = r2.setMax     // Catch:{ all -> 0x0033 }
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x002d:
            r1.remove(r5)     // Catch:{ all -> 0x0033 }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            r4 = 0
            return r4
        L_0x0033:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.OptIn.getMin(o.OptIn$getMax, int):android.content.res.ColorStateList");
    }

    private static void getMax(@NonNull getMax getmax, @ColorRes int i, @NonNull ColorStateList colorStateList) {
        synchronized (getMin) {
            SparseArray sparseArray = getMax.get(getmax);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                getMax.put(getmax, sparseArray);
            }
            sparseArray.append(i, new length(colorStateList, getmax.getMax.getConfiguration()));
        }
    }

    private static boolean getMin(@NonNull Resources resources, @ColorRes int i) {
        TypedValue max = setMax();
        resources.getValue(i, max, true);
        if (max.type < 28 || max.type > 31) {
            return false;
        }
        return true;
    }

    @NonNull
    private static TypedValue setMax() {
        TypedValue typedValue = length.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        length.set(typedValue2);
        return typedValue2;
    }

    static final class getMax {
        final Resources getMax;
        @Nullable
        final Resources.Theme length;

        getMax(@NonNull Resources resources, @Nullable Resources.Theme theme) {
            this.getMax = resources;
            this.length = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                getMax getmax = (getMax) obj;
                return this.getMax.equals(getmax.getMax) && setNegativeButtonIcon.getMax(this.length, getmax.length);
            }
        }

        public final int hashCode() {
            return setNegativeButtonIcon.setMin(this.getMax, this.length);
        }
    }

    static class length {
        final ColorStateList setMax;
        final Configuration setMin;

        length(@NonNull ColorStateList colorStateList, @NonNull Configuration configuration) {
            this.setMax = colorStateList;
            this.setMin = configuration;
        }
    }

    @Nullable
    public static Typeface length(@NonNull Context context, @FontRes int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return setMin(context, i, new TypedValue(), 0, (setMax) null, (Handler) null, false, false);
    }

    @Nullable
    public static Typeface setMin(@NonNull Context context, @FontRes int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return setMin(context, i, new TypedValue(), 0, (setMax) null, (Handler) null, false, true);
    }

    public static abstract class setMax {
        public abstract void onFontRetrievalFailed(int i);

        public abstract void onFontRetrieved(@NonNull Typeface typeface);

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final void callbackSuccessAsync(final Typeface typeface, @Nullable Handler handler) {
            getHandler(handler).post(new Runnable() {
                public void run() {
                    setMax.this.onFontRetrieved(typeface);
                }
            });
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final void callbackFailAsync(final int i, @Nullable Handler handler) {
            getHandler(handler).post(new Runnable() {
                public void run() {
                    setMax.this.onFontRetrievalFailed(i);
                }
            });
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static Handler getHandler(@Nullable Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }
    }

    public static void setMax(@NonNull Context context, @FontRes int i, @NonNull setMax setmax, @Nullable Handler handler) throws Resources.NotFoundException {
        if (setmax == null) {
            throw null;
        } else if (context.isRestricted()) {
            setmax.callbackFailAsync(-4, handler);
        } else {
            setMin(context, i, new TypedValue(), 0, setmax, handler, false, false);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Typeface length(@NonNull Context context, @FontRes int i, TypedValue typedValue, int i2, @Nullable setMax setmax) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return setMin(context, i, typedValue, i2, setmax, (Handler) null, true, false);
    }

    private static Typeface setMin(@NonNull Context context, int i, TypedValue typedValue, int i2, @Nullable setMax setmax, @Nullable Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        int i3 = i;
        resources.getValue(i, typedValue, true);
        Typeface min = setMin(context, resources, typedValue, i, i2, setmax, handler, z, z2);
        if (min != null || setmax != null || z2) {
            return min;
        }
        StringBuilder sb = new StringBuilder("Font resource ID #0x");
        sb.append(Integer.toHexString(i));
        sb.append(" could not be retrieved.");
        throw new Resources.NotFoundException(sb.toString());
    }

    private static Typeface setMin(@NonNull Context context, Resources resources, TypedValue typedValue, int i, int i2, @Nullable setMax setmax, @Nullable Handler handler, boolean z, boolean z2) {
        Resources resources2 = resources;
        TypedValue typedValue2 = typedValue;
        int i3 = i;
        int i4 = i2;
        setMax setmax2 = setmax;
        Handler handler2 = handler;
        if (typedValue2.string != null) {
            String charSequence = typedValue2.string.toString();
            if (!charSequence.startsWith("res/")) {
                if (setmax2 != null) {
                    setmax2.callbackFailAsync(-3, handler2);
                }
                return null;
            }
            Typeface min = RequiresApi.getMin(resources, i, i4);
            if (min != null) {
                if (setmax2 != null) {
                    setmax2.callbackSuccessAsync(min, handler2);
                }
                return min;
            } else if (z2) {
                return null;
            } else {
                try {
                    if (charSequence.toLowerCase().endsWith(".xml")) {
                        FontResourcesParserCompat.getMin min2 = FontResourcesParserCompat.setMin(resources.getXml(i), resources);
                        if (min2 != null) {
                            return RequiresApi.length(context, min2, resources, i, i2, setmax, handler, z);
                        }
                        if (setmax2 != null) {
                            setmax2.callbackFailAsync(-3, handler2);
                        }
                        return null;
                    }
                    Context context2 = context;
                    Typeface min3 = RequiresApi.setMin(context, resources, i, charSequence, i4);
                    if (setmax2 != null) {
                        if (min3 != null) {
                            setmax2.callbackSuccessAsync(min3, handler2);
                        } else {
                            setmax2.callbackFailAsync(-3, handler2);
                        }
                    }
                    return min3;
                } catch (IOException | XmlPullParserException unused) {
                    if (setmax2 != null) {
                        setmax2.callbackFailAsync(-3, handler2);
                    }
                    return null;
                }
            }
        } else {
            StringBuilder sb = new StringBuilder("Resource \"");
            sb.append(resources.getResourceName(i));
            sb.append("\" (");
            sb.append(Integer.toHexString(i));
            sb.append(") is not a Font: ");
            sb.append(typedValue);
            throw new Resources.NotFoundException(sb.toString());
        }
    }

    public static final class getMin {
        public static void length(@NonNull Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                C0005getMin.length(theme);
            } else if (Build.VERSION.SDK_INT >= 23) {
                setMax.setMin(theme);
            }
        }

        @RequiresApi(29)
        /* renamed from: o.OptIn$getMin$getMin  reason: collision with other inner class name */
        static class C0005getMin {
            static void length(@NonNull Resources.Theme theme) {
                theme.rebase();
            }
        }

        @RequiresApi(23)
        static class setMax {
            private static final Object getMax = new Object();
            private static boolean getMin;
            private static Method length;

            /* JADX WARNING: Can't wrap try/catch for region: R(5:6|7|8|9|10) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0018 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            static void setMin(@androidx.annotation.NonNull android.content.res.Resources.Theme r6) {
                /*
                    java.lang.Object r0 = getMax
                    monitor-enter(r0)
                    boolean r1 = getMin     // Catch:{ all -> 0x002b }
                    r2 = 0
                    if (r1 != 0) goto L_0x001a
                    r1 = 1
                    java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                    java.lang.String r4 = "rebase"
                    java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0018 }
                    java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x0018 }
                    length = r3     // Catch:{ NoSuchMethodException -> 0x0018 }
                    r3.setAccessible(r1)     // Catch:{ NoSuchMethodException -> 0x0018 }
                L_0x0018:
                    getMin = r1     // Catch:{ all -> 0x002b }
                L_0x001a:
                    java.lang.reflect.Method r1 = length     // Catch:{ all -> 0x002b }
                    if (r1 == 0) goto L_0x0029
                    java.lang.reflect.Method r1 = length     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0026 }
                    java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0026 }
                    r1.invoke(r6, r2)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0026 }
                    goto L_0x0029
                L_0x0026:
                    r6 = 0
                    length = r6     // Catch:{ all -> 0x002b }
                L_0x0029:
                    monitor-exit(r0)     // Catch:{ all -> 0x002b }
                    return
                L_0x002b:
                    r6 = move-exception
                    monitor-exit(r0)
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: o.OptIn.getMin.setMax.setMin(android.content.res.Resources$Theme):void");
            }
        }
    }
}
