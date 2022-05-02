package o;

import androidx.annotation.NonNull;
import com.google.common.base.Preconditions;
import com.google.gson.JsonSyntaxException;
import io.split.android.client.service.sseclient.feedbackchannel.PushStatusEvent;
import io.split.android.client.service.sseclient.notifications.ControlNotification;
import io.split.android.client.service.sseclient.notifications.IncomingNotification;
import io.split.android.client.service.sseclient.notifications.NotificationParser;
import io.split.android.client.service.sseclient.notifications.NotificationProcessor;
import io.split.android.client.service.sseclient.notifications.OccupancyNotification;
import io.split.android.client.service.sseclient.notifications.StreamingError;
import java.util.Map;

public class isSimulator {
    private final ISecureSignatureComponent mBroadcasterChannel;
    private final ISecurityBodyComponent mNotificationManagerKeeper;
    private final NotificationParser mNotificationParser;
    private final NotificationProcessor mNotificationProcessor;

    public isSimulator(@NonNull NotificationParser notificationParser, @NonNull NotificationProcessor notificationProcessor, @NonNull ISecurityBodyComponent iSecurityBodyComponent, @NonNull ISecureSignatureComponent iSecureSignatureComponent) {
        this.mNotificationParser = (NotificationParser) Preconditions.checkNotNull(notificationParser);
        this.mNotificationProcessor = (NotificationProcessor) Preconditions.checkNotNull(notificationProcessor);
        this.mBroadcasterChannel = (ISecureSignatureComponent) Preconditions.checkNotNull(iSecureSignatureComponent);
        this.mNotificationManagerKeeper = (ISecurityBodyComponent) Preconditions.checkNotNull(iSecurityBodyComponent);
    }

    public boolean isConnectionConfirmed(Map<String, String> map) {
        if (map.get("data") != null && map.get("data") == null && map.get("event") == null) {
            return true;
        }
        if (map.get("data") == null || this.mNotificationParser.isError(map)) {
            return false;
        }
        return true;
    }

    public void handleIncomingMessage(Map<String, String> map) {
        String str = map.get("data");
        if (str == null) {
            return;
        }
        if (this.mNotificationParser.isError(map)) {
            handleError(str);
            return;
        }
        IncomingNotification parseIncoming = this.mNotificationParser.parseIncoming(str);
        if (parseIncoming != null) {
            int i = AnonymousClass5.$SwitchMap$io$split$android$client$service$sseclient$notifications$NotificationType[parseIncoming.getType().ordinal()];
            if (i == 1) {
                handleControlNotification(parseIncoming);
            } else if (i == 2) {
                handleOccupancyNotification(parseIncoming);
            } else if (i != 3 && i != 4 && i != 5) {
                createLoadingDialog.w("SSE Handler: Unknown notification");
            } else if (this.mNotificationManagerKeeper.isStreamingActive()) {
                this.mNotificationProcessor.process(parseIncoming);
            }
        }
    }

