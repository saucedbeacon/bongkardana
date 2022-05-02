package o;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class setOverlayMode {
    private static final Object getMin = new Object();
    private static volatile setOverlayMode length;
    @NonNull
    public final Set<Class<? extends setShowingForActionMode<?>>> getMax = new HashSet();
    @NonNull
    public final Context setMax;
    @NonNull
    final Map<Class<?>, Object> setMin = new HashMap();

    private setOverlayMode(@NonNull Context context) {
        this.setMax = context.getApplicationContext();
    }

    @NonNull
    public static setOverlayMode setMax(@NonNull Context context) {
        if (length == null) {
            synchronized (getMin) {
                if (length == null) {
                    length = new setOverlayMode(context);
                }
            }
        }
        return length;
    }

    @NonNull
    public final <T> T getMax(@NonNull Class<? extends setShowingForActionMode<?>> cls, @NonNull Set<Class<?>> set) {
        T t;
        synchronized (getMin) {
            if (onNestedScrollAccepted.setMax()) {
                try {
                    String simpleName = cls.getSimpleName();
                    if (Build.VERSION.SDK_INT >= 18) {
                        onStopNestedScroll.getMin(simpleName);
                    }
                } catch (Throwable th) {
                    if (Build.VERSION.SDK_INT >= 18) {
                        onStopNestedScroll.length();
                    }
                    throw th;
                }
            }
            if (!set.contains(cls)) {
                if (!this.setMin.containsKey(cls)) {
                    set.add(cls);
                    setShowingForActionMode setshowingforactionmode = (setShowingForActionMode) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    List<Class<? extends setShowingForActionMode<?>>> min = setshowingforactionmode.getMin();
                    if (!min.isEmpty()) {
                        for (Class next : min) {
                            if (!this.setMin.containsKey(next)) {
                                getMax(next, set);
                            }
                        }
                    }
                    t = setshowingforactionmode.setMin(this.setMax);
                    set.remove(cls);
                    this.setMin.put(cls, t);
                } else {
                    t = this.setMin.get(cls);
                }
                if (Build.VERSION.SDK_INT >= 18) {
                    onStopNestedScroll.length();
                }
            } else {
                throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
            }
        }
        return t;
    }
}
