package o;

import android.location.Location;
import id.dana.domain.globalsearch.model.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0004"}, d2 = {"toLatLng", "Lid/dana/domain/globalsearch/model/LatLng;", "Landroid/location/Location;", "toLocation", "domain_release"}, k = 2, mv = {1, 4, 2})
public final class GriverAppLanguageExtension {
    @NotNull
    public static final Location toLocation(@NotNull LatLng latLng) {
        Intrinsics.checkNotNullParameter(latLng, "$this$toLocation");
        Location location = new Location("");
        location.setLatitude(latLng.getLatitude());
        location.setLongitude(latLng.getLongitude());
        return location;
    }

    @NotNull
    public static final LatLng toLatLng(@NotNull Location location) {
        Intrinsics.checkNotNullParameter(location, "$this$toLatLng");
        return new LatLng(location.getLatitude(), location.getLongitude());
    }
}
