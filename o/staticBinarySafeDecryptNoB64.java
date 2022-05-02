package o;

import androidx.annotation.NonNull;
import com.google.common.base.Preconditions;
import io.split.android.client.dtos.Event;
import io.split.android.client.service.executor.SplitTask;
import io.split.android.client.service.executor.SplitTaskType;
import io.split.android.client.service.sseclient.feedbackchannel.BroadcastedEventListener;
import io.split.android.client.service.sseclient.feedbackchannel.PushStatusEvent;
import io.split.android.client.service.synchronizer.SyncManager;
import io.split.android.client.service.synchronizer.Synchronizer;
import java.util.concurrent.atomic.AtomicBoolean;

public class staticBinarySafeDecryptNoB64 implements SyncManager, BroadcastedEventListener {
    private AtomicBoolean isPollingEnabled = new AtomicBoolean(false);
    private AtomicBoolean mIsPaused = new AtomicBoolean(false);
    private decryptWithToken mMySegmentUpdateWorker;
    private final ISecureSignatureComponent mPushManagerEventBroadcaster;
    /* access modifiers changed from: private */
    public final SecureSignatureDefine mPushNotificationManager;
    private final getPackageValidityCheckComp mSplitClientConfig;
    private encryptWithToken mSplitUpdateWorker;
    private enterRiskScene mStreamingReconnectTimer;
    private final Synchronizer mSynchronizer;

    public staticBinarySafeDecryptNoB64(@NonNull getPackageValidityCheckComp getpackagevaliditycheckcomp, @NonNull Synchronizer synchronizer, @NonNull SecureSignatureDefine secureSignatureDefine, @NonNull encryptWithToken encryptwithtoken, @NonNull decryptWithToken decryptwithtoken, @NonNull ISecureSignatureComponent iSecureSignatureComponent, @NonNull enterRiskScene enterriskscene) {
        this.mSynchronizer = (Synchronizer) Preconditions.checkNotNull(synchronizer);
        this.mSplitClientConfig = (getPackageValidityCheckComp) Preconditions.checkNotNull(getpackagevaliditycheckcomp);
        this.mPushNotificationManager = (SecureSignatureDefine) Preconditions.checkNotNull(secureSignatureDefine);
        this.mSplitUpdateWorker = (encryptWithToken) Preconditions.checkNotNull(encryptwithtoken);
        this.mMySegmentUpdateWorker = (decryptWithToken) Preconditions.checkNotNull(decryptwithtoken);
        this.mPushManagerEventBroadcaster = (ISecureSignatureComponent) Preconditions.checkNotNull(iSecureSignatureComponent);
        this.mStreamingReconnectTimer = (enterRiskScene) Preconditions.checkNotNull(enterriskscene);
    }

    public void start() {
        this.mSynchronizer.loadAndSynchronizeSplits();
        this.mSynchronizer.loadMySegmentsFromCache();
        this.mSynchronizer.synchronizeMySegments();
        this.isPollingEnabled.set(!this.mSplitClientConfig.streamingEnabled());
        if (this.mSplitClientConfig.streamingEnabled()) {
            this.mPushManagerEventBroadcaster.register(this);
            this.mSplitUpdateWorker.start();
            this.mMySegmentUpdateWorker.start();
            this.mPushNotificationManager.start();
            this.mStreamingReconnectTimer.setTask(new SplitTask() {
                @NonNull
                public final loadLibrarySync execute() {
                    createLoadingDialog.d("Reconnecting to streaming");
                    staticBinarySafeDecryptNoB64.this.mPushNotificationManager.start();
                    return loadLibrarySync.success(SplitTaskType.GENERIC_TASK);
                }
            });
        } else {
            this.mSynchronizer.startPeriodicFetching();
        }
        this.mSynchronizer.startPeriodicRecording();
    }

    public void pause() {
        this.mIsPaused.set(true);
        this.mSynchronizer.pause();
        if (this.mSplitClientConfig.streamingEnabled()) {
            this.mPushNotificationManager.pause();
        }
        if (this.isPollingEnabled.get()) {
            this.mSynchronizer.stopPeriodicFetching();
        }
    }

    public void resume() {
        this.mIsPaused.set(false);
        this.mSynchronizer.resume();
        if (this.mSplitClientConfig.streamingEnabled()) {
            this.mPushNotificationManager.resume();
        }
        if (this.isPollingEnabled.get()) {
            this.mSynchronizer.startPeriodicFetching();
        }
    }

    public void flush() {
        this.mSynchronizer.flush();
    }

    public void pushEvent(Event event) {
        this.mSynchronizer.pushEvent(event);
    }

