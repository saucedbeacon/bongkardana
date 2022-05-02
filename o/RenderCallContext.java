package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.NativeCallContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lid/dana/data/nearbyplaces/repository/source/network/result/GeometryResult;", "", "location", "Lid/dana/data/nearbyplaces/repository/source/network/result/LocationResult;", "(Lid/dana/data/nearbyplaces/repository/source/network/result/LocationResult;)V", "getLocation", "()Lid/dana/data/nearbyplaces/repository/source/network/result/LocationResult;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class RenderCallContext {
    @NotNull
    private final NativeCallContext.StatData.AnonymousClass1 location;

    public class Builder {
        private String config;
        private String memo;
        private String resultStatus;
    }

    public static /* synthetic */ RenderCallContext copy$default(RenderCallContext renderCallContext, NativeCallContext.StatData.AnonymousClass1 r1, int i, Object obj) {
        if ((i & 1) != 0) {
            r1 = renderCallContext.location;
        }
        return renderCallContext.copy(r1);
    }

    @NotNull
    public final NativeCallContext.StatData.AnonymousClass1 component1() {
        return this.location;
    }

    @NotNull
    public final RenderCallContext copy(@NotNull NativeCallContext.StatData.AnonymousClass1 r2) {
        Intrinsics.checkNotNullParameter(r2, "location");
        return new RenderCallContext(r2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof RenderCallContext) && Intrinsics.areEqual((Object) this.location, (Object) ((RenderCallContext) obj).location);
        }
        return true;
    }

    public final int hashCode() {
        NativeCallContext.StatData.AnonymousClass1 r0 = this.location;
        if (r0 != null) {
            return r0.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("GeometryResult(location=");
        sb.append(this.location);
        sb.append(")");
        return sb.toString();
    }

    public RenderCallContext(@NotNull NativeCallContext.StatData.AnonymousClass1 r2) {
        Intrinsics.checkNotNullParameter(r2, "location");
        this.location = r2;
    }

    @NotNull
    public final NativeCallContext.StatData.AnonymousClass1 getLocation() {
        return this.location;
    }
}
