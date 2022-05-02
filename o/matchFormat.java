package o;

import id.dana.sendmoney.bank.AddReceiverDialogFragment;

public final class matchFormat implements Runnable {
    private final AddReceiverDialogFragment getMin;

    public matchFormat(AddReceiverDialogFragment addReceiverDialogFragment) {
        this.getMin = addReceiverDialogFragment;
    }

    public final void run() {
        this.getMin.cetReceiverDateOfBirth.clearText();
    }
}
