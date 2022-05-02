package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.sendmoney_v2.recipient.activity.ManageRecentBankAccountBottomSheet;
import o.setUnit;

public final class getFinalY implements getBindingAdapter<ManageRecentBankAccountBottomSheet> {
    @InjectedFieldSignature("id.dana.sendmoney_v2.recipient.activity.ManageRecentBankAccountBottomSheet.presenter")
    public static void setMax(ManageRecentBankAccountBottomSheet manageRecentBankAccountBottomSheet, setUnit.getMin getmin) {
        manageRecentBankAccountBottomSheet.presenter = getmin;
    }
}
