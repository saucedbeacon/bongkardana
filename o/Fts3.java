package o;

import android.os.Bundle;
import id.dana.base.BaseActivity;

public final class Fts3 implements removeStateDidChangeHandler {
    private final Bundle setMax;
    private final BaseActivity setMin;

    public Fts3(BaseActivity baseActivity, Bundle bundle) {
        this.setMin = baseActivity;
        this.setMax = bundle;
    }

    public final void getMax() {
        this.setMin.lambda$lazyInitComponents$1(this.setMax);
    }
}
