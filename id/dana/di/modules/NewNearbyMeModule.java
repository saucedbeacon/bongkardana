package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.getOffscreenPageLimit;
import o.s;
import o.setOffscreenPageLimit;
import o.t;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\u0003H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/di/modules/NewNearbyMeModule;", "", "view", "Lid/dana/contract/nearbyme/NewNearbyMeContract$View;", "(Lid/dana/contract/nearbyme/NewNearbyMeContract$View;)V", "provideNearbyMePresenter", "Lid/dana/contract/nearbyme/NewNearbyMeContract$Presenter;", "presenter", "Lid/dana/contract/nearbyme/NewNearbyPresenter;", "provideNearbyMeView", "provideNearbymeTracker", "Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;", "nearbyDefaultTracker", "Lid/dana/nearbyme/tracker/NearbyDefaultTracker;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class NewNearbyMeModule {
    private final getOffscreenPageLimit.setMax getMax;

    public NewNearbyMeModule(@NotNull getOffscreenPageLimit.setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "view");
        this.getMax = setmax;
    }

    @NotNull
    @PerActivity
    @Provides
    public final t setMin(@NotNull s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "nearbyDefaultTracker");
        return sVar;
    }

    @NotNull
    @PerActivity
    @Provides
    public final getOffscreenPageLimit.setMax setMax() {
        return this.getMax;
    }

    @NotNull
    @PerActivity
    @Provides
    public final getOffscreenPageLimit.getMax getMin(@NotNull setOffscreenPageLimit setoffscreenpagelimit) {
        Intrinsics.checkNotNullParameter(setoffscreenpagelimit, "presenter");
        return setoffscreenpagelimit;
    }
}
