package io.split.android.client.service.workmanager;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.WorkerParameters;
import io.split.android.client.storage.db.StorageFactory;
import io.split.android.client.storage.splits.SplitsStorage;
import java.net.URISyntaxException;
import o.IOpenSDKComponent;
import o.createLoadingDialog;
import o.noCaptchaForwardAuth;
import o.noCaptchaVerification;
import o.registerInitFinishListener;

public class SplitsSyncWorker extends SplitWorker {
    public SplitsSyncWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        try {
            SplitsStorage splitsStorage = StorageFactory.getSplitsStorage(getDatabase());
            this.mSplitTask = new noCaptchaVerification(new IOpenSDKComponent(registerInitFinishListener.getSplitsFetcher(getNetworkHelper(), getHttpClient(), getEndPoint(), getMetrics(), splitsStorage.getSplitsFilterQueryString()), splitsStorage, new noCaptchaForwardAuth()), splitsStorage, getCacheExpirationInSeconds());
        } catch (URISyntaxException e) {
            StringBuilder sb = new StringBuilder("Error creating Split worker: ");
            sb.append(e.getMessage());
            createLoadingDialog.e(sb.toString());
        }
    }
}
