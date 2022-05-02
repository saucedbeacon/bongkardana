package o;

import o.TitleBarRightButtonView;
import retrofit2.http.GET;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

public interface ActionSheetPoint {
    @Streaming
    @GET
    TitleBarRightButtonView.AnonymousClass1<getAppenderManager<NotSendableException>> downloadFile(@Url String str);
}
