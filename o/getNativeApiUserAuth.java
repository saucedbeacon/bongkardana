package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lid/dana/data/userconsent/repository/source/network/ConsultAgreementRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "spaceCodes", "", "", "(Ljava/util/List;)V", "getSpaceCodes", "()Ljava/util/List;", "setSpaceCodes", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getNativeApiUserAuth extends BaseRpcRequest {
    @NotNull
    private List<String> spaceCodes;

    public static /* synthetic */ getNativeApiUserAuth copy$default(getNativeApiUserAuth getnativeapiuserauth, List<String> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getnativeapiuserauth.spaceCodes;
        }
        return getnativeapiuserauth.copy(list);
    }

    @NotNull
    public final List<String> component1() {
        return this.spaceCodes;
    }

    @NotNull
    public final getNativeApiUserAuth copy(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "spaceCodes");
        return new getNativeApiUserAuth(list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof getNativeApiUserAuth) && Intrinsics.areEqual((Object) this.spaceCodes, (Object) ((getNativeApiUserAuth) obj).spaceCodes);
        }
        return true;
    }

    public final int hashCode() {
        List<String> list = this.spaceCodes;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ConsultAgreementRequest(spaceCodes=");
        sb.append(this.spaceCodes);
        sb.append(")");
        return sb.toString();
    }

    public getNativeApiUserAuth(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "spaceCodes");
        this.spaceCodes = list;
    }

    @NotNull
    public final List<String> getSpaceCodes() {
        return this.spaceCodes;
    }

    public final void setSpaceCodes(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.spaceCodes = list;
    }
}
