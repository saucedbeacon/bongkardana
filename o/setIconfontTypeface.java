package o;

import id.dana.social.di.module.AccountDeactivationModule;
import o.AUTitleBar;
import o.b;

public final class setIconfontTypeface implements getAdapterPosition<AUTitleBar.setMin> {
    private final b.C0007b<getAmountToScroll> getMin;
    private final AccountDeactivationModule setMin;

    public static AUTitleBar.setMin getMin(AccountDeactivationModule accountDeactivationModule, getAmountToScroll getamounttoscroll) {
        AUTitleBar.setMin max = accountDeactivationModule.setMax(getamounttoscroll);
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        AUTitleBar.setMin max = this.setMin.setMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
