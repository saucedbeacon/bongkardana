package id.dana.data.globalsearch.source.network.request;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J'\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lid/dana/data/globalsearch/source/network/request/SearchConditionEntity;", "", "searchType", "", "keyword", "", "(Ljava/lang/String;Ljava/util/List;)V", "getKeyword", "()Ljava/util/List;", "getSearchType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
@Keep
public final class SearchConditionEntity {
    @Nullable
    private final List<String> keyword;
    @Nullable
    private final String searchType;

    public SearchConditionEntity() {
        this((String) null, (List) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SearchConditionEntity copy$default(SearchConditionEntity searchConditionEntity, String str, List<String> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchConditionEntity.searchType;
        }
        if ((i & 2) != 0) {
            list = searchConditionEntity.keyword;
        }
        return searchConditionEntity.copy(str, list);
    }

    @Nullable
    public final String component1() {
        return this.searchType;
    }

    @Nullable
    public final List<String> component2() {
        return this.keyword;
    }

    @NotNull
    public final SearchConditionEntity copy(@Nullable String str, @Nullable List<String> list) {
        return new SearchConditionEntity(str, list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchConditionEntity)) {
            return false;
        }
        SearchConditionEntity searchConditionEntity = (SearchConditionEntity) obj;
        return Intrinsics.areEqual((Object) this.searchType, (Object) searchConditionEntity.searchType) && Intrinsics.areEqual((Object) this.keyword, (Object) searchConditionEntity.keyword);
    }

    public final int hashCode() {
        String str = this.searchType;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.keyword;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchConditionEntity(searchType=");
        sb.append(this.searchType);
        sb.append(", keyword=");
        sb.append(this.keyword);
        sb.append(")");
        return sb.toString();
    }

    public SearchConditionEntity(@Nullable String str, @Nullable List<String> list) {
        this.searchType = str;
        this.keyword = list;
    }

    @Nullable
    public final String getSearchType() {
        return this.searchType;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchConditionEntity(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }

    @Nullable
    public final List<String> getKeyword() {
        return this.keyword;
    }
}
