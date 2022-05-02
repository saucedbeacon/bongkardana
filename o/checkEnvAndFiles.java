package o;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.common.base.Preconditions;
import io.split.android.client.service.executor.SplitTask;
import io.split.android.client.storage.splits.SplitsStorage;

public class checkEnvAndFiles implements SplitTask {
    static final String SINCE_PARAM = "since";
    private final long mCacheExpirationInSeconds;
    private staticBinarySafeDecrypt mChangeChecker = new staticBinarySafeDecrypt();
    private final boolean mCheckCacheExpiration;
    private final setNick mEventsManager;
    private final String mSplitsFilterQueryString;
    private final SplitsStorage mSplitsStorage;
    private final IOpenSDKComponent mSplitsSyncHelper;

    private String sanitizeString(String str) {
        return str != null ? str : "";
    }

    public checkEnvAndFiles(@NonNull IOpenSDKComponent iOpenSDKComponent, @NonNull SplitsStorage splitsStorage, boolean z, long j, String str, @NonNull setNick setnick) {
        this.mSplitsStorage = (SplitsStorage) Preconditions.checkNotNull(splitsStorage);
        this.mSplitsSyncHelper = (IOpenSDKComponent) Preconditions.checkNotNull(iOpenSDKComponent);
        this.mCacheExpirationInSeconds = j;
        this.mCheckCacheExpiration = z;
        this.mSplitsFilterQueryString = str;
        this.mEventsManager = (setNick) Preconditions.checkNotNull(setnick);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.loadLibrarySync execute() {
        /*
            r12 = this;
            io.split.android.client.storage.splits.SplitsStorage r0 = r12.mSplitsStorage
            long r8 = r0.getTill()
            io.split.android.client.storage.splits.SplitsStorage r0 = r12.mSplitsStorage
            long r4 = r0.getUpdateTimestamp()
            io.split.android.client.storage.splits.SplitsStorage r0 = r12.mSplitsStorage
            java.lang.String r0 = r0.getSplitsFilterQueryString()
            boolean r1 = r12.mCheckCacheExpiration
            r10 = 1
            r11 = 0
            if (r1 == 0) goto L_0x0025
            o.IOpenSDKComponent r1 = r12.mSplitsSyncHelper
            long r6 = r12.mCacheExpirationInSeconds
            r2 = r8
            boolean r1 = r1.cacheHasExpired(r2, r4, r6)
            if (r1 == 0) goto L_0x0025
            r1 = 1
            goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            boolean r0 = r12.splitsFilterHasChanged(r0)
            if (r0 == 0) goto L_0x0035
            io.split.android.client.storage.splits.SplitsStorage r2 = r12.mSplitsStorage
            java.lang.String r3 = r12.mSplitsFilterQueryString
            r2.updateSplitsFilterQueryString(r3)
            r8 = -1
        L_0x0035:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            java.lang.String r4 = "since"
            r2.put(r4, r3)
            o.IOpenSDKComponent r3 = r12.mSplitsSyncHelper
            if (r0 != 0) goto L_0x004b
            if (r1 == 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r10 = 0
        L_0x004b:
            o.loadLibrarySync r0 = r3.sync(r2, r10, r11)
            io.split.android.client.service.executor.SplitTaskExecutionStatus r1 = r0.getStatus()
            io.split.android.client.service.executor.SplitTaskExecutionStatus r2 = io.split.android.client.service.executor.SplitTaskExecutionStatus.SUCCESS
            if (r1 != r2) goto L_0x006e
            io.split.android.client.events.SplitInternalEvent r1 = io.split.android.client.events.SplitInternalEvent.SPLITS_FETCHED
            o.staticBinarySafeDecrypt r2 = r12.mChangeChecker
            io.split.android.client.storage.splits.SplitsStorage r3 = r12.mSplitsStorage
            long r3 = r3.getTill()
            boolean r2 = r2.splitsHaveChanged(r8, r3)
            if (r2 == 0) goto L_0x0069
            io.split.android.client.events.SplitInternalEvent r1 = io.split.android.client.events.SplitInternalEvent.SPLITS_UPDATED
        L_0x0069:
            o.setNick r2 = r12.mEventsManager
            r2.notifyInternalEvent(r1)
        L_0x006e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.checkEnvAndFiles.execute():o.loadLibrarySync");
    }

    private boolean splitsFilterHasChanged(String str) {
        return !sanitizeString(this.mSplitsFilterQueryString).equals(sanitizeString(str));
    }

    @VisibleForTesting
    public void setChangeChecker(staticBinarySafeDecrypt staticbinarysafedecrypt) {
        this.mChangeChecker = staticbinarysafedecrypt;
    }
}
