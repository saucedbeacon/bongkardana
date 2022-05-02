package id.dana.social.di.module;

import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.AUTitleBar;
import o.getAmountToScroll;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/social/di/module/AccountDeactivationModule;", "", "view", "Lid/dana/social/contract/AccountDeactivationContract$View;", "(Lid/dana/social/contract/AccountDeactivationContract$View;)V", "provideAccountDeactivationPresenter", "Lid/dana/social/contract/AccountDeactivationContract$Presenter;", "presenter", "Lid/dana/social/presenter/AccountDeactivationPresenter;", "provideAccountDeactivationView", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class AccountDeactivationModule {
    private final AUTitleBar.getMin getMax;

    public AccountDeactivationModule(@NotNull AUTitleBar.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "view");
        this.getMax = getmin;
    }

    @NotNull
    @Provides
    public final AUTitleBar.getMin getMax() {
        return this.getMax;
    }

    @NotNull
    @Provides
    public final AUTitleBar.setMin setMax(@NotNull getAmountToScroll getamounttoscroll) {
        Intrinsics.checkNotNullParameter(getamounttoscroll, "presenter");
        return getamounttoscroll;
    }
}
