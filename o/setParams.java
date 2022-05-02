package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import id.dana.utils.deeplink.DeepLinkConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0018"}, d2 = {"Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/ProductOrderResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "checkoutUrl", "", "orderId", "acquirementId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAcquirementId", "()Ljava/lang/String;", "getCheckoutUrl", "getOrderId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toProductOrder", "Lid/dana/domain/nearbyme/model/ProductOrder;", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setParams extends BaseRpcResult {
    @NotNull
    private final String acquirementId;
    @NotNull
    private final String checkoutUrl;
    @NotNull
    private final String orderId;

    public static /* synthetic */ setParams copy$default(setParams setparams, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setparams.checkoutUrl;
        }
        if ((i & 2) != 0) {
            str2 = setparams.orderId;
        }
        if ((i & 4) != 0) {
            str3 = setparams.acquirementId;
        }
        return setparams.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.checkoutUrl;
    }

    @NotNull
    public final String component2() {
        return this.orderId;
    }

    @NotNull
    public final String component3() {
        return this.acquirementId;
    }

    @NotNull
    public final setParams copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "checkoutUrl");
        Intrinsics.checkNotNullParameter(str2, DeepLinkConstant.DeepLinkParams.ORDER_ID);
        Intrinsics.checkNotNullParameter(str3, "acquirementId");
        return new setParams(str, str2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setParams)) {
            return false;
        }
        setParams setparams = (setParams) obj;
        return Intrinsics.areEqual((Object) this.checkoutUrl, (Object) setparams.checkoutUrl) && Intrinsics.areEqual((Object) this.orderId, (Object) setparams.orderId) && Intrinsics.areEqual((Object) this.acquirementId, (Object) setparams.acquirementId);
    }

    public final int hashCode() {
        String str = this.checkoutUrl;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.orderId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.acquirementId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductOrderResult(checkoutUrl=");
        sb.append(this.checkoutUrl);
        sb.append(", orderId=");
        sb.append(this.orderId);
        sb.append(", acquirementId=");
        sb.append(this.acquirementId);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getCheckoutUrl() {
        return this.checkoutUrl;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final String getAcquirementId() {
        return this.acquirementId;
    }

    public setParams(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "checkoutUrl");
        Intrinsics.checkNotNullParameter(str2, DeepLinkConstant.DeepLinkParams.ORDER_ID);
        Intrinsics.checkNotNullParameter(str3, "acquirementId");
        this.checkoutUrl = str;
        this.orderId = str2;
        this.acquirementId = str3;
    }

    @NotNull
    public final getSubPath toProductOrder() {
        return new getSubPath(this.checkoutUrl, this.orderId, this.acquirementId);
    }
}
