package o;

import id.dana.nearbyme.model.ShopModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lid/dana/model/OtherStoreListResultModel;", "", "shops", "", "Lid/dana/nearbyme/model/ShopModel;", "hasMore", "", "promoFlag", "(Ljava/util/List;ZZ)V", "getHasMore", "()Z", "getPromoFlag", "getShops", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class InternalApiBridgeExtension {
    private final boolean getMax;
    @NotNull
    public final List<ShopModel> getMin;
    private final boolean setMax;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InternalApiBridgeExtension)) {
            return false;
        }
        InternalApiBridgeExtension internalApiBridgeExtension = (InternalApiBridgeExtension) obj;
        return Intrinsics.areEqual((Object) this.getMin, (Object) internalApiBridgeExtension.getMin) && this.setMax == internalApiBridgeExtension.setMax && this.getMax == internalApiBridgeExtension.getMax;
    }

    public final int hashCode() {
        List<ShopModel> list = this.getMin;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.setMax;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.getMax;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("OtherStoreListResultModel(shops=");
        sb.append(this.getMin);
        sb.append(", hasMore=");
        sb.append(this.setMax);
        sb.append(", promoFlag=");
        sb.append(this.getMax);
        sb.append(")");
        return sb.toString();
    }

    public InternalApiBridgeExtension(@NotNull List<? extends ShopModel> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "shops");
        this.getMin = list;
        this.setMax = z;
        this.getMax = z2;
    }

    public final boolean setMax() {
        return this.setMax;
    }
}
