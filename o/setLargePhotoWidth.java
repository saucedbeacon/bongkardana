package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.sendmoney.view.ExpireTimeView;
import o.onExecuted;

public final class setLargePhotoWidth implements getBindingAdapter<ExpireTimeView> {
    @InjectedFieldSignature("id.dana.sendmoney.view.ExpireTimeView.expiryPresenter")
    public static void setMax(ExpireTimeView expireTimeView, onExecuted.getMin getmin) {
        expireTimeView.expiryPresenter = getmin;
    }
}
