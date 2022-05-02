package o;

import id.dana.domain.authcode.interactor.GetAuthCode;
import o.INebulaPage;

public final class getPresetPackagePath implements getBindingAdapter<BLEServiceUnit> {
    public static void setMin(BLEServiceUnit bLEServiceUnit, isDispatcherOnWorkerThread isdispatcheronworkerthread, isCanceled iscanceled) {
        bLEServiceUnit.invoke = isdispatcheronworkerthread;
        bLEServiceUnit.invokeSuspend = iscanceled;
    }

    public static void setMax(BLEServiceUnit bLEServiceUnit, INebulaPage.H5PageHandler h5PageHandler, getInternalContentView getinternalcontentview, shouldExit shouldexit, NXH5WebViewClientAdapter nXH5WebViewClientAdapter, getShareUrl getshareurl) {
        bLEServiceUnit.setMax = h5PageHandler;
        bLEServiceUnit.getMin = getinternalcontentview;
        bLEServiceUnit.IsOverlapping = shouldexit;
        bLEServiceUnit.toIntRange = nXH5WebViewClientAdapter;
        bLEServiceUnit.Mean$Arithmetic = getshareurl;
    }

    public static void setMax(BLEServiceUnit bLEServiceUnit, cannotInitUC cannotinituc, hasPageStartButNoInterceptRequest haspagestartbutnointerceptrequest, releaseView releaseview, setEventSource seteventsource, getRedirectUrl getredirecturl, getWebViewCoreSoPath getwebviewcoresopath, NXH5WebViewAdapter nXH5WebViewAdapter) {
        bLEServiceUnit.equals = cannotinituc;
        bLEServiceUnit.hashCode = haspagestartbutnointerceptrequest;
        bLEServiceUnit.toFloatRange = releaseview;
        bLEServiceUnit.isInside = seteventsource;
        bLEServiceUnit.valueOf = getredirecturl;
        bLEServiceUnit.toDoubleRange = getwebviewcoresopath;
        bLEServiceUnit.FastBitmap$CoordinateSystem = nXH5WebViewAdapter;
    }

    public static void setMin(BLEServiceUnit bLEServiceUnit, enableUCCorePreheadInit enableuccorepreheadinit, setH5OverScrollListener seth5overscrolllistener, IH5EmbedViewJSCallback iH5EmbedViewJSCallback, GetAuthCode getAuthCode) {
        bLEServiceUnit.toString = enableuccorepreheadinit;
        bLEServiceUnit.values = seth5overscrolllistener;
        bLEServiceUnit.setMin = iH5EmbedViewJSCallback;
        bLEServiceUnit.getMax = getAuthCode;
    }

    public static void setMin(BLEServiceUnit bLEServiceUnit, sendServiceWorkerPushMessage sendserviceworkerpushmessage) {
        bLEServiceUnit.length = sendserviceworkerpushmessage;
    }
}
