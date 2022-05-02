package id.dana.globalsearch.sku.model;

import androidx.annotation.Keep;
import id.dana.data.constant.BranchLinkConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lid/dana/globalsearch/sku/model/SKUModel;", "", "foodUrl", "", "merchantName", "shopName", "foodName", "note", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFoodName", "()Ljava/lang/String;", "getFoodUrl", "getMerchantName", "getNote", "getShopName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Keep
public final class SKUModel {
    @NotNull
    private final String foodName;
    @NotNull
    private final String foodUrl;
    @NotNull
    private final String merchantName;
    @Nullable
    private final String note;
    @NotNull
    private final String shopName;

    public static /* synthetic */ SKUModel copy$default(SKUModel sKUModel, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sKUModel.foodUrl;
        }
        if ((i & 2) != 0) {
            str2 = sKUModel.merchantName;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = sKUModel.shopName;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = sKUModel.foodName;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = sKUModel.note;
        }
        return sKUModel.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    public final String component1() {
        return this.foodUrl;
    }

    @NotNull
    public final String component2() {
        return this.merchantName;
    }

    @NotNull
    public final String component3() {
        return this.shopName;
    }

    @NotNull
    public final String component4() {
        return this.foodName;
    }

    @Nullable
    public final String component5() {
        return this.note;
    }

    @NotNull
    public final SKUModel copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5) {
        Intrinsics.checkNotNullParameter(str, "foodUrl");
        Intrinsics.checkNotNullParameter(str2, BranchLinkConstant.OauthParams.MERCHANT_NAME);
        Intrinsics.checkNotNullParameter(str3, "shopName");
        Intrinsics.checkNotNullParameter(str4, "foodName");
        return new SKUModel(str, str2, str3, str4, str5);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SKUModel)) {
            return false;
        }
        SKUModel sKUModel = (SKUModel) obj;
        return Intrinsics.areEqual((Object) this.foodUrl, (Object) sKUModel.foodUrl) && Intrinsics.areEqual((Object) this.merchantName, (Object) sKUModel.merchantName) && Intrinsics.areEqual((Object) this.shopName, (Object) sKUModel.shopName) && Intrinsics.areEqual((Object) this.foodName, (Object) sKUModel.foodName) && Intrinsics.areEqual((Object) this.note, (Object) sKUModel.note);
    }

    public final int hashCode() {
        String str = this.foodUrl;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.merchantName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.shopName;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.foodName;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.note;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SKUModel(foodUrl=");
        sb.append(this.foodUrl);
        sb.append(", merchantName=");
        sb.append(this.merchantName);
        sb.append(", shopName=");
        sb.append(this.shopName);
        sb.append(", foodName=");
        sb.append(this.foodName);
        sb.append(", note=");
        sb.append(this.note);
        sb.append(")");
        return sb.toString();
    }

    public SKUModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5) {
        Intrinsics.checkNotNullParameter(str, "foodUrl");
        Intrinsics.checkNotNullParameter(str2, BranchLinkConstant.OauthParams.MERCHANT_NAME);
        Intrinsics.checkNotNullParameter(str3, "shopName");
        Intrinsics.checkNotNullParameter(str4, "foodName");
        this.foodUrl = str;
        this.merchantName = str2;
        this.shopName = str3;
        this.foodName = str4;
        this.note = str5;
    }

    @NotNull
    public final String getFoodUrl() {
        return this.foodUrl;
    }

    @NotNull
    public final String getMerchantName() {
        return this.merchantName;
    }

    @NotNull
    public final String getShopName() {
        return this.shopName;
    }

    @NotNull
    public final String getFoodName() {
        return this.foodName;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SKUModel(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5);
    }

    @Nullable
    public final String getNote() {
        return this.note;
    }
}
