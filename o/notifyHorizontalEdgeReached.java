package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.sendmoney_v2.recipient.activity.SortBankAccountBottomSheetActivity;

public final class notifyHorizontalEdgeReached implements getBindingAdapter<SortBankAccountBottomSheetActivity> {
    @InjectedFieldSignature("id.dana.sendmoney_v2.recipient.activity.SortBankAccountBottomSheetActivity.presenterSorting")
    public static void getMin(SortBankAccountBottomSheetActivity sortBankAccountBottomSheetActivity, Action action) {
        sortBankAccountBottomSheetActivity.presenterSorting = action;
    }
}
