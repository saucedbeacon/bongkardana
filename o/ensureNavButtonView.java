package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/anggrayudi/storage/permission/PermissionReport;", "", "permission", "", "isGranted", "", "deniedPermanently", "(Ljava/lang/String;ZZ)V", "getDeniedPermanently", "()Z", "getPermission", "()Ljava/lang/String;", "storage_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ensureNavButtonView {
    private final boolean getMax;
    @NotNull
    private final String length;
    private final boolean setMax;

    public ensureNavButtonView(@NotNull String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "permission");
        this.length = str;
        this.getMax = z;
        this.setMax = z2;
    }

    public final boolean length() {
        return this.getMax;
    }

    public final boolean setMax() {
        return this.setMax;
    }
}
