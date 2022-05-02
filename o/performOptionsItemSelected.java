package o;

import com.google.android.exoplayer2.ui.DefaultTimeBar;

public final class performOptionsItemSelected implements Runnable {
    private final DefaultTimeBar getMin;

    public performOptionsItemSelected(DefaultTimeBar defaultTimeBar) {
        this.getMin = defaultTimeBar;
    }

    public final void run() {
        this.getMin.lambda$new$0();
    }
}
