package id.dana.sendmoney_v2.landing.di.module;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.setFormat;
import o.setUnit;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/sendmoney_v2/landing/di/module/ManageRecentBankAccountModule;", "", "view", "Lid/dana/sendmoney_v2/landing/contract/ManageRecentBankAccountContract$View;", "(Lid/dana/sendmoney_v2/landing/contract/ManageRecentBankAccountContract$View;)V", "providePresenter", "Lid/dana/sendmoney_v2/landing/contract/ManageRecentBankAccountContract$Presenter;", "presenter", "Lid/dana/sendmoney_v2/landing/contract/ManageRecentBankAccountPresenter;", "provideView", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class ManageRecentBankAccountModule {
    private final setUnit.setMin length;

    public ManageRecentBankAccountModule(@NotNull setUnit.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "view");
        this.length = setmin;
    }

    @NotNull
    @PerActivity
    @Provides
    public final setUnit.setMin getMax() {
        return this.length;
    }

    @NotNull
    @PerActivity
    @Provides
    public final setUnit.getMin getMax(@NotNull setFormat setformat) {
        Intrinsics.checkNotNullParameter(setformat, "presenter");
        return setformat;
    }
}
