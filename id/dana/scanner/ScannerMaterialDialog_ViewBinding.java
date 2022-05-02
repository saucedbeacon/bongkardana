package id.dana.scanner;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class ScannerMaterialDialog_ViewBinding implements Unbinder {
    private ScannerMaterialDialog getMax;

    @UiThread
    public ScannerMaterialDialog_ViewBinding(ScannerMaterialDialog scannerMaterialDialog, View view) {
        this.getMax = scannerMaterialDialog;
        scannerMaterialDialog.tvErrorMsg = (TextView) drawDividersHorizontal.setMin(view, R.id.f66132131365240, "field 'tvErrorMsg'", TextView.class);
        scannerMaterialDialog.tvSubmit = (TextView) drawDividersHorizontal.setMin(view, R.id.f69532131365580, "field 'tvSubmit'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        ScannerMaterialDialog scannerMaterialDialog = this.getMax;
        if (scannerMaterialDialog != null) {
            this.getMax = null;
            scannerMaterialDialog.tvErrorMsg = null;
            scannerMaterialDialog.tvSubmit = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
