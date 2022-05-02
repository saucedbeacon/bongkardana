package o;

import id.dana.data.network.ResultResponse;
import kotlin.Metadata;
import o.DebugConsoleExtension;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH'J(\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\fH'J(\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u000fH'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lid/dana/data/merchant/repository/source/network/ProductInfoFacade;", "", "bizDestinationInquiry", "Lio/reactivex/Observable;", "Lid/dana/data/network/ResultResponse;", "Lid/dana/data/merchant/repository/source/network/response/BizDestinationInquiryResult;", "ctoken", "", "request", "Lid/dana/data/merchant/repository/source/network/request/BizDestinationInquiryRequest;", "createProductOrder", "Lid/dana/data/merchant/repository/source/network/response/CreateProductOrderResult;", "Lid/dana/data/merchant/repository/source/network/request/CreateProductOrderRequest;", "queryLastSuccessfulTransaction", "Lid/dana/data/merchant/repository/source/network/response/QueryLastSuccessfulTransactionResponse;", "Lid/dana/data/merchant/repository/source/network/request/QueryLastSuccessfulTransactionRequest;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface isDebugPanelExists {
    @NotNull
    @POST("wallet/api/alipayplus.mobilewallet.product.inquire.biz.destination.json")
    TitleBarRightButtonView.AnonymousClass1<ResultResponse<RVDebugConsoleProxy>> bizDestinationInquiry(@NotNull @Query("ctoken") String str, @NotNull @Body sendMsgToConsoleView sendmsgtoconsoleview);

    @NotNull
    @POST("wallet/api/alipayplus.mobilewallet.product.order.json")
    TitleBarRightButtonView.AnonymousClass1<ResultResponse<sendMsgToConsole>> createProductOrder(@NotNull @Query("ctoken") String str, @NotNull @Body DebugConsoleExtension.AnonymousClass1 r2);

    @NotNull
    @POST("wallet/api/alipayplus.mobilewallet.product.query.successful.biz.id.json?ctoken=2TBRbGgl6DbfpykG")
    TitleBarRightButtonView.AnonymousClass1<ResultResponse<setToggleButtonVisible>> queryLastSuccessfulTransaction(@NotNull @Query("ctoken") String str, @NotNull @Body setNode setnode);
}
