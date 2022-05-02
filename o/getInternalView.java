package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import id.dana.contract.deeplink.path.FeatureParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lid/dana/data/nearbyme/repository/source/network/request/merchantdetail/MerchantImageRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "merchantId", "", "shopId", "pageNum", "", "pageSize", "(Ljava/lang/String;Ljava/lang/String;II)V", "getMerchantId", "()Ljava/lang/String;", "getPageNum", "()I", "getPageSize", "getShopId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getInternalView extends BaseRpcRequest {
    @NotNull
    private final String merchantId;
    private final int pageNum;
    private final int pageSize;
    @NotNull
    private final String shopId;

    public static /* synthetic */ getInternalView copy$default(getInternalView getinternalview, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = getinternalview.merchantId;
        }
        if ((i3 & 2) != 0) {
            str2 = getinternalview.shopId;
        }
        if ((i3 & 4) != 0) {
            i = getinternalview.pageNum;
        }
        if ((i3 & 8) != 0) {
            i2 = getinternalview.pageSize;
        }
        return getinternalview.copy(str, str2, i, i2);
    }

    @NotNull
    public final String component1() {
        return this.merchantId;
    }

    @NotNull
    public final String component2() {
        return this.shopId;
    }

    public final int component3() {
        return this.pageNum;
    }

    public final int component4() {
        return this.pageSize;
    }

    @NotNull
    public final getInternalView copy(@NotNull String str, @NotNull String str2, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "merchantId");
        Intrinsics.checkNotNullParameter(str2, FeatureParams.SHOP_ID);
        return new getInternalView(str, str2, i, i2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getInternalView)) {
            return false;
        }
        getInternalView getinternalview = (getInternalView) obj;
        return Intrinsics.areEqual((Object) this.merchantId, (Object) getinternalview.merchantId) && Intrinsics.areEqual((Object) this.shopId, (Object) getinternalview.shopId) && this.pageNum == getinternalview.pageNum && this.pageSize == getinternalview.pageSize;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantImageRequest(merchantId=");
        sb.append(this.merchantId);
        sb.append(", shopId=");
        sb.append(this.shopId);
        sb.append(", pageNum=");
        sb.append(this.pageNum);
        sb.append(", pageSize=");
        sb.append(this.pageSize);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getMerchantId() {
        return this.merchantId;
    }

    @NotNull
    public final String getShopId() {
        return this.shopId;
    }

    public final int getPageNum() {
        return this.pageNum;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public getInternalView(@NotNull String str, @NotNull String str2, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "merchantId");
        Intrinsics.checkNotNullParameter(str2, FeatureParams.SHOP_ID);
        this.merchantId = str;
        this.shopId = str2;
        this.pageNum = i;
        this.pageSize = i2;
    }

    public final int hashCode() {
        String str = this.merchantId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.shopId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((hashCode + i) * 31) + Integer.valueOf(this.pageNum).hashCode()) * 31) + Integer.valueOf(this.pageSize).hashCode();
    }
}
