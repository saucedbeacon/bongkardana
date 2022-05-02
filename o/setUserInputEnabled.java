package o;

import id.dana.contract.payqr.PayQrModule;
import o.b;
import o.isUserInputEnabled;

public final class setUserInputEnabled implements getAdapterPosition<isUserInputEnabled.getMax> {
    private final PayQrModule setMax;
    private final b.C0007b<onPageScrollStateChanged> setMin;

    private setUserInputEnabled(PayQrModule payQrModule, b.C0007b<onPageScrollStateChanged> bVar) {
        this.setMax = payQrModule;
        this.setMin = bVar;
    }

    public static setUserInputEnabled getMax(PayQrModule payQrModule, b.C0007b<onPageScrollStateChanged> bVar) {
        return new setUserInputEnabled(payQrModule, bVar);
    }

    public final /* synthetic */ Object get() {
        isUserInputEnabled.getMax min = this.setMax.getMin(this.setMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
