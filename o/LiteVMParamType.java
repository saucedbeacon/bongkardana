package o;

import androidx.annotation.NonNull;
import com.google.common.base.Preconditions;
import io.split.android.client.service.executor.SplitTask;
import io.split.android.client.service.executor.SplitTaskType;
import io.split.android.client.storage.impressions.PersistentImpressionsCountStorage;
import io.split.android.client.storage.mysegments.MySegmentsStorage;
import java.util.List;

public class LiteVMParamType implements SplitTask {
    private final List<reloadLiteVMInstance> mCounts;
    private final PersistentImpressionsCountStorage mCountsStorage;

    public class PARAM_TYPE implements SplitTask {
        private final MySegmentsStorage mMySegmentsStorage;

        public PARAM_TYPE(@NonNull MySegmentsStorage mySegmentsStorage) {
            this.mMySegmentsStorage = (MySegmentsStorage) Preconditions.checkNotNull(mySegmentsStorage);
        }

        @NonNull
        public loadLibrarySync execute() {
            this.mMySegmentsStorage.loadLocal();
            return loadLibrarySync.success(SplitTaskType.LOAD_LOCAL_MY_SYGMENTS);
        }
    }

    public LiteVMParamType(@NonNull PersistentImpressionsCountStorage persistentImpressionsCountStorage, @NonNull List<reloadLiteVMInstance> list) {
        this.mCountsStorage = (PersistentImpressionsCountStorage) Preconditions.checkNotNull(persistentImpressionsCountStorage);
        this.mCounts = (List) Preconditions.checkNotNull(list);
    }

    @NonNull
    public loadLibrarySync execute() {
        this.mCountsStorage.pushMany(this.mCounts);
        return loadLibrarySync.success(SplitTaskType.SAVE_IMPRESSIONS_COUNT);
    }
}
