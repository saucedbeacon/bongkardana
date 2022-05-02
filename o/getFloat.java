package o;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0002\u0010\u0007J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0001HÂ\u0003J#\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0006\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lid/dana/data/promoquest/repository/source/network/request/MissionRequestWithStatus;", "Lid/dana/data/promoquest/repository/source/network/request/MissionRequest;", "Ljava/io/Serializable;", "listOfStatus", "", "", "missionRequest", "(Ljava/util/List;Lid/dana/data/promoquest/repository/source/network/request/MissionRequest;)V", "getListOfStatus", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getFloat extends putFloat implements Serializable {
    @NotNull
    private final List<String> listOfStatus;
    private final putFloat missionRequest;

    private final putFloat component2() {
        return this.missionRequest;
    }

    public static /* synthetic */ getFloat copy$default(getFloat getfloat, List<String> list, putFloat putfloat, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getfloat.listOfStatus;
        }
        if ((i & 2) != 0) {
            putfloat = getfloat.missionRequest;
        }
        return getfloat.copy(list, putfloat);
    }

    @NotNull
    public final List<String> component1() {
        return this.listOfStatus;
    }

    @NotNull
    public final getFloat copy(@NotNull List<String> list, @NotNull putFloat putfloat) {
        Intrinsics.checkNotNullParameter(list, "listOfStatus");
        Intrinsics.checkNotNullParameter(putfloat, "missionRequest");
        return new getFloat(list, putfloat);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getFloat)) {
            return false;
        }
        getFloat getfloat = (getFloat) obj;
        return Intrinsics.areEqual((Object) this.listOfStatus, (Object) getfloat.listOfStatus) && Intrinsics.areEqual((Object) this.missionRequest, (Object) getfloat.missionRequest);
    }

    public final int hashCode() {
        List<String> list = this.listOfStatus;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        putFloat putfloat = this.missionRequest;
        if (putfloat != null) {
            i = putfloat.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MissionRequestWithStatus(listOfStatus=");
        sb.append(this.listOfStatus);
        sb.append(", missionRequest=");
        sb.append(this.missionRequest);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final List<String> getListOfStatus() {
        return this.listOfStatus;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getFloat(@NotNull List<String> list, @NotNull putFloat putfloat) {
        super(putfloat.envInfo, putfloat.pageNumber, putfloat.pageSize);
        Intrinsics.checkNotNullParameter(list, "listOfStatus");
        Intrinsics.checkNotNullParameter(putfloat, "missionRequest");
        this.listOfStatus = list;
        this.missionRequest = putfloat;
    }
}
