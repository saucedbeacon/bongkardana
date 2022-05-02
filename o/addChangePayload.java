package o;

import dagger.Lazy;
import dagger.internal.InjectedFieldSignature;
import id.dana.AppLifeCycleObserver;
import id.dana.DanaApplication;
import id.dana.DanaLocalBroadcastReceiver;
import id.dana.danah5.extension.DanaGriverAppLanguageExtension;
import id.dana.danah5.extension.DanaGriverUserAgentExtension;
import id.dana.danah5.httprequest.HttpRequestExtension;
import o.GriverDecodeUrl;

public final class addChangePayload implements getBindingAdapter<DanaApplication> {
    @InjectedFieldSignature("id.dana.DanaApplication.apLogFacade")
    public static void length(DanaApplication danaApplication, VisitUrlPoint visitUrlPoint) {
        danaApplication.apLogFacade = visitUrlPoint;
    }

    @InjectedFieldSignature("id.dana.DanaApplication.appLifeCycleObserver")
    public static void getMax(DanaApplication danaApplication, AppLifeCycleObserver appLifeCycleObserver) {
        danaApplication.appLifeCycleObserver = appLifeCycleObserver;
    }

    @InjectedFieldSignature("id.dana.DanaApplication.splitObservant")
    public static void getMin(DanaApplication danaApplication, Lazy<EmojiImageSpan> lazy) {
        danaApplication.splitObservant = lazy;
    }

    @InjectedFieldSignature("id.dana.DanaApplication.splitFacade")
    public static void length(DanaApplication danaApplication, Lazy<UpdateAppCallback> lazy) {
        danaApplication.splitFacade = lazy;
    }

    @InjectedFieldSignature("id.dana.DanaApplication.applicationOrientationCallback")
    public static void getMin(DanaApplication danaApplication, isAttachedToTransitionOverlay isattachedtotransitionoverlay) {
        danaApplication.applicationOrientationCallback = isattachedtotransitionoverlay;
    }

    @InjectedFieldSignature("id.dana.DanaApplication.danaLocalBroadcastReceiver")
    public static void setMax(DanaApplication danaApplication, DanaLocalBroadcastReceiver danaLocalBroadcastReceiver) {
        danaApplication.danaLocalBroadcastReceiver = danaLocalBroadcastReceiver;
    }

    @InjectedFieldSignature("id.dana.DanaApplication.deviceInformationProvider")
    public static void setMin(DanaApplication danaApplication, Lazy<getPerformanceTracker> lazy) {
        danaApplication.deviceInformationProvider = lazy;
    }

    @InjectedFieldSignature("id.dana.DanaApplication.iapPushFacade")
    public static void getMax(DanaApplication danaApplication, onAppPause onapppause) {
        danaApplication.iapPushFacade = onapppause;
    }

    @InjectedFieldSignature("id.dana.DanaApplication.mixpanel")
    public static void setMax(DanaApplication danaApplication, Lazy<DistinctPacketDetector> lazy) {
        danaApplication.mixpanel = lazy;
    }

    @InjectedFieldSignature("id.dana.DanaApplication.httpRequestExtension")
    public static void getMax(DanaApplication danaApplication, Lazy<HttpRequestExtension> lazy) {
        danaApplication.httpRequestExtension = lazy;
    }

    @InjectedFieldSignature("id.dana.DanaApplication.danaGriverAppLanguageExtension")
    public static void isInside(DanaApplication danaApplication, Lazy<DanaGriverAppLanguageExtension> lazy) {
        danaApplication.danaGriverAppLanguageExtension = lazy;
    }

    @InjectedFieldSignature("id.dana.DanaApplication.danaGriverUserAgentExtension")
    public static void toIntRange(DanaApplication danaApplication, Lazy<DanaGriverUserAgentExtension> lazy) {
        danaApplication.danaGriverUserAgentExtension = lazy;
    }

    @InjectedFieldSignature("id.dana.DanaApplication.globalNetworkProxyPresenter")
    public static void toFloatRange(DanaApplication danaApplication, Lazy<GriverDecodeUrl.length> lazy) {
        danaApplication.globalNetworkProxyPresenter = lazy;
    }

    @InjectedFieldSignature("id.dana.DanaApplication.openH5Lazy")
    public static void equals(DanaApplication danaApplication, Lazy<onShowCustomView> lazy) {
        danaApplication.openH5Lazy = lazy;
    }

    @InjectedFieldSignature("id.dana.DanaApplication.getLatestSubdivision")
    public static void IsOverlapping(DanaApplication danaApplication, Lazy<EventPoint> lazy) {
        danaApplication.getLatestSubdivision = lazy;
    }
}
