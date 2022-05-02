package o;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class dispatchFitSystemWindows implements getMinWidthMinor {
    private final setCompoundDrawablesRelative getMin;
    private final Executor length = new Executor() {
        public final void execute(@NonNull Runnable runnable) {
            dispatchFitSystemWindows.this.setMax.post(runnable);
        }
    };
    final Handler setMax = new Handler(Looper.getMainLooper());

    public dispatchFitSystemWindows(@NonNull Executor executor) {
        this.getMin = new setCompoundDrawablesRelative(executor);
    }

    public final Executor getMax() {
        return this.length;
    }

    public final void length(Runnable runnable) {
        this.getMin.execute(runnable);
    }

    @NonNull
    public final setCompoundDrawablesRelative getMin() {
        return this.getMin;
    }
}
