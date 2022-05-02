package id.dana.globalsearch.offlinemerchant.model;

import androidx.annotation.Keep;
import id.dana.contract.deeplink.path.FeatureParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\tR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lid/dana/globalsearch/offlinemerchant/model/OfflineOnlineMerchantInfoModel;", "", "shopId", "", "merchantId", "isKyb", "", "isVerified", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "()Z", "getMerchantId", "()Ljava/lang/String;", "getShopId", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Keep
public final class OfflineOnlineMerchantInfoModel {
    private final boolean isKyb;
    private final boolean isVerified;
    @NotNull
    private final String merchantId;
    @NotNull
    private final String shopId;

    public OfflineOnlineMerchantInfoModel() {
        this((String) null, (String) null, false, false, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ OfflineOnlineMerchantInfoModel copy$default(OfflineOnlineMerchantInfoModel offlineOnlineMerchantInfoModel, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = offlineOnlineMerchantInfoModel.shopId;
        }
        if ((i & 2) != 0) {
            str2 = offlineOnlineMerchantInfoModel.merchantId;
        }
        if ((i & 4) != 0) {
            z = offlineOnlineMerchantInfoModel.isKyb;
        }
        if ((i & 8) != 0) {
            z2 = offlineOnlineMerchantInfoModel.isVerified;
        }
        return offlineOnlineMerchantInfoModel.copy(str, str2, z, z2);
    }

    @NotNull
    public final String component1() {
        return this.shopId;
    }

    @NotNull
    public final String component2() {
        return this.merchantId;
    }

    public final boolean component3() {
        return this.isKyb;
    }

    public final boolean component4() {
        return this.isVerified;
    }

    @NotNull
    public final OfflineOnlineMerchantInfoModel copy(@NotNull String str, @NotNull String str2, boolean z, boolean z2) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1986455116, oncanceled);
            onCancelLoad.getMin(1986455116, oncanceled);
        }
        Intrinsics.checkNotNullParameter(str, FeatureParams.SHOP_ID);
        Intrinsics.checkNotNullParameter(str2, "merchantId");
        return new OfflineOnlineMerchantInfoModel(str, str2, z, z2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfflineOnlineMerchantInfoModel)) {
            return false;
        }
        OfflineOnlineMerchantInfoModel offlineOnlineMerchantInfoModel = (OfflineOnlineMerchantInfoModel) obj;
        return Intrinsics.areEqual((Object) this.shopId, (Object) offlineOnlineMerchantInfoModel.shopId) && Intrinsics.areEqual((Object) this.merchantId, (Object) offlineOnlineMerchantInfoModel.merchantId) && this.isKyb == offlineOnlineMerchantInfoModel.isKyb && this.isVerified == offlineOnlineMerchantInfoModel.isVerified;
    }

    public final int hashCode() {
        String str = this.shopId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.merchantId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.isKyb;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.isVerified;
        if (!z3) {
            z2 = z3;
        }
        return i3 + (z2 ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("OfflineOnlineMerchantInfoModel(shopId=");
        sb.append(this.shopId);
        sb.append(", merchantId=");
        sb.append(this.merchantId);
        sb.append(", isKyb=");
        sb.append(this.isKyb);
        sb.append(", isVerified=");
        sb.append(this.isVerified);
        sb.append(")");
        return sb.toString();
    }

    public OfflineOnlineMerchantInfoModel(@NotNull String str, @NotNull String str2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, FeatureParams.SHOP_ID);
        Intrinsics.checkNotNullParameter(str2, "merchantId");
        this.shopId = str;
        this.merchantId = str2;
        this.isKyb = z;
        this.isVerified = z2;
    }

    @NotNull
    public final String getShopId() {
        return this.shopId;
    }

    @NotNull
    public final String getMerchantId() {
        return this.merchantId;
    }

    public final boolean isKyb() {
        return this.isKyb;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OfflineOnlineMerchantInfoModel(String str, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }

    public final boolean isVerified() {
        return this.isVerified;
    }
}
