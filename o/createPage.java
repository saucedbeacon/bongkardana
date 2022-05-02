package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0016\u0018\u00002\u00020\u0001B{\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0014¨\u0006$"}, d2 = {"Lid/dana/data/investment/repository/source/network/response/AccountInvestmentResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "accountId", "", "accountStatus", "aggregator", "availableBalance", "Lid/dana/data/investment/repository/source/network/response/MultiCurrencyMoneyResult;", "balanceUnit", "Lid/dana/data/investment/repository/source/network/response/InvestmentUnitResult;", "dailyGainLossAmount", "dailyGainLossPercentage", "goodsId", "lastUpdated", "", "totalGainLossAmount", "totalGainLossPercentage", "userId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/data/investment/repository/source/network/response/MultiCurrencyMoneyResult;Lid/dana/data/investment/repository/source/network/response/InvestmentUnitResult;Lid/dana/data/investment/repository/source/network/response/MultiCurrencyMoneyResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lid/dana/data/investment/repository/source/network/response/MultiCurrencyMoneyResult;Ljava/lang/String;Ljava/lang/String;)V", "getAccountId", "()Ljava/lang/String;", "getAccountStatus", "getAggregator", "getAvailableBalance", "()Lid/dana/data/investment/repository/source/network/response/MultiCurrencyMoneyResult;", "getBalanceUnit", "()Lid/dana/data/investment/repository/source/network/response/InvestmentUnitResult;", "getDailyGainLossAmount", "getDailyGainLossPercentage", "getGoodsId", "getLastUpdated", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTotalGainLossAmount", "getTotalGainLossPercentage", "getUserId", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class createPage extends BaseRpcResult {
    @Nullable
    private final String accountId;
    @NotNull
    private final String accountStatus;
    @Nullable
    private final String aggregator;
    @Nullable
    private final createApp availableBalance;
    @Nullable
    private final RVAppFactory balanceUnit;
    @Nullable
    private final createApp dailyGainLossAmount;
    @Nullable
    private final String dailyGainLossPercentage;
    @Nullable
    private final String goodsId;
    @Nullable
    private final Long lastUpdated;
    @Nullable
    private final createApp totalGainLossAmount;
    @Nullable
    private final String totalGainLossPercentage;
    @Nullable
    private final String userId;

    @Nullable
    public final String getAccountId() {
        return this.accountId;
    }

    @NotNull
    public final String getAccountStatus() {
        return this.accountStatus;
    }

    @Nullable
    public final String getAggregator() {
        return this.aggregator;
    }

    @Nullable
    public final createApp getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    public final RVAppFactory getBalanceUnit() {
        return this.balanceUnit;
    }

    @Nullable
    public final createApp getDailyGainLossAmount() {
        return this.dailyGainLossAmount;
    }

    @Nullable
    public final String getDailyGainLossPercentage() {
        return this.dailyGainLossPercentage;
    }

    @Nullable
    public final String getGoodsId() {
        return this.goodsId;
    }

    @Nullable
    public final Long getLastUpdated() {
        return this.lastUpdated;
    }

    @Nullable
    public final createApp getTotalGainLossAmount() {
        return this.totalGainLossAmount;
    }

    @Nullable
    public final String getTotalGainLossPercentage() {
        return this.totalGainLossPercentage;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public createPage(@Nullable String str, @NotNull String str2, @Nullable String str3, @Nullable createApp createapp, @Nullable RVAppFactory rVAppFactory, @Nullable createApp createapp2, @Nullable String str4, @Nullable String str5, @Nullable Long l, @Nullable createApp createapp3, @Nullable String str6, @Nullable String str7) {
        Intrinsics.checkNotNullParameter(str2, "accountStatus");
        this.accountId = str;
        this.accountStatus = str2;
        this.aggregator = str3;
        this.availableBalance = createapp;
        this.balanceUnit = rVAppFactory;
        this.dailyGainLossAmount = createapp2;
        this.dailyGainLossPercentage = str4;
        this.goodsId = str5;
        this.lastUpdated = l;
        this.totalGainLossAmount = createapp3;
        this.totalGainLossPercentage = str6;
        this.userId = str7;
    }
}
