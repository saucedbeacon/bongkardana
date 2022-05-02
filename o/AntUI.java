package o;

import id.dana.social.di.module.AccountDeactivationModule;
import o.AUTitleBar;

public final class AntUI implements getAdapterPosition<AUTitleBar.getMin> {
    private final AccountDeactivationModule getMax;

    public static AUTitleBar.getMin getMax(AccountDeactivationModule accountDeactivationModule) {
        AUTitleBar.getMin max = accountDeactivationModule.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        AUTitleBar.getMin max = this.getMax.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
