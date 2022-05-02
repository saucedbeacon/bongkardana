package o;

import id.dana.base.BaseActivity;

public final class deferred implements removeStateDidChangeHandler {
    private final BaseActivity getMax;

    public deferred(BaseActivity baseActivity) {
        this.getMax = baseActivity;
    }

    public final void getMax() {
        this.getMax.lambda$lazyInitComponents$0();
    }
}
