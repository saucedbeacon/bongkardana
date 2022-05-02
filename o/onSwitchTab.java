package o;

import javax.inject.Inject;
import o.GriverHttpRequestAPIExtension;
import o.SplashView;
import o.TitleBarRightButtonView;

public class onSwitchTab implements GriverHttpRequestAPIExtension.RequestContext {
    @Inject
    onSwitchTab() {
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> getChangePhoneNumberH5Event() {
        return TitleBarRightButtonView.AnonymousClass1.defer(SplashView.Status.length);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$getChangePhoneNumberH5Event$0(TitleBarRightButtonView.AnonymousClass2 r0, getStatus getstatus) {
        if (getstatus != null) {
            r0.onNext(Boolean.valueOf(getstatus.isApiSuccess()));
            r0.onComplete();
            return;
        }
        r0.onError(new NullPointerException());
    }
}
