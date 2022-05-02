package o;

import androidx.annotation.NonNull;
import com.google.common.base.Preconditions;
import io.split.android.client.service.executor.SplitTask;
import io.split.android.client.storage.splits.SplitsStorage;
import java.util.HashMap;

public final class noCaptchaVerification implements SplitTask {
    static final String SINCE_PARAM = "since";
    private final long mCacheExpirationInSeconds;
    private final SplitsStorage mSplitsStorage;
    private final IOpenSDKComponent mSplitsSyncHelper;

    public noCaptchaVerification(IOpenSDKComponent iOpenSDKComponent, SplitsStorage splitsStorage, long j) {
        this.mSplitsSyncHelper = (IOpenSDKComponent) Preconditions.checkNotNull(iOpenSDKComponent);
        this.mSplitsStorage = (SplitsStorage) Preconditions.checkNotNull(splitsStorage);
        this.mCacheExpirationInSeconds = j;
    }

    @NonNull
    public final loadLibrarySync execute() {
        boolean z;
        long till = this.mSplitsStorage.getTill();
        if (this.mSplitsSyncHelper.cacheHasExpired(till, this.mSplitsStorage.getUpdateTimestamp(), this.mCacheExpirationInSeconds)) {
            z = true;
            till = -1;
        } else {
            z = false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(SINCE_PARAM, Long.valueOf(till));
        return this.mSplitsSyncHelper.sync(hashMap, z, false);
    }
}
