package id.dana.nearbyme.di.module;

import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.dataSetChanged;
import o.distanceInfluenceForSnapDuration;
import o.s;
import o.t;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\u0003H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/nearbyme/di/module/OtherStoreListModule;", "", "view", "Lid/dana/contract/nearbyme/OtherStoreListContract$View;", "(Lid/dana/contract/nearbyme/OtherStoreListContract$View;)V", "provideNearbyAnalyticTracker", "Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;", "nearbyDefaultTracker", "Lid/dana/nearbyme/tracker/NearbyDefaultTracker;", "provideOtherStoreListView", "provideOtherStorePresenter", "Lid/dana/contract/nearbyme/OtherStoreListContract$Presenter;", "presenter", "Lid/dana/contract/nearbyme/OtherStoreListPresenter;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class OtherStoreListModule {
    private final distanceInfluenceForSnapDuration.setMin getMax;

    public OtherStoreListModule(@NotNull distanceInfluenceForSnapDuration.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "view");
        this.getMax = setmin;
    }

    @NotNull
    @Provides
    public final distanceInfluenceForSnapDuration.setMin setMax() {
        return this.getMax;
    }

    @NotNull
    @Provides
    public final distanceInfluenceForSnapDuration.getMax getMax(@NotNull dataSetChanged datasetchanged) {
        Intrinsics.checkNotNullParameter(datasetchanged, "presenter");
        return datasetchanged;
    }

    @NotNull
    @Provides
    public final t length(@NotNull s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "nearbyDefaultTracker");
        return sVar;
    }
}
