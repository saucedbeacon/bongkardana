package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.sendmoney.paymethod.ChangePayMethodView;
import o.ForceStopRunnable$BroadcastReceiver;

public final class getOffset implements getBindingAdapter<ChangePayMethodView> {
    @InjectedFieldSignature("id.dana.sendmoney.paymethod.ChangePayMethodView.payMethodAdapter")
    public static void setMin(ChangePayMethodView changePayMethodView, PhotoInfo photoInfo) {
        changePayMethodView.payMethodAdapter = photoInfo;
    }

    @InjectedFieldSignature("id.dana.sendmoney.paymethod.ChangePayMethodView.presenter")
    public static void length(ChangePayMethodView changePayMethodView, ForceStopRunnable$BroadcastReceiver.setMin setmin) {
        changePayMethodView.presenter = setmin;
    }
}
