package o;

import com.google.android.exoplayer2.offline.DownloadHelper;

public final class setReenterTransition implements Runnable {
    private final DownloadHelper.AnonymousClass1 getMin;
    private final DownloadHelper.Callback setMax;

    public setReenterTransition(DownloadHelper.AnonymousClass1 r1, DownloadHelper.Callback callback) {
        this.getMin = r1;
        this.setMax = callback;
    }

    public final void run() {
        this.getMin.lambda$run$0(this.setMax);
    }
}
