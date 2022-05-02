package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.splitbill.view.SplitBillHistoryView;
import o.AUNoticeDialog;

public final class getTTFFilePath implements getBindingAdapter<SplitBillHistoryView> {
    @InjectedFieldSignature("id.dana.splitbill.view.SplitBillHistoryView.presenter")
    public static void setMin(SplitBillHistoryView splitBillHistoryView, AUNoticeDialog.AnonymousClass1.setMax setmax) {
        splitBillHistoryView.presenter = setmax;
    }

    @InjectedFieldSignature("id.dana.splitbill.view.SplitBillHistoryView.splitBillPayerToPayerModelMapper")
    public static void getMin(SplitBillHistoryView splitBillHistoryView, IconfontInfo iconfontInfo) {
        splitBillHistoryView.splitBillPayerToPayerModelMapper = iconfontInfo;
    }
}
