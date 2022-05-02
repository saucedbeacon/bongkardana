package o;

import android.os.Handler;
import android.os.Process;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class AlertController$RecycleListView {
    static <T> T setMax(@NonNull ExecutorService executorService, @NonNull Callable<T> callable, @IntRange(from = 0) int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get((long) i, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e2) {
            throw e2;
        } catch (TimeoutException unused) {
            throw new InterruptedException(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT);
        }
    }

    static class getMin<T> implements Runnable {
        @NonNull
        private setIcon<T> getMin;
        @NonNull
        private Callable<T> length;
        @NonNull
        private Handler setMax;

        getMin(@NonNull Handler handler, @NonNull Callable<T> callable, @NonNull setIcon<T> seticon) {
            this.length = callable;
            this.getMin = seticon;
            this.setMax = handler;
        }

        public final void run() {
            final T t;
            try {
                t = this.length.call();
            } catch (Exception unused) {
                t = null;
            }
            final setIcon<T> seticon = this.getMin;
            this.setMax.post(new Runnable() {
                public final void run() {
                    seticon.getMax(t);
                }
            });
        }
    }

    static class getMax implements ThreadFactory {
        private int getMin = 10;
        private String setMin;

        getMax(@NonNull String str) {
            this.setMin = str;
        }

        public final Thread newThread(Runnable runnable) {
            return new length(runnable, this.setMin, this.getMin);
        }

        static class length extends Thread {
            private final int setMax;

            length(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.setMax = i;
            }

            public final void run() {
                Process.setThreadPriority(this.setMax);
                super.run();
            }
        }
    }
}
