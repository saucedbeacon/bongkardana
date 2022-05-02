package o;

import java.util.List;
import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J4\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00032\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lid/dana/data/nearbyplaces/NearbyPlaceEntityData;", "", "getDetailLocation", "Lio/reactivex/Observable;", "Lid/dana/data/nearbyplaces/repository/source/network/result/PlaceComponentResult;", "placeId", "", "uuid", "getListNearbyLocations", "", "Lid/dana/data/nearbyplaces/repository/source/network/result/PlacePredictionResult;", "keyword", "lat", "", "lon", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface source {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<print> getDetailLocation(@NotNull String str, @NotNull String str2);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<List<getAction>> getListNearbyLocations(@NotNull String str, double d, double d2, @NotNull String str2);
}
