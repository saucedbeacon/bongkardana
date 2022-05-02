package o;

import android.view.View;
import id.dana.danah5.DanaH5;
import id.dana.sendmoney.model.VoucherModel;
import id.dana.sendmoney.voucher.viewholder.VoucherViewHolder;

public final class startAnimation implements View.OnClickListener {
    private final VoucherModel getMin;
    private final VoucherViewHolder length;

    public startAnimation(VoucherViewHolder voucherViewHolder, VoucherModel voucherModel) {
        this.length = voucherViewHolder;
        this.getMin = voucherModel;
    }

    public final void onClick(View view) {
        DanaH5.startContainerFullUrl(String.format(this.length.getMax.getVoucherDetail(), new Object[]{this.getMin.setMin}));
    }
}
