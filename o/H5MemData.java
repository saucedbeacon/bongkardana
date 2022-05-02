package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0006\u0010\u000b\u001a\u00020\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/domain/profilecompletion/model/ProfileCompletionVisibility;", "", "visible", "", "(Z)V", "component1", "copy", "equals", "other", "hashCode", "", "isVisible", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class H5MemData {
    private final boolean visible;

    public H5MemData() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    private final boolean component1() {
        return this.visible;
    }

    public static /* synthetic */ H5MemData copy$default(H5MemData h5MemData, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = h5MemData.visible;
        }
        return h5MemData.copy(z);
    }

    @NotNull
    public final H5MemData copy(boolean z) {
        return new H5MemData(z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof H5MemData) && this.visible == ((H5MemData) obj).visible;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.visible;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileCompletionVisibility(visible=");
        sb.append(this.visible);
        sb.append(")");
        return sb.toString();
    }

    public H5MemData(boolean z) {
        this.visible = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H5MemData(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public final boolean isVisible() {
        return this.visible;
    }
}
