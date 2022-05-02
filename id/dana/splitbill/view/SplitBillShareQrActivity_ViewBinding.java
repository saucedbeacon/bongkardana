package id.dana.splitbill.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import id.dana.richview.QRView;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class SplitBillShareQrActivity_ViewBinding extends BaseActivity_ViewBinding {
    private SplitBillShareQrActivity getMin;
    private View setMin;

    @UiThread
    public SplitBillShareQrActivity_ViewBinding(final SplitBillShareQrActivity splitBillShareQrActivity, View view) {
        super(splitBillShareQrActivity, view);
        this.getMin = splitBillShareQrActivity;
        splitBillShareQrActivity.tvRemarks = (TextView) drawDividersHorizontal.setMin(view, R.id.f68862131365513, "field 'tvRemarks'", TextView.class);
        splitBillShareQrActivity.qrView = (QRView) drawDividersHorizontal.setMin(view, R.id.f57302131364307, "field 'qrView'", QRView.class);
        splitBillShareQrActivity.tvNickname = (TextView) drawDividersHorizontal.setMin(view, R.id.f67452131365372, "field 'tvNickname'", TextView.class);
        splitBillShareQrActivity.tvPhoneNumber = (TextView) drawDividersHorizontal.setMin(view, R.id.f68152131365442, "field 'tvPhoneNumber'", TextView.class);
        splitBillShareQrActivity.ivDanaLogo = (ImageView) drawDividersHorizontal.setMin(view, R.id.f48492131363403, "field 'ivDanaLogo'", ImageView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f53442131363900, "method 'onClose'");
        this.setMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                splitBillShareQrActivity.onClose();
            }
        });
    }

    public final void setMax() {
        SplitBillShareQrActivity splitBillShareQrActivity = this.getMin;
        if (splitBillShareQrActivity != null) {
            this.getMin = null;
            splitBillShareQrActivity.tvRemarks = null;
            splitBillShareQrActivity.qrView = null;
            splitBillShareQrActivity.tvNickname = null;
            splitBillShareQrActivity.tvPhoneNumber = null;
            splitBillShareQrActivity.ivDanaLogo = null;
            this.setMin.setOnClickListener((View.OnClickListener) null);
            this.setMin = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
