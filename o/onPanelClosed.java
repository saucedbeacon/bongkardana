package o;

import androidx.core.widget.ContentLoadingProgressBar;

public final class onPanelClosed implements Runnable {
    private final ContentLoadingProgressBar getMin;

    public onPanelClosed(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.getMin = contentLoadingProgressBar;
    }

    public final void run() {
        ContentLoadingProgressBar.getMax(this.getMin);
    }
}
