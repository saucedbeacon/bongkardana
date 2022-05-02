package id.dana.nearbyme.di.module;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import id.dana.nearbyme.merchantdetail.model.MerchantImageModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.GRVAppFavoriteMenuItem;
import o.positiveString;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lid/dana/nearbyme/di/module/MerchantPhotoViewerModule;", "", "view", "Lid/dana/nearbyme/merchantdetail/mediaviewer/MediaViewerContract$View;", "Lid/dana/nearbyme/merchantdetail/model/MerchantImageModel;", "(Lid/dana/nearbyme/merchantdetail/mediaviewer/MediaViewerContract$View;)V", "getView", "()Lid/dana/nearbyme/merchantdetail/mediaviewer/MediaViewerContract$View;", "provideMerchantPhotoViewerPresenter", "Lid/dana/nearbyme/merchantdetail/mediaviewer/MediaViewerContract$Presenter;", "presenter", "Lid/dana/nearbyme/merchantdetail/merchantphoto/MerchantPhotoViewerPresenter;", "provideView", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class MerchantPhotoViewerModule {
    @NotNull
    private final positiveString.setMin<MerchantImageModel> getMin;

    public MerchantPhotoViewerModule(@NotNull positiveString.setMin<MerchantImageModel> setmin) {
        Intrinsics.checkNotNullParameter(setmin, "view");
        this.getMin = setmin;
    }

    @PerActivity
    @NotNull
    @Provides
    public final positiveString.setMin<MerchantImageModel> length() {
        return this.getMin;
    }

    @PerActivity
    @NotNull
    @Provides
    public final positiveString.length<MerchantImageModel> getMax(@NotNull GRVAppFavoriteMenuItem.AnonymousClass1 r2) {
        Intrinsics.checkNotNullParameter(r2, "presenter");
        return r2;
    }
}