    /* renamed from: o.isSimulator$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$io$split$android$client$service$sseclient$notifications$NotificationType;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                io.split.android.client.service.sseclient.notifications.NotificationType[] r0 = io.split.android.client.service.sseclient.notifications.NotificationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$split$android$client$service$sseclient$notifications$NotificationType = r0
                io.split.android.client.service.sseclient.notifications.NotificationType r1 = io.split.android.client.service.sseclient.notifications.NotificationType.CONTROL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$split$android$client$service$sseclient$notifications$NotificationType     // Catch:{ NoSuchFieldError -> 0x001d }
                io.split.android.client.service.sseclient.notifications.NotificationType r1 = io.split.android.client.service.sseclient.notifications.NotificationType.OCCUPANCY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$io$split$android$client$service$sseclient$notifications$NotificationType     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.split.android.client.service.sseclient.notifications.NotificationType r1 = io.split.android.client.service.sseclient.notifications.NotificationType.SPLIT_KILL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$io$split$android$client$service$sseclient$notifications$NotificationType     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.split.android.client.service.sseclient.notifications.NotificationType r1 = io.split.android.client.service.sseclient.notifications.NotificationType.SPLIT_UPDATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$io$split$android$client$service$sseclient$notifications$NotificationType     // Catch:{ NoSuchFieldError -> 0x003e }
                io.split.android.client.service.sseclient.notifications.NotificationType r1 = io.split.android.client.service.sseclient.notifications.NotificationType.MY_SEGMENTS_UPDATE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.isSimulator.AnonymousClass5.<clinit>():void");
        }
    }

    public void handleError(boolean z) {
        this.mBroadcasterChannel.pushMessage(new PushStatusEvent(z ? PushStatusEvent.EventType.PUSH_RETRYABLE_ERROR : PushStatusEvent.EventType.PUSH_NON_RETRYABLE_ERROR));
    }

    private void handleControlNotification(IncomingNotification incomingNotification) {
        try {
            ControlNotification parseControl = this.mNotificationParser.parseControl(incomingNotification.getJsonData());
            parseControl.setTimestamp(incomingNotification.getTimestamp());
            this.mNotificationManagerKeeper.handleControlNotification(parseControl);
        } catch (JsonSyntaxException e) {
            StringBuilder sb = new StringBuilder("Could not parse control notification: ");
            sb.append(incomingNotification.getJsonData());
            sb.append(" -> ");
            sb.append(e.getLocalizedMessage());
            createLoadingDialog.e(sb.toString());
        } catch (Exception e2) {
            StringBuilder sb2 = new StringBuilder("Unexpected error while processing control notification: ");
            sb2.append(e2.getLocalizedMessage());
            createLoadingDialog.e(sb2.toString());
        }
    }

    private void handleOccupancyNotification(IncomingNotification incomingNotification) {
        try {
            OccupancyNotification parseOccupancy = this.mNotificationParser.parseOccupancy(incomingNotification.getJsonData());
            parseOccupancy.setChannel(incomingNotification.getChannel());
            parseOccupancy.setTimestamp(incomingNotification.getTimestamp());
            this.mNotificationManagerKeeper.handleOccupancyNotification(parseOccupancy);
        } catch (JsonSyntaxException e) {
            StringBuilder sb = new StringBuilder("Could not parse occupancy notification: ");
            sb.append(incomingNotification.getJsonData());
            sb.append(" -> ");
            sb.append(e.getLocalizedMessage());
            createLoadingDialog.e(sb.toString());
        } catch (Exception e2) {
            StringBuilder sb2 = new StringBuilder("Unexpected error while processing occupancy notification: ");
            sb2.append(e2.getLocalizedMessage());
            createLoadingDialog.e(sb2.toString());
        }
    }

    private void handleError(String str) {
        try {
            StreamingError parseError = this.mNotificationParser.parseError(str);
            StringBuilder sb = new StringBuilder("Streaming error notification received: ");
            sb.append(parseError.getMessage());
            createLoadingDialog.w(sb.toString());
            if (parseError.shouldBeIgnored()) {
                createLoadingDialog.w("Error ignored");
            } else {
                this.mBroadcasterChannel.pushMessage(new PushStatusEvent(parseError.isRetryable() ? PushStatusEvent.EventType.PUSH_RETRYABLE_ERROR : PushStatusEvent.EventType.PUSH_NON_RETRYABLE_ERROR));
            }
        } catch (JsonSyntaxException e) {
            StringBuilder sb2 = new StringBuilder("Could not parse occupancy notification: ");
            sb2.append(str);
            sb2.append(" -> ");
            sb2.append(e.getLocalizedMessage());
            createLoadingDialog.e(sb2.toString());
        } catch (Exception e2) {
            StringBuilder sb3 = new StringBuilder("Unexpected error while processing occupancy notification: ");
            sb3.append(e2.getLocalizedMessage());
            createLoadingDialog.e(sb3.toString());
        }
    }
}
