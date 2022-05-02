package o;

import com.google.android.exoplayer2.offline.DownloadManager;

public final class getAllowEnterTransitionOverlap implements Runnable {
    private final Throwable getMin;
    private final DownloadManager.Task setMin;

    public getAllowEnterTransitionOverlap(DownloadManager.Task task, Throwable th) {
        this.setMin = task;
        this.getMin = th;
    }

    public final void run() {
        this.setMin.lambda$run$1(this.getMin);
    }
}
