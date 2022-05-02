package id.dana.di.component;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.GriverPageLoadingExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lid/dana/di/component/MerchantPhotoModule;", "", "view", "Lid/dana/nearbyme/merchantdetail/merchantphoto/MerchantPhotoContract$View;", "(Lid/dana/nearbyme/merchantdetail/merchantphoto/MerchantPhotoContract$View;)V", "getView", "()Lid/dana/nearbyme/merchantdetail/merchantphoto/MerchantPhotoContract$View;", "provideMerchantPhotoView", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class MerchantPhotoModule {
    @NotNull
    private final GriverPageLoadingExtension.setMin length;

    public MerchantPhotoModule(@NotNull GriverPageLoadingExtension.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "view");
        this.length = setmin;
    }

    @NotNull
    @PerActivity
    @Provides
    public final GriverPageLoadingExtension.setMin setMax() {
        return this.length;
    }
}
