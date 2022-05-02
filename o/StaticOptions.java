package o;

import id.dana.sendmoney.bank.other.OtherBankAccountView;
import id.dana.sendmoney.bank.savedcard.AddOtherCardDialogFragment;
import java.util.List;

public final class StaticOptions implements OtherBankAccountView.setMax {
    private final AddOtherCardDialogFragment setMin;

    public StaticOptions(AddOtherCardDialogFragment addOtherCardDialogFragment) {
        this.setMin = addOtherCardDialogFragment;
    }

    public final void setMin(List list) {
        AddOtherCardDialogFragment.length(this.setMin, list);
    }
}
