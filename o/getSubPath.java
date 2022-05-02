package o;

import id.dana.utils.deeplink.DeepLinkConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lid/dana/domain/nearbyme/model/ProductOrder;", "", "checkOutUrl", "", "orderId", "acquirementId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAcquirementId", "()Ljava/lang/String;", "getCheckOutUrl", "getOrderId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getSubPath {
    @NotNull
    private final String acquirementId;
    @NotNull
    private final String checkOutUrl;
    @NotNull
    private final String orderId;

    public static /* synthetic */ getSubPath copy$default(getSubPath getsubpath, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getsubpath.checkOutUrl;
        }
        if ((i & 2) != 0) {
            str2 = getsubpath.orderId;
        }
        if ((i & 4) != 0) {
            str3 = getsubpath.acquirementId;
        }
        return getsubpath.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.checkOutUrl;
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
    public final getSubPath copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "checkOutUrl");
        Intrinsics.checkNotNullParameter(str2, DeepLinkConstant.DeepLinkParams.ORDER_ID);
        Intrinsics.checkNotNullParameter(str3, "acquirementId");
        return new getSubPath(str, str2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSubPath)) {
            return false;
        }
        getSubPath getsubpath = (getSubPath) obj;
        return Intrinsics.areEqual((Object) this.checkOutUrl, (Object) getsubpath.checkOutUrl) && Intrinsics.areEqual((Object) this.orderId, (Object) getsubpath.orderId) && Intrinsics.areEqual((Object) this.acquirementId, (Object) getsubpath.acquirementId);
    }

    public final int hashCode() {
        String str = this.checkOutUrl;
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
        StringBuilder sb = new StringBuilder("ProductOrder(checkOutUrl=");
        sb.append(this.checkOutUrl);
        sb.append(", orderId=");
        sb.append(this.orderId);
        sb.append(", acquirementId=");
        sb.append(this.acquirementId);
        sb.append(")");
        return sb.toString();
    }

    public getSubPath(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "checkOutUrl");
        Intrinsics.checkNotNullParameter(str2, DeepLinkConstant.DeepLinkParams.ORDER_ID);
        Intrinsics.checkNotNullParameter(str3, "acquirementId");
        this.checkOutUrl = str;
        this.orderId = str2;
        this.acquirementId = str3;
    }

    @NotNull
    public final String getCheckOutUrl() {
        return this.checkOutUrl;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final String getAcquirementId() {
        return this.acquirementId;
    }
}
