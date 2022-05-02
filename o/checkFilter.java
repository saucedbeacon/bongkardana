package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.savings.withdrawal.WithdrawalSavingBottomSheetDialog;

public final class checkFilter implements getBindingAdapter<WithdrawalSavingBottomSheetDialog> {
    @InjectedFieldSignature("id.dana.savings.withdrawal.WithdrawalSavingBottomSheetDialog.presenter")
    public static void length(WithdrawalSavingBottomSheetDialog withdrawalSavingBottomSheetDialog, afterReopen afterreopen) {
        withdrawalSavingBottomSheetDialog.presenter = afterreopen;
    }
}
