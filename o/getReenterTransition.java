package o;

import com.google.android.exoplayer2.offline.DownloadAction;
import com.google.android.exoplayer2.offline.DownloadManager;

public final class getReenterTransition implements Runnable {
    private final DownloadManager getMin;
    private final DownloadAction[] length;

    public getReenterTransition(DownloadManager downloadManager, DownloadAction[] downloadActionArr) {
        this.getMin = downloadManager;
        this.length = downloadActionArr;
    }

    public final void run() {
        this.getMin.lambda$saveActions$2(this.length);
    }
}
