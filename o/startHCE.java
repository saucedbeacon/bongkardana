package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.news.LatestNewsFragment;
import o.AddPhoneContactBridgeExtension;
import o.getDuration;

public final class startHCE implements getBindingAdapter<LatestNewsFragment> {
    @InjectedFieldSignature("id.dana.news.LatestNewsFragment.latestNewsPresenter")
    public static void setMin(LatestNewsFragment latestNewsFragment, AddPhoneContactBridgeExtension.AnonymousClass3.setMin setmin) {
        latestNewsFragment.latestNewsPresenter = setmin;
    }

    @InjectedFieldSignature("id.dana.news.LatestNewsFragment.readDeepLinkPropertiesPresenter")
    public static void getMin(LatestNewsFragment latestNewsFragment, getDuration.length length) {
        latestNewsFragment.readDeepLinkPropertiesPresenter = length;
    }
}
