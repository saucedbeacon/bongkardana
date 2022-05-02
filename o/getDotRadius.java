package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lid/dana/data/kycrenewal/repository/source/network/result/QueryKYCRenewalStatusResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "renewKYC", "", "verificationId", "", "(ZLjava/lang/String;)V", "getRenewKYC", "()Z", "getVerificationId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getDotRadius extends BaseRpcResult {
    private final boolean renewKYC;
    @NotNull
    private final String verificationId;

    public static /* synthetic */ getDotRadius copy$default(getDotRadius getdotradius, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = getdotradius.renewKYC;
        }
        if ((i & 2) != 0) {
            str = getdotradius.verificationId;
        }
        return getdotradius.copy(z, str);
    }

    public final boolean component1() {
        return this.renewKYC;
    }

    @NotNull
    public final String component2() {
        return this.verificationId;
    }

    @NotNull
    public final getDotRadius copy(boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "verificationId");
        return new getDotRadius(z, str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getDotRadius)) {
            return false;
        }
        getDotRadius getdotradius = (getDotRadius) obj;
        return this.renewKYC == getdotradius.renewKYC && Intrinsics.areEqual((Object) this.verificationId, (Object) getdotradius.verificationId);
    }

    public final int hashCode() {
        boolean z = this.renewKYC;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.verificationId;
        return i + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("QueryKYCRenewalStatusResult(renewKYC=");
        sb.append(this.renewKYC);
        sb.append(", verificationId=");
        sb.append(this.verificationId);
        sb.append(")");
        return sb.toString();
    }

    public final boolean getRenewKYC() {
        return this.renewKYC;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getDotRadius(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? "" : str);
    }

    @NotNull
    public final String getVerificationId() {
        return this.verificationId;
    }

    public getDotRadius(boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "verificationId");
        this.renewKYC = z;
        this.verificationId = str;
    }
}
