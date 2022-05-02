package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\u0015"}, d2 = {"Lid/dana/domain/electronicmoney/model/request/BrizziHistoryInfo;", "", "merchatId", "", "terminalId", "trxDate", "trxTime", "trxType", "trxAmount", "balanceBefore", "balanceAfter", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBalanceAfter", "()Ljava/lang/String;", "getBalanceBefore", "getMerchatId", "getTerminalId", "getTrxAmount", "getTrxDate", "getTrxTime", "getTrxType", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setTextZoom {
    @NotNull
    private final String balanceAfter;
    @NotNull
    private final String balanceBefore;
    @NotNull
    private final String merchatId;
    @NotNull
    private final String terminalId;
    @NotNull
    private final String trxAmount;
    @NotNull
    private final String trxDate;
    @NotNull
    private final String trxTime;
    @NotNull
    private final String trxType;

    public setTextZoom(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "merchatId");
        Intrinsics.checkNotNullParameter(str2, "terminalId");
        Intrinsics.checkNotNullParameter(str3, "trxDate");
        Intrinsics.checkNotNullParameter(str4, "trxTime");
        Intrinsics.checkNotNullParameter(str5, "trxType");
        Intrinsics.checkNotNullParameter(str6, "trxAmount");
        Intrinsics.checkNotNullParameter(str7, "balanceBefore");
        Intrinsics.checkNotNullParameter(str8, "balanceAfter");
        this.merchatId = str;
        this.terminalId = str2;
        this.trxDate = str3;
        this.trxTime = str4;
        this.trxType = str5;
        this.trxAmount = str6;
        this.balanceBefore = str7;
        this.balanceAfter = str8;
    }

    @NotNull
    public final String getMerchatId() {
        return this.merchatId;
    }

    @NotNull
    public final String getTerminalId() {
        return this.terminalId;
    }

    @NotNull
    public final String getTrxDate() {
        return this.trxDate;
    }

    @NotNull
    public final String getTrxTime() {
        return this.trxTime;
    }

    @NotNull
    public final String getTrxType() {
        return this.trxType;
    }

    @NotNull
    public final String getTrxAmount() {
        return this.trxAmount;
    }

    @NotNull
    public final String getBalanceBefore() {
        return this.balanceBefore;
    }

    @NotNull
    public final String getBalanceAfter() {
        return this.balanceAfter;
    }
}
