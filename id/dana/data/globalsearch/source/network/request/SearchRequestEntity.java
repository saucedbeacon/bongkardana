package id.dana.data.globalsearch.source.network.request;

import androidx.annotation.Keep;
import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B/\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\nJ8\u0010\u0017\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\f¨\u0006 "}, d2 = {"Lid/dana/data/globalsearch/source/network/request/SearchRequestEntity;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "searchConditionList", "", "Lid/dana/data/globalsearch/source/network/request/SearchConditionEntity;", "page", "", "size", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getPage", "()Ljava/lang/Integer;", "setPage", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSearchConditionList", "()Ljava/util/List;", "setSearchConditionList", "(Ljava/util/List;)V", "getSize", "setSize", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)Lid/dana/data/globalsearch/source/network/request/SearchRequestEntity;", "equals", "", "other", "", "hashCode", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
@Keep
public final class SearchRequestEntity extends BaseRpcRequest {
    @Nullable
    private Integer page;
    @Nullable
    private List<SearchConditionEntity> searchConditionList;
    @Nullable
    private Integer size;

    public SearchRequestEntity() {
        this((List) null, (Integer) null, (Integer) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SearchRequestEntity copy$default(SearchRequestEntity searchRequestEntity, List<SearchConditionEntity> list, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = searchRequestEntity.searchConditionList;
        }
        if ((i & 2) != 0) {
            num = searchRequestEntity.page;
        }
        if ((i & 4) != 0) {
            num2 = searchRequestEntity.size;
        }
        return searchRequestEntity.copy(list, num, num2);
    }

    @Nullable
    public final List<SearchConditionEntity> component1() {
        return this.searchConditionList;
    }

    @Nullable
    public final Integer component2() {
        return this.page;
    }

    @Nullable
    public final Integer component3() {
        return this.size;
    }

    @NotNull
    public final SearchRequestEntity copy(@Nullable List<SearchConditionEntity> list, @Nullable Integer num, @Nullable Integer num2) {
        return new SearchRequestEntity(list, num, num2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchRequestEntity)) {
            return false;
        }
        SearchRequestEntity searchRequestEntity = (SearchRequestEntity) obj;
        return Intrinsics.areEqual((Object) this.searchConditionList, (Object) searchRequestEntity.searchConditionList) && Intrinsics.areEqual((Object) this.page, (Object) searchRequestEntity.page) && Intrinsics.areEqual((Object) this.size, (Object) searchRequestEntity.size);
    }

    public final int hashCode() {
        List<SearchConditionEntity> list = this.searchConditionList;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Integer num = this.page;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.size;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchRequestEntity(searchConditionList=");
        sb.append(this.searchConditionList);
        sb.append(", page=");
        sb.append(this.page);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(")");
        return sb.toString();
    }

    @Nullable
    public final List<SearchConditionEntity> getSearchConditionList() {
        return this.searchConditionList;
    }

    public final void setSearchConditionList(@Nullable List<SearchConditionEntity> list) {
        this.searchConditionList = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchRequestEntity(List list, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? 0 : num, (i & 4) != 0 ? 0 : num2);
    }

    @Nullable
    public final Integer getPage() {
        return this.page;
    }

    public final void setPage(@Nullable Integer num) {
        this.page = num;
    }

    @Nullable
    public final Integer getSize() {
        return this.size;
    }

    public final void setSize(@Nullable Integer num) {
        this.size = num;
    }

    public SearchRequestEntity(@Nullable List<SearchConditionEntity> list, @Nullable Integer num, @Nullable Integer num2) {
        this.searchConditionList = list;
        this.page = num;
        this.size = num2;
    }
}
