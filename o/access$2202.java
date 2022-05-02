package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lid/dana/social/model/SocialFeedWrapperModel;", "", "data", "", "Lid/dana/social/model/SocialFeedModel;", "fromCache", "", "(Ljava/util/List;Z)V", "getData", "()Ljava/util/List;", "getFromCache", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class access$2202 {
    private final boolean setMax;
    @NotNull
    public final List<access$2502> setMin;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof access$2202)) {
            return false;
        }
        access$2202 access_2202 = (access$2202) obj;
        return Intrinsics.areEqual((Object) this.setMin, (Object) access_2202.setMin) && this.setMax == access_2202.setMax;
    }

    public final int hashCode() {
        List<access$2502> list = this.setMin;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.setMax;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SocialFeedWrapperModel(data=");
        sb.append(this.setMin);
        sb.append(", fromCache=");
        sb.append(this.setMax);
        sb.append(")");
        return sb.toString();
    }

    public access$2202(@NotNull List<access$2502> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "data");
        this.setMin = list;
        this.setMax = z;
    }

    public final boolean getMin() {
        return this.setMax;
    }
}
