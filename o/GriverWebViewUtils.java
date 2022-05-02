package o;

import android.location.Location;
import java.util.List;
import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H&J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lid/dana/domain/nearbyplaces/NearbyPlaceRepository;", "", "getListNearbyLocations", "Lio/reactivex/Observable;", "", "Lid/dana/domain/nearbyplaces/model/NearbyLocation;", "keyword", "", "location", "Landroid/location/Location;", "uuid", "getPlaceDetail", "locationName", "placeId", "domain_release"}, k = 1, mv = {1, 4, 2})
public interface GriverWebViewUtils {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<List<getCreateTime>> getListNearbyLocations(@NotNull String str, @NotNull Location location, @NotNull String str2);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Location> getPlaceDetail(@NotNull String str, @NotNull String str2, @NotNull String str3);
}
