package id.dana.pay.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import id.dana.R;
import o.drawDividersHorizontal;

public class QrBarcodePayView_ViewBinding extends BasePayView_ViewBinding {
    private QrBarcodePayView getMin;

    @UiThread
    public QrBarcodePayView_ViewBinding(QrBarcodePayView qrBarcodePayView, View view) {
        super(qrBarcodePayView, view);
        this.getMin = qrBarcodePayView;
        qrBarcodePayView.barcodeView = (ImageView) drawDividersHorizontal.setMin(view, R.id.f56462131364216, "field 'barcodeView'", ImageView.class);
        qrBarcodePayView.paycodeView = (TextView) drawDividersHorizontal.setMin(view, R.id.f56482131364218, "field 'paycodeView'", TextView.class);
    }

    public final void setMax() {
        QrBarcodePayView qrBarcodePayView = this.getMin;
        if (qrBarcodePayView != null) {
            this.getMin = null;
            qrBarcodePayView.barcodeView = null;
            qrBarcodePayView.paycodeView = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
