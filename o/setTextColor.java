package o;

import android.location.Location;
import id.dana.nearbyme.model.ShopModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/contract/nearbyme/NearbyMerchantLocationSearchContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface setTextColor {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H\u0017J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bH\u0017J\u0016\u0010\u0010\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bH\u0017J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0017J\u001e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bH\u0017J\u001e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bH\u0017ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Lid/dana/contract/nearbyme/NearbyMerchantLocationSearchContract$View;", "", "onErrorGetDetailLocation", "", "onErrorGetListLocations", "onErrorGetNearbyMerchantList", "onSuccessGetDetailLocation", "location", "Landroid/location/Location;", "onSuccessGetListLocations", "nearbyLocations", "", "Lid/dana/domain/nearbyplaces/model/NearbyLocation;", "onSuccessGetMerchantListPromo", "shopsWithPromo", "Lid/dana/nearbyme/model/ShopModel;", "onSuccessGetNearbyMerchantList", "shops", "onSuccessGetReverseGeocodeByLocation", "address", "Lid/dana/domain/miniprogram/model/Address;", "onSuccessLoadMoreNearbyMerchantList", "hasMore", "", "onSuccessSearchNearbyMerchantList", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMin {
        @JvmDefault
        void getMin(@NotNull List<? extends ShopModel> list);

        @JvmDefault
        void getMin(boolean z, @NotNull List<? extends ShopModel> list);

        void onErrorGetDetailLocation();

        void onErrorGetListLocations();

        void onSuccessGetDetailLocation(@NotNull Location location);

        void onSuccessGetListLocations(@NotNull List<getCreateTime> list);

        @JvmDefault
        void onSuccessGetReverseGeocodeByLocation(@NotNull processFacade processfacade);

        @JvmDefault
        void setMax();

        @JvmDefault
        void setMin(@NotNull List<? extends ShopModel> list);

        @JvmDefault
        void setMin(boolean z, @NotNull List<? extends ShopModel> list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000bH&J\b\u0010\u000f\u001a\u00020\tH&J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\tH&J\b\u0010\u0014\u001a\u00020\tH&J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0012H&J\"\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u0003H&J\u0016\u0010\u0019\u001a\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH&J\b\u0010\u001d\u001a\u00020\tH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, d2 = {"Lid/dana/contract/nearbyme/NearbyMerchantLocationSearchContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "currentMerchantSearchPage", "", "getCurrentMerchantSearchPage", "()I", "setCurrentMerchantSearchPage", "(I)V", "getDetailLocation", "", "placeId", "", "locationName", "getNearbyMerchantList", "keyword", "getNearbyRankingConfig", "getReverseGeocodeByLocation", "location", "Landroid/location/Location;", "initUuid", "resetSearchMerchant", "searchListNearbyLocations", "currentLocation", "searchListShop", "lastShopRanking", "setPublishSubject", "shopModels", "", "Lid/dana/nearbyme/model/ShopModel;", "subscribeToPublishSubject", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface length extends parentColumns.setMin {
        void getMax();

        void getMax(@NotNull String str);

        void getMin();

        void getMin(@NotNull List<? extends ShopModel> list);

        void length();

        void length(@NotNull String str, @NotNull Location location);

        int setMin();

        void setMin(@NotNull String str, @NotNull Location location, int i);

        void setMin(@NotNull String str, @NotNull String str2);
    }
}
