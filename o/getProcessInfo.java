package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import o.LogContextImpl;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

public class getProcessInfo {
    private static final getProcessInfo setMax = length();

    /* access modifiers changed from: package-private */
    @Nullable
    public Executor getMin() {
        return null;
    }

    public boolean getMin(Method method) {
        return false;
    }

    getProcessInfo() {
    }

    public static getProcessInfo setMax() {
        return setMax;
    }

    private static getProcessInfo length() {
        try {
            Class.forName("android.os.Build");
            if (Build.VERSION.SDK_INT != 0) {
                return new getMax();
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            Class.forName("java.util.Optional");
            return new length();
        } catch (ClassNotFoundException unused2) {
            return new getProcessInfo();
        }
    }

    /* access modifiers changed from: package-private */
    public LogContextImpl.AppendWorker.setMin getMin(@Nullable Executor executor) {
        if (executor != null) {
            return new registerMasLog(executor);
        }
        return LoggerFactory.setMin;
    }

    @Nullable
    public Object getMin(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) throws Throwable {
        throw new UnsupportedOperationException();
    }

    @IgnoreJRERequirement
    static class length extends getProcessInfo {
        length() {
        }

        /* access modifiers changed from: package-private */
        public final boolean getMin(Method method) {
            return method.isDefault();
        }

        /* access modifiers changed from: package-private */
        public final Object getMin(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) throws Throwable {
            Constructor<MethodHandles.Lookup> declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new Object[]{cls, -1}).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }
    }

    static class getMax extends getProcessInfo {
        getMax() {
        }

        public final Executor getMin() {
            return new getMin();
        }

        /* access modifiers changed from: package-private */
        public final LogContextImpl.AppendWorker.setMin getMin(@Nullable Executor executor) {
            if (executor != null) {
                return new registerMasLog(executor);
            }
            throw new AssertionError();
        }

        static class getMin implements Executor {
            private final Handler getMax = new Handler(Looper.getMainLooper());

            getMin() {
            }

            public final void execute(Runnable runnable) {
                this.getMax.post(runnable);
            }
        }
    }
}
