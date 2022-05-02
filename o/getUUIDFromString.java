package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lid/dana/explore/model/ExploreServiceWrapper;", "", "itemType", "", "exploreServiceModel", "Lid/dana/explore/service/model/ExploreServiceModel;", "isLastPosition", "", "(ILid/dana/explore/service/model/ExploreServiceModel;Z)V", "getExploreServiceModel", "()Lid/dana/explore/service/model/ExploreServiceModel;", "setExploreServiceModel", "(Lid/dana/explore/service/model/ExploreServiceModel;)V", "()Z", "setLastPosition", "(Z)V", "getItemType", "()I", "setItemType", "(I)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getUUIDFromString {
    @NotNull
    public static final setMax getMin = new setMax((byte) 0);
    public int getMax;
    private boolean length;
    @NotNull
    public MyBeacon setMin;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getUUIDFromString)) {
            return false;
        }
        getUUIDFromString getuuidfromstring = (getUUIDFromString) obj;
        return this.getMax == getuuidfromstring.getMax && Intrinsics.areEqual((Object) this.setMin, (Object) getuuidfromstring.setMin) && this.length == getuuidfromstring.length;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ExploreServiceWrapper(itemType=");
        sb.append(this.getMax);
        sb.append(", exploreServiceModel=");
        sb.append(this.setMin);
        sb.append(", isLastPosition=");
        sb.append(this.length);
        sb.append(")");
        return sb.toString();
    }

    public getUUIDFromString(int i, @NotNull MyBeacon myBeacon, boolean z) {
        Intrinsics.checkNotNullParameter(myBeacon, "exploreServiceModel");
        this.getMax = i;
        this.setMin = myBeacon;
        this.length = z;
    }

    public final boolean getMin() {
        return this.length;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/explore/model/ExploreServiceWrapper$Companion;", "", "()V", "LOADING_SKELETON", "", "SERVICE_ITEM", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public final int hashCode() {
        int hashCode = Integer.valueOf(this.getMax).hashCode() * 31;
        MyBeacon myBeacon = this.setMin;
        int hashCode2 = (hashCode + (myBeacon != null ? myBeacon.hashCode() : 0)) * 31;
        boolean z = this.length;
        if (z) {
            z = true;
        }
        return hashCode2 + (z ? 1 : 0);
    }
}
