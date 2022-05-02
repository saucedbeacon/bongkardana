package o;

import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0016ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lid/dana/data/loyalty/repository/source/LoyaltyEntityData;", "", "deleteReceiptDataByUserLoyaltyId", "Lio/reactivex/Observable;", "", "userLoyaltyId", "", "getReceiptDataByUserLoyaltyId", "Lid/dana/data/loyalty/repository/source/local/entity/LoyaltyReceiptEntity;", "saveReceiptData", "", "loyaltyReceiptEntity", "submitReceipt", "Lio/reactivex/Single;", "Lid/dana/data/loyalty/repository/source/network/response/SubmitReceiptResponse;", "submitReceiptRequest", "Lid/dana/data/loyalty/repository/source/network/request/SubmitReceiptRequest;", "token", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface com_alibaba_ariver_app_api_ExtOpt$75$1 {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Integer> deleteReceiptDataByUserLoyaltyId(@NotNull String str);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<com_alibaba_ariver_app_api_ExtOpt$80$1> getReceiptDataByUserLoyaltyId(@NotNull String str);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Long> saveReceiptData(@NotNull com_alibaba_ariver_app_api_ExtOpt$80$1 com_alibaba_ariver_app_api_extopt_80_1);

    @NotNull
    TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<com_alibaba_ariver_app_api_ExtOpt$88$1> submitReceipt(@NotNull com_alibaba_ariver_app_api_ExtOpt$81$1 com_alibaba_ariver_app_api_extopt_81_1, @NotNull String str);
}
