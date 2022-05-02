package id.dana.sendmoney.voucher;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class VoucherDetailActivity_ViewBinding extends BaseActivity_ViewBinding {
    private VoucherDetailActivity getMin;
    private View setMin;

    @UiThread
    public VoucherDetailActivity_ViewBinding(final VoucherDetailActivity voucherDetailActivity, View view) {
        super(voucherDetailActivity, view);
        this.getMin = voucherDetailActivity;
        voucherDetailActivity.rvVoucher = (RecyclerView) drawDividersHorizontal.setMin(view, R.id.f59942131364579, "field 'rvVoucher'", RecyclerView.class);
        voucherDetailActivity.tvAllVoucher = (TextView) drawDividersHorizontal.setMin(view, R.id.f64752131365100, "field 'tvAllVoucher'", TextView.class);
        voucherDetailActivity.tvWordingVoucherList = (TextView) drawDividersHorizontal.setMin(view, R.id.f70492131365680, "field 'tvWordingVoucherList'", TextView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f37142131362166, "method 'onWithoutVoucherClick'");
        this.setMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                voucherDetailActivity.onWithoutVoucherClick();
            }
        });
    }

    public final void setMax() {
        VoucherDetailActivity voucherDetailActivity = this.getMin;
        if (voucherDetailActivity != null) {
            this.getMin = null;
            voucherDetailActivity.rvVoucher = null;
            voucherDetailActivity.tvAllVoucher = null;
            voucherDetailActivity.tvWordingVoucherList = null;
            this.setMin.setOnClickListener((View.OnClickListener) null);
            this.setMin = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
