package o;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public abstract class getSecurityBodyDataEx {
    private static final int SHUTDOWN_WAIT_TIME = 30;
    private final ExecutorService mExecutorService = Executors.newSingleThreadExecutor();

    /* access modifiers changed from: protected */
    public abstract void onWaitForNotificationLoop() throws InterruptedException;

    public void start() {
        waitForNotifications();
    }

    public void stop() {
        if (!this.mExecutorService.isShutdown()) {
            try {
                this.mExecutorService.shutdownNow();
                if (!this.mExecutorService.awaitTermination(30, TimeUnit.SECONDS)) {
                    createLoadingDialog.e("Update worker did not terminate");
                }
            } catch (InterruptedException unused) {
                this.mExecutorService.shutdownNow();
                Thread.currentThread().interrupt();
            }
        }
    }

    private void waitForNotifications() {
        this.mExecutorService.execute(new Runnable() {
            public final void run() {
                while (true) {
                    try {
                        getSecurityBodyDataEx.this.onWaitForNotificationLoop();
                    } catch (InterruptedException unused) {
                        return;
                    }
                }
            }
        });
    }
}
