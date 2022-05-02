package o;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandleController;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import o.onFinishInflate;

public final class getWindowAnimations extends onFinishInflate.getMax {
    private static final Class<?>[] IsOverlapping = {onItemClick.class};
    private static final Class<?>[] toIntRange = {Application.class, onItemClick.class};
    private final Application getMax;
    private final Bundle getMin;
    private final initForMode length;
    private final onFinishInflate.setMax setMax;
    private final Lifecycle setMin;

    @SuppressLint({"LambdaLast"})
    public getWindowAnimations(@Nullable Application application, @NonNull onInitializeAccessibilityEvent oninitializeaccessibilityevent, @Nullable Bundle bundle) {
        onFinishInflate.setMax setmax;
        this.length = oninitializeaccessibilityevent.getSavedStateRegistry();
        this.setMin = oninitializeaccessibilityevent.getLifecycle();
        this.getMin = bundle;
        this.getMax = application;
        if (application != null) {
            if (onFinishInflate.getMin.setMax == null) {
                onFinishInflate.getMin.setMax = new onFinishInflate.getMin(application);
            }
            setmax = onFinishInflate.getMin.setMax;
        } else {
            if (onFinishInflate.setMin.getMin == null) {
                onFinishInflate.setMin.getMin = new onFinishInflate.setMin();
            }
            setmax = onFinishInflate.setMin.getMin;
        }
        this.setMax = setmax;
    }

    @NonNull
    public final <T extends setGroupDividerEnabled> T setMin(@NonNull String str, @NonNull Class<T> cls) {
        Constructor<T> constructor;
        T t;
        boolean isAssignableFrom = onTouchEvent.class.isAssignableFrom(cls);
        if (!isAssignableFrom || this.getMax == null) {
            constructor = length(cls, IsOverlapping);
        } else {
            constructor = length(cls, toIntRange);
        }
        if (constructor == null) {
            return this.setMax.getMin(cls);
        }
        SavedStateHandleController max = SavedStateHandleController.getMax(this.length, this.setMin, str, this.getMin);
        if (isAssignableFrom) {
            try {
                if (this.getMax != null) {
                    t = (setGroupDividerEnabled) constructor.newInstance(new Object[]{this.getMax, max.getMax});
                    t.getMin("androidx.lifecycle.savedstate.vm.tag", max);
                    return t;
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Failed to access ".concat(String.valueOf(cls)), e);
            } catch (InstantiationException e2) {
                StringBuilder sb = new StringBuilder("A ");
                sb.append(cls);
                sb.append(" cannot be instantiated.");
                throw new RuntimeException(sb.toString(), e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("An exception happened in constructor of ".concat(String.valueOf(cls)), e3.getCause());
            }
        }
        t = (setGroupDividerEnabled) constructor.newInstance(new Object[]{max.getMax});
        t.getMin("androidx.lifecycle.savedstate.vm.tag", max);
        return t;
    }

    @NonNull
    public final <T extends setGroupDividerEnabled> T getMin(@NonNull Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return setMin(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    private static <T> Constructor<T> length(Class<T> cls, Class<?>[] clsArr) {
        for (Constructor<T> constructor : cls.getConstructors()) {
            if (Arrays.equals(clsArr, constructor.getParameterTypes())) {
                return constructor;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void setMax(@NonNull setGroupDividerEnabled setgroupdividerenabled) {
        SavedStateHandleController.length(setgroupdividerenabled, this.length, this.setMin);
    }
}
