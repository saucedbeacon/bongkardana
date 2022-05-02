package o;

import androidx.annotation.NonNull;
import com.google.gson.internal.C$Gson$Preconditions;
import io.split.android.client.service.executor.SplitTask;
import io.split.android.client.service.executor.SplitTaskExecutionListener;
import io.split.android.client.service.executor.SplitTaskExecutor;

public class leaveRiskScene implements SplitTaskExecutionListener {
    private static final int DISCONNECT_ON_BG_TIME_IN_SECONDS = 60;
    SplitTaskExecutor mTaskExecutor;
    String mTaskId;

    public leaveRiskScene(@NonNull SplitTaskExecutor splitTaskExecutor) {
        this.mTaskExecutor = (SplitTaskExecutor) C$Gson$Preconditions.checkNotNull(splitTaskExecutor);
    }

    public void cancel() {
        this.mTaskExecutor.stopTask(this.mTaskId);
    }

    public void schedule(SplitTask splitTask) {
        cancel();
        this.mTaskId = this.mTaskExecutor.schedule(splitTask, 60, this);
    }

    public void taskExecuted(@NonNull loadLibrarySync loadlibrarysync) {
        this.mTaskId = null;
    }
}
