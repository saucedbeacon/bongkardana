package o;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.Closeable;
import java.lang.Thread;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.b;

public class removeBoolean implements b.a, Closeable {
    private final b.a _delegate;
    private final ExecutorService _executorService;
    private volatile boolean isPaused = false;

    public static removeBoolean instance(b.a aVar, int i, int i2) {
        ThreadFactoryBuilder threadFactoryBuilder = new ThreadFactoryBuilder();
        threadFactoryBuilder.setDaemon(true);
        threadFactoryBuilder.setNameFormat("split-fireAndForgetMetrics-%d");
        threadFactoryBuilder.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            public final void uncaughtException(Thread thread, Throwable th) {
                createLoadingDialog.e(th, "Error in thread: %s", thread.getName());
            }
        });
        return new removeBoolean(aVar, new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(i2), threadFactoryBuilder.build(), new ThreadPoolExecutor.DiscardPolicy()));
    }

    private removeBoolean(b.a aVar, ExecutorService executorService) {
        this._delegate = aVar;
        this._executorService = executorService;
    }

    public void count(String str, long j) {
        try {
            this._executorService.submit(new length(this._delegate, str, j));
        } catch (Throwable th) {
            createLoadingDialog.w(th, "CountRunnable failed", new Object[0]);
        }
    }

    public void time(String str, long j) {
        try {
            this._executorService.submit(new setMin(this._delegate, str, j));
        } catch (Throwable th) {
            createLoadingDialog.w(th, "TimeRunnable failed", new Object[0]);
        }
    }

    public void close() {
        this._executorService.shutdown();
        try {
            if (!this._executorService.awaitTermination(10, TimeUnit.SECONDS)) {
                createLoadingDialog.w("Executor did not terminate in the specified time.");
                createLoadingDialog.w("Executor was abruptly shut down. These tasks will not be executed: %s", this._executorService.shutdownNow());
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    static final class length implements Runnable {
        private final b.a _delegate;
        private final long _delta;
        private final String _name;

        length(b.a aVar, String str, long j) {
            this._delegate = aVar;
            this._name = str;
            this._delta = j;
        }

        public final void run() {
            this._delegate.count(this._name, this._delta);
        }
    }

    static final class setMin implements Runnable {
        private final b.a _delegate;
        private final String _name;
        private final long _timeInMs;

        setMin(b.a aVar, String str, long j) {
            this._delegate = aVar;
            this._name = str;
            this._timeInMs = j;
        }

        public final void run() {
            this._delegate.time(this._name, this._timeInMs);
        }
    }
}
