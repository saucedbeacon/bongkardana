package o;

import androidx.annotation.NonNull;
import io.split.android.client.service.sseclient.feedbackchannel.BroadcastedEventListener;
import io.split.android.client.service.sseclient.feedbackchannel.PushStatusEvent;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ISecureSignatureComponent {
    private List<WeakReference<BroadcastedEventListener>> mListeners = new CopyOnWriteArrayList();

    public void pushMessage(@NonNull PushStatusEvent pushStatusEvent) {
        for (WeakReference<BroadcastedEventListener> weakReference : this.mListeners) {
            BroadcastedEventListener broadcastedEventListener = (BroadcastedEventListener) weakReference.get();
            if (broadcastedEventListener != null) {
                broadcastedEventListener.onEvent(pushStatusEvent);
            }
        }
    }

    public void register(@NonNull BroadcastedEventListener broadcastedEventListener) {
        this.mListeners.add(new WeakReference(broadcastedEventListener));
    }

    public void close() {
        this.mListeners.clear();
    }
}
