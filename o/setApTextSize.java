package o;

import android.content.DialogInterface;
import id.dana.splitbill.view.SplitBillShareQrActivity;

public final class setApTextSize implements DialogInterface.OnDismissListener {
    private final SplitBillShareQrActivity getMax;

    public setApTextSize(SplitBillShareQrActivity splitBillShareQrActivity) {
        this.getMax = splitBillShareQrActivity;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.getMax.finish();
    }
}
