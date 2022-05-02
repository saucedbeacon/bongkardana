package o;

import id.dana.nearbyme.model.ShopModel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H&J \u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H&J\u001a\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005H&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;", "", "trackNearbyFilterSearch", "", "category", "", "trackNearbyHomeShoppingOpen", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "source", "trackNearbyHomeShoppingOrder", "merchantName", "shopName", "trackNearbyOpen", "trackNearbyOpenAllShop", "trackNearbyOpenSearchKeyword", "keyword", "searchType", "trackNearbySearchOpen", "trackOpenMapResult", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface t {
    void getMax();

    void getMax(@NotNull String str, @NotNull String str2, @NotNull String str3);

    void getMin();

    void length(@NotNull String str);

    void length(@NotNull String str, @NotNull String str2);

    void setMax(@NotNull String str);

    void setMin(@NotNull ShopModel shopModel, @NotNull String str);

    void setMin(@NotNull String str, @NotNull String str2);
}
