package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\b\u0010\u0018\u001a\u00020\u0007H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lid/dana/domain/referral/model/ReferralConsultResponse;", "Lid/dana/domain/model/rpc/response/BaseRpcResponse;", "enabled", "", "prizeAmount", "Lid/dana/domain/user/CurrencyAmount;", "referralCode", "", "(ZLid/dana/domain/user/CurrencyAmount;Ljava/lang/String;)V", "getEnabled", "()Z", "getPrizeAmount", "()Lid/dana/domain/user/CurrencyAmount;", "getReferralCode", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class ifNullConvertToEmpty extends initWithSecurityGuard {
    private final boolean enabled;
    @Nullable
    private final stopBleScan prizeAmount;
    @Nullable
    private final String referralCode;

    public static /* synthetic */ ifNullConvertToEmpty copy$default(ifNullConvertToEmpty ifnullconverttoempty, boolean z, stopBleScan stopblescan, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = ifnullconverttoempty.enabled;
        }
        if ((i & 2) != 0) {
            stopblescan = ifnullconverttoempty.prizeAmount;
        }
        if ((i & 4) != 0) {
            str = ifnullconverttoempty.referralCode;
        }
        return ifnullconverttoempty.copy(z, stopblescan, str);
    }

    public final boolean component1() {
        return this.enabled;
    }

    @Nullable
    public final stopBleScan component2() {
        return this.prizeAmount;
    }

    @Nullable
    public final String component3() {
        return this.referralCode;
    }

    @NotNull
    public final ifNullConvertToEmpty copy(boolean z, @Nullable stopBleScan stopblescan, @Nullable String str) {
        return new ifNullConvertToEmpty(z, stopblescan, str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifNullConvertToEmpty)) {
            return false;
        }
        ifNullConvertToEmpty ifnullconverttoempty = (ifNullConvertToEmpty) obj;
        return this.enabled == ifnullconverttoempty.enabled && Intrinsics.areEqual((Object) this.prizeAmount, (Object) ifnullconverttoempty.prizeAmount) && Intrinsics.areEqual((Object) this.referralCode, (Object) ifnullconverttoempty.referralCode);
    }

    public final int hashCode() {
        boolean z = this.enabled;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        stopBleScan stopblescan = this.prizeAmount;
        int i2 = 0;
        int hashCode = (i + (stopblescan != null ? stopblescan.hashCode() : 0)) * 31;
        String str = this.referralCode;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final stopBleScan getPrizeAmount() {
        return this.prizeAmount;
    }

    public ifNullConvertToEmpty(boolean z, @Nullable stopBleScan stopblescan, @Nullable String str) {
        this.enabled = z;
        this.prizeAmount = stopblescan;
        this.referralCode = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ifNullConvertToEmpty(boolean z, stopBleScan stopblescan, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, stopblescan, (i & 4) != 0 ? "" : str);
    }

    @Nullable
    public final String getReferralCode() {
        return this.referralCode;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ReferralConsultRespone{enabled=");
        sb.append(this.enabled);
        sb.append(", prizeAmount=");
        sb.append(this.prizeAmount);
        sb.append(", referralCode='");
        sb.append(this.referralCode);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
