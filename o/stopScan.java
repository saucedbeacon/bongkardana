package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.domain.statement.StatementType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lid/dana/domain/statement/model/TotalStatement;", "", "type", "Lid/dana/domain/statement/StatementType;", "amount", "", "currency", "(Lid/dana/domain/statement/StatementType;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getCurrency", "getType", "()Lid/dana/domain/statement/StatementType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class stopScan {
    @NotNull
    private final String amount;
    @NotNull
    private final String currency;
    @NotNull
    private final StatementType type;

    public static /* synthetic */ stopScan copy$default(stopScan stopscan, StatementType statementType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            statementType = stopscan.type;
        }
        if ((i & 2) != 0) {
            str = stopscan.amount;
        }
        if ((i & 4) != 0) {
            str2 = stopscan.currency;
        }
        return stopscan.copy(statementType, str, str2);
    }

    @NotNull
    public final StatementType component1() {
        return this.type;
    }

    @NotNull
    public final String component2() {
        return this.amount;
    }

    @NotNull
    public final String component3() {
        return this.currency;
    }

    @NotNull
    public final stopScan copy(@NotNull StatementType statementType, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(statementType, "type");
        Intrinsics.checkNotNullParameter(str, "amount");
        Intrinsics.checkNotNullParameter(str2, FirebaseAnalytics.Param.CURRENCY);
        return new stopScan(statementType, str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stopScan)) {
            return false;
        }
        stopScan stopscan = (stopScan) obj;
        return Intrinsics.areEqual((Object) this.type, (Object) stopscan.type) && Intrinsics.areEqual((Object) this.amount, (Object) stopscan.amount) && Intrinsics.areEqual((Object) this.currency, (Object) stopscan.currency);
    }

    public final int hashCode() {
        StatementType statementType = this.type;
        int i = 0;
        int hashCode = (statementType != null ? statementType.hashCode() : 0) * 31;
        String str = this.amount;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.currency;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TotalStatement(type=");
        sb.append(this.type);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(")");
        return sb.toString();
    }

    public stopScan(@NotNull StatementType statementType, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(statementType, "type");
        Intrinsics.checkNotNullParameter(str, "amount");
        Intrinsics.checkNotNullParameter(str2, FirebaseAnalytics.Param.CURRENCY);
        this.type = statementType;
        this.amount = str;
        this.currency = str2;
    }

    @NotNull
    public final StatementType getType() {
        return this.type;
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }
}
