package o;

import id.dana.AppLifeCycleObserver;
import id.dana.base.BaseActivity;

public final class tokenizerArgs implements AppLifeCycleObserver.getMax {
    private final BaseActivity getMin;

    public tokenizerArgs(BaseActivity baseActivity) {
        this.getMin = baseActivity;
    }

    public final void length(boolean z) {
        this.getMin.lambda$listenAppLifecycle$3(z);
    }
}
