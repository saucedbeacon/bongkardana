package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lid/dana/data/social/repository/source/persistence/entity/FollowingEntity;", "", "followingList", "", "Lid/dana/data/social/repository/source/persistence/entity/FollowingItemEntity;", "paginator", "Lid/dana/data/social/repository/source/persistence/entity/PaginatorEntity;", "(Ljava/util/List;Lid/dana/data/social/repository/source/persistence/entity/PaginatorEntity;)V", "getFollowingList", "()Ljava/util/List;", "getPaginator", "()Lid/dana/data/social/repository/source/persistence/entity/PaginatorEntity;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setAuthExecuteResult {
    @NotNull
    private final List<setShowType> followingList;
    @NotNull
    private final setAuthContentResult paginator;

    public setAuthExecuteResult() {
        this((List) null, (setAuthContentResult) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ setAuthExecuteResult copy$default(setAuthExecuteResult setauthexecuteresult, List<setShowType> list, setAuthContentResult setauthcontentresult, int i, Object obj) {
        if ((i & 1) != 0) {
            list = setauthexecuteresult.followingList;
        }
        if ((i & 2) != 0) {
            setauthcontentresult = setauthexecuteresult.paginator;
        }
        return setauthexecuteresult.copy(list, setauthcontentresult);
    }

    @NotNull
    public final List<setShowType> component1() {
        return this.followingList;
    }

    @NotNull
    public final setAuthContentResult component2() {
        return this.paginator;
    }

    @NotNull
    public final setAuthExecuteResult copy(@NotNull List<setShowType> list, @NotNull setAuthContentResult setauthcontentresult) {
        Intrinsics.checkNotNullParameter(list, "followingList");
        Intrinsics.checkNotNullParameter(setauthcontentresult, "paginator");
        return new setAuthExecuteResult(list, setauthcontentresult);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setAuthExecuteResult)) {
            return false;
        }
        setAuthExecuteResult setauthexecuteresult = (setAuthExecuteResult) obj;
        return Intrinsics.areEqual((Object) this.followingList, (Object) setauthexecuteresult.followingList) && Intrinsics.areEqual((Object) this.paginator, (Object) setauthexecuteresult.paginator);
    }

    public final int hashCode() {
        List<setShowType> list = this.followingList;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        setAuthContentResult setauthcontentresult = this.paginator;
        if (setauthcontentresult != null) {
            i = setauthcontentresult.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowingEntity(followingList=");
        sb.append(this.followingList);
        sb.append(", paginator=");
        sb.append(this.paginator);
        sb.append(")");
        return sb.toString();
    }

    public setAuthExecuteResult(@NotNull List<setShowType> list, @NotNull setAuthContentResult setauthcontentresult) {
        Intrinsics.checkNotNullParameter(list, "followingList");
        Intrinsics.checkNotNullParameter(setauthcontentresult, "paginator");
        this.followingList = list;
        this.paginator = setauthcontentresult;
    }

    public /* synthetic */ setAuthExecuteResult(List list, setAuthContentResult setauthcontentresult, int i, DefaultConstructorMarker defaultConstructorMarker) {
        setAuthExecuteResult setauthexecuteresult;
        setAuthContentResult setauthcontentresult2;
        List emptyList = (i & 1) != 0 ? CollectionsKt.emptyList() : list;
        if ((i & 2) != 0) {
            setauthcontentresult2 = new setAuthContentResult(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (ArrayList) null, 8191, (DefaultConstructorMarker) null);
            setauthexecuteresult = this;
        } else {
            setauthexecuteresult = this;
            setauthcontentresult2 = setauthcontentresult;
        }
        new setAuthExecuteResult(emptyList, setauthcontentresult2);
    }

    @NotNull
    public final List<setShowType> getFollowingList() {
        return this.followingList;
    }

    @NotNull
    public final setAuthContentResult getPaginator() {
        return this.paginator;
    }
}
