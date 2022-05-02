package o;

import android.location.Location;
import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\n\u001a\u00020\u0004H&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\u0006\u0010\u0011\u001a\u00020\bH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lid/dana/data/geocode/repository/source/GeocodeEntityData;", "", "getDistrictNameByLocation", "Lio/reactivex/Observable;", "", "location", "Landroid/location/Location;", "getLatestLocationSubdisivision", "Lid/dana/domain/geocode/model/LocationSubdisivision;", "getLocationFromLocationName", "locationName", "getReverseGeocodeByLoc", "Lid/dana/domain/miniprogram/model/Address;", "getSubdivisionsFromGeocoder", "Lid/dana/domain/geocode/model/IndoSubdivisions;", "saveLatestLocationSubdisivision", "", "locationSubdisivision", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface onInitSuccess {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<String> getDistrictNameByLocation(@NotNull Location location);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<GriverPerformanceStages> getLatestLocationSubdisivision();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Location> getLocationFromLocationName(@NotNull String str);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<processFacade> getReverseGeocodeByLoc(@NotNull Location location);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<onUpdateResult> getSubdivisionsFromGeocoder(@NotNull Location location);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> saveLatestLocationSubdisivision(@NotNull GriverPerformanceStages griverPerformanceStages);
}
