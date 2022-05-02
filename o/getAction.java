package o;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lid/dana/data/nearbyplaces/repository/source/network/result/PlacePredictionResult;", "", "description", "", "distanceInMeters", "", "id", "placeId", "structuredFormatting", "Lid/dana/data/nearbyplaces/repository/source/network/result/PlaceStructuredFormattingResult;", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lid/dana/data/nearbyplaces/repository/source/network/result/PlaceStructuredFormattingResult;)V", "getDescription", "()Ljava/lang/String;", "getDistanceInMeters", "()J", "getId", "getPlaceId", "getStructuredFormatting", "()Lid/dana/data/nearbyplaces/repository/source/network/result/PlaceStructuredFormattingResult;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getAction {
    @NotNull
    private final String description;
    @SerializedName("distance_meters")
    private final long distanceInMeters;
    @NotNull

    /* renamed from: id  reason: collision with root package name */
    private final String f9922id;
    @SerializedName("place_id")
    @NotNull
    private final String placeId;
    @SerializedName("structured_formatting")
    @NotNull
    private final getEventId structuredFormatting;

    public static /* synthetic */ getAction copy$default(getAction getaction, String str, long j, String str2, String str3, getEventId geteventid, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getaction.description;
        }
        if ((i & 2) != 0) {
            j = getaction.distanceInMeters;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str2 = getaction.f9922id;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            str3 = getaction.placeId;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            geteventid = getaction.structuredFormatting;
        }
        return getaction.copy(str, j2, str4, str5, geteventid);
    }

    @NotNull
    public final String component1() {
        return this.description;
    }

    public final long component2() {
        return this.distanceInMeters;
    }

    @NotNull
    public final String component3() {
        return this.f9922id;
    }

    @NotNull
    public final String component4() {
        return this.placeId;
    }

    @NotNull
    public final getEventId component5() {
        return this.structuredFormatting;
    }

    @NotNull
    public final getAction copy(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, @NotNull getEventId geteventid) {
        Intrinsics.checkNotNullParameter(str, "description");
        Intrinsics.checkNotNullParameter(str2, "id");
        Intrinsics.checkNotNullParameter(str3, "placeId");
        Intrinsics.checkNotNullParameter(geteventid, "structuredFormatting");
        return new getAction(str, j, str2, str3, geteventid);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getAction)) {
            return false;
        }
        getAction getaction = (getAction) obj;
        return Intrinsics.areEqual((Object) this.description, (Object) getaction.description) && this.distanceInMeters == getaction.distanceInMeters && Intrinsics.areEqual((Object) this.f9922id, (Object) getaction.f9922id) && Intrinsics.areEqual((Object) this.placeId, (Object) getaction.placeId) && Intrinsics.areEqual((Object) this.structuredFormatting, (Object) getaction.structuredFormatting);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PlacePredictionResult(description=");
        sb.append(this.description);
        sb.append(", distanceInMeters=");
        sb.append(this.distanceInMeters);
        sb.append(", id=");
        sb.append(this.f9922id);
        sb.append(", placeId=");
        sb.append(this.placeId);
        sb.append(", structuredFormatting=");
        sb.append(this.structuredFormatting);
        sb.append(")");
        return sb.toString();
    }

    public getAction(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, @NotNull getEventId geteventid) {
        Intrinsics.checkNotNullParameter(str, "description");
        Intrinsics.checkNotNullParameter(str2, "id");
        Intrinsics.checkNotNullParameter(str3, "placeId");
        Intrinsics.checkNotNullParameter(geteventid, "structuredFormatting");
        this.description = str;
        this.distanceInMeters = j;
        this.f9922id = str2;
        this.placeId = str3;
        this.structuredFormatting = geteventid;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final long getDistanceInMeters() {
        return this.distanceInMeters;
    }

    @NotNull
    public final String getId() {
        return this.f9922id;
    }

    @NotNull
    public final String getPlaceId() {
        return this.placeId;
    }

    @NotNull
    public final getEventId getStructuredFormatting() {
        return this.structuredFormatting;
    }

    public final int hashCode() {
        String str = this.description;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Long.valueOf(this.distanceInMeters).hashCode()) * 31;
        String str2 = this.f9922id;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.placeId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        getEventId geteventid = this.structuredFormatting;
        if (geteventid != null) {
            i = geteventid.hashCode();
        }
        return hashCode3 + i;
    }
}
