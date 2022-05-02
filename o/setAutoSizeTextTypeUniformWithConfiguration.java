package o;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

public abstract class setAutoSizeTextTypeUniformWithConfiguration {
    private static final String getMax = setSupportBackgroundTintList.length("WorkerFactory");

    @Nullable
    public abstract ListenableWorker getMax(@NonNull Context context, @NonNull String str, @NonNull WorkerParameters workerParameters);

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final ListenableWorker length(@NonNull Context context, @NonNull String str, @NonNull WorkerParameters workerParameters) {
        ListenableWorker max = getMax(context, str, workerParameters);
        if (max == null) {
            Class<? extends U> cls = null;
            try {
                cls = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable unused) {
                setSupportBackgroundTintList.getMax();
            }
            if (cls != null) {
                try {
                    max = (ListenableWorker) cls.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
                } catch (Throwable unused2) {
                    setSupportBackgroundTintList.getMax();
                }
            }
        }
        if (max == null || !max.isUsed()) {
            return max;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", new Object[]{getClass().getName(), str}));
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static setAutoSizeTextTypeUniformWithConfiguration getMin() {
        return new setAutoSizeTextTypeUniformWithConfiguration() {
            @Nullable
            public final ListenableWorker getMax(@NonNull Context context, @NonNull String str, @NonNull WorkerParameters workerParameters) {
                return null;
            }
        };
    }
}
