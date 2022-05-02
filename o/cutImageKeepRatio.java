package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.sendmoney.confirmation.SendMoneyConfirmationActivity;
import o.cutImageKeepRatio_new;
import o.handleScrollChange;
import o.makeTakenPicturePath;

public final class cutImageKeepRatio implements getBindingAdapter<SendMoneyConfirmationActivity> {
    @InjectedFieldSignature("id.dana.sendmoney.confirmation.SendMoneyConfirmationActivity.confirmationPresenter")
    public static void getMin(SendMoneyConfirmationActivity sendMoneyConfirmationActivity, makeTakenPicturePath.setMax setmax) {
        sendMoneyConfirmationActivity.confirmationPresenter = setmax;
    }

    @InjectedFieldSignature("id.dana.sendmoney.confirmation.SendMoneyConfirmationActivity.confirmationBankPresenter")
    public static void getMax(SendMoneyConfirmationActivity sendMoneyConfirmationActivity, cutImageKeepRatio_new.getMax getmax) {
        sendMoneyConfirmationActivity.confirmationBankPresenter = getmax;
    }

    @InjectedFieldSignature("id.dana.sendmoney.confirmation.SendMoneyConfirmationActivity.shareToFeedPresenter")
    public static void getMin(SendMoneyConfirmationActivity sendMoneyConfirmationActivity, handleScrollChange.getMin getmin) {
        sendMoneyConfirmationActivity.shareToFeedPresenter = getmin;
    }
}
