package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lid/dana/data/here/model/HereGeocodeResponse;", "", "hereItems", "", "Lid/dana/data/here/model/Item;", "(Ljava/util/List;)V", "getHereItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getBadgeSize {
    @SerializedName("items")
    @Nullable
    private final List<TabBarColorModel> hereItems;

    public static /* synthetic */ getBadgeSize copy$default(getBadgeSize getbadgesize, List<TabBarColorModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getbadgesize.hereItems;
        }
        return getbadgesize.copy(list);
    }

    @Nullable
    public final List<TabBarColorModel> component1() {
        return this.hereItems;
    }

    @NotNull
    public final getBadgeSize copy(@Nullable List<TabBarColorModel> list) {
        return new getBadgeSize(list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof getBadgeSize) && Intrinsics.areEqual((Object) this.hereItems, (Object) ((getBadgeSize) obj).hereItems);
        }
        return true;
    }

    public final int hashCode() {
        List<TabBarColorModel> list = this.hereItems;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("HereGeocodeResponse(hereItems=");
        sb.append(this.hereItems);
        sb.append(")");
        return sb.toString();
    }

    public getBadgeSize(@Nullable List<TabBarColorModel> list) {
        this.hereItems = list;
    }

    @Nullable
    public final List<TabBarColorModel> getHereItems() {
        return this.hereItems;
    }
}
