package o;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lid/dana/data/nearbyplaces/repository/source/network/result/PlaceStructuredFormattingResult;", "", "mainText", "", "secondaryText", "(Ljava/lang/String;Ljava/lang/String;)V", "getMainText", "()Ljava/lang/String;", "getSecondaryText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getEventId {
    @SerializedName("main_text")
    @NotNull
    private final String mainText;
    @SerializedName("secondary_text")
    @NotNull
    private final String secondaryText;

    public static /* synthetic */ getEventId copy$default(getEventId geteventid, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = geteventid.mainText;
        }
        if ((i & 2) != 0) {
            str2 = geteventid.secondaryText;
        }
        return geteventid.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.mainText;
    }

    @NotNull
    public final String component2() {
        return this.secondaryText;
    }

    @NotNull
    public final getEventId copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "mainText");
        Intrinsics.checkNotNullParameter(str2, "secondaryText");
        return new getEventId(str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getEventId)) {
            return false;
        }
        getEventId geteventid = (getEventId) obj;
        return Intrinsics.areEqual((Object) this.mainText, (Object) geteventid.mainText) && Intrinsics.areEqual((Object) this.secondaryText, (Object) geteventid.secondaryText);
    }

    public final int hashCode() {
        String str = this.mainText;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.secondaryText;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaceStructuredFormattingResult(mainText=");
        sb.append(this.mainText);
        sb.append(", secondaryText=");
        sb.append(this.secondaryText);
        sb.append(")");
        return sb.toString();
    }

    public getEventId(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "mainText");
        Intrinsics.checkNotNullParameter(str2, "secondaryText");
        this.mainText = str;
        this.secondaryText = str2;
    }

    @NotNull
    public final String getMainText() {
        return this.mainText;
    }

    @NotNull
    public final String getSecondaryText() {
        return this.secondaryText;
    }
}
