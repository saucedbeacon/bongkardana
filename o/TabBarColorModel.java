package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TabBar;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B{\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0015J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bHÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000bHÆ\u0003J\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u000eHÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!¨\u00068"}, d2 = {"Lid/dana/data/here/model/Item;", "", "title", "", "id", "resultType", "address", "Lid/dana/data/here/model/Address;", "position", "Lid/dana/data/here/model/Position;", "access", "", "Lid/dana/data/here/model/Access;", "distance", "", "categories", "Lid/dana/data/here/model/Categories;", "references", "Lid/dana/data/here/model/References;", "highlights", "Lid/dana/data/here/model/Highlights;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/data/here/model/Address;Lid/dana/data/here/model/Position;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lid/dana/data/here/model/Highlights;)V", "getAccess", "()Ljava/util/List;", "getAddress", "()Lid/dana/data/here/model/Address;", "getCategories", "getDistance", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHighlights", "()Lid/dana/data/here/model/Highlights;", "getId", "()Ljava/lang/String;", "getPosition", "()Lid/dana/data/here/model/Position;", "getReferences", "getResultType", "getTitle", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/data/here/model/Address;Lid/dana/data/here/model/Position;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lid/dana/data/here/model/Highlights;)Lid/dana/data/here/model/Item;", "equals", "", "other", "hashCode", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class TabBarColorModel {
    @SerializedName("access")
    @Nullable
    private final List<Object> access;
    @SerializedName("address")
    @Nullable
    private final removeTabBarBadge address;
    @SerializedName("categories")
    @Nullable
    private final List<Object> categories;
    @SerializedName("distance")
    @Nullable
    private final Integer distance;
    @SerializedName("highlights")
    @Nullable
    private final TabBar.SwitchTabSource highlights;
    @SerializedName("id")
    @Nullable

    /* renamed from: id  reason: collision with root package name */
    private final String f9899id;
    @SerializedName("position")
    @Nullable
    private final getBadgeColor position;
    @SerializedName("references")
    @Nullable
    private final List<Object> references;
    @SerializedName("resultType")
    @Nullable
    private final String resultType;
    @SerializedName("title")
    @Nullable
    private final String title;

    public static /* synthetic */ TabBarColorModel copy$default(TabBarColorModel tabBarColorModel, String str, String str2, String str3, removeTabBarBadge removetabbarbadge, getBadgeColor getbadgecolor, List list, Integer num, List list2, List list3, TabBar.SwitchTabSource switchTabSource, int i, Object obj) {
        TabBarColorModel tabBarColorModel2 = tabBarColorModel;
        int i2 = i;
        return tabBarColorModel.copy((i2 & 1) != 0 ? tabBarColorModel2.title : str, (i2 & 2) != 0 ? tabBarColorModel2.f9899id : str2, (i2 & 4) != 0 ? tabBarColorModel2.resultType : str3, (i2 & 8) != 0 ? tabBarColorModel2.address : removetabbarbadge, (i2 & 16) != 0 ? tabBarColorModel2.position : getbadgecolor, (i2 & 32) != 0 ? tabBarColorModel2.access : list, (i2 & 64) != 0 ? tabBarColorModel2.distance : num, (i2 & 128) != 0 ? tabBarColorModel2.categories : list2, (i2 & 256) != 0 ? tabBarColorModel2.references : list3, (i2 & 512) != 0 ? tabBarColorModel2.highlights : switchTabSource);
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    @Nullable
    public final TabBar.SwitchTabSource component10() {
        return this.highlights;
    }

    @Nullable
    public final String component2() {
        return this.f9899id;
    }

    @Nullable
    public final String component3() {
        return this.resultType;
    }

    @Nullable
    public final removeTabBarBadge component4() {
        return this.address;
    }

    @Nullable
    public final getBadgeColor component5() {
        return this.position;
    }

    @Nullable
    public final List<Object> component6() {
        return this.access;
    }

    @Nullable
    public final Integer component7() {
        return this.distance;
    }

    @Nullable
    public final List<Object> component8() {
        return this.categories;
    }

    @Nullable
    public final List<Object> component9() {
        return this.references;
    }

    @NotNull
    public final TabBarColorModel copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable removeTabBarBadge removetabbarbadge, @Nullable getBadgeColor getbadgecolor, @Nullable List<Object> list, @Nullable Integer num, @Nullable List<Object> list2, @Nullable List<Object> list3, @Nullable TabBar.SwitchTabSource switchTabSource) {
        return new TabBarColorModel(str, str2, str3, removetabbarbadge, getbadgecolor, list, num, list2, list3, switchTabSource);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabBarColorModel)) {
            return false;
        }
        TabBarColorModel tabBarColorModel = (TabBarColorModel) obj;
        return Intrinsics.areEqual((Object) this.title, (Object) tabBarColorModel.title) && Intrinsics.areEqual((Object) this.f9899id, (Object) tabBarColorModel.f9899id) && Intrinsics.areEqual((Object) this.resultType, (Object) tabBarColorModel.resultType) && Intrinsics.areEqual((Object) this.address, (Object) tabBarColorModel.address) && Intrinsics.areEqual((Object) this.position, (Object) tabBarColorModel.position) && Intrinsics.areEqual((Object) this.access, (Object) tabBarColorModel.access) && Intrinsics.areEqual((Object) this.distance, (Object) tabBarColorModel.distance) && Intrinsics.areEqual((Object) this.categories, (Object) tabBarColorModel.categories) && Intrinsics.areEqual((Object) this.references, (Object) tabBarColorModel.references) && Intrinsics.areEqual((Object) this.highlights, (Object) tabBarColorModel.highlights);
    }

    public final int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9899id;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.resultType;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        removeTabBarBadge removetabbarbadge = this.address;
        int hashCode4 = (hashCode3 + (removetabbarbadge != null ? removetabbarbadge.hashCode() : 0)) * 31;
        getBadgeColor getbadgecolor = this.position;
        int hashCode5 = (hashCode4 + (getbadgecolor != null ? getbadgecolor.hashCode() : 0)) * 31;
        List<Object> list = this.access;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        Integer num = this.distance;
        int hashCode7 = (hashCode6 + (num != null ? num.hashCode() : 0)) * 31;
        List<Object> list2 = this.categories;
        int hashCode8 = (hashCode7 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<Object> list3 = this.references;
        int hashCode9 = (hashCode8 + (list3 != null ? list3.hashCode() : 0)) * 31;
        TabBar.SwitchTabSource switchTabSource = this.highlights;
        if (switchTabSource != null) {
            i = switchTabSource.hashCode();
        }
        return hashCode9 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Item(title=");
        sb.append(this.title);
        sb.append(", id=");
        sb.append(this.f9899id);
        sb.append(", resultType=");
        sb.append(this.resultType);
        sb.append(", address=");
        sb.append(this.address);
        sb.append(", position=");
        sb.append(this.position);
        sb.append(", access=");
        sb.append(this.access);
        sb.append(", distance=");
        sb.append(this.distance);
        sb.append(", categories=");
        sb.append(this.categories);
        sb.append(", references=");
        sb.append(this.references);
        sb.append(", highlights=");
        sb.append(this.highlights);
        sb.append(")");
        return sb.toString();
    }

    public TabBarColorModel(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable removeTabBarBadge removetabbarbadge, @Nullable getBadgeColor getbadgecolor, @Nullable List<Object> list, @Nullable Integer num, @Nullable List<Object> list2, @Nullable List<Object> list3, @Nullable TabBar.SwitchTabSource switchTabSource) {
        this.title = str;
        this.f9899id = str2;
        this.resultType = str3;
        this.address = removetabbarbadge;
        this.position = getbadgecolor;
        this.access = list;
        this.distance = num;
        this.categories = list2;
        this.references = list3;
        this.highlights = switchTabSource;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getId() {
        return this.f9899id;
    }

    @Nullable
    public final String getResultType() {
        return this.resultType;
    }

    @Nullable
    public final removeTabBarBadge getAddress() {
        return this.address;
    }

    @Nullable
    public final getBadgeColor getPosition() {
        return this.position;
    }

    @Nullable
    public final List<Object> getAccess() {
        return this.access;
    }

    @Nullable
    public final Integer getDistance() {
        return this.distance;
    }

    @Nullable
    public final List<Object> getCategories() {
        return this.categories;
    }

    @Nullable
    public final List<Object> getReferences() {
        return this.references;
    }

    @Nullable
    public final TabBar.SwitchTabSource getHighlights() {
        return this.highlights;
    }
}
