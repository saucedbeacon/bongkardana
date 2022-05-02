package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.ShareMenu;
import o.s;
import o.t;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Lid/dana/di/modules/MerchantDetailActionInfoModule;", "", "()V", "provideMerchantDetailAnalyticTracker", "Lid/dana/nearbyme/merchantdetail/tracker/MerchantDetailAnalyticTracker;", "merchantDetailMixpanelTrackers", "Lid/dana/nearbyme/merchantdetail/tracker/MerchantDetailMixpanelTrackers;", "provideNearbymeTracker", "Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;", "nearbyDefaultTracker", "Lid/dana/nearbyme/tracker/NearbyDefaultTracker;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class MerchantDetailActionInfoModule {
    @NotNull
    @PerActivity
    @Provides
    public final ShareMenu.AnonymousClass1 getMin(@NotNull ShareMenu shareMenu) {
        Intrinsics.checkNotNullParameter(shareMenu, "merchantDetailMixpanelTrackers");
        return shareMenu;
    }

    @NotNull
    @PerActivity
    @Provides
    public final t setMin(@NotNull s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "nearbyDefaultTracker");
        return sVar;
    }
}
