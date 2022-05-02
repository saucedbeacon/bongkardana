package o;

import androidx.annotation.NonNull;
import com.google.gson.internal.C$Gson$Preconditions;
import io.split.android.client.service.executor.SplitTask;
import io.split.android.client.service.executor.SplitTaskExecutionListener;
import io.split.android.client.service.executor.SplitTaskExecutor;

public class enterRiskScene implements SplitTaskExecutionListener {
    private ISafeTokenComponent mBackoffCounter;
    private SplitTask mTask;
    private SplitTaskExecutor mTaskExecutor;
    String mTaskId;

    public enterRiskScene(@NonNull SplitTaskExecutor splitTaskExecutor, @NonNull ISafeTokenComponent iSafeTokenComponent) {
        this.mTaskExecutor = (SplitTaskExecutor) C$Gson$Preconditions.checkNotNull(splitTaskExecutor);
        this.mBackoffCounter = (ISafeTokenComponent) C$Gson$Preconditions.checkNotNull(iSafeTokenComponent);
    }

    public void setTask(@NonNull SplitTask splitTask) {
        this.mTask = (SplitTask) C$Gson$Preconditions.checkNotNull(splitTask);
    }

    public void cancel() {
        if (this.mTask != null) {
            this.mBackoffCounter.resetCounter();
            this.mTaskExecutor.stopTask(this.mTaskId);
            this.mTaskId = null;
        }
    }

    public void schedule() {
        if (this.mTask != null && this.mTaskId == null) {
            long nextRetryTime = this.mBackoffCounter.getNextRetryTime();
            createLoadingDialog.d(String.format("Retrying reconnection in %d seconds", new Object[]{Long.valueOf(nextRetryTime)}));
            this.mTaskId = this.mTaskExecutor.schedule(this.mTask, nextRetryTime, this);
        }
    }

    public void taskExecuted(@NonNull loadLibrarySync loadlibrarysync) {
        this.mTaskId = null;
    }
}
