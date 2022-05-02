package id.dana.sendmoney.voucher;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class ChangeVoucherView_ViewBinding implements Unbinder {
    private ChangeVoucherView getMax;
    private View getMin;

    @UiThread
    public ChangeVoucherView_ViewBinding(final ChangeVoucherView changeVoucherView, View view) {
        this.getMax = changeVoucherView;
        changeVoucherView.voucherView = drawDividersHorizontal.getMax(view, R.id.f73612131365996, "field 'voucherView'");
        changeVoucherView.tvTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f69732131365600, "field 'tvTitle'", TextView.class);
        changeVoucherView.tvDescription = (TextView) drawDividersHorizontal.setMin(view, R.id.f65682131365193, "field 'tvDescription'", TextView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.btn_change, "field 'btnChange' and method 'onChangeClick'");
        changeVoucherView.btnChange = (Button) drawDividersHorizontal.getMin(max, R.id.btn_change, "field 'btnChange'", Button.class);
        this.getMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                changeVoucherView.onChangeClick();
            }
        });
    }

    @CallSuper
    public final void setMax() {
        ChangeVoucherView changeVoucherView = this.getMax;
        if (changeVoucherView != null) {
            this.getMax = null;
            changeVoucherView.voucherView = null;
            changeVoucherView.tvTitle = null;
            changeVoucherView.tvDescription = null;
            changeVoucherView.btnChange = null;
            this.getMin.setOnClickListener((View.OnClickListener) null);
            this.getMin = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
