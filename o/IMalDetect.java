package o;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.common.base.Preconditions;
import io.split.android.client.dtos.KeyImpression;
import io.split.android.client.dtos.TestImpressions;
import io.split.android.client.events.SplitInternalEvent;
import io.split.android.client.service.executor.SplitTask;
import io.split.android.client.service.executor.SplitTaskType;
import io.split.android.client.service.http.HttpRequestBodySerializer;
import io.split.android.client.storage.mysegments.MySegmentsStorage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class IMalDetect implements HttpRequestBodySerializer<List<KeyImpression>> {
    public final String serialize(@NonNull List<KeyImpression> list) {
        return IUMIDInitListenerEx.toJson(groupImpressions(list));
    }

    private List<TestImpressions> groupImpressions(List<KeyImpression> list) {
        HashMap hashMap = new HashMap();
        for (KeyImpression next : list) {
            List list2 = (List) hashMap.get(next.feature);
            if (list2 == null) {
                list2 = new ArrayList();
            }
            list2.add(next);
            hashMap.put(next.feature, list2);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            TestImpressions testImpressions = new TestImpressions();
            testImpressions.testName = (String) entry.getKey();
            testImpressions.keyImpressions = (List) entry.getValue();
            arrayList.add(testImpressions);
        }
        return arrayList;
    }

    public class ICallBack implements SplitTask {
        private final setNick mEventsManager;
        private final List<String> mMySegments;
        private staticSafeEncrypt mMySegmentsChangeChecker = new staticSafeEncrypt();
        private final MySegmentsStorage mMySegmentsStorage;

        public ICallBack(@NonNull MySegmentsStorage mySegmentsStorage, List<String> list, setNick setnick) {
            this.mMySegmentsStorage = (MySegmentsStorage) Preconditions.checkNotNull(mySegmentsStorage);
            this.mMySegments = list;
            this.mEventsManager = setnick;
        }

        @NonNull
        public loadLibrarySync execute() {
            try {
                if (this.mMySegments == null) {
                    logError("My segment list could not be null.");
                    return loadLibrarySync.error(SplitTaskType.MY_SEGMENTS_UPDATE);
                }
                ArrayList arrayList = new ArrayList(this.mMySegmentsStorage.getAll());
                this.mMySegmentsStorage.set(this.mMySegments);
                if (this.mMySegmentsChangeChecker.mySegmentsHaveChanged(arrayList, this.mMySegments)) {
                    this.mEventsManager.notifyInternalEvent(SplitInternalEvent.MY_SEGMENTS_UPDATED);
                }
                createLoadingDialog.d("My Segments have been updated");
                return loadLibrarySync.success(SplitTaskType.MY_SEGMENTS_UPDATE);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Unknown error while updating my segments: ");
                sb.append(e.getLocalizedMessage());
                logError(sb.toString());
                return loadLibrarySync.error(SplitTaskType.MY_SEGMENTS_UPDATE);
            }
        }

        private void logError(String str) {
            createLoadingDialog.e("Error while executing my segments update task: ".concat(String.valueOf(str)));
        }

        @VisibleForTesting
        public void setChangesChecker(staticSafeEncrypt staticsafeencrypt) {
            this.mMySegmentsChangeChecker = staticsafeencrypt;
        }
    }
}
