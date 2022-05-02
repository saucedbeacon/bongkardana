package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.GriverAppLanguageExtensionImpl;
import o.GriverGeoLocationExtensionImpl;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/di/modules/InvestmentModule;", "", "view", "Lid/dana/investment/contract/InvestmentContract$View;", "(Lid/dana/investment/contract/InvestmentContract$View;)V", "provideInvestmentPresenter", "Lid/dana/investment/contract/InvestmentContract$Presenter;", "presenter", "Lid/dana/investment/presenter/InvestmentPresenter;", "provideInvestmentView", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class InvestmentModule {
    private final GriverAppLanguageExtensionImpl.getMax getMin;

    public InvestmentModule(@NotNull GriverAppLanguageExtensionImpl.getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "view");
        this.getMin = getmax;
    }

    @NotNull
    @PerActivity
    @Provides
    public final GriverAppLanguageExtensionImpl.getMax setMin() {
        return this.getMin;
    }

    @NotNull
    @PerActivity
    @Provides
    public final GriverAppLanguageExtensionImpl.length setMin(@NotNull GriverGeoLocationExtensionImpl.AnonymousClass1 r2) {
        Intrinsics.checkNotNullParameter(r2, "presenter");
        return r2;
    }
}
