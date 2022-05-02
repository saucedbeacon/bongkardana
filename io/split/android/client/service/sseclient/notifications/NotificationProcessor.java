package io.split.android.client.service.sseclient.notifications;

import androidx.annotation.NonNull;
import com.google.common.base.Preconditions;
import com.google.gson.JsonSyntaxException;
import io.split.android.client.dtos.Split;
import io.split.android.client.service.executor.SplitTaskExecutionListener;
import io.split.android.client.service.executor.SplitTaskExecutor;
import io.split.android.client.service.executor.SplitTaskFactory;
import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;
import o.createLoadingDialog;

public class NotificationProcessor {
    private final BlockingQueue<MySegmentChangeNotification> mMySegmentUpdateNotificationsQueue;
    private final NotificationParser mNotificationParser;
    private final SplitTaskExecutor mSplitTaskExecutor;
    private final SplitTaskFactory mSplitTaskFactory;
    private final BlockingQueue<SplitsChangeNotification> mSplitsUpdateNotificationsQueue;

    public NotificationProcessor(@NonNull SplitTaskExecutor splitTaskExecutor, @NonNull SplitTaskFactory splitTaskFactory, @NonNull NotificationParser notificationParser, @NonNull BlockingQueue<MySegmentChangeNotification> blockingQueue, @NonNull BlockingQueue<SplitsChangeNotification> blockingQueue2) {
        this.mSplitTaskExecutor = (SplitTaskExecutor) Preconditions.checkNotNull(splitTaskExecutor);
        this.mSplitTaskFactory = (SplitTaskFactory) Preconditions.checkNotNull(splitTaskFactory);
        this.mNotificationParser = (NotificationParser) Preconditions.checkNotNull(notificationParser);
        this.mMySegmentUpdateNotificationsQueue = (BlockingQueue) Preconditions.checkNotNull(blockingQueue);
        this.mSplitsUpdateNotificationsQueue = (BlockingQueue) Preconditions.checkNotNull(blockingQueue2);
    }

    /* renamed from: io.split.android.client.service.sseclient.notifications.NotificationProcessor$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$split$android$client$service$sseclient$notifications$NotificationType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                io.split.android.client.service.sseclient.notifications.NotificationType[] r0 = io.split.android.client.service.sseclient.notifications.NotificationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$split$android$client$service$sseclient$notifications$NotificationType = r0
                io.split.android.client.service.sseclient.notifications.NotificationType r1 = io.split.android.client.service.sseclient.notifications.NotificationType.SPLIT_UPDATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$split$android$client$service$sseclient$notifications$NotificationType     // Catch:{ NoSuchFieldError -> 0x001d }
                io.split.android.client.service.sseclient.notifications.NotificationType r1 = io.split.android.client.service.sseclient.notifications.NotificationType.SPLIT_KILL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$io$split$android$client$service$sseclient$notifications$NotificationType     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.split.android.client.service.sseclient.notifications.NotificationType r1 = io.split.android.client.service.sseclient.notifications.NotificationType.MY_SEGMENTS_UPDATE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.split.android.client.service.sseclient.notifications.NotificationProcessor.AnonymousClass1.<clinit>():void");
        }
    }

    public void process(IncomingNotification incomingNotification) {
        try {
            String jsonData = incomingNotification.getJsonData();
            int i = AnonymousClass1.$SwitchMap$io$split$android$client$service$sseclient$notifications$NotificationType[incomingNotification.getType().ordinal()];
            if (i == 1) {
                processSplitUpdate(this.mNotificationParser.parseSplitUpdate(jsonData));
            } else if (i == 2) {
                processSplitKill(this.mNotificationParser.parseSplitKill(jsonData));
            } else if (i != 3) {
                createLoadingDialog.e("Unknow notification arrived: ".concat(String.valueOf(jsonData)));
            } else {
                processMySegmentUpdate(this.mNotificationParser.parseMySegmentUpdate(jsonData));
            }
        } catch (JsonSyntaxException e) {
            StringBuilder sb = new StringBuilder("Error processing incoming push notification: ");
            sb.append(e.getLocalizedMessage());
            createLoadingDialog.e(sb.toString());
        } catch (Exception e2) {
            StringBuilder sb2 = new StringBuilder("Unknown error while processing incoming push notification: ");
            sb2.append(e2.getLocalizedMessage());
            createLoadingDialog.e(sb2.toString());
        }
    }

    private void processSplitUpdate(SplitsChangeNotification splitsChangeNotification) {
        this.mSplitsUpdateNotificationsQueue.offer(splitsChangeNotification);
    }

    private void processSplitKill(SplitKillNotification splitKillNotification) {
        Split split = new Split();
        split.name = splitKillNotification.getSplitName();
        split.defaultTreatment = splitKillNotification.getDefaultTreatment();
        split.changeNumber = splitKillNotification.getChangeNumber();
        this.mSplitTaskExecutor.submit(this.mSplitTaskFactory.createSplitKillTask(split), (SplitTaskExecutionListener) null);
        this.mSplitsUpdateNotificationsQueue.offer(new SplitsChangeNotification(split.changeNumber));
    }

    private void processMySegmentUpdate(MySegmentChangeNotification mySegmentChangeNotification) {
        if (!mySegmentChangeNotification.isIncludesPayload()) {
            this.mMySegmentUpdateNotificationsQueue.offer(mySegmentChangeNotification);
        } else {
            this.mSplitTaskExecutor.submit(this.mSplitTaskFactory.createMySegmentsUpdateTask(mySegmentChangeNotification.getSegmentList() != null ? mySegmentChangeNotification.getSegmentList() : new ArrayList()), (SplitTaskExecutionListener) null);
        }
    }
}
