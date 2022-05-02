package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import o.PlaybackStateCompat;

@RequiresApi(24)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
class RequiresFeature extends enforcement {
    private static final Class<?> getMax;
    private static final Method getMin;
    private static final Constructor<?> length;
    private static final Method setMax;

    RequiresFeature() {
    }

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method2 = null;
            method = null;
        }
        length = constructor;
        getMax = cls;
        setMax = method;
        getMin = method2;
    }

    public static boolean setMax() {
        return setMax != null;
    }

    private static Object setMin() {
        try {
            return length.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static boolean setMin(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) setMax.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface length(Object obj) {
        try {
            Object newInstance = Array.newInstance(getMax, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) getMin.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Nullable
    public Typeface getMin(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontsContractCompat.setMin[] setminArr, int i) {
        Object min = setMin();
        if (min == null) {
            return null;
        }
        PlaybackStateCompat.RepeatMode repeatMode = new PlaybackStateCompat.RepeatMode();
        for (FontsContractCompat.setMin setmin : setminArr) {
            Uri max = setmin.setMax();
            ByteBuffer byteBuffer = (ByteBuffer) repeatMode.get(max);
            if (byteBuffer == null) {
                byteBuffer = anyOf.getMax(context, cancellationSignal, max);
                repeatMode.put(max, byteBuffer);
            }
            if (byteBuffer == null || !setMin(min, byteBuffer, setmin.length(), setmin.getMin(), setmin.getMax())) {
                return null;
            }
        }
        Typeface length2 = length(min);
        if (length2 == null) {
            return null;
        }
        return Typeface.create(length2, i);
    }

    @Nullable
    public Typeface setMax(Context context, FontResourcesParserCompat.setMin setmin, Resources resources, int i) {
        Object min = setMin();
        if (min == null) {
            return null;
        }
        for (FontResourcesParserCompat.setMax setmax : setmin.getMax()) {
            ByteBuffer max = anyOf.setMax(context, resources, setmax.IsOverlapping());
            if (max == null || !setMin(min, max, setmax.getMin(), setmax.length(), setmax.setMax())) {
                return null;
            }
        }
        return length(min);
    }
}
