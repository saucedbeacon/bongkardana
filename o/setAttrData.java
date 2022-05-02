package o;

import id.dana.data.network.ResultResponse;
import kotlin.Metadata;
import o.RemoteCallResult;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lid/dana/data/recentrecipient/source/network/ConvertCardIndexNoSecureApi;", "", "convertCardIndexNo", "Lio/reactivex/Observable;", "Lid/dana/data/network/ResultResponse;", "Lid/dana/data/recentrecipient/model/BankCardConversionResult;", "ctoken", "", "request", "Lid/dana/data/recentrecipient/model/BankCardConversionRequest;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface setAttrData {
    @NotNull
    @POST("/wallet/api/alipayplus.home.user.biztransfer.queryCardIndexNo.json")
    TitleBarRightButtonView.AnonymousClass1<ResultResponse<RemoteCallResult.AnonymousClass1>> convertCardIndexNo(@NotNull @Query("ctoken") String str, @NotNull @Body isError iserror);
}
