package o;

import androidx.annotation.NonNull;
import com.google.common.base.Preconditions;
import io.split.android.client.service.executor.SplitTask;
import io.split.android.client.service.executor.SplitTaskExecutionListener;
import io.split.android.client.service.executor.SplitTaskExecutionStatus;
import io.split.android.client.service.executor.SplitTaskExecutor;
import io.split.android.client.service.executor.SplitTaskType;
import io.split.android.client.service.synchronizer.RecorderSyncHelper;
import io.split.android.client.storage.InBytesSizable;
import io.split.android.client.storage.StoragePusher;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

class staticBinarySafeEncrypt<T extends InBytesSizable> implements RecorderSyncHelper<T> {
    private final int mMaxQueueSize;
    private final long mMaxQueueSizeInBytes;
    private AtomicInteger mPushedCount = new AtomicInteger(0);
    private final SplitTaskExecutor mSplitTaskExecutor;
    /* access modifiers changed from: private */
    public final StoragePusher mStorage;
    private final SplitTaskType mTaskType;
    private AtomicLong mTotalPushedSizeInBytes = new AtomicLong(0);

    public staticBinarySafeEncrypt(SplitTaskType splitTaskType, StoragePusher storagePusher, int i, long j, SplitTaskExecutor splitTaskExecutor) {
        this.mTaskType = (SplitTaskType) Preconditions.checkNotNull(splitTaskType);
        this.mStorage = (StoragePusher) Preconditions.checkNotNull(storagePusher);
        this.mSplitTaskExecutor = (SplitTaskExecutor) Preconditions.checkNotNull(splitTaskExecutor);
        this.mMaxQueueSize = i;
        this.mMaxQueueSizeInBytes = j;
    }

    public boolean pushAndCheckIfFlushNeeded(T t) {
        pushAsync(t);
        int addAndGet = this.mPushedCount.addAndGet(1);
        long addAndGet2 = this.mTotalPushedSizeInBytes.addAndGet(t.getSizeInBytes());
        if (addAndGet <= this.mMaxQueueSize && addAndGet2 < this.mMaxQueueSizeInBytes) {
            return false;
        }
        this.mPushedCount.set(0);
        this.mTotalPushedSizeInBytes.set(0);
        return true;
    }

    public void taskExecuted(@NonNull loadLibrarySync loadlibrarysync) {
        if (this.mTaskType.equals(loadlibrarysync.getTaskType()) && loadlibrarysync.getStatus().equals(SplitTaskExecutionStatus.ERROR)) {
            this.mPushedCount.addAndGet(loadlibrarysync.getIntegerValue(loadLibrarySync.NON_SENT_RECORDS).intValue());
            this.mTotalPushedSizeInBytes.addAndGet(loadlibrarysync.getLongValue(loadLibrarySync.NON_SENT_BYTES).longValue());
        }
    }

    private void pushAsync(final T t) {
        this.mSplitTaskExecutor.submit(new SplitTask() {
            @NonNull
            public final loadLibrarySync execute() {
                staticBinarySafeEncrypt.this.mStorage.push(t);
                return loadLibrarySync.success(SplitTaskType.GENERIC_TASK);
            }
        }, (SplitTaskExecutionListener) null);
    }
}
