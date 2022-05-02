package id.dana.scanner;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.richview.CustomDecoratedBarcodeView;
import id.dana.richview.EllipseTextView;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class ScannerFragment_ViewBinding implements Unbinder {
    private View getMax;
    private View getMin;
    private View isInside;
    private View length;
    private ScannerFragment setMin;

    @UiThread
    public ScannerFragment_ViewBinding(final ScannerFragment scannerFragment, View view) {
        this.setMin = scannerFragment;
        scannerFragment.barcodeView = (CustomDecoratedBarcodeView) drawDividersHorizontal.setMin(view, R.id.f34872131361931, "field 'barcodeView'", CustomDecoratedBarcodeView.class);
        scannerFragment.icImageFg = (ImageView) drawDividersHorizontal.length(view, R.id.f46072131363152, "field 'icImageFg'", ImageView.class);
        scannerFragment.imgScanGallery = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50692131363624, "field 'imgScanGallery'", ImageView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f58492131364431, "field 'rlScanGallery' and method 'openGallery'");
        scannerFragment.rlScanGallery = (RelativeLayout) drawDividersHorizontal.getMin(max, R.id.f58492131364431, "field 'rlScanGallery'", RelativeLayout.class);
        this.length = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                scannerFragment.openGallery();
            }
        });
        scannerFragment.rlScanner = (RelativeLayout) drawDividersHorizontal.setMin(view, R.id.f58502131364432, "field 'rlScanner'", RelativeLayout.class);
        scannerFragment.tvNoteScanner = (EllipseTextView) drawDividersHorizontal.setMin(view, R.id.f43182131362836, "field 'tvNoteScanner'", EllipseTextView.class);
        View max2 = drawDividersHorizontal.getMax(view, R.id.f58322131364414, "field 'rlHelpScanQr' and method 'onHelpClicked'");
        scannerFragment.rlHelpScanQr = (RelativeLayout) drawDividersHorizontal.getMin(max2, R.id.f58322131364414, "field 'rlHelpScanQr'", RelativeLayout.class);
        this.getMin = max2;
        max2.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                scannerFragment.onHelpClicked();
            }
        });
        View max3 = drawDividersHorizontal.getMax(view, R.id.f58362131364418, "method 'setTorch'");
        this.getMax = max3;
        max3.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                scannerFragment.setTorch();
            }
        });
        View max4 = drawDividersHorizontal.getMax(view, R.id.f65902131365217, "method 'doneScan'");
        this.isInside = max4;
        max4.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                scannerFragment.doneScan();
            }
        });
    }

    @CallSuper
    public void setMax() {
        ScannerFragment scannerFragment = this.setMin;
        if (scannerFragment != null) {
            this.setMin = null;
            scannerFragment.barcodeView = null;
            scannerFragment.icImageFg = null;
            scannerFragment.imgScanGallery = null;
            scannerFragment.rlScanGallery = null;
            scannerFragment.rlScanner = null;
            scannerFragment.tvNoteScanner = null;
            scannerFragment.rlHelpScanQr = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            this.getMin.setOnClickListener((View.OnClickListener) null);
            this.getMin = null;
            this.getMax.setOnClickListener((View.OnClickListener) null);
            this.getMax = null;
            this.isInside.setOnClickListener((View.OnClickListener) null);
            this.isInside = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
