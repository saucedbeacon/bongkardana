package o;

import id.dana.contract.user.GetBalanceModule;
import o.parameters;

public final class onPostShow implements getAdapterPosition<parameters.getMin> {
    private final GetBalanceModule setMin;

    private onPostShow(GetBalanceModule getBalanceModule) {
        this.setMin = getBalanceModule;
    }

    public static onPostShow setMax(GetBalanceModule getBalanceModule) {
        return new onPostShow(getBalanceModule);
    }

    public final /* synthetic */ Object get() {
        parameters.getMin min = this.setMin.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
