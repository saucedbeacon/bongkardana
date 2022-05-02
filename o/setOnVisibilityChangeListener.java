package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.splitbill.view.SplitBillShareQrActivity;
import o.PopManager;

public final class setOnVisibilityChangeListener implements getBindingAdapter<SplitBillShareQrActivity> {
    @InjectedFieldSignature("id.dana.splitbill.view.SplitBillShareQrActivity.presenter")
    public static void getMax(SplitBillShareQrActivity splitBillShareQrActivity, PopManager.getMax getmax) {
        splitBillShareQrActivity.presenter = getmax;
    }
}
