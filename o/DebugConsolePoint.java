package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lid/dana/data/merchant/repository/source/network/request/Denom;", "", "amount", "", "currency", "", "(DLjava/lang/String;)V", "getAmount", "()D", "getCurrency", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class DebugConsolePoint {
    @SerializedName("amount")
    private final double amount;
    @SerializedName("currency")
    @NotNull
    private final String currency;

    public static /* synthetic */ DebugConsolePoint copy$default(DebugConsolePoint debugConsolePoint, double d, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = debugConsolePoint.amount;
        }
        if ((i & 2) != 0) {
            str = debugConsolePoint.currency;
        }
        return debugConsolePoint.copy(d, str);
    }

    public final double component1() {
        return this.amount;
    }

    @NotNull
    public final String component2() {
        return this.currency;
    }

    @NotNull
    public final DebugConsolePoint copy(double d, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.Param.CURRENCY);
        return new DebugConsolePoint(d, str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebugConsolePoint)) {
            return false;
        }
        DebugConsolePoint debugConsolePoint = (DebugConsolePoint) obj;
        return Double.compare(this.amount, debugConsolePoint.amount) == 0 && Intrinsics.areEqual((Object) this.currency, (Object) debugConsolePoint.currency);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Denom(amount=");
        sb.append(this.amount);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(")");
        return sb.toString();
    }

    public DebugConsolePoint(double d, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.Param.CURRENCY);
        this.amount = d;
        this.currency = str;
    }

    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    public final int hashCode() {
        int hashCode = Double.valueOf(this.amount).hashCode() * 31;
        String str = this.currency;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
