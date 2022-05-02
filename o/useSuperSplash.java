package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import com.google.gson.annotations.SerializedName;
import id.dana.data.globalsearch.source.network.result.ProductBizIdEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lid/dana/data/globalsearch/source/network/result/HistoricalSkuResultEntity;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "bizIds", "", "Lid/dana/data/globalsearch/source/network/result/ProductBizIdEntity;", "(Ljava/util/List;)V", "getBizIds", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class useSuperSplash extends BaseRpcResult {
    @SerializedName("bizIds")
    @Nullable
    private final List<ProductBizIdEntity> bizIds;

    public useSuperSplash() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ useSuperSplash copy$default(useSuperSplash usesupersplash, List<ProductBizIdEntity> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = usesupersplash.bizIds;
        }
        return usesupersplash.copy(list);
    }

    @Nullable
    public final List<ProductBizIdEntity> component1() {
        return this.bizIds;
    }

    @NotNull
    public final useSuperSplash copy(@Nullable List<ProductBizIdEntity> list) {
        return new useSuperSplash(list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof useSuperSplash) && Intrinsics.areEqual((Object) this.bizIds, (Object) ((useSuperSplash) obj).bizIds);
        }
        return true;
    }

    public final int hashCode() {
        List<ProductBizIdEntity> list = this.bizIds;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("HistoricalSkuResultEntity(bizIds=");
        sb.append(this.bizIds);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ useSuperSplash(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
    }

    @Nullable
    public final List<ProductBizIdEntity> getBizIds() {
        return this.bizIds;
    }

    public useSuperSplash(@Nullable List<ProductBizIdEntity> list) {
        this.bizIds = list;
    }
}
