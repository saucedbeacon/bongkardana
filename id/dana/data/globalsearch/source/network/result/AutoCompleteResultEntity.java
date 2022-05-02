package id.dana.data.globalsearch.source.network.result;

import androidx.annotation.Keep;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lid/dana/data/globalsearch/source/network/result/AutoCompleteResultEntity;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "searchResultList", "", "Lid/dana/data/globalsearch/source/network/result/PaySearchInfoEntity;", "paginator", "Lid/dana/data/globalsearch/source/network/result/PaginatorEntity;", "(Ljava/util/List;Lid/dana/data/globalsearch/source/network/result/PaginatorEntity;)V", "getPaginator", "()Lid/dana/data/globalsearch/source/network/result/PaginatorEntity;", "getSearchResultList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
@Keep
public final class AutoCompleteResultEntity extends BaseRpcResult {
    @Nullable
    private final PaginatorEntity paginator;
    @NotNull
    private final List<PaySearchInfoEntity> searchResultList;

    public static /* synthetic */ AutoCompleteResultEntity copy$default(AutoCompleteResultEntity autoCompleteResultEntity, List<PaySearchInfoEntity> list, PaginatorEntity paginatorEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            list = autoCompleteResultEntity.searchResultList;
        }
        if ((i & 2) != 0) {
            paginatorEntity = autoCompleteResultEntity.paginator;
        }
        return autoCompleteResultEntity.copy(list, paginatorEntity);
    }

    @NotNull
    public final List<PaySearchInfoEntity> component1() {
        return this.searchResultList;
    }

    @Nullable
    public final PaginatorEntity component2() {
        return this.paginator;
    }

    @NotNull
    public final AutoCompleteResultEntity copy(@NotNull List<PaySearchInfoEntity> list, @Nullable PaginatorEntity paginatorEntity) {
        Intrinsics.checkNotNullParameter(list, "searchResultList");
        return new AutoCompleteResultEntity(list, paginatorEntity);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoCompleteResultEntity)) {
            return false;
        }
        AutoCompleteResultEntity autoCompleteResultEntity = (AutoCompleteResultEntity) obj;
        return Intrinsics.areEqual((Object) this.searchResultList, (Object) autoCompleteResultEntity.searchResultList) && Intrinsics.areEqual((Object) this.paginator, (Object) autoCompleteResultEntity.paginator);
    }

    public final int hashCode() {
        List<PaySearchInfoEntity> list = this.searchResultList;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        PaginatorEntity paginatorEntity = this.paginator;
        if (paginatorEntity != null) {
            i = paginatorEntity.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoCompleteResultEntity(searchResultList=");
        sb.append(this.searchResultList);
        sb.append(", paginator=");
        sb.append(this.paginator);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final List<PaySearchInfoEntity> getSearchResultList() {
        return this.searchResultList;
    }

    @Nullable
    public final PaginatorEntity getPaginator() {
        return this.paginator;
    }

    public AutoCompleteResultEntity(@NotNull List<PaySearchInfoEntity> list, @Nullable PaginatorEntity paginatorEntity) {
        Intrinsics.checkNotNullParameter(list, "searchResultList");
        this.searchResultList = list;
        this.paginator = paginatorEntity;
    }
}
