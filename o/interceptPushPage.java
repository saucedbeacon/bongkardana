package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lid/dana/data/geofence/repository/source/network/request/PoiFetchRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "Ljava/io/Serializable;", "location", "", "(Ljava/lang/String;)V", "getLocation", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class interceptPushPage extends BaseRpcRequest implements Serializable {
    @NotNull
    private final String location;

    public interceptPushPage() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ interceptPushPage copy$default(interceptPushPage interceptpushpage, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = interceptpushpage.location;
        }
        return interceptpushpage.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.location;
    }

    @NotNull
    public final interceptPushPage copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "location");
        return new interceptPushPage(str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof interceptPushPage) && Intrinsics.areEqual((Object) this.location, (Object) ((interceptPushPage) obj).location);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.location;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiFetchRequest(location=");
        sb.append(this.location);
        sb.append(")");
        return sb.toString();
    }

    public interceptPushPage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "location");
        this.location = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ interceptPushPage(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    @NotNull
    public final String getLocation() {
        return this.location;
    }
}
