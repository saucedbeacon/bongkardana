package o;

import id.dana.domain.investment.AccountInvestmentStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b5\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0014J\u000b\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010-J\u0001\u0010C\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010DJ\u0013\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020IHÖ\u0001J\t\u0010J\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010\f\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0016\"\u0004\b)\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0016\"\u0004\b+\u0010\u0018R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001f\"\u0004\b2\u0010!R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0016\"\u0004\b4\u0010\u0018R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0016\"\u0004\b6\u0010\u0018¨\u0006K"}, d2 = {"Lid/dana/domain/investment/model/UserInvestmentInfo;", "", "accountStatus", "Lid/dana/domain/investment/AccountInvestmentStatus;", "(Lid/dana/domain/investment/AccountInvestmentStatus;)V", "accountId", "", "aggregator", "availableBalance", "Lid/dana/domain/investment/model/MultiCurrencyMoneyView;", "balanceUnit", "Lid/dana/domain/investment/model/InvestmentUnitInfo;", "dailyGainLossAmount", "dailyGainLossPercentage", "goodsId", "lastUpdated", "", "totalGainLossAmount", "totalGainLossPercentage", "userId", "(Ljava/lang/String;Lid/dana/domain/investment/AccountInvestmentStatus;Ljava/lang/String;Lid/dana/domain/investment/model/MultiCurrencyMoneyView;Lid/dana/domain/investment/model/InvestmentUnitInfo;Lid/dana/domain/investment/model/MultiCurrencyMoneyView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lid/dana/domain/investment/model/MultiCurrencyMoneyView;Ljava/lang/String;Ljava/lang/String;)V", "getAccountId", "()Ljava/lang/String;", "setAccountId", "(Ljava/lang/String;)V", "getAccountStatus", "()Lid/dana/domain/investment/AccountInvestmentStatus;", "setAccountStatus", "getAggregator", "setAggregator", "getAvailableBalance", "()Lid/dana/domain/investment/model/MultiCurrencyMoneyView;", "setAvailableBalance", "(Lid/dana/domain/investment/model/MultiCurrencyMoneyView;)V", "getBalanceUnit", "()Lid/dana/domain/investment/model/InvestmentUnitInfo;", "setBalanceUnit", "(Lid/dana/domain/investment/model/InvestmentUnitInfo;)V", "getDailyGainLossAmount", "setDailyGainLossAmount", "getDailyGainLossPercentage", "setDailyGainLossPercentage", "getGoodsId", "setGoodsId", "getLastUpdated", "()Ljava/lang/Long;", "setLastUpdated", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getTotalGainLossAmount", "setTotalGainLossAmount", "getTotalGainLossPercentage", "setTotalGainLossPercentage", "getUserId", "setUserId", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lid/dana/domain/investment/AccountInvestmentStatus;Ljava/lang/String;Lid/dana/domain/investment/model/MultiCurrencyMoneyView;Lid/dana/domain/investment/model/InvestmentUnitInfo;Lid/dana/domain/investment/model/MultiCurrencyMoneyView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lid/dana/domain/investment/model/MultiCurrencyMoneyView;Ljava/lang/String;Ljava/lang/String;)Lid/dana/domain/investment/model/UserInvestmentInfo;", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getWorkSpaceId {
    @Nullable
    private String accountId;
    @NotNull
    private AccountInvestmentStatus accountStatus;
    @Nullable
    private String aggregator;
    @Nullable
    private isForeground availableBalance;
    @Nullable
    private getVerifyPulickey balanceUnit;
    @Nullable
    private isForeground dailyGainLossAmount;
    @Nullable
    private String dailyGainLossPercentage;
    @Nullable
    private String goodsId;
    @Nullable
    private Long lastUpdated;
    @Nullable
    private isForeground totalGainLossAmount;
    @Nullable
    private String totalGainLossPercentage;
    @Nullable
    private String userId;

    public static /* synthetic */ getWorkSpaceId copy$default(getWorkSpaceId getworkspaceid, String str, AccountInvestmentStatus accountInvestmentStatus, String str2, isForeground isforeground, getVerifyPulickey getverifypulickey, isForeground isforeground2, String str3, String str4, Long l, isForeground isforeground3, String str5, String str6, int i, Object obj) {
        getWorkSpaceId getworkspaceid2 = getworkspaceid;
        int i2 = i;
        return getworkspaceid.copy((i2 & 1) != 0 ? getworkspaceid2.accountId : str, (i2 & 2) != 0 ? getworkspaceid2.accountStatus : accountInvestmentStatus, (i2 & 4) != 0 ? getworkspaceid2.aggregator : str2, (i2 & 8) != 0 ? getworkspaceid2.availableBalance : isforeground, (i2 & 16) != 0 ? getworkspaceid2.balanceUnit : getverifypulickey, (i2 & 32) != 0 ? getworkspaceid2.dailyGainLossAmount : isforeground2, (i2 & 64) != 0 ? getworkspaceid2.dailyGainLossPercentage : str3, (i2 & 128) != 0 ? getworkspaceid2.goodsId : str4, (i2 & 256) != 0 ? getworkspaceid2.lastUpdated : l, (i2 & 512) != 0 ? getworkspaceid2.totalGainLossAmount : isforeground3, (i2 & 1024) != 0 ? getworkspaceid2.totalGainLossPercentage : str5, (i2 & 2048) != 0 ? getworkspaceid2.userId : str6);
    }

    @Nullable
    public final String component1() {
        return this.accountId;
    }

    @Nullable
    public final isForeground component10() {
        return this.totalGainLossAmount;
    }

    @Nullable
    public final String component11() {
        return this.totalGainLossPercentage;
    }

    @Nullable
    public final String component12() {
        return this.userId;
    }

    @NotNull
    public final AccountInvestmentStatus component2() {
        return this.accountStatus;
    }

    @Nullable
    public final String component3() {
        return this.aggregator;
    }

    @Nullable
    public final isForeground component4() {
        return this.availableBalance;
    }

    @Nullable
    public final getVerifyPulickey component5() {
        return this.balanceUnit;
    }

    @Nullable
    public final isForeground component6() {
        return this.dailyGainLossAmount;
    }

    @Nullable
    public final String component7() {
        return this.dailyGainLossPercentage;
    }

    @Nullable
    public final String component8() {
        return this.goodsId;
    }

    @Nullable
    public final Long component9() {
        return this.lastUpdated;
    }

    @NotNull
    public final getWorkSpaceId copy(@Nullable String str, @NotNull AccountInvestmentStatus accountInvestmentStatus, @Nullable String str2, @Nullable isForeground isforeground, @Nullable getVerifyPulickey getverifypulickey, @Nullable isForeground isforeground2, @Nullable String str3, @Nullable String str4, @Nullable Long l, @Nullable isForeground isforeground3, @Nullable String str5, @Nullable String str6) {
        AccountInvestmentStatus accountInvestmentStatus2 = accountInvestmentStatus;
        Intrinsics.checkNotNullParameter(accountInvestmentStatus2, "accountStatus");
        return new getWorkSpaceId(str, accountInvestmentStatus2, str2, isforeground, getverifypulickey, isforeground2, str3, str4, l, isforeground3, str5, str6);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getWorkSpaceId)) {
            return false;
        }
        getWorkSpaceId getworkspaceid = (getWorkSpaceId) obj;
        return Intrinsics.areEqual((Object) this.accountId, (Object) getworkspaceid.accountId) && Intrinsics.areEqual((Object) this.accountStatus, (Object) getworkspaceid.accountStatus) && Intrinsics.areEqual((Object) this.aggregator, (Object) getworkspaceid.aggregator) && Intrinsics.areEqual((Object) this.availableBalance, (Object) getworkspaceid.availableBalance) && Intrinsics.areEqual((Object) this.balanceUnit, (Object) getworkspaceid.balanceUnit) && Intrinsics.areEqual((Object) this.dailyGainLossAmount, (Object) getworkspaceid.dailyGainLossAmount) && Intrinsics.areEqual((Object) this.dailyGainLossPercentage, (Object) getworkspaceid.dailyGainLossPercentage) && Intrinsics.areEqual((Object) this.goodsId, (Object) getworkspaceid.goodsId) && Intrinsics.areEqual((Object) this.lastUpdated, (Object) getworkspaceid.lastUpdated) && Intrinsics.areEqual((Object) this.totalGainLossAmount, (Object) getworkspaceid.totalGainLossAmount) && Intrinsics.areEqual((Object) this.totalGainLossPercentage, (Object) getworkspaceid.totalGainLossPercentage) && Intrinsics.areEqual((Object) this.userId, (Object) getworkspaceid.userId);
    }

    public final int hashCode() {
        String str = this.accountId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        AccountInvestmentStatus accountInvestmentStatus = this.accountStatus;
        int hashCode2 = (hashCode + (accountInvestmentStatus != null ? accountInvestmentStatus.hashCode() : 0)) * 31;
        String str2 = this.aggregator;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        isForeground isforeground = this.availableBalance;
        int hashCode4 = (hashCode3 + (isforeground != null ? isforeground.hashCode() : 0)) * 31;
        getVerifyPulickey getverifypulickey = this.balanceUnit;
        int hashCode5 = (hashCode4 + (getverifypulickey != null ? getverifypulickey.hashCode() : 0)) * 31;
        isForeground isforeground2 = this.dailyGainLossAmount;
        int hashCode6 = (hashCode5 + (isforeground2 != null ? isforeground2.hashCode() : 0)) * 31;
        String str3 = this.dailyGainLossPercentage;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.goodsId;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Long l = this.lastUpdated;
        int hashCode9 = (hashCode8 + (l != null ? l.hashCode() : 0)) * 31;
        isForeground isforeground3 = this.totalGainLossAmount;
        int hashCode10 = (hashCode9 + (isforeground3 != null ? isforeground3.hashCode() : 0)) * 31;
        String str5 = this.totalGainLossPercentage;
        int hashCode11 = (hashCode10 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.userId;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode11 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UserInvestmentInfo(accountId=");
        sb.append(this.accountId);
        sb.append(", accountStatus=");
        sb.append(this.accountStatus);
        sb.append(", aggregator=");
        sb.append(this.aggregator);
        sb.append(", availableBalance=");
        sb.append(this.availableBalance);
        sb.append(", balanceUnit=");
        sb.append(this.balanceUnit);
        sb.append(", dailyGainLossAmount=");
        sb.append(this.dailyGainLossAmount);
        sb.append(", dailyGainLossPercentage=");
        sb.append(this.dailyGainLossPercentage);
        sb.append(", goodsId=");
        sb.append(this.goodsId);
        sb.append(", lastUpdated=");
        sb.append(this.lastUpdated);
        sb.append(", totalGainLossAmount=");
        sb.append(this.totalGainLossAmount);
        sb.append(", totalGainLossPercentage=");
        sb.append(this.totalGainLossPercentage);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(")");
        return sb.toString();
    }

    public getWorkSpaceId(@Nullable String str, @NotNull AccountInvestmentStatus accountInvestmentStatus, @Nullable String str2, @Nullable isForeground isforeground, @Nullable getVerifyPulickey getverifypulickey, @Nullable isForeground isforeground2, @Nullable String str3, @Nullable String str4, @Nullable Long l, @Nullable isForeground isforeground3, @Nullable String str5, @Nullable String str6) {
        Intrinsics.checkNotNullParameter(accountInvestmentStatus, "accountStatus");
        this.accountId = str;
        this.accountStatus = accountInvestmentStatus;
        this.aggregator = str2;
        this.availableBalance = isforeground;
        this.balanceUnit = getverifypulickey;
        this.dailyGainLossAmount = isforeground2;
        this.dailyGainLossPercentage = str3;
        this.goodsId = str4;
        this.lastUpdated = l;
        this.totalGainLossAmount = isforeground3;
        this.totalGainLossPercentage = str5;
        this.userId = str6;
    }

    @Nullable
    public final String getAccountId() {
        return this.accountId;
    }

    public final void setAccountId(@Nullable String str) {
        this.accountId = str;
    }

    @NotNull
    public final AccountInvestmentStatus getAccountStatus() {
        return this.accountStatus;
    }

    public final void setAccountStatus(@NotNull AccountInvestmentStatus accountInvestmentStatus) {
        Intrinsics.checkNotNullParameter(accountInvestmentStatus, "<set-?>");
        this.accountStatus = accountInvestmentStatus;
    }

    @Nullable
    public final String getAggregator() {
        return this.aggregator;
    }

    public final void setAggregator(@Nullable String str) {
        this.aggregator = str;
    }

    @Nullable
    public final isForeground getAvailableBalance() {
        return this.availableBalance;
    }

    public final void setAvailableBalance(@Nullable isForeground isforeground) {
        this.availableBalance = isforeground;
    }

    @Nullable
    public final getVerifyPulickey getBalanceUnit() {
        return this.balanceUnit;
    }

    public final void setBalanceUnit(@Nullable getVerifyPulickey getverifypulickey) {
        this.balanceUnit = getverifypulickey;
    }

    @Nullable
    public final isForeground getDailyGainLossAmount() {
        return this.dailyGainLossAmount;
    }

    public final void setDailyGainLossAmount(@Nullable isForeground isforeground) {
        this.dailyGainLossAmount = isforeground;
    }

    @Nullable
    public final String getDailyGainLossPercentage() {
        return this.dailyGainLossPercentage;
    }

    public final void setDailyGainLossPercentage(@Nullable String str) {
        this.dailyGainLossPercentage = str;
    }

    @Nullable
    public final String getGoodsId() {
        return this.goodsId;
    }

    public final void setGoodsId(@Nullable String str) {
        this.goodsId = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ getWorkSpaceId(java.lang.String r17, id.dana.domain.investment.AccountInvestmentStatus r18, java.lang.String r19, o.isForeground r20, o.getVerifyPulickey r21, o.isForeground r22, java.lang.String r23, java.lang.String r24, java.lang.Long r25, o.isForeground r26, java.lang.String r27, java.lang.String r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
        /*
            r16 = this;
            r0 = r29
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r4 = r2
            goto L_0x000c
        L_0x000a:
            r4 = r17
        L_0x000c:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0012
            r6 = r2
            goto L_0x0014
        L_0x0012:
            r6 = r19
        L_0x0014:
            r1 = r0 & 8
            r3 = 0
            if (r1 == 0) goto L_0x001b
            r7 = r3
            goto L_0x001d
        L_0x001b:
            r7 = r20
        L_0x001d:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0023
            r8 = r3
            goto L_0x0025
        L_0x0023:
            r8 = r21
        L_0x0025:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x002b
            r9 = r3
            goto L_0x002d
        L_0x002b:
            r9 = r22
        L_0x002d:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0033
            r10 = r2
            goto L_0x0035
        L_0x0033:
            r10 = r23
        L_0x0035:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x003b
            r11 = r2
            goto L_0x003d
        L_0x003b:
            r11 = r24
        L_0x003d:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0049
            r12 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r12)
            r12 = r1
            goto L_0x004b
        L_0x0049:
            r12 = r25
        L_0x004b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0051
            r13 = r3
            goto L_0x0053
        L_0x0051:
            r13 = r26
        L_0x0053:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0059
            r14 = r2
            goto L_0x005b
        L_0x0059:
            r14 = r27
        L_0x005b:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0061
            r15 = r2
            goto L_0x0063
        L_0x0061:
            r15 = r28
        L_0x0063:
            r3 = r16
            r5 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getWorkSpaceId.<init>(java.lang.String, id.dana.domain.investment.AccountInvestmentStatus, java.lang.String, o.isForeground, o.getVerifyPulickey, o.isForeground, java.lang.String, java.lang.String, java.lang.Long, o.isForeground, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final Long getLastUpdated() {
        return this.lastUpdated;
    }

    public final void setLastUpdated(@Nullable Long l) {
        this.lastUpdated = l;
    }

    @Nullable
    public final isForeground getTotalGainLossAmount() {
        return this.totalGainLossAmount;
    }

    public final void setTotalGainLossAmount(@Nullable isForeground isforeground) {
        this.totalGainLossAmount = isforeground;
    }

    @Nullable
    public final String getTotalGainLossPercentage() {
        return this.totalGainLossPercentage;
    }

    public final void setTotalGainLossPercentage(@Nullable String str) {
        this.totalGainLossPercentage = str;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public final void setUserId(@Nullable String str) {
        this.userId = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public getWorkSpaceId(@org.jetbrains.annotations.NotNull id.dana.domain.investment.AccountInvestmentStatus r17) {
        /*
            r16 = this;
            java.lang.String r0 = "accountStatus"
            r3 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r2 = 0
            java.lang.String r13 = ""
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 2045(0x7fd, float:2.866E-42)
            r15 = 0
            r1 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getWorkSpaceId.<init>(id.dana.domain.investment.AccountInvestmentStatus):void");
    }
}
