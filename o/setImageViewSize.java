package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.splitbill.view.SplitBillIntroductionActivity;
import o.getSelectedIndex;
import o.setBadgeInfo;

public final class setImageViewSize implements getBindingAdapter<SplitBillIntroductionActivity> {
    @InjectedFieldSignature("id.dana.splitbill.view.SplitBillIntroductionActivity.presenter")
    public static void getMax(SplitBillIntroductionActivity splitBillIntroductionActivity, setBadgeInfo.getMax getmax) {
        splitBillIntroductionActivity.presenter = getmax;
    }

    @InjectedFieldSignature("id.dana.splitbill.view.SplitBillIntroductionActivity.onBoardingPresenter")
    public static void setMax(SplitBillIntroductionActivity splitBillIntroductionActivity, getSelectedIndex.length length) {
        splitBillIntroductionActivity.onBoardingPresenter = length;
    }
}
