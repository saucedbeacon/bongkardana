package o;

import androidx.annotation.NonNull;
import com.google.common.collect.Maps;
import com.google.gson.JsonSyntaxException;
import io.split.android.client.service.sseclient.feedbackchannel.PushStatusEvent;
import io.split.android.client.service.sseclient.notifications.ControlNotification;
import io.split.android.client.service.sseclient.notifications.OccupancyNotification;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.Nullable;

public class ISecurityBodyComponent {
    private static String CHANNEL_PRI_KEY = "PRI";
    private static String CHANNEL_SEC_KEY = "SEC";
    private ISecureSignatureComponent mBroadcasterChannel;
    private AtomicBoolean mIsStreamingActive = new AtomicBoolean(true);
    private AtomicLong mLastControlTimestamp = new AtomicLong(0);
    Map<String, setMax> mPublishers = Maps.newConcurrentMap();

    static class setMax {
        int count = 0;
        long lastTimestamp;

        public setMax(int i, long j) {
            this.count = i;
            this.lastTimestamp = j;
        }
    }

    public ISecurityBodyComponent(ISecureSignatureComponent iSecureSignatureComponent) {
        this.mBroadcasterChannel = iSecureSignatureComponent;
        this.mPublishers.put(CHANNEL_PRI_KEY, new setMax(1, 0));
        this.mPublishers.put(CHANNEL_SEC_KEY, new setMax(0, 0));
    }

    public void handleControlNotification(ControlNotification controlNotification) {
        if (this.mLastControlTimestamp.get() < controlNotification.getTimestamp()) {
            this.mLastControlTimestamp.set(controlNotification.getTimestamp());
            try {
                int i = AnonymousClass2.$SwitchMap$io$split$android$client$service$sseclient$notifications$ControlNotification$ControlType[controlNotification.getControlType().ordinal()];
                if (i == 1) {
                    this.mIsStreamingActive.set(false);
                    this.mBroadcasterChannel.pushMessage(new PushStatusEvent(PushStatusEvent.EventType.PUSH_SUBSYSTEM_DOWN));
                } else if (i == 2) {
                    this.mIsStreamingActive.set(false);
                    this.mBroadcasterChannel.pushMessage(new PushStatusEvent(PushStatusEvent.EventType.PUSH_DISABLED));
                } else if (i != 3) {
                    StringBuilder sb = new StringBuilder("Unknown message received");
                    sb.append(controlNotification.getControlType());
                    createLoadingDialog.e(sb.toString());
                } else {
                    this.mIsStreamingActive.set(true);
                    if (publishersCount() > 0) {
                        this.mBroadcasterChannel.pushMessage(new PushStatusEvent(PushStatusEvent.EventType.PUSH_SUBSYSTEM_UP));
                    }
                }
            } catch (JsonSyntaxException e) {
                StringBuilder sb2 = new StringBuilder("Could not parse control notification: ");
                sb2.append(controlNotification.getJsonData());
                sb2.append(" -> ");
                sb2.append(e.getLocalizedMessage());
                createLoadingDialog.e(sb2.toString());
            } catch (Exception e2) {
                StringBuilder sb3 = new StringBuilder("Unexpected error while processing control notification: ");
                sb3.append(e2.getLocalizedMessage());
                createLoadingDialog.e(sb3.toString());
            }
        }
    }

    /* renamed from: o.ISecurityBodyComponent$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$split$android$client$service$sseclient$notifications$ControlNotification$ControlType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                io.split.android.client.service.sseclient.notifications.ControlNotification$ControlType[] r0 = io.split.android.client.service.sseclient.notifications.ControlNotification.ControlType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$split$android$client$service$sseclient$notifications$ControlNotification$ControlType = r0
                io.split.android.client.service.sseclient.notifications.ControlNotification$ControlType r1 = io.split.android.client.service.sseclient.notifications.ControlNotification.ControlType.STREAMING_PAUSED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$split$android$client$service$sseclient$notifications$ControlNotification$ControlType     // Catch:{ NoSuchFieldError -> 0x001d }
                io.split.android.client.service.sseclient.notifications.ControlNotification$ControlType r1 = io.split.android.client.service.sseclient.notifications.ControlNotification.ControlType.STREAMING_DISABLED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$io$split$android$client$service$sseclient$notifications$ControlNotification$ControlType     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.split.android.client.service.sseclient.notifications.ControlNotification$ControlType r1 = io.split.android.client.service.sseclient.notifications.ControlNotification.ControlType.STREAMING_ENABLED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ISecurityBodyComponent.AnonymousClass2.<clinit>():void");
        }
    }

    public void handleOccupancyNotification(OccupancyNotification occupancyNotification) {
        String channelKey = getChannelKey(occupancyNotification);
        if (channelKey != null && !isOldTimestamp(occupancyNotification, channelKey)) {
            int publishersCount = publishersCount();
            updateChannelInfo(channelKey, occupancyNotification.getMetrics().getPublishers(), occupancyNotification.getTimestamp());
            if (publishersCount() == 0 && publishersCount > 0) {
                this.mBroadcasterChannel.pushMessage(new PushStatusEvent(PushStatusEvent.EventType.PUSH_SUBSYSTEM_DOWN));
            } else if (publishersCount() > 0 && publishersCount == 0 && this.mIsStreamingActive.get()) {
                this.mBroadcasterChannel.pushMessage(new PushStatusEvent(PushStatusEvent.EventType.PUSH_SUBSYSTEM_UP));
            }
        }
    }

    public boolean isStreamingActive() {
        return this.mIsStreamingActive.get();
    }

    private synchronized int publishersCount() {
        return this.mPublishers.get(CHANNEL_PRI_KEY).count + this.mPublishers.get(CHANNEL_SEC_KEY).count;
    }

    @Nullable
    private String getChannelKey(OccupancyNotification occupancyNotification) {
        if (occupancyNotification.isControlPriChannel()) {
            return CHANNEL_PRI_KEY;
        }
        if (occupancyNotification.isControlSecChannel()) {
            return CHANNEL_SEC_KEY;
        }
        StringBuilder sb = new StringBuilder("Unknown occupancy channel ");
        sb.append(occupancyNotification.getChannel());
        createLoadingDialog.w(sb.toString());
        return null;
    }

    private synchronized boolean isOldTimestamp(@NonNull OccupancyNotification occupancyNotification, @NonNull String str) {
        return this.mPublishers.get(str).lastTimestamp >= occupancyNotification.getTimestamp();
    }

    private synchronized void updateChannelInfo(String str, int i, long j) {
        setMax setmax = this.mPublishers.get(str);
        if (setmax != null) {
            setmax.lastTimestamp = j;
            setmax.count = i;
        }
    }
}
