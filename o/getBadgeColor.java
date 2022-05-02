package o;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0015"}, d2 = {"Lid/dana/data/here/model/Position;", "", "lat", "", "lng", "(Ljava/lang/Double;Ljava/lang/Double;)V", "getLat", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLng", "component1", "component2", "copy", "(Ljava/lang/Double;Ljava/lang/Double;)Lid/dana/data/here/model/Position;", "equals", "", "other", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getBadgeColor {
    @SerializedName("lat")
    @Nullable
    private final Double lat;
    @SerializedName("lng")
    @Nullable
    private final Double lng;

    public static /* synthetic */ getBadgeColor copy$default(getBadgeColor getbadgecolor, Double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = getbadgecolor.lat;
        }
        if ((i & 2) != 0) {
            d2 = getbadgecolor.lng;
        }
        return getbadgecolor.copy(d, d2);
    }

    @Nullable
    public final Double component1() {
        return this.lat;
    }

    @Nullable
    public final Double component2() {
        return this.lng;
    }

    @NotNull
    public final getBadgeColor copy(@Nullable Double d, @Nullable Double d2) {
        return new getBadgeColor(d, d2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getBadgeColor)) {
            return false;
        }
        getBadgeColor getbadgecolor = (getBadgeColor) obj;
        return Intrinsics.areEqual((Object) this.lat, (Object) getbadgecolor.lat) && Intrinsics.areEqual((Object) this.lng, (Object) getbadgecolor.lng);
    }

    public final int hashCode() {
        Double d = this.lat;
        int i = 0;
        int hashCode = (d != null ? d.hashCode() : 0) * 31;
        Double d2 = this.lng;
        if (d2 != null) {
            i = d2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Position(lat=");
        sb.append(this.lat);
        sb.append(", lng=");
        sb.append(this.lng);
        sb.append(")");
        return sb.toString();
    }

    public getBadgeColor(@Nullable Double d, @Nullable Double d2) {
        this.lat = d;
        this.lng = d2;
    }

    @Nullable
    public final Double getLat() {
        return this.lat;
    }

    @Nullable
    public final Double getLng() {
        return this.lng;
    }
}
