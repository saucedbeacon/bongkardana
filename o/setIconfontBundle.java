package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.splitbill.view.SplitBillActivity;
import o.AUNoticeDialog;
import o.getTransitionProperties;

public final class setIconfontBundle implements getBindingAdapter<SplitBillActivity> {
    @InjectedFieldSignature("id.dana.splitbill.view.SplitBillActivity.deepLinkPresenter")
    public static void getMin(SplitBillActivity splitBillActivity, getTransitionProperties.getMin getmin) {
        splitBillActivity.deepLinkPresenter = getmin;
    }

    @InjectedFieldSignature("id.dana.splitbill.view.SplitBillActivity.splitBillPresenter")
    public static void getMin(SplitBillActivity splitBillActivity, AUNoticeDialog.OnClickNegativeListener.setMin setmin) {
        splitBillActivity.splitBillPresenter = setmin;
    }

    @InjectedFieldSignature("id.dana.splitbill.view.SplitBillActivity.presenter")
    public static void setMax(SplitBillActivity splitBillActivity, getTransitionProperties.getMin getmin) {
        splitBillActivity.presenter = getmin;
    }

    @InjectedFieldSignature("id.dana.splitbill.view.SplitBillActivity.recipientModelMapper")
    public static void setMax(SplitBillActivity splitBillActivity, setTextBold settextbold) {
        splitBillActivity.recipientModelMapper = settextbold;
    }

    @InjectedFieldSignature("id.dana.splitbill.view.SplitBillActivity.splitBillPayerMapper")
    public static void setMax(SplitBillActivity splitBillActivity, IconPaintBuilder iconPaintBuilder) {
        splitBillActivity.splitBillPayerMapper = iconPaintBuilder;
    }

    @InjectedFieldSignature("id.dana.splitbill.view.SplitBillActivity.splitBillPayerToRecipientModelMapper")
    public static void setMax(SplitBillActivity splitBillActivity, IconInfo iconInfo) {
        splitBillActivity.splitBillPayerToRecipientModelMapper = iconInfo;
    }

    @InjectedFieldSignature("id.dana.splitbill.view.SplitBillActivity.splitBillPayerToPayerModelMapper")
    public static void setMax(SplitBillActivity splitBillActivity, IconfontInfo iconfontInfo) {
        splitBillActivity.splitBillPayerToPayerModelMapper = iconfontInfo;
    }
}
