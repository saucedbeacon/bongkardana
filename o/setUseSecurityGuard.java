package o;

import android.app.Activity;

public final class setUseSecurityGuard extends setEnv<setUseSecurityGuard, setUseAmcsLite> {
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ setEnv getMax() {
        return this;
    }

    public setUseSecurityGuard(Activity activity) {
        super(activity);
    }

    public final setUseAmcsLite getMin() {
        return new setUseAmcsLite(this.setMax, this.setMin, this.length, this.getMin, this.isInside, this.toFloatRange, this.toIntRange);
    }
}
