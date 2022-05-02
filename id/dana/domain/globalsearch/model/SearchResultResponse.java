package id.dana.domain.globalsearch.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lid/dana/domain/globalsearch/model/SearchResultResponse;", "", "searchResultList", "", "Lid/dana/domain/globalsearch/model/PaySearchInfo;", "paginator", "Lid/dana/domain/globalsearch/model/Paginator;", "requiresLocationPermission", "", "(Ljava/util/List;Lid/dana/domain/globalsearch/model/Paginator;Z)V", "getPaginator", "()Lid/dana/domain/globalsearch/model/Paginator;", "getRequiresLocationPermission", "()Z", "getSearchResultList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
@Keep
public final class SearchResultResponse {
    @Nullable
    private final Paginator paginator;
    private final boolean requiresLocationPermission;
    @Nullable
    private final List<PaySearchInfo> searchResultList;

    public static /* synthetic */ SearchResultResponse copy$default(SearchResultResponse searchResultResponse, List<PaySearchInfo> list, Paginator paginator2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = searchResultResponse.searchResultList;
        }
        if ((i & 2) != 0) {
            paginator2 = searchResultResponse.paginator;
        }
        if ((i & 4) != 0) {
            z = searchResultResponse.requiresLocationPermission;
        }
        return searchResultResponse.copy(list, paginator2, z);
    }

    @Nullable
    public final List<PaySearchInfo> component1() {
        return this.searchResultList;
    }

    @Nullable
    public final Paginator component2() {
        return this.paginator;
    }

    public final boolean component3() {
        return this.requiresLocationPermission;
    }

    @NotNull
    public final SearchResultResponse copy(@Nullable List<PaySearchInfo> list, @Nullable Paginator paginator2, boolean z) {
        return new SearchResultResponse(list, paginator2, z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchResultResponse)) {
            return false;
        }
        SearchResultResponse searchResultResponse = (SearchResultResponse) obj;
        return Intrinsics.areEqual((Object) this.searchResultList, (Object) searchResultResponse.searchResultList) && Intrinsics.areEqual((Object) this.paginator, (Object) searchResultResponse.paginator) && this.requiresLocationPermission == searchResultResponse.requiresLocationPermission;
    }

    public final int hashCode() {
        List<PaySearchInfo> list = this.searchResultList;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Paginator paginator2 = this.paginator;
        if (paginator2 != null) {
            i = paginator2.hashCode();
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
        StringBuilder sb = new StringBuilder("SearchResultResponse(searchResultList=");
        sb.append(this.searchResultList);
        sb.append(", paginator=");
        sb.append(this.paginator);
        sb.append(", requiresLocationPermission=");
        sb.append(this.requiresLocationPermission);
        sb.append(")");
        return sb.toString();
    }

    public SearchResultResponse(@Nullable List<PaySearchInfo> list, @Nullable Paginator paginator2, boolean z) {
        this.searchResultList = list;
        this.paginator = paginator2;
        this.requiresLocationPermission = z;
    }

    @Nullable
    public final List<PaySearchInfo> getSearchResultList() {
        return this.searchResultList;
    }

    @Nullable
    public final Paginator getPaginator() {
        return this.paginator;
    }

    public final boolean getRequiresLocationPermission() {
        return this.requiresLocationPermission;
    }
}
