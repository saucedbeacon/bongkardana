package o;

import id.dana.di.modules.RequestMoneyBankListModule;
import o.primaryKeys;

public final class pageStart implements getAdapterPosition<primaryKeys.setMax> {
    private final RequestMoneyBankListModule getMax;

    private pageStart(RequestMoneyBankListModule requestMoneyBankListModule) {
        this.getMax = requestMoneyBankListModule;
    }

    public static pageStart length(RequestMoneyBankListModule requestMoneyBankListModule) {
        return new pageStart(requestMoneyBankListModule);
    }

    public final /* synthetic */ Object get() {
        primaryKeys.setMax min = this.getMax.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
