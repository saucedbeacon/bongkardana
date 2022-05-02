package o;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lid/dana/data/globalnetwork/model/UserLocation;", "", "latitude", "", "longitude", "(DD)V", "getLatitude", "()D", "getLongitude", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class RVViewFactory {
    private final double latitude;
    private final double longitude;

    public static /* synthetic */ RVViewFactory copy$default(RVViewFactory rVViewFactory, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = rVViewFactory.latitude;
        }
        if ((i & 2) != 0) {
            d2 = rVViewFactory.longitude;
        }
        return rVViewFactory.copy(d, d2);
    }

    public final double component1() {
        return this.latitude;
    }

    public final double component2() {
        return this.longitude;
    }

    @NotNull
    public final RVViewFactory copy(double d, double d2) {
        return new RVViewFactory(d, d2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RVViewFactory)) {
            return false;
        }
        RVViewFactory rVViewFactory = (RVViewFactory) obj;
        return Double.compare(this.latitude, rVViewFactory.latitude) == 0 && Double.compare(this.longitude, rVViewFactory.longitude) == 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UserLocation(latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        sb.append(this.longitude);
        sb.append(")");
        return sb.toString();
    }

    public RVViewFactory(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final int hashCode() {
        return (Double.valueOf(this.latitude).hashCode() * 31) + Double.valueOf(this.longitude).hashCode();
    }
}
