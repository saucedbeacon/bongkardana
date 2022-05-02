package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.AppNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lid/dana/domain/account/model/Transaction;", "", "type", "", "date", "(Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class GriverOptionMenuPanelExtension {
    @NotNull
    private final String date;
    @NotNull
    private final String type;

    public static /* synthetic */ GriverOptionMenuPanelExtension copy$default(GriverOptionMenuPanelExtension griverOptionMenuPanelExtension, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = griverOptionMenuPanelExtension.type;
        }
        if ((i & 2) != 0) {
            str2 = griverOptionMenuPanelExtension.date;
        }
        return griverOptionMenuPanelExtension.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.type;
    }

    @NotNull
    public final String component2() {
        return this.date;
    }

    @NotNull
    public final GriverOptionMenuPanelExtension copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(str2, AppNode.AnonymousClass2.KEY_DATE);
        return new GriverOptionMenuPanelExtension(str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GriverOptionMenuPanelExtension)) {
            return false;
        }
        GriverOptionMenuPanelExtension griverOptionMenuPanelExtension = (GriverOptionMenuPanelExtension) obj;
        return Intrinsics.areEqual((Object) this.type, (Object) griverOptionMenuPanelExtension.type) && Intrinsics.areEqual((Object) this.date, (Object) griverOptionMenuPanelExtension.date);
    }

    public final int hashCode() {
        String str = this.type;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.date;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Transaction(type=");
        sb.append(this.type);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(")");
        return sb.toString();
    }

    public GriverOptionMenuPanelExtension(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(str2, AppNode.AnonymousClass2.KEY_DATE);
        this.type = str;
        this.date = str2;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }
}
