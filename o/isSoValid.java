package o;

import androidx.annotation.NonNull;
import com.google.common.collect.Lists;
import io.split.android.client.dtos.Event;
import io.split.android.client.service.executor.SplitTask;
import io.split.android.client.service.executor.SplitTaskExecutionStatus;
import io.split.android.client.service.executor.SplitTaskType;
import io.split.android.client.service.http.HttpRecorder;
import io.split.android.client.service.http.HttpRecorderException;
import io.split.android.client.storage.events.PersistentEventsStorage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.IInitializeComponent;

public class isSoValid implements SplitTask {
    public static final int FAILING_CHUNK_SIZE = 20;
    private final IInitializeComponent.IInitFinishListener mConfig;
    private final HttpRecorder<List<Event>> mHttpRecorder;
    private final PersistentEventsStorage mPersistenEventsStorage;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, io.split.android.client.service.http.HttpRecorder<java.util.List<io.split.android.client.dtos.Event>>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public isSoValid(@androidx.annotation.NonNull io.split.android.client.service.http.HttpRecorder<java.util.List<io.split.android.client.dtos.Event>> r1, @androidx.annotation.NonNull io.split.android.client.storage.events.PersistentEventsStorage r2, @androidx.annotation.NonNull o.IInitializeComponent.IInitFinishListener r3) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            io.split.android.client.service.http.HttpRecorder r1 = (io.split.android.client.service.http.HttpRecorder) r1
            r0.mHttpRecorder = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
            io.split.android.client.storage.events.PersistentEventsStorage r1 = (io.split.android.client.storage.events.PersistentEventsStorage) r1
            r0.mPersistenEventsStorage = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r3)
            o.IInitializeComponent$IInitFinishListener r1 = (o.IInitializeComponent.IInitFinishListener) r1
            r0.mConfig = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isSoValid.<init>(io.split.android.client.service.http.HttpRecorder, io.split.android.client.storage.events.PersistentEventsStorage, o.IInitializeComponent$IInitFinishListener):void");
    }

    @NonNull
    public loadLibrarySync execute() {
        List<Event> pop;
        SplitTaskExecutionStatus splitTaskExecutionStatus = SplitTaskExecutionStatus.SUCCESS;
        ArrayList arrayList = new ArrayList();
        long j = 0;
        int i = 0;
        do {
            pop = this.mPersistenEventsStorage.pop(this.mConfig.getEventsPerPush());
            if (pop.size() > 0) {
                try {
                    createLoadingDialog.d("Posting %d Split events", Integer.valueOf(pop.size()));
                    this.mHttpRecorder.execute(pop);
                    this.mPersistenEventsStorage.delete(pop);
                    createLoadingDialog.d("%d split events sent", Integer.valueOf(pop.size()));
                } catch (HttpRecorderException e) {
                    SplitTaskExecutionStatus splitTaskExecutionStatus2 = SplitTaskExecutionStatus.ERROR;
                    i += this.mConfig.getEventsPerPush();
                    j += sumEventBytes(pop);
                    StringBuilder sb = new StringBuilder("Event recorder task: Some events couldn't be sentSaving to send them in a new iteration: ");
                    sb.append(e.getLocalizedMessage());
                    createLoadingDialog.e(sb.toString());
                    arrayList.addAll(pop);
                    splitTaskExecutionStatus = splitTaskExecutionStatus2;
                }
            }
        } while (pop.size() == this.mConfig.getEventsPerPush());
        for (List active : Lists.partition(arrayList, 20)) {
            this.mPersistenEventsStorage.setActive(active);
        }
        if (splitTaskExecutionStatus != SplitTaskExecutionStatus.ERROR) {
            return loadLibrarySync.success(SplitTaskType.EVENTS_RECORDER);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(loadLibrarySync.NON_SENT_RECORDS, Integer.valueOf(i));
        hashMap.put(loadLibrarySync.NON_SENT_BYTES, Long.valueOf(j));
        return loadLibrarySync.error(SplitTaskType.EVENTS_RECORDER, hashMap);
    }

    private long sumEventBytes(List<Event> list) {
        long j = 0;
        for (Event sizeInBytes : list) {
            j += sizeInBytes.getSizeInBytes();
        }
        return j;
    }
}
