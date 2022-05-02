package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.richview.ToggleBalanceView;
import o.onNext;
import o.parameters;

public final class readPictureDegree implements getBindingAdapter<ToggleBalanceView> {
    @InjectedFieldSignature("id.dana.richview.ToggleBalanceView.getBalancePresenter")
    public static void setMax(ToggleBalanceView toggleBalanceView, parameters.setMax setmax) {
        toggleBalanceView.getBalancePresenter = setmax;
    }

    @InjectedFieldSignature("id.dana.richview.ToggleBalanceView.globalNetworkPresenter")
    public static void getMin(ToggleBalanceView toggleBalanceView, onNext.setMin setmin) {
        toggleBalanceView.globalNetworkPresenter = setmin;
    }
}
