package o;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import id.dana.data.constant.BranchLinkConstant;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

@RequiresApi(29)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class RequiresOptIn extends enforcement {
    /* access modifiers changed from: protected */
    public FontsContractCompat.setMin getMax(FontsContractCompat.setMin[] setminArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* access modifiers changed from: protected */
    public Typeface length(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0063, code lost:
        if (r4 != null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0065, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006a, code lost:
        if ((r14 & 1) == 0) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006c, code lost:
        r12 = 700;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006f, code lost:
        r12 = 400;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0073, code lost:
        if ((r14 & 2) == 0) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0075, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008a, code lost:
        return new android.graphics.Typeface.CustomFallbackBuilder(r4.build()).setStyle(new android.graphics.fonts.FontStyle(r12, r2)).build();
     */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface getMin(android.content.Context r11, @androidx.annotation.Nullable android.os.CancellationSignal r12, @androidx.annotation.NonNull androidx.core.provider.FontsContractCompat.setMin[] r13, int r14) {
        /*
            r10 = this;
            android.content.ContentResolver r11 = r11.getContentResolver()
            r0 = 0
            int r1 = r13.length     // Catch:{ Exception -> 0x008b }
            r2 = 0
            r4 = r0
            r3 = 0
        L_0x0009:
            r5 = 1
            if (r3 >= r1) goto L_0x0063
            r6 = r13[r3]     // Catch:{ Exception -> 0x008b }
            android.net.Uri r7 = r6.setMax()     // Catch:{ IOException -> 0x0060 }
            java.lang.String r8 = "r"
            android.os.ParcelFileDescriptor r7 = r11.openFileDescriptor(r7, r8, r12)     // Catch:{ IOException -> 0x0060 }
            if (r7 != 0) goto L_0x0020
            if (r7 == 0) goto L_0x0060
        L_0x001c:
            r7.close()     // Catch:{ IOException -> 0x0060 }
            goto L_0x0060
        L_0x0020:
            android.graphics.fonts.Font$Builder r8 = new android.graphics.fonts.Font$Builder     // Catch:{ all -> 0x0054 }
            r8.<init>(r7)     // Catch:{ all -> 0x0054 }
            int r9 = r6.getMin()     // Catch:{ all -> 0x0054 }
            android.graphics.fonts.Font$Builder r8 = r8.setWeight(r9)     // Catch:{ all -> 0x0054 }
            boolean r9 = r6.getMax()     // Catch:{ all -> 0x0054 }
            if (r9 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            android.graphics.fonts.Font$Builder r5 = r8.setSlant(r5)     // Catch:{ all -> 0x0054 }
            int r6 = r6.length()     // Catch:{ all -> 0x0054 }
            android.graphics.fonts.Font$Builder r5 = r5.setTtcIndex(r6)     // Catch:{ all -> 0x0054 }
            android.graphics.fonts.Font r5 = r5.build()     // Catch:{ all -> 0x0054 }
            if (r4 != 0) goto L_0x004e
            android.graphics.fonts.FontFamily$Builder r6 = new android.graphics.fonts.FontFamily$Builder     // Catch:{ all -> 0x0054 }
            r6.<init>(r5)     // Catch:{ all -> 0x0054 }
            r4 = r6
            goto L_0x0051
        L_0x004e:
            r4.addFont(r5)     // Catch:{ all -> 0x0054 }
        L_0x0051:
            if (r7 == 0) goto L_0x0060
            goto L_0x001c
        L_0x0054:
            r5 = move-exception
            if (r7 == 0) goto L_0x005f
            r7.close()     // Catch:{ all -> 0x005b }
            goto L_0x005f
        L_0x005b:
            r6 = move-exception
            r5.addSuppressed(r6)     // Catch:{ IOException -> 0x0060 }
        L_0x005f:
            throw r5     // Catch:{ IOException -> 0x0060 }
        L_0x0060:
            int r3 = r3 + 1
            goto L_0x0009
        L_0x0063:
            if (r4 != 0) goto L_0x0066
            return r0
        L_0x0066:
            android.graphics.fonts.FontStyle r11 = new android.graphics.fonts.FontStyle     // Catch:{ Exception -> 0x008b }
            r12 = r14 & 1
            if (r12 == 0) goto L_0x006f
            r12 = 700(0x2bc, float:9.81E-43)
            goto L_0x0071
        L_0x006f:
            r12 = 400(0x190, float:5.6E-43)
        L_0x0071:
            r13 = r14 & 2
            if (r13 == 0) goto L_0x0076
            r2 = 1
        L_0x0076:
            r11.<init>(r12, r2)     // Catch:{ Exception -> 0x008b }
            android.graphics.Typeface$CustomFallbackBuilder r12 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch:{ Exception -> 0x008b }
            android.graphics.fonts.FontFamily r13 = r4.build()     // Catch:{ Exception -> 0x008b }
            r12.<init>(r13)     // Catch:{ Exception -> 0x008b }
            android.graphics.Typeface$CustomFallbackBuilder r11 = r12.setStyle(r11)     // Catch:{ Exception -> 0x008b }
            android.graphics.Typeface r11 = r11.build()     // Catch:{ Exception -> 0x008b }
            return r11
        L_0x008b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.RequiresOptIn.getMin(android.content.Context, android.os.CancellationSignal, androidx.core.provider.FontsContractCompat$setMin[], int):android.graphics.Typeface");
    }

    @RequiresApi(26)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public class Level extends Px {
        protected final Method getMax;
        protected final Method getMin;
        protected final Method isInside;
        protected final Method length;
        protected final Constructor<?> setMax;
        protected final Class<?> setMin;
        protected final Method toFloatRange;

        public Level() {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Constructor<?> constructor;
            Method method5;
            Class<?> cls = null;
            try {
                Class<?> max = getMax();
                constructor = getMax(max);
                method4 = length(max);
                method3 = setMax(max);
                method2 = setMin(max);
                method = getMin(max);
                Class<?> cls2 = max;
                method5 = toIntRange(max);
                cls = cls2;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                method5 = null;
                constructor = null;
                method4 = null;
                method3 = null;
                method2 = null;
                method = null;
            }
            this.setMin = cls;
            this.setMax = constructor;
            this.length = method4;
            this.getMax = method3;
            this.getMin = method2;
            this.isInside = method;
            this.toFloatRange = method5;
        }

        private boolean setMax() {
            return this.length != null;
        }

        @Nullable
        private Object getMin() {
            try {
                return this.setMax.newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                return null;
            }
        }

        private boolean getMax(Context context, Object obj, String str, int i, int i2, int i3, @Nullable FontVariationAxis[] fontVariationAxisArr) {
            try {
                return ((Boolean) this.length.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return false;
            }
        }

        private boolean getMin(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
            try {
                return ((Boolean) this.getMax.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return false;
            }
        }

        /* access modifiers changed from: protected */
        @Nullable
        public Typeface getMax(Object obj) {
            try {
                Object newInstance = Array.newInstance(this.setMin, 1);
                Array.set(newInstance, 0, obj);
                return (Typeface) this.toFloatRange.invoke((Object) null, new Object[]{newInstance, -1, -1});
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        }

        private boolean length(Object obj) {
            try {
                return ((Boolean) this.getMin.invoke(obj, new Object[0])).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return false;
            }
        }

        private void setMin(Object obj) {
            try {
                this.isInside.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }

        @Nullable
        public Typeface setMax(Context context, FontResourcesParserCompat.setMin setmin, Resources resources, int i) {
            if (!setMax()) {
                return super.setMax(context, setmin, resources, i);
            }
            Object min = getMin();
            if (min == null) {
                return null;
            }
            for (FontResourcesParserCompat.setMax setmax : setmin.getMax()) {
                if (!getMax(context, min, setmax.getMax(), setmax.getMin(), setmax.length(), setmax.setMax() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(setmax.setMin()))) {
                    setMin(min);
                    return null;
                }
            }
            if (!length(min)) {
                return null;
            }
            return getMax(min);
        }

        @Nullable
        public Typeface getMin(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontsContractCompat.setMin[] setminArr, int i) {
            Typeface max;
            ParcelFileDescriptor openFileDescriptor;
            if (setminArr.length <= 0) {
                return null;
            }
            if (!setMax()) {
                FontsContractCompat.setMin max2 = getMax(setminArr, i);
                try {
                    openFileDescriptor = context.getContentResolver().openFileDescriptor(max2.setMax(), BranchLinkConstant.PayloadKey.REFERRAL, cancellationSignal);
                    if (openFileDescriptor == null) {
                        if (openFileDescriptor != null) {
                            openFileDescriptor.close();
                        }
                        return null;
                    }
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(max2.getMin()).setItalic(max2.getMax()).build();
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return build;
                } catch (IOException unused) {
                    return null;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                Map<Uri, ByteBuffer> min = anyOf.getMin(context, setminArr, cancellationSignal);
                Object min2 = getMin();
                if (min2 == null) {
                    return null;
                }
                boolean z = false;
                for (FontsContractCompat.setMin setmin : setminArr) {
                    ByteBuffer byteBuffer = min.get(setmin.setMax());
                    if (byteBuffer != null) {
                        if (!getMin(min2, byteBuffer, setmin.length(), setmin.getMin(), setmin.getMax() ? 1 : 0)) {
                            setMin(min2);
                            return null;
                        }
                        z = true;
                    }
                }
                if (!z) {
                    setMin(min2);
                    return null;
                } else if (length(min2) && (max = getMax(min2)) != null) {
                    return Typeface.create(max, i);
                } else {
                    return null;
                }
            }
            throw th;
        }

        @Nullable
        public Typeface setMin(Context context, Resources resources, int i, String str, int i2) {
            if (!setMax()) {
                return super.setMin(context, resources, i, str, i2);
            }
            Object min = getMin();
            if (min == null) {
                return null;
            }
            if (!getMax(context, min, str, 0, -1, -1, (FontVariationAxis[]) null)) {
                setMin(min);
                return null;
            } else if (!length(min)) {
                return null;
            } else {
                return getMax(min);
            }
        }

        /* access modifiers changed from: protected */
        public Class<?> getMax() throws ClassNotFoundException {
            return Class.forName("android.graphics.FontFamily");
        }

        /* access modifiers changed from: protected */
        public Constructor<?> getMax(Class<?> cls) throws NoSuchMethodException {
            return cls.getConstructor(new Class[0]);
        }

        /* access modifiers changed from: protected */
        public Method length(Class<?> cls) throws NoSuchMethodException {
            return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class});
        }

        /* access modifiers changed from: protected */
        public Method setMax(Class<?> cls) throws NoSuchMethodException {
            return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE});
        }

        /* access modifiers changed from: protected */
        public Method setMin(Class<?> cls) throws NoSuchMethodException {
            return cls.getMethod("freeze", new Class[0]);
        }

        /* access modifiers changed from: protected */
        public Method getMin(Class<?> cls) throws NoSuchMethodException {
            return cls.getMethod("abortCreation", new Class[0]);
        }

        /* access modifiers changed from: protected */
        public Method toIntRange(Class<?> cls) throws NoSuchMethodException {
            Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), Integer.TYPE, Integer.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        }
    }

    @Nullable
    public Typeface setMax(Context context, FontResourcesParserCompat.setMin setmin, Resources resources, int i) {
        try {
            FontResourcesParserCompat.setMax[] max = setmin.getMax();
            int length = max.length;
            int i2 = 0;
            FontFamily.Builder builder = null;
            int i3 = 0;
            while (true) {
                int i4 = 1;
                if (i3 >= length) {
                    break;
                }
                FontResourcesParserCompat.setMax setmax = max[i3];
                try {
                    Font.Builder weight = new Font.Builder(resources, setmax.IsOverlapping()).setWeight(setmax.length());
                    if (!setmax.setMax()) {
                        i4 = 0;
                    }
                    Font build = weight.setSlant(i4).setTtcIndex(setmax.getMin()).setFontVariationSettings(setmax.setMin()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
                i3++;
            }
            if (builder == null) {
                return null;
            }
            int i5 = (i & 1) != 0 ? 700 : 400;
            if ((i & 2) != 0) {
                i2 = 1;
            }
            return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i5, i2)).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Nullable
    public Typeface setMin(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }
}
