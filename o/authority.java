package o;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.AppPreDownloadCacheManager;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\r\u001a\u00020\tH\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\r\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/data/qriscrossborder/QrisCrossBorderEntityRepository;", "Lid/dana/domain/qriscrossborder/QrisCrossBorderRepository;", "qrisCrossBorderEntityDataFactory", "Lid/dana/data/qriscrossborder/source/QrisCrossBorderEntityDataFactory;", "(Lid/dana/data/qriscrossborder/source/QrisCrossBorderEntityDataFactory;)V", "createLocalData", "Lid/dana/data/qriscrossborder/source/QrisCrossBorderEntityData;", "getCurrentCountry", "Lio/reactivex/Observable;", "", "getOriginCountry", "saveCurrentCountry", "", "countryCode", "saveOriginCountry", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class authority implements AppPreDownloadCacheManager.AnonymousClass1 {
    private final BridgeGuard setMax;

    @Inject
    public authority(@NotNull BridgeGuard bridgeGuard) {
        Intrinsics.checkNotNullParameter(bridgeGuard, "qrisCrossBorderEntityDataFactory");
        this.setMax = bridgeGuard;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveOriginCountry(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
        BridgeGuard bridgeGuard = this.setMax;
        Intrinsics.checkNotNullParameter("local", "source");
        return bridgeGuard.setMax.getMin(str);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveCurrentCountry(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
        BridgeGuard bridgeGuard = this.setMax;
        Intrinsics.checkNotNullParameter("local", "source");
        return bridgeGuard.setMax.setMin(str);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<String> getCurrentCountry() {
        BridgeGuard bridgeGuard = this.setMax;
        Intrinsics.checkNotNullParameter("local", "source");
        return bridgeGuard.setMax.setMin();
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<String> getOriginCountry() {
        BridgeGuard bridgeGuard = this.setMax;
        Intrinsics.checkNotNullParameter("local", "source");
        return bridgeGuard.setMax.length();
    }
}
