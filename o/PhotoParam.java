package o;

import android.content.DialogInterface;
import id.dana.sendmoney.voucher.ChangeVoucherView;

public final class PhotoParam implements DialogInterface.OnClickListener {
    public static final PhotoParam setMin = new PhotoParam();

    public final void onClick(DialogInterface dialogInterface, int i) {
        ChangeVoucherView.getMax(dialogInterface, i);
    }
}
