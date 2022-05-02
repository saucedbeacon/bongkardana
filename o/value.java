package o;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY})
final class value {
    private static final Handler equals = new Handler(Looper.getMainLooper());
    protected static final Method getMax = getMin(setMin);
    protected static final Field getMin = setMin();
    protected static final Method isInside = getMax(setMin);
    protected static final Method length = setMax(setMin);
    protected static final Field setMax = getMin();
    protected static final Class<?> setMin = setMax();

    static boolean getMax(@NonNull Activity activity) {
        Object obj;
        final Application application;
        final getMax getmax;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (length() && isInside == null) {
            return false;
        } else {
            if (getMax == null && length == null) {
                return false;
            }
            try {
                final Object obj2 = getMin.get(activity);
                if (obj2 == null || (obj = setMax.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                getmax = new getMax(activity);
                application.registerActivityLifecycleCallbacks(getmax);
                equals.post(new Runnable() {
                    public final void run() {
                        getMax.this.setMin = obj2;
                    }
                });
                if (length()) {
                    isInside.invoke(obj, new Object[]{obj2, null, null, 0, Boolean.FALSE, null, null, Boolean.FALSE, Boolean.FALSE});
                } else {
                    activity.recreate();
                }
                equals.post(new Runnable() {
                    public final void run() {
                        application.unregisterActivityLifecycleCallbacks(getmax);
                    }
                });
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    static final class getMax implements Application.ActivityLifecycleCallbacks {
        private boolean IsOverlapping = false;
        private final int getMax;
        private boolean getMin = false;
        private Activity length;
        private boolean setMax = false;
        Object setMin;

        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public final void onActivityResumed(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStopped(Activity activity) {
        }

        getMax(@NonNull Activity activity) {
            this.length = activity;
            this.getMax = activity.hashCode();
        }

        public final void onActivityStarted(Activity activity) {
            if (this.length == activity) {
                this.getMin = true;
            }
        }

        public final void onActivityPaused(Activity activity) {
            if (this.setMax && !this.IsOverlapping && !this.getMin && value.getMin(this.setMin, this.getMax, activity)) {
                this.IsOverlapping = true;
                this.setMin = null;
            }
        }

        public final void onActivityDestroyed(Activity activity) {
            if (this.length == activity) {
                this.length = null;
                this.setMax = true;
            }
        }
    }

    protected static boolean getMin(Object obj, int i, Activity activity) {
        try {
            final Object obj2 = getMin.get(activity);
            if (obj2 == obj) {
                if (activity.hashCode() == i) {
                    final Object obj3 = setMax.get(activity);
                    equals.postAtFrontOfQueue(new Runnable() {
                        public final void run() {
                            try {
                                if (value.length != null) {
                                    value.length.invoke(obj3, new Object[]{obj2, Boolean.FALSE, "AppCompat recreation"});
                                    return;
                                }
                                value.getMax.invoke(obj3, new Object[]{obj2, Boolean.FALSE});
                            } catch (RuntimeException e) {
                                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                                    throw e;
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static Method setMax(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method getMin(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean length() {
        return Build.VERSION.SDK_INT == 26 || Build.VERSION.SDK_INT == 27;
    }

    private static Method getMax(Class<?> cls) {
        if (length() && cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field getMin() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field setMin() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> setMax() {
        try {
            return Class.forName(ProcessUtils.ACTIVITY_THREAD);
        } catch (Throwable unused) {
            return null;
        }
    }
}
