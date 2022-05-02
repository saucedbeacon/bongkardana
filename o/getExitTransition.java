package o;

import com.google.android.exoplayer2.offline.DownloadHelper;
import java.io.IOException;

public final class getExitTransition implements Runnable {
    private final IOException getMin;
    private final DownloadHelper.AnonymousClass1 length;
    private final DownloadHelper.Callback setMax;

    public getExitTransition(DownloadHelper.AnonymousClass1 r1, DownloadHelper.Callback callback, IOException iOException) {
        this.length = r1;
        this.setMax = callback;
        this.getMin = iOException;
    }

    public final void run() {
        this.length.lambda$run$1(this.setMax, this.getMin);
    }
}
