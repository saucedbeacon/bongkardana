package o;

import androidx.annotation.NonNull;
import com.google.common.base.Preconditions;
import io.split.android.client.service.executor.SplitTask;
import io.split.android.client.service.executor.SplitTaskType;
import io.split.android.client.storage.splits.SplitsStorage;

public class INoCaptchaComponent implements SplitTask {
    private final SplitsStorage mSplitsStorage;

    public INoCaptchaComponent(SplitsStorage splitsStorage) {
        this.mSplitsStorage = (SplitsStorage) Preconditions.checkNotNull(splitsStorage);
    }

    @NonNull
    public loadLibrarySync execute() {
        this.mSplitsStorage.loadLocal();
        if (this.mSplitsStorage.getTill() > -1) {
            return loadLibrarySync.success(SplitTaskType.LOAD_LOCAL_SPLITS);
        }
        return loadLibrarySync.error(SplitTaskType.LOAD_LOCAL_SPLITS);
    }
}
