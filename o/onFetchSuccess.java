package o;

import id.dana.di.modules.RequestMoneyBankListModule;
import o.b;
import o.primaryKeys;

public final class onFetchSuccess implements getAdapterPosition<primaryKeys.setMin> {
    private final RequestMoneyBankListModule getMax;
    private final b.C0007b<foreignKeys> length;

    private onFetchSuccess(RequestMoneyBankListModule requestMoneyBankListModule, b.C0007b<foreignKeys> bVar) {
        this.getMax = requestMoneyBankListModule;
        this.length = bVar;
    }

    public static onFetchSuccess setMax(RequestMoneyBankListModule requestMoneyBankListModule, b.C0007b<foreignKeys> bVar) {
        return new onFetchSuccess(requestMoneyBankListModule, bVar);
    }

    public final /* synthetic */ Object get() {
        primaryKeys.setMin min = this.getMax.getMin(this.length.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
