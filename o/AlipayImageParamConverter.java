package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.sendmoney.bank.savedcard.SavedBankCardView;
import o.onSuccess;

public final class AlipayImageParamConverter implements getBindingAdapter<SavedBankCardView> {
    @InjectedFieldSignature("id.dana.sendmoney.bank.savedcard.SavedBankCardView.presenter")
    public static void getMin(SavedBankCardView savedBankCardView, onSuccess.length length) {
        savedBankCardView.presenter = length;
    }

    @InjectedFieldSignature("id.dana.sendmoney.bank.savedcard.SavedBankCardView.savedBankCardAdapter")
    public static void setMin(SavedBankCardView savedBankCardView, APMode aPMode) {
        savedBankCardView.savedBankCardAdapter = aPMode;
    }
}
