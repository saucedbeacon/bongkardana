package io.split.android.client.service.workmanager;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.WorkerParameters;
import io.split.android.client.storage.db.StorageFactory;
import java.net.URISyntaxException;
import o.callLiteVMVoidMethod;
import o.createLoadingDialog;
import o.getBizId;
import o.registerInitFinishListener;

public class ImpressionsRecorderWorker extends SplitWorker {
    public ImpressionsRecorderWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        try {
            Object obj = workerParameters.setMax.setMin.get("impressionsPerPush");
            this.mSplitTask = new getBizId(registerInitFinishListener.getImpressionsRecorder(getNetworkHelper(), getHttpClient(), getEndPoint()), StorageFactory.getPersistenImpressionsStorage(getDatabase()), new callLiteVMVoidMethod(obj instanceof Integer ? ((Integer) obj).intValue() : 100, 150));
        } catch (URISyntaxException e) {
            StringBuilder sb = new StringBuilder("Error creating Split worker: ");
            sb.append(e.getMessage());
            createLoadingDialog.e(sb.toString());
        }
    }
}
