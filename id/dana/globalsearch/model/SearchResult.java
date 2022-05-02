package id.dana.globalsearch.model;

import androidx.annotation.Keep;
import id.dana.domain.globalsearch.model.Paginator;
import id.dana.domain.globalsearch.model.PaySearchInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lid/dana/globalsearch/model/SearchResult;", "", "searchResultListEntity", "", "Lid/dana/domain/globalsearch/model/PaySearchInfo;", "paginatorEntity", "Lid/dana/domain/globalsearch/model/Paginator;", "requiresLocationPermission", "", "(Ljava/util/List;Lid/dana/domain/globalsearch/model/Paginator;Z)V", "getPaginatorEntity", "()Lid/dana/domain/globalsearch/model/Paginator;", "getRequiresLocationPermission", "()Z", "getSearchResultListEntity", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Keep
public final class SearchResult {
    @Nullable
    private final Paginator paginatorEntity;
    private final boolean requiresLocationPermission;
    @Nullable
    private final List<PaySearchInfo> searchResultListEntity;

    public static /* synthetic */ SearchResult copy$default(SearchResult searchResult, List<PaySearchInfo> list, Paginator paginator, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = searchResult.searchResultListEntity;
        }
        if ((i & 2) != 0) {
            paginator = searchResult.paginatorEntity;
        }
        if ((i & 4) != 0) {
            z = searchResult.requiresLocationPermission;
        }
        return searchResult.copy(list, paginator, z);
    }

    @Nullable
    public final List<PaySearchInfo> component1() {
        return this.searchResultListEntity;
    }

    @Nullable
    public final Paginator component2() {
        return this.paginatorEntity;
    }

    public final boolean component3() {
        return this.requiresLocationPermission;
    }

    @NotNull
    public final SearchResult copy(@Nullable List<PaySearchInfo> list, @Nullable Paginator paginator, boolean z) {
        return new SearchResult(list, paginator, z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchResult)) {
            return false;
        }
        SearchResult searchResult = (SearchResult) obj;
        return Intrinsics.areEqual((Object) this.searchResultListEntity, (Object) searchResult.searchResultListEntity) && Intrinsics.areEqual((Object) this.paginatorEntity, (Object) searchResult.paginatorEntity) && this.requiresLocationPermission == searchResult.requiresLocationPermission;
    }

    public final int hashCode() {
        List<PaySearchInfo> list = this.searchResultListEntity;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Paginator paginator = this.paginatorEntity;
        if (paginator != null) {
            i = paginator.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.requiresLocationPermission;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchResult(searchResultListEntity=");
        sb.append(this.searchResultListEntity);
        sb.append(", paginatorEntity=");
        sb.append(this.paginatorEntity);
        sb.append(", requiresLocationPermission=");
        sb.append(this.requiresLocationPermission);
        sb.append(")");
        return sb.toString();
    }

    public SearchResult(@Nullable List<PaySearchInfo> list, @Nullable Paginator paginator, boolean z) {
        this.searchResultListEntity = list;
        this.paginatorEntity = paginator;
        this.requiresLocationPermission = z;
    }

    @Nullable
    public final List<PaySearchInfo> getSearchResultListEntity() {
        return this.searchResultListEntity;
    }

    @Nullable
    public final Paginator getPaginatorEntity() {
        return this.paginatorEntity;
    }

    public final boolean getRequiresLocationPermission() {
        return this.requiresLocationPermission;
    }
}
