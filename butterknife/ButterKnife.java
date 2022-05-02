package butterknife;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ButterKnife {
    private static boolean getMin = false;
    @VisibleForTesting
    static final Map<Class<?>, Constructor<? extends Unbinder>> setMax = new LinkedHashMap();

    private ButterKnife() {
        throw new AssertionError("No instances.");
    }

    @UiThread
    @NonNull
    public static Unbinder length(@NonNull Activity activity) {
        return setMax((Object) activity, activity.getWindow().getDecorView());
    }

    @UiThread
    @NonNull
    public static Unbinder setMin(@NonNull View view) {
        return setMax((Object) view, view);
    }

    @UiThread
    @NonNull
    public static Unbinder getMax(@NonNull Dialog dialog) {
        return setMax((Object) dialog, dialog.getWindow().getDecorView());
    }

    @UiThread
    @NonNull
    public static Unbinder setMax(@NonNull Object obj, @NonNull Dialog dialog) {
        return setMax(obj, dialog.getWindow().getDecorView());
    }

    @UiThread
    @NonNull
    public static Unbinder setMax(@NonNull Object obj, @NonNull View view) {
        Constructor<? extends Unbinder> max = setMax(obj.getClass());
        if (max == null) {
            return Unbinder.setMax;
        }
        try {
            return (Unbinder) max.newInstance(new Object[]{obj, view});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Unable to invoke ".concat(String.valueOf(max)), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Unable to invoke ".concat(String.valueOf(max)), e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unable to create binding instance.", cause);
            }
        }
    }

    @UiThread
    @Nullable
    @CheckResult
    private static Constructor<? extends Unbinder> setMax(Class<?> cls) {
        Constructor<? extends Unbinder> constructor;
        Constructor<? extends Unbinder> constructor2 = setMax.get(cls);
        if (constructor2 != null || setMax.containsKey(cls)) {
            return constructor2;
        }
        String name = cls.getName();
        if (name.startsWith("android.") || name.startsWith("java.") || name.startsWith("androidx.")) {
            return null;
        }
        try {
            ClassLoader classLoader = cls.getClassLoader();
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append("_ViewBinding");
            constructor = classLoader.loadClass(sb.toString()).getConstructor(new Class[]{cls, View.class});
        } catch (ClassNotFoundException unused) {
            constructor = setMax(cls.getSuperclass());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Unable to find binding constructor for ".concat(String.valueOf(name)), e);
        }
        setMax.put(cls, constructor);
        return constructor;
    }
}
