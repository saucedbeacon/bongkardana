package o;

import com.alibaba.griver.core.jsapi.device.location.RequestPermission;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/anggrayudi/storage/permission/PermissionResult;", "", "permissions", "", "Lcom/anggrayudi/storage/permission/PermissionReport;", "(Ljava/util/List;)V", "areAllPermissionsGranted", "", "getAreAllPermissionsGranted", "()Z", "getPermissions", "()Ljava/util/List;", "storage_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class layoutChildRight {
    @NotNull
    private final List<ensureNavButtonView> getMax;

    public layoutChildRight(@NotNull List<ensureNavButtonView> list) {
        Intrinsics.checkNotNullParameter(list, RequestPermission.PERMISSIONS);
        this.getMax = list;
    }

    public final boolean getMax() {
        Iterable<ensureNavButtonView> iterable = this.getMax;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (ensureNavButtonView length : iterable) {
            if (!length.length()) {
                return false;
            }
        }
        return true;
    }
}
