package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.splitbill.view.SplitBillSectionView;
import o.PopManager;

public final class setImportantForAccessibility implements getBindingAdapter<SplitBillSectionView> {
    @InjectedFieldSignature("id.dana.splitbill.view.SplitBillSectionView.presenter")
    public static void length(SplitBillSectionView splitBillSectionView, PopManager.PopBean.getMax getmax) {
        splitBillSectionView.presenter = getmax;
    }
}
