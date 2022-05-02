package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.AppLifeCycleObserver;
import id.dana.pay.PayActivity;
import o.FragmentStateAdapter$5;
import o.PdfImageSource;
import o.fakeDragBy;
import o.getPageSize;
import o.isUserInputEnabled;
import o.onNext;

public final class copyContentToTemp implements getBindingAdapter<PayActivity> {
    @InjectedFieldSignature("id.dana.pay.PayActivity.appLifeCycleObserver")
    public static void getMax(PayActivity payActivity, AppLifeCycleObserver appLifeCycleObserver) {
        payActivity.appLifeCycleObserver = appLifeCycleObserver;
    }

    @InjectedFieldSignature("id.dana.pay.PayActivity.getPaymentResultPresenter")
    public static void setMax(PayActivity payActivity, FragmentStateAdapter$5.setMin setmin) {
        payActivity.getPaymentResultPresenter = setmin;
    }

    @InjectedFieldSignature("id.dana.pay.PayActivity.offlinePresenter")
    public static void getMin(PayActivity payActivity, getPageSize.setMin setmin) {
        payActivity.offlinePresenter = setmin;
    }

    @InjectedFieldSignature("id.dana.pay.PayActivity.payQrPresenter")
    public static void getMax(PayActivity payActivity, isUserInputEnabled.getMax getmax) {
        payActivity.payQrPresenter = getmax;
    }

    @InjectedFieldSignature("id.dana.pay.PayActivity.playStoreReviewPresenter")
    public static void setMax(PayActivity payActivity, PdfImageSource.setMin setmin) {
        payActivity.playStoreReviewPresenter = setmin;
    }

    @InjectedFieldSignature("id.dana.pay.PayActivity.queryPayMethodPresenter")
    public static void getMin(PayActivity payActivity, fakeDragBy.length length) {
        payActivity.queryPayMethodPresenter = length;
    }

    @InjectedFieldSignature("id.dana.pay.PayActivity.globalNetworkPresenter")
    public static void setMin(PayActivity payActivity, onNext.setMin setmin) {
        payActivity.globalNetworkPresenter = setmin;
    }

    @InjectedFieldSignature("id.dana.pay.PayActivity.sessionExpiredManager")
    public static void setMax(PayActivity payActivity, CustomPopMenuExtension customPopMenuExtension) {
        payActivity.sessionExpiredManager = customPopMenuExtension;
    }
}
