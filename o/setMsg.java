package o;

import id.dana.sendmoney.bank.AddReceiverDialogFragment;

public final class setMsg implements RedDotManager {
    private final AddReceiverDialogFragment getMax;

    public setMsg(AddReceiverDialogFragment addReceiverDialogFragment) {
        this.getMax = addReceiverDialogFragment;
    }

    public final void accept(Object obj) {
        this.getMax.btnAddReceiverInfo.setEnabled(((Boolean) obj).booleanValue());
    }
}
