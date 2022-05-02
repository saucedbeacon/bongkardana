package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lid/dana/data/here/model/AddressHighlights;", "", "label", "", "Lid/dana/data/here/model/Title;", "city", "(Ljava/util/List;Ljava/util/List;)V", "getCity", "()Ljava/util/List;", "getLabel", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getBadgeText {
    @SerializedName("city")
    @Nullable
    private final List<Object> city;
    @SerializedName("label")
    @Nullable
    private final List<Object> label;

    public static /* synthetic */ getBadgeText copy$default(getBadgeText getbadgetext, List<Object> list, List<Object> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getbadgetext.label;
        }
        if ((i & 2) != 0) {
            list2 = getbadgetext.city;
        }
        return getbadgetext.copy(list, list2);
    }

    @Nullable
    public final List<Object> component1() {
        return this.label;
    }

    @Nullable
    public final List<Object> component2() {
        return this.city;
    }

    @NotNull
    public final getBadgeText copy(@Nullable List<Object> list, @Nullable List<Object> list2) {
        return new getBadgeText(list, list2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getBadgeText)) {
            return false;
        }
        getBadgeText getbadgetext = (getBadgeText) obj;
        return Intrinsics.areEqual((Object) this.label, (Object) getbadgetext.label) && Intrinsics.areEqual((Object) this.city, (Object) getbadgetext.city);
    }

    public final int hashCode() {
        List<Object> list = this.label;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<Object> list2 = this.city;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("AddressHighlights(label=");
        sb.append(this.label);
        sb.append(", city=");
        sb.append(this.city);
        sb.append(")");
        return sb.toString();
    }

    public getBadgeText(@Nullable List<Object> list, @Nullable List<Object> list2) {
        this.label = list;
        this.city = list2;
    }

    @Nullable
    public final List<Object> getLabel() {
        return this.label;
    }

    @Nullable
    public final List<Object> getCity() {
        return this.city;
    }
}
