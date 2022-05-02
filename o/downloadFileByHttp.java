package o;

import android.view.View;
import id.dana.pay.view.QrBarcodePayView;

public final class downloadFileByHttp implements View.OnClickListener {
    private final QrBarcodePayView getMax;

    public downloadFileByHttp(QrBarcodePayView qrBarcodePayView) {
        this.getMax = qrBarcodePayView;
    }

    public final void onClick(View view) {
        QrBarcodePayView.length(this.getMax);
    }
}
