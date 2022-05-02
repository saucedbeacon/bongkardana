package o;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0015\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u001f\u0010\t\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lid/dana/domain/user/MiniProgramUserInfoResponse;", "", "userInfo", "", "", "(Ljava/util/Map;)V", "getUserInfo", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class startBleScan {
    @NotNull
    private final Map<String, String> userInfo;

    public static /* synthetic */ startBleScan copy$default(startBleScan startblescan, Map<String, String> map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = startblescan.userInfo;
        }
        return startblescan.copy(map);
    }

    @NotNull
    public final Map<String, String> component1() {
        return this.userInfo;
    }

    @NotNull
    public final startBleScan copy(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "userInfo");
        return new startBleScan(map);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof startBleScan) && Intrinsics.areEqual((Object) this.userInfo, (Object) ((startBleScan) obj).userInfo);
        }
        return true;
    }

    public final int hashCode() {
        Map<String, String> map = this.userInfo;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MiniProgramUserInfoResponse(userInfo=");
        sb.append(this.userInfo);
        sb.append(")");
        return sb.toString();
    }

    public startBleScan(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "userInfo");
        this.userInfo = map;
    }

    @NotNull
    public final Map<String, String> getUserInfo() {
        return this.userInfo;
    }
}
