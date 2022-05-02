package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.onUpdateResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lid/dana/domain/geocode/model/LocationSubdisivision;", "", "latitude", "", "longitude", "indoSubdivisions", "Lid/dana/domain/geocode/model/IndoSubdivisions;", "timestamp", "", "(Ljava/lang/String;Ljava/lang/String;Lid/dana/domain/geocode/model/IndoSubdivisions;J)V", "getIndoSubdivisions", "()Lid/dana/domain/geocode/model/IndoSubdivisions;", "isEmpty", "", "()Z", "getLatitude", "()Ljava/lang/String;", "getLongitude", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class GriverPerformanceStages {
    @NotNull
    public static final setMax Companion = new setMax((DefaultConstructorMarker) null);
    @NotNull
    private final onUpdateResult indoSubdivisions;
    @NotNull
    private final String latitude;
    @NotNull
    private final String longitude;
    private final long timestamp;

    public static /* synthetic */ GriverPerformanceStages copy$default(GriverPerformanceStages griverPerformanceStages, String str, String str2, onUpdateResult onupdateresult, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = griverPerformanceStages.latitude;
        }
        if ((i & 2) != 0) {
            str2 = griverPerformanceStages.longitude;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            onupdateresult = griverPerformanceStages.indoSubdivisions;
        }
        onUpdateResult onupdateresult2 = onupdateresult;
        if ((i & 8) != 0) {
            j = griverPerformanceStages.timestamp;
        }
        return griverPerformanceStages.copy(str, str3, onupdateresult2, j);
    }

    @NotNull
    public final String component1() {
        return this.latitude;
    }

    @NotNull
    public final String component2() {
        return this.longitude;
    }

    @NotNull
    public final onUpdateResult component3() {
        return this.indoSubdivisions;
    }

    public final long component4() {
        return this.timestamp;
    }

    @NotNull
    public final GriverPerformanceStages copy(@NotNull String str, @NotNull String str2, @NotNull onUpdateResult onupdateresult, long j) {
        Intrinsics.checkNotNullParameter(str, "latitude");
        Intrinsics.checkNotNullParameter(str2, "longitude");
        Intrinsics.checkNotNullParameter(onupdateresult, "indoSubdivisions");
        return new GriverPerformanceStages(str, str2, onupdateresult, j);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GriverPerformanceStages)) {
            return false;
        }
        GriverPerformanceStages griverPerformanceStages = (GriverPerformanceStages) obj;
        return Intrinsics.areEqual((Object) this.latitude, (Object) griverPerformanceStages.latitude) && Intrinsics.areEqual((Object) this.longitude, (Object) griverPerformanceStages.longitude) && Intrinsics.areEqual((Object) this.indoSubdivisions, (Object) griverPerformanceStages.indoSubdivisions) && this.timestamp == griverPerformanceStages.timestamp;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("LocationSubdisivision(latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        sb.append(this.longitude);
        sb.append(", indoSubdivisions=");
        sb.append(this.indoSubdivisions);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(")");
        return sb.toString();
    }

    public GriverPerformanceStages(@NotNull String str, @NotNull String str2, @NotNull onUpdateResult onupdateresult, long j) {
        Intrinsics.checkNotNullParameter(str, "latitude");
        Intrinsics.checkNotNullParameter(str2, "longitude");
        Intrinsics.checkNotNullParameter(onupdateresult, "indoSubdivisions");
        this.latitude = str;
        this.longitude = str2;
        this.indoSubdivisions = onupdateresult;
        this.timestamp = j;
    }

    @NotNull
    public final String getLatitude() {
        return this.latitude;
    }

    @NotNull
    public final String getLongitude() {
        return this.longitude;
    }

    @NotNull
    public final onUpdateResult getIndoSubdivisions() {
        return this.indoSubdivisions;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final boolean isEmpty() {
        if (!(this.latitude.length() == 0)) {
            return (this.longitude.length() == 0) || this.indoSubdivisions.isEmpty();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lid/dana/domain/geocode/model/LocationSubdisivision$Companion;", "", "()V", "empty", "Lid/dana/domain/geocode/model/LocationSubdisivision;", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final GriverPerformanceStages empty() {
            return new GriverPerformanceStages("", "", new onUpdateResult.length().create(), 0);
        }
    }

    public final int hashCode() {
        String str = this.latitude;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.longitude;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        onUpdateResult onupdateresult = this.indoSubdivisions;
        if (onupdateresult != null) {
            i = onupdateresult.hashCode();
        }
        return ((hashCode2 + i) * 31) + Long.valueOf(this.timestamp).hashCode();
    }
}
