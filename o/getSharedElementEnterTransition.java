package o;

import com.google.android.exoplayer2.offline.DownloadManager;

public final class getSharedElementEnterTransition implements Runnable {
    private final DownloadManager setMin;

    public getSharedElementEnterTransition(DownloadManager downloadManager) {
        this.setMin = downloadManager;
    }

    public final void run() {
        this.setMin.lambda$loadActions$1();
    }
}
