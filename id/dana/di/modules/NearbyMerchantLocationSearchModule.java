package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.s;
import o.setTextColor;
import o.t;
import o.updateText;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\b\rJ\r\u0010\u000e\u001a\u00020\u0003H\u0001¢\u0006\u0002\b\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lid/dana/di/modules/NearbyMerchantLocationSearchModule;", "", "view", "Lid/dana/contract/nearbyme/NearbyMerchantLocationSearchContract$View;", "(Lid/dana/contract/nearbyme/NearbyMerchantLocationSearchContract$View;)V", "provideNearbymeTracker", "Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;", "nearbyDefaultTracker", "Lid/dana/nearbyme/tracker/NearbyDefaultTracker;", "providePresenter", "Lid/dana/contract/nearbyme/NearbyMerchantLocationSearchContract$Presenter;", "presenter", "Lid/dana/contract/nearbyme/NearbyMerchantLocationSearchPresenter;", "providePresenter$app_productionRelease", "provideView", "provideView$app_productionRelease", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class NearbyMerchantLocationSearchModule {
    private final setTextColor.getMin getMax;

    public NearbyMerchantLocationSearchModule(@NotNull setTextColor.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "view");
        this.getMax = getmin;
    }

    @NotNull
    @Provides
    public final setTextColor.getMin setMax() {
        return this.getMax;
    }

    @NotNull
    @Provides
    public final setTextColor.length getMin(@NotNull updateText updatetext) {
        Intrinsics.checkNotNullParameter(updatetext, "presenter");
        return updatetext;
    }

    @NotNull
    @PerActivity
    @Provides
    public final t setMax(@NotNull s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "nearbyDefaultTracker");
        return sVar;
    }
}
