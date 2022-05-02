package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lid/dana/domain/nearbyme/model/ShopsPage;", "", "hasMore", "", "shops", "", "Lid/dana/domain/nearbyme/model/Shop;", "(ZLjava/util/List;)V", "getHasMore", "()Z", "setHasMore", "(Z)V", "getShops", "()Ljava/util/List;", "setShops", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class H5FileUtil {
    @NotNull
    public static final setMax Companion = new setMax((DefaultConstructorMarker) null);
    private boolean hasMore;
    @Nullable
    private List<GriverConfigUtils> shops;

    public H5FileUtil() {
        this(false, (List) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ H5FileUtil copy$default(H5FileUtil h5FileUtil, boolean z, List<GriverConfigUtils> list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = h5FileUtil.hasMore;
        }
        if ((i & 2) != 0) {
            list = h5FileUtil.shops;
        }
        return h5FileUtil.copy(z, list);
    }

    @JvmStatic
    @NotNull
    public static final H5FileUtil empty() {
        return Companion.empty();
    }

    public final boolean component1() {
        return this.hasMore;
    }

    @Nullable
    public final List<GriverConfigUtils> component2() {
        return this.shops;
    }

    @NotNull
    public final H5FileUtil copy(boolean z, @Nullable List<GriverConfigUtils> list) {
        return new H5FileUtil(z, list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H5FileUtil)) {
            return false;
        }
        H5FileUtil h5FileUtil = (H5FileUtil) obj;
        return this.hasMore == h5FileUtil.hasMore && Intrinsics.areEqual((Object) this.shops, (Object) h5FileUtil.shops);
    }

    public final int hashCode() {
        boolean z = this.hasMore;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        List<GriverConfigUtils> list = this.shops;
        return i + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ShopsPage(hasMore=");
        sb.append(this.hasMore);
        sb.append(", shops=");
        sb.append(this.shops);
        sb.append(")");
        return sb.toString();
    }

    public H5FileUtil(boolean z, @Nullable List<GriverConfigUtils> list) {
        this.hasMore = z;
        this.shops = list;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H5FileUtil(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    @Nullable
    public final List<GriverConfigUtils> getShops() {
        return this.shops;
    }

    public final void setShops(@Nullable List<GriverConfigUtils> list) {
        this.shops = list;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lid/dana/domain/nearbyme/model/ShopsPage$Companion;", "", "()V", "empty", "Lid/dana/domain/nearbyme/model/ShopsPage;", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final H5FileUtil empty() {
            return new H5FileUtil(false, CollectionsKt.emptyList());
        }
    }
}
