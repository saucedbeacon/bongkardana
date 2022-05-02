package o;

import android.location.Location;
import java.util.List;
import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\bH&JN\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH&JF\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\bH&J\"\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H&JN\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00032\u0006\u0010%\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H&J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003H&J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006(À\u0006\u0001"}, d2 = {"Lid/dana/domain/nearbyme/NearbyMeRepository;", "", "getCachedNearbyShops", "Lio/reactivex/Observable;", "Lid/dana/domain/nearbyme/model/ShopsPage;", "getDefaultNearbyRankingConfig", "Lid/dana/domain/nearbyme/model/NearbyRankingConfig;", "nearbyVersion", "", "getNearbyAutoSearchConfig", "Lid/dana/domain/nearbyme/model/NearbyAutoSearchConfig;", "getNearbyRankingConfig", "getNearbyShopByRadius", "currentLocation", "Landroid/location/Location;", "radius", "", "pageNum", "pageSize", "onInit", "", "useNewMerchantCategory", "searchKeyword", "searchType", "getNearbyShops", "latitude", "", "longitude", "source", "getNearbyShopsPromo", "", "Lid/dana/domain/nearbyme/model/NearbyShopsPromo;", "merchantInfos", "", "Lid/dana/domain/nearbyme/model/MerchantInfo;", "getOtherStoreList", "Lid/dana/domain/nearbyme/model/OtherStoreListResult;", "merchantId", "isNeedToShowOnboardingTooltip", "saveShowOnboardingTooltip", "domain_release"}, k = 1, mv = {1, 4, 2})
public interface isRooted {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<H5FileUtil> getCachedNearbyShops();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<clearTempPath> getDefaultNearbyRankingConfig(@NotNull String str);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<getCacheDir> getNearbyAutoSearchConfig();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<clearTempPath> getNearbyRankingConfig(@NotNull String str);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<H5FileUtil> getNearbyShopByRadius(@NotNull Location location, int i, int i2, int i3, boolean z, boolean z2, @NotNull String str, @NotNull String str2);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<H5FileUtil> getNearbyShops(double d, double d2, int i, int i2, @NotNull String str, boolean z, @NotNull String str2);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<List<getTempPath>> getNearbyShopsPromo(@NotNull List<getUtdidEncrypt> list);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<getCachePath> getOtherStoreList(@NotNull String str, double d, double d2, int i, int i2, @NotNull String str2, @NotNull String str3, boolean z);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> isNeedToShowOnboardingTooltip();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> saveShowOnboardingTooltip();
}
