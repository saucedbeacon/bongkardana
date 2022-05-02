package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lid/dana/data/ott/OttVerifyRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "Ljava/io/Serializable;", "ottValue", "", "(Ljava/lang/String;)V", "getOttValue", "()Ljava/lang/String;", "setOttValue", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setAppId extends BaseRpcRequest implements Serializable {
    @NotNull
    private String ottValue;

    public static /* synthetic */ setAppId copy$default(setAppId setappid, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setappid.ottValue;
        }
        return setappid.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.ottValue;
    }

    @NotNull
    public final setAppId copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "ottValue");
        return new setAppId(str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof setAppId) && Intrinsics.areEqual((Object) this.ottValue, (Object) ((setAppId) obj).ottValue);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.ottValue;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("OttVerifyRequest(ottValue=");
        sb.append(this.ottValue);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getOttValue() {
        return this.ottValue;
    }

    public final void setOttValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ottValue = str;
    }

    public setAppId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "ottValue");
        this.ottValue = str;
    }
}
