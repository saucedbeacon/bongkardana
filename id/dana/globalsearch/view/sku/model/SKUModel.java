package id.dana.globalsearch.view.sku.model;

import androidx.annotation.Keep;
import id.dana.data.constant.BranchLinkConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001 B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006!"}, d2 = {"Lid/dana/globalsearch/view/sku/model/SKUModel;", "", "foodUrl", "", "merchantName", "shopName", "foodName", "redirectUrl", "state", "Lid/dana/globalsearch/view/sku/model/SKUModel$MerchantState;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/globalsearch/view/sku/model/SKUModel$MerchantState;)V", "getFoodName", "()Ljava/lang/String;", "getFoodUrl", "getMerchantName", "getRedirectUrl", "getShopName", "getState", "()Lid/dana/globalsearch/view/sku/model/SKUModel$MerchantState;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "MerchantState", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Keep
public final class SKUModel {
    @NotNull
    private final String foodName;
    @NotNull
    private final String foodUrl;
    @NotNull
    private final String merchantName;
    @NotNull
    private final String redirectUrl;
    @NotNull
    private final String shopName;
    @NotNull
    private final MerchantState state;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lid/dana/globalsearch/view/sku/model/SKUModel$MerchantState;", "", "(Ljava/lang/String;I)V", "OPEN", "CLOSED", "OUT_OF_STOCK", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public enum MerchantState {
        OPEN,
        CLOSED,
        OUT_OF_STOCK
    }

    public static /* synthetic */ SKUModel copy$default(SKUModel sKUModel, String str, String str2, String str3, String str4, String str5, MerchantState merchantState, int i, Object obj) {
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
            str5 = sKUModel.redirectUrl;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            merchantState = sKUModel.state;
        }
        return sKUModel.copy(str, str6, str7, str8, str9, merchantState);
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

    @NotNull
    public final String component5() {
        return this.redirectUrl;
    }

    @NotNull
    public final MerchantState component6() {
        return this.state;
    }

    @NotNull
    public final SKUModel copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull MerchantState merchantState) {
        Intrinsics.checkNotNullParameter(str, "foodUrl");
        Intrinsics.checkNotNullParameter(str2, BranchLinkConstant.OauthParams.MERCHANT_NAME);
        Intrinsics.checkNotNullParameter(str3, "shopName");
        Intrinsics.checkNotNullParameter(str4, "foodName");
        Intrinsics.checkNotNullParameter(str5, BranchLinkConstant.OauthParams.REDIRECT_URL);
        Intrinsics.checkNotNullParameter(merchantState, "state");
        return new SKUModel(str, str2, str3, str4, str5, merchantState);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SKUModel)) {
            return false;
        }
        SKUModel sKUModel = (SKUModel) obj;
        return Intrinsics.areEqual((Object) this.foodUrl, (Object) sKUModel.foodUrl) && Intrinsics.areEqual((Object) this.merchantName, (Object) sKUModel.merchantName) && Intrinsics.areEqual((Object) this.shopName, (Object) sKUModel.shopName) && Intrinsics.areEqual((Object) this.foodName, (Object) sKUModel.foodName) && Intrinsics.areEqual((Object) this.redirectUrl, (Object) sKUModel.redirectUrl) && Intrinsics.areEqual((Object) this.state, (Object) sKUModel.state);
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
        String str5 = this.redirectUrl;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        MerchantState merchantState = this.state;
        if (merchantState != null) {
            i = merchantState.hashCode();
        }
        return hashCode5 + i;
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
        sb.append(", redirectUrl=");
        sb.append(this.redirectUrl);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(")");
        return sb.toString();
    }

    public SKUModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull MerchantState merchantState) {
        Intrinsics.checkNotNullParameter(str, "foodUrl");
        Intrinsics.checkNotNullParameter(str2, BranchLinkConstant.OauthParams.MERCHANT_NAME);
        Intrinsics.checkNotNullParameter(str3, "shopName");
        Intrinsics.checkNotNullParameter(str4, "foodName");
        Intrinsics.checkNotNullParameter(str5, BranchLinkConstant.OauthParams.REDIRECT_URL);
        Intrinsics.checkNotNullParameter(merchantState, "state");
        this.foodUrl = str;
        this.merchantName = str2;
        this.shopName = str3;
        this.foodName = str4;
        this.redirectUrl = str5;
        this.state = merchantState;
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
    public /* synthetic */ SKUModel(String str, String str2, String str3, String str4, String str5, MerchantState merchantState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, merchantState);
    }

    @NotNull
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    @NotNull
    public final MerchantState getState() {
        return this.state;
    }
}
