package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/core/PermissionResult;", "", "permission", "", "isGranted", "", "(Ljava/lang/String;Z)V", "()Z", "getPermission", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
public final class pushWindow {
    @NotNull
    public final String length;
    private final boolean setMax;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pushWindow)) {
            return false;
        }
        pushWindow pushwindow = (pushWindow) obj;
        return Intrinsics.areEqual((Object) this.length, (Object) pushwindow.length) && this.setMax == pushwindow.setMax;
    }

    public final int hashCode() {
        String str = this.length;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.setMax;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PermissionResult(permission=");
        sb.append(this.length);
        sb.append(", isGranted=");
        sb.append(this.setMax);
        sb.append(")");
        return sb.toString();
    }

    public pushWindow(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "permission");
        this.length = str;
        this.setMax = z;
    }

    public final boolean setMax() {
        return this.setMax;
    }
}
