package o;

import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ.\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lid/dana/data/loyalty/repository/source/network/LoyaltyApi;", "", "submitReceipt", "Lio/reactivex/Single;", "Lid/dana/data/loyalty/repository/source/network/response/BaseLoyaltyResponse;", "Lid/dana/data/loyalty/repository/source/network/response/SubmitReceiptResponse;", "bearerToken", "", "submitReceiptRequest", "Lid/dana/data/loyalty/repository/source/network/request/BaseLoyaltyRequest;", "Lid/dana/data/loyalty/repository/source/network/request/SubmitReceiptRequest;", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface com_alibaba_ariver_app_api_ExtOpt$82$1 {
    @NotNull
    public static final setMax Companion = setMax.$$INSTANCE;

    @NotNull
    @POST("/loyalty-pocket/api/receipt")
    TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<com_alibaba_ariver_app_api_ExtOpt$89$1<com_alibaba_ariver_app_api_ExtOpt$88$1>> submitReceipt(@NotNull @Header("Authorization") String str, @NotNull @Body com_alibaba_ariver_app_api_ExtOpt$85$1<com_alibaba_ariver_app_api_ExtOpt$81$1> com_alibaba_ariver_app_api_extopt_85_1);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/data/loyalty/repository/source/network/LoyaltyApi$Companion;", "", "()V", "HEADER_BEARER_TOKEN", "", "SUBMIT_RECIPT_ENDPOINT", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        static final /* synthetic */ setMax $$INSTANCE = new setMax();
        private static final String HEADER_BEARER_TOKEN = "Authorization";
        private static final String SUBMIT_RECIPT_ENDPOINT = "/loyalty-pocket/api/receipt";

        private setMax() {
        }
    }
}
