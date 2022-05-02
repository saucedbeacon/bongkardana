package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.split.android.client.service.executor.SplitTask;
import io.split.android.client.service.executor.SplitTaskType;
import io.split.android.client.service.sseclient.SseJwtToken;
import io.split.android.client.service.sseclient.feedbackchannel.PushStatusEvent;
import io.split.android.client.service.sseclient.sseclient.SseClient;
import java.lang.Thread;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class SecureSignatureDefine {
    private static final long AWAIT_SHUTDOWN_TIME = 5;
    private static final int POOL_SIZE = 1;
    /* access modifiers changed from: private */
    public final ISecureSignatureComponent mBroadcasterChannel;
    private leaveRiskScene mDisconnectionTimer;
    private final ScheduledExecutorService mExecutor;
    /* access modifiers changed from: private */
    public AtomicBoolean mIsPaused = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public AtomicBoolean mIsStopped = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public staticSafeDecrypt mRefreshTokenTimer;
    /* access modifiers changed from: private */
    public final IStaticDataEncryptComponent mSseAuthenticator;
    /* access modifiers changed from: private */
    public final SseClient mSseClient;

    @VisibleForTesting(otherwise = 2)
    public SecureSignatureDefine(@NonNull ISecureSignatureComponent iSecureSignatureComponent, @NonNull IStaticDataEncryptComponent iStaticDataEncryptComponent, @NonNull SseClient sseClient, @NonNull staticSafeDecrypt staticsafedecrypt, @NonNull leaveRiskScene leaveriskscene, @Nullable ScheduledExecutorService scheduledExecutorService) {
        this.mBroadcasterChannel = (ISecureSignatureComponent) Preconditions.checkNotNull(iSecureSignatureComponent);
        this.mSseAuthenticator = (IStaticDataEncryptComponent) Preconditions.checkNotNull(iStaticDataEncryptComponent);
        this.mSseClient = (SseClient) Preconditions.checkNotNull(sseClient);
        this.mRefreshTokenTimer = (staticSafeDecrypt) Preconditions.checkNotNull(staticsafedecrypt);
        this.mDisconnectionTimer = (leaveRiskScene) Preconditions.checkNotNull(leaveriskscene);
        if (scheduledExecutorService != null) {
            this.mExecutor = scheduledExecutorService;
        } else {
            this.mExecutor = buildExecutor();
        }
    }

    public void start() {
        createLoadingDialog.d("Push notification manager started");
        connect();
    }

    public void pause() {
        createLoadingDialog.d("Push notification manager paused");
        this.mIsPaused.set(true);
        this.mDisconnectionTimer.schedule(new SplitTask() {
            @NonNull
            public loadLibrarySync execute() {
                createLoadingDialog.d("Disconnecting streaming while in background");
                SecureSignatureDefine.this.mSseClient.disconnect();
                SecureSignatureDefine.this.mRefreshTokenTimer.cancel();
                return loadLibrarySync.success(SplitTaskType.GENERIC_TASK);
            }
        });
    }

    public void resume() {
        createLoadingDialog.d("Push notification manager resumed");
        this.mIsPaused.set(false);
        this.mDisconnectionTimer.cancel();
        if (this.mSseClient.status() == 2 && !this.mIsStopped.get()) {
            connect();
        }
    }

    public void stop() {
        createLoadingDialog.d("Shutting down SSE client");
        this.mIsStopped.set(true);
        this.mDisconnectionTimer.cancel();
        this.mRefreshTokenTimer.cancel();
        this.mSseClient.disconnect();
        shutdownAndAwaitTermination();
    }

    private void connect() {
        if (this.mSseClient.status() == 1) {
            this.mSseClient.disconnect();
        }
        this.mExecutor.submit(new length());
    }

    private void shutdownAndAwaitTermination() {
        this.mExecutor.shutdown();
        try {
            if (!this.mExecutor.awaitTermination(AWAIT_SHUTDOWN_TIME, TimeUnit.SECONDS)) {
                this.mExecutor.shutdownNow();
                if (!this.mExecutor.awaitTermination(AWAIT_SHUTDOWN_TIME, TimeUnit.SECONDS)) {
                    System.err.println("Sse client pool did not terminate");
                }
            }
        } catch (InterruptedException unused) {
            this.mExecutor.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

    private ScheduledThreadPoolExecutor buildExecutor() {
        ThreadFactoryBuilder threadFactoryBuilder = new ThreadFactoryBuilder();
        threadFactoryBuilder.setDaemon(true);
        threadFactoryBuilder.setNameFormat("split-sse_client-%d");
        threadFactoryBuilder.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            public final void uncaughtException(Thread thread, Throwable th) {
                createLoadingDialog.e(th, "Error in thread: %s", thread.getName());
            }
        });
        return new ScheduledThreadPoolExecutor(1, threadFactoryBuilder.build());
    }

    class length implements Runnable {
        private length() {
        }

        public void run() {
            SecurityBodyDefine authenticate = SecureSignatureDefine.this.mSseAuthenticator.authenticate();
            if (authenticate.isSuccess() && !authenticate.isPushEnabled()) {
                createLoadingDialog.d("Streaming disabled for api key");
                SecureSignatureDefine.this.mBroadcasterChannel.pushMessage(new PushStatusEvent(PushStatusEvent.EventType.PUSH_SUBSYSTEM_DOWN));
                SecureSignatureDefine.this.mIsStopped.set(true);
            } else if (!authenticate.isSuccess() && !authenticate.isErrorRecoverable()) {
                createLoadingDialog.d("Streaming no recoverable auth error.");
                SecureSignatureDefine.this.mBroadcasterChannel.pushMessage(new PushStatusEvent(PushStatusEvent.EventType.PUSH_NON_RETRYABLE_ERROR));
                SecureSignatureDefine.this.mIsStopped.set(true);
            } else if (authenticate.isSuccess() || !authenticate.isErrorRecoverable()) {
                final SseJwtToken jwtToken = authenticate.getJwtToken();
                if (jwtToken == null || jwtToken.getChannels() == null || jwtToken.getRawJwt() == null) {
                    createLoadingDialog.d("Streaming auth error. Retrying");
                    SecureSignatureDefine.this.mBroadcasterChannel.pushMessage(new PushStatusEvent(PushStatusEvent.EventType.PUSH_RETRYABLE_ERROR));
                } else if (!SecureSignatureDefine.this.mIsPaused.get() && !SecureSignatureDefine.this.mIsStopped.get()) {
                    SecureSignatureDefine.this.mSseClient.connect(jwtToken, new SseClient.ConnectionListener() {
                        public final void onConnectionSuccess() {
                            SecureSignatureDefine.this.mBroadcasterChannel.pushMessage(new PushStatusEvent(PushStatusEvent.EventType.PUSH_SUBSYSTEM_UP));
                            SecureSignatureDefine.this.mRefreshTokenTimer.schedule(jwtToken.getIssuedAtTime(), jwtToken.getExpirationTime());
                        }
                    });
                }
            } else {
                SecureSignatureDefine.this.mBroadcasterChannel.pushMessage(new PushStatusEvent(PushStatusEvent.EventType.PUSH_RETRYABLE_ERROR));
            }
        }

        private void logError(String str, Exception exc) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" : ");
            sb.append(exc.getLocalizedMessage());
            createLoadingDialog.e(sb.toString());
        }
    }
}
