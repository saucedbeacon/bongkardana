package o;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;
import o.PlaybackStateCompat;

public class setVisible {
    private static final PlaybackStateCompat.RepeatMode<ClassLoader, PlaybackStateCompat.RepeatMode<String, Class<?>>> setMin = new PlaybackStateCompat.RepeatMode<>();

    @NonNull
    private static Class<?> getMin(@NonNull ClassLoader classLoader, @NonNull String str) throws ClassNotFoundException {
        PlaybackStateCompat.RepeatMode repeatMode = setMin.get(classLoader);
        if (repeatMode == null) {
            repeatMode = new PlaybackStateCompat.RepeatMode();
            setMin.put(classLoader, repeatMode);
        }
        Class<?> cls = (Class) repeatMode.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        repeatMode.put(str, cls2);
        return cls2;
    }

    static boolean setMax(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return Fragment.class.isAssignableFrom(getMin(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @NonNull
    public static Class<? extends Fragment> length(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return getMin(classLoader, str);
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder("Unable to instantiate fragment ");
            sb.append(str);
            sb.append(": make sure class name exists");
            throw new Fragment.InstantiationException(sb.toString(), e);
        } catch (ClassCastException e2) {
            StringBuilder sb2 = new StringBuilder("Unable to instantiate fragment ");
            sb2.append(str);
            sb2.append(": make sure class is a valid subclass of Fragment");
            throw new Fragment.InstantiationException(sb2.toString(), e2);
        }
    }

    @NonNull
    public Fragment getMax(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return (Fragment) length(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (InstantiationException e) {
            StringBuilder sb = new StringBuilder("Unable to instantiate fragment ");
            sb.append(str);
            sb.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new Fragment.InstantiationException(sb.toString(), e);
        } catch (IllegalAccessException e2) {
            StringBuilder sb2 = new StringBuilder("Unable to instantiate fragment ");
            sb2.append(str);
            sb2.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new Fragment.InstantiationException(sb2.toString(), e2);
        } catch (NoSuchMethodException e3) {
            StringBuilder sb3 = new StringBuilder("Unable to instantiate fragment ");
            sb3.append(str);
            sb3.append(": could not find Fragment constructor");
            throw new Fragment.InstantiationException(sb3.toString(), e3);
        } catch (InvocationTargetException e4) {
            StringBuilder sb4 = new StringBuilder("Unable to instantiate fragment ");
            sb4.append(str);
            sb4.append(": calling Fragment constructor caused an exception");
            throw new Fragment.InstantiationException(sb4.toString(), e4);
        }
    }
}
