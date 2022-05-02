package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\nR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lid/dana/data/investment/repository/source/network/response/MultiCurrencyMoneyResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "amount", "", "cent", "centFactor", "currency", "", "currencyCode", "currencyValue", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCent", "getCentFactor", "getCurrency", "()Ljava/lang/String;", "getCurrencyCode", "getCurrencyValue", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class createApp extends BaseRpcResult {
    @Nullable
    private final Long amount;
    @Nullable
    private final Long cent;
    @Nullable
    private final Long centFactor;
    @Nullable
    private final String currency;
    @Nullable
    private final String currencyCode;
    @Nullable
    private final String currencyValue;

    @Nullable
    public final Long getAmount() {
        return this.amount;
    }

    @Nullable
    public final Long getCent() {
        return this.cent;
    }

    @Nullable
    public final Long getCentFactor() {
        return this.centFactor;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @Nullable
    public final String getCurrencyValue() {
        return this.currencyValue;
    }

    public createApp(@Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.amount = l;
        this.cent = l2;
        this.centFactor = l3;
        this.currency = str;
        this.currencyCode = str2;
        this.currencyValue = str3;
    }
}
