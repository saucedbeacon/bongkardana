package o;

import id.dana.data.network.ResultResponse;
import o.IpcClientKernelUtils;
import o.IpcMessage;
import o.TitleBarRightButtonView;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface decode {
    @POST("/wallet/api/alipayplus.mobilewallet.withdraw.namecheck.json")
    TitleBarRightButtonView.AnonymousClass1<ResultResponse<IpcMessage.AnonymousClass1>> nameCheck(@Query("ctoken") String str, @Body IpcClientKernelUtils.AnonymousClass1 r2);
}
