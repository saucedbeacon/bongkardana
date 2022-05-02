package o;

import id.dana.sendmoney.di.module.SendMoneyV2Module;
import o.b;
import o.onFailure;

public final class onResourceReady implements getAdapterPosition<onFailure.getMin> {
    private final b.C0007b<BindBool> getMax;
    private final SendMoneyV2Module setMin;

    public static onFailure.getMin getMax(SendMoneyV2Module sendMoneyV2Module, BindBool bindBool) {
        onFailure.getMin min = sendMoneyV2Module.setMin(bindBool);
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        onFailure.getMin min = this.setMin.setMin(this.getMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
