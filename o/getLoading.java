package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.sendmoney.summary.SummaryActivity;
import o.cutImageKeepRatio_new;
import o.handleScrollChange;
import o.makeTakenPicturePath;
import o.onExecuted;
import o.setProxy;

public final class getLoading implements getBindingAdapter<SummaryActivity> {
    @InjectedFieldSignature("id.dana.sendmoney.summary.SummaryActivity.sendMoneySummaryPresenter")
    public static void getMin(SummaryActivity summaryActivity, setProxy.length length) {
        summaryActivity.sendMoneySummaryPresenter = length;
    }

    @InjectedFieldSignature("id.dana.sendmoney.summary.SummaryActivity.sendMoneyConfirmationPresenter")
    public static void setMax(SummaryActivity summaryActivity, makeTakenPicturePath.setMax setmax) {
        summaryActivity.sendMoneyConfirmationPresenter = setmax;
    }

    @InjectedFieldSignature("id.dana.sendmoney.summary.SummaryActivity.sendMoneyConfirmationBankPresenter")
    public static void setMax(SummaryActivity summaryActivity, cutImageKeepRatio_new.getMax getmax) {
        summaryActivity.sendMoneyConfirmationBankPresenter = getmax;
    }

    @InjectedFieldSignature("id.dana.sendmoney.summary.SummaryActivity.expiryPresenter")
    public static void setMax(SummaryActivity summaryActivity, onExecuted.getMin getmin) {
        summaryActivity.expiryPresenter = getmin;
    }

    @InjectedFieldSignature("id.dana.sendmoney.summary.SummaryActivity.shareToFeedsPresenter")
    public static void length(SummaryActivity summaryActivity, handleScrollChange.getMin getmin) {
        summaryActivity.shareToFeedsPresenter = getmin;
    }
}
