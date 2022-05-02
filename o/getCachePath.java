package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lid/dana/domain/nearbyme/model/OtherStoreListResult;", "", "shops", "", "Lid/dana/domain/nearbyme/model/Shop;", "hasMore", "", "promoFlag", "(Ljava/util/List;ZZ)V", "getHasMore", "()Z", "getPromoFlag", "getShops", "()Ljava/util/List;", "setShops", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getCachePath {
    private final boolean hasMore;
    private final boolean promoFlag;
    @NotNull
    private List<GriverConfigUtils> shops;

    public static /* synthetic */ getCachePath copy$default(getCachePath getcachepath, List<GriverConfigUtils> list, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getcachepath.shops;
        }
        if ((i & 2) != 0) {
            z = getcachepath.hasMore;
        }
        if ((i & 4) != 0) {
            z2 = getcachepath.promoFlag;
        }
        return getcachepath.copy(list, z, z2);
    }

    @NotNull
    public final List<GriverConfigUtils> component1() {
        return this.shops;
    }

    public final boolean component2() {
        return this.hasMore;
    }

    public final boolean component3() {
        return this.promoFlag;
    }

    @NotNull
    public final getCachePath copy(@NotNull List<GriverConfigUtils> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "shops");
        return new getCachePath(list, z, z2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCachePath)) {
            return false;
        }
        getCachePath getcachepath = (getCachePath) obj;
        return Intrinsics.areEqual((Object) this.shops, (Object) getcachepath.shops) && this.hasMore == getcachepath.hasMore && this.promoFlag == getcachepath.promoFlag;
    }

    public final int hashCode() {
        List<GriverConfigUtils> list = this.shops;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.hasMore;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.promoFlag;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("OtherStoreListResult(shops=");
        sb.append(this.shops);
        sb.append(", hasMore=");
        sb.append(this.hasMore);
        sb.append(", promoFlag=");
        sb.append(this.promoFlag);
        sb.append(")");
        return sb.toString();
    }

    public getCachePath(@NotNull List<GriverConfigUtils> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "shops");
        this.shops = list;
        this.hasMore = z;
        this.promoFlag = z2;
    }

    @NotNull
    public final List<GriverConfigUtils> getShops() {
        return this.shops;
    }

    public final void setShops(@NotNull List<GriverConfigUtils> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.shops = list;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final boolean getPromoFlag() {
        return this.promoFlag;
    }
}
