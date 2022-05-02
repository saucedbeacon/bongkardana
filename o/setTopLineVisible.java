package o;

import id.dana.model.CurrencyAmountModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.DatePickerBridgeExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u001a\u0010\n\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/utils/CurrencyAmountUtil;", "", "()V", "DEFAULT_AMOUNT", "", "add", "currencyAmount1", "Lid/dana/model/CurrencyAmountModel;", "currencyAmount2", "addWithCleanAmount", "minus", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setTopLineVisible {
    @NotNull
    public static final setTopLineVisible setMax = new setTopLineVisible();

    private setTopLineVisible() {
    }

    @NotNull
    public static String getMax(@Nullable CurrencyAmountModel currencyAmountModel, @Nullable CurrencyAmountModel currencyAmountModel2) {
        String str;
        String cleanAll;
        String str2 = "0";
        if (currencyAmountModel == null || (str = isOriginHasAppInfo.getCleanAll(currencyAmountModel.getMax)) == null) {
            str = str2;
        }
        int max = DatePickerBridgeExtension.AnonymousClass7.setMax(str, 0);
        if (!(currencyAmountModel2 == null || (cleanAll = isOriginHasAppInfo.getCleanAll(currencyAmountModel2.getMax)) == null)) {
            str2 = cleanAll;
        }
        return String.valueOf(max + DatePickerBridgeExtension.AnonymousClass7.setMax(str2, 0));
    }

    @NotNull
    public static String setMin(@Nullable CurrencyAmountModel currencyAmountModel, @Nullable CurrencyAmountModel currencyAmountModel2) {
        String str;
        String cleanAll = isOriginHasAppInfo.getCleanAll(currencyAmountModel.getMax);
        String str2 = "0";
        if (cleanAll == null) {
            cleanAll = str2;
        }
        int max = DatePickerBridgeExtension.AnonymousClass7.setMax(cleanAll, 0);
        if (currencyAmountModel2 == null || (str = isOriginHasAppInfo.getCleanAll(currencyAmountModel2.getMax)) == null) {
            str = str2;
        }
        String valueOf = String.valueOf(max - DatePickerBridgeExtension.AnonymousClass7.setMax(str, 0));
        if (DatePickerBridgeExtension.AnonymousClass7.setMax(valueOf, 0) > 0) {
            str2 = valueOf;
        }
        String max2 = new CurrencyAmountModel(str2, "IDR").setMax();
        Intrinsics.checkNotNullExpressionValue(max2, "CurrencyAmountModel(resu…Y).currencyAndAmountValue");
        return max2;
    }
}
