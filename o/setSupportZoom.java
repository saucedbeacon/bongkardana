package o;

import android.app.Activity;
import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\b\u0010\r\u001a\u00020\u0006H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lid/dana/domain/deeplink/repository/DeepLinkRepository;", "", "getDeepLinkPayload", "Lio/reactivex/Observable;", "Lid/dana/domain/deeplink/model/DeepLinkPayload;", "fromRoot", "", "initSession", "activity", "Landroid/app/Activity;", "readProperties", "url", "", "removeDeeplinkPayload", "domain_release"}, k = 1, mv = {1, 4, 2})
public interface setSupportZoom {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<getRequestHeaders> getDeepLinkPayload(boolean z);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<getRequestHeaders> initSession(@Nullable Activity activity);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<getRequestHeaders> readProperties(@Nullable String str);

    boolean removeDeeplinkPayload();
}
