package o;

import id.dana.data.network.ResultResponse;
import o.TitleBarRightButtonView;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface setExtUrl {
    @POST("/wallet/api/alipayplus.mobilewallet.user.emailbinding.queryuseremail.json")
    TitleBarRightButtonView.AnonymousClass1<ResultResponse<getExtModel>> getEmailAddress(@Query("ctoken") String str);
}
