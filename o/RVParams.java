package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.addAnimatorUpdateListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lid/dana/data/promocenter/repository/source/local/model/UserCoordinateEntityData;", "", "lat", "", "lon", "(DD)V", "getLat", "()D", "getLon", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class RVParams {
    private final double lat;
    private final double lon;

    final class ParamType implements addAnimatorUpdateListener.getMax {
        private final ParamRequired length;

        public ParamType(ParamRequired paramRequired) {
            this.length = paramRequired;
        }

        public final Object processFacade(Object obj) {
            return ((canOverride) obj).queryAllPromo(this.length);
        }
    }

    public RVParams() {
        this(0.0d, 0.0d, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ RVParams copy$default(RVParams rVParams, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = rVParams.lat;
        }
        if ((i & 2) != 0) {
            d2 = rVParams.lon;
        }
        return rVParams.copy(d, d2);
    }

    public final double component1() {
        return this.lat;
    }

    public final double component2() {
        return this.lon;
    }

    @NotNull
    public final RVParams copy(double d, double d2) {
        return new RVParams(d, d2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RVParams)) {
            return false;
        }
        RVParams rVParams = (RVParams) obj;
        return Double.compare(this.lat, rVParams.lat) == 0 && Double.compare(this.lon, rVParams.lon) == 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UserCoordinateEntityData(lat=");
        sb.append(this.lat);
        sb.append(", lon=");
        sb.append(this.lon);
        sb.append(")");
        return sb.toString();
    }

    public RVParams(double d, double d2) {
        this.lat = d;
        this.lon = d2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RVParams(double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2);
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLon() {
        return this.lon;
    }

    public final int hashCode() {
        return (Double.valueOf(this.lat).hashCode() * 31) + Double.valueOf(this.lon).hashCode();
    }
}
