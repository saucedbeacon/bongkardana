package o;

import id.dana.data.deeplink.repository.source.branch.result.DeepLinkPayloadPropertiesEntity;
import o.TitleBarRightButtonView;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface finish {
    @GET("url")
    TitleBarRightButtonView.AnonymousClass1<DeepLinkPayloadPropertiesEntity> getDeepLinkProperties(@Query("url") String str, @Query("branch_key") String str2);
}
