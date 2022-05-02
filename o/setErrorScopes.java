package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lid/dana/data/social/repository/source/persistence/entity/FollowerEntity;", "", "followerList", "", "Lid/dana/data/social/repository/source/persistence/entity/FollowerItemEntity;", "paginator", "Lid/dana/data/social/repository/source/persistence/entity/PaginatorEntity;", "(Ljava/util/List;Lid/dana/data/social/repository/source/persistence/entity/PaginatorEntity;)V", "getFollowerList", "()Ljava/util/List;", "getPaginator", "()Lid/dana/data/social/repository/source/persistence/entity/PaginatorEntity;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setErrorScopes {
    @NotNull
    private final List<AuthSkipResultModel> followerList;
    @NotNull
    private final setAuthContentResult paginator;

    public setErrorScopes() {
        this((List) null, (setAuthContentResult) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ setErrorScopes copy$default(setErrorScopes seterrorscopes, List<AuthSkipResultModel> list, setAuthContentResult setauthcontentresult, int i, Object obj) {
        if ((i & 1) != 0) {
            list = seterrorscopes.followerList;
        }
        if ((i & 2) != 0) {
            setauthcontentresult = seterrorscopes.paginator;
        }
        return seterrorscopes.copy(list, setauthcontentresult);
    }

    @NotNull
    public final List<AuthSkipResultModel> component1() {
        return this.followerList;
    }

    @NotNull
    public final setAuthContentResult component2() {
        return this.paginator;
    }

    @NotNull
    public final setErrorScopes copy(@NotNull List<AuthSkipResultModel> list, @NotNull setAuthContentResult setauthcontentresult) {
        Intrinsics.checkNotNullParameter(list, "followerList");
        Intrinsics.checkNotNullParameter(setauthcontentresult, "paginator");
        return new setErrorScopes(list, setauthcontentresult);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setErrorScopes)) {
            return false;
        }
        setErrorScopes seterrorscopes = (setErrorScopes) obj;
        return Intrinsics.areEqual((Object) this.followerList, (Object) seterrorscopes.followerList) && Intrinsics.areEqual((Object) this.paginator, (Object) seterrorscopes.paginator);
    }

    public final int hashCode() {
        List<AuthSkipResultModel> list = this.followerList;
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
        StringBuilder sb = new StringBuilder("FollowerEntity(followerList=");
        sb.append(this.followerList);
        sb.append(", paginator=");
        sb.append(this.paginator);
        sb.append(")");
        return sb.toString();
    }

    public setErrorScopes(@NotNull List<AuthSkipResultModel> list, @NotNull setAuthContentResult setauthcontentresult) {
        Intrinsics.checkNotNullParameter(list, "followerList");
        Intrinsics.checkNotNullParameter(setauthcontentresult, "paginator");
        this.followerList = list;
        this.paginator = setauthcontentresult;
    }

    public /* synthetic */ setErrorScopes(List list, setAuthContentResult setauthcontentresult, int i, DefaultConstructorMarker defaultConstructorMarker) {
        setErrorScopes seterrorscopes;
        setAuthContentResult setauthcontentresult2;
        List emptyList = (i & 1) != 0 ? CollectionsKt.emptyList() : list;
        if ((i & 2) != 0) {
            setauthcontentresult2 = new setAuthContentResult(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (ArrayList) null, 8191, (DefaultConstructorMarker) null);
            seterrorscopes = this;
        } else {
            seterrorscopes = this;
            setauthcontentresult2 = setauthcontentresult;
        }
        new setErrorScopes(emptyList, setauthcontentresult2);
    }

    @NotNull
    public final List<AuthSkipResultModel> getFollowerList() {
        return this.followerList;
    }

    @NotNull
    public final setAuthContentResult getPaginator() {
        return this.paginator;
    }
}
