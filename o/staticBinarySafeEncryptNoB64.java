package o;

import androidx.annotation.NonNull;
import com.google.common.base.Preconditions;
import io.split.android.client.events.SplitInternalEvent;
import io.split.android.client.service.executor.SplitTaskExecutionListener;
import io.split.android.client.service.executor.SplitTaskExecutionStatus;

class staticBinarySafeEncryptNoB64 implements SplitTaskExecutionListener {
    private final SplitInternalEvent mEventToFire;
    private final setNick mSplitEventsManager;

    public staticBinarySafeEncryptNoB64(setNick setnick, SplitInternalEvent splitInternalEvent) {
        this.mSplitEventsManager = (setNick) Preconditions.checkNotNull(setnick);
        this.mEventToFire = (SplitInternalEvent) Preconditions.checkNotNull(splitInternalEvent);
    }

    public void taskExecuted(@NonNull loadLibrarySync loadlibrarysync) {
        if (loadlibrarysync.getStatus().equals(SplitTaskExecutionStatus.SUCCESS)) {
            this.mSplitEventsManager.notifyInternalEvent(this.mEventToFire);
        }
    }
}
