package o;

import android.location.Location;
import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H&J&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H&J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0013\u001a\u00020\u000fH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lid/dana/domain/geocode/GeocodeRepository;", "", "getDistrictNameByLocation", "Lio/reactivex/Observable;", "", "location", "Landroid/location/Location;", "getGeocodeReverseConfig", "Lid/dana/domain/geocode/model/GeocodeReverseConfig;", "getIndoSubdivisionsNameByLocation", "Lid/dana/domain/geocode/model/IndoSubdivisions;", "shouldCallGoogleGeocodeAPI", "", "isGpsMockedForUnderLollipop", "getLatestSubdivisions", "Lid/dana/domain/geocode/model/LocationSubdisivision;", "getReverseGeocodeByLoc", "Lid/dana/domain/miniprogram/model/Address;", "saveLatestSubdivisions", "locationSubdisivision", "domain_release"}, k = 1, mv = {1, 4, 2})
public interface APWebViewPerformance {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<String> getDistrictNameByLocation(@NotNull Location location);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<H5BridgeContext> getGeocodeReverseConfig();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<onUpdateResult> getIndoSubdivisionsNameByLocation(@NotNull Location location, boolean z, boolean z2);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<GriverPerformanceStages> getLatestSubdivisions();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<processFacade> getReverseGeocodeByLoc(@NotNull Location location);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> saveLatestSubdivisions(@NotNull GriverPerformanceStages griverPerformanceStages);
}
