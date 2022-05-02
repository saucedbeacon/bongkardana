package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003JG\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001f"}, d2 = {"Lid/dana/domain/featureconfig/model/GlobalSearchConfig;", "", "exploreDanaBottomNav", "", "explorePopularPlaces", "", "Lid/dana/domain/featureconfig/model/ExplorePopularPlacesConfig;", "exploreShowPopularPlacesWidget", "exploreSkuWidget", "widgetOrder", "Lid/dana/domain/featureconfig/model/GlobalSearchWidget;", "(ZLjava/util/List;ZZLjava/util/List;)V", "getExploreDanaBottomNav", "()Z", "getExplorePopularPlaces", "()Ljava/util/List;", "getExploreShowPopularPlacesWidget", "getExploreSkuWidget", "getWidgetOrder", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class APWebViewClient {
    @SerializedName("explore_dana_bottom_nav")
    private final boolean exploreDanaBottomNav;
    @SerializedName("explore_popular_places")
    @NotNull
    private final List<capturePicture> explorePopularPlaces;
    @SerializedName("explore_show_popular_places_widget")
    private final boolean exploreShowPopularPlacesWidget;
    @SerializedName("explore_sku_widget")
    private final boolean exploreSkuWidget;
    @SerializedName("widget_order")
    @NotNull
    private final List<createWebMessageChannel> widgetOrder;

    public static /* synthetic */ APWebViewClient copy$default(APWebViewClient aPWebViewClient, boolean z, List<capturePicture> list, boolean z2, boolean z3, List<createWebMessageChannel> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = aPWebViewClient.exploreDanaBottomNav;
        }
        if ((i & 2) != 0) {
            list = aPWebViewClient.explorePopularPlaces;
        }
        List<capturePicture> list3 = list;
        if ((i & 4) != 0) {
            z2 = aPWebViewClient.exploreShowPopularPlacesWidget;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            z3 = aPWebViewClient.exploreSkuWidget;
        }
        boolean z5 = z3;
        if ((i & 16) != 0) {
            list2 = aPWebViewClient.widgetOrder;
        }
        return aPWebViewClient.copy(z, list3, z4, z5, list2);
    }

    public final boolean component1() {
        return this.exploreDanaBottomNav;
    }

    @NotNull
    public final List<capturePicture> component2() {
        return this.explorePopularPlaces;
    }

    public final boolean component3() {
        return this.exploreShowPopularPlacesWidget;
    }

    public final boolean component4() {
        return this.exploreSkuWidget;
    }

    @NotNull
    public final List<createWebMessageChannel> component5() {
        return this.widgetOrder;
    }

    @NotNull
    public final APWebViewClient copy(boolean z, @NotNull List<capturePicture> list, boolean z2, boolean z3, @NotNull List<createWebMessageChannel> list2) {
        Intrinsics.checkNotNullParameter(list, "explorePopularPlaces");
        Intrinsics.checkNotNullParameter(list2, "widgetOrder");
        return new APWebViewClient(z, list, z2, z3, list2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APWebViewClient)) {
            return false;
        }
        APWebViewClient aPWebViewClient = (APWebViewClient) obj;
        return this.exploreDanaBottomNav == aPWebViewClient.exploreDanaBottomNav && Intrinsics.areEqual((Object) this.explorePopularPlaces, (Object) aPWebViewClient.explorePopularPlaces) && this.exploreShowPopularPlacesWidget == aPWebViewClient.exploreShowPopularPlacesWidget && this.exploreSkuWidget == aPWebViewClient.exploreSkuWidget && Intrinsics.areEqual((Object) this.widgetOrder, (Object) aPWebViewClient.widgetOrder);
    }

    public final int hashCode() {
        boolean z = this.exploreDanaBottomNav;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        List<capturePicture> list = this.explorePopularPlaces;
        int i2 = 0;
        int hashCode = (i + (list != null ? list.hashCode() : 0)) * 31;
        boolean z3 = this.exploreShowPopularPlacesWidget;
        if (z3) {
            z3 = true;
        }
        int i3 = (hashCode + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.exploreSkuWidget;
        if (!z4) {
            z2 = z4;
        }
        int i4 = (i3 + (z2 ? 1 : 0)) * 31;
        List<createWebMessageChannel> list2 = this.widgetOrder;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return i4 + i2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("GlobalSearchConfig(exploreDanaBottomNav=");
        sb.append(this.exploreDanaBottomNav);
        sb.append(", explorePopularPlaces=");
        sb.append(this.explorePopularPlaces);
        sb.append(", exploreShowPopularPlacesWidget=");
        sb.append(this.exploreShowPopularPlacesWidget);
        sb.append(", exploreSkuWidget=");
        sb.append(this.exploreSkuWidget);
        sb.append(", widgetOrder=");
        sb.append(this.widgetOrder);
        sb.append(")");
        return sb.toString();
    }

    public APWebViewClient(boolean z, @NotNull List<capturePicture> list, boolean z2, boolean z3, @NotNull List<createWebMessageChannel> list2) {
        Intrinsics.checkNotNullParameter(list, "explorePopularPlaces");
        Intrinsics.checkNotNullParameter(list2, "widgetOrder");
        this.exploreDanaBottomNav = z;
        this.explorePopularPlaces = list;
        this.exploreShowPopularPlacesWidget = z2;
        this.exploreSkuWidget = z3;
        this.widgetOrder = list2;
    }

    public final boolean getExploreDanaBottomNav() {
        return this.exploreDanaBottomNav;
    }

    @NotNull
    public final List<capturePicture> getExplorePopularPlaces() {
        return this.explorePopularPlaces;
    }

    public final boolean getExploreShowPopularPlacesWidget() {
        return this.exploreShowPopularPlacesWidget;
    }

    public final boolean getExploreSkuWidget() {
        return this.exploreSkuWidget;
    }

    @NotNull
    public final List<createWebMessageChannel> getWidgetOrder() {
        return this.widgetOrder;
    }
}
