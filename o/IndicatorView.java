package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.sendmoney_v2.paymethod.PayMethodView;
import o.ForceStopRunnable$BroadcastReceiver;

public final class IndicatorView implements getBindingAdapter<PayMethodView> {
    @InjectedFieldSignature("id.dana.sendmoney_v2.paymethod.PayMethodView.presenter")
    public static void getMin(PayMethodView payMethodView, ForceStopRunnable$BroadcastReceiver.setMin setmin) {
        payMethodView.presenter = setmin;
    }

    @InjectedFieldSignature("id.dana.sendmoney_v2.paymethod.PayMethodView.payMethodAdapter")
    public static void setMax(PayMethodView payMethodView, PhotoInfo photoInfo) {
        payMethodView.payMethodAdapter = photoInfo;
    }
}
