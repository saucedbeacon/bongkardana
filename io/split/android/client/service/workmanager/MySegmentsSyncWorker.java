package io.split.android.client.service.workmanager;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.WorkerParameters;
import io.split.android.client.storage.db.StorageFactory;
import java.net.URISyntaxException;
import o.createLoadingDialog;
import o.initNoCaptcha;
import o.registerInitFinishListener;
import o.setNick;

public class MySegmentsSyncWorker extends SplitWorker {
    public MySegmentsSyncWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        String str;
        Object obj = workerParameters.setMax.setMin.get("key");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        try {
            this.mSplitTask = new initNoCaptcha(registerInitFinishListener.getMySegmentsFetcher(getNetworkHelper(), getHttpClient(), getEndPoint(), str, getMetrics()), StorageFactory.getMySegmentsStorage(getDatabase(), str), false, (setNick) null);
        } catch (URISyntaxException e) {
            StringBuilder sb = new StringBuilder("Error creating Split worker: ");
            sb.append(e.getMessage());
            createLoadingDialog.e(sb.toString());
        }
    }
}
