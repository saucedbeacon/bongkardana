package o;

import androidx.annotation.NonNull;
import io.split.android.client.service.sseclient.notifications.SplitsChangeNotification;
import io.split.android.client.service.synchronizer.Synchronizer;
import java.util.concurrent.BlockingQueue;

public class encryptWithToken extends getSecurityBodyDataEx {
    private final BlockingQueue<SplitsChangeNotification> mNotificationsQueue;
    private final Synchronizer mSynchronizer;

    public encryptWithToken(@NonNull Synchronizer synchronizer, @NonNull BlockingQueue<SplitsChangeNotification> blockingQueue) {
        if (synchronizer != null) {
            this.mSynchronizer = synchronizer;
            if (blockingQueue != null) {
                this.mNotificationsQueue = blockingQueue;
                return;
            }
            throw null;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public void onWaitForNotificationLoop() throws InterruptedException {
        try {
            this.mSynchronizer.synchronizeSplits(this.mNotificationsQueue.take().getChangeNumber());
            createLoadingDialog.d("A new notification to update splits has been received. Enqueing polling task.");
        } catch (InterruptedException e) {
            createLoadingDialog.d("Splits update worker has been interrupted");
            throw e;
        }
    }
}
