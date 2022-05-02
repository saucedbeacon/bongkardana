package o;

import io.split.android.client.dtos.SplitChange;
import io.split.android.client.service.executor.SplitTaskType;
import io.split.android.client.service.http.HttpFetcher;
import io.split.android.client.service.http.HttpFetcherException;
import io.split.android.client.storage.splits.SplitsStorage;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

public class IOpenSDKComponent {
    private final noCaptchaForwardAuth mSplitChangeProcessor;
    private final HttpFetcher<SplitChange> mSplitFetcher;
    private final SplitsStorage mSplitsStorage;

    /* JADX WARNING: type inference failed for: r1v0, types: [io.split.android.client.service.http.HttpFetcher<io.split.android.client.dtos.SplitChange>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IOpenSDKComponent(io.split.android.client.service.http.HttpFetcher<io.split.android.client.dtos.SplitChange> r1, io.split.android.client.storage.splits.SplitsStorage r2, o.noCaptchaForwardAuth r3) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            io.split.android.client.service.http.HttpFetcher r1 = (io.split.android.client.service.http.HttpFetcher) r1
            r0.mSplitFetcher = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
            io.split.android.client.storage.splits.SplitsStorage r1 = (io.split.android.client.storage.splits.SplitsStorage) r1
            r0.mSplitsStorage = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r3)
            o.noCaptchaForwardAuth r1 = (o.noCaptchaForwardAuth) r1
            r0.mSplitChangeProcessor = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.IOpenSDKComponent.<init>(io.split.android.client.service.http.HttpFetcher, io.split.android.client.storage.splits.SplitsStorage, o.noCaptchaForwardAuth):void");
    }

    public loadLibrarySync sync(Map<String, Object> map, boolean z, boolean z2) {
        try {
            SplitChange execute = this.mSplitFetcher.execute(map, getHeaders(z2));
            if (z) {
                this.mSplitsStorage.clear();
            }
            this.mSplitsStorage.update(this.mSplitChangeProcessor.process(execute));
            createLoadingDialog.d("Features have been updated");
            return loadLibrarySync.success(SplitTaskType.SPLITS_SYNC);
        } catch (HttpFetcherException e) {
            StringBuilder sb = new StringBuilder("Newtwork error while fetching splits");
            sb.append(e.getLocalizedMessage());
            logError(sb.toString());
            return loadLibrarySync.error(SplitTaskType.SPLITS_SYNC);
        } catch (Exception e2) {
            StringBuilder sb2 = new StringBuilder("Unexpected while fetching splits");
            sb2.append(e2.getLocalizedMessage());
            logError(sb2.toString());
            return loadLibrarySync.error(SplitTaskType.SPLITS_SYNC);
        }
    }

    private long now() {
        return System.currentTimeMillis() / 1000;
    }

    public boolean cacheHasExpired(long j, long j2, long j3) {
        return j > -1 && j2 > 0 && now() - j2 > j3;
    }

    private void logError(String str) {
        createLoadingDialog.e("Error while executing splits sync/update task: ".concat(String.valueOf(str)));
    }

    @Nullable
    private Map<String, String> getHeaders(boolean z) {
        if (z) {
            return putByteArrayDDpEx.noCacheHeaders();
        }
        return null;
    }
}
