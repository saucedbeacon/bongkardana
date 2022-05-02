package o;

import androidx.annotation.NonNull;
import io.split.android.client.dtos.MySegment;
import io.split.android.client.events.SplitInternalEvent;
import io.split.android.client.service.executor.SplitTask;
import io.split.android.client.service.executor.SplitTaskType;
import io.split.android.client.service.http.HttpFetcher;
import io.split.android.client.service.http.HttpFetcherException;
import io.split.android.client.storage.mysegments.MySegmentsStorage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

public class initNoCaptcha implements SplitTask {
    private final boolean mAvoidCache;
    private final setNick mEventsManager;
    private staticSafeEncrypt mMySegmentsChangeChecker = new staticSafeEncrypt();
    private final HttpFetcher<List<MySegment>> mMySegmentsFetcher;
    private final MySegmentsStorage mMySegmentsStorage;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, io.split.android.client.service.http.HttpFetcher<java.util.List<io.split.android.client.dtos.MySegment>>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public initNoCaptcha(@androidx.annotation.NonNull io.split.android.client.service.http.HttpFetcher<java.util.List<io.split.android.client.dtos.MySegment>> r1, @androidx.annotation.NonNull io.split.android.client.storage.mysegments.MySegmentsStorage r2, boolean r3, o.setNick r4) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            io.split.android.client.service.http.HttpFetcher r1 = (io.split.android.client.service.http.HttpFetcher) r1
            r0.mMySegmentsFetcher = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
            io.split.android.client.storage.mysegments.MySegmentsStorage r1 = (io.split.android.client.storage.mysegments.MySegmentsStorage) r1
            r0.mMySegmentsStorage = r1
            r0.mAvoidCache = r3
            r0.mEventsManager = r4
            o.staticSafeEncrypt r1 = new o.staticSafeEncrypt
            r1.<init>()
            r0.mMySegmentsChangeChecker = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.initNoCaptcha.<init>(io.split.android.client.service.http.HttpFetcher, io.split.android.client.storage.mysegments.MySegmentsStorage, boolean, o.setNick):void");
    }

    @NonNull
    public loadLibrarySync execute() {
        try {
            ArrayList arrayList = new ArrayList(this.mMySegmentsStorage.getAll());
            List<String> nameList = getNameList(this.mMySegmentsFetcher.execute(new HashMap(), getHeaders()));
            this.mMySegmentsStorage.set(nameList);
            fireMySegmentsUpdatedIfNeeded(arrayList, nameList);
            createLoadingDialog.d("My Segments have been updated");
            return loadLibrarySync.success(SplitTaskType.MY_SEGMENTS_SYNC);
        } catch (HttpFetcherException e) {
            StringBuilder sb = new StringBuilder("Network error while retrieving my segments: ");
            sb.append(e.getLocalizedMessage());
            logError(sb.toString());
            return loadLibrarySync.error(SplitTaskType.MY_SEGMENTS_SYNC);
        } catch (Exception e2) {
            StringBuilder sb2 = new StringBuilder("Unknown error while retrieving my segments: ");
            sb2.append(e2.getLocalizedMessage());
            logError(sb2.toString());
            return loadLibrarySync.error(SplitTaskType.MY_SEGMENTS_SYNC);
        }
    }

    private void logError(String str) {
        createLoadingDialog.e("Error while executing my segments sync task: ".concat(String.valueOf(str)));
    }

    private List<String> getNameList(List<MySegment> list) {
        ArrayList arrayList = new ArrayList();
        for (MySegment mySegment : list) {
            arrayList.add(mySegment.name);
        }
        return arrayList;
    }

    @Nullable
    private Map<String, String> getHeaders() {
        if (this.mAvoidCache) {
            return putByteArrayDDpEx.noCacheHeaders();
        }
        return null;
    }

    private void fireMySegmentsUpdatedIfNeeded(List<String> list, List<String> list2) {
        setNick setnick = this.mEventsManager;
        if (setnick != null) {
            setnick.notifyInternalEvent(getInternalEvent(list, list2));
        }
    }

    private SplitInternalEvent getInternalEvent(List<String> list, List<String> list2) {
        if (this.mMySegmentsChangeChecker.mySegmentsHaveChanged(list, list2)) {
            return SplitInternalEvent.MY_SEGMENTS_UPDATED;
        }
        return SplitInternalEvent.MY_SEGMENTS_FETCHED;
    }
}
