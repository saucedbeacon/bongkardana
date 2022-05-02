package o;

import androidx.annotation.NonNull;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;

@Singleton
public final class toggleAllChecked implements appxLoadFailed {
    private final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), new getMin((byte) 0));

    public final void execute(@NonNull Runnable runnable) {
        this.threadPoolExecutor.execute(runnable);
    }

    static class getMin implements ThreadFactory {
        private int setMax;

        private getMin() {
            this.setMax = 0;
        }

        /* synthetic */ getMin(byte b) {
            this();
        }

        public final Thread newThread(@NonNull Runnable runnable) {
            StringBuilder sb = new StringBuilder("android_");
            int i = this.setMax;
            this.setMax = i + 1;
            sb.append(i);
            return new Thread(runnable, sb.toString());
        }
    }
}
