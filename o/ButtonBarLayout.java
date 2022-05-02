package o;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ButtonBarLayout {
    private static final String setMin = setSupportBackgroundTintList.length("WorkTimer");
    public final ScheduledExecutorService getMax = Executors.newSingleThreadScheduledExecutor(this.toIntRange);
    public final Map<String, getMax> getMin = new HashMap();
    public final Map<String, setMin> length = new HashMap();
    public final Object setMax = new Object();
    private final ThreadFactory toIntRange = new ThreadFactory() {
        private int length = 0;

        public final Thread newThread(@NonNull Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            StringBuilder sb = new StringBuilder("WorkManager-WorkTimer-thread-");
            sb.append(this.length);
            newThread.setName(sb.toString());
            this.length++;
            return newThread;
        }
    };

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface setMin {
        void getMax(@NonNull String str);
    }

    public final void setMax(@NonNull String str) {
        synchronized (this.setMax) {
            if (this.getMin.remove(str) != null) {
                setSupportBackgroundTintList.getMax();
                this.length.remove(str);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class getMax implements Runnable {
        private final ButtonBarLayout getMax;
        private final String getMin;

        public getMax(@NonNull ButtonBarLayout buttonBarLayout, @NonNull String str) {
            this.getMax = buttonBarLayout;
            this.getMin = str;
        }

        public final void run() {
            synchronized (this.getMax.setMax) {
                if (this.getMax.getMin.remove(this.getMin) != null) {
                    setMin remove = this.getMax.length.remove(this.getMin);
                    if (remove != null) {
                        remove.getMax(this.getMin);
                    }
                } else {
                    setSupportBackgroundTintList.getMax();
                }
            }
        }
    }
}
