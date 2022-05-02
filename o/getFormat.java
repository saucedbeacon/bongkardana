package o;

import id.dana.sendmoney.bank.AddReceiverDialogFragment;

public final class getFormat implements Runnable {
    private final AddReceiverDialogFragment setMax;

    public getFormat(AddReceiverDialogFragment addReceiverDialogFragment) {
        this.setMax = addReceiverDialogFragment;
    }

    public final void run() {
        this.setMax.cetReceiverName.clearText();
    }
}
