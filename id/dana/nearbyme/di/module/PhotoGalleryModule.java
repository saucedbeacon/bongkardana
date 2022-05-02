package id.dana.nearbyme.di.module;

import dagger.Module;
import dagger.Provides;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.di.PerActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.GriverBaseFragment;
import o.negativeListener;
import o.negativeString;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0006H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lid/dana/nearbyme/di/module/PhotoGalleryModule;", "", "merchantId", "", "shopId", "view", "Lid/dana/nearbyme/merchantdetail/mediaviewer/PhotoGalleryContract$View;", "(Ljava/lang/String;Ljava/lang/String;Lid/dana/nearbyme/merchantdetail/mediaviewer/PhotoGalleryContract$View;)V", "getMerchantId", "()Ljava/lang/String;", "getShopId", "getView", "()Lid/dana/nearbyme/merchantdetail/mediaviewer/PhotoGalleryContract$View;", "provideMerchantPhotoGalleryModel", "Lid/dana/nearbyme/merchantdetail/mediaviewer/MerchantPhotoGalleryModel;", "providePhotoGalleryPresenter", "Lid/dana/nearbyme/merchantdetail/mediaviewer/PhotoGalleryContract$Presenter;", "presenter", "Lid/dana/nearbyme/merchantdetail/mediaviewer/PhotoGalleryPresenter;", "provideView", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class PhotoGalleryModule {
    @NotNull
    private final negativeListener.length getMin;
    @NotNull
    private final String length;
    @NotNull
    private final String setMax;

    public PhotoGalleryModule(@NotNull String str, @NotNull String str2, @NotNull negativeListener.length length2) {
        Intrinsics.checkNotNullParameter(str, "merchantId");
        Intrinsics.checkNotNullParameter(str2, FeatureParams.SHOP_ID);
        Intrinsics.checkNotNullParameter(length2, "view");
        this.setMax = str;
        this.length = str2;
        this.getMin = length2;
    }

    @NotNull
    @PerActivity
    @Provides
    public final negativeListener.length getMin() {
        return this.getMin;
    }

    @NotNull
    @PerActivity
    @Provides
    public final negativeString getMax() {
        return new negativeString(this.setMax, this.length);
    }

    @NotNull
    @PerActivity
    @Provides
    public final negativeListener.getMax length(@NotNull GriverBaseFragment.Main main) {
        Intrinsics.checkNotNullParameter(main, "presenter");
        return main;
    }
}