    public void pushImpression(dynamicDecryptDDp dynamicdecryptddp) {
        this.mSynchronizer.pushImpression(dynamicdecryptddp);
    }

    public void stop() {
        this.mSynchronizer.stopPeriodicFetching();
        this.mSynchronizer.stopPeriodicRecording();
        this.mSynchronizer.destroy();
        this.mPushNotificationManager.stop();
        this.mSplitUpdateWorker.stop();
        this.mMySegmentUpdateWorker.stop();
    }

    /* renamed from: o.staticBinarySafeDecryptNoB64$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$io$split$android$client$service$sseclient$feedbackchannel$PushStatusEvent$EventType;

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
                io.split.android.client.service.sseclient.feedbackchannel.PushStatusEvent$EventType[] r0 = io.split.android.client.service.sseclient.feedbackchannel.PushStatusEvent.EventType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$split$android$client$service$sseclient$feedbackchannel$PushStatusEvent$EventType = r0
                io.split.android.client.service.sseclient.feedbackchannel.PushStatusEvent$EventType r1 = io.split.android.client.service.sseclient.feedbackchannel.PushStatusEvent.EventType.PUSH_SUBSYSTEM_UP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$split$android$client$service$sseclient$feedbackchannel$PushStatusEvent$EventType     // Catch:{ NoSuchFieldError -> 0x001d }
                io.split.android.client.service.sseclient.feedbackchannel.PushStatusEvent$EventType r1 = io.split.android.client.service.sseclient.feedbackchannel.PushStatusEvent.EventType.PUSH_SUBSYSTEM_DOWN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$io$split$android$client$service$sseclient$feedbackchannel$PushStatusEvent$EventType     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.split.android.client.service.sseclient.feedbackchannel.PushStatusEvent$EventType r1 = io.split.android.client.service.sseclient.feedbackchannel.PushStatusEvent.EventType.PUSH_RETRYABLE_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$io$split$android$client$service$sseclient$feedbackchannel$PushStatusEvent$EventType     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.split.android.client.service.sseclient.feedbackchannel.PushStatusEvent$EventType r1 = io.split.android.client.service.sseclient.feedbackchannel.PushStatusEvent.EventType.PUSH_NON_RETRYABLE_ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$io$split$android$client$service$sseclient$feedbackchannel$PushStatusEvent$EventType     // Catch:{ NoSuchFieldError -> 0x003e }
                io.split.android.client.service.sseclient.feedbackchannel.PushStatusEvent$EventType r1 = io.split.android.client.service.sseclient.feedbackchannel.PushStatusEvent.EventType.PUSH_DISABLED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.staticBinarySafeDecryptNoB64.AnonymousClass3.<clinit>():void");
        }
    }

    public void onEvent(PushStatusEvent pushStatusEvent) {
        int i = AnonymousClass3.$SwitchMap$io$split$android$client$service$sseclient$feedbackchannel$PushStatusEvent$EventType[pushStatusEvent.getMessage().ordinal()];
        if (i == 1) {
            createLoadingDialog.d("Push Subsystem Up event message received.");
            this.mSynchronizer.synchronizeSplits();
            this.mSynchronizer.synchronizeMySegments();
            this.mSynchronizer.stopPeriodicFetching();
            this.mStreamingReconnectTimer.cancel();
            this.isPollingEnabled.set(false);
        } else if (i == 2) {
            createLoadingDialog.d("Push Subsystem Down event message received.");
            enablePolling();
            this.mStreamingReconnectTimer.cancel();
        } else if (i == 3) {
            createLoadingDialog.d("Push Subsystem recoverable error received.");
            enablePolling();
            if (!this.mIsPaused.get()) {
                this.mStreamingReconnectTimer.schedule();
            }
        } else if (i == 4) {
            createLoadingDialog.d("Push Subsystem non recoverable error received.");
            enablePolling();
            this.mStreamingReconnectTimer.cancel();
            this.mPushNotificationManager.stop();
        } else if (i != 5) {
            StringBuilder sb = new StringBuilder("Invalid SSE event received: ");
            sb.append(pushStatusEvent.getMessage());
            createLoadingDialog.e(sb.toString());
        } else {
            createLoadingDialog.d("Push Subsystem Down event message received.");
            enablePolling();
            this.mStreamingReconnectTimer.cancel();
            this.mPushNotificationManager.stop();
        }
    }

    private void enablePolling() {
        if (!this.isPollingEnabled.get()) {
            this.isPollingEnabled.set(true);
            this.mSynchronizer.startPeriodicFetching();
            createLoadingDialog.i("Polling enabled.");
        }
    }
}
