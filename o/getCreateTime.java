package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lid/dana/domain/nearbyplaces/model/NearbyLocation;", "", "name", "", "description", "placeId", "distanceInMeters", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getDescription", "()Ljava/lang/String;", "getDistanceInMeters", "()J", "getName", "getPlaceId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getCreateTime {
    @NotNull
    private final String description;
    private final long distanceInMeters;
    @NotNull
    private final String name;
    @NotNull
    private final String placeId;

    public static /* synthetic */ getCreateTime copy$default(getCreateTime getcreatetime, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getcreatetime.name;
        }
        if ((i & 2) != 0) {
            str2 = getcreatetime.description;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = getcreatetime.placeId;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            j = getcreatetime.distanceInMeters;
        }
        return getcreatetime.copy(str, str4, str5, j);
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    @NotNull
    public final String component2() {
        return this.description;
    }

    @NotNull
    public final String component3() {
        return this.placeId;
    }

    public final long component4() {
        return this.distanceInMeters;
    }

    @NotNull
    public final getCreateTime copy(@NotNull String str, @NotNull String str2, @NotNull String str3, long j) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "description");
        Intrinsics.checkNotNullParameter(str3, "placeId");
        return new getCreateTime(str, str2, str3, j);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCreateTime)) {
            return false;
        }
        getCreateTime getcreatetime = (getCreateTime) obj;
        return Intrinsics.areEqual((Object) this.name, (Object) getcreatetime.name) && Intrinsics.areEqual((Object) this.description, (Object) getcreatetime.description) && Intrinsics.areEqual((Object) this.placeId, (Object) getcreatetime.placeId) && this.distanceInMeters == getcreatetime.distanceInMeters;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("NearbyLocation(name=");
        sb.append(this.name);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", placeId=");
        sb.append(this.placeId);
        sb.append(", distanceInMeters=");
        sb.append(this.distanceInMeters);
        sb.append(")");
        return sb.toString();
    }

    public getCreateTime(@NotNull String str, @NotNull String str2, @NotNull String str3, long j) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "description");
        Intrinsics.checkNotNullParameter(str3, "placeId");
        this.name = str;
        this.description = str2;
        this.placeId = str3;
        this.distanceInMeters = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getCreateTime(String str, String str2, String str3, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? 0 : j);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final long getDistanceInMeters() {
        return this.distanceInMeters;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPlaceId() {
        return this.placeId;
    }

    public final int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.placeId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + Long.valueOf(this.distanceInMeters).hashCode();
    }
}
