package id.dana.globalsearch.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lid/dana/globalsearch/model/RecentAutoComplete;", "", "name", "", "category", "belongTo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBelongTo", "()Ljava/lang/String;", "getCategory", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Keep
public final class RecentAutoComplete {
    @NotNull
    private final String belongTo;
    @NotNull
    private final String category;
    @NotNull
    private final String name;

    public static /* synthetic */ RecentAutoComplete copy$default(RecentAutoComplete recentAutoComplete, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recentAutoComplete.name;
        }
        if ((i & 2) != 0) {
            str2 = recentAutoComplete.category;
        }
        if ((i & 4) != 0) {
            str3 = recentAutoComplete.belongTo;
        }
        return recentAutoComplete.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    @NotNull
    public final String component2() {
        return this.category;
    }

    @NotNull
    public final String component3() {
        return this.belongTo;
    }

    @NotNull
    public final RecentAutoComplete copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "category");
        Intrinsics.checkNotNullParameter(str3, "belongTo");
        return new RecentAutoComplete(str, str2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentAutoComplete)) {
            return false;
        }
        RecentAutoComplete recentAutoComplete = (RecentAutoComplete) obj;
        return Intrinsics.areEqual((Object) this.name, (Object) recentAutoComplete.name) && Intrinsics.areEqual((Object) this.category, (Object) recentAutoComplete.category) && Intrinsics.areEqual((Object) this.belongTo, (Object) recentAutoComplete.belongTo);
    }

    public final int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.category;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.belongTo;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("RecentAutoComplete(name=");
        sb.append(this.name);
        sb.append(", category=");
        sb.append(this.category);
        sb.append(", belongTo=");
        sb.append(this.belongTo);
        sb.append(")");
        return sb.toString();
    }

    public RecentAutoComplete(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "category");
        Intrinsics.checkNotNullParameter(str3, "belongTo");
        this.name = str;
        this.category = str2;
        this.belongTo = str3;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecentAutoComplete(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, str3);
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    public final String getBelongTo() {
        return this.belongTo;
    }
}
