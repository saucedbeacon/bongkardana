package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.nearbyrevamp.otherstore.OtherStoreResultView;
import id.dana.nearbyrevamp.search.NearbySearchFragment;
import o.distanceInfluenceForSnapDuration;
import o.setTextColor;
import o.showOpenSettingView;

public final class AuthGuideExtension implements getBindingAdapter<NearbySearchFragment> {

    /* renamed from: o.AuthGuideExtension$1  reason: invalid class name */
    public final class AnonymousClass1 implements getBindingAdapter<OtherStoreResultView> {
        @InjectedFieldSignature("id.dana.nearbyrevamp.otherstore.OtherStoreResultView.otherStorePresenter")
        public static void setMin(OtherStoreResultView otherStoreResultView, distanceInfluenceForSnapDuration.getMax getmax) {
            otherStoreResultView.otherStorePresenter = getmax;
        }

        @InjectedFieldSignature("id.dana.nearbyrevamp.otherstore.OtherStoreResultView.nearbyAnalyticTracker")
        public static void getMax(OtherStoreResultView otherStoreResultView, t tVar) {
            otherStoreResultView.nearbyAnalyticTracker = tVar;
        }
    }

    @InjectedFieldSignature("id.dana.nearbyrevamp.search.NearbySearchFragment.presenter")
    public static void setMax(NearbySearchFragment nearbySearchFragment, showOpenSettingView.length length) {
        nearbySearchFragment.presenter = length;
    }

    @InjectedFieldSignature("id.dana.nearbyrevamp.search.NearbySearchFragment.searchPresenter")
    public static void setMin(NearbySearchFragment nearbySearchFragment, setTextColor.length length) {
        nearbySearchFragment.searchPresenter = length;
    }

    @InjectedFieldSignature("id.dana.nearbyrevamp.search.NearbySearchFragment.nearbyAnalyticTracker")
    public static void length(NearbySearchFragment nearbySearchFragment, t tVar) {
        nearbySearchFragment.nearbyAnalyticTracker = tVar;
    }
}
