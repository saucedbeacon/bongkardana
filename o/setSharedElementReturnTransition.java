package o;

import com.google.android.exoplayer2.offline.DownloadAction;
import com.google.android.exoplayer2.offline.DownloadManager;

public final class setSharedElementReturnTransition implements Runnable {
    private final DownloadManager length;
    private final DownloadAction[] setMin;

    public setSharedElementReturnTransition(DownloadManager downloadManager, DownloadAction[] downloadActionArr) {
        this.length = downloadManager;
        this.setMin = downloadActionArr;
    }

    public final void run() {
        this.length.lambda$null$0(this.setMin);
    }
}
