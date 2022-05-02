package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lid/dana/data/promocenter/repository/source/network/request/PromoCenterAdsQueryRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "radius", "", "page", "size", "(III)V", "getPage", "()I", "getRadius", "getSize", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class NativePermissionRequire extends BaseRpcRequest {
    private final int page;
    private final int radius;
    private final int size;

    public static /* synthetic */ NativePermissionRequire copy$default(NativePermissionRequire nativePermissionRequire, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = nativePermissionRequire.radius;
        }
        if ((i4 & 2) != 0) {
            i2 = nativePermissionRequire.page;
        }
        if ((i4 & 4) != 0) {
            i3 = nativePermissionRequire.size;
        }
        return nativePermissionRequire.copy(i, i2, i3);
    }

    public final int component1() {
        return this.radius;
    }

    public final int component2() {
        return this.page;
    }

    public final int component3() {
        return this.size;
    }

    @NotNull
    public final NativePermissionRequire copy(int i, int i2, int i3) {
        return new NativePermissionRequire(i, i2, i3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativePermissionRequire)) {
            return false;
        }
        NativePermissionRequire nativePermissionRequire = (NativePermissionRequire) obj;
        return this.radius == nativePermissionRequire.radius && this.page == nativePermissionRequire.page && this.size == nativePermissionRequire.size;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoCenterAdsQueryRequest(radius=");
        sb.append(this.radius);
        sb.append(", page=");
        sb.append(this.page);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(")");
        return sb.toString();
    }

    public final int getRadius() {
        return this.radius;
    }

    public final int getPage() {
        return this.page;
    }

    public final int getSize() {
        return this.size;
    }

    public NativePermissionRequire(int i, int i2, int i3) {
        this.radius = i;
        this.page = i2;
        this.size = i3;
    }

    public final int hashCode() {
        return (((Integer.valueOf(this.radius).hashCode() * 31) + Integer.valueOf(this.page).hashCode()) * 31) + Integer.valueOf(this.size).hashCode();
    }
}
