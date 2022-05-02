package o;

import androidx.annotation.NonNull;
import io.split.android.client.dtos.KeyImpression;
import io.split.android.client.service.executor.SplitTask;
import io.split.android.client.service.executor.SplitTaskExecutionStatus;
import io.split.android.client.service.executor.SplitTaskType;
import io.split.android.client.service.http.HttpRecorder;
import io.split.android.client.service.http.HttpRecorderException;
import io.split.android.client.storage.impressions.PersistentImpressionsStorage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class getBizId implements SplitTask {
    public static final int FAILING_CHUNK_SIZE = 20;
    private final callLiteVMVoidMethod mConfig;
    private final HttpRecorder<List<KeyImpression>> mHttpRecorder;
    private final PersistentImpressionsStorage mPersistenImpressionsStorage;

    /* JADX WARNING: type inference failed for: r1v0, types: [io.split.android.client.service.http.HttpRecorder<java.util.List<io.split.android.client.dtos.KeyImpression>>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public getBizId(@androidx.annotation.NonNull io.split.android.client.service.http.HttpRecorder<java.util.List<io.split.android.client.dtos.KeyImpression>> r1, @androidx.annotation.NonNull io.split.android.client.storage.impressions.PersistentImpressionsStorage r2, @androidx.annotation.NonNull o.callLiteVMVoidMethod r3) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            io.split.android.client.service.http.HttpRecorder r1 = (io.split.android.client.service.http.HttpRecorder) r1
            r0.mHttpRecorder = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
            io.split.android.client.storage.impressions.PersistentImpressionsStorage r1 = (io.split.android.client.storage.impressions.PersistentImpressionsStorage) r1
            r0.mPersistenImpressionsStorage = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r3)
            o.callLiteVMVoidMethod r1 = (o.callLiteVMVoidMethod) r1
            r0.mConfig = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getBizId.<init>(io.split.android.client.service.http.HttpRecorder, io.split.android.client.storage.impressions.PersistentImpressionsStorage, o.callLiteVMVoidMethod):void");
    }

    @NonNull
    public loadLibrarySync execute() {
        List<KeyImpression> pop;
        SplitTaskExecutionStatus splitTaskExecutionStatus = SplitTaskExecutionStatus.SUCCESS;
        ArrayList arrayList = new ArrayList();
        long j = 0;
        int i = 0;
        do {
            pop = this.mPersistenImpressionsStorage.pop(this.mConfig.getImpressionsPerPush());
            if (pop.size() > 0) {
                try {
                    createLoadingDialog.d("Posting %d Split impressions", Integer.valueOf(pop.size()));
                    this.mHttpRecorder.execute(pop);
                    this.mPersistenImpressionsStorage.delete(pop);
                    createLoadingDialog.d("%d split impressions sent", Integer.valueOf(pop.size()));
                } catch (HttpRecorderException e) {
                    SplitTaskExecutionStatus splitTaskExecutionStatus2 = SplitTaskExecutionStatus.ERROR;
                    i += this.mConfig.getImpressionsPerPush();
                    j += sumImpressionsBytes(pop);
                    StringBuilder sb = new StringBuilder("Impressions recorder task: Some impressions couldn't be sent.Saving to send them in a new iteration");
                    sb.append(e.getLocalizedMessage());
                    createLoadingDialog.e(sb.toString());
                    arrayList.addAll(pop);
                    splitTaskExecutionStatus = splitTaskExecutionStatus2;
                }
            }
        } while (pop.size() == this.mConfig.getImpressionsPerPush());
        if (arrayList.size() > 0) {
            this.mPersistenImpressionsStorage.setActive(arrayList);
        }
        if (splitTaskExecutionStatus != SplitTaskExecutionStatus.ERROR) {
            return loadLibrarySync.success(SplitTaskType.IMPRESSIONS_RECORDER);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(loadLibrarySync.NON_SENT_RECORDS, Integer.valueOf(i));
        hashMap.put(loadLibrarySync.NON_SENT_BYTES, Long.valueOf(j));
        return loadLibrarySync.error(SplitTaskType.IMPRESSIONS_RECORDER, hashMap);
    }

    private long sumImpressionsBytes(List<KeyImpression> list) {
        Iterator<KeyImpression> it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j += this.mConfig.getEstimatedSizeInBytes();
        }
        return j;
    }
}
