package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.UniformOptionMenuPanelExtensionImpl;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\u0003H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lid/dana/di/modules/MerchantDanaDealsModule;", "", "merchantDanaDealsView", "Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDanaDealsContract$View;", "(Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDanaDealsContract$View;)V", "getMerchantDanaDealsView", "()Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDanaDealsContract$View;", "provideMerchantDealsPresenter", "Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDanaDealsContract$Presenter;", "merchantDanaDealsPresenter", "Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDanaDealsPresenter;", "provideView", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class MerchantDanaDealsModule {
    @NotNull
    private final UniformOptionMenuPanelExtensionImpl.AnonymousClass1.AnonymousClass1.length getMin;

    public MerchantDanaDealsModule(@NotNull UniformOptionMenuPanelExtensionImpl.AnonymousClass1.AnonymousClass1.length length) {
        Intrinsics.checkNotNullParameter(length, "merchantDanaDealsView");
        this.getMin = length;
    }

    @NotNull
    @Provides
    public final UniformOptionMenuPanelExtensionImpl.AnonymousClass1.AnonymousClass1.getMin getMax(@NotNull UniformOptionMenuPanelExtensionImpl.AnonymousClass7 r2) {
        Intrinsics.checkNotNullParameter(r2, "merchantDanaDealsPresenter");
        return r2;
    }

    @NotNull
    @Provides
    public final UniformOptionMenuPanelExtensionImpl.AnonymousClass1.AnonymousClass1.length setMax() {
        return this.getMin;
    }
}
