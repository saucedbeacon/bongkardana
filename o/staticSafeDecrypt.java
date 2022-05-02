package o;

import androidx.annotation.NonNull;
import com.google.gson.internal.C$Gson$Preconditions;
import io.split.android.client.service.executor.SplitTask;
import io.split.android.client.service.executor.SplitTaskExecutionListener;
import io.split.android.client.service.executor.SplitTaskExecutor;
import io.split.android.client.service.executor.SplitTaskType;
import io.split.android.client.service.sseclient.feedbackchannel.PushStatusEvent;

public class staticSafeDecrypt implements SplitTaskExecutionListener {
    private static final int RECONNECT_TIME_BEFORE_TOKEN_EXP_IN_SECONDS = 600;
    ISecureSignatureComponent mBroadcasterChannel;
    SplitTaskExecutor mTaskExecutor;
    String mTaskId;

    public staticSafeDecrypt(@NonNull SplitTaskExecutor splitTaskExecutor, @NonNull ISecureSignatureComponent iSecureSignatureComponent) {
        this.mTaskExecutor = (SplitTaskExecutor) C$Gson$Preconditions.checkNotNull(splitTaskExecutor);
        this.mBroadcasterChannel = (ISecureSignatureComponent) C$Gson$Preconditions.checkNotNull(iSecureSignatureComponent);
    }

    public void cancel() {
        this.mTaskExecutor.stopTask(this.mTaskId);
    }

    public void schedule(long j, long j2) {
        cancel();
        this.mTaskId = this.mTaskExecutor.schedule(new SplitTask() {
            @NonNull
            public final loadLibrarySync execute() {
                createLoadingDialog.d("Informing sse token expired throught pushing retryable error.");
                staticSafeDecrypt.this.mBroadcasterChannel.pushMessage(new PushStatusEvent(PushStatusEvent.EventType.PUSH_RETRYABLE_ERROR));
                return loadLibrarySync.success(SplitTaskType.GENERIC_TASK);
            }
        }, reconnectTime(j, j2), (SplitTaskExecutionListener) null);
    }

    private long reconnectTime(long j, long j2) {
        return Math.max((j2 - j) - 600, 0);
    }

    public void taskExecuted(@NonNull loadLibrarySync loadlibrarysync) {
        this.mTaskId = null;
    }
}
