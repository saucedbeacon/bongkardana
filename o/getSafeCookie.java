package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.internal.C$Gson$Preconditions;
import io.split.android.client.service.executor.SplitTask;
import io.split.android.client.service.executor.SplitTaskExecutionListener;
import io.split.android.client.service.executor.SplitTaskExecutionStatus;
import io.split.android.client.service.executor.SplitTaskExecutor;

public class getSafeCookie implements SplitTaskExecutionListener {
    private SplitTaskExecutionListener mListener;
    private ISafeTokenComponent mStreamingBackoffCounter;
    private SplitTask mTask;
    private SplitTaskExecutor mTaskExecutor;
    private String mTaskId;

    public getSafeCookie(@NonNull SplitTaskExecutor splitTaskExecutor, @NonNull ISafeTokenComponent iSafeTokenComponent) {
        this.mTaskExecutor = (SplitTaskExecutor) C$Gson$Preconditions.checkNotNull(splitTaskExecutor);
        this.mStreamingBackoffCounter = (ISafeTokenComponent) C$Gson$Preconditions.checkNotNull(iSafeTokenComponent);
    }

    public synchronized void setTask(@NonNull SplitTask splitTask, @Nullable SplitTaskExecutionListener splitTaskExecutionListener) {
        this.mTask = (SplitTask) C$Gson$Preconditions.checkNotNull(splitTask);
        this.mListener = splitTaskExecutionListener;
    }

    public synchronized void stop() {
        if (this.mTask != null) {
            this.mTaskExecutor.stopTask(this.mTaskId);
            this.mTaskId = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void start() {
        /*
            r4 = this;
            monitor-enter(r4)
            io.split.android.client.service.executor.SplitTask r0 = r4.mTask     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r4.mTaskId     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x000a
            goto L_0x001d
        L_0x000a:
            o.ISafeTokenComponent r0 = r4.mStreamingBackoffCounter     // Catch:{ all -> 0x001f }
            r0.resetCounter()     // Catch:{ all -> 0x001f }
            io.split.android.client.service.executor.SplitTaskExecutor r0 = r4.mTaskExecutor     // Catch:{ all -> 0x001f }
            io.split.android.client.service.executor.SplitTask r1 = r4.mTask     // Catch:{ all -> 0x001f }
            r2 = 0
            java.lang.String r0 = r0.schedule(r1, r2, r4)     // Catch:{ all -> 0x001f }
            r4.mTaskId = r0     // Catch:{ all -> 0x001f }
            monitor-exit(r4)
            return
        L_0x001d:
            monitor-exit(r4)
            return
        L_0x001f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSafeCookie.start():void");
    }

    private synchronized void schedule() {
        if (this.mTask != null) {
            long nextRetryTime = this.mStreamingBackoffCounter.getNextRetryTime();
            createLoadingDialog.d(String.format("Retrying %s task in %d seconds", new Object[]{this.mTask.getClass().getSimpleName(), Long.valueOf(nextRetryTime)}));
            this.mTaskId = this.mTaskExecutor.schedule(this.mTask, nextRetryTime, this);
        }
    }

    public void taskExecuted(@NonNull loadLibrarySync loadlibrarysync) {
        this.mTaskId = null;
        if (loadlibrarysync.getStatus() == SplitTaskExecutionStatus.ERROR) {
            schedule();
            return;
        }
        this.mStreamingBackoffCounter.resetCounter();
        SplitTaskExecutionListener splitTaskExecutionListener = this.mListener;
        if (splitTaskExecutionListener != null) {
            splitTaskExecutionListener.taskExecuted(loadLibrarySync.success(loadlibrarysync.getTaskType()));
        }
    }
}
