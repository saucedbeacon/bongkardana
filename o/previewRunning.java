package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.richview.socialshare.SocialShareView;
import o.OrientationDetector;

public final class previewRunning implements getBindingAdapter<SocialShareView> {
    @InjectedFieldSignature("id.dana.richview.socialshare.SocialShareView.presenter")
    public static void getMax(SocialShareView socialShareView, OrientationDetector.MyTabOrientationListener.setMin setmin) {
        socialShareView.presenter = setmin;
    }
}
