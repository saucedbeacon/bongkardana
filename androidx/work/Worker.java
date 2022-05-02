package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.work.ListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;
import o.setAttachListener;

public abstract class Worker extends ListenableWorker {
    setAttachListener<ListenableWorker.setMax> mFuture;

    @WorkerThread
    @NonNull
    public abstract ListenableWorker.setMax doWork();

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public Worker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @NonNull
    public final ListenableFuture<ListenableWorker.setMax> startWork() {
        this.mFuture = setAttachListener.length();
        getBackgroundExecutor().execute(new Runnable() {
            public final void run() {
                try {
                    Worker.this.mFuture.getMax(Worker.this.doWork());
                } catch (Throwable th) {
                    Worker.this.mFuture.getMin(th);
                }
            }
        });
        return this.mFuture;
    }
}
