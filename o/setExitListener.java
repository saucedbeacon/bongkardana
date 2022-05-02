package o;

import android.app.Activity;
import id.dana.data.deeplink.repository.source.branch.result.DeepLinkPayloadEntity;
import o.TitleBarRightButtonView;

public interface setExitListener {
    TitleBarRightButtonView.AnonymousClass1<Boolean> completeRegistration(String str, String str2);

    TitleBarRightButtonView.AnonymousClass1<DeepLinkPayloadEntity> getDeepLinkPayload();

    TitleBarRightButtonView.AnonymousClass1<DeepLinkPayloadEntity> initSession(Activity activity);

    TitleBarRightButtonView.AnonymousClass1<DeepLinkPayloadEntity> login(String str);

    TitleBarRightButtonView.AnonymousClass1<Boolean> logout();
}
