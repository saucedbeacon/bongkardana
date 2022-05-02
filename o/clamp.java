package o;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

public final class clamp {
    private static final Executor getMax = new Executor() {
        public final void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    };
    private static final Executor setMax = new Executor() {
        private final Handler setMax = new Handler(Looper.getMainLooper());

        public final void execute(@NonNull Runnable runnable) {
            this.setMax.post(runnable);
        }
    };

    public static Executor setMax() {
        return setMax;
    }

    public static Executor setMin() {
        return getMax;
    }
}
