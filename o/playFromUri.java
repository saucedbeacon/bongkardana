package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class playFromUri extends previous {
    private final Object getMax = new Object();
    private final ExecutorService getMin = Executors.newFixedThreadPool(4, new ThreadFactory() {
        private final AtomicInteger length = new AtomicInteger(0);

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.length.getAndIncrement())}));
            return thread;
        }
    });
    @Nullable
    private volatile Handler setMin;

    public final void getMin(Runnable runnable) {
        this.getMin.execute(runnable);
    }

    public final void setMax(Runnable runnable) {
        if (this.setMin == null) {
            synchronized (this.getMax) {
                if (this.setMin == null) {
                    this.setMin = length(Looper.getMainLooper());
                }
            }
        }
        this.setMin.post(runnable);
    }

    public final boolean getMin() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    private static Handler length(@NonNull Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            Class<Handler> cls = Handler.class;
            try {
                return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            } catch (InvocationTargetException unused2) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }
}
