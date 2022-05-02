package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.sendmoney.external.SendMoneyExternalActivity;
import o.notifyFail;

public final class chooseImage implements getBindingAdapter<SendMoneyExternalActivity> {
    @InjectedFieldSignature("id.dana.sendmoney.external.SendMoneyExternalActivity.sendMoneyExternalPresenter")
    public static void setMax(SendMoneyExternalActivity sendMoneyExternalActivity, notifyFail.getMin getmin) {
        sendMoneyExternalActivity.sendMoneyExternalPresenter = getmin;
    }
}
