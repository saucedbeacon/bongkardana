package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lid/dana/social/model/ReactionModel;", "", "kind", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getKind", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class access$2402 {
    @NotNull
    public final String getMax;
    @NotNull
    public final String setMin;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof access$2402)) {
            return false;
        }
        access$2402 access_2402 = (access$2402) obj;
        return Intrinsics.areEqual((Object) this.setMin, (Object) access_2402.setMin) && Intrinsics.areEqual((Object) this.getMax, (Object) access_2402.getMax);
    }

    public final int hashCode() {
        String str = this.setMin;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.getMax;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ReactionModel(kind=");
        sb.append(this.setMin);
        sb.append(", name=");
        sb.append(this.getMax);
        sb.append(")");
        return sb.toString();
    }

    public access$2402(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "kind");
        Intrinsics.checkNotNullParameter(str2, "name");
        this.setMin = str;
        this.getMax = str2;
    }
}
