package o;

import id.dana.nearbyme.merchantreview.model.MerchantReviewDialogDismissState;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class getDevicePerformance {
    public static final /* synthetic */ int[] getMin;

    static {
        int[] iArr = new int[MerchantReviewDialogDismissState.values().length];
        getMin = iArr;
        iArr[MerchantReviewDialogDismissState.DISMISSED_BY_CANCEL.ordinal()] = 1;
        getMin[MerchantReviewDialogDismissState.DISMISSED_BY_SUBMIT.ordinal()] = 2;
    }
}
