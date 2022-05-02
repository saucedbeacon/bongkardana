package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.bank.BottomSheetBankListActivity;
import o.primaryKeys;

public final class tableName implements getBindingAdapter<BottomSheetBankListActivity> {
    @InjectedFieldSignature("id.dana.bank.BottomSheetBankListActivity.bankListPresenter")
    public static void setMax(BottomSheetBankListActivity bottomSheetBankListActivity, primaryKeys.setMin setmin) {
        bottomSheetBankListActivity.bankListPresenter = setmin;
    }
}
