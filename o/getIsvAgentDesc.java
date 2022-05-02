package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lid/dana/data/social/repository/source/network/response/FollowingResponse;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "followingList", "", "Lid/dana/data/social/repository/source/network/response/RelationshipItemResponse;", "paginator", "Lid/dana/data/social/repository/source/network/response/PaginatorResponse;", "(Ljava/util/List;Lid/dana/data/social/repository/source/network/response/PaginatorResponse;)V", "getFollowingList", "()Ljava/util/List;", "getPaginator", "()Lid/dana/data/social/repository/source/network/response/PaginatorResponse;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getIsvAgentDesc extends BaseRpcResult {
    @NotNull
    private final List<AuthExecuteResultModel> followingList;
    @NotNull
    private final setIsvAgentDesc paginator;

    public getIsvAgentDesc() {
        this((List) null, (setIsvAgentDesc) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ getIsvAgentDesc copy$default(getIsvAgentDesc getisvagentdesc, List<AuthExecuteResultModel> list, setIsvAgentDesc setisvagentdesc, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getisvagentdesc.followingList;
        }
        if ((i & 2) != 0) {
            setisvagentdesc = getisvagentdesc.paginator;
        }
        return getisvagentdesc.copy(list, setisvagentdesc);
    }

    @NotNull
    public final List<AuthExecuteResultModel> component1() {
        return this.followingList;
    }

    @NotNull
    public final setIsvAgentDesc component2() {
        return this.paginator;
    }

    @NotNull
    public final getIsvAgentDesc copy(@NotNull List<AuthExecuteResultModel> list, @NotNull setIsvAgentDesc setisvagentdesc) {
        Intrinsics.checkNotNullParameter(list, "followingList");
        Intrinsics.checkNotNullParameter(setisvagentdesc, "paginator");
        return new getIsvAgentDesc(list, setisvagentdesc);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getIsvAgentDesc)) {
            return false;
        }
        getIsvAgentDesc getisvagentdesc = (getIsvAgentDesc) obj;
        return Intrinsics.areEqual((Object) this.followingList, (Object) getisvagentdesc.followingList) && Intrinsics.areEqual((Object) this.paginator, (Object) getisvagentdesc.paginator);
    }

    public final int hashCode() {
        List<AuthExecuteResultModel> list = this.followingList;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        setIsvAgentDesc setisvagentdesc = this.paginator;
        if (setisvagentdesc != null) {
            i = setisvagentdesc.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowingResponse(followingList=");
        sb.append(this.followingList);
        sb.append(", paginator=");
        sb.append(this.paginator);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ getIsvAgentDesc(List list, setIsvAgentDesc setisvagentdesc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        getIsvAgentDesc getisvagentdesc;
        setIsvAgentDesc setisvagentdesc2;
        List emptyList = (i & 1) != 0 ? CollectionsKt.emptyList() : list;
        if ((i & 2) != 0) {
            setisvagentdesc2 = new setIsvAgentDesc(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (ArrayList) null, 8191, (DefaultConstructorMarker) null);
            getisvagentdesc = this;
        } else {
            getisvagentdesc = this;
            setisvagentdesc2 = setisvagentdesc;
        }
        new getIsvAgentDesc(emptyList, setisvagentdesc2);
    }

    @NotNull
    public final List<AuthExecuteResultModel> getFollowingList() {
        return this.followingList;
    }

    @NotNull
    public final setIsvAgentDesc getPaginator() {
        return this.paginator;
    }

    public getIsvAgentDesc(@NotNull List<AuthExecuteResultModel> list, @NotNull setIsvAgentDesc setisvagentdesc) {
        Intrinsics.checkNotNullParameter(list, "followingList");
        Intrinsics.checkNotNullParameter(setisvagentdesc, "paginator");
        this.followingList = list;
        this.paginator = setisvagentdesc;
    }
}
