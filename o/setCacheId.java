package o;

import android.net.Uri;
import id.dana.sendmoney.bank.AddReceiverDialogFragment;
import o.IPostMessageService;

public final class setCacheId implements IPostMessageService.Default {
    private final AddReceiverDialogFragment setMax;

    public setCacheId(AddReceiverDialogFragment addReceiverDialogFragment) {
        this.setMax = addReceiverDialogFragment;
    }

    public final void onActivityResult(Object obj) {
        AddReceiverDialogFragment.getMin(this.setMax, (Uri) obj);
    }
}
