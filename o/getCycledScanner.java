package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J#\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lid/dana/domain/social/model/Follower;", "", "followerItemList", "", "Lid/dana/domain/social/model/RelationshipItem;", "paginator", "Lid/dana/domain/social/model/Paginator;", "(Ljava/util/List;Lid/dana/domain/social/model/Paginator;)V", "getFollowerItemList", "()Ljava/util/List;", "setFollowerItemList", "(Ljava/util/List;)V", "getPaginator", "()Lid/dana/domain/social/model/Paginator;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getCycledScanner {
    @NotNull
    private List<processScanResult> followerItemList;
    @NotNull
    private final setExtraDataBeaconTracker paginator;

    public getCycledScanner() {
        this((List) null, (setExtraDataBeaconTracker) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ getCycledScanner copy$default(getCycledScanner getcycledscanner, List<processScanResult> list, setExtraDataBeaconTracker setextradatabeacontracker, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getcycledscanner.followerItemList;
        }
        if ((i & 2) != 0) {
            setextradatabeacontracker = getcycledscanner.paginator;
        }
        return getcycledscanner.copy(list, setextradatabeacontracker);
    }

    @NotNull
    public final List<processScanResult> component1() {
        return this.followerItemList;
    }

    @NotNull
    public final setExtraDataBeaconTracker component2() {
        return this.paginator;
    }

    @NotNull
    public final getCycledScanner copy(@NotNull List<processScanResult> list, @NotNull setExtraDataBeaconTracker setextradatabeacontracker) {
        Intrinsics.checkNotNullParameter(list, "followerItemList");
        Intrinsics.checkNotNullParameter(setextradatabeacontracker, "paginator");
        return new getCycledScanner(list, setextradatabeacontracker);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCycledScanner)) {
            return false;
        }
        getCycledScanner getcycledscanner = (getCycledScanner) obj;
        return Intrinsics.areEqual((Object) this.followerItemList, (Object) getcycledscanner.followerItemList) && Intrinsics.areEqual((Object) this.paginator, (Object) getcycledscanner.paginator);
    }

    public final int hashCode() {
        List<processScanResult> list = this.followerItemList;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        setExtraDataBeaconTracker setextradatabeacontracker = this.paginator;
        if (setextradatabeacontracker != null) {
            i = setextradatabeacontracker.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Follower(followerItemList=");
        sb.append(this.followerItemList);
        sb.append(", paginator=");
        sb.append(this.paginator);
        sb.append(")");
        return sb.toString();
    }

    public getCycledScanner(@NotNull List<processScanResult> list, @NotNull setExtraDataBeaconTracker setextradatabeacontracker) {
        Intrinsics.checkNotNullParameter(list, "followerItemList");
        Intrinsics.checkNotNullParameter(setextradatabeacontracker, "paginator");
        this.followerItemList = list;
        this.paginator = setextradatabeacontracker;
    }

    public /* synthetic */ getCycledScanner(List list, setExtraDataBeaconTracker setextradatabeacontracker, int i, DefaultConstructorMarker defaultConstructorMarker) {
        getCycledScanner getcycledscanner;
        setExtraDataBeaconTracker setextradatabeacontracker2;
        List arrayList = (i & 1) != 0 ? new ArrayList() : list;
        if ((i & 2) != 0) {
            setextradatabeacontracker2 = new setExtraDataBeaconTracker(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (ArrayList) null, 8191, (DefaultConstructorMarker) null);
            getcycledscanner = this;
        } else {
            getcycledscanner = this;
            setextradatabeacontracker2 = setextradatabeacontracker;
        }
        new getCycledScanner(arrayList, setextradatabeacontracker2);
    }

    @NotNull
    public final List<processScanResult> getFollowerItemList() {
        return this.followerItemList;
    }

    public final void setFollowerItemList(@NotNull List<processScanResult> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.followerItemList = list;
    }

    @NotNull
    public final setExtraDataBeaconTracker getPaginator() {
        return this.paginator;
    }
}
