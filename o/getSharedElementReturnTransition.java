package o;

import com.google.android.exoplayer2.offline.DownloadManager;

public final class getSharedElementReturnTransition implements Runnable {
    private final DownloadManager.Task getMin;

    public getSharedElementReturnTransition(DownloadManager.Task task) {
        this.getMin = task;
    }

    public final void run() {
        this.getMin.lambda$cancel$0();
    }
}
