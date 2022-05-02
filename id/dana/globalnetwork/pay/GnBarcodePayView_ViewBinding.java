package id.dana.globalnetwork.pay;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.pay.view.BasePayView_ViewBinding;
import o.drawDividersHorizontal;

public class GnBarcodePayView_ViewBinding extends BasePayView_ViewBinding {
    private GnBarcodePayView length;

    @UiThread
    public GnBarcodePayView_ViewBinding(GnBarcodePayView gnBarcodePayView, View view) {
        super(gnBarcodePayView, view);
        this.length = gnBarcodePayView;
        gnBarcodePayView.barcodeView = (ImageView) drawDividersHorizontal.setMin(view, R.id.f56462131364216, "field 'barcodeView'", ImageView.class);
    }

    public final void setMax() {
        GnBarcodePayView gnBarcodePayView = this.length;
        if (gnBarcodePayView != null) {
            this.length = null;
            gnBarcodePayView.barcodeView = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
