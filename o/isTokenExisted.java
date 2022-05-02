package o;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.common.base.Preconditions;
import io.split.android.client.events.SplitInternalEvent;
import io.split.android.client.service.executor.SplitTask;
import io.split.android.client.service.executor.SplitTaskExecutionStatus;
import io.split.android.client.service.executor.SplitTaskType;
import io.split.android.client.storage.splits.SplitsStorage;
import java.util.HashMap;

public class isTokenExisted implements SplitTask {
    static final String SINCE_PARAM = "since";
    private staticBinarySafeDecrypt mChangeChecker = new staticBinarySafeDecrypt();
    private Long mChangeNumber;
    private final setNick mEventsManager;
    private final SplitsStorage mSplitsStorage;
    private final IOpenSDKComponent mSplitsSyncHelper;

    public isTokenExisted(IOpenSDKComponent iOpenSDKComponent, SplitsStorage splitsStorage, long j, setNick setnick) {
        this.mSplitsStorage = (SplitsStorage) Preconditions.checkNotNull(splitsStorage);
        this.mSplitsSyncHelper = (IOpenSDKComponent) Preconditions.checkNotNull(iOpenSDKComponent);
        this.mChangeNumber = Long.valueOf(j);
        this.mEventsManager = (setNick) Preconditions.checkNotNull(setnick);
    }

    @NonNull
    public loadLibrarySync execute() {
        Long l = this.mChangeNumber;
        if (l == null || l.longValue() == 0) {
            StringBuilder sb = new StringBuilder("Could not update split. Invalid change number ");
            sb.append(this.mChangeNumber);
            createLoadingDialog.e(sb.toString());
            return loadLibrarySync.error(SplitTaskType.SPLITS_SYNC);
        }
        long till = this.mSplitsStorage.getTill();
        if (this.mChangeNumber.longValue() <= till) {
            createLoadingDialog.d("Received change number is previous than stored one. Avoiding update.");
            return loadLibrarySync.success(SplitTaskType.SPLITS_SYNC);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(SINCE_PARAM, Long.valueOf(till));
        loadLibrarySync sync = this.mSplitsSyncHelper.sync(hashMap, false, true);
        if (sync.getStatus() == SplitTaskExecutionStatus.SUCCESS) {
            SplitInternalEvent splitInternalEvent = SplitInternalEvent.SPLITS_FETCHED;
            if (this.mChangeChecker.splitsHaveChanged(till, this.mSplitsStorage.getTill())) {
                splitInternalEvent = SplitInternalEvent.SPLITS_UPDATED;
            }
            this.mEventsManager.notifyInternalEvent(splitInternalEvent);
        }
        return sync;
    }

    @VisibleForTesting
    public void setChangeChecker(staticBinarySafeDecrypt staticbinarysafedecrypt) {
        this.mChangeChecker = staticbinarysafedecrypt;
    }
}
