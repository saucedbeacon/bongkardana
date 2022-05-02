package id.dana.globalsearch.dfrestaurant.model;

import androidx.annotation.Keep;
import id.dana.data.constant.BranchLinkConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lid/dana/globalsearch/dfrestaurant/model/RestaurantInfoModel;", "", "merchantName", "", "shopName", "isOauth", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMerchantName", "()Ljava/lang/String;", "getShopName", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Keep
public final class RestaurantInfoModel {
    @Nullable
    private final Boolean isOauth;
    @NotNull
    private final String merchantName;
    @Nullable
    private final String shopName;

    public RestaurantInfoModel(@NotNull String str, @Nullable String str2, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(str, BranchLinkConstant.OauthParams.MERCHANT_NAME);
        this.merchantName = str;
        this.shopName = str2;
        this.isOauth = bool;
    }

    @NotNull
    public final String getMerchantName() {
        return this.merchantName;
    }

    @Nullable
    public final String getShopName() {
        return this.shopName;
    }

    @Nullable
    public final Boolean isOauth() {
        return this.isOauth;
    }
}
