package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.richview.boundcard.DebitCardView;
import o.onNext;

public final class getListener implements getBindingAdapter<DebitCardView> {
    @InjectedFieldSignature("id.dana.richview.boundcard.DebitCardView.globalNetworkPresenter")
    public static void setMax(DebitCardView debitCardView, onNext.setMin setmin) {
        debitCardView.globalNetworkPresenter = setmin;
    }
}
