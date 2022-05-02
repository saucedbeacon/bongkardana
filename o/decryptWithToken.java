package o;

import androidx.annotation.NonNull;
import io.split.android.client.service.sseclient.notifications.MySegmentChangeNotification;
import io.split.android.client.service.synchronizer.Synchronizer;
import java.util.concurrent.BlockingQueue;

public class decryptWithToken extends getSecurityBodyDataEx {
    private final BlockingQueue<MySegmentChangeNotification> mNotificationsQueue;
    private final Synchronizer mSynchronizer;

    public decryptWithToken(@NonNull Synchronizer synchronizer, @NonNull BlockingQueue<MySegmentChangeNotification> blockingQueue) {
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
            this.mNotificationsQueue.take();
            this.mSynchronizer.forceMySegmentsSync();
            createLoadingDialog.d("A new notification to update segments has been received. Enqueing polling task.");
        } catch (InterruptedException e) {
            createLoadingDialog.d("My segments update worker has been interrupted");
            throw e;
        }
    }
}
