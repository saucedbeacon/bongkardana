package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lid/dana/data/kycrenewal/repository/source/network/result/QueryKYCUserDataResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "succes", "", "userInfoResult", "Lid/dana/data/kycrenewal/repository/source/network/result/KYCRenewalUserInfoResult;", "(ZLid/dana/data/kycrenewal/repository/source/network/result/KYCRenewalUserInfoResult;)V", "getSucces", "()Z", "getUserInfoResult", "()Lid/dana/data/kycrenewal/repository/source/network/result/KYCRenewalUserInfoResult;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class RVTabDotView extends BaseRpcResult {
    private final boolean succes;
    @Nullable
    private final setDotWidth userInfoResult;

    public static /* synthetic */ RVTabDotView copy$default(RVTabDotView rVTabDotView, boolean z, setDotWidth setdotwidth, int i, Object obj) {
        if ((i & 1) != 0) {
            z = rVTabDotView.succes;
        }
        if ((i & 2) != 0) {
            setdotwidth = rVTabDotView.userInfoResult;
        }
        return rVTabDotView.copy(z, setdotwidth);
    }

    public final boolean component1() {
        return this.succes;
    }

    @Nullable
    public final setDotWidth component2() {
        return this.userInfoResult;
    }

    @NotNull
    public final RVTabDotView copy(boolean z, @Nullable setDotWidth setdotwidth) {
        return new RVTabDotView(z, setdotwidth);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RVTabDotView)) {
            return false;
        }
        RVTabDotView rVTabDotView = (RVTabDotView) obj;
        return this.succes == rVTabDotView.succes && Intrinsics.areEqual((Object) this.userInfoResult, (Object) rVTabDotView.userInfoResult);
    }

    public final int hashCode() {
        boolean z = this.succes;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        setDotWidth setdotwidth = this.userInfoResult;
        return i + (setdotwidth != null ? setdotwidth.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("QueryKYCUserDataResult(succes=");
        sb.append(this.succes);
        sb.append(", userInfoResult=");
        sb.append(this.userInfoResult);
        sb.append(")");
        return sb.toString();
    }

    public final boolean getSucces() {
        return this.succes;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RVTabDotView(boolean z, setDotWidth setdotwidth, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? new setDotWidth((byte) 0) : setdotwidth);
    }

    @Nullable
    public final setDotWidth getUserInfoResult() {
        return this.userInfoResult;
    }

    public RVTabDotView(boolean z, @Nullable setDotWidth setdotwidth) {
        this.succes = z;
        this.userInfoResult = setdotwidth;
    }
}
