package o;

import androidx.annotation.NonNull;
import io.split.android.client.service.executor.SplitTask;
import io.split.android.client.service.executor.SplitTaskExecutionStatus;
import io.split.android.client.service.executor.SplitTaskType;
import io.split.android.client.service.http.HttpRecorder;
import io.split.android.client.service.http.HttpRecorderException;
import io.split.android.client.storage.impressions.PersistentImpressionsCountStorage;
import java.util.ArrayList;
import java.util.List;

public class destroyLiteVMInstance implements SplitTask {
    private static int POP_COUNT = 200;
    private final HttpRecorder<callLiteVMStringMethod> mHttpRecorder;
    private final PersistentImpressionsCountStorage mPersistentStorage;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, io.split.android.client.service.http.HttpRecorder<o.callLiteVMStringMethod>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public destroyLiteVMInstance(@androidx.annotation.NonNull io.split.android.client.service.http.HttpRecorder<o.callLiteVMStringMethod> r1, @androidx.annotation.NonNull io.split.android.client.storage.impressions.PersistentImpressionsCountStorage r2) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            io.split.android.client.service.http.HttpRecorder r1 = (io.split.android.client.service.http.HttpRecorder) r1
            r0.mHttpRecorder = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
            io.split.android.client.storage.impressions.PersistentImpressionsCountStorage r1 = (io.split.android.client.storage.impressions.PersistentImpressionsCountStorage) r1
            r0.mPersistentStorage = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.destroyLiteVMInstance.<init>(io.split.android.client.service.http.HttpRecorder, io.split.android.client.storage.impressions.PersistentImpressionsCountStorage):void");
    }

    @NonNull
    public loadLibrarySync execute() {
        List<reloadLiteVMInstance> pop;
        SplitTaskExecutionStatus splitTaskExecutionStatus = SplitTaskExecutionStatus.SUCCESS;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        do {
            pop = this.mPersistentStorage.pop(POP_COUNT);
            if (pop.size() > 0) {
                try {
                    createLoadingDialog.d("Posting %d Split impressions count", Integer.valueOf(pop.size()));
                    this.mHttpRecorder.execute(new callLiteVMStringMethod(pop));
                    this.mPersistentStorage.delete(pop);
                    createLoadingDialog.d("%d split impressions count sent", Integer.valueOf(pop.size()));
                } catch (HttpRecorderException e) {
                    SplitTaskExecutionStatus splitTaskExecutionStatus2 = SplitTaskExecutionStatus.ERROR;
                    StringBuilder sb = new StringBuilder("Impressions count recorder task: Some counts couldn't be sent.Saving to send them in a new iteration");
                    sb.append(e.getLocalizedMessage());
                    createLoadingDialog.e(sb.toString());
                    arrayList.addAll(pop);
                    splitTaskExecutionStatus = splitTaskExecutionStatus2;
                }
            }
        } while (pop.size() == POP_COUNT);
        if (arrayList.size() > 0) {
            this.mPersistentStorage.setActive(arrayList);
        }
        if (splitTaskExecutionStatus == SplitTaskExecutionStatus.ERROR) {
            return loadLibrarySync.error(SplitTaskType.IMPRESSIONS_COUNT_RECORDER);
        }
        return loadLibrarySync.success(SplitTaskType.IMPRESSIONS_COUNT_RECORDER);
    }
}
