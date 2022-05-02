package o;

import id.dana.nearbyrevamp.search.ExploreSectionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.ProgramSettingExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lid/dana/nearbyrevamp/search/model/NearbySearchSectionModel;", "", "type", "Lid/dana/nearbyrevamp/search/ExploreSectionType;", "itemNearbyModels", "", "Lid/dana/nearbyrevamp/search/model/NearbySearchItemModel;", "(Lid/dana/nearbyrevamp/search/ExploreSectionType;Ljava/util/List;)V", "getItemNearbyModels", "()Ljava/util/List;", "getType", "()Lid/dana/nearbyrevamp/search/ExploreSectionType;", "component1", "component2", "copy", "createTrendingSection", "items", "equals", "", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class showAuthGuide {
    @NotNull
    public final ExploreSectionType getMax;
    @NotNull
    public final List<ProgramSettingExtension.AnonymousClass2> setMax;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof showAuthGuide)) {
            return false;
        }
        showAuthGuide showauthguide = (showAuthGuide) obj;
        return Intrinsics.areEqual((Object) this.getMax, (Object) showauthguide.getMax) && Intrinsics.areEqual((Object) this.setMax, (Object) showauthguide.setMax);
    }

    public final int hashCode() {
        ExploreSectionType exploreSectionType = this.getMax;
        int i = 0;
        int hashCode = (exploreSectionType != null ? exploreSectionType.hashCode() : 0) * 31;
        List<ProgramSettingExtension.AnonymousClass2> list = this.setMax;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("NearbySearchSectionModel(type=");
        sb.append(this.getMax);
        sb.append(", itemNearbyModels=");
        sb.append(this.setMax);
        sb.append(")");
        return sb.toString();
    }

    public showAuthGuide(@NotNull ExploreSectionType exploreSectionType, @NotNull List<ProgramSettingExtension.AnonymousClass2> list) {
        Intrinsics.checkNotNullParameter(exploreSectionType, "type");
        Intrinsics.checkNotNullParameter(list, "itemNearbyModels");
        this.getMax = exploreSectionType;
        this.setMax = list;
    }
}
