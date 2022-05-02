package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.ActivityChooserView;
import o.PlaybackStateCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class VersionedParcel {
    protected final PlaybackStateCompat<String, Class> getMin;
    protected final PlaybackStateCompat<String, Method> setMax;
    protected final PlaybackStateCompat<String, Method> setMin;

    /* access modifiers changed from: protected */
    public abstract <T extends Parcelable> T equals();

    /* access modifiers changed from: protected */
    public abstract void getMax(int i);

    /* access modifiers changed from: protected */
    public abstract void getMax(Parcelable parcelable);

    /* access modifiers changed from: protected */
    public abstract byte[] getMax();

    /* access modifiers changed from: protected */
    public abstract VersionedParcel getMin();

    /* access modifiers changed from: protected */
    public abstract boolean isInside();

    /* access modifiers changed from: protected */
    public abstract void length();

    /* access modifiers changed from: protected */
    public abstract void length(boolean z);

    /* access modifiers changed from: protected */
    public abstract boolean length(int i);

    /* access modifiers changed from: protected */
    public abstract int setMax();

    /* access modifiers changed from: protected */
    public abstract String setMin();

    /* access modifiers changed from: protected */
    public abstract void setMin(int i);

    /* access modifiers changed from: protected */
    public abstract void setMin(CharSequence charSequence);

    /* access modifiers changed from: protected */
    public abstract void setMin(String str);

    /* access modifiers changed from: protected */
    public abstract void setMin(byte[] bArr);

    /* access modifiers changed from: protected */
    public abstract CharSequence toFloatRange();

    public VersionedParcel(PlaybackStateCompat<String, Method> playbackStateCompat, PlaybackStateCompat<String, Method> playbackStateCompat2, PlaybackStateCompat<String, Class> playbackStateCompat3) {
        this.setMax = playbackStateCompat;
        this.setMin = playbackStateCompat2;
        this.getMin = playbackStateCompat3;
    }

    public final void setMax(boolean z, int i) {
        getMax(i);
        length(z);
    }

    public final void getMax(byte[] bArr) {
        getMax(2);
        setMin(bArr);
    }

    public final void getMin(CharSequence charSequence, int i) {
        getMax(i);
        setMin(charSequence);
    }

    public final void getMax(int i, int i2) {
        getMax(i2);
        setMin(i);
    }

    public final void getMin(String str, int i) {
        getMax(i);
        setMin(str);
    }

    public final void getMax(Parcelable parcelable, int i) {
        getMax(i);
        getMax(parcelable);
    }

    public final boolean getMin(boolean z, int i) {
        if (!length(i)) {
            return z;
        }
        return isInside();
    }

    public final int getMin(int i, int i2) {
        if (!length(i2)) {
            return i;
        }
        return setMax();
    }

    public final String length(String str, int i) {
        if (!length(i)) {
            return str;
        }
        return setMin();
    }

    public final byte[] setMax(byte[] bArr) {
        if (!length(2)) {
            return bArr;
        }
        return getMax();
    }

    public final <T extends Parcelable> T setMax(T t, int i) {
        if (!length(i)) {
            return t;
        }
        return equals();
    }

    public final CharSequence getMax(CharSequence charSequence, int i) {
        if (!length(i)) {
            return charSequence;
        }
        return toFloatRange();
    }

    public final void getMin(ActivityChooserView activityChooserView) {
        getMax(1);
        if (activityChooserView == null) {
            setMin((String) null);
            return;
        }
        length(activityChooserView);
        VersionedParcel min = getMin();
        setMin(activityChooserView, min);
        min.length();
    }

    /* access modifiers changed from: protected */
    public final void setMax(ActivityChooserView activityChooserView) {
        if (activityChooserView == null) {
            setMin((String) null);
            return;
        }
        length(activityChooserView);
        VersionedParcel min = getMin();
        setMin(activityChooserView, min);
        min.length();
    }

    private void length(ActivityChooserView activityChooserView) {
        try {
            setMin(getMin((Class<? extends ActivityChooserView>) activityChooserView.getClass()).getName());
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(activityChooserView.getClass().getSimpleName());
            sb.append(" does not have a Parcelizer");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public final <T extends ActivityChooserView> T setMin(T t) {
        if (!length(1)) {
            return t;
        }
        String min = setMin();
        if (min == null) {
            return null;
        }
        return setMax(min, getMin());
    }

    /* access modifiers changed from: protected */
    public final <T extends ActivityChooserView> T IsOverlapping() {
        String min = setMin();
        if (min == null) {
            return null;
        }
        return setMax(min, getMin());
    }

    private <T extends ActivityChooserView> void setMin(T t, VersionedParcel versionedParcel) {
        try {
            setMin((Class) t.getClass()).invoke((Object) null, new Object[]{t, versionedParcel});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    private Method setMin(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.setMin.get(cls.getName());
        if (method != null) {
            return method;
        }
        Method declaredMethod = getMin((Class<? extends ActivityChooserView>) cls).getDeclaredMethod("write", new Class[]{cls, VersionedParcel.class});
        this.setMin.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    private Class getMin(Class<? extends ActivityChooserView> cls) throws ClassNotFoundException {
        Class cls2 = this.getMin.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.getMin.put(cls.getName(), cls3);
        return cls3;
    }

    public static class ParcelException extends RuntimeException {
        public ParcelException(Throwable th) {
            super(th);
        }
    }

    private <T extends ActivityChooserView> T setMax(String str, VersionedParcel versionedParcel) {
        Class<VersionedParcel> cls = VersionedParcel.class;
        try {
            Method method = this.setMax.get(str);
            if (method == null) {
                method = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
                this.setMax.put(str, method);
            }
            return (ActivityChooserView) method.invoke((Object) null, new Object[]{versionedParcel});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }
}
