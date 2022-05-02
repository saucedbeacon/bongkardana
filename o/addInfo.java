package o;

import id.dana.data.network.ResultResponse;
import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lid/dana/data/senddigitalmoney/repository/source/network/CardQueryNoPrefixApi;", "", "queryCardNoPrefix", "Lio/reactivex/Observable;", "Lid/dana/data/network/ResultResponse;", "Lid/dana/data/senddigitalmoney/repository/model/result/CardPrefixQueryResult;", "request", "Lid/dana/data/senddigitalmoney/repository/model/request/CardPrefixQueryRequest;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface addInfo {
    @NotNull
    @POST("/wallet/api/alipayplus.home.user.biztransfer.queryCardNoPrefix.json")
    TitleBarRightButtonView.AnonymousClass1<ResultResponse<getUserId>> length(@NotNull @Body SecurityUtils securityUtils);
}
