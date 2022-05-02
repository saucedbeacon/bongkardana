package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.splitbill.view.SplitBillSummaryActivity;
import o.AUNoticeDialog;

public final class setAutoSplitText implements getBindingAdapter<SplitBillSummaryActivity> {
    @InjectedFieldSignature("id.dana.splitbill.view.SplitBillSummaryActivity.splitBillPresenter")
    public static void getMin(SplitBillSummaryActivity splitBillSummaryActivity, AUNoticeDialog.OnClickNegativeListener.setMin setmin) {
        splitBillSummaryActivity.splitBillPresenter = setmin;
    }

    @InjectedFieldSignature("id.dana.splitbill.view.SplitBillSummaryActivity.splitBillDetailPresenter")
    public static void length(SplitBillSummaryActivity splitBillSummaryActivity, AUNoticeDialog.AnonymousClass2.setMax setmax) {
        splitBillSummaryActivity.splitBillDetailPresenter = setmax;
    }
}
