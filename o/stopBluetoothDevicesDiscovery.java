package o;

import android.location.Location;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0007¨\u0006\u000e"}, d2 = {"Lid/dana/domain/util/LocationUtil;", "", "()V", "getDistance", "", "lat1", "", "lon1", "lat2", "lon2", "latLonToLocation", "Landroid/location/Location;", "lat", "lon", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class stopBluetoothDevicesDiscovery {
    @NotNull
    public static final stopBluetoothDevicesDiscovery INSTANCE = new stopBluetoothDevicesDiscovery();

    private stopBluetoothDevicesDiscovery() {
    }

    @JvmStatic
    @NotNull
    public static final Location latLonToLocation(double d, double d2) {
        Location location = new Location("");
        location.setLatitude(d);
        location.setLongitude(d2);
        return location;
    }

    @JvmStatic
    public static final float getDistance(double d, double d2, double d3, double d4) {
        return latLonToLocation(d, d2).distanceTo(latLonToLocation(d3, d4));
    }
}
