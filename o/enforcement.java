package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
class enforcement {
    @SuppressLint({"BanConcurrentHashMap"})
    private ConcurrentHashMap<Long, FontResourcesParserCompat.setMin> getMin = new ConcurrentHashMap<>();

    interface setMax<T> {
        boolean getMax(T t);

        int setMin(T t);
    }

    enforcement() {
    }

    private static <T> T getMin(T[] tArr, int i, setMax<T> setmax) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(setmax.setMin(t2) - i2) * 2) + (setmax.getMax(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    private static long setMax(@Nullable Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    public FontsContractCompat.setMin getMax(FontsContractCompat.setMin[] setminArr, int i) {
        return (FontsContractCompat.setMin) getMin(setminArr, i, new setMax<FontsContractCompat.setMin>() {
            /* renamed from: getMax */
            public int setMin(FontsContractCompat.setMin setmin) {
                return setmin.getMin();
            }

            /* renamed from: setMax */
            public boolean getMax(FontsContractCompat.setMin setmin) {
                return setmin.getMax();
            }
        });
    }

    /* access modifiers changed from: protected */
    public Typeface length(Context context, InputStream inputStream) {
        File max = anyOf.setMax(context);
        if (max == null) {
            return null;
        }
        try {
            if (!anyOf.setMax(max, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(max.getPath());
            max.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            max.delete();
        }
    }

    @Nullable
    public Typeface getMin(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontsContractCompat.setMin[] setminArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (setminArr.length <= 0) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(getMax(setminArr, i).setMax());
            try {
                Typeface length = length(context, inputStream);
                anyOf.setMin(inputStream);
                return length;
            } catch (IOException unused) {
                anyOf.setMin(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                anyOf.setMin(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            anyOf.setMin(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            anyOf.setMin(inputStream2);
            throw th;
        }
    }

    private FontResourcesParserCompat.setMax setMin(FontResourcesParserCompat.setMin setmin, int i) {
        return (FontResourcesParserCompat.setMax) getMin(setmin.getMax(), i, new setMax<FontResourcesParserCompat.setMax>() {
            public int setMin(FontResourcesParserCompat.setMax setmax) {
                return setmax.length();
            }

            /* renamed from: getMin */
            public boolean getMax(FontResourcesParserCompat.setMax setmax) {
                return setmax.setMax();
            }
        });
    }

    @Nullable
    public Typeface setMax(Context context, FontResourcesParserCompat.setMin setmin, Resources resources, int i) {
        FontResourcesParserCompat.setMax min = setMin(setmin, i);
        if (min == null) {
            return null;
        }
        Typeface min2 = RequiresApi.setMin(context, resources, min.IsOverlapping(), min.getMax(), i);
        setMin(min2, setmin);
        return min2;
    }

    @Nullable
    public Typeface setMin(Context context, Resources resources, int i, String str, int i2) {
        File max = anyOf.setMax(context);
        if (max == null) {
            return null;
        }
        try {
            if (!anyOf.getMin(max, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(max.getPath());
            max.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            max.delete();
        }
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public FontResourcesParserCompat.setMin getMin(Typeface typeface) {
        long max = setMax(typeface);
        if (max == 0) {
            return null;
        }
        return this.getMin.get(Long.valueOf(max));
    }

    private void setMin(Typeface typeface, FontResourcesParserCompat.setMin setmin) {
        long max = setMax(typeface);
        if (max != 0) {
            this.getMin.put(Long.valueOf(max), setmin);
        }
    }
}
