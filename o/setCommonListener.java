package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.oauth.activity.OauthGrantActivity;
import o.ScreenShotObserver;
import o.dispatchOnPageScrolled;
import o.getDuration;

public final class setCommonListener implements getBindingAdapter<OauthGrantActivity> {
    @InjectedFieldSignature("id.dana.oauth.activity.OauthGrantActivity.presenter")
    public static void getMin(OauthGrantActivity oauthGrantActivity, dispatchOnPageScrolled.length length) {
        oauthGrantActivity.presenter = length;
    }

    @InjectedFieldSignature("id.dana.oauth.activity.OauthGrantActivity.readLinkPropertiesPresenter")
    public static void getMax(OauthGrantActivity oauthGrantActivity, getDuration.length length) {
        oauthGrantActivity.readLinkPropertiesPresenter = length;
    }

    @InjectedFieldSignature("id.dana.oauth.activity.OauthGrantActivity.scopeAdapter")
    public static void length(OauthGrantActivity oauthGrantActivity, ScreenShotObserver.H5ScreenShotListener h5ScreenShotListener) {
        oauthGrantActivity.scopeAdapter = h5ScreenShotListener;
    }
}
