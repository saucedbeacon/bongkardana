package o;

import id.dana.model.CurrencyAmountModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/myprofile/mapper/SavingSummarySettingMapper;", "", "()V", "getSubtittle", "", "savingSummaryModel", "Lid/dana/savings/model/SavingSummaryModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setResult {
    @NotNull
    public static final setResult setMax = new setResult();

    private setResult() {
    }

    @NotNull
    public static String setMax(@NotNull SightCameraView sightCameraView) {
        Intrinsics.checkNotNullParameter(sightCameraView, "savingSummaryModel");
        if (sightCameraView.getMin.isEmpty()) {
            return "";
        }
        CurrencyAmountModel currencyAmountModel = new CurrencyAmountModel(sightCameraView.length.setMin);
        currencyAmountModel.length = "IDR";
        String length = setLineVisible.length(currencyAmountModel);
        Intrinsics.checkNotNullExpressionValue(length, "BalanceUtil.parse(saving…vingBalanceAmount.amount)");
        return length;
    }
}
