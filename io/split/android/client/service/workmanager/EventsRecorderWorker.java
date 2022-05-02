package io.split.android.client.service.workmanager;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.WorkerParameters;
import io.split.android.client.storage.db.StorageFactory;
import java.net.URISyntaxException;
import o.IInitializeComponent;
import o.createLoadingDialog;
import o.isSoValid;
import o.registerInitFinishListener;

public class EventsRecorderWorker extends SplitWorker {
    public EventsRecorderWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        try {
            Object obj = workerParameters.setMax.setMin.get("eventsPerPush");
            this.mSplitTask = new isSoValid(registerInitFinishListener.getEventsRecorder(getNetworkHelper(), getHttpClient(), getEndPoint()), StorageFactory.getPersistenEventsStorage(getDatabase()), new IInitializeComponent.IInitFinishListener(obj instanceof Integer ? ((Integer) obj).intValue() : 100));
        } catch (URISyntaxException e) {
            StringBuilder sb = new StringBuilder("Error creating Split worker: ");
            sb.append(e.getMessage());
            createLoadingDialog.e(sb.toString());
        }
    }
}
