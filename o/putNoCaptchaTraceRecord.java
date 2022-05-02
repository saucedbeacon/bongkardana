package o;

import androidx.annotation.NonNull;
import com.google.common.base.Preconditions;
import io.split.android.client.dtos.Split;
import io.split.android.client.events.SplitInternalEvent;
import io.split.android.client.service.executor.SplitTask;
import io.split.android.client.service.executor.SplitTaskType;
import io.split.android.client.storage.splits.SplitsStorage;

public class putNoCaptchaTraceRecord implements SplitTask {
    private final setNick mEventsManager;
    private final Split mKilledSplit;
    private final SplitsStorage mSplitsStorage;

    public putNoCaptchaTraceRecord(@NonNull SplitsStorage splitsStorage, Split split, setNick setnick) {
        this.mSplitsStorage = (SplitsStorage) Preconditions.checkNotNull(splitsStorage);
        this.mKilledSplit = split;
        this.mEventsManager = setnick;
    }

    @NonNull
    public loadLibrarySync execute() {
        try {
            if (this.mKilledSplit == null) {
                logError("Split name to kill could not be null.");
                return loadLibrarySync.error(SplitTaskType.SPLIT_KILL);
            }
            if (this.mKilledSplit.changeNumber <= this.mSplitsStorage.getTill()) {
                StringBuilder sb = new StringBuilder("Skipping killed split notification for old change number: ");
                sb.append(this.mKilledSplit.changeNumber);
                createLoadingDialog.d(sb.toString());
                return loadLibrarySync.success(SplitTaskType.SPLIT_KILL);
            }
            Split split = this.mSplitsStorage.get(this.mKilledSplit.name);
            split.killed = true;
            split.defaultTreatment = this.mKilledSplit.defaultTreatment;
            split.changeNumber = this.mKilledSplit.changeNumber;
            this.mSplitsStorage.updateWithoutChecks(split);
            this.mEventsManager.notifyInternalEvent(SplitInternalEvent.SPLIT_KILLED_NOTIFICATION);
            createLoadingDialog.d("Killed split has been updated");
            return loadLibrarySync.success(SplitTaskType.SPLIT_KILL);
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("Unknown error while updating killed split: ");
            sb2.append(e.getLocalizedMessage());
            logError(sb2.toString());
            return loadLibrarySync.error(SplitTaskType.SPLIT_KILL);
        }
    }

    private void logError(String str) {
        createLoadingDialog.e("Error while executing Split kill task: ".concat(String.valueOf(str)));
    }
}
