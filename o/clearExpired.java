package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lid/dana/domain/nearbyme/model/NearbyConfig;", "", "trendingKeyword", "", "Lid/dana/domain/nearbysearch/model/NearbyTrendingKeyword;", "nearbyRevamp", "", "(Ljava/util/List;Z)V", "getNearbyRevamp", "()Z", "getTrendingKeyword", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class clearExpired {
    private final boolean nearbyRevamp;
    @NotNull
    private final List<isFolder> trendingKeyword;

    public clearExpired() {
        this((List) null, false, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ clearExpired copy$default(clearExpired clearexpired, List<isFolder> list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = clearexpired.trendingKeyword;
        }
        if ((i & 2) != 0) {
            z = clearexpired.nearbyRevamp;
        }
        return clearexpired.copy(list, z);
    }

    @NotNull
    public final List<isFolder> component1() {
        return this.trendingKeyword;
    }

    public final boolean component2() {
        return this.nearbyRevamp;
    }

    @NotNull
    public final clearExpired copy(@NotNull List<isFolder> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "trendingKeyword");
        return new clearExpired(list, z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clearExpired)) {
            return false;
        }
        clearExpired clearexpired = (clearExpired) obj;
        return Intrinsics.areEqual((Object) this.trendingKeyword, (Object) clearexpired.trendingKeyword) && this.nearbyRevamp == clearexpired.nearbyRevamp;
    }

    public final int hashCode() {
        List<isFolder> list = this.trendingKeyword;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.nearbyRevamp;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("NearbyConfig(trendingKeyword=");
        sb.append(this.trendingKeyword);
        sb.append(", nearbyRevamp=");
        sb.append(this.nearbyRevamp);
        sb.append(")");
        return sb.toString();
    }

    public clearExpired(@NotNull List<isFolder> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "trendingKeyword");
        this.trendingKeyword = list;
        this.nearbyRevamp = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ clearExpired(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? false : z);
    }

    @NotNull
    public final List<isFolder> getTrendingKeyword() {
        return this.trendingKeyword;
    }

    public final boolean getNearbyRevamp() {
        return this.nearbyRevamp;
    }
}
