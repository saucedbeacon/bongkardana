package o;

import id.dana.nearbyme.model.ShopModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lid/dana/nearbyme/model/HighlightedShopModel;", "", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "(Lid/dana/nearbyme/model/ShopModel;)V", "getShopModel", "()Lid/dana/nearbyme/model/ShopModel;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class customizeWebViewSettings {
    @NotNull
    public final ShopModel setMin;

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof customizeWebViewSettings) && Intrinsics.areEqual((Object) this.setMin, (Object) ((customizeWebViewSettings) obj).setMin);
        }
        return true;
    }

    public final int hashCode() {
        ShopModel shopModel = this.setMin;
        if (shopModel != null) {
            return shopModel.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("HighlightedShopModel(shopModel=");
        sb.append(this.setMin);
        sb.append(")");
        return sb.toString();
    }

    public customizeWebViewSettings(@NotNull ShopModel shopModel) {
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        this.setMin = shopModel;
    }
}
