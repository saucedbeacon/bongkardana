package o;

import androidx.core.widget.ContentLoadingProgressBar;

public final class onSupportContentChanged implements Runnable {
    private final ContentLoadingProgressBar getMin;

    public onSupportContentChanged(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.getMin = contentLoadingProgressBar;
    }

    public final void run() {
        ContentLoadingProgressBar.getMin(this.getMin);
    }
}
