package o;

import id.dana.contract.payqr.PayQrModule;
import o.isUserInputEnabled;

public final class unregisterOnPageChangeCallback implements getAdapterPosition<isUserInputEnabled.length> {
    private final PayQrModule setMax;

    private unregisterOnPageChangeCallback(PayQrModule payQrModule) {
        this.setMax = payQrModule;
    }

    public static unregisterOnPageChangeCallback setMax(PayQrModule payQrModule) {
        return new unregisterOnPageChangeCallback(payQrModule);
    }

    public final /* synthetic */ Object get() {
        isUserInputEnabled.length min = this.setMax.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
