package o;

import androidx.core.widget.ContentLoadingProgressBar;

public final class supportShouldUpRecreateTask implements Runnable {
    private final ContentLoadingProgressBar setMax;

    public supportShouldUpRecreateTask(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.setMax = contentLoadingProgressBar;
    }

    public final void run() {
        ContentLoadingProgressBar.length(this.setMax);
    }
}
