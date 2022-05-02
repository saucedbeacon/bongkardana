package o;

import o.GriverProgressBar;

public abstract class registerCallback {
    private IRedDotManager length;

    public final void length(GriverProgressBar.UpdateRunnable updateRunnable) {
        if (this.length == null) {
            this.length = new IRedDotManager();
        }
        if (updateRunnable != null) {
            IRedDotManager iRedDotManager = this.length;
            if (iRedDotManager != null) {
                iRedDotManager.getMin(updateRunnable);
                return;
            }
            throw null;
        }
        throw null;
    }

    public void l_() {
        IRedDotManager iRedDotManager = this.length;
        if (iRedDotManager != null && !iRedDotManager.isDisposed()) {
            this.length.dispose();
        }
    }
}
