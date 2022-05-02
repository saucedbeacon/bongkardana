package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.ShareMenu;
import o.UniformOptionMenuPanelExtensionImpl;
import o.getCancelBtn;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\u0003H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/di/modules/MerchantDetailReviewModule;", "", "view", "Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDetailReviewContract$View;", "(Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDetailReviewContract$View;)V", "provideMerchantDetailAnalyticTracker", "Lid/dana/nearbyme/merchantdetail/tracker/MerchantDetailAnalyticTracker;", "merchantDetailMixpanelTrackers", "Lid/dana/nearbyme/merchantdetail/tracker/MerchantDetailMixpanelTrackers;", "provideMerchantReviewDetail", "provideMerchantReviewDetailPresenter", "Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDetailReviewContract$Presenter;", "merchantDetailReviewPresenter", "Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDetailReviewPresenter;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class MerchantDetailReviewModule {
    private final UniformOptionMenuPanelExtensionImpl.AnonymousClass3.AnonymousClass1.length getMin;

    public MerchantDetailReviewModule(@NotNull UniformOptionMenuPanelExtensionImpl.AnonymousClass3.AnonymousClass1.length length) {
        Intrinsics.checkNotNullParameter(length, "view");
        this.getMin = length;
    }

    @NotNull
    @PerActivity
    @Provides
    public final UniformOptionMenuPanelExtensionImpl.AnonymousClass3.AnonymousClass1.length length() {
        return this.getMin;
    }

    @NotNull
    @PerActivity
    @Provides
    public final UniformOptionMenuPanelExtensionImpl.AnonymousClass3.AnonymousClass1.setMin length(@NotNull getCancelBtn getcancelbtn) {
        Intrinsics.checkNotNullParameter(getcancelbtn, "merchantDetailReviewPresenter");
        return getcancelbtn;
    }

    @NotNull
    @PerActivity
    @Provides
    public final ShareMenu.AnonymousClass1 getMax(@NotNull ShareMenu shareMenu) {
        Intrinsics.checkNotNullParameter(shareMenu, "merchantDetailMixpanelTrackers");
        return shareMenu;
    }
}
