package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lid/dana/domain/geocode/model/GeocodeReverseConfig;", "", "distanceInMeters", "", "intervalInHours", "", "shouldCallGoogleGeocodeAPI", "", "(Ljava/lang/String;JZ)V", "getDistanceInMeters", "()Ljava/lang/String;", "getIntervalInHours", "()J", "getShouldCallGoogleGeocodeAPI", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class H5BridgeContext {
    @NotNull
    private final String distanceInMeters;
    private final long intervalInHours;
    private final boolean shouldCallGoogleGeocodeAPI;

    public H5BridgeContext() {
        this((String) null, 0, false, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ H5BridgeContext copy$default(H5BridgeContext h5BridgeContext, String str, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = h5BridgeContext.distanceInMeters;
        }
        if ((i & 2) != 0) {
            j = h5BridgeContext.intervalInHours;
        }
        if ((i & 4) != 0) {
            z = h5BridgeContext.shouldCallGoogleGeocodeAPI;
        }
        return h5BridgeContext.copy(str, j, z);
    }

    @NotNull
    public final String component1() {
        return this.distanceInMeters;
    }

    public final long component2() {
        return this.intervalInHours;
    }

    public final boolean component3() {
        return this.shouldCallGoogleGeocodeAPI;
    }

    @NotNull
    public final H5BridgeContext copy(@NotNull String str, long j, boolean z) {
        Intrinsics.checkNotNullParameter(str, "distanceInMeters");
        return new H5BridgeContext(str, j, z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H5BridgeContext)) {
            return false;
        }
        H5BridgeContext h5BridgeContext = (H5BridgeContext) obj;
        return Intrinsics.areEqual((Object) this.distanceInMeters, (Object) h5BridgeContext.distanceInMeters) && this.intervalInHours == h5BridgeContext.intervalInHours && this.shouldCallGoogleGeocodeAPI == h5BridgeContext.shouldCallGoogleGeocodeAPI;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("GeocodeReverseConfig(distanceInMeters=");
        sb.append(this.distanceInMeters);
        sb.append(", intervalInHours=");
        sb.append(this.intervalInHours);
        sb.append(", shouldCallGoogleGeocodeAPI=");
        sb.append(this.shouldCallGoogleGeocodeAPI);
        sb.append(")");
        return sb.toString();
    }

    public H5BridgeContext(@NotNull String str, long j, boolean z) {
        Intrinsics.checkNotNullParameter(str, "distanceInMeters");
        this.distanceInMeters = str;
        this.intervalInHours = j;
        this.shouldCallGoogleGeocodeAPI = z;
    }

    @NotNull
    public final String getDistanceInMeters() {
        return this.distanceInMeters;
    }

    public final long getIntervalInHours() {
        return this.intervalInHours;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H5BridgeContext(String str, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0 : j, (i & 4) != 0 ? false : z);
    }

    public final boolean getShouldCallGoogleGeocodeAPI() {
        return this.shouldCallGoogleGeocodeAPI;
    }

    public final int hashCode() {
        String str = this.distanceInMeters;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Long.valueOf(this.intervalInHours).hashCode()) * 31;
        boolean z = this.shouldCallGoogleGeocodeAPI;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }
}
