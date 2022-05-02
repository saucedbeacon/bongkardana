package o;

import androidx.core.widget.ContentLoadingProgressBar;

public final class getDelegate implements Runnable {
    private final ContentLoadingProgressBar length;

    public getDelegate(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.length = contentLoadingProgressBar;
    }

    public final void run() {
        ContentLoadingProgressBar.setMin(this.length);
    }
}
