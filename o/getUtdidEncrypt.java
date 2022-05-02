package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lid/dana/domain/nearbyme/model/MerchantInfo;", "", "merchantId", "", "shopId", "(Ljava/lang/String;Ljava/lang/String;)V", "getMerchantId", "()Ljava/lang/String;", "setMerchantId", "(Ljava/lang/String;)V", "getShopId", "setShopId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getUtdidEncrypt {
    @Nullable
    private String merchantId;
    @Nullable
    private String shopId;

    public getUtdidEncrypt() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ getUtdidEncrypt copy$default(getUtdidEncrypt getutdidencrypt, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getutdidencrypt.merchantId;
        }
        if ((i & 2) != 0) {
            str2 = getutdidencrypt.shopId;
        }
        return getutdidencrypt.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.merchantId;
    }

    @Nullable
    public final String component2() {
        return this.shopId;
    }

    @NotNull
    public final getUtdidEncrypt copy(@Nullable String str, @Nullable String str2) {
        return new getUtdidEncrypt(str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getUtdidEncrypt)) {
            return false;
        }
        getUtdidEncrypt getutdidencrypt = (getUtdidEncrypt) obj;
        return Intrinsics.areEqual((Object) this.merchantId, (Object) getutdidencrypt.merchantId) && Intrinsics.areEqual((Object) this.shopId, (Object) getutdidencrypt.shopId);
    }

    public final int hashCode() {
        String str = this.merchantId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.shopId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantInfo(merchantId=");
        sb.append(this.merchantId);
        sb.append(", shopId=");
        sb.append(this.shopId);
        sb.append(")");
        return sb.toString();
    }

    public getUtdidEncrypt(@Nullable String str, @Nullable String str2) {
        this.merchantId = str;
        this.shopId = str2;
    }

    @Nullable
    public final String getMerchantId() {
        return this.merchantId;
    }

    public final void setMerchantId(@Nullable String str) {
        this.merchantId = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getUtdidEncrypt(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    @Nullable
    public final String getShopId() {
        return this.shopId;
    }

    public final void setShopId(@Nullable String str) {
        this.shopId = str;
    }
}
