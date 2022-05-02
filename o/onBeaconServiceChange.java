package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.explore.view.ExploreDanaFragment;
import o.GriverManifest;
import o.getAlpha;
import o.getDuration;
import o.hexStringToBytes;

public final class onBeaconServiceChange implements getBindingAdapter<ExploreDanaFragment> {
    @InjectedFieldSignature("id.dana.explore.view.ExploreDanaFragment.readDeepLinkPropertiesPresenter")
    public static void getMin(ExploreDanaFragment exploreDanaFragment, getDuration.length length) {
        exploreDanaFragment.readDeepLinkPropertiesPresenter = length;
    }

    @InjectedFieldSignature("id.dana.explore.view.ExploreDanaFragment.globalSearchPresenter")
    public static void getMax(ExploreDanaFragment exploreDanaFragment, getAlpha.length length) {
        exploreDanaFragment.globalSearchPresenter = length;
    }

    @InjectedFieldSignature("id.dana.explore.view.ExploreDanaFragment.popularPlacesPresenter")
    public static void length(ExploreDanaFragment exploreDanaFragment, hexStringToBytes.setMax setmax) {
        exploreDanaFragment.popularPlacesPresenter = setmax;
    }

    @InjectedFieldSignature("id.dana.explore.view.ExploreDanaFragment.globalSearchAnalyticTracker")
    public static void getMin(ExploreDanaFragment exploreDanaFragment, GriverManifest.AnonymousClass11 r1) {
        exploreDanaFragment.globalSearchAnalyticTracker = r1;
    }
}
