package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"toDigitalMoneyEntity", "Lid/dana/data/sendmoney/model/DigitalMoneyEntity;", "Lid/dana/data/sendmoney/model/DigitalMoneyResult;", "prefix", "", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class removeOnMain {
    @NotNull
    public static final isInDomain toDigitalMoneyEntity(@NotNull calculateSize calculatesize, @NotNull String str) {
        Intrinsics.checkNotNullParameter(calculatesize, "$this$toDigitalMoneyEntity");
        Intrinsics.checkNotNullParameter(str, "prefix");
        return new isInDomain(calculatesize.getInstId(), str, calculatesize.getBankName(), calculatesize.getEWalletName(), calculatesize.getIdentifier());
    }
}
