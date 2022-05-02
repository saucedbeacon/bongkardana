package o;

import id.dana.sendmoney.bank.AddReceiverDialogFragment;

public final class getImageRotation implements Runnable {
    private final AddReceiverDialogFragment getMin;

    public getImageRotation(AddReceiverDialogFragment addReceiverDialogFragment) {
        this.getMin = addReceiverDialogFragment;
    }

    public final void run() {
        this.getMin.cetReceivePhoneNumber.clearText();
    }
}
