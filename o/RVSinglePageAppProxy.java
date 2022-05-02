package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toMultiCurrencyMoneyView", "Lid/dana/domain/investment/model/MultiCurrencyMoneyView;", "Lid/dana/data/investment/repository/source/network/response/MultiCurrencyMoneyResult;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class RVSinglePageAppProxy {
    @NotNull
    public static final isForeground setMax(@NotNull createApp createapp) {
        Intrinsics.checkNotNullParameter(createapp, "$this$toMultiCurrencyMoneyView");
        return new isForeground(createapp.getAmount(), createapp.getCent(), createapp.getCentFactor(), createapp.getCurrency(), createapp.getCurrencyCode(), createapp.getCurrencyValue());
    }
}
