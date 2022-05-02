package id.dana.sendmoney.voucher.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class VoucherViewHolder_ViewBinding implements Unbinder {
    private VoucherViewHolder getMin;

    @UiThread
    public VoucherViewHolder_ViewBinding(VoucherViewHolder voucherViewHolder, View view) {
        this.getMin = voucherViewHolder;
        voucherViewHolder.tvTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f69732131365600, "field 'tvTitle'", TextView.class);
        voucherViewHolder.tvBalance = (TextView) drawDividersHorizontal.setMin(view, R.id.f64942131365119, "field 'tvBalance'", TextView.class);
        voucherViewHolder.tvDescription = (TextView) drawDividersHorizontal.setMin(view, R.id.f65682131365193, "field 'tvDescription'", TextView.class);
        voucherViewHolder.tvExpireTime = (TextView) drawDividersHorizontal.setMin(view, R.id.f66172131365244, "field 'tvExpireTime'", TextView.class);
        voucherViewHolder.tvShowDetail = (TextView) drawDividersHorizontal.setMin(view, R.id.f69362131365563, "field 'tvShowDetail'", TextView.class);
        voucherViewHolder.ivCheck = (ImageView) drawDividersHorizontal.setMin(view, R.id.f48272131363381, "field 'ivCheck'", ImageView.class);
        voucherViewHolder.clVoucher = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f40512131362531, "field 'clVoucher'", ConstraintLayout.class);
    }

    @CallSuper
    public final void setMax() {
        VoucherViewHolder voucherViewHolder = this.getMin;
        if (voucherViewHolder != null) {
            this.getMin = null;
            voucherViewHolder.tvTitle = null;
            voucherViewHolder.tvBalance = null;
            voucherViewHolder.tvDescription = null;
            voucherViewHolder.tvExpireTime = null;
            voucherViewHolder.tvShowDetail = null;
            voucherViewHolder.ivCheck = null;
            voucherViewHolder.clVoucher = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
