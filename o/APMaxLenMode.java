package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.sendmoney.bank.other.OtherBankAccountView;

public final class APMaxLenMode implements getBindingAdapter<OtherBankAccountView> {
    @InjectedFieldSignature("id.dana.sendmoney.bank.other.OtherBankAccountView.presenter")
    public static void length(OtherBankAccountView otherBankAccountView, setEnableSaliency setenablesaliency) {
        otherBankAccountView.presenter = setenablesaliency;
    }
}
