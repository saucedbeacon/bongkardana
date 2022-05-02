package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lid/dana/data/nearbyplaces/repository/source/network/result/PlaceComponentResult;", "", "geometry", "Lid/dana/data/nearbyplaces/repository/source/network/result/GeometryResult;", "(Lid/dana/data/nearbyplaces/repository/source/network/result/GeometryResult;)V", "getGeometry", "()Lid/dana/data/nearbyplaces/repository/source/network/result/GeometryResult;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class print {
    @NotNull
    private final RenderCallContext geometry;

    public static /* synthetic */ print copy$default(print print, RenderCallContext renderCallContext, int i, Object obj) {
        if ((i & 1) != 0) {
            renderCallContext = print.geometry;
        }
        return print.copy(renderCallContext);
    }

    @NotNull
    public final RenderCallContext component1() {
        return this.geometry;
    }

    @NotNull
    public final print copy(@NotNull RenderCallContext renderCallContext) {
        Intrinsics.checkNotNullParameter(renderCallContext, "geometry");
        return new print(renderCallContext);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof print) && Intrinsics.areEqual((Object) this.geometry, (Object) ((print) obj).geometry);
        }
        return true;
    }

    public final int hashCode() {
        RenderCallContext renderCallContext = this.geometry;
        if (renderCallContext != null) {
            return renderCallContext.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaceComponentResult(geometry=");
        sb.append(this.geometry);
        sb.append(")");
        return sb.toString();
    }

    public print(@NotNull RenderCallContext renderCallContext) {
        Intrinsics.checkNotNullParameter(renderCallContext, "geometry");
        this.geometry = renderCallContext;
    }

    @NotNull
    public final RenderCallContext getGeometry() {
        return this.geometry;
    }
}
