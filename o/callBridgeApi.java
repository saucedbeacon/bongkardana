package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lid/dana/data/nearbyme/repository/source/network/request/merchantdetail/BaseMerchantInfoRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "shopId", "", "pageSize", "", "pageNum", "(Ljava/lang/String;II)V", "getPageNum", "()I", "getPageSize", "getShopId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class callBridgeApi extends BaseRpcRequest {
    private final int pageNum;
    private final int pageSize;
    @Nullable
    private final String shopId;

    public static /* synthetic */ callBridgeApi copy$default(callBridgeApi callbridgeapi, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = callbridgeapi.shopId;
        }
        if ((i3 & 2) != 0) {
            i = callbridgeapi.pageSize;
        }
        if ((i3 & 4) != 0) {
            i2 = callbridgeapi.pageNum;
        }
        return callbridgeapi.copy(str, i, i2);
    }

    @Nullable
    public final String component1() {
        return this.shopId;
    }

    public final int component2() {
        return this.pageSize;
    }

    public final int component3() {
        return this.pageNum;
    }

    @NotNull
    public final callBridgeApi copy(@Nullable String str, int i, int i2) {
        return new callBridgeApi(str, i, i2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof callBridgeApi)) {
            return false;
        }
        callBridgeApi callbridgeapi = (callBridgeApi) obj;
        return Intrinsics.areEqual((Object) this.shopId, (Object) callbridgeapi.shopId) && this.pageSize == callbridgeapi.pageSize && this.pageNum == callbridgeapi.pageNum;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseMerchantInfoRequest(shopId=");
        sb.append(this.shopId);
        sb.append(", pageSize=");
        sb.append(this.pageSize);
        sb.append(", pageNum=");
        sb.append(this.pageNum);
        sb.append(")");
        return sb.toString();
    }

    @Nullable
    public final String getShopId() {
        return this.shopId;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ callBridgeApi(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? 10 : i, (i3 & 4) != 0 ? 1 : i2);
    }

    public final int getPageNum() {
        return this.pageNum;
    }

    public callBridgeApi(@Nullable String str, int i, int i2) {
        this.shopId = str;
        this.pageSize = i;
        this.pageNum = i2;
    }

    public final int hashCode() {
        String str = this.shopId;
        return ((((str != null ? str.hashCode() : 0) * 31) + Integer.valueOf(this.pageSize).hashCode()) * 31) + Integer.valueOf(this.pageNum).hashCode();
    }
}
