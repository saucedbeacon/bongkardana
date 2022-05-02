package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import id.dana.data.constant.BranchLinkConstant;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
class Px extends enforcement {
    private static Class<?> getMax = null;
    private static Method getMin = null;
    private static Method length = null;
    private static Constructor<?> setMax = null;
    private static boolean setMin = false;

    Px() {
    }

    private static void setMax() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!setMin) {
            setMin = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                method2 = null;
                cls = null;
                method = null;
            }
            setMax = constructor;
            getMax = cls;
            length = method;
            getMin = method2;
        }
    }

    private File setMax(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
        try {
            StringBuilder sb = new StringBuilder("/proc/self/fd/");
            sb.append(parcelFileDescriptor.getFd());
            String readlink = Os.readlink(sb.toString());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static Object length() {
        setMax();
        try {
            return setMax.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private static Typeface getMax(Object obj) {
        setMax();
        try {
            Object newInstance = Array.newInstance(getMax, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) getMin.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean length(Object obj, String str, int i, boolean z) {
        setMax();
        try {
            return ((Boolean) length.invoke(obj, new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public Typeface getMin(Context context, CancellationSignal cancellationSignal, @NonNull FontsContractCompat.setMin[] setminArr, int i) {
        FileInputStream fileInputStream;
        if (setminArr.length <= 0) {
            return null;
        }
        FontsContractCompat.setMin max = getMax(setminArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(max.setMax(), BranchLinkConstant.PayloadKey.REFERRAL, cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                File max2 = setMax(openFileDescriptor);
                if (max2 != null) {
                    if (max2.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(max2);
                        if (openFileDescriptor != null) {
                            openFileDescriptor.close();
                        }
                        return createFromFile;
                    }
                }
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                Typeface length2 = super.length(context, fileInputStream);
                fileInputStream.close();
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return length2;
            } catch (Throwable th) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public Typeface setMax(Context context, FontResourcesParserCompat.setMin setmin, Resources resources, int i) {
        Object length2 = length();
        FontResourcesParserCompat.setMax[] max = setmin.getMax();
        int length3 = max.length;
        int i2 = 0;
        while (i2 < length3) {
            FontResourcesParserCompat.setMax setmax = max[i2];
            File max2 = anyOf.setMax(context);
            if (max2 == null) {
                return null;
            }
            try {
                if (!anyOf.getMin(max2, resources, setmax.IsOverlapping())) {
                    max2.delete();
                    return null;
                } else if (!length(length2, max2.getPath(), setmax.length(), setmax.setMax())) {
                    return null;
                } else {
                    max2.delete();
                    i2++;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                max2.delete();
            }
        }
        return getMax(length2);
    }
}
