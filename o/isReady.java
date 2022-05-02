package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, d2 = {"toMoneyView", "Lid/dana/domain/nearbyme/model/MoneyView;", "Lid/dana/data/nearbyme/model/MoneyViewEntity;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class isReady {
    @NotNull
    public static final getAppDir toMoneyView(@Nullable onWorkerReady onworkerready) {
        if (onworkerready == null) {
            return new getAppDir((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        }
        String amount = onworkerready.getAmount();
        String str = "";
        if (amount == null) {
            amount = str;
        }
        String currency = onworkerready.getCurrency();
        if (currency == null) {
            currency = str;
        }
        String currencyCode = onworkerready.getCurrencyCode();
        if (currencyCode != null) {
            str = currencyCode;
        }
        return new getAppDir(amount, currency, str);
    }
}
