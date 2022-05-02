package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.AppLifeCycleObserver;
import id.dana.home.view.ZoomDialog;
import o.getPageSize;
import o.isUserInputEnabled;
import o.onNext;

public final class DefaultHttpRequestAPIExtension implements getBindingAdapter<ZoomDialog> {
    @InjectedFieldSignature("id.dana.home.view.ZoomDialog.appLifeCycleObserver")
    public static void setMin(ZoomDialog zoomDialog, AppLifeCycleObserver appLifeCycleObserver) {
        zoomDialog.appLifeCycleObserver = appLifeCycleObserver;
    }

    @InjectedFieldSignature("id.dana.home.view.ZoomDialog.offlinePayPresenter")
    public static void length(ZoomDialog zoomDialog, getPageSize.setMin setmin) {
        zoomDialog.offlinePayPresenter = setmin;
    }

    @InjectedFieldSignature("id.dana.home.view.ZoomDialog.payQrPresenter")
    public static void length(ZoomDialog zoomDialog, isUserInputEnabled.getMax getmax) {
        zoomDialog.payQrPresenter = getmax;
    }

    @InjectedFieldSignature("id.dana.home.view.ZoomDialog.globalNetworkPresenter")
    public static void length(ZoomDialog zoomDialog, onNext.setMin setmin) {
        zoomDialog.globalNetworkPresenter = setmin;
    }
}
