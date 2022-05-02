package id.dana.data.globalsearch.source.network.request;

import androidx.annotation.Keep;
import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B5\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006 "}, d2 = {"Lid/dana/data/globalsearch/source/network/request/AutoCompleteRequestEntity;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "contextConditions", "", "Lid/dana/data/globalsearch/source/network/request/ContextConditionEntity;", "searchType", "", "suggestKeyword", "page", "", "size", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;II)V", "getContextConditions", "()Ljava/util/List;", "getPage", "()I", "getSearchType", "()Ljava/lang/String;", "getSize", "getSuggestKeyword", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
@Keep
public final class AutoCompleteRequestEntity extends BaseRpcRequest {
    @Nullable
    private final List<ContextConditionEntity> contextConditions;
    private final int page;
    @NotNull
    private final String searchType;
    private final int size;
    @NotNull
    private final String suggestKeyword;

    public static /* synthetic */ AutoCompleteRequestEntity copy$default(AutoCompleteRequestEntity autoCompleteRequestEntity, List<ContextConditionEntity> list, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = autoCompleteRequestEntity.contextConditions;
        }
        if ((i3 & 2) != 0) {
            str = autoCompleteRequestEntity.searchType;
        }
        String str3 = str;
        if ((i3 & 4) != 0) {
            str2 = autoCompleteRequestEntity.suggestKeyword;
        }
        String str4 = str2;
        if ((i3 & 8) != 0) {
            i = autoCompleteRequestEntity.page;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = autoCompleteRequestEntity.size;
        }
        return autoCompleteRequestEntity.copy(list, str3, str4, i4, i2);
    }

    @Nullable
    public final List<ContextConditionEntity> component1() {
        return this.contextConditions;
    }

    @NotNull
    public final String component2() {
        return this.searchType;
    }

    @NotNull
    public final String component3() {
        return this.suggestKeyword;
    }

    public final int component4() {
        return this.page;
    }

    public final int component5() {
        return this.size;
    }

    @NotNull
    public final AutoCompleteRequestEntity copy(@Nullable List<ContextConditionEntity> list, @NotNull String str, @NotNull String str2, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "searchType");
        Intrinsics.checkNotNullParameter(str2, "suggestKeyword");
        return new AutoCompleteRequestEntity(list, str, str2, i, i2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoCompleteRequestEntity)) {
            return false;
        }
        AutoCompleteRequestEntity autoCompleteRequestEntity = (AutoCompleteRequestEntity) obj;
        return Intrinsics.areEqual((Object) this.contextConditions, (Object) autoCompleteRequestEntity.contextConditions) && Intrinsics.areEqual((Object) this.searchType, (Object) autoCompleteRequestEntity.searchType) && Intrinsics.areEqual((Object) this.suggestKeyword, (Object) autoCompleteRequestEntity.suggestKeyword) && this.page == autoCompleteRequestEntity.page && this.size == autoCompleteRequestEntity.size;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoCompleteRequestEntity(contextConditions=");
        sb.append(this.contextConditions);
        sb.append(", searchType=");
        sb.append(this.searchType);
        sb.append(", suggestKeyword=");
        sb.append(this.suggestKeyword);
        sb.append(", page=");
        sb.append(this.page);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(")");
        return sb.toString();
    }

    @Nullable
    public final List<ContextConditionEntity> getContextConditions() {
        return this.contextConditions;
    }

    @NotNull
    public final String getSearchType() {
        return this.searchType;
    }

    @NotNull
    public final String getSuggestKeyword() {
        return this.suggestKeyword;
    }

    public final int getPage() {
        return this.page;
    }

    public final int getSize() {
        return this.size;
    }

    public AutoCompleteRequestEntity(@Nullable List<ContextConditionEntity> list, @NotNull String str, @NotNull String str2, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "searchType");
        Intrinsics.checkNotNullParameter(str2, "suggestKeyword");
        this.contextConditions = list;
        this.searchType = str;
        this.suggestKeyword = str2;
        this.page = i;
        this.size = i2;
    }

    public final int hashCode() {
        List<ContextConditionEntity> list = this.contextConditions;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.searchType;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.suggestKeyword;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((hashCode2 + i) * 31) + Integer.valueOf(this.page).hashCode()) * 31) + Integer.valueOf(this.size).hashCode();
    }
}
